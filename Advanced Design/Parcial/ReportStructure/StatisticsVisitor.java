package Parcial.ReportStructure;

public class StatisticsVisitor implements ReportVisitor {
    private double totalSalaries = 0;
    private int totalHours = 0;
    private double totalBudgets = 0;
    private int projectCount = 0;

    @Override
    public void visit(Employee e) {
        totalSalaries += e.getSalary();
        totalHours += e.getHoursWorked();
    }

    @Override
    public void visit(Department d) {
        totalBudgets += d.getBudget();
    }

    @Override
    public void visit(Project p) {
        projectCount++;
    }

    public void printStatistics() {
        System.out.println("=== Statistics ===");
        System.out.printf("Total Salaries: %.2f\n", totalSalaries);
        System.out.printf("Total Hours: %d\n", totalHours);
        System.out.printf("Total Department Budgets: %.2f\n", totalBudgets);
        System.out.printf("Number of Projects: %d\n", projectCount);
    }
}