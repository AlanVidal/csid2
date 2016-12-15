
public class Book {

	public String bookName;
	public Author auther;
	public int nbrPage;

	public Book(String aBookName, Author aAuther, int aNbrPage){
		this.bookName = aBookName;
		this.auther = aAuther;
		this.nbrPage = aNbrPage;
	

	}
	
	

	public Book() {
		super();
	}



	public void setBookName(String aBookName){
		this.bookName = aBookName;
		
	}
	
	public String getBookName(){
		return this.bookName;
	}

}
