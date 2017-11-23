package lesson.exercises;

public class Application {

	public static void main(String[] args) {
		System.out.println("hello world");
		// vi har skapat ett object av Klassen Person
		Person chris = new Person("Chris!");
        chris.writeName();
        
        chris.setName("coffe");
        chris.writeName();
	}

}
