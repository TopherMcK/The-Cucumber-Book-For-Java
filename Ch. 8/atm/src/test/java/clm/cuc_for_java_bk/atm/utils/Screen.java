package clm.cuc_for_java_bk.atm.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import cucumber.api.Scenario;

public class Screen
{
	public final static Logger LOG = LogManager.getLogger(Screen.class);
	
	public void screenshot(WebDriver webDriver, Scenario scenario)
	{
		try
		{
		TakesScreenshot takeScreenshot = (TakesScreenshot) webDriver;
		File source = takeScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("screenshots/" + scenario.getName() + "ss.png"));
		LOG.info("++ Screenshot Successful");
		} catch (IOException e)
		{
			LOG.error("-- Snapshot Error : " + e.getMessage());
		}
	}
}
