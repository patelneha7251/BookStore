package com.BookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MyBooks")
public class MyBookList {
	@Id
private int id;
private String name;
private String author;
private String price;
public MyBookList(int id, String name, String author, String price) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
	this.price = price;
}
public MyBookList() {
	super();
	// TODO Auto-generated constructor stub
}


}
