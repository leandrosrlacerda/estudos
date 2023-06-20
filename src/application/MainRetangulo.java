package application;

import entities.Retangulo;

import java.util.Scanner;

public class MainRetangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height: ");
        retangulo.width = scanner.nextDouble();
        retangulo.height = scanner.nextDouble();

        System.out.printf("Area = %.2f%n", retangulo.area());
        System.out.printf("Perimetro = %.2f%n", retangulo.perimeter());
        System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());

        scanner.close();
    }
}
