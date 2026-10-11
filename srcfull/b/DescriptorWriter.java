/*
 * Decompiled with CFR 0.152.
 */
package b;

import java.lang.reflect.Method;

final class DescriptorWriter {
    private DescriptorWriter() {
    }

    static String of(Method method) {
        StringBuilder builder = new StringBuilder(64).append('(');
        for (Class<?> type : method.getParameterTypes()) {
            DescriptorWriter.append(builder, type);
        }
        builder.append(')');
        DescriptorWriter.append(builder, method.getReturnType());
        return builder.toString();
    }

    static void append(StringBuilder builder, Class<?> type) {
        builder.append(type.descriptorString());
    }
}

