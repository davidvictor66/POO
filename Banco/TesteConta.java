package br.com.bb;

public class TesteConta {
    public static void main(String[] args) {
        Conta o1= new Conta();
        Conta o2= new Conta(2,"David",50);

        o1.setNumero(1);
        o1.setTitular("Victor");
        o1.depositar(100);

        System.out.println(o1.toString());
        System.out.println(o2.toString());

    }
}
