package br.com.bb;

public class Conta {
    //área de atributos
    private int numero;
    private String titular;
    private double saldo;

    //construtor
    Conta(){
        this(0,"--sem nome--",0);
    }
    Conta(int n, String t, double s){
        setNumero(n);
        setTitular(t);
        saldo=s;
    }
    //área de métodos
    public void setNumero(int umNumero) {
        if (umNumero>0)
            numero = umNumero;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() { return titular; }

    public double getSaldo() { return saldo; }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void sacar(double v){
        if (v<this.saldo && v>0)
            saldo-=v;
    }
    public void depositar(double v){
        if(v>0)
        saldo+=v;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo= R$" + saldo +
                '}';
    }
}
