package com.SpringBoot.ZonionApplication.model;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
	    private String menu;
	    private Timestamp updatedts;
	    
	    
		public Restaurant() {
			super();
			// TODO Auto-generated constructor stub
		}

	  
		public Restaurant(int id, String name, String address, String opentime, String closetime, String phnno,
				String menu, Timestamp updatedts) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.opentime = opentime;
			this.closetime = closetime;
			Phnno = phnno;
			this.menu = menu;
			this.updatedts = updatedts;
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


		public String getMenu() {
			return menu;
		}


		public void setMenu(String menu) {
			this.menu = menu;
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
					+ ", closetime=" + closetime + ", Phnno=" + Phnno + ", menu=" + menu + ", updatedts=" + updatedts
					+ "]";
		}
	
	  
}
