package debugging;

public class ExceptionalBreakPoint1 {

	public static void main(String[] args) {
		
				int num1=10;
				int num2=0;
				int add=add(num1,num2);
				double divide=divide(num1,num2);
				System.out.println("hello");
				
			}

			private static double divide(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1/num2;
			}

			private static int add(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}


	}
