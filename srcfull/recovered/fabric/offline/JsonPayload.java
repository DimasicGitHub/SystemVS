/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.offline;

final class JsonPayload {
    private JsonPayload() {
    }

    static String array(String json, String field) {
        int start;
        int colon;
        if (json == null) {
            throw new IllegalArgumentException("payload missing");
        }
        String source = json.trim();
        if (source.startsWith("[")) {
            return JsonPayload.valid(source);
        }
        int key = source.indexOf("\"" + field + "\"");
        int n2 = colon = key < 0 ? -1 : source.indexOf(58, key + field.length() + 2);
        if (colon < 0) {
            throw new IllegalArgumentException(field + " missing");
        }
        for (start = colon + 1; start < source.length() && Character.isWhitespace(source.charAt(start)); ++start) {
        }
        if (start >= source.length()) {
            throw new IllegalArgumentException(field + " empty");
        }
        if (source.charAt(start) == '\"') {
            return JsonPayload.valid(JsonPayload.decode(source, start));
        }
        int end = source.lastIndexOf(93);
        if (source.charAt(start) != '[' || end < start) {
            throw new IllegalArgumentException(field + " invalid");
        }
        return JsonPayload.valid(source.substring(start, end + 1));
    }

    static String valid(String value) {
        String result = value.trim();
        if (result.length() > 1000000 || !result.startsWith("[") || !result.endsWith("]")) {
            throw new IllegalArgumentException("invalid JSON array");
        }
        return result;
    }

    private static String decode(String source, int start) {
        StringBuilder result = new StringBuilder();
        block9: for (int index = start + 1; index < source.length(); ++index) {
            char value = source.charAt(index);
            if (value == '\"') {
                return result.toString();
            }
            if (value != '\\') {
                result.append(value);
                continue;
            }
            if (++index >= source.length()) break;
            char escaped = source.charAt(index);
            switch (escaped) {
                case '\"': 
                case '/': 
                case '\\': {
                    result.append(escaped);
                    continue block9;
                }
                case 'b': {
                    result.append('\b');
                    continue block9;
                }
                case 'f': {
                    result.append('\f');
                    continue block9;
                }
                case 'n': {
                    result.append('\n');
                    continue block9;
                }
                case 'r': {
                    result.append('\r');
                    continue block9;
                }
                case 't': {
                    result.append('\t');
                    continue block9;
                }
                case 'u': {
                    if (index + 4 >= source.length()) {
                        throw new IllegalArgumentException("invalid unicode escape");
                    }
                    result.append((char)Integer.parseInt(source.substring(index + 1, index + 5), 16));
                    index += 4;
                    continue block9;
                }
                default: {
                    throw new IllegalArgumentException("invalid JSON escape");
                }
            }
        }
        throw new IllegalArgumentException("unterminated JSON string");
    }
}

