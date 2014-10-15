package johnsonyue.struts.hello;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {
	
	public static Connection getConnection(){
		Connection con=null;
		String user="root";
		String password="";
		String url="jdbc:mysql://localhost/BookDB";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void deleteItems(String ISBN){
			Connection con=getConnection();
		try{
			String sql="delete from book where ISBN="+ISBN;
			PreparedStatement ps=con.prepareStatement(sql);
			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void insertItem(BookInfo book){
		Connection con=getConnection();
		String sql1="select * from book where ISBN="+book.ISBN;
		try{
			PreparedStatement ps1=con.prepareStatement(sql1);
			ResultSet rs1=ps1.executeQuery();
			if(rs1.next()!=false){
				String sql2="update book set ISBN="+book.ISBN+",Title='"+book.Title+"',AuthorID='"+book.AuthorID+"',Publisher='"+book.Publisher+"',PublishDate='"+book.PublishDate+"',Price='"+book.Price+"' where ISBN="+book.ISBN;
				System.out.println(sql2);
				PreparedStatement ps2=con.prepareStatement(sql2);
				ps2.execute();
			}
			else{
				String sql="insert into book value('"+book.ISBN+"','"+book.Title+"','"+book.AuthorID+"','"+book.Publisher+"','"+book.PublishDate+"','"+book.Price+"')";
				System.out.println(sql);
				PreparedStatement ps=con.prepareStatement(sql);
				ps.execute();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void insertAuthor(AuthorInfo authorinfo){
		Connection con=getConnection();
		String sql1="select * from book where AuthorID="+authorinfo.getAuthorID();
		try{
			PreparedStatement ps1=con.prepareStatement(sql1);
			ResultSet rs1=ps1.executeQuery();
			if(rs1.next()!=false){
				String sql2="update author set Name='"+authorinfo.getName()+"',Age='"+authorinfo.getAge()+"',Country='"+authorinfo.getCountry()+"' where AuthorID="+authorinfo.getAuthorID();
				System.out.println(sql2);
				PreparedStatement ps2=con.prepareStatement(sql2);
				ps2.execute();
			}
			else{
				String sql="insert into author value('"+authorinfo.getAuthorID()+"','"+authorinfo.getName()+"','"+authorinfo.getAge()+"','"+authorinfo.getCountry()+"')";
				System.out.println(sql);
				PreparedStatement ps=con.prepareStatement(sql);
				ps.execute();
			}
		}catch(Exception e){
			e.printStackTrace();
		}	
	}
	
	public static BookInfo getItem(String ISBN){
		Connection con=getConnection();
		BookInfo book=new BookInfo();
		String sql="select * from book where ISBN="+ISBN;
		System.out.println(sql);
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			book.setISBN(rs.getString(1));
			book.setTitle(rs.getString(2));
			book.setAuthorID(rs.getString(3));
			book.setPublisher(rs.getString(4));
			book.setPublishDate(rs.getString(5));
			book.setPrice(rs.getString(6));
		}catch(Exception e){
			e.printStackTrace();
		}
		return book;
	}
	
	public static ArrayList<BookInfo> getItems(String Name){
		Connection con=getConnection();
		ArrayList<BookInfo> items=new ArrayList<BookInfo>();
		
		try{
			
			String sql="select * from author where Name=\""+Name+"\"";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next()==false){
				return null;
			}
			String sql1="select * from book where AuthorID="+rs.getString(1);
			PreparedStatement ps1=con.prepareStatement(sql1);
			ResultSet rs1=ps1.executeQuery();
			
			while(rs1.next()){
				BookInfo t=new BookInfo();
				t.ISBN=rs1.getString(1);
				t.Title=rs1.getString(2);
				t.AuthorID=rs1.getString(3);
				t.Publisher=rs1.getString(4);
				t.PublishDate=rs1.getString(5);
				t.Price=rs1.getString(6);
				items.add(t);
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("mysql error.");
		}
		return items;
	}
	
	public static String getAuthorID(String ISBN){
		Connection con=getConnection();
		String sql="select * from book where ISBN="+ISBN;
		System.out.println(sql);
		String authorID=new String();
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			authorID=rs.getString(3);
		}catch(Exception e){
			e.printStackTrace();
		}
		return authorID;
	}
	
	public static AuthorInfo getAuthor(String AuthorID){
		Connection con=getConnection();
		AuthorInfo author=new AuthorInfo();
		String sql="select * from author where AuthorID="+AuthorID;
		System.out.println(sql);
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			author.setAuthorID(rs.getString(1));
			author.setName(rs.getString(2));
			author.setAge(rs.getString(3));
			author.setCountry(rs.getString(4));
		}catch(Exception e){
			e.printStackTrace();
		}
		return author;
	}
}
