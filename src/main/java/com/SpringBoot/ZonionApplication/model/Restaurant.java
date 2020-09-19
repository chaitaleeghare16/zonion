package com.SpringBoot.ZonionApplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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
	    
	    
	    
		public Restaurant() {
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

		public Restaurant(int id, String name, String address, String opentime, String closetime, String phnno,
				String menu) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.opentime = opentime;
			this.closetime = closetime;
			Phnno = phnno;
			this.menu = menu;
		}

		@Override
		public String toString() {
			return "Restaurant [id=" + id + ", name=" + name + ", address=" + address + ", opentime=" + opentime
					+ ", closetime=" + closetime + ", Phnno=" + Phnno + ", menu=" + menu + "]";
		}
		
		
	    
	    
	  
	  
}
