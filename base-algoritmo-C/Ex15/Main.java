package Ex15;

import java.util.Scanner;

//Base-de-Algoritmos-em-C_v2/listalaco2.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite seu salário: ");
            float salario = scan.nextFloat();

            total += salario;
        }

        float media = total / 5;

        System.out.printf("\nTotal dos salário: %.2f.", total);
        System.out.printf("\nMedia dos salarios: %.2f.", media);

        scan.close();
    }
}
