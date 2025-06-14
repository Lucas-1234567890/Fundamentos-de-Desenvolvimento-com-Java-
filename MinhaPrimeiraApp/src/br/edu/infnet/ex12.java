package br.edu.infnet;

import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mensagens = new String[10];

        System.out.println("===== Sistema de Chat Simples =====");

        // Capturando os nomes dos usuários
        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        // Variável pra controlar de quem é a vez
        String usuarioAtual;
        for (int i = 0; i < 10; i++) {
            // Alterna entre usuário1 e usuário2
            usuarioAtual = (i % 2 == 0) ? usuario1 : usuario2;

            System.out.print(usuarioAtual + ", digite sua mensagem: ");
            String mensagem = scanner.nextLine();

            // Salva a mensagem formatada no array
            mensagens[i] = usuarioAtual + ": " + mensagem;
        }

        // Exibindo o histórico de mensagens
        System.out.println("\n===== Histórico de Mensagens =====");
        for (String msg : mensagens) {
            System.out.println(msg);
        }

        // Mensagem de despedida
        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");

        scanner.close();
    }
}
