package application;

import java.util.Scanner;

import static util.CurrencyConverter.conversor;

public class MainCurrencyConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cotacao do dolar (valor atual do dolar): ");
        double valorDolar = scanner.nextDouble();
        System.out.print("Quantos dolares deseja comprar: ");
        double quantidadeDolar = scanner.nextDouble();

        System.out.printf("Voce pagara %.2f reais para comprar %.2f dolares!%n", conversor(valorDolar, quantidadeDolar), quantidadeDolar);

        scanner.close();

    }
}
