package cgg.comparator;

public class Employee {
	private String name;
	private int id;
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	int compareTo(String a) {
		return 0;
	}
	

}
