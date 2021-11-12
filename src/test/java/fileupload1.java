import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileupload1 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		FileInputStream file=new FileInputStream("F://SampleExcel.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		
		XSSFSheet Sheet=workbook.getSheet("Sheet1");
		
		int rowcount=Sheet.getLastRowNum();
		
		int colcount=Sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow cureentrow=Sheet.getRow(i);
			
			for(int j=0;j<colcount;j++)
			{
				String value=cureentrow.getCell(j).toString();
				System.out.println(value);
				
			}
		}
		
		
		
		
		
		   
		   
		   


	}

}
