package application;

import entities.Aluno;

import java.util.Scanner;

public class MainAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Entre com o nome do aluno: ");
        aluno.nome = scanner.next();

        System.out.println("Entre com as tres notas do aluno:");
        aluno.nota1 = scanner.nextDouble();
        aluno.nota2 = scanner.nextDouble();
        aluno.nota3 = scanner.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n",aluno.notaFinal());

        if (aluno.notaFinal() < 60){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.calculaObterMinimoAprovacao());
        } else {
            System.out.println("PASS");
        }


        scanner.close();
    }
}
