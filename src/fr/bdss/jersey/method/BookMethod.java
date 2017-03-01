package fr.bdss.jersey.method;

import java.util.ArrayList;
import java.util.List;

import fr.bdss.jersey.bean.Book;

public class BookMethod {
	static List<Book> bookList = new ArrayList<Book>();	

		
	public static List<Book> getAllBooks(){
	    return bookList;
	}
	
	public static List<Book> getBooksByTitle(String title){
		List<Book> bookResulList = new ArrayList<Book>();
		for (Book book : bookList){
			if (book.getTitle().equals(title)){
				bookResulList.add(book);
			}
		}
	    return bookResulList;
	}
	
	public static void addBook(Book book){
	    bookList.add(book);
	}
	
	public static void removeBook(Book book){
	    bookList.remove(book);
	}

}
