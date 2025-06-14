package br.edu.infnet;

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal (R$): ");
        double salarioMensal = scanner.nextDouble();

        double salarioAnual = salarioMensal * 12;
        double imposto = 0;

        if (salarioAnual <= 22847.76) {
            System.out.println("Isento de imposto de renda.");
        } else if (salarioAnual <= 33919.80) {
            imposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = salarioAnual * 0.15;
        } else {
            imposto = salarioAnual * 0.275;
        }

        double salarioLiquido = salarioAnual - imposto;

        System.out.println("\n--- Resultado ---");
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Anual: R$ %.2f\n", salarioAnual);
        System.out.printf("Imposto a pagar: R$ %.2f\n", imposto);
        System.out.printf("Salário Líquido Anual: R$ %.2f\n", salarioLiquido);

        scanner.close();
    }
}
