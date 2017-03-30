xpackage automationFramework;
 
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class FileUpload {
 
public static void main(String[] args) throws InterruptedException, IOException {
 // TODO Auto-generated method stub
 System.setProperty("webdriver.gecko.driver", "C:\\\\YourPath\\geckodriver.exe");
  
 // Create a new instance of the Firefox driver
 WebDriver driver = new FirefoxDriver();
  
 // Help to not always rely on sleep function to wait
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
  
 //Launch the Qlik Cloud Log In
 driver.get("https://qlikid.qlik.com/cloud");
  
 //Make sure the text box is clear and type account username
 driver.findElement(By.id("MemberLoginForm_LoginForm_QUsername")).clear();
 driver.findElement(By.id("MemberLoginForm_LoginForm_QUsername")).sendKeys("john.doe");
  
 //Make sure the text box is clear and type account password
 driver.findElement(By.id("MemberLoginForm_LoginForm_qPassword")).clear();
 driver.findElement(By.id("MemberLoginForm_LoginForm_qPassword")).sendKeys("123456");
  
 //Submit Username and Password
 driver.findElement(By.cssSelector("input.qlik-submit")).click();
  
 //Wait for 5 Sec
 Thread.sleep(5000);
  
 //Sometimes sent to Qlik.com, so make sure we're in Qlik Cloud
 driver.get("https://us.qlikcloud.com/hub/personal");
  
 //Wait for 5 Sec
 Thread.sleep(5000);
  
 //Go to Workspace
 driver.get("https://us.qlikcloud.com/hub/groups/myWorkSpaceID");
  
 //Click Import Data Button
 driver.findElement(By.id("import-data")).click();
  
 //Click Upload Button
 driver.findElement(By.id("uploadTrigger")).click();
  
 //Run AutoIT script to select files from File Upload Window
 Runtime.getRuntime().exec("C:/MyPath/AutoItScript.exe");
  
 //Wait for 30 Sec
 Thread.sleep(30000);
  
 //Click Upload Finished
 driver.findElement(By.id("done-upload-file")).click();
  
 //Log out
 driver.get("https://us.qlikcloud.com/logout");
 
 //Wait for 5 Sec
 //Thread.sleep(5000);
  
 // Close the browser window
 driver.quit();
 }
 
}
