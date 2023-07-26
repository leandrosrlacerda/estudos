package application;

import entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmployee2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee2> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();

            while (hasId(list, id)){
                System.out.println("Id already taken! Try again: ");
                id = scanner.nextInt();
            }

            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();

            Employee2 employee = new Employee2(id, name, salary);
            list.add(employee);

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = scanner.nextInt();

        Employee2 emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = scanner.nextDouble();
            emp.increaseSalary(percent);

        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employee2 e : list){
            System.out.println(e);
        }

        scanner.close();
    }

    public static boolean hasId (List<Employee2> list, int id) {
        Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return  emp != null;
    }

}
