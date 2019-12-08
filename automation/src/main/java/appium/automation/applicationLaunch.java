package appium.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class applicationLaunch {
	public static AppiumDriverLocalService services;
	public static WebDriver driver;
	public static AppiumDriver ADR;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appPackage","com.flipkart.android");     
	    cap.setCapability("appActivity","com.flipkart.android.activity.HomeFragmentHolderActivity");
	    cap.setCapability("deviceName","Pixel2");
	    
	   // cap.setCapability("deviceName","Pixel 2 API 29");
	    cap.setCapability("platformName","Android");
	    cap.setCapability("FullReset", "true");
	    cap.setCapability("platformVersion","8.0.0");
	    cap.setCapability("udid","emulator-5554");
	    URL url =new URL("http://127.0.0.1:4723/wd/hub");
	    driver = new AndroidDriver<MobileElement>(url,cap);
	    Thread.sleep(2000);
	   // driver.switchTo().alert().dismiss();
	    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[1]")).click();
	    Thread.sleep(2000);	
	    //driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Choose an Account\"]/android.widget.LinearLayout/android.widget.Button")).click();
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("")).click();

	}

}
