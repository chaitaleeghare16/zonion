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
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public Restaurant(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		@Override
		public String toString() {
			return "Restaurant [id=" + id + ", name=" + name + "]";
		}
		public void setName(String name) {
			this.name = name;
		}
		private String name;
	  
}
