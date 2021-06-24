package com;

import com.aemo.msats.util.excel.pojo.CellData;
import com.aemo.msats.util.excel.pojo.SheetData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.List;
import java.util.function.Function;

public class MSATSExcelWriter {

    public static void createExcelSheet(List<SheetData> sheets, String excelFileName) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        CreationHelper createHelper = workbook.getCreationHelper();
        for (SheetData sheet:sheets) {
            int startIndex = sheet.getStartRowIndex();
            final Sheet workbookSheet = sheet.getName()==null? workbook.createSheet() : workbook.createSheet(WorkbookUtil.createSafeSheetName(sheet.getName()));
            int ctr=0;
            for (List<CellData> dataRow: sheet.getRows()) {
                final Row row = workbookSheet.createRow(startIndex);
                int cellCtr=0;
                for (CellData cellData:dataRow) {
                    Cell cell = row.createCell(cellCtr);
                    switch (cellData.getValueType()){
                        case DATE:
                            CellStyle cellStyle = workbook.createCellStyle();
                            cellStyle.setDataFormat(
                                    createHelper.createDataFormat().getFormat("dd-MMM-yyyy"));
                            cell.setCellStyle(cellStyle);
                            cell.setCellValue(cellData.getDateVal());

                            break;
                        case NUMBER:
                            cell.setCellValue(cellData.getNumVal());

                            break;
                        case STRING:
                            cell.setCellValue(cellData.getStringVal());
                            workbookSheet.setColumnWidth(cell.getColumnIndex(),(cellData.getStringVal().length()+10) * 256);
                            break;
                        case BOOLEAN:
                            cell.setCellValue(cellData.isBooleanVal());
                    }
                    cellCtr++;
                }
                startIndex++;
            }
        }
        try (OutputStream fileOut = new FileOutputStream("C:\\Users\\CSirohi\\"+excelFileName)) {
            workbook.write(fileOut);


        }

    }


}
