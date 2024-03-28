package inheritance;


/**
 * This class represents a person with attributes such as name, age, and gender
 */
public class Person {

    /** Varible String that present the name of the person */
    String name;
    /** Varible age that present the age of the person */
    int age;
    /** Varible boolean present the gender of the person (true if male, false if female) */
    boolean isMan;

    /**
     * Construct for new Person with the specified name, age, and gender
     *
     * @param name   The name of the person
     * @param age    The age of the person
     * @param isMan  Indicating the gender of the person (true if male, false if female)
     */
    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    /**
     * Displays information about the person: name, age, and gender
     */
    public void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + (isMan ? "Male" : "Female"));
    }
}
