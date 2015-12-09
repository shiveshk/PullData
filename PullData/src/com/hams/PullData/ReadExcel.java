package com.hams.PullData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

    private static final int MY_MINIMUM_COLUMN_COUNT = 19;

	/**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
    
    	File myFile = new File("e://sample/7thmon.xlsx"); 
    	FileInputStream fis = new FileInputStream(myFile); // Finds the workbook instance for XLSX file
    	
    	XSSFWorkbook myWorkBook = new XSSFWorkbook (fis); // Return first sheet from the XLSX workbook
    	
    	XSSFSheet mySheet = myWorkBook.getSheetAt(0); // Get iterator to all the rows in current sheet
    
//output
    	Workbook wb = new XSSFWorkbook();
        FileOutputStream fileOut = new FileOutputStream("e://sample/workbook.xlsx");
        wb.write(fileOut);
        fileOut.close();
    	//Iterator<Row> rowIterator = mySheet.iterator(); // Traversing over each row of XLSX file
    	
    	int rowStart  = Math.min(1, mySheet .getFirstRowNum());
    	
        int rowEnd  = Math.max(278, mySheet .getLastRowNum());
        
        for (int rowNum = rowStart; rowNum < rowEnd; rowNum++) {
            
        	Row r = mySheet.getRow(rowNum);
            
            if (r == null) {
               // This whole row is empty
               // Handle it as needed
               continue;
            }

            int lastColumn = Math.max(r.getLastCellNum(), MY_MINIMUM_COLUMN_COUNT);

            for (int cn = 0; cn < lastColumn; cn++) {
               Cell cell = r.getCell(cn , Row.RETURN_BLANK_AS_NULL);
               if (cell == null) {
            	   // The spreadsheet is empty in this cell
               } else {
                  // Do something useful with the cell's contents
           		 
            	switch (cell.getCellType()) 
            	{ 
            	case Cell.CELL_TYPE_STRING: System.out.print(cell.getStringCellValue() + "\t");
            	break;
            	case Cell.CELL_TYPE_NUMERIC: System.out.print(cell.getNumericCellValue() + "\t");
            	break;
            	case Cell.CELL_TYPE_BOOLEAN: System.out.print(cell.getBooleanCellValue() + "\t");
            	break;
            	case Cell.CELL_TYPE_BLANK: System.out.println("");
            	break;
            	
            	default : } } System.out.println(""); 
               }
            }
         }
    	
//    	while (rowIterator.hasNext()) 
//    	{ Row row = rowIterator.next(); // For each row, iterate through each columns 
//    	Iterator<Cell> cellIterator = row.cellIterator(); 
//    	while (cellIterator.hasNext()) 
//    	{ 
//    		Cell cell = cellIterator.next(); 
//    	switch (cell.getCellType()) 
//    	{ case Cell.CELL_TYPE_STRING: System.out.print(cell.getStringCellValue() + "\t");
//    	break;
//    	case Cell.CELL_TYPE_NUMERIC: System.out.print(cell.getNumericCellValue() + "\t");
//    	break;
//    	case Cell.CELL_TYPE_BOOLEAN: System.out.print(cell.getBooleanCellValue() + "\t");
//    	break;
//    	case Cell.CELL_TYPE_BLANK: System.out.println("");
//    	break;
//    	
//    	default : } } System.out.println(""); 
//    	}
    	
        	}

    	

   
