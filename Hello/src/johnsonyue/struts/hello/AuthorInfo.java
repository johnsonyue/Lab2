package johnsonyue.struts.hello;

public class AuthorInfo {
	private String AuthorID;
	private String Name;
	private String Age;
	private String Country;
	
	public String getAuthorID(){
		return AuthorID;
	}
	public void setAuthorID(String AuthorID){
		this.AuthorID=AuthorID;
	}
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getAge(){
		return Age;
	}
	public void setAge(String Age){
		this.Age=Age;
	}
	public String getCountry(){
		return Country;
	}
	public void setCountry(String Country){
		this.Country=Country;
	}
}
