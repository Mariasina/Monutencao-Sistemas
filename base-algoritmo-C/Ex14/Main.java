package Ex14;

import java.util.Scanner;

//Base-de-Algoritmos-em-C_v2/listacondicional3.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salario_min = 998f;

        System.out.println("Informe o salário bruto: ");
        float salario = scan.nextFloat();

        System.out.println("Informe o imposto a ser pago: ");
        float desconto = scan.nextFloat();

        desconto = salario * desconto;
        float resultado = salario - desconto;

        if(desconto <= salario_min){
            System.out.printf("O salario liquido é %.2f e seus impostos estão MENORES que um salario minimo. ", resultado);
        }
        else{
            System.out.printf("O salario liquido é %.2f e seus impostos estão MAIORES que um salario minimo. ", resultado);

        }

        scan.close();
    }
}
