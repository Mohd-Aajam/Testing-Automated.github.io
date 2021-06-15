import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class App{

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //window maximize
        
        driver.manage().window().maximize();
        System.out.println("The chrome window is maximized");
        

		 driver.get("https://www.thesparksfoundationsingapore.org/"); 
		 Thread.sleep(5000);
		 System.out.println("Successfully launch on The Sparks Foundation Home Page");
		 
		 //Check the title
		 if(driver.getTitle().contains("The Sparks Foundation"))
			 System.out.println("Page title contains The sparks foundation");
		 else
			 System.out.println("Page title doesn't contains The sparks foundation");
		 Thread.sleep(300);

         //Automatic check 10 Element in page

		 driver.findElement(By.linkText("GRIP (Internship)")).click();
		 Thread.sleep(2000);
		 System.out.println("Successfully click to grip internship");

		 driver.findElement(By.linkText("Why Join Us")).click();
		 Thread.sleep(2000);
		 System.out.println("Successfully click the why join us button");

         driver.findElement(By.linkText("Expert Mentor")).click();
		 Thread.sleep(2000);
		 System.out.println("Successfully click the Expert Mentor button");

		 driver.findElement(By.linkText("Events Volunteer")).click();
		 Thread.sleep(2000);
		 System.out.println("Successfully click the Event Volunteer button");

		 driver.findElement(By.linkText("Management Volunteer")).click();
		 Thread.sleep(2000);
		 System.out.println("Successfully click the Management Volunteer button");
         
		 driver.findElement(By.linkText("Internship Positions")).click();
		 Thread.sleep(2000);
		 System.out.println("Successfully click the Internship Positions button");

         driver.findElement(By.linkText("Brand Ambassador")).click();
		 Thread.sleep(2000);
		 System.out.println("Successfully click the Brand Ambassador");

		 driver.findElement(By.name("Name")).sendKeys("Mohd Aajam");
		 Thread.sleep(2000);
		 System.out.println("automatically entered the name");

		 driver.findElement(By.name("Email")).sendKeys("aazamtagala@gmail.com");
		 Thread.sleep(2000);
		 System.out.println("automatically entered the gmailid");

         driver.findElement(By.linkText("About Us")).click();
		 Thread.sleep(2000);
		 System.out.println("Successfully click the About us dropdown");

         //Automatic Launch 5 pages
		 //Page - 1
		 driver.findElement(By.linkText("Jobs at Tech in Asia Portal")).click();
		 Thread.sleep(5000);
		 System.out.println("Successfully get into the jobs at tech in asia portal");
		 //Page - 2
         driver.findElement(By.linkText("Internships at Internshala")).click();
		 Thread.sleep(5000);
		 System.out.println("Successfully get into the Internships at Internshala page");
		 //Page - 3
         driver.findElement(By.linkText("Code for India")).click();
		 Thread.sleep(5000);
		 System.out.println("Successfully get into the jobs at tech in Code for India  Page");
		 //Page - 4
         driver.findElement(By.linkText("The Sparks Foundation (Global)")).click();
		 Thread.sleep(5000);
		 System.out.println("Successfully get into the Sparks Foundation global page");		 
          //Page - 5
		  driver.findElement(By.linkText("Jobs at Angel.co Portal")).click();
		  Thread.sleep(5000);
		  System.out.println("Successfully get into the jobs at tech in angel.co portal");	
         
         //Close the Chrome browser
		 driver.close();
		 driver.quit();
	}
}
