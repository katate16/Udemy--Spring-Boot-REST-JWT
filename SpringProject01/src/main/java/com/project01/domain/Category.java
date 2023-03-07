package com.project01.domain;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String Name;
	
	public Category() {	}

	public Category(Integer id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(Name, other.Name);
	}
	
}
