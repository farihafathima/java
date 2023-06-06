package cgg.hibernate.mapmanytomany;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int projectId;
	private String projectName;
	@ManyToMany
	@JoinTable(name="proj_emp",joinColumns={@JoinColumn(name="eid")},inverseJoinColumns= {@JoinColumn(name="pid")})
	private List<Employee> employee;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int projectId, String projectName,List<Employee> employee) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employee = employee;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	

}
