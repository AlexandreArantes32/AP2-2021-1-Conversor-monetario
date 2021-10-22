package entities;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConversaoSistema{

    static ArrayList<moeda> listaDemoedas = new ArrayList();

    public static void principal() {
        Scanner sc = new Scanner(System.in);
        int opcao;
        boolean menu = true;
        try {
            while (menu) {
                System.out.println("Escolha uma das opções:");
                System.out.println("1- Cadastrar uma nova moeda no Sistema");
                System.out.println("2- Atualizar/consultar uma moeda cadastrada");
                System.out.println("3- Realizar conversão");
                System.out.println("4- Voltar ao menu principal");
                opcao = sc.nextInt();
                sc.nextLine();
                switch (opcao) {
                    case 1 -> {
                        moeda currency = new moeda();
                        System.out.println("Qual o nome da moeda que deseja cadastrar?");
                        currency.nome = sc.nextLine();
                        System.out.println("Qual o país dessa moeda?");
                        currency.pais = sc.nextLine();
                        System.out.println("Qual o valor universal dessa moeda?");
                        currency.valor = sc.nextFloat();
                        listaDemoedas.add(currency);
                    }
                    case 2 -> {
                        int escolha;
                        System.out.println("1- Atualizar moeda por nome");
                        System.out.println("2- Atualizar moeda por pais");
                        System.out.println("3- Listar moedas cadastradas");
                        System.out.println("4- Consultar moeda");
                        escolha = sc.nextInt();
                        sc.nextLine();
                        ConversaoSistema.gerenciarMoedas(escolha);

                    }
                    case 3 -> ConversaoSistema.conversao();
                    case 4 -> menu = false;
                    default -> System.out.println("Opção não encontrada! Insira algum valor novamente");
                }
            }
        }
        catch (NoSuchElementException e){
            sc.nextLine();
        }
    }
    
    public static void gerenciarMoedas(int escolha){
        Scanner sc = new Scanner(System.in);
        String nome1;
        int aux=-1;
        switch (escolha) {
            case 1 ->{
                System.out.println("Qual o nome da moeda pra ser atualizada!");
                nome1 = sc.nextLine();
                for( int i =0;i < listaDemoedas.size();i++){
                    if(listaDemoedas.get(i).getNome().equals(nome1)){
                        aux = i;
                    }
                }
                if(aux==-1){
                    System.out.println("Não há moeda com esse nome");
                }
                else{
                    moeda currency = new moeda();
                    System.out.println("Qual o novo nome da moeda que deseja cadastrar?");
                    currency.nome = sc.nextLine();
                    System.out.println("Qual o nome do país dessa moeda?");
                    currency.pais = sc.nextLine();
                    System.out.println("Qual o valor universal dessa moeda?");
                    currency.valor = sc.nextFloat();
                    listaDemoedas.set(aux, currency);
                }
            }
            case 2 -> {
                System.out.println("Qual o país da moeda pra ser atualizada!");
                nome1 = sc.nextLine();
                for( int i =0;i < listaDemoedas.size();i++){
                    if(listaDemoedas.get(i).getPais().equals(nome1)){
                        aux = i;
                    }
                }
                if(aux==-1){
                    System.out.println("Não há moeda pertencente a esse país");
                    sc.nextLine();
                }
                else{
                    moeda currency = new moeda();
                    System.out.println("Qual o novo nome da moeda que deseja cadastrar?");
                    currency.nome = sc.nextLine();
                    System.out.println("Qual o nome do país dessa moeda?");
                    currency.pais = sc.nextLine();
                    System.out.println("Qual o valor universal dessa moeda?");
                    currency.valor = sc.nextFloat();
                    listaDemoedas.set(aux, currency);
                    sc.nextLine();
                }
            }
            case 3 -> {
                for (int i = 0; i < listaDemoedas.size(); i++) {
                    System.out.println("\nNome: " + listaDemoedas.get(i).getNome() + "\n");
                    System.out.println("País: " + listaDemoedas.get(i).getPais() + "\n");
                    System.out.println("Valor universal: " + listaDemoedas.get(i).getValor() + " ");
                }
            }
            case 4 -> {
                int qualquer;
                System.out.println("Qual o nome da moeda que deseja procurar?");
                nome1 = sc.nextLine();
                for (int i = 0; i < listaDemoedas.size(); i++) {
                    if (listaDemoedas.get(i).getNome().equals(nome1)) {
                        System.out.println("\nNome: " + listaDemoedas.get(i).getNome() + "\n");
                        System.out.println("País: " + listaDemoedas.get(i).getPais() + "\n");
                        System.out.println("Valor universal: " + listaDemoedas.get(i).getValor() + " ");
                    }
                }
                System.out.println("Digite qualquer coisa pra sair!");
                qualquer = sc.nextInt();
                sc.nextLine();
            }
            default -> System.out.println("Opção inválida!");
        }
    }

    public static void conversao(){
        Scanner sc = new Scanner(System.in);
        String nome1;
        int valor1 = 0;
        String nome2;
        float valor2;
        int valor3 = 0;
        float aux;
        System.out.println("Qual o nome da moeda que você possui?");
        nome1 = sc.nextLine();
        System.out.println("Qual o nome da moeda que vai ser convertida?");
        nome2 = sc.nextLine();
        System.out.println("Insira a quantia a ser convertida:");
        valor2 = sc.nextFloat();
        sc.nextLine();
        for( int i =0;i < listaDemoedas.size();i++){
            if(listaDemoedas.get(i).getNome().equals(nome1)){
                valor1 = i;
            }
            if(listaDemoedas.get(i).getNome().equals(nome2)){
                valor3 = i;
            }
        }
        aux = (listaDemoedas.get(valor1).getValor()/listaDemoedas.get(valor3).getValor())*valor2;
        System.out.println("\n" + valor2 + " em " + nome2 + " equivale a "+ aux + " de " + nome1);
    }
}
