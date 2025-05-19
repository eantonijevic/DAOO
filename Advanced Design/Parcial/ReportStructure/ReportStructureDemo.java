package Parcial.ReportStructure;

import java.time.LocalDate;
import java.util.List;

public class ReportStructureDemo {
    public static void main(String[] args) {
        Employee alice = new Employee("Alice", 50000, 160);
        Employee bob   = new Employee("Bob",   60000, 170);

        Department dev = new Department("Development", 200000,
                                        List.of(alice, bob));

        Project projX = new Project("Project X",
                                    List.of(bob),
                                    LocalDate.of(2025,6,30),
                                    "In Progress");

        List<ReportElement> elements = List.of(dev, projX);

        // 1) Plain‐text report
        PlainTextReportVisitor textVisitor = new PlainTextReportVisitor();
        elements.forEach(e -> e.accept(textVisitor));
        System.out.println(textVisitor.getReport());

        // 2) Statistics
        StatisticsVisitor statsVisitor = new StatisticsVisitor();
        elements.forEach(e -> e.accept(statsVisitor));
        statsVisitor.printStatistics();
    }
}