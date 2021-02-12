package thirtyDaysOfCode.day12.Inheritance3;

import java.text.NumberFormat;
import java.util.Locale;

class Volunteer extends Employee{
    // instance variable:
    int hours;

    /* * Parameterized Constructor
     *   @param name The volunteer's name. * */
    Volunteer(String name) {
        // explicit call to superclass' parameterized constructor
        super(name);
    }

    /* * @param Set the hours instance variable. * */
    void setHours(int hours) {
        this.hours = hours;
    }

    /* * @return The hours instance variable * */
    int getHours() {
        return hours;
    }

    @Override
    /* * Override the superclass' print method
     *   Print information about an instance of Volunteer.
     * */
    void print() {
        NumberFormat salaryFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Volunteer Name: " + this.getName()
                + "\nHours: " + this.getHours()
                + "\nSalary: " + salaryFormat.format(this.getSalary()));
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Erica");
        employee.print(); // Salary is zero
        employee.setSalary(60000);
        employee.print(); // Salary was set

        Volunteer volunteer = new Volunteer("Anna");
        volunteer.setHours(20);
        volunteer.setSalary(15000);
        volunteer.print();

    }
}