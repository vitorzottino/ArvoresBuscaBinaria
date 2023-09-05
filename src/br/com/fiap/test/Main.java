package br.com.fiap.test;

import br.com.fiap.arvores.abb;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        abb abb = new abb();
        int opcao;
        do {
            System.out.println(" 0 - Sair");
            System.out.println(" 1 - Inserir");
            System.out.println(" 2 - Apresentar em Ordem Crescente");
            System.out.println(" 3 - Apresentar Quantidade de Nos");
            System.out.println(" 4 - Consultar a presenca de 1 valor na ABB");
            System.out.println(" 5 - Apresenta quantidade de comparacoes para pesquisar 1 valor na ABB");
            System.out.println(" 6 - Remove 1 valor da ABB");
            opcao = input.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println(" Encerrando o programa");
                    break;
                case 1:
                    System.out.print(" Informe o valor do dado: ");
                    int info = input.nextInt();
                    abb.root = abb.insert(abb.root, info);
                    break;
                case 2:
                    System.out.println("Apresentando os valores da ABB");
                    abb.listarEmOrdem(abb.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Quantidade de nos = " + abb.contaNos(abb.root, 0));
                    break;
                case 4:
                    System.out.print(" Informe o valor do dado a ser pesquisado: ");
                    info = input.nextInt();
                    if (abb.consulta(abb.root, info))
                        System.out.println("Valor esta na ABB");
                    else
                        System.out.println("Valor NAO esta na ABB");
                    break;
                case 5:
                    System.out.print(" Informe o valor do dado a ser pesquisado: ");
                    info = input.nextInt();
                    System.out.println("Quantidade de comparacoes realizadas foi: " + abb.contaConsulta(abb.root, info, 0));
                    break;
                case 6:
                    System.out.print(" Informe o valor do dado a ser removido: ");
                    info = input.nextInt();
                    abb.root = abb.removeValor(abb.root, info);
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 0);

    }

}