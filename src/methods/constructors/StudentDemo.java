package methods.constructors;

public class StudentDemo {

    public static void main(String[] args) {
        Student Alan = new Student("Alan Harper", "Secondhand clothes", 21);
        Student Jake = new Student("Jake Harper", "Donuts", 26);

        Student Charlie = new Student();
        Charlie.name = "Charlie Harper";
        Charlie.subject = "Whiskey taster";
        Charlie.age = 20;

        System.out.println(Alan.receiveScholarship(4.0, 50));
        System.out.println(Alan.receiveScholarship(4.0, 50));

        System.out.println();

        Charlie.upYear();
        Charlie.upYear();
        Charlie.upYear();

        System.out.println();

        System.out.println(Jake.receiveScholarship(5.0, 60));
        Jake.upYear();

    }
}
