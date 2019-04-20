package com.pavan.ds;

import java.util.ArrayList;
import java.util.List;
import com.pavan.ds.Book;

public class BookShop implements Cloneable{

	private List<Book> books = new ArrayList<Book>();
	
	private String shopname;

	public void loadBooks() {
		
		Book b1 = new Book();
		b1.setId("1");
		b1.setName("master of maind");
		
		Book b2 = new Book();
		b2.setId("2");
		b2.setName("wisdome of truth");
		
		Book b3= new Book();
		b3.setId("3");
		b3.setName("rain of truth");
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
	
	}

	
public List<Book> getBooks() {
		

		
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	@Override
	public String toString() {
		return "BookShop [books=" + books + ", shopname=" + shopname + "]";
	}
	
	
	public void remove (String id ) {
		
		books.remove(Integer.parseInt(id));
	}
	
	public BookShop clone() throws CloneNotSupportedException {
		
		return (BookShop)super.clone();
	}
	
}
