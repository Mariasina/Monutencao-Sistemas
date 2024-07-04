package Ex4;

import java.util.Scanner;

//Base-de-Algoritmos-em-C_v2/trabalho02matriz.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int matriz1[][] = new int[5][5];
        int matriz2[][] = new int[5][5];
        int matresul[][] = new int[5][5];

        System.out.println("Matriz 1");
        for (int l = 0; l < matriz1.length; l++) {
            for (int c = 0; c < matriz1.length; c++) {
                System.out.printf("\nInforme o valor para a linha %d, e da coluna %d da matriz: ", l, c);
                matriz1[l][c] = scan.nextInt();
            }
        }

        System.out.println("\nMatriz 2");
        for (int l = 0; l < matriz2.length; l++) {
            for (int c = 0; c < matriz2.length; c++) {
                System.out.printf("\nInforme o valor para a linha %d, e da coluna %d da matriz: ", l, c);
                matriz2[l][c] = scan.nextInt();
            }
        }

        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                matresul[l][c] = matriz1[l][c] + matriz2[l][c];
            }
        }

        System.out.println("\nMatresul");
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.printf("| %d |", matresul[l][c]);
            }
            System.out.printf("\n");
        }

        int diagonal = 0;

        for (int cont = 0; cont < 5; cont++) {
            diagonal = diagonal + matresul[cont][cont];
        }
        // diagonal = matresul[0][0] + matresul[1][1] + matresul[2][2] + matresul[3][3] + matresul[4][4];
        System.out.printf("\n\n O valor da Diagonal Principal é %d\n\n", diagonal);

        scan.close();
    }
}
