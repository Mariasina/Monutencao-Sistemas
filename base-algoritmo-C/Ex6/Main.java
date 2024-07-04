package Ex6;

import java.util.Scanner;

//Base-de-algoritmos-em-C-v3/exer19funcoes.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe seu sexo (M para Masculino e F para Feminino): ");
        String sexo = scan.next();

        System.out.println("Informe sua altura (com (,) separando metros de centimetros): ");
        float altura = scan.nextFloat();

        if(sexo == "M" || sexo == "m"){
            System.out.printf("\nSeu peso ideal é de %.2f kilos.", idealHomem(altura));
        }
        else{
            System.out.printf("\nSeu peso ideal é de %.2f kilos.", idealMulher(altura));
        }

        scan.close();
    }

    static float idealHomem ( float p_altH){
    
        float valorH = (72.7f * p_altH) - 58;
        return valorH;
    }
    
    static float idealMulher ( float p_altF){
        
        float valorF = (62.1f * p_altF) - 44.7f;
        return valorF;
    }
}
