package cgg.sma.model;

public class Student {
	private int StudentId;
	private String Name;
	private  String phone;
	private String city;
	
	public Student(int studentId, String sName, String phone, String city) {
		super();
		StudentId = studentId;
		this.Name = sName;
		this.phone = phone;
		this.city = city;
	}
	public Student(String sName, String phone, String city) {
		super();
		this.Name = sName;
		this.phone = phone;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getName() {
		return Name;
	}
	public void setsName(String sName) {
		this.Name = sName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", sName=" + Name + ", phone=" + phone + ", city=" + city + "]";
	}
	

}
