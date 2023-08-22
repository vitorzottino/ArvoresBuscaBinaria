package br.com.fiap.test;

import br.com.fiap.arvores.abb;

public class Main {
    public static void main(String[] args) {
        abb abb = new abb();
        abb.root = abb.insert(abb.root, 6);
        abb.root = abb.insert(abb.root, 10);
        abb.root = abb.insert(abb.root, 4);
        abb.root = abb.insert(abb.root, 7);
        System.out.println("Apresentando os elementos da ABB");
        abb.listarEmOrdem(abb.root);

    }

}