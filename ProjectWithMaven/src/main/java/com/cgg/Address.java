package com.cgg;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

@Entity
@Table(name="student_address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressid;
	
	
	@Column(name="STREET",length=50)
	private String street;
	
	@Column(name="CITY",length=100)
	private String city;
	
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Transient
	private double x;
	
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date adddedDate;
	@Type(type="org.hibernate.type.BinaryType")
	private byte[] image;
	
	
	public Address(int addressid, String street, String city, boolean isOpen, double x, Date adddedDate) {
		super();
		this.addressid = addressid;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.adddedDate = adddedDate;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAdddedDate() {
		return adddedDate;
	}
	public void setAdddedDate(Date adddedDate) {
		this.adddedDate = adddedDate;
	}
	
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", adddedDate=" + adddedDate + "]";
	}
	
	
}
