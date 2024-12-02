public class TablePreviousRow 
{
    public static void main(String[] args) 
    {
    WebElement table = driver.findElement(By.xpath(“//table[@id=’myTable’]”));

        // find all rows of the table
        List<WebElement> rows = table.findElements(By.xpath(“.//tr”));

        // Initialize row and column index
        int rowIndex = 3;
        int colIndex = 4;

        // Find the previous row
        WebElement cell = rows.get(rowIndex – 1).findElements(By.xpath(“.//td”)).get(colIndex – 1);

        // Get the cell value
        String cellValue = cell.getText();
        System.out.println(“Cell value: ” + cellValue);
    }
}
