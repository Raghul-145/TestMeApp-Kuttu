package TestMe.TestMeApp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UtilityClass 
{
		static WebDriver driver;
		public static WebDriver getDriver(String browser)
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.05.05\\Desktop\\Rahul\\SeleniumDrivers\\chromedriver.exe");
				driver= new ChromeDriver();
				//driver.get("https://www.google.com/");
			}
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Training_C2a.05.05\\Desktop\\Rahul\\SeleniumDrivers\\geckodriver.exe");
				driver= new FirefoxDriver();
				//driver.get("https://www.google.com/");
			}
			else if(browser.equalsIgnoreCase("internetexplorer"))
			{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\Training_C2a.05.05\\Desktop\\Rahul\\SeleniumDrivers\\IEDriverServer.exe");
				driver= new InternetExplorerDriver();
				//driver.get("https://www.google.com/");
			}
			else
				System.out.println("invalid Browser !!");
			return driver;
		}

	}



