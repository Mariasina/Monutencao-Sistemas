package Ex9;

import java.util.Scanner;

//Base-de-algoritmos-em-C-v3/listamold4.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a medida lateral do terreno: ");
        float altura = scan.nextFloat();

        System.out.println("Informe a base do terreno: ");
        float base = scan.nextFloat();

        float res = calculo(altura, base);

        System.out.printf("\nArea = %.2fm , referente as medidas: %.2fm e %.2fm.", res, altura, base);

        scan.close();
    }

    static float calculo(float altura, float base) {
        return altura * base;
    }

}
