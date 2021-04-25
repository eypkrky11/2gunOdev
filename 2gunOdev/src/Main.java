public class Main {

	public static void main(String[] args) {
		
		Course cource1 =new Course(
				1,
				"Yaz�l�m Geli�tirme Yeti�tirme Kamp�(C# + ANGULAR )",
				"Engin Demirog",
				"2 Ay s�recek Yaz�l�m Geli�tirme Yeti�tirme Kamp�m�z�n takip , d�k�man ve duyurular�n� buradan yap�lacakt�r.",
				"�cretsiz");
		
		Course cource2 =new Course(
				2,
				"Yaz�l�m Geli�tirme Yeti�tirme Kamp�(JAVA + REACT )",
				"Engin Demirog",
				"2 Ay s�recek Yaz�l�m Geli�tirme Yeti�tirme Kamp�m�z�n takip , d�k�man ve duyurular�n� buradan yap�lacakt�r.",
				"�cretsiz");
		
		Course cource3 =new Course(
				3,
				"Programlama Giri� i�in Temel Kurs",
				"Engin Demirog",
				"PYTHON ,JAVA C# gibi t�m programlama dilleri i�in temel �rnekler",
				"�cretsiz");
		
		Course[] courses = {cource1,cource2,cource3};
		
        
		for (Course course : courses) {
			
			System.out.println(course.courseName);
		}
		
		CourseCategory courseCategory1 =new CourseCategory();
		courseCategory1.id =1;
		courseCategory1.categoryName ="Kategori";
		
		CourseCategory courseCategory2 =new CourseCategory();
		courseCategory2.id =2;
		courseCategory2.categoryName ="E�itmen";
		
		CourseManager courseManager = new CourseManager();
		courseManager.addStudentTheCourse(cource1);
		courseManager.addStudentTheCourse(cource2);
		courseManager.addStudentTheCourse(cource3);

	}		
}
