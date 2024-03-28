package inheritance;


/**
 * The Demo class demonstrates the usage of the Person, Student, and Employee classes
 */
public class Demo {

    /**
     * The main method that serves as the entry point of the program.
     */
    public static void main(String[] args) {

        /**
         * Array with instances of Person, Student and Employee
         */
        Person[] people = new Person[10];

        /**
         *  Creation instances of Person, Student and Employee
         */
        Person charlie = new Person("Charlie", 30, true);
        Person rose = new Person("Rose", 28, false);
        Student jake = new Student("Jake", 16, true, 3.5);
        Student larry = new Student("Larry", 16, true, 4.5);
        Employee alan = new Employee("Alan", 29, true, 50.0);
        Employee berta = new Employee("Berta", 40, false, 100.0);

        /**
         * Add instances to the array
         */
        people[0] = charlie;
        people[1] = rose;
        people[2] = jake;
        people[3] = larry;
        people[4] = alan;
        people[5] = berta;

        /**
         * Display information for the type of each object in the array
         */
        for (Object arrayItem : people) {
            if (arrayItem instanceof Employee) {
                ((Employee) arrayItem).showEmployeeInfo();
            } else {
                if (arrayItem instanceof Student) {
                    ((Student) arrayItem).showStudentInfo();
                } else {
                    if (arrayItem instanceof Person) {
                        ((Person) arrayItem).showPersonInfo();
                    }
                }
            }
        }

        /**
         * Calculate overtime for employees
         */
        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Employee) {
                ((Employee) people[i]).calculateOvertime(2);
            }

        }

    }

}
