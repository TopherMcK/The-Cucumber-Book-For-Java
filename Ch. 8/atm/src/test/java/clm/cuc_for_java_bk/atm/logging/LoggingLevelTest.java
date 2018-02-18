package clm.cuc_for_java_bk.atm.logging;

import java.net.MalformedURLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggingLevelTest
{
	private static Logger log = null;
	
	@BeforeClass
	public static void setLogger() throws MalformedURLException
	{
		System.setProperty("log4j.configurationFile", "logging/log4j2.xml");
		log = LogManager.getLogger();
	}
	
	@Test
	public void testLevels()
	{
		log.debug("Debug level logged...");
		log.info("Info level logged...");
		log.warn("Warn level logged...");
		log.error("Error level logged...");
	}
}
