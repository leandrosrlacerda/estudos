package application;

import java.util.Scanner;

public class MainNumerosNegativos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i = 0; i < vetor.length; i++){
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }

        scanner.close();
    }
}
