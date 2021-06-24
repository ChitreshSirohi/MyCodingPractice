package com.aemo.msats.util.excel.pojo;

import java.util.ArrayList;
import java.util.List;

public class SheetData {
    private String name;
    private List<List<com.aemo.msats.util.excel.pojo.CellData>> rows = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<List<com.aemo.msats.util.excel.pojo.CellData>> getRows() {
        return rows;
    }

    public int getStartRowIndex() {
        return startRowIndex;
    }

    public void setStartRowIndex(final int startRowIndex) {
        this.startRowIndex = startRowIndex;
    }

    private int startRowIndex;
}
