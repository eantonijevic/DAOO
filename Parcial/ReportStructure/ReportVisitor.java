package Parcial.ReportStructure;

public interface ReportVisitor {
    void visit(Employee employee);
    void visit(Department department);
    void visit(Project project);
}