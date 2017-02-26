package fr.bdss.jersey.method;

import java.util.ArrayList;
import java.util.List;

import fr.bdss.jersey.bean.Book;

public class BookMethod {
	
	public List<Book> getAllBooks(){ 
	      
	      List<Book> bookList = null;
	      Book book = new Book("AhmedTest", "TotoAuteur", "28-04-1989", "123456789", "Publisher"); 
	      bookList = new ArrayList<Book>(); 
	      bookList.add(book); 
	      return bookList; 
	   } 

}
