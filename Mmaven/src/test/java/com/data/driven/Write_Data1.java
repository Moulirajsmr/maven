package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data1 {
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File f = new File("C:\\Users\\DR\\Desktop\\employee.xlsx");
		
		FileInputStream fis =new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook();
		
		wb.createSheet("emp").createRow(0).createCell(0).setCellValue("Name");
		wb.getSheet("emp").getRow(0).createCell(1).setCellValue("desigination");
		wb.getSheet("emp").getRow(0).createCell(2).setCellValue("company");
		wb.getSheet("emp").getRow(0).createCell(3).setCellValue("mobile no");
		wb.getSheet("emp").getRow(0).createCell(4).setCellValue("joining");
		
		wb.getSheet("emp").createRow(1).createCell(0).setCellValue("vijay");
		wb.getSheet("emp").getRow(1).createCell(1).setCellValue("TL");
		wb.getSheet("emp").getRow(1).createCell(2).setCellValue("cts");
		wb.getSheet("emp").getRow(1).createCell(3).setCellValue("8963256914");
		wb.getSheet("emp").getRow(1).createCell(4).setCellValue("2022");
		
		wb.getSheet("emp").createRow(2).createCell(0).setCellValue("muthu");
		wb.getSheet("emp").getRow(2).createCell(1).setCellValue("Senior-QA");
		wb.getSheet("emp").getRow(2).createCell(2).setCellValue("cts");
		wb.getSheet("emp").getRow(2).createCell(3).setCellValue("9364258615");
		wb.getSheet("emp").getRow(2).createCell(4).setCellValue("2022");
		
		wb.getSheet("emp").createRow(3).createCell(0).setCellValue("mouli");
		wb.getSheet("emp").getRow(3).createCell(1).setCellValue("QA");
		wb.getSheet("emp").getRow(3).createCell(2).setCellValue("cts");
		wb.getSheet("emp").getRow(3).createCell(3).setCellValue("8056367469");
		wb.getSheet("emp").getRow(3).createCell(4).setCellValue("2022");
		
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
	}

}
