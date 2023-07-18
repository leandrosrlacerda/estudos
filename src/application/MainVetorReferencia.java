package application;

import entities.Product;

import java.util.Scanner;

public class MainVetorReferencia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Product[] vector = new Product[n];

        for (int i = 0; i < vector.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();

            vector[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vector.length; i++){
            sum += vector[i].getPrice();
        }

        double avg = sum / vector.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        scanner.close();
    }
}
