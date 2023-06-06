package cgg.collections1;
//comparable is used for single sorting logic
//comparator is used when we want to sort on multiple logics
public class Emp implements Comparable<Emp>{
	private String name;
	private String phonenumber;
	private int empid;
	public Emp(String name, String phonenumber, int empid) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", phonenumber=" + phonenumber + ", empid=" + empid + "]";
	}
//	public int compareTo(Emp o) {
//		return this.name.compareTo(o.name);
//	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.empid-o.empid;
	}
}
