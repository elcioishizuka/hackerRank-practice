package thirtyDaysOfCode.day12.Inheritance3;

import java.util.Locale;
import java.text.NumberFormat;

class Employee {
    // Instance variables:
    protected String name;
    private int salary;

    /* * Parameterized Constructor
     *   @param name The volunteer's name. * */
    Employee(String name) {
        // use name param to initialize instance variable:
        this.name = name;
    }

    /* * @return The name instance variable. * */
    String getName() {
        return name;
    }

    /* * @param salary The integer to set as the salary instance variable. * */
    void setSalary(int salary) {
        this.salary = salary;
    }

    /* * @return The salary instance variable. * */
    int getSalary() {
        return salary;
    }

    /* * Print information about an instance of Employee. * */
    void print() {
        if (this.salary == 0) {
            System.err.println("Error: No salary set for "
                    + this.name
                    + "; please set salary and try again.\n");
        }
        else { // Print employee information
            // Formatter for salary
            // This adds commas between zeroes:
            NumberFormat salaryFormat = NumberFormat.getCurrencyInstance(Locale.US);

            System.out.println("Employee Name: " + this.name
                    + "\nSalary: "
                    + salaryFormat.format(this.salary) + "\n");
        }
    }
}