package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Single_Data {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File f = new File("C:\\Users\\DR\\eclipse-workspace\\Mmaven\\Xml_Files\\Demo 1.xlsx");
		
		FileInputStream fs = new FileInputStream(f);
		
		Workbook wbk = new XSSFWorkbook(fs);
		
		Sheet sheetAt = wbk.getSheetAt(0);
		
		Row row = sheetAt.getRow(5);
		
		Cell cell = row.getCell(3);
		
		CellType ct = cell.getCellType();
		
		if (ct.equals(CellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		} else if (ct.equals(CellType.NUMERIC)) {
			
			double num = cell.getNumericCellValue();
			
			int e = (int) num;
			
			String valueOf = String.valueOf(e);
			System.out.println(valueOf);
		}
		wbk.close();
		
	}

}
