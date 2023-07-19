package application;

import java.util.Scanner;

public class MainSomaVetor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = scanner.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
        }

        soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        media = soma / vetor.length;

        System.out.print("VALORES = ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.1f  ", vetor[i]);
        }


        System.out.printf("\nSOMA = %.2f\n", soma);


        System.out.printf("MEDIA = %.2f\n", media);

        scanner.close();

    }
}
