package cgg.loggers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ExampleDemo4 {
	
	private static final Logger logger=LoggerFactory.getLogger(ExampleDemo4.class);

	public static void main(String[] args) {
		setTemp(45);
		setTemp(56);
		
	}
	static Integer t;
	static Integer oldt;

	private static void setTemp(int temp) {
		oldt=t;
		t=temp;
		logger.debug("Temperature set to {} . old temperature was {}",t,oldt);
		if(temp>50) {
			logger.info("Temperature has raised to 50 degrees");
		}
		
		
	}

}
