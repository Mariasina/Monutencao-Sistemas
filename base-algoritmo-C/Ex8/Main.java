package Ex8;

import java.util.Scanner;

//Base-de-algoritmos-em-C-v3/listamold3.c
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String option = " ";
        float res = 0;

        while (option != "#") {
            System.out.println("\n\n--------------Digite qual operação deseja realizar--------------");
            System.out.println("S - SOMA / U - SUBTRAÇÃO / X - MULTIPLICAÇÃO / D - DIVISÃO");
            System.out.println("Ou digite # para sair do sistema: ");
            option = scan.next();

            if (option != "#") {

                System.out.println("Informe o primeiro número: ");
                float num1 = scan.nextFloat();

                System.out.println("Informe o segundo número: ");
                float num2 = scan.nextFloat();

                switch (option) {
                    case "S":
                        res = soma(num1, num2);
                        System.out.printf("RESPOSTA: %.3f + %.3f = %.3f", num1, num2, res);
                        break;

                    case "U":
                        res = sub(num1, num2);
                        System.out.printf("RESPOSTA: %.3f - %.3f = %.3f", num1, num2, res);
                        break;
                    case "X":
                        res = mult(num1, num2);
                        System.out.printf("RESPOSTA: %.3f x %.3f = %.3f", num1, num2, res);
                        break;
                    case "D":
                        res = div(num1, num2);
                        System.out.printf("RESPOSTA: %.3f / %.3f = %.3f", num1, num2, res);
                        break;

                    default:
                        break;
                }
            }
        }

        scan.close();

    }

    static float soma(float num1, float num2) {
        return num1 + num2;
    }

    static float sub(float num1, float num2) {
        return num1 - num2;
    }

    static float div(float num1, float num2) {
        return num1 / num2;
    }

    static float mult(float num1, float num2) {
        return num1 * num2;
    }
}
