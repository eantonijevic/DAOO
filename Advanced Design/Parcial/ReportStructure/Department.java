package Parcial.ReportStructure;

import java.util.List;

public class Department implements ReportElement {
    private String name;
    private double budget;
    private List<Employee> employees;

    public Department(String name, double budget, List<Employee> employees) {
        this.name = name;
        this.budget = budget;
        this.employees = employees;
    }

    public String getName() { return name; }
    public double getBudget() { return budget; }
    public List<Employee> getEmployees() { return employees; }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
        for (Employee e : employees) {
            e.accept(visitor);
        }
    }
}