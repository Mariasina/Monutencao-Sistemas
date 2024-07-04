package Ex5;

import java.util.Scanner;

//Base-de-algoritmos-em-C-v3/busca1.c
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int val[] = new int[10];
        int achou = 0;

        for (int i = 0; i < val.length; i++) {
            System.out.printf("Informe o %dº valor: ", i + 1);
            val[i] = scan.nextInt();
        }

        System.out.println("Informe um valor para ser procurado: ");
        int busca = scan.nextInt();

        for (int i = 0; i < val.length; i++) {
            if(busca == val[i]){
                achou += 1;
            }
        }

        System.out.printf("O número foi achado %d vezes.", achou);

        scan.close();
    }

}
