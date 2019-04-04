package br.com.bb;

import java.util.*;

public class Banco {
    private List<Conta> listaContas=null;

    Banco(){
        listaContas= new LinkedList<>(); }

    public boolean cadastrarConta(int n,String t,double s){
        for (Conta listaConta : listaContas)
            if (listaConta.getNumero() == n)
                return false;
        Conta temp= new Conta(n,t,s);
        return listaContas.add(temp);
    }
    public int quantidadeContas(){
        return listaContas.size();
    }

}
