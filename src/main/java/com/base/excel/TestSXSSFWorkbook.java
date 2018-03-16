package com.base.excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class TestSXSSFWorkbook {

	public static void main(String[] args) {
		FileOutputStream os = null;
		try {
			os = new FileOutputStream("src/main/java/com/base/excel/test.xlsx");
			SXSSFWorkbook wb = new SXSSFWorkbook(100);

			Sheet sheet1 = wb.createSheet("sheet1");

			Row titleRow = (Row) sheet1.createRow(0);
			// 生成表头
			for (int i = 0; i < 10; i++) {
				Cell cell = titleRow.createCell(i);
				cell.setCellValue("表头" + i);
			}

			// 生成100行数据
			for (int i = 1; i < 100; i++) {
				Row row = (Row) sheet1.createRow(i);
				for (int j = 0; j < 10; j++) {
					Cell cell = row.createCell(j);
					cell.setCellValue("行" + i + "列" + j);
				}
			}

			wb.write(os);
			os.flush();
			wb.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
