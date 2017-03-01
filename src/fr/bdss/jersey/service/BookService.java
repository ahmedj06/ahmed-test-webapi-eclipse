package fr.bdss.jersey.service;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import fr.bdss.jersey.bean.Book;
import fr.bdss.jersey.method.BookMethod;

@Path("/")
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class BookService {
	
	BookMethod bookMethod = new BookMethod();
	
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMethod() {
        return "Hello world !";
    }
	
	@POST
    @Consumes(MediaType.TEXT_PLAIN)
    public String postMethod(String content) {
        return "Received : " + content;
    }
	
	@POST
	@Path("/books")
    public List<Book> postBook(Book book) {
		BookMethod.addBook(book);
		System.out.println(BookMethod.getAllBooks().size());
		return BookMethod.getAllBooks();
    }
	
	@DELETE
	@Path("/books/{title}")
    public List<Book> removeBook(@PathParam("title") String title) {
		List<Book> bookList = BookMethod.getAllBooks();
		int index = 1;
		for (Book book: bookList){
			if (book.getTitle().equals(title)){
				System.out.println("index : "+ index + "getTitle : " + book.getTitle() + 
						"title : " + title);
				BookMethod.removeBook(book);
			}
			index++;
		}
		
		System.out.println(BookMethod.getAllBooks().size());
		return BookMethod.getAllBooks();
    }
	
	@GET
	@Path("/books")
	public List<Book> getBooks() throws Exception{
		return BookMethod.getAllBooks(); 
	}
	
	@GET
	@Path("/books/{title}")
	public List<Book> getBooksByTitle(@PathParam("title") String title) throws Exception{
		return BookMethod.getBooksByTitle(title); 
	}


}
