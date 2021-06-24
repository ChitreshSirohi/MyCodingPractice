package com.aemo.annotations;
import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Repeatable(MSATS_Enum.List.class)
public @interface MSATS_Enum {
    String className();
    String[] properties();
    @interface List {
        MSATS_Enum[] value();
    }
}
