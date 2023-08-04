package cgg.loggers;

import org.apache.log4j.Logger;

public class ExampleDemo2 {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ExampleDemo2.class);
		logger.trace("Trace level message");
		logger.debug("Debug level message");
		logger.info("Info level message");
		logger.warn("Warn level message");
		logger.error("Error level message");

	}

}
