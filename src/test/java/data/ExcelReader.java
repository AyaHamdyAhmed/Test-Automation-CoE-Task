package data;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	//import org.apache.poi.xssf.usermodel.XSSFRow;
	//import org.apache.poi.xssf.usermodel.XSSFSheet;
	//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelReader {

		static FileInputStream fis = null;

		public static FileInputStream getFileInputStream() {
			String FilePath = System.getProperty("user.dir") + "/src/test/java/data/TestData.xlsx";
			File SrcFile = new File(FilePath);
			try {
				fis = new FileInputStream(SrcFile);
			} catch (FileNotFoundException e) {
				System.out.println("Test Data File not found" + e.getMessage());
				System.exit(0);
			}

			return fis;
		}

		//public Object[][] getExcelData() throws IOException {
			//fis = getFileInputStream();
		//XSSFWorkbook WB = new XSSFWorkbook(fis);
			//XSSFSheet Sheet = WB.getSheetAt(0);
			//int TotalRows = Sheet.getLastRowNum();
			/*int TotalCols = Sheet.getRow(0).getLastCellNum();

			String[][] arrayExcelData = new String[TotalRows][TotalCols];
			for (int i = 0; i < TotalRows; i++) {

				for (int j = 0; j < TotalCols; j++) {
					arrayExcelData[i][j] = Sheet.getRow(i+1).getCell(j).toString();
				}
			}*/

//WB.close();
	//		return arrayExcelData;
//		}
	}


