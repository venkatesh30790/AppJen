import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Tets {

	public static void main(String[] args) throws MalformedURLException {
		System.out.println("===========Launching App==================");
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("deviceName","Emula");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("platformVersion","7.1.1");

		
		capabilities.setCapability("appPackage","com.carbookplus");
		capabilities.setCapability("appActivity","com.carbookplus.intro.SplashActivity");
		
		
		AndroidDriver  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}

}
