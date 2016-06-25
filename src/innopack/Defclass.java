package innopack;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class Defclass {
	
	   public static void main(String[] args) throws InterruptedException
	   
	   {
	   
		   	
		   	  String FilePath = "f://filepath2.xls";
	          FileInputStream fs = null;
	          String username=null;
	          String password=null;
	          String urladdress=null;
	          String tcid=null;
	          String tcname=null;
	          String fuctionality=null;
	          String priority=null;
	          String author=null;
	          String field=null;
	          try	 
	          {
	        	  fs = new FileInputStream(FilePath);
	          } 
	          catch (FileNotFoundException e) 
	          {
	        	  e.printStackTrace();
	          }
	          try 
	          {
	        	  Workbook wb = Workbook.getWorkbook(fs);
	        	  //Sheet sh = wb.getSheet(0);
	        	  Sheet weburl = wb.getSheet("url");
	        	  urladdress = weburl.getCell(1,0).getContents();
	        	  System.out.println(urladdress);
	        	  Sheet tcdetail = wb.getSheet("TC-Details");
	        	  tcid = tcdetail.getCell(1,0).getContents();
	        	  System.out.println(tcid);
	        	  tcname = tcdetail.getCell(1,1).getContents();
	        	  System.out.println(tcname);
	        	  fuctionality = tcdetail.getCell(1,2).getContents();
	        	  System.out.println(fuctionality);
	        	  author= tcdetail.getCell(1,3).getContents();
	        	  System.out.println(author);
	        	  priority = tcdetail.getCell(1,4).getContents();
	        	  System.out.println(priority);
	        	  field = tcdetail.getCell(1,5).getContents();
	        	  System.out.println(field);
	        	   Sheet fieldvalue = wb.getSheet("Fields-values");
	        	  username=fieldvalue.getCell(0,1).getContents();
	        	  System.out.println(username);
	        	  password=fieldvalue.getCell(1,1).getContents();
	        	  System.out.println(password);
	          } 
	          catch (BiffException e) 
	          {
	        	  e.printStackTrace();
	          }
	          catch (IOException e)
	          {
	        	  e.printStackTrace();
	          }
	      
	       // String Urladd="https://www.sabarimalaaccomodation.com/ver1/generalpubliclogin.aspx";
	          WebDriver driver = new FirefoxDriver();
	          driver.manage().window().maximize();
	          driver.get(urladdress);
	        //  System.out.println(driver.getTitle());
	          
	      //    WebElement user=driver.findElement(By.id("ContentPlaceHolder1_txtusername"));   //Element Id of Username field
	         WebElement user=driver.findElement(By.name("login")); 
	          user.sendKeys(username);
	      //   WebElement pass=driver.findElement(By.id("ContentPlaceHolder1_txtpassword"));   //Element Id of Password field
	          WebElement pass=driver.findElement(By.name("password"));
	          pass.sendKeys(password);
	          long start = System.currentTimeMillis();


	          pass.submit();
	          long finish = System.currentTimeMillis();
	          long totalTime = finish - start; 
	          totalTime=totalTime/1000;
	          System.out.println("Total Time for page load - "+totalTime+" Seconds"); 
	       //   WebDriverWait newwait=new WebDriverWait(driver, 10);
	          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	          WebElement proj=driver.findElement(By.xpath("//a[@href ='home.pa#%5BT5%5D']"));
	     proj.click();
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 //    driver.findElement(By.ByName.name("New")).click();
	    driver.findElement(By.xpath("//span[text()='New' and starts-with(@id,'button')]")).click();
	    
	    driver.findElement(By.xpath("//input[@name='categoryId']")).click();
	    driver.findElement(By.xpath("//li[text()='Aut']")).click();

	  //  To select its option say 'Programmer' you can do
driver.findElement(By.xpath("//input[@name='parentId']")).click();
	    driver.findElement(By.xpath("//li[text()='Sales']")).click();

	  //  To select its option say 'Programmer' you can do

	 
	     driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait newwait=new WebDriverWait(driver, 10);
	    // driver.findElement(By.Xpath("//span[@class='x-btn-icon-el createActionIcon']")).click();
	       //   driver.findElement(By.ByClassName.className("btn btn-cta btn-block")).click();
	          //WebDriverWait newwait=new WebDriverWait(driver, 2);
	        /*  if(driver.getPageSource().contains("WELCOME")&&driver.getPageSource().contains("JITHU") )
	          	{
	        	  	System.out.println("Login Success");
	          	}
	          else
	          	{
	        	  	System.out.println("Login Failed ");
	          	}
	          driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_ImageButton2']")).click();  //Logout
	          System.out.println("Logout Success ");*/
	
		//driver.findElement(By.xpath("//span[@data-qtip='The title of the Project' and text()='Title']")).click();
		//driver.findElement(By.xpath("//span[@data-qtip='The title of the Project' and text()='Title']")).sendKeys(Keys.F2);
	       //  driver.close();

WebElement Title = driver.findElement(By.xpath("//input[@role='textbox' and @maxlength='80']"));
Title.sendKeys("New");
Title.sendKeys(Keys.TAB);
Title.sendKeys(Keys.TAB);
WebElement Owner = driver.findElement(By.xpath("//div[@class='x-trigger-index-0 x-form-trigger x-form-trigger-more x-form-trigger-first']"));
Owner.click();
/*WebElement SearchOwner = driver.findElement(By.xpath("//input[@placeholder='Search by...']"));
SearchOwner.sendKeys("Ebert, Colin");
WebDriverWait wait = new WebDriverWait(driver, 4);
WebElement elementq = wait.equals(arg0)
SearchOwner.sendKeys(Keys.TAB);
WebDriverWait wait1 = new WebDriverWait(driver, 4);
SearchOwner.sendKeys(Keys.TAB);
WebDriverWait wait2 = new WebDriverWait(driver, 4);*/
driver.findElement(By.xpath("//div[text()='Ebert, Colin' and @unselectable='on']")).click();
driver.findElement(By.xpath("//span[text()='Select']")).click();
Owner.sendKeys(Keys.TAB);
Owner.sendKeys(Keys.TAB);
Owner.sendKeys(Keys.ENTER);
WebElement Save=driver.findElement(By.xpath("//span[text()='Save']"));
Save.click();

	      }

}

