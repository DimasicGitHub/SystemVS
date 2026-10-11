/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
@Repeatable(value=la.class)
public @interface hz {
    public Class target() default void.class;

    public String method() default "";

    public iD at();

    public String desc() default "";

    public String targetName() default "";

    public int methodIndex() default -1;
}

