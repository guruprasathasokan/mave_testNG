package org.datadriven_task01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Task03 {

	public static void infos() throws IOException {

		File f = new File("C:\\Users\\Mukesh Manivannan\\eclipse-workspace\\NewProject_Apache\\Biodatas.xlsx");

		FileInputStream fi = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fi); //upcasting
		
	    Sheet sheetAt = wb.getSheetAt(0);
	    
	    int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	    System.out.println(numberOfRows);
	    
	}
	
	public static void main(String[] args) throws IOException {
		
		infos();
	}
	

}
