package exception;

class ApplicationException extends Exception {
	private int details;

	public ApplicationException(int details) {
		super();
		this.details = details;
	}

	@Override
	public String toString() {
		return "ApplicationException [details=" + details + "]";
	}
	
}
public class UserException{
	
	public static void main(String args[]) {
		try {
			compute(1);
			compute(20);
		}
		catch(ApplicationException e) {
			System.out.println(e);
		}
	}
	private static void compute(int i)throws ApplicationException{
		
		System.out.println("called compute("+i+")");
		if(i>10) {
			throw new ApplicationException(i);
		}
	
	System.out.println("normal exception");
}
}
