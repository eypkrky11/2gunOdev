public class Main {

	public static void main(String[] args) {
		
		Course cource1 =new Course(
				1,
				"Yazýlým Geliþtirme Yetiþtirme Kampý(C# + ANGULAR )",
				"Engin Demirog",
				"2 Ay sürecek Yazýlým Geliþtirme Yetiþtirme Kampýmýzýn takip , döküman ve duyurularýný buradan yapýlacaktýr.",
				"Ücretsiz");
		
		Course cource2 =new Course(
				2,
				"Yazýlým Geliþtirme Yetiþtirme Kampý(JAVA + REACT )",
				"Engin Demirog",
				"2 Ay sürecek Yazýlým Geliþtirme Yetiþtirme Kampýmýzýn takip , döküman ve duyurularýný buradan yapýlacaktýr.",
				"Ücretsiz");
		
		Course cource3 =new Course(
				3,
				"Programlama Giriþ için Temel Kurs",
				"Engin Demirog",
				"PYTHON ,JAVA C# gibi tüm programlama dilleri için temel örnekler",
				"Ücretsiz");
		
		Course[] courses = {cource1,cource2,cource3};
		
        
		for (Course course : courses) {
			
			System.out.println(course.courseName);
		}
		
		CourseCategory courseCategory1 =new CourseCategory();
		courseCategory1.id =1;
		courseCategory1.categoryName ="Kategori";
		
		CourseCategory courseCategory2 =new CourseCategory();
		courseCategory2.id =2;
		courseCategory2.categoryName ="Eðitmen";
		
		CourseManager courseManager = new CourseManager();
		courseManager.addStudentTheCourse(cource1);
		courseManager.addStudentTheCourse(cource2);
		courseManager.addStudentTheCourse(cource3);

	}		
}
