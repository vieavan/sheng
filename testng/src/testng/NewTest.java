package testng;

import org.apache.log4j.or.ThreadGroupRenderer;
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


public class NewTest {
	public WebDriver d;
	public WebElement s;
	
	@DataProvider
	public Object[][] newname(){
			return new Object[][]{
					{"������","longat","1111111","1111111","15911077226","������","111111","178@qq.com"},
			};			
	}
  @Test(dataProvider="newname")
  public void f(String ming,String zh,String ma,String mma,String sj,String dz,String yb,String qq) throws InterruptedException {
     Thread.sleep(1000);
	  d.findElement(By.name("memberName")).sendKeys(ming);
	  Thread.sleep(1000);
	  d.findElement(By.name("loginName")).sendKeys(zh);
	  Thread.sleep(1000);
	  d.findElement(By.name("loginPwd")).sendKeys(ma);
	  Thread.sleep(1000);
	  d.findElement(By.name("reLoginPwd")).sendKeys(mma);
	  Thread.sleep(1000);
	  d.findElement(By.name("phone")).sendKeys(sj);
	  Thread.sleep(1000);
	  d.findElement(By.name("address")).sendKeys(dz);
	  Thread.sleep(1000);
	  d.findElement(By.name("zip")).sendKeys(yb);
	  Thread.sleep(1000);
	  d.findElement(By.name("email")).sendKeys(qq);
	  Thread.sleep(1000);
	  d.findElement(By.xpath(".//input[@value='ע��']")).click();
  }
//	    String xinxi = d.findElement(By.className("blueText")).getText();//����λ���ı���ֵ��xinxi
//	    System.out.println(xinxi);
//	    Assert.assertEquals(xinxi,"��ȫ�˳�");

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BM");
	  
			  d= new FirefoxDriver();
	          d.get("http://localhost:8080/test/reg.jsp");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AM");
	  d.quit();
  }

//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BC");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AC");
  }

}
