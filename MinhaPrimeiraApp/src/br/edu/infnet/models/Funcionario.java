package br.edu.infnet.models;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;  // Regra padrão (sem alteração)
    }

    public void exibirSalario() {
        System.out.printf("%s - Salário Final: R$ %.2f\n", nome, calcularSalario());
    }
}
