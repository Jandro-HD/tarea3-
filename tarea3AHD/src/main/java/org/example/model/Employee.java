package org.example.model;

import java.util.Objects;

public class Employee {
    private String nif;
    private String firstName;
    private String lastName;
    private String jobTitle;

    public Employee(String firstName, String idNumber, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.nif = idNumber;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }

    public final void showInfo() {
        System.out.println("Trabajadro");
        System.out.println("NIF: " + nif);
        System.out.println("Nombre: " + firstName);
        System.out.println("Apellidos: " + lastName);
        System.out.println("Puesto: " + jobTitle);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(nif, employee.nif) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(jobTitle, employee.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, firstName, lastName, jobTitle);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idNumber='" + nif + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}