package Ex10;

import java.util.Scanner;

//Base-de-algoritmos-em-C-v3/listamold6.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------Loja de Camisetas-------------------");
        System.out.println("Qual a quantidade de camisetas pequenas($10,00): ");
        int pequena = scan.nextInt();

        System.out.println("Qual a quantidade de camisetas médias($12,00): ");
        int media = scan.nextInt();

        System.out.println("Qual a quantidade de camisetas grandes($15,00): ");
        int grande = scan.nextInt();

        System.out.println("Qual o seu nome: ");
        String nome = scan.next();

        float res = calculo(pequena, media, grande, nome);

        System.out.printf("Valor arrecadado é de:R$ %f %s.", res, nome);

        scan.close();
    }

    static float calculo(int pequena, int media, int grande, String nome){
        return (pequena * 10) + (media * 12) + (grande * grande);
    }
}
