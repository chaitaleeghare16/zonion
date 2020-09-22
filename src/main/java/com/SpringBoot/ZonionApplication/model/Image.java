package com.SpringBoot.ZonionApplication.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name="image_table")

public class Image {
	
	 @Id									//create id as primary key
	 @GeneratedValue                    //set auto increment value to primary key id	
private int id;
private 	String name;
private String type;
private byte[] picByte;

public Image(String name, String type, byte[] picByte) {
	super();
	
	this.name = name;
	this.type = type;
	this.picByte = picByte;
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
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public byte[] getPicByte() {
	return picByte;
}
public void setPicByte(byte[] picByte) {
	this.picByte = picByte;
}
public Image() {
	super();
	
}
@Override
public String toString() {
	return "Image [id=" + id + ", name=" + name + ", type=" + type + ", picByte=" + Arrays.toString(picByte) + "]";
}







}
