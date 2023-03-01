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

public class Employee_Details {

	public static void main(String[] args) throws InvalidFormatException, IOException  {

		File f = new File("C:\\Users\\DR\\Desktop\\mvm.xlsx");

		FileInputStream fs = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(f);

		Sheet st = wb.getSheetAt(0);

		Row row = st.getRow(1);

		Cell cell = row.getCell(1);

		CellType ct = cell.getCellType();

		if (ct.equals(CellType.STRING)) {
			String Svalue = cell.getStringCellValue();
			System.out.println(Svalue);
		} else if (ct.equals(CellType.NUMERIC)) {

			double Nvalue = cell.getNumericCellValue();
			System.out.println(Nvalue);

		}
		wb.close();

	}

}
