package Ex11;

import java.util.Scanner;

//Base-de-algoritmos-em-C-v3/tabuadaqualquernum.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("-------------TABUADA-------------");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n%d X %2d = %4d", num, i, (num * i));
        }

        scan.close();
    }
}
