package mynotesapp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NotesTest {
	//declare Selenium WebDriver
	  private WebDriver webDriver;	
  @Test
  public void f() {
	// define the chrome driver
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\chromedriver.exe");

		  // define the drive instance
		  WebDriver driver = new ChromeDriver();
		  //get notes
		  driver.get("http://localhost:9999/mynotesapp/NotesServlet");
			
			 // nagivate the browser to this url
			  
			 
			 // ADD NOTE browser look for link in NotesServlet with text value "Add new note" to get to addNote.jsp
			  driver.findElement(By.linkText("Add New Note")).click();
			  
			 driver.findElement(By.name("title")).sendKeys("testsup");
			 
			 driver.findElement(By.name("note")).sendKeys("testna");
			 
			 driver.findElement(By.id("addNote")).click();
			 // browser look for id in addNote.jsp with "Add new note"
			
//			 driver.findElement(By.xpath("//a[@href='NotesServlet/edit?id=41']")).click();
			 //NotesServlet/edit?id EDIT NOTE
			 driver.get("http://localhost:9999/mynotesapp/NotesServlet");
			 driver.findElement(By.name("edit")).click();
			 driver.findElement(By.name("title")).clear();
			 driver.findElement(By.name("note")).clear();
			 driver.findElement(By.name("title")).sendKeys("cibweibasche");
			 driver.findElement(By.name("note")).sendKeys("icweniwen");
			 driver.findElement(By.id("editNote")).click();
			 
		  
		  //DELETE NOTE
		  //driver.findElement(By.xpath("//a[@href='NotesServlet/delete?id=41']")).click();
			 driver.get("http://localhost:9999/mynotesapp/NotesServlet");
			 driver.findElement(By.name("delete")).click();
//		  
//		  //find input and fill COMMENTED LINE 29 OUT
//		  //driver.findElement(By.linkText("//*[@id=\"title\"]")).sendKeys("Testing Automation"); //xpath not working so try linkText
//		  WebElement title = driver.findElement(By.id("title"));
//		//find input and fill COMMENTED LINE 32 OUT
//		 // driver.findElement(By.linkText("//*[@id=\"note\"]")).sendKeys("Conducting testing automation");
//
//		  // browser look for link with text value "Add new note"
//		  // driver.findElement(By.linkText("Add note")).click(); PREVIOUS CODE
//		  driver.findElement(By.className("btn btn-danger")).click();
//		  String at= driver.getTitle(); //actual title
//		  String et="Testing Automation"; //expected title CHECK THIS HERE, I JUST FOLLOWED THE VIDEO
//		  driver.close();
//		  if(at.equalsIgnoreCase(et)) {
//			  System.out.println("Test SUCCESSFUL");
//		  } //print if test went successfully
//		  else {
//			  System.out.println("Test UNSUCCESSFUL");
//		  } //print if test didnt go well
		  
		  
			/*
			 * //34 to 38 new code WebElement element; //Webdriver driver; WebElement wait =
			 * new WebDriverWait(driver, 100); element=
			 * wait.until(ExpectedConditions.elementToBeClickable(By.id("title")));
			 */
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
