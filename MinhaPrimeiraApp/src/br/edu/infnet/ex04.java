package br.edu.infnet;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do empréstimo (R$): ");
        double valorEmprestimo = scanner.nextDouble();

        int parcelas;
        do {
            System.out.print("Digite a quantidade de parcelas (mínimo 6, máximo 48): ");
            parcelas = scanner.nextInt();

            if (parcelas < 6 || parcelas > 48) {
                System.out.println("Erro: Número de parcelas inválido. Tente novamente.");
            }
        } while (parcelas < 6 || parcelas > 48);

        double taxaJuros = 0.03; // 3% ao mês
        double valorTotal = valorEmprestimo * Math.pow(1 + taxaJuros, parcelas);
        double valorParcela = valorTotal / parcelas;

        System.out.println("\n--- Simulação de Empréstimo ---");
        System.out.println("Cliente: " + nome);
        System.out.printf("Valor Total a Pagar: R$ %.2f\n", valorTotal);
        System.out.printf("Valor da Parcela Mensal: R$ %.2f\n", valorParcela);

        scanner.close();
    }
}
