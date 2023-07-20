package bean;

public class JavaBean {
	
	private String bookId;
	private String bookName;
	private String arthur;
	private String publishedDate;
	
	public void setBookId(String bookId) {
		
		this.bookId = bookId;
	}
	
	public void setBookName(String bookName) {
		
		this.bookName = bookName;
	}
	
	public void setArthur(String arthur) {
		
		this.arthur = arthur;
	}
	
	public void setPublishedDate(String publishedDate) {
		
		this.publishedDate = publishedDate;
	}
	
	public String getBookId() {
		
		return this.bookId;
	}
	
	public String getBookName() {
		
		return this.bookName;
	}
	
	public String getArthur() {
		
		return this.arthur;
	}
	
	public String getPublishedDate() {
		
		return this.publishedDate;
	}
}
