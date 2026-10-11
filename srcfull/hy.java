/*
 * Decompiled with CFR 0.152.
 */
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class hy {
    private static final DateTimeFormatter a = DateTimeFormatter.ISO_LOCAL_DATE;
    private static final DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss", Locale.ROOT);
    private static final DateTimeFormatter c = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ROOT);
    private static final DateTimeFormatter d = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ROOT);
    private static final DateTimeFormatter e = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);

    public static String b(String string) {
        LocalDateTime localDateTime = hy.a(string);
        return localDateTime != null ? localDateTime.format(b) : hy.a(string);
    }

    public static String b() {
        return LocalDateTime.now().format(b);
    }

    public static String c(String string) {
        LocalDate localDate = hy.a(string);
        return localDate == null ? null : localDate.format(c);
    }

    public static String a(String string) {
        LocalDate localDate = hy.a(string);
        return localDate == null ? null : localDate.format(a);
    }

    private static LocalDateTime a(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return null;
        }
        try {
            return LocalDateTime.parse(string2, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        }
        catch (DateTimeParseException dateTimeParseException) {
            try {
                return OffsetDateTime.parse(string2).toLocalDateTime();
            }
            catch (DateTimeParseException dateTimeParseException2) {
                try {
                    return Instant.parse(string2).atZone(ZoneId.systemDefault()).toLocalDateTime();
                }
                catch (DateTimeParseException dateTimeParseException3) {
                    try {
                        return LocalDateTime.parse(string2, d);
                    }
                    catch (DateTimeParseException dateTimeParseException4) {
                        try {
                            return LocalDateTime.parse(string2, e);
                        }
                        catch (DateTimeParseException dateTimeParseException5) {
                            return null;
                        }
                    }
                }
            }
        }
    }

    private static LocalDate a(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string.trim();
        if (string2.isEmpty()) {
            return null;
        }
        try {
            return LocalDate.parse(string2, a);
        }
        catch (DateTimeParseException dateTimeParseException) {
            try {
                return LocalDate.parse(string2, c);
            }
            catch (DateTimeParseException dateTimeParseException2) {
                LocalDateTime localDateTime = hy.a(string2);
                if (localDateTime != null) {
                    return localDateTime.toLocalDate();
                }
                if (string2.length() >= 10) {
                    String string3 = string2.substring(0, 10);
                    try {
                        return LocalDate.parse(string3, a);
                    }
                    catch (DateTimeParseException dateTimeParseException3) {
                        // empty catch block
                    }
                }
                return null;
            }
        }
    }

    public static String a() {
        return LocalDate.now().format(a);
    }
}

