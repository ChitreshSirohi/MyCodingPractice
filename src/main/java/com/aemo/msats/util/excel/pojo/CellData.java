package com.aemo.msats.util.excel.pojo;

import org.apache.poi.ss.usermodel.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.function.Consumer;

public class CellData {
    private String stringVal;
    private double numVal;
    private boolean booleanVal;
    private LocalDate dateVal;
    private final ValueType valueType;
    public enum ValueType{
        STRING,NUMBER,BOOLEAN,DATE
    }

    public CellData(final String stringVal) {
        this.stringVal = stringVal;
        this.valueType=ValueType.STRING;
    }

    public CellData(final double numVal) {
        this.numVal = numVal;
        this.valueType=ValueType.NUMBER;
    }

    public CellData(final boolean booleanVal) {
        this.booleanVal = booleanVal;
        this.valueType=ValueType.BOOLEAN;
    }

    public CellData(final LocalDate dateVal) {
        this.dateVal = dateVal;
        this.valueType=ValueType.DATE;
    }

    public String getStringVal() {
        return this.stringVal;
    }

    public double getNumVal() {
        return this.numVal;
    }

    public boolean isBooleanVal() {
        return this.booleanVal;
    }

    public LocalDate getDateVal() {
        return this.dateVal;
    }

    public ValueType getValueType() {
        return valueType;
    }
}
