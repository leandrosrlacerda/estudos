package application;

import java.util.Scanner;

public class MainMaiorPosicao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, posicao;
        double maiorValor;

        System.out.print("Entre com quantidade de numeros reais: ");
        n = scanner.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
        }

        maiorValor = 0;
        posicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f%n", maiorValor);
        System.out.print("POSICAO DO MAIOR VALOR = " + posicao);

        scanner.close();
    }
}
