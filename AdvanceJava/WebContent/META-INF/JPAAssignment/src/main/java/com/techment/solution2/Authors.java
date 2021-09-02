package com.techment.solution2;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bookauthor1000")
public class Authors {

	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	Set<Book> book;

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
	
	
}
