package bean;

public class JavaBean {
	
	private String name;
	private int age;
	private boolean isMarried;
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setAge(int age) {
		
		this.age = age;
	}
	
	public void setIsMarried(boolean isMarried) {
		
		this.isMarried = isMarried;
	}
	
	
	public String getName() {
		
		return this.name;
	}
	
	public int getAge() {
		
		return this.age;
	}
	
	public boolean getIsMarried() {
		
		return this.isMarried;
	}
	
}
