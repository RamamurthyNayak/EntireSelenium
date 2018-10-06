package printingToExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility {

	public static void writeToXL(String path,int passCount,int failCount){

		try{

			Workbook w = WorkbookFactory.create(new FileInputStream(path));//open the excel file
			w.getSheet("sheet1").getRow(1).getCell(0).setCellValue(passCount);
			w.getSheet("sheet1").getRow(1).getCell(1).setCellValue(failCount);
			w.write(new FileOutputStream(path));


		}

		catch(Exception e){

		}
	}
}


