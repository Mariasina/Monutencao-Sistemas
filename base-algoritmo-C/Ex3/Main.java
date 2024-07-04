package Ex3;

import java.util.Scanner;

//Base-de-Algoritmos-em-C_v2/struct02aulapratica.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Informe o cadastro: ");
        int cadastro = scan.nextInt();

        System.out.println("Informe o valor do IPTU: ");
        float iptu = scan.nextFloat();

        System.out.println("Informe quantos meses atrasado: ");
        int meses_atrasado = scan.nextInt();

        float multa = meses_atrasado * 50.00f;

        Imovel imovel = new Imovel(cadastro, iptu, meses_atrasado, multa);

        System.out.println("\nCadastro: " + imovel.getCadastro());
        System.out.println("IPTU: " + imovel.getIptu());
        System.out.println("Meses atrasado: " + imovel.getMeses_atrasado());
        System.out.println("Multa: " + imovel.getMulta());

        scan.close();
    }
}
