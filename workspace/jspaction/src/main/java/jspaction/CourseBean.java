package jspaction;

public final class CourseBean {

	private String course_name;
	private String course_id;
	
	public CourseBean() {
		
		getCourse_name();
	}
	
	// method name have to be similar as the property name
	
	public String getCourse_name() { 
		
		return course_name;
	}
	
	public void setCourse_name(String course_name) {
		
		this.course_name = course_name;
		
		setCourse_id(course_name);
	}
	
	public void setCourse_id(String course_name) {
		
		switch( course_name.toLowerCase() ) {
		
			case "se":
				this.course_id = "IS-501";
			break;
			
			case "ke":
				this.course_id = "IS-601";
			break;
			
			case "bis":
				this.course_id = "IS-701";
			break;
			
			default : 
				this.course_id = "IS-801";
		}
	}
	
	public String getCourse_id() {
		
		return course_id;
	}
}
