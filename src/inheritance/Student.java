package inheritance;


/**
 * This class represents a student and extends the Person class
 */
public class Student extends Person{

    /** Varible double present the score of the student */
    double score;


    /**
     * Construct for Student with the specified name, age, gender and score
     *
     * @param name   The name of the student
     * @param age    The age of the student
     * @param isMan  Indicating the gender of the student
     * @param score  The score of the student
     */

    public Student(String name, int age, boolean isMan, double score) {

        super(name, age, isMan);
        this.score = score;


    }

    /**
     * Information about the student: name, age, gender and score
     */
    public void showStudentInfo() {

        super.showPersonInfo();
        System.out.println("Score: " + score);
    }
}
