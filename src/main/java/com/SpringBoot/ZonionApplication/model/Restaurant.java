package com.SpringBoot.ZonionApplication.model;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "RESTAURANT")
public class Restaurant {
	    @Id
	    @GeneratedValue
	    private int id;
	    private String name;
	    private String address;
	    private String opentime;
	    private String closetime;
	    private String Phnno;
	    private String restaurant_img;
	    private String menu_img;
	    
	    @Column(name="updatedts",columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP" ,insertable=false, updatable=false)
	    private Timestamp updatedts;
	    
		public Restaurant() {
			super();
			// TODO Auto-generated constructor stub
		}

	  
		public Restaurant(int id, String name, String address, String opentime, String closetime, String phnno,
				String restaurant_img, Timestamp updatedts,String menu_img) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.opentime = opentime;
			this.closetime = closetime;
			this.Phnno = phnno;
			this.restaurant_img = restaurant_img;
			this.updatedts = updatedts;
			this.menu_img=menu_img;
		}

		
		

		public String getMenu_img() {
			return menu_img;
		}


		public void setMenu_img(String menu_img) {
			System.out.println("Menu Image is :"+menu_img);
			this.menu_img = menu_img;
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


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getOpentime() {
			return opentime;
		}


		public void setOpentime(String opentime) {
			this.opentime = opentime;
		}


		public String getClosetime() {
			return closetime;
		}


		public void setClosetime(String closetime) {
			this.closetime = closetime;
		}


		public String getPhnno() {
			return Phnno;
		}


		public void setPhnno(String phnno) {
			Phnno = phnno;
		}


		public String getRestaurant_img() {
			return restaurant_img;
		}


		public void setRestaurant_img(String restaurant_img) {
			System.out.println("Image is :"+restaurant_img);
			this.restaurant_img = restaurant_img;
		}


		public Timestamp getUpdatedts() {
			return updatedts;
		}


		public void setUpdatedts(Timestamp updatedts) {
			this.updatedts = updatedts;
		}


		@Override
		public String toString() {
			return "Restaurant [id=" + id + ", name=" + name + ", address=" + address + ", opentime=" + opentime
					+ ", closetime=" + closetime + ", Phnno=" + Phnno + ", restaurant_img=" + restaurant_img
					+ ", menu_img=" + menu_img + ", updatedts=" + updatedts + "]";
		}


		
	  
}
