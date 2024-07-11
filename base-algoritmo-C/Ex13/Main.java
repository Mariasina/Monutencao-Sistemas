package Ex13;

import java.util.ArrayList;
import java.util.Scanner;

//Base-de-Algoritmos-em-C_v2/EX3.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Estagiario> estagiarios = new ArrayList<>();

        float salario_anual = 0;

        for (int i = 0; i < 2; i++) {
            System.out.printf("\n%dº estagiario", i +1);
            System.out.println("\n\nQual o código do estagiário: ");
            int codigo = scan.nextInt();

            System.out.println("Qual o nome do estagiário: ");
            String nome = scan.next();

            System.out.println("Qual o ano de nascimento do estagiário: ");
            int ano = scan.nextInt();

            Estagiario estag = new Estagiario(codigo, nome, ano);

            for (int j = 0; j < 12; j++) {
                System.out.printf("Qual o %dº salário do estagiário: ", j + 1);
                float salario = scan.nextFloat();

                estag.setSalario(salario, j);

                salario_anual += salario;
            }

            estag.setSalario_anual(salario_anual);

            estagiarios.add(estag);
        }

        for (Estagiario estagiario : estagiarios) {
            System.out.printf("\n\nCodigo: %d", estagiario.getCod());
            System.out.printf("\nNome: %s", estagiario.getNome());
            System.out.printf("\nAno: %s", estagiario.getAno());
            System.out.printf("\nSalário anual: $%s", estagiario.getSalario_anual());
            
        }

        scan.close();
    }
}
