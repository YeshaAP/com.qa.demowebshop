package com.ws.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	XSSFWorkbook wb;

	/*
	 * this constructor is used to load the Excel sheet
	 */

	public ExcelUtil(String excel_path) {

		try {
			File file = new File(excel_path);
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to read Excel Sheet. Please Check");
			e.printStackTrace();
		}
	}

	/*
	 * this method is used to retrieve active row count
	 */
	public int getRowCount(int sheetNo) {
		int count = wb.getSheetAt(sheetNo).getLastRowNum() + 1;
		return count;
	}

	/*
	 * this method is used to retrieve data from cell
	 */

	public String getCellData(int sheetNo, int row, int cell) {
		String data = wb.getSheetAt(sheetNo).getRow(row).getCell(cell).toString();
		return data;
	}

}
