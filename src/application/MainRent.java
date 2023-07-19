package application;

import entities.Rent;

import java.util.Scanner;

public class MainRent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rent[] vetor = new Rent[10];

        System.out.print("Numero de estudantes que irao alugar quartos: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            scanner.nextLine();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            String name = scanner.nextLine();
            System.out.print("E-mail: ");
            String email = scanner.next();
            System.out.print("Quarto: ");
            int roomNumber = scanner.nextInt();

            vetor[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 1; i < 10; i++) {
            if (vetor[i] != null){
                System.out.println(i + ": " + vetor[i]);
            }
        }

        scanner.close();
    }
}
