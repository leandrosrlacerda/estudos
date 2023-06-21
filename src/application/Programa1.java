package application;

import java.util.Scanner;

public class Programa1 {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o raio: ");
        double raio = scanner.nextDouble();

        double c = circunferencia(raio);

        double v = volume(raio);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", PI);

        scanner.close();
    }

    public static double circunferencia(double raio){
        return 2.0 * PI * raio;
    }

    public static double volume(double raio){
        return 4.0 * PI * raio * raio * raio / 3.0;
    }

}
