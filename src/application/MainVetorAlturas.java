package application;

import entities.Pessoa;

import java.util.Scanner;

public class MainVetorAlturas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, nmenores;
        double somaDasAlturas, percentualMenores;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = scanner.nextInt();
        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < vetor.length; i++) {
            scanner.nextLine();
            System.out.println("Dados da " + (i + 1) + " pessoa:");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            vetor[i] = new Pessoa(nome, idade, altura);
        }

        nmenores = 0;
        somaDasAlturas = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                nmenores++;
            }
            somaDasAlturas += vetor[i].getAltura();
        }

        percentualMenores = ((double) nmenores / n) * 100.0;

        System.out.printf("ALTURA MEDIA = %.2f", somaDasAlturas / vetor.length);
        System.out.printf("\nPessoa com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.printf("%s\n", vetor[i].getNome());
            }
        }

        scanner.close();
    }
}
