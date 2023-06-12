package cgg.hibernate.xmlmapping;

import java.util.List;


public class Department {

		private int id;
		private String name;
		
		private List<Employee1> employee;
		
		
		
		public List<Employee1> getEmployee() {
			return employee;
		}
		public void setEmployee(List<Employee1> employee) {
			this.employee = employee;
		}
		public Department(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Department() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
		
}
