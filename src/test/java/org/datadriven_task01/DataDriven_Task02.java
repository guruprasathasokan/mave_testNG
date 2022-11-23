package org.datadriven_task01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Task02 {

	public static void dataWriting() throws IOException {
		
		File f = new File("C:\\Users\\Mukesh Manivannan\\eclipse-workspace\\NewProject_Apache\\Biodatas.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.createSheet("Details");
		Row createRow = sheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Name");
		wb.getSheet("Details").getRow(0).createCell(1).setCellValue("A Guru Prasath");
		wb.getSheet("Details").createRow(1).createCell(0).setCellValue("Employee ID");
		wb.getSheet("Details").getRow(1).createCell(1).setCellValue(1012);
		wb.getSheet("Details").createRow(2).createCell(0).setCellValue("Mail Id");
		wb.getSheet("Details").getRow(2).createCell(1).setCellValue("guruprasath985@gmail.com");
		wb.getSheet("Details").createRow(3).createCell(0).setCellValue("Company");
		wb.getSheet("Details").getRow(3).createCell(1).setCellValue("Greens Technologies");
        FileOutputStream fos = new FileOutputStream(f);
        wb.write(fos);
        wb.close();
	}
	public static void main(String[] args) throws IOException {
		dataWriting();
	}
}
