package testng;

import org.databene.benerator.anno.Source;
import org.databene.feed4testng.FeedTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest3 extends FeedTest{
	public WebDriver d;
	public WebElement s;
	

  @Test(dataProvider="feeder")
  @Source("abv.xls")
  public void f(String zh,String mm) throws InterruptedException {
	  Thread.sleep(800);
	  d.findElement(By.id("nickname")).sendKeys(zh);
	  Thread.sleep(800);
	  d.findElement(By.id("password")).sendKeys(mm);
	  Thread.sleep(800);
//	  String xinxi = d.findElement(By.className("redText")).getText();
//	    System.out.println(xinxi);
//	    Assert.assertEquals(xinxi,"¹§Ï²Äú£¬×¢²á³É¹¦£¡");
//	    Thread.sleep(1500);
  }

  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BM");
	  
			  d= new FirefoxDriver();
			  d.get("https://ssl.zc.qq.com/v3/index-chs.html?from=pt");         
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AM");
	  d.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BC");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AC");
	  
	  
//public static void main(String[] args) {
//      NewTest1 d = new NewTest1();
//	  d.dianji();
//	  }

  
  
}
}

