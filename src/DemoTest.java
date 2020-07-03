/*
 * 
 * import java.io.FileInputStream; import java.io.FileNotFoundException; import
 * java.io.IOException; import java.util.Properties;
 * 
 * import org.apache.poi.ss.usermodel.DataFormatter; import
 * org.apache.poi.xssf.usermodel.XSSFCell; import
 * org.apache.poi.xssf.usermodel.XSSFRow; import
 * org.apache.poi.xssf.usermodel.XSSFSheet; import
 * org.apache.poi.xssf.usermodel.XSSFWorkbook; import
 * org.testng.annotations.DataProvider; import org.testng.annotations.Test;
 * 
 * public class DemoTest {
 * 
 * @Test public void readProperties() throws IOException { FileInputStream file
 * =new FileInputStream("testdata/data.properties"); Properties prop=new
 * Properties(); prop.load(file);
 * 
 * String baseUrl=prop.getProperty("url","http:\\google.com");
 * System.out.println(baseUrl);
 * 
 * }
 * 
 * 
 * 
 * //@Test public void excelRead() throws IOException {
 * 
 * FileInputStream file = new FileInputStream("testdata/OpenEMRData.xlsx");
 * XSSFWorkbook book = new XSSFWorkbook(file); XSSFSheet sheet =
 * book.getSheet("validCredentialData");
 * 
 * int rowCount=sheet.getPhysicalNumberOfRows(); int cellCount =
 * sheet.getRow(0).getPhysicalNumberOfCells(); Object[][] main =new
 * Object[rowCount-1][cellCount];
 * 
 * DataFormatter format = new DataFormatter(); for(int r=1;r<rowCount;r++) {
 * XSSFRow row = sheet.getRow(r); for(int c=0;c<cellCount;c++) { XSSFCell cell =
 * row.getCell(c); String cellValue= format.formatCellValue(cell);
 * main[r-1][c]=cellValue; } } book.close(); file.close(); }
 * 
 * }
 * 
 * // john,john123 // peter,peter123 // paul,paul123 // @DataProvider // public
 * String[][] fillFormData() // { // String[][] main=new String[3][2]; // // i
 * --> number of test case // // j-->number of parameter // main[0][0]="john";
 * // main[0][1]="john123"; // // main[1][0]="peter"; // main[1][1]="peter123";
 * // // main[2][0]="paul"; // main[2][1]="paul123"; // // return main; // } //
 * // @Test(dataProvider = "fillFormData") // public void fillFormTest(String
 * username,String password) // { // System.out.println(username+password); // }
 * // // @DataProvider // public Object[][] fillFormData() // { // Object[][]
 * main=new Object[3][2]; // // i --> number of test case // // j-->number of
 * parameter // main[0][0]="john"; // main[0][1]="john123"; // //
 * main[1][0]="peter"; // main[1][1]="peter123"; // // main[2][0]="paul"; //
 * main[2][1]="paul123"; // // return main; // } // // @Test(dataProvider =
 * "fillFormData") // public void fillFormTest(String username,String password)
 * // { // System.out.println(username+password); // } // //
 * //john,john123,French (Standard),Invalid username or password //
 * //peter,peter123,Armenian,Invalid username or password // // // @DataProvider
 * // public Object[][] invalidData() // { // Object[][] main=new Object[2][4];
 * // // i --> number of test case // // j-->number of parameter //
 * main[0][0]="john"; // main[0][1]="john123"; //
 * main[0][2]="French (Standard)"; // main[0][3]="Invalid username or password";
 * // // main[1][0]="peter"; // main[1][1]="peter123"; // main[1][2]="Armenian";
 * // main[1][3]="Invalid username or password"; // // return main; // } //
 * // @Test(dataProvider = "invalidData") // public void invalidTest(String
 * username,String password,String language,String expectedValue) // { //
 * System.out.println(username+password+language+expectedValue); // }
 * 
 * //}
 */