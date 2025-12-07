package org.example.readers;

import org.example.model.Employee;

import java.util.Scanner;

public class EmployeeReader {
    private final Scanner scanner;

    public EmployeeReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Employee read(){
        System.out.println("Datos del empleado ");
        System.out.println( "NIF: ");
        var nif = scanner.nextLine();
        System.out.println("Nombre del empleado: ");
        var name = scanner.nextLine();
        System.out.println("Apillodos: ");
        var surnames = scanner.nextLine();
        System.out.println("Posicion del empleado: ");
        var position = scanner.nextLine();
        return new Employee(nif, name, surnames, position);
    }
}
