package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RegistrationInstallments {
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dueDate;
    private double amount;

    public RegistrationInstallments() {
    }

    public RegistrationInstallments(LocalDate dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Date " + dueDate.format(fmt) + " - " + String.format("%.2f",amount);
    }
}