/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.offline;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;
import recovered.fabric.offline.ConfigRecord;

final class ConfigFiles {
    private static final Path folder = Path.of("config", "systemdlc", "configs").toAbsolutePath();
    private static final Path activeFile = folder.resolve("active");

    private ConfigFiles() {
    }

    static List<ConfigRecord> all() throws Exception {
        if (!Files.isDirectory(folder, new LinkOption[0])) {
            return List.of();
        }
        try (Stream<Path> paths = Files.list(folder);){
            List list = paths.filter(path -> path.getFileName().toString().endsWith(".cfg")).map(ConfigFiles::readUnchecked).sorted(Comparator.comparing(ConfigRecord::createdAt)).toList();
            return list;
        }
    }

    static ConfigRecord find(String name) throws Exception {
        Path path = ConfigFiles.path(name);
        return Files.isRegularFile(path, new LinkOption[0]) ? ConfigFiles.read(path) : null;
    }

    static ConfigRecord findByKey(String key) throws Exception {
        return ConfigFiles.all().stream().filter(config -> config.key().equals(key)).findFirst().orElse(null);
    }

    static void write(ConfigRecord config) throws Exception {
        Files.createDirectories(folder, new FileAttribute[0]);
        Files.writeString(ConfigFiles.path(config.name()), (CharSequence)config.serialize(), StandardCharsets.UTF_8, new OpenOption[0]);
    }

    static void rename(String oldName, ConfigRecord config) throws Exception {
        ConfigFiles.write(config);
        Files.deleteIfExists(ConfigFiles.path(oldName));
        if (oldName.equals(ConfigFiles.active())) {
            ConfigFiles.active(config.name());
        }
    }

    static void delete(String name) throws Exception {
        Files.deleteIfExists(ConfigFiles.path(name));
        if (name.equals(ConfigFiles.active())) {
            Files.deleteIfExists(activeFile);
        }
    }

    static String active() throws Exception {
        if (!Files.isRegularFile(activeFile, new LinkOption[0])) {
            return null;
        }
        String encoded = Files.readString(activeFile, StandardCharsets.UTF_8);
        return new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
    }

    static void active(String name) throws Exception {
        Files.createDirectories(folder, new FileAttribute[0]);
        String encoded = Base64.getEncoder().encodeToString(name.getBytes(StandardCharsets.UTF_8));
        Files.writeString(activeFile, (CharSequence)encoded, StandardCharsets.UTF_8, new OpenOption[0]);
    }

    private static ConfigRecord read(Path path) throws Exception {
        return ConfigRecord.deserialize(Files.readString(path, StandardCharsets.UTF_8));
    }

    private static ConfigRecord readUnchecked(Path path) {
        try {
            return ConfigFiles.read(path);
        }
        catch (Exception error) {
            throw new IllegalStateException(error);
        }
    }

    private static Path path(String name) {
        UUID id2 = UUID.nameUUIDFromBytes(name.getBytes(StandardCharsets.UTF_8));
        return folder.resolve(String.valueOf(id2) + ".cfg");
    }
}

