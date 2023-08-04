package cgg.loggers;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleDemo3 {
	
	private static final Logger logger = LoggerFactory.getLogger(ExampleDemo3.class);
	public static void main(String[] args) {
		
		logger.info("Initialising application");
		ArrayList<String> items = new ArrayList<String>();
		items.add("apple");
		items.add(null);
		items.add("orange");
		processItems(items);
	}
	private static void processItems(ArrayList<String> items) {
		try {
			logger.debug("processing items");
			for(String item:items) {
				if(item==null) {
					logger.warn("Encountered null item lets skip it ....");
				}
				else
				logger.info("Processing item : {}",item);
			}
			logger.debug("item processing completed");
		}catch(Exception e) {
			logger.error("Error processing items :{}",e.getMessage());
		}
		
	}

}
