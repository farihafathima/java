package cgg.loggers;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleDemo1 {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ExampleDemo1.class.getName());
		logger.setLevel(Level.INFO);
		logger.log(Level.INFO,"This is an info message");
		logger.log(Level.FINE,"This is a Warning message");
		logger.log(Level.SEVERE,"This is a severe Message");

	}

}
