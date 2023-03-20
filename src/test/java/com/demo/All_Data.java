package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {

public static void main(String[] args) throws IOException {
 File f = new File("C:\\Users\\Administrator\\eclipse-workspace\\Miniproject\\Excel\\Demoexcel.xlsx");
 FileInputStream fis = new FileInputStream(f);
 Workbook wb = new XSSFWorkbook(fis); 
 Sheet sheetAt = wb.getSheetAt(0);
	    
	    int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
            for(int i=0; i<physicalNumberOfRows; i++) {
        	 Row row = sheetAt.getRow(i);
        	 
        int physicalNumberOfCells = row.getPhysicalNumberOfCells();
        	 for(int j=0;j<physicalNumberOfCells;j++) {
        	 Cell column = row.getCell(j);
        		 
         CellType ctype = column.getCellType();
        		 
            if(ctype.equals(CellType.STRING)) {
        		    	String stringCellValue = column.getStringCellValue();
        		    	System.out.println(stringCellValue);
        		     }	
          else if(ctype.equals(CellType.NUMERIC)) {
        		    	double numericCellValue = column.getNumericCellValue();
        		    	int value = (int) numericCellValue;
        		    	System.out.println(value); 	
                     } 	 
        }
     }
  }
}
