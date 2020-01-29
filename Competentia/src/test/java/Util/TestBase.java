package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.LoginPage;
import Pages.WelcomePage;

public class TestBase 
{

	
	public static WebDriver driver;
	public static Properties prop;
	
	
	// Class Objects for all pages 
	public LoginPage lp;
	public TestBase tb;
	public WelcomePage wp;
		
	
	public TestBase()
	{
		try
		{
		 prop= new Properties();
		 FileInputStream fis = new FileInputStream("D:\\SeleniumPrac\\Competentia\\src\\test\\java\\Config\\config.properties");
		 prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static WebDriver initializeDriver()
	{
		
	 String browserName=prop.getProperty("browser");
	 System.out.println(browserName);

	if(browserName.equals("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPrac\\Cucumber Parc\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
			//execute in chrome driver
		
	}
	else if (browserName.equals("firefox"))
	{
		 driver= new FirefoxDriver();
		//firefox code
	}
	else if (browserName.equals("IE"))
	{
//		IE code
	}

	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("URL"));
	return driver;
	}
	
	
}
