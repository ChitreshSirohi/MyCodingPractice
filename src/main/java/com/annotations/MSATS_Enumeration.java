package com.annotations;

import com.aemo.annotations.MSATS_Enum;

import java.util.Enumeration;

@MSATS_Enum(className = "Chitresh", properties = {"hello","hi"})
public abstract class MSATS_Enumeration
        implements Comparable<Object>, java.io.Serializable{

    private final String code;
    private final String description;

    public MSATS_Enumeration(final String code, final String description){
        this.code =code;
        this.description =description;
    }

    public String toString() {
        return code + "-" + description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

}
