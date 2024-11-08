import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Alerts_Frames 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_backup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://logistics.staging.mksp.co");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='header-wrapper']")).isDisplayed(), true);
		driver.findElement(By.cssSelector("span[class='button-text']")).click();
		
		driver.findElement(By.cssSelector("input[class='dark city-zip-input js-address-input js-zip']")).sendKeys("10038");
		driver.findElement(By.cssSelector("button[class='city-address-button js-city-address-button show-for-medium-up']")).click();
				
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='all-plan-choice'])[1]")));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement element=	driver.findElement(By.cssSelector("a[class='button radius storage-calculator-help-button']"));
		jse.executeScript("arguments[0].scrollIntoView();", element);
		jse.executeScript("window.scrollBy(0,-250)", "");
		element.click();
		
		driver.findElement(By.cssSelector("input[class='makespace-ui-library-1vtlwi4 css-nj7v3y2']")).sendKeys("10038");
		driver.findElement(By.cssSelector("button[class='makespace-ui-library-5mjjoo css-1bp8ty01']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Bedroom')]")));
		driver.findElement(By.xpath("//p[contains(text(),'Bedroom')]")).click();
		driver.findElement(By.cssSelector("input[name='bedside-table']")).sendKeys("1");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='makespace-ui-library-110k8cl css-5gitwz4']")));
		WebElement bedsideTable = driver.findElement(By.xpath("//p[@class='makespace-ui-library-110k8cl css-5gitwz4']"));
		if (bedsideTable.isDisplayed())
		{
			System.out.println("Inventory is updated with bedroom information");
		}
		WebElement plan = driver.findElement(By.cssSelector("div[class='makespace-ui-library-1iwbsa8']"));
		if (plan.isDisplayed())
		{
			System.out.println("Storage plan is displayed");
		}
		
		
		jse.executeScript("window.scrollBy(0,-390)", "");
		driver.findElement(By.xpath("//p[contains(text(),'Living room')]")).click();
		
		jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector("p[class='contact-connect-title contact-title big-subtitle']")));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class='contact-connect-title contact-title big-subtitle']")));
		jse.executeScript("window.scrollBy(0,700)", "");
		
		driver.findElement(By.xpath("//input[@class='makespace-ui-library-1eda6fg css-nj7v3y2' and @name='tv-stand']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@class='makespace-ui-library-1eda6fg css-nj7v3y2' and @name='side-table']")).sendKeys("1");

		jse.executeScript("window.scrollBy(0,-250)", "");
		//Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-250)", "");
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='makespace-ui-library-1nz3emm css-5gitwz4'])[2]")));
		WebElement livingRoom = driver.findElement(By.xpath("(.//*[@class='makespace-ui-library-1nz3emm css-5gitwz4'])[2]"));
		if (livingRoom.isDisplayed())
		{
			System.out.println("Inventory has been updated with living room information");
		}
		WebElement plan2 = driver.findElement(By.xpath("(.//*[@class='makespace-ui-library-1iwbsa8'])[1]"));
		if (plan2.isDisplayed())
		{
			System.out.println("Plan has been updated after living room information is entered");
		}
		
		jse.executeScript("window.scrollBy(0,-1000)", "");
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Miscellaneous')]")));
		driver.findElement(By.xpath("//p[contains(text(),'Miscellaneous')]")).click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='bins']")));
		driver.findElement(By.cssSelector("input[name='bins']")).sendKeys("4");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)", "");
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='makespace-ui-library-1yp6ee3 css-1bp8ty01'])[1]")));
		driver.findElement(By.xpath("(.//*[@class='makespace-ui-library-1yp6ee3 css-1bp8ty01'])[1]")).click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='dropoff-supply-input']")));
		driver.findElement(By.cssSelector("input[class='dropoff-supply-input']")).sendKeys(Keys.DELETE);
		driver.findElement(By.cssSelector("input[class='dropoff-supply-input']")).sendKeys("4");
		driver.findElement(By.cssSelector("input[class='dropoff-supply-input']")).sendKeys(Keys.RETURN);
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='makespace-ui-library-1akkiyt css-1bp8ty00']")));
		driver.findElement(By.cssSelector("button[class='makespace-ui-library-1akkiyt css-1bp8ty00']")).click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@data-service='bulky-items'])[3]")));
		driver.findElement(By.xpath("(.//*[@data-service='bulky-items'])[3]")).click();
		driver.findElement(By.xpath("(.//*[@data-service='fragile-items'])[3]")).click();
		driver.findElement(By.xpath("(.//*[@data-service='walk-up'])[3]")).click();
		driver.findElement(By.xpath("(.//*[@data-service='disassembly'])[3]")).click();
		//Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,200)", "");
		driver.findElement(By.cssSelector("button[class='booking-step-button pickup-pricing-button js-cart js-submit']")).click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='address_pretty']")));
		driver.findElement(By.cssSelector("input[name='address_pretty']")).sendKeys("123 william street");
		driver.findElement(By.cssSelector("input[name='address_pretty']")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("input[name='address_pretty']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//driver.findElement(By.cssSelector("a[class='ui-datepicker-next ui-corner-all']")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='ui-state-default'])[31]")));
		driver.findElement(By.xpath("(.//*[@class='ui-state-default'])[31]")).click();
		driver.findElement(By.xpath("(.//*[@class='day-card-timeslot'])[8]")).click();
		driver.findElement(By.cssSelector("button[class='button booking-apt-button']")).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(.//*[@class='makespace-ui-library-1tcgbah css-nj7v3y2'])[1]")));
		driver.findElement(By.xpath("(.//*[@class='makespace-ui-library-1tcgbah css-nj7v3y2'])[1]")).sendKeys("Tester one");
		long phonenum = (long)(Math.random() * ((9999999999L - 1000000000) + 1)) + 1000000000;
		String sPhonenum = Long.toString(phonenum);
		driver.findElement(By.xpath("(.//*[@class='makespace-ui-library-1tcgbah css-nj7v3y2'])[2]")).sendKeys(sPhonenum);
		driver.findElement(By.cssSelector("span[class='makespace-ui-library-io1oly css-fn76al0']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='makespace-ui-library-1akkiyt css-1bp8ty00']")));
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='makespace-ui-library-1akkiyt css-1bp8ty00']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-cc-number")));
		driver.findElement(By.id("js-cc-number")).sendKeys("4242424242424242");
		driver.findElement(By.id("js-cc-exp-date")).sendKeys("12/22");
		driver.findElement(By.id("js-cc-cvc")).sendKeys("123");
		driver.findElement(By.id("js-cc-name")).sendKeys("Tester one");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='ms-radio-circle flex']")));
		driver.findElement(By.cssSelector("div[class='ms-radio-circle flex']")).click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='button booking-step-button booking-billing-button js-submit-button']")));
		driver.findElement(By.cssSelector("input[class='button booking-step-button booking-billing-button js-submit-button']")).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("phone")));
		driver.findElement(By.name("phone")).sendKeys(sPhonenum);
		driver.findElement(By.name("email")).sendKeys(sPhonenum);
		driver.findElement(By.name("email")).sendKeys("@gmail.com");
		driver.findElement(By.xpath("(.//*[@class='ms-radio-circle flex'])[2]")).click();
		driver.findElement(By.xpath("(.//*[@class='ms-radio-circle flex'])[3]")).click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='button ms-button booking-review-button js-submit-button']")));
		driver.findElement(By.cssSelector("input[class='button ms-button booking-review-button js-submit-button']")).click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='button booking-inventory-button radius js-submit']")));
		Assert.assertEquals(driver.findElement(By.cssSelector("h4[class='light-header--blue']")).getText(), "Your appointment for February 1, from 12pm-3pm is confirmed!");
		driver.findElement(By.cssSelector("button[class='button booking-inventory-button radius js-submit']")).click();
	}
}
