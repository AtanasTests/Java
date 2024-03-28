package inheritance;


/**
 * This class represent an employee and extending the Person class
 * It includes information about the employee's name, age, gender, daily salary,
 * and provides methods for calculating overtime and displaying employee information
 */
public class Employee extends Person{

    /** Varible double present the  daily salary of the employee */
    double daySalary;

    /**
     * Construct for new Employee with the specified name, age, gender and daily salary
     *
     * @param name       The name of the employee
     * @param age        The age of the employee
     * @param isMan      Indicating the gender of the person (true if male, false if female)
     * @param daySalary  The daily salary of the employee
     */
    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }


    /**
     * Calculates the overtime pay for the employee based on the number of hours worked
     * @param hours The number of hours worked.
     * @return The calculated overtime pay.
     */
    public double calculateOvertime(double hours) {

        if (age < 18) {
            return 0;
        } else {

            double hourlyRate = daySalary / 8.0;
            double overtimeRate = 1.5;
            return (hours * overtimeRate * hourlyRate);
        }
    }

    /**
     * Displays information about the employee, including name, age, gender and daily salary
     */
    public void showEmployeeInfo() {

        super.showPersonInfo();
        System.out.println("Daily Salary: " + daySalary);
    }

}
