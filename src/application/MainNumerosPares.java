package application;

import java.util.Scanner;

public class MainNumerosPares {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, quantidadeNumerosPares;

        System.out.print("Entre com a quantidade de numeros inteiros: ");
        n = scanner.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Entre com o " + (i + 1) + " numero: ");
            vetor[i] = scanner.nextInt();
        }

        quantidadeNumerosPares = 0;

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%d  ",vetor[i]);
                quantidadeNumerosPares++;
            }
        }

        System.out.print("\nQUANTIDADE DE PARES = " + quantidadeNumerosPares + "\n");

        scanner.close();
    }
}
