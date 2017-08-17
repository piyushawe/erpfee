package utilities;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtility {

    public static String[][] readExcel(String filePath, String sh) throws IOException {
        File file = new File(filePath);
        FileInputStream fin = new FileInputStream(file);
        HSSFWorkbook workbook = new HSSFWorkbook(fin);
        Sheet sheet = workbook.getSheet(sh);
        int rcount = sheet.getPhysicalNumberOfRows();
        Row row= sheet.getRow(1);
        Cell cell;
        int cellcount= row.getLastCellNum();
        String urldetails[][]= new String[rcount][cellcount];
        for(int i=1; i<rcount; i++)
            for (int j=0; j<cellcount; j++) {
               cell= row.getCell(j);
               urldetails[i][j] = cell.getStringCellValue();
            }
        return urldetails;
  }
}
