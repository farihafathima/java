package cgginterns.hibernate.onetooneprac;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Phone {
	@Id
	private int phoneid;
	private String phonename;
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phone(int phoneid, String phonename) {
		super();
		this.phoneid = phoneid;
		this.phonename = phonename;
	}
	public int getPhoneid() {
		return phoneid;
	}
	public void setPhoneid(int phoneid) {
		this.phoneid = phoneid;
	}
	public String getPhonename() {
		return phonename;
	}
	public void setPhonename(String phonename) {
		this.phonename = phonename;
	}
	
	
	
	

}
