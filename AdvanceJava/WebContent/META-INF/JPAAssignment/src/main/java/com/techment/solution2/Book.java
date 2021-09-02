package com.techment.solution2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="book01")
public class Book {

	@Id
	private int isbn;
	private String title;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="bookisbn")
	Authors author;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Authors getAuthors() {
		return author;
	}

	public void setAuthors(Authors author) {
		this.author = author;
	}
	
	
}