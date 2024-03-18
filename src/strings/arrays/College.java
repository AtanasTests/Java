package strings.arrays;

public class College {

    public static void main(String[] args) {



        Student Charlie = new Student("Charlie Harper", "Whiskey taster", 21);
        Charlie.grade = 5.20;

        Student Alan = new Student();
        Alan.name = "Alan Harper";
        Alan.subject = "Secondhand clothes";
        Alan.age = 20;
        Alan.grade  = 4.50;

        Student Jake = new Student("Jake Harper", "Comedy", 26);
        Jake.grade = 4.80;

        Student Jenny = new Student("Jenny Harper", "Comedy", 21);
        Jenny.grade = 5.40;

        Student Evelyn = new Student("Evelyn Harper", "Comedy", 22);
        Evelyn.grade = 5.60;

        Student Herb = new Student("Herb Melnick", "Comedy", 23);
        Herb.grade = 5.0;

        Student Eldridge  = new Student("Eldridge Mackelroy", "Comedy",23);
        Eldridge .grade = 5.20;

        Student Rose = new Student("Rose the Neighbor", "Comedy", 25);

        StudentGroup Comedy = new StudentGroup("Comedy");

        System.out.println();

        Comedy.addStudent(Charlie);
        Comedy.addStudent(Jenny);
        Comedy.addStudent(Alan);
        Comedy.addStudent(Rose);
        Comedy.addStudent(Eldridge );
        Comedy.addStudent(Herb);
        Comedy.addStudent(Jake);
        Comedy.addStudent(Evelyn);

        Comedy.printStudentsInGroup();

        String bestStudent = Comedy.theBestStudent();

        System.out.println("The best student is "+ bestStudent);

        Comedy.emptyGroup();

        Comedy.addStudent(Evelyn);

        System.out.println(Alan.receiveScholarship(5, 100));
        Rose.upYear();
        System.out.println(Rose.receiveScholarship(5.40, 150));
    }
}
