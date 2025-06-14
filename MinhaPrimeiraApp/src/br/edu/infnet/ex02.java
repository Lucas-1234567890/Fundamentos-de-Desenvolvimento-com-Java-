package br.edu.infnet;

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String senha;
        boolean senhaValida = false;

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        while (!senhaValida) {
            System.out.print("Digite uma senha: ");
            senha = scanner.nextLine();

            boolean temTamanho = senha.length() >= 8;
            boolean temMaiuscula = senha.matches(".*[A-Z].*");
            boolean temNumero = senha.matches(".*\\d.*");
            boolean temEspecial = senha.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

            if (!temTamanho) {
                System.out.println("Erro: A senha deve ter no mínimo 8 caracteres.");
            }
            if (!temMaiuscula) {
                System.out.println("Erro: A senha deve conter pelo menos uma letra maiúscula.");
            }
            if (!temNumero) {
                System.out.println("Erro: A senha deve conter pelo menos um número.");
            }
            if (!temEspecial) {
                System.out.println("Erro: A senha deve conter pelo menos um caractere especial.");
            }

            if (temTamanho && temMaiuscula && temNumero && temEspecial) {
                senhaValida = true;
                System.out.println("Senha cadastrada com sucesso! Bem-vindo, " + nome + "!");
            } else {
                System.out.println("Por favor, tente novamente.\n");
            }
        }

        scanner.close();
    }
}
