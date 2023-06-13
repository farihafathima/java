package cgg.labdateproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PurchaseDate {
	

	public static void main(String[] args) {
		
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the details\n1.Product Name\n2.Product purchase date in dd/mm/yyyy\n3.expire months\n4.expire years");
	String prodname = null,purchaseDate = null;
	int expireMonth = 0,expireYear = 0;
	
	try {
		prodname=bf.readLine();
		purchaseDate=bf.readLine();
		expireMonth=Integer.parseInt(bf.readLine());
		expireYear=Integer.parseInt(bf.readLine());
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Product product = new Product(prodname,purchaseDate,expireMonth,expireYear);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate date=LocalDate.parse(product.getPurchaseDate(),formatter);
	System.out.println("Expire Date after the  "+product.getExpireMonths()+"months : "+date.plusMonths(product.getExpireMonths()));
	System.out.println("Expire Date after the  "+product.getExpireYears()+"years : "+date.plusYears(product.getExpireMonths()));
	

	}

}
