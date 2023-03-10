package data_driven_testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datadrivendemo {

	public static void main(String args[]) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	    driver.manage().window().maximize();
	    String file = System.getProperty("user.dir")+"\\test_dataset\\data_set3.xlsx";
	    int rows = utilityfile.getRowCount(file, "Sheet1");
	    for(int i=1;i<=rows;i++)
	    {
	    	String princ = utilityfile.getCellData(file, "Sheet1", i, 0);
	    	String rateofinterest = utilityfile.getCellData(file, "Sheet1", i, 1);
	    	String per1 = utilityfile.getCellData(file, "Sheet1", i, 2);
	    	String per2 = utilityfile.getCellData(file, "Sheet1", i, 3);
	    	String fre = utilityfile.getCellData(file, "Sheet1", i, 4);
	    	String exp_mvalue = utilityfile.getCellData(file, "Sheet1", i, 5);
	    	//pass data to app
	    	driver.findElement(By.id("principal")).sendKeys(princ);
	    	driver.findElement(By.id("interest")).sendKeys(rateofinterest);
	    	driver.findElement(By.id("tenure")).sendKeys(per1);
	    	
	    	Select perdrp = new Select(driver.findElement(By.id("tenurePeriod")));
	    	perdrp.selectByVisibleText(per2);
	    	
	    	Select fredrp = new Select(driver.findElement(By.id("frequency")));
	    	fredrp.selectByVisibleText(fre);
	    	
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    	WebElement calculate_btn = driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
	    	js.executeScript("arguments[0].click();", calculate_btn);
	    	
	    	String act_mvalue = driver.findElement(By.id("resp_matval")).getText();
	    	if(Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue))
	    	{
	    		System.out.println("test passed");
	    		utilityfile.setCellData(file,"Sheet1",i,7,"passed");
	    		
	    	}
	    	else
	    	{
	    		System.out.println("test failed");
	    		utilityfile.setCellData(file,"Sheet1",i,7,"failed");
	    	}
	    	Thread.sleep(3000);
	    	WebElement clear_btn = driver.findElement(By.xpath("//img[@class='PL5']"));
	    	js.executeScript("arguments[0].click();",clear_btn);
	    	
	    	
	    	
	    }
	    
	    driver.close();
	    
	}
}
