package com.data.driven;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee_Detail1 {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File f = new File("C:\\Users\\DR\\Desktop\\mvm.xlsx");

	//	FileInputStream fs = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(f);

		Sheet st = wb.getSheetAt(0);
		
		int ro = st.getPhysicalNumberOfRows();

		for (int i = 0; i <ro; i++) {
			Row row = st.getRow(i);
			int ce = row.getPhysicalNumberOfCells();
			
			for (int j = 0; j <ce; j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
		wb.close();
	}

}
