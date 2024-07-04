package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

//Base-de-Algoritmos-em-C_v2/revisao2.c
public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("\nFuncionário %d: ", i+1);

            System.out.println("\nDigite o código do funcionário: ");
            int cod = scan.nextInt();

            System.out.println("Digite o nome do funcionário: ");
            String nome = scan.next();

            System.out.println("Qual o salário do funcionário: ");
            float salario = scan.nextFloat();

            System.out.println("Qual o e-mail do funcionário: ");
            String email = scan.next();

            Funcionario func = new Funcionario(cod, nome, salario, email);
            funcionarios.add(func);

            System.out.println("Funcionário cadastrado!");
        }
        int pesquisa = 1;

        while (pesquisa != 0) {

            System.out.println("\n\nConsulte o funcionário digitando seu código ou digite 0 para sair:");
            pesquisa = scan.nextInt();

            for (var func : funcionarios) {
                if (func.getCod_func() == pesquisa) {
                    System.out.printf("\nFuncionário %s cadastrado", func.getNome());
                    System.out.printf("\nSalário: %.2f", func.getSalario());
                    System.out.printf("\nE-mail: %s", func.getEmail());
                }

            }
        }

        scan.close();
    }
}
