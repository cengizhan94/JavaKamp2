package odev1;

public class Main {

	public static void main(String[] args) {
		LessonJavaScript lesson1 = new LessonJavaScript
				(1, "JavaScript","Yaz�l�m Geli�tirici Kamp�","Engin Demiro�",true,100);
		lesson1.id = 1;
		lesson1.lessonName = "JavaScript";
		lesson1.lessonDescription = "Yaz�l�m Geli�tirici Kamp�";
		lesson1.teacherName = "Engin Demiro�";
		lesson1.homeWork = true;
		lesson1.participationRate = 100;

		
		lessonManager manager = new lessonManager();
		manager.addLesson(lesson1);
		
		
		
	}

}
