package org.datadriven_task01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Task01 {

	public static void bioDatas() throws IOException {

		File f = new File("C:\\Users\\Mukesh Manivannan\\eclipse-workspace\\NewProject_Apache\\Biodatas.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of Rows:" + numberOfRows);
		System.out.println("--------------");
		System.out.println("Datas in Biodata Excluding Tag Name:-");
		for (int i = 1; i < numberOfRows; i++) {
			Row rows = sheet.getRow(i);
			int numberOfCells = rows.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cells = rows.getCell(j);
				CellType ct = cells.getCellType();
				if (ct.equals(CellType.STRING)) {
					String values = cells.getStringCellValue();
					System.out.println(values);
				} else if (ct.equals(CellType.NUMERIC)) {
					double numbers = cells.getNumericCellValue();
					int no = (int) numbers;
					System.out.println(no);
				}
			}
		}
		System.out.println("---------------");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(4);
		System.out.println("Guru's Total Experience:" + cell);
	}

	public static void singleRowDatas() throws IOException {

		File f = new File("C:\\Users\\Mukesh Manivannan\\eclipse-workspace\\NewProject_Apache\\Biodatas.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sa = wb.getSheetAt(0);
		Row row = sa.getRow(1);
		int nosOfCells = row.getPhysicalNumberOfCells();
		System.out.println("Singe Row Datas:");
		for (int i = 0; i < nosOfCells; i++) {
			Cell cells = row.getCell(i);
			CellType cellType = cells.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String value = cells.getStringCellValue();
				System.out.println(value);
			} else if (cellType.equals(CellType.NUMERIC)) {
				double num = cells.getNumericCellValue();
				int in = (int) num;
				System.out.println(in);
			}
		}
	}

	public static void singleCellData() throws IOException {
		File f = new File(
				"C:\\\\Users\\\\Mukesh Manivannan\\\\eclipse-workspace\\\\NewProject_Apache\\\\Biodatas.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb1 = new XSSFWorkbook(fis);
		Sheet sheetAt = wb1.getSheetAt(0);
		Row row1 = sheetAt.getRow(2);
		Cell cell1 = row1.getCell(1);
		CellType ct1 = cell1.getCellType();
		System.out.println("*Single Data*");
		if (ct1.equals(CellType.STRING)) {
			String sv = cell1.getStringCellValue();
			System.out.println(sv);
		} else if (ct1.equals(CellType.NUMERIC)) {
			double no = cell1.getNumericCellValue();
			int numbs = (int) no;
			System.out.println(numbs);
		}
	}
	
	public static void main(String[] args) throws IOException {
		bioDatas();
		singleRowDatas();
		singleCellData();
	}
}
