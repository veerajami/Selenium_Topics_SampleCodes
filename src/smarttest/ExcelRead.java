package smarttest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelRead {
	
	public void getData(int sheetnum,int rownum, int columnnum)
	{
		File src=new File("C:\\Users\\lenovo\\Desktop\\Book1.xlsx");
		FileInputStream fis;
		try {
			fis=new FileInputStream(src);
			//Workbook workbook=workbook.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
