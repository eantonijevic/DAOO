package Parcial.ReportStructure;

public class PlainTextReportVisitor implements ReportVisitor {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void visit(Employee e) {
        sb.append(String.format("Employee: %s, Salary=%.2f, Hours=%d\n",
                  e.getName(), e.getSalary(), e.getHoursWorked()));
    }

    @Override
    public void visit(Department d) {
        sb.append(String.format("Department: %s, Budget=%.2f\n",
                  d.getName(), d.getBudget()));
    }

    @Override
    public void visit(Project p) {
        sb.append(String.format("Project: %s, Deadline=%s, Status=%s\n",
                  p.getName(), p.getDeadline(), p.getStatus()));
    }

    public String getReport() {
        return sb.toString();
    }
}