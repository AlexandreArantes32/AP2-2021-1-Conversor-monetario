package entities;

import java.util.Scanner;

public class ConversaoDireta {

    public static void conversao() {
        String nome1;
        float valor1;
        String nome2;
        float valor2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o nome da moeda que você possui?");
        nome1 = sc.nextLine();
        System.out.println("Qual o nome da moeda que vai ser convertida?");
        nome2 = sc.nextLine();
        System.out.println("Qual o valor unitário de " + nome1 +" em relação a " + nome2 + "?");
        valor1 = sc.nextFloat();
        System.out.println("Insira a quantia a ser convertida:");
        valor2 = sc.nextFloat();
        System.out.printf("%.2f em %s equivale a %.2f de %s.",valor2,nome2,valor1*valor2,nome1);
        sc.nextLine();

    }
}
