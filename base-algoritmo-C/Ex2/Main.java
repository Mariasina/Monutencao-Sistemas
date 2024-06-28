package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

//revisao2.c
public class Main {
    public static void main(String[] args) {
        ArrayList funcionarios = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
    
        for(int i = 0; i < 3; i++){
            System.out.println("Digite o código do funcionário: ");
            int cod = scan.nextInt();

            System.out.println("Digite o nome do funcionário: ");
            String nome =  scan.next();

            System.out.println("Qual o salário do funcionário: ");
            float salario = scan.nextFloat();

            System.out.println("Qual o e-mail do funcionário: ");
            String email = scan.next();

            Funcionario func = new Funcionario(cod, nome, salario, email);
        }
    }
}
