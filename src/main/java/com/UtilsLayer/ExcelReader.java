package com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static XSSFWorkbook workbook;

	public ExcelReader(String path) {
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int countRows(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getLastRowNum() + 1;
	}

	public int countCells(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}

	public String getSpecificData(int sheetindex, int rows, int cells) {

		return workbook.getSheetAt(sheetindex).getRow(rows).getCell(cells).getRawValue();

	}

	public Object[][] getData(int sheetindex) {
		int rows = countRows(sheetindex);
		int cells = countCells(sheetindex);

		Object[][] data = new Object[rows][cells];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				data[i][j] = getSpecificData(sheetindex, i, j);
			}
		}
		return data;

	}

}
