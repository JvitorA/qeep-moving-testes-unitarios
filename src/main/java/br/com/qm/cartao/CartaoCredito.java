package br.com.qm.cartao;

public class CartaoCredito {

	private double limite;
    private double saldo;

    public CartaoCredito(double limite, double saldo) {
        this.limite = limite;
        this.saldo = saldo;
    }

    public boolean realizaCompra(double valor) {

        if (limite >= valor) {
            this.saldo += valor;
            this.limite -= valor;
            return true;
        }

        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

}
