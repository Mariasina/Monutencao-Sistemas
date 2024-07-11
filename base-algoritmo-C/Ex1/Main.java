import java.util.Scanner;

//exercicio9aulapratica.c
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float lanche = 0, bebida = 0, total = 0;

        System.out.println("Qual o código do seu sanduíche: ");
        int cod1 = scan.nextInt();

        System.out.println("Qual o código da sua bebida: ");
        int cod2 = scan.nextInt();

        switch (cod1) {
            case 100:
                lanche = 1.20f;
                System.out.println("R$ 1,20");
                break;
            case 101:
                lanche = 1.30f;
                System.out.println("R$ 1,30");
                break;
            case 102:
                lanche = 1.50f;
                System.out.println("R$ 1,50");
                break;
            case 103:
                lanche = 1.70f;
                System.out.println("R$ 1,70");
                break;

            default:
                System.out.println("Cod inexistente");
                break;
        }

        switch (cod2) {
            case 201:
                bebida = 1.20f;
                System.out.println("R$ 1,20");
                break;
            case 202:
                bebida = 1.50f;
                System.out.println("R$ 1,50");
                break;
            case 203:
                bebida = 0.70f;
                System.out.println("R$ 0,70");
                break;

            default:
                System.out.println("Cod inexistente");
                break;
        }

        total = lanche + bebida;

        System.out.printf("Total a pagar: R$%.2f", total);

        scan.close();
    }
}