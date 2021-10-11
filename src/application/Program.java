package application;

import entities.ConversaoDireta;
import java.util.Scanner;

public class Program {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        while(menu) {
            System.out.println("Digite um número para selecionar a opção:");
            System.out.println("1-Realizar conversão a partir de moedas cadastradas no sistema.");
            System.out.println("2-Realizar conversão a partir do valor de conversão.");
            System.out.println("3-Para fechar o programa.");
            int opcao = sc.nextInt();
            if (opcao == 1) {
                //implementar
            } else if (opcao == 2) {
                ConversaoDireta.conversao();
            }else if(opcao==3){
                System.out.println("Obrigado por usar nosso software.Até mais!");
                menu = false;
            } else {
                System.out.println("Opção inválida. Por favor insira novamente a opção desejada!");
            }
        }
    }
}
