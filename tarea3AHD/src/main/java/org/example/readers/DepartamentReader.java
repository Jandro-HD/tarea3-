package org.example.readers;

import org.example.model.Departament;
import org.example.model.Employee;

import java.util.Scanner;

public class DepartamentReader {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;

    public DepartamentReader(Scanner scanner, EmployeeReader employeeReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
    }

    public Departament read(){
        System.out.println("Departamento");
        System.out.print("Nombre del departamento: ");
        var name = scanner.nextLine();

        System.out.print("Presupuesto del departamento: ");
        var budget = scanner.nextDouble();

        System.out.print("Numero de empleados: ");
        var numEmployees = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[numEmployees];


        for (int i = 0; i < numEmployees; i++){
            employees[i] = employeeReader.read();
        }

        return new Departament(name, budget, employees);
    }
}
