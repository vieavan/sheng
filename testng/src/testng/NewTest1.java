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

public class NewTest1 extends FeedTest{
	public WebDriver d;
	public WebElement s;
	
//	@DataProvider
//	public Object[][] newname(){
//			return new Object[][]{
//					{"爱卧的","dfdfdh","1234567","1234567","15911077226","北京市","101402","178@qq.com"},
//					{"沃妮是","fgfdhh","1234567","1234567","13121241356","怀柔区","552669","178@qq.com"},
//					{"呢马我","yufido","1234567","1234567","18866542584","雁西湖","887221","178@qq.com"},
//			};	
//	}

	
  @Test(dataProvider="feeder")
  @Source("dsb.xls")
  public void f(String xm,String zh,String mm,String hd,String dh,String dz,String yb,String yx) throws InterruptedException {
	  Thread.sleep(800);
	  d.findElement(By.name("btn")).click();
	  Thread.sleep(800);
	  d.findElement(By.name("memberName")).sendKeys(xm);
	  Thread.sleep(800);
	  d.findElement(By.name("loginName")).sendKeys(zh);
	  Thread.sleep(800);
	  d.findElement(By.name("loginPwd")).sendKeys(mm);
	  Thread.sleep(800);
	  d.findElement(By.id("reLoginPwd")).sendKeys(hd);
	  Thread.sleep(800);
	  d.findElement(By.xpath(".//*[contains(@name,'phone')]")).sendKeys(dh);
	  Thread.sleep(800);
	  d.findElement(By.xpath(".//*[contains(@name,'address')]")).sendKeys(dz);
	  Thread.sleep(800);
	  d.findElement(By.xpath(".//*[contains(@name,'zip')]")).sendKeys(yb);
	  Thread.sleep(800);
	  d.findElement(By.xpath(".//*[contains(@name,'email')]")).sendKeys(yx);
	  Thread.sleep(800);
	  d.findElement(By.xpath(".//input[@value='注册']")).click();
	  Thread.sleep(2000);
	  String xinxi = d.findElement(By.className("redText")).getText();
	    System.out.println(xinxi);
	    Assert.assertEquals(xinxi,"恭喜您，注册成功！");
	    Thread.sleep(1500);
  }

  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BM");
	  
			  d= new FirefoxDriver();
			  d.get("http://localhost:8080/test/mer.do?method=browseIndexMer");
	          
	         
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
