package Parcial.ReportStructure;

public interface ReportElement {
    void accept(ReportVisitor visitor);
}