package org.example.readers;

import org.example.model.Company;
import org.example.model.Departament;

import java.util.Scanner;

public class CompanyReader {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;
    private final DepartamentReader departamentReader;


    public CompanyReader(Scanner scanner, EmployeeReader employeeReader, DepartamentReader departamentReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
        this.departamentReader = departamentReader;
    }


    public Company read(){
        System.out.println("Ingrese los datos de la mempresa ");
        System.out.print("Nombre: ");
        var name = scanner.nextLine();

        System.out.print("CIF: ");
        var cif = scanner.nextLine();

        System.out.print("Numero de departamentos: ");
        var numDepartaments = scanner.nextInt();
        scanner.nextLine();

        Departament[] departamets = new Departament[numDepartaments];

        for (int i= 0; i < numDepartaments; i++){
            departamets[i] = departamentReader.read();
        }

        return new Company(name, cif, departamets);
    }
}
