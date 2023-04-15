package Bluebag;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	String readfilepath= "C:\\Users\\sathishkumar\\eclipse-workspace\\SeleniumFeb2023\\input\\sampledata.xls";
	String writefilepath= "C:\\Users\\sathishkumar\\eclipse-workspace\\SeleniumFeb2023\\input\\outdata.xls";
	
	public void readdata() throws IOException
	{
		File f = new File(readfilepath);
		FileInputStream fi = new FileInputStream(f);
		
		//XSSFWorkbook workbook = new XSSFWorkbook(fi);
		HSSFWorkbook workbook = new HSSFWorkbook(fi);
		//Sheet excelsheet=workbook.getSheet("Input");
		Sheet excelsheet=workbook.getSheetAt(0);
		
		int userRow= excelsheet.getPhysicalNumberOfRows();
		for (int i=0;i<userRow;i++)
		{
			Row eachRow=excelsheet.getRow(i);
			int columnvalue= eachRow.getLastCellNum();
			for (int j=0 ;j <columnvalue;j++)
			{
				Cell eachcell=eachRow.getCell(j);
				System.out.print(eachcell.getStringCellValue());
				//System.out.print("\s");
			}
			//System.out.print("\n");
		}
		System.out.println("Read completed");
		
	}
	
	public void Writedata() throws FileNotFoundException
	{
		FileOutputStream fs = new FileOutputStream(writefilepath);
		
		//XSSFWorkbook hsf = new XSSFWorkbook(); // we can able to read xlsx file
		//or
		HSSFWorkbook hsf = new HSSFWorkbook(); // we can able to read xls file
		Sheet sh= hsf.createSheet("Output");
		
		//for(int i=0;i<name.length;i++)
		for(int i=0;i<1;i++)
		{
			Row rw=sh.createRow(i);
			int usedcolumn= 5;
			for(int j=0;j<usedcolumn;j++)
			{
				Cell celvalue=rw.createCell(j);
				celvalue.setCellValue("sathish: "+j);
			}
		}
		try {
			hsf.write(fs);
			hsf.close();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}

	
	public void readwritedata() throws IOException
	{
		File f = new File(readfilepath);
		FileInputStream fi = new FileInputStream(f);
		FileOutputStream fs = new FileOutputStream(writefilepath);
		
		
		//XSSFWorkbook workbook = new XSSFWorkbook(fi);
		HSSFWorkbook workbook = new HSSFWorkbook(fi);
		Sheet excelsheet=workbook.getSheet("Input");
		
		//output
		HSSFWorkbook hsf = new HSSFWorkbook(); // we can able to read xls file
		Sheet outsheet= hsf.createSheet("Output");
		
		
		int userRow= excelsheet.getPhysicalNumberOfRows();
		for (int i=0;i<userRow;i++)
		{
			Row eachRow=excelsheet.getRow(i);
			Row outRow=outsheet.createRow(i);
			int columnvalue= eachRow.getLastCellNum();
			for (int j=0 ;j <columnvalue;j++)
			{
				Cell eachcell=eachRow.getCell(j);
				Cell outcelvalue=outRow.createCell(j);
				//System.out.print(eachcell.getStringCellValue());
				//System.out.print("\s");
				outcelvalue.setCellValue(exactcellvalue(eachcell).toString());
			}
			//System.out.print("\n");
		}
		System.out.println("Read completed");

			hsf.write(fs);
			hsf.close();
			fs.close();
		
		System.out.println("Write Done");
	}
	
	
	public Object exactcellvalue(Cell Celval)
	{
		switch(Celval.getCellType())
		{
		case STRING:
			return Celval.getStringCellValue();
		case NUMERIC:
			//return Celval.getNumericCellValue();
			DataFormatter dataFormatter = new DataFormatter();
			return dataFormatter.formatCellValue(Celval);
		}
		return Celval;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelRead E = new ExcelRead();
		E.readwritedata();
		//E.Writedata();
	}

}
