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

    public void listarEmOrdem(arvore p) {
        if (p != null) {
            listarEmOrdem(p.esq);
            System.out.println(" " + p.dado);
            listarEmOrdem(p.dir);
        }
    }

    public int contaNos(arvore p, int cont) {

        if (p != null) {
            cont += 1;
            cont = contaNos(p.esq, cont);
            cont = contaNos(p.dir, cont);

        }
        return cont;
    }

    public boolean consulta(arvore p, int info) {
        if (p == null)
            return false;
        else {
            if (p.dado == info)
                return true;
            else {
                if (info < p.dado)
                    return consulta(p.esq, info);
                else
                    return consulta(p.dir, info);
            }
        }
    }

    public int contaConsulta(arvore p, int info, int cont) {

        if (p != null) {
            cont++;
            if (p.dado == info)
                return cont;
            else {
                if (info < p.dado)
                    cont = contaConsulta(p.esq, info, cont);
                else
                    cont = contaConsulta(p.dir, info, cont);
            }

        }
        return cont;
    }

    public arvore removeValor(arvore p, int info){

        if (p!= null){
            if (info == p.dado){
                if (p.esq == null && p.dir == null){
                    return null;
                }
                if (p.esq == null){
                    return p.dir;
                }
            }
            else {
                if (info < p.dado)
                    p.esq = removeValor(p.esq, info);
                else
                    p.dir = removeValor(p.dir, info);
            }
        }
    }

}
