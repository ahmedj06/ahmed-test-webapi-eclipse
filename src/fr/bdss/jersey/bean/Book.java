package fr.bdss.jersey.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Book")
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String title;
	private String author;
	private String date;
	private String ISBN;
	private String publisher;
	
	public Book(){} 
    
	public Book(String title, String author, String date, String ISBN, String publisher){  
		this.title = title; 
		this.author = author; 
		this.date = date;
		this.ISBN = ISBN; 
		this.publisher = publisher;
	}  
	   
	public String getTitle() {
		return title;
	}
	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	@XmlElement
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	@XmlElement
	public void setDate(String date) {
		this.date = date;
	}
	public String getISBN() {
		return ISBN;
	}
	@XmlElement
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getPublisher() {
		return publisher;
	}
	@XmlElement
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
