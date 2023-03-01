package com.data.driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	public static void T20_Batting() throws IOException {

		File f = new File("C:\\Users\\DR\\Desktop\\T20.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook();

		wb.createSheet("Data").createRow(0).createCell(0).setCellValue("Player name");
		wb.getSheet("Data").getRow(0).createCell(1).setCellValue("Team");
		wb.getSheet("Data").getRow(0).createCell(2).setCellValue("Matches");
		wb.getSheet("Data").getRow(0).createCell(3).setCellValue("Runs");
		wb.getSheet("Data").getRow(0).createCell(4).setCellValue("H.S");
		wb.getSheet("Data").getRow(0).createCell(5).setCellValue("Average");
		wb.getSheet("Data").getRow(0).createCell(6).setCellValue("S.R");

		wb.getSheet("Data").createRow(1).createCell(0).setCellValue("V.Kholi");
		wb.getSheet("Data").getRow(1).createCell(1).setCellValue("India");
		wb.getSheet("Data").getRow(1).createCell(2).setCellValue("112");
		wb.getSheet("Data").getRow(1).createCell(3).setCellValue("3868");
		wb.getSheet("Data").getRow(1).createCell(4).setCellValue("122");
		wb.getSheet("Data").getRow(1).createCell(5).setCellValue("52.27");
		wb.getSheet("Data").getRow(1).createCell(6).setCellValue("138.34");

		wb.getSheet("Data").createRow(2).createCell(0).setCellValue("R.Sharma");
		wb.getSheet("Data").getRow(2).createCell(1).setCellValue("India");
		wb.getSheet("Data").getRow(2).createCell(2).setCellValue("145");
		wb.getSheet("Data").getRow(2).createCell(3).setCellValue("3809");
		wb.getSheet("Data").getRow(2).createCell(4).setCellValue("118");
		wb.getSheet("Data").getRow(2).createCell(5).setCellValue("31.74");
		wb.getSheet("Data").getRow(2).createCell(6).setCellValue("140.13");

		wb.getSheet("Data").createRow(3).createCell(0).setCellValue("M.Guptil");
		wb.getSheet("Data").getRow(3).createCell(1).setCellValue("New-Zealand");
		wb.getSheet("Data").getRow(3).createCell(2).setCellValue("122");
		wb.getSheet("Data").getRow(3).createCell(3).setCellValue("3531");
		wb.getSheet("Data").getRow(3).createCell(4).setCellValue("105");
		wb.getSheet("Data").getRow(3).createCell(5).setCellValue("31.81");
		wb.getSheet("Data").getRow(3).createCell(6).setCellValue("135.70");

		wb.getSheet("Data").createRow(4).createCell(0).setCellValue("B.Azam");
		wb.getSheet("Data").getRow(4).createCell(1).setCellValue("Pakistan");
		wb.getSheet("Data").getRow(4).createCell(2).setCellValue("95");
		wb.getSheet("Data").getRow(4).createCell(3).setCellValue("3239");
		wb.getSheet("Data").getRow(4).createCell(4).setCellValue("122");
		wb.getSheet("Data").getRow(4).createCell(5).setCellValue("42.06");
		wb.getSheet("Data").getRow(4).createCell(6).setCellValue("129.19");

		wb.getSheet("Data").createRow(5).createCell(0).setCellValue("P.R.Stirling");
		wb.getSheet("Data").getRow(5).createCell(1).setCellValue("Ireland");
		wb.getSheet("Data").getRow(5).createCell(2).setCellValue("119");
		wb.getSheet("Data").getRow(5).createCell(3).setCellValue("3133");
		wb.getSheet("Data").getRow(5).createCell(4).setCellValue("115");
		wb.getSheet("Data").getRow(5).createCell(5).setCellValue("28.74");
		wb.getSheet("Data").getRow(5).createCell(6).setCellValue("134.69");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void main(String[] args) throws IOException {
		T20_Batting();
	}

}