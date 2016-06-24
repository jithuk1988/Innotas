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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class Defclass {
	
	   public static void main(String[] args)
	   
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
	          user.sendKeys("v5new6");
	      //   WebElement pass=driver.findElement(By.id("ContentPlaceHolder1_txtpassword"));   //Element Id of Password field
	          WebElement pass=driver.findElement(By.name("password"));
	          pass.sendKeys("innotas");
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
	     WebElement txt=new WebElement() {
			
			@Override
			public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void submit() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void sendKeys(CharSequence... arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isSelected() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isDisplayed() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getText() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getTagName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Dimension getSize() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Rectangle getRect() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Point getLocation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getCssValue(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getAttribute(String arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<WebElement> findElements(By arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public WebElement findElement(By arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void click() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
		};
		txt.sendKeys("new");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
	        //  driver.close();
	  
	      }

}

