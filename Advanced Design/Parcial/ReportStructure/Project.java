package Parcial.ReportStructure;

import java.time.LocalDate;
import java.util.List;

public class Project implements ReportElement {
    private String name;
    private List<Employee> assigned;
    private LocalDate deadline;
    private String status;

    public Project(String name, List<Employee> assigned,
                   LocalDate deadline, String status) {
        this.name = name;
        this.assigned = assigned;
        this.deadline = deadline;
        this.status = status;
    }

    public String getName() { return name; }
    public List<Employee> getAssigned() { return assigned; }
    public LocalDate getDeadline() { return deadline; }
    public String getStatus() { return status; }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
        for (Employee e : assigned) {
            e.accept(visitor);
        }
    }
}