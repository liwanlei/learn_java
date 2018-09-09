package java20;

import org.apache.log4j.Logger;

public class TestLOg {
	private Logger logger=Logger.getLogger(this.getClass());
	public void testlog() {
		logger.error("this is error log");
		logger.info("this is info log");
		logger.debug("this is debug log");
	}
}
