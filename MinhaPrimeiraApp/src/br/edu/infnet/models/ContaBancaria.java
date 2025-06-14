package br.edu.infnet.models;

public class ContaBancaria {
    public String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Saque inválido! Saldo insuficiente ou valor negativo.");
        }
    }

    // Método para exibir saldo
    public void exibirSaldo() {
        System.out.printf("Saldo atual da conta de %s: R$ %.2f\n", titular, saldo);
    }
}
