package lab2;
import java.util.*;
class Person{
	String name;
	float age;
	Person(String name, float age) {
		this.name = name;
		this.age = age;
	}
	String getName() {
		return(name);
	}
	float getAge() {
		return(age);
	}
	void setName(String name) {
		name=this.name;
	}
	void setAge(float age) {
		age=this.age;
	}
	
}
abstract class AccountDetails {
	long accNO;
	double balance;
	Person accHolder;
	
	public AccountDetails(long accNO, double balance, Person accHolder) {
		super();
		this.accNO = accNO;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	@Override
	public String toString() {
		return "AccountDetails [accNO=" + accNO + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

	abstract void withdraw(double balance1);
	void deposite(double d) {
		balance=balance+d;
	}
	double getBalance() {
		return(balance);
	}
}
class Account5 extends AccountDetails{

	public Account5(long accNO, double balance, Person accHolder) {
		super(accNO, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double balance1) {
		if(balance>balance1 && balance-balance1>500) {
			balance=balance-balance1;}
			else {
				System.out.println("balance insufficient");
			}
		
		
	}
	
}
class SavingsAccount extends AccountDetails{
	
	public SavingsAccount(long accNO, double balance, Person accHolder) {
		super(accNO, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	final double minimumBalance=500;
	
	void withdraw(double balance1) {
		if(balance-balance1>minimumBalance) {
			balance=balance-balance1;
		}
		else {
			System.out.println("balance exceeding the limit of minimun balance");
		}
	}}
class CurrentAccount extends AccountDetails{
	public CurrentAccount(long accNO, double balance, Person accHolder) {
		super(accNO, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	boolean overdraft;
	void withdraw(double balance1) {
		if(balance1>balance) {
			overdraft=true;
		}
		if(overdraft) {
			System.out.println("overdraft occurs....");
		}
	
}}
	
public class Maintenance1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Person smith=new Person("smith",24);
		Person kathy=new Person("kathy",24);
		AccountDetails smith1=new SavingsAccount(12345678,2000,smith);
		AccountDetails kathy1=new CurrentAccount(12345679,3000,kathy);
		smith1.withdraw(1700);
		smith1.deposite(2000.0);
		kathy1.withdraw(3500.0);
		
		
		System.out.println("Remaining Balance "+smith1.getBalance());
		System.out.println("Remaining Balance "+kathy1.getBalance());
	}

}

