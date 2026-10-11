/*
 * Decompiled with CFR 0.152.
 */
package recovered.fabric.offline;

final class JsonField {
    private JsonField() {
    }

    static String text(String source, String field) {
        int start = JsonField.valueStart(source, field);
        if (source.startsWith("null", start)) {
            return null;
        }
        if (source.charAt(start) != '\"') {
            throw new IllegalArgumentException(field + " is not text");
        }
        return JsonField.decode(source, start);
    }

    static boolean bool(String source, String field) {
        int start = JsonField.valueStart(source, field);
        if (source.startsWith("true", start)) {
            return true;
        }
        if (source.startsWith("false", start)) {
            return false;
        }
        throw new IllegalArgumentException(field + " is not boolean");
    }

    static String quote(String value) {
        if (value == null) {
            return "null";
        }
        StringBuilder result = new StringBuilder(value.length() + 2).append('\"');
        for (int index = 0; index < value.length(); ++index) {
            JsonField.append(result, value.charAt(index));
        }
        return result.append('\"').toString();
    }

    private static int valueStart(String source, String field) {
        int start;
        int colon;
        if (source == null) {
            throw new IllegalArgumentException("payload missing");
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
        return start;
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
            char escaped = source.charAt(++index);
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

    private static void append(StringBuilder result, char value) {
        switch (value) {
            case '\"': {
                result.append("\\\"");
                break;
            }
            case '\\': {
                result.append("\\\\");
                break;
            }
            case '\b': {
                result.append("\\b");
                break;
            }
            case '\f': {
                result.append("\\f");
                break;
            }
            case '\n': {
                result.append("\\n");
                break;
            }
            case '\r': {
                result.append("\\r");
                break;
            }
            case '\t': {
                result.append("\\t");
                break;
            }
            default: {
                if (value < ' ') {
                    result.append(String.format("\\u%04x", value));
                    break;
                }
                result.append(value);
            }
        }
    }
}

