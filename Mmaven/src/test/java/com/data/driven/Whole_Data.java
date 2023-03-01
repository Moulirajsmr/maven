package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Whole_Data {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\DR\\eclipse-workspace\\Mmaven\\Xml_Files\\Demo 1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		int Rows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < Rows; i++) {

			Row row = sheetAt.getRow(1);

			int Cells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < Cells; j++) {

				Cell cell = row.getCell(j);

				System.out.println(cell);

			}	

		}
		wb.close();

	}

	}
