package cgg.labdateproblems;

public class Product {
	
	private String prodName;
	private String purchaseDate;
	private int expireMonths;
	private int expireYears;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String prodName, String purchaseDate, int expireMonths, int expireYears) {
		super();
		this.prodName = prodName;
		this.purchaseDate = purchaseDate;
		this.expireMonths = expireMonths;
		this.expireYears = expireYears;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getExpireMonths() {
		return expireMonths;
	}
	public void setExpireMonths(int expireMonths) {
		this.expireMonths = expireMonths;
	}
	public int getExpireYears() {
		return expireYears;
	}
	public void setExpireYears(int expireYears) {
		this.expireYears = expireYears;
	}
	
	

}
