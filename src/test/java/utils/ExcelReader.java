package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    // it will help to read Excel file
    public static List<Map<String, String>> read(String sheetName, String path) {
        FileInputStream fileInputStream = null;
        List<Map<String,String>> excelData = new ArrayList<>(); // in excel we are checking multiple MAP
        try {
            fileInputStream = new FileInputStream(path);
            // that special call which knows how to read the data from excel files
            // to utilise info in data script
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = xssfWorkbook.getSheet(sheetName);

            // first row in excel file -> key row (header)
            Row headerRow = sheet.getRow(0);
            // we use for loop -> value row (.getPhysicalNumberOfRows() -> exist in .xlsx file)
            //for row, we take 1 index because 0 is already used for headers
            for (int rows = 1; rows < sheet.getPhysicalNumberOfRows(); rows++) {
                //this row is for values
                Row row = sheet.getRow(rows);
                Map<String, String> rowMap = new LinkedHashMap<>();
                //here, we are taking all the columns
                for (int col = 0; col < row.getPhysicalNumberOfCells(); col++) {
                    String key = headerRow.getCell(col).toString();
                    String value = row.getCell(col).toString();
                    rowMap.put(key, value);
                }
                excelData.add(rowMap);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return excelData; // will return all the list of Map that is available in excel file
    }
}
