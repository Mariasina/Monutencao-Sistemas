package Ex12;

import java.util.Scanner;

//Base-de-algoritmos-em-C-v3/trabalho_moldularizacao.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int matricula = 1;

        while (matricula != 0) {
            System.out.println("Informe sua matrícula: ");
            matricula = scan.nextInt();

            if (matricula != 0) {
                System.out.println("Informe seu nome: ");
                String nome = scan.next();

                System.out.println("Informe a primeira nota: ");
                float nota1 = scan.nextFloat();

                System.out.println("Informe a segunda nota: ");
                float nota2 = scan.nextFloat();

                System.out.println("Informe a terceira nota: ");
                float nota3 = scan.nextFloat();

                System.out.println("Informe a quarta nota: ");
                float nota4 = scan.nextFloat();

                float media = calculo(nota1, nota2, nota3, nota4);

                System.out.printf("O aluno(a) %s com matrícula %d tem %.1f de média.\n\n\n", nome, matricula, media);
            }
        }

        scan.close();
    }

    static float calculo(float nota1, float nota2, float nota3, float nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;

    }
}
