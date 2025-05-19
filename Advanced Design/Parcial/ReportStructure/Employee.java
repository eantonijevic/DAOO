package Parcial.ReportStructure;

public class Employee implements ReportElement {
    private String name;
    private double salary;
    private int hoursWorked;

    public Employee(String name, double salary, int hoursWorked) {
        this.name = name;
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getHoursWorked() { return hoursWorked; }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}