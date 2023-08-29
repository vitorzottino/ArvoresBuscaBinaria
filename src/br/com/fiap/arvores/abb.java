package br.com.fiap.arvores;

public class abb {
    private class arvore {
        int dado;
        arvore esq, dir;
    }

    public arvore root = null;

    public arvore insert(arvore p, int info) {
        if (p == null) {
            p = new arvore();
            p.dado = info;
            p.dir = null;
            p.esq = null;
        } else if (info < p.dado)
            p.esq = insert(p.esq, info);
        else
            p.dir = insert(p.dir, info);
        return p;
    }

    public void listarEmOrdem(arvore p){
        if(p != null){
            listarEmOrdem(p.esq);
            System.out.println(" " + p.dado);
            listarEmOrdem(p.dir);
        }
    }

    public int contaNos(arvore p, int cont){

        if(p!= null){
            cont +=1;
            cont = contaNos(p.esq, cont);
            cont = contaNos(p.dir, cont);

        }
        return cont;
    }
}
