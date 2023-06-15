package com.withoutDB.Entity;

import java.util.Comparator;

public class Friend implements Comparable<Friend>{
	private Long id;
	private String name;
	private String Address;
	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Friend(Long id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.Address = address;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}

	

	@Override
	public int compareTo(Friend o) {
				return this.id.compareTo(o.id);
	}

	

	
}
