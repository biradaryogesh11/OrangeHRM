package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

public class ScreenShot extends TestBase {

	
		
		public static void getScreenshot(String filename)
		{
			String path="C:\\Users\\MANGESH PC\\OrangeHRM\\OrangeHRM\\OrangeHRM\\Screenshot";
			TakesScreenshot ts= (TakesScreenshot)driver;
			File src=ts.getScreenshotAs(null);
			File des= new File(path+filename+".png");
			try {
				FileHandler.copy(src, des);
			} catch (IOException e) {
				logger.info("Please provide correct path");
				e.printStackTrace();
			}
		}

	

}
