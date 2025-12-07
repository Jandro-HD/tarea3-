package org.example.apps;

import org.example.model.Company;
import org.example.readers.CompanyReader;

import java.util.Scanner;

public class CompanyMenuApp {
    private Scanner scanner;
    private CompanyReader companyReader;

    public CompanyMenuApp(Scanner scanner, CompanyReader companyReader) {
        this.scanner = scanner;
        this.companyReader = companyReader;
    }

    public void run(){
        var company = companyReader.read();
        menu(company);
    }

    public void menu(Company company){
        var opt = 0;

        do {
            opt = selectOption();

            if (opt == 1){
                company.one();
            } else if (opt == 2) {
                company.two();
            } else if (opt == 3) {
                company.trhee();
            } else{
                System.out.print("Opcion invalida ponga una opcion valida");
            }
        } while(opt != 4);
    }


    public final void printMenu(){
        System.out.println("Menu:");
        System.out.println("1. Ver departamento  segun  un Nombre.");
        System.out.println("2. Ver los empleado  de un departamento  segun  un Nombre.");
        System.out.println("3. Ver la información de un empledo segun   su NIF.");
        System.out.println("4. Salir");
    }


    public final int selectOption(){
        printMenu();

        System.out.print("Ponga lo que quiere hacer: ");
        var optionSelected = scanner.nextInt();
        scanner.nextLine();

        return optionSelected;
    }
}
