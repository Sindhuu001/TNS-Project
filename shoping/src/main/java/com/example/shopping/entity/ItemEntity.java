package com.example.shopping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class ItemEntity {
@Id
long id;
String iname;
double iprice;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getIname() {
	return iname;
}
public void setIname(String iname) {
	this.iname = iname;
}
public double getIprice() {
	return iprice;
}
public void setIprice(double iprice) {
	this.iprice = iprice;
}


}