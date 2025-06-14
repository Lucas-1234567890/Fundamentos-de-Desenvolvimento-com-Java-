package br.edu.infnet;

import br.edu.infnet.models.ContaBancaria;

public class ex09 {

    public static void main(String[] args) {
        // Criando a conta
        ContaBancaria conta = new ContaBancaria("Lucas Amorim");

        // Operações
        conta.exibirSaldo();

        conta.depositar(1000);
        conta.exibirSaldo();

        conta.sacar(300);
        conta.exibirSaldo();

        conta.sacar(800); // Teste de saque maior que o saldo
        conta.exibirSaldo();
    }
}
