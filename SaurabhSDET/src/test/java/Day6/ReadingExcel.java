package Day6;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//ExcelFile>workbook>sheet>rows>cells
public class ReadingExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Global\\SaurabhSDET\\TestData");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
                  XSSFSheet sheet= workbook.getSheet("Sheet1");  //workbook.getSheetAt(0);
                     int totalrows =sheet.getLastRowNum();
                     int Totalcells =sheet.getRow(1).getLastCellNum();
        System.out.println("no.of rows:"+totalrows);
        System.out.println("no.of cells:"+Totalcells);
        for(int r=0;r<=totalrows;r++) {
            XSSFRow currentrow = sheet.getRow(r);

            for (int c = 0; c < Totalcells; c++) {
                String value = currentrow.getCell(c).toString();
                System.out.println(value + "      ");
            }
            System.out.println();
        }
        workbook.close();
        file.close();
            }
        }






