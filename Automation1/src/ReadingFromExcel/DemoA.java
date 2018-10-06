package ReadingFromExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DemoA {
	
	public static void main(String[] args)throws Exception {
		
		//Read

		Workbook w=WorkbookFactory.create(new FileInputStream("./input/Book1.xlsx"));
		String v = w.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(v);


		//Write

		w.getSheet("sheet1").getRow(0).getCell(0).setCellValue("Prakash");
		w.write(new FileOutputStream("./input/Book2.xlsx"));//diff path-save as
		w.close();

		//create a new row with cell value
		w.getSheet("sheet1").createRow(1).createCell(0).setCellValue("Rajababu");
	    w.write(new FileOutputStream("./input/Book2.xlsx"));
	
	  //create a new row in first tab with cell value in new file
		w.getSheet("sheet1").createRow(3).createCell(0).setCellValue("Ram");
		w.write(new FileOutputStream("./input/Book3.xlsx"));


	}

}
