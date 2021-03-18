import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Student {

	public static void main(String[] args) throws IOException {
	File f = new File ("C:\\Users\\Srini\\eclipse-workspace\\StudentCourses\\Excel\\Student Courses.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet sheet = w.getSheet("Sheet1");
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) 
	{
		Row row = sheet.getRow(i);
		for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.getCell(j);
			System.out.println(cell);
			
		}
	}
	
	}
		}
////	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
////	System.out.println("Number of Rows:"+physicalNumberOfRows);
//	Row row = sheet.getRow(0);
//	int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//	System.out.println("Number of Cells:"+physicalNumberOfCells);
//
//	}
//
//}
