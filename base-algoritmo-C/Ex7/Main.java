package Ex7;

import java.util.Scanner;

//Base-de-algoritmos-em-C-v3/listamold1.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scan.next();

        System.out.println("Informe o valor por litro de gasolina: ");
        float preco_litro = scan.nextFloat();

        System.out.println("Informe o valor de pagamento: ");
        float valor_pgto = scan.nextFloat();

        float res = calculo(preco_litro, valor_pgto);

        System.out.printf("\n%s vai abastecer %.3f litros de gasolina.", nome, res);

        scan.close();
    }

    static float calculo(float preco_litro, float valor_pgto){
        return valor_pgto / preco_litro;
    }
}
