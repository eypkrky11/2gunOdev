

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
	//ilk ad�m sayfaya bak�m classlar� belirleyip gerekli a��klamalar yap�ld�.
	int id;
	String courseName;
	String courseInstructer;
	String description;
	String coursePrice;
}




