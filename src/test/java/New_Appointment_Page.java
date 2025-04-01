
//
//import Initilaizer.login_the_page;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.List;
//import java.util.Random;
//
//import static Initilaizer.login_the_page.driver;
//
public class New_Appointment_Page {
//
//  static  Actions action = new Actions(driver);
//
//    static   JavascriptExecutor js = (JavascriptExecutor) driver;
//
//
//
//public  static void dashboard_Plusicon() throws InterruptedException {
//    PageFactory.initElements(driver, New_Appointment_Page_Object.class);
//    New_Appointment_Page_Object.plusicon.click();
//    Thread.sleep(1000);
//    action.moveToElement(New_Appointment_Page_Object.appointmentbtn).click(New_Appointment_Page_Object.appointmentbtn).build()
//            .perform();
//    Thread.sleep(2000);
//}
//
//public static void New_Appointment_Form() throws InterruptedException, AWTException {
//    PageFactory.initElements(driver, New_Appointment_Page_Object.class);
//       boolean radiobtn = New_Appointment_Page_Object.prvateradiobtn.isEnabled();
//           Assert.assertTrue(New_Appointment_Page_Object.prvateradiobtn.isEnabled(), "Private checkbox is enabled!");
//        if(radiobtn) {
//            System.out.println("Private radio button is enabled");
//            New_Appointment_Page_Object.prvateradiobtn.click();
//        }else {
//            System.out.println("Private radio button is  Disable.");
//            Assert.assertTrue(false);
//        }
//           New_Appointment_Page_Object.confirmedRadiobtn.click();
//
//    New_Appointment_Page_Object.prvateradiobtn.click();
//    if( New_Appointment_Page_Object.jobsearchbox.isEnabled()) {
//        New_Appointment_Page_Object.jobsearchbox.sendKeys("Valuesss");
//    }else {
//        System.out.println("======> Job Search Box is not Enable");
//    }
//        New_Appointment_Page_Object.companyName.sendKeys("Bmmatrix");
//        New_Appointment_Page_Object.firstName.sendKeys("VENKAT BABU");
//        New_Appointment_Page_Object.lastName.sendKeys("TestAppointment");
//        New_Appointment_Page_Object. address1.sendKeys("TestAddress1");
//        New_Appointment_Page_Object. address2.sendKeys("TestAddress2");
//        New_Appointment_Page_Object. townCity.sendKeys("CHENNAI");
//        New_Appointment_Page_Object.selectState.click();
//         Thread.sleep(2000);
//        List<WebElement> StateList  = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
//        Thread.sleep(2000);
//        System.out.println("StateList" + StateList.size());
//
//        Random random = new Random();
//        int randomInt = random.nextInt(StateList.size());
//        StateList.get(randomInt).click();
//
//        New_Appointment_Page_Object.job_zipcodepostcode.sendKeys("600019");
//        New_Appointment_Page_Object.phone.sendKeys("7684376687");
//        New_Appointment_Page_Object.mobile.sendKeys("7684376687");
//        New_Appointment_Page_Object.email.sendKeys("teststdt@gmail.com");
//        New_Appointment_Page_Object .selectRole.click();
//
//        Robot robot = new Robot();
//        Thread.sleep(2000);
//            robot.keyPress(KeyEvent.VK_DOWN);
//            robot.keyRelease(KeyEvent.VK_DOWN);
//            robot.keyPress(KeyEvent.VK_DOWN);
//            robot.keyRelease(KeyEvent.VK_DOWN);
//            Thread.sleep(500);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//
//        New_Appointment_Page_Object .customerRef.sendKeys("108453CF");
//        New_Appointment_Page_Object.additionalRef.sendKeys("857695ARF");
//        New_Appointment_Page_Object.statusNotes.sendKeys("Testing Notes");
//        New_Appointment_Page_Object.dateTime3.click();
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");
//        String formattedDateTime = now.format(formater);
//        New_Appointment_Page_Object.dateTime3.sendKeys(formattedDateTime);
//
//        New_Appointment_Page_Object.date3.click();
//        Thread.sleep(3000);
//        New_Appointment_Page_Object.date3.clear();
//        New_Appointment_Page_Object.date3.sendKeys(formattedDateTime);
//
//    }
//
//    public static void appointment_Type_Allocation() throws InterruptedException {
//        Thread.sleep(4000);
//        New_Appointment_Page_Object.appointmentType.click();
//        Thread.sleep(3000);
//        List<WebElement> appointmentTypelist = driver.findElements(By.xpath("//span[@class='mat-option-text']"));
//        Thread.sleep(2000);
//        System.out.println(appointmentTypelist.size()-1);
//        for(int i=0;i<=appointmentTypelist.size()-1;i++) {
//            appointmentTypelist.get(i).click();
//            Thread.sleep(2000);
//            New_Appointment_Page_Object.staff.click();
//            Thread.sleep(2000);
//            List<WebElement> stafflist = driver.findElements(By.xpath("(//*[@class='dropdown-list'])[2]/ul[2]/li"));
//            Thread.sleep(2000);
//            System.out.println("Stafflist  Count == " + stafflist.size());
//            Thread.sleep(2000);
//            New_Appointment_Page_Object.appointmentType.click();
//            Thread.sleep(2000);
//
//        }
//        action.moveToElement(New_Appointment_Page_Object.headingCheck).click().build().perform();
//
//            try{
//                Thread.sleep(4000);
//                New_Appointment_Page_Object.staff.click();
//                Thread.sleep(4000);
//               Select sc = new Select(New_Appointment_Page_Object.singleselect);
//                sc.selectByVisibleText("Pruthvi");
//                Thread.sleep(3000);
//            }catch(Exception Mulityseclect){
//                    Thread.sleep(4000);
//                    action.moveToElement(New_Appointment_Page_Object.headingCheck).click().build().perform();
//                    Thread.sleep(4000);
//                    New_Appointment_Page_Object.staff.click();
//                    New_Appointment_Page_Object.staffselectall.click();
//                }
//            Thread.sleep(1000);
//        New_Appointment_Page_Object.jobsearchbox.click();
//        New_Appointment_Page_Object.jobDescription.click();
//        New_Appointment_Page_Object.jobDescription.sendKeys("testing process");
//
    }
//
//
//    
//    public static void dateadd() throws InterruptedException {
//        js.executeScript("arguments[0].scrollIntoView(true);", New_Appointment_Page_Object.selectDateicon);
//        New_Appointment_Page_Object.startDate_input.click();
//        String startdate = New_Appointment_Page_Object.startDate_input.getAttribute("value");
//        System.out.println("startdate ==== " + startdate);
//        String   valuee="";    
//        
//        try{
//            Thread.sleep(4000);
//            New_Appointment_Page_Object.jobsearchbox.click();
//            Thread.sleep(4000);
//             valuee = New_Appointment_Page_Object.appointmentSeductDate.getText();
//            System.out.println(valuee);
//            Thread.sleep(4000);
//            New_Appointment_Page_Object.startDate_input.click();
//            LocalDate currentDate = LocalDate.now();
//          LocalDate nextDate = currentDate.plusDays(2);
//          DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//          String    NextDateformatted = nextDate.format(formatterr);
//          System.out.println("  NextDateformatted == : " + NextDateformatted);
//          js.executeScript("arguments[0].value='"+NextDateformatted+"';", New_Appointment_Page_Object.startDate_input);
//          Thread.sleep(4000);
//          System.out.println("ENDDDDDDDDDDDDD====>");
//          action.moveToElement(New_Appointment_Page_Object.headingCheck).click().build().perform();
//    
//        } catch (Exception e) {
//        	
//            js.executeScript("arguments[0].value='" + startdate + "';", New_Appointment_Page_Object.startDate_input);
//            System.out.println("=====================>");
//    
//        }
//        }
//    
//    
//    
//    
//    
//    
//
//    
//    public static void name() {
//		
//    	  js.executeScript("arguments[0].scrollIntoView(true);", New_Appointment_Page_Object.selectDateicon);
//          New_Appointment_Page_Object.startDate_input.click();
//          String startdate = New_Appointment_Page_Object.startDate_input.getAttribute("value");
//          System.out.println("startdate ==== " + startdate);
//          String   valuee="";    
//          
//          int maxAttempts = 5; // Maximum retry attempts
//          int attempt = 0; // Attempt counter
//
//          while (attempt < maxAttempts) {
//              try {
//                  Thread.sleep(4000);
//                  New_Appointment_Page_Object.jobsearchbox.click();
//                  Thread.sleep(4000);
//                  
//                  valuee = New_Appointment_Page_Object.appointmentSeductDate.getText();
//                  
//                  if (valuee != null && !valuee.trim().isEmpty()) { // Check if valuee contains valid content
//                      System.out.println("Retrieved value: " + valuee);
//                      break; // Exit loop if valuee is retrieved successfully
//                  } 
//                  
//                  System.out.println("Retry attempt: " + (attempt + 1)); // Debugging
//                  
//              } catch (Exception e) {
//                  System.out.println("Exception occurred: " + e.getMessage());
//              }   
//              attempt++; // Increase attempt count
//          }
//          if (valuee == null || valuee.trim().isEmpty()) {
//              System.out.println("Failed to retrieve valuee after " + maxAttempts + " attempts.");
//          } else {
//              try {
//                  Thread.sleep(4000);
//                  New_Appointment_Page_Object.startDate_input.click();
//                  LocalDate currentDate = LocalDate.now();
//                  LocalDate nextDate = currentDate.plusDays(2);
//                  DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//                  String NextDateformatted = nextDate.format(formatterr);
//                  System.out.println("NextDateformatted == : " + NextDateformatted);
//                  js.executeScript("arguments[0].value='" + NextDateformatted + "';", New_Appointment_Page_Object.startDate_input);
//                  Thread.sleep(4000);
//                  System.out.println("ENDDDDDDDDDDDDD====>");
//                  action.moveToElement(New_Appointment_Page_Object.headingCheck).click().build().perform();
//              
//              } catch (Exception e) {
//                  js.executeScript("arguments[0].value='" + startdate + "';", New_Appointment_Page_Object.startDate_input);
//                  System.out.println("=====================>");
//              }
//          }
//
//    	
//	}
//    
//    
//    }