package com;

import com.aemo.msats.util.excel.pojo.CellData;
import com.aemo.msats.util.excel.pojo.SheetData;

import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;

public class SampleExcelWriter {

    public static void main(String[] args) throws IOException {
        final LocalDate stat_date = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        final int i = stat_date.get(weekFields.weekOfYear());
        System.out.println("I:"+i);
        List<SheetData> sheets = new ArrayList<>();
        IntStream.range(0,5).forEach(s -> {
            SheetData sheetData = new SheetData();
            sheetData.setName(s+"Sheet");
            final List<List<CellData>> rows = sheetData.getRows();
            IntStream.range(0,6).forEach(rowNum -> {
            List<CellData> cells = new ArrayList<>();
            IntStream.range(0,7).forEach(data-> {
                if(data==5){
                    cells.add(new CellData(LocalDate.now()));
                }if(data == 3){
                    cells.add(new CellData("Hello1234"));
                } else{
                    cells.add(new CellData(data));
                }
            });
            rows.add(cells);
            });
            sheets.add(sheetData);
        });
        MSATSExcelWriter.createExcelSheet(sheets,"M1yExcel.xlsx");
    }
}
