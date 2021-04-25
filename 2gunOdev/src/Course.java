

public class Course {

		 
	public Course(){
			
		}
		
	public Course(int id ,String courseName , String courseInstructer,String description,String coursePrice) {
		this.id = id;
		this.courseName = courseName;
		this.courseInstructer = courseInstructer;
		this.description = description;
		this.coursePrice = coursePrice;
	
	}
	//ilk adým sayfaya bakým classlarý belirleyip gerekli açýklamalar yapýldý.
	int id;
	String courseName;
	String courseInstructer;
	String description;
	String coursePrice;
}




