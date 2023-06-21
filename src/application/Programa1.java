package application;

import util.CalculatorProgram1;

import java.util.Scanner;

import static util.CalculatorProgram1.*;

public class Programa1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o raio: ");
        double raio = scanner.nextDouble();

        double c = CalculatorProgram1.circunferencia(raio);

        double v = volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", PI);

        scanner.close();
    }

}
