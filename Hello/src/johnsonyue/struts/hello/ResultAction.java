package johnsonyue.struts.hello;

import java.util.ArrayList;

public class ResultAction {
	private ArrayList<BookInfo> books;
	private BookInfo book;
	private AuthorInfo authorinfo;
	private String author;
	private String ISBN;
	
	public ArrayList<BookInfo> getBooks(){
		return books;
	}
	public void setBooks(ArrayList<BookInfo> books){
		this.books=books;
	}
	public BookInfo getBook(){
		return book;
	}
	public void setBook(BookInfo book){
		this.book=book;
	}
	public AuthorInfo getAuthorinfo(){
		return authorinfo;
	}
	public void setAuthorinfo(AuthorInfo authorinfo){
		this.authorinfo=authorinfo;
	}
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public String getISBN(){
		return ISBN;
	}
	public void setISBN(String ISBN){
		this.ISBN=ISBN;
	}
	
	public String delete(){
		BookDAO.deleteItems(ISBN);
		return "redirect";
	}
	
	public String store(){
		BookDAO.insertAuthor(authorinfo);
		book.AuthorID=authorinfo.getAuthorID();
		BookDAO.insertItem(book);
		return "redirect";
	}
	
	public String edit(){
		book=BookDAO.getItem(ISBN);
		authorinfo=BookDAO.getAuthor(BookDAO.getAuthorID(ISBN));
		return "redirect";
	}
	
	public String detail(){
		book=BookDAO.getItem(ISBN);
		authorinfo=BookDAO.getAuthor(BookDAO.getAuthorID(ISBN));
		return "success";
	}
	
	public String execute() throws Exception{
		books=BookDAO.getItems(author);
		if(books==null||books.isEmpty()){
			return "empty";
		}
		return "success";
	}
}
