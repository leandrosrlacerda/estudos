package application;

import entities.Employee;

import java.util.Scanner;

public class MainEmployee {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();
        double percentage;

        System.out.print("Enter the employee`s name: ");
        employee.name = scanner.next();
        System.out.print("Enter the employee`s gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.print("Enter the tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println("\nEmployee: " + employee);

        System.out.print("Which percentage to increase salary? ");
        percentage = scanner.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println("\nUpdate data: " + employee);

        scanner.close();
    }
}
