package com.per;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Srikanth 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String reason;
@Temporal(TemporalType.DATE)
private Date birthDayDate;
@Lob
private byte[] image;


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
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public Date getBirthDayDate() {
	return birthDayDate;
}
public void setBirthDayDate(Date birthDayDate) {
	this.birthDayDate = birthDayDate;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}


}
