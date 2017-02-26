package fr.bdss.jersey.service;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import fr.bdss.jersey.bean.Book;
import fr.bdss.jersey.method.BookMethod;

@Path("/") 
public class BookService {
	BookMethod bookMethod = new BookMethod();
	@GET 
	@Path("/books") 
	@Produces(MediaType.APPLICATION_XML)
	public List<Book> getBooks(){ 
		return bookMethod.getAllBooks();
	}  

}
