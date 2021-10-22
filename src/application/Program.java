package application;

import entities.ConversaoDireta;
import entities.ConversaoSistema;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        boolean menu = true;
        int opcao;
        try {
            while (menu) {
                System.out.println("Digite um número para selecionar a opção:");
                System.out.println("1-Realizar conversão a partir de moedas cadastradas no sistema.");
                System.out.println("2-Realizar conversão a partir do valor de conversão.");
                System.out.println("3-Para fechar o programa.");
                opcao = sca.nextInt();
                sca.nextLine();
                switch (opcao) {
                    case 1:
                        ConversaoSistema.principal();
                        break;
                    case 2:
                        ConversaoDireta.conversao();
                        break;
                    case 3:
                        System.out.println("Obrigado por usar nosso software.Até mais!");
                        menu = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor insira novamente a opção desejada!");
                        break;
                }
            }
        }
        catch (NoSuchElementException e){
            System.out.println("pronto" + e.getMessage());

        }
    }
}
