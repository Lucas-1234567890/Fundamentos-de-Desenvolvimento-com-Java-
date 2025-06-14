package br.edu.infnet;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Set<Integer> numerosSorteados = new HashSet<>();
        Set<Integer> palpitesUsuario = new HashSet<>();

        // Gerando os 6 números aleatórios
        while (numerosSorteados.size() < 6) {
            int numero = random.nextInt(60) + 1; // Número entre 1 e 60
            numerosSorteados.add(numero);
        }

        System.out.println("--- Bem-vindo ao Jogo de Loteria ---");
        System.out.println("Digite 6 números entre 1 e 60 (sem repetir):");

        // Capturando os 6 palpites do usuário
        while (palpitesUsuario.size() < 6) {
            System.out.print("Digite o número " + (palpitesUsuario.size() + 1) + ": ");
            int palpite = scanner.nextInt();

            if (palpite < 1 || palpite > 60) {
                System.out.println("Número inválido! Digite entre 1 e 60.");
            } else if (palpitesUsuario.contains(palpite)) {
                System.out.println("Número repetido! Escolha outro.");
            } else {
                palpitesUsuario.add(palpite);
            }
        }

        // Calculando os acertos
        Set<Integer> acertos = new HashSet<>(palpitesUsuario);
        acertos.retainAll(numerosSorteados);

        // Exibindo resultado
        System.out.println("\nNúmeros Sorteados: " + numerosSorteados);
        System.out.println("Seus Palpites: " + palpitesUsuario);
        System.out.println("Total de acertos: " + acertos.size());
        System.out.println("Números que você acertou: " + acertos);

        scanner.close();
    }
}
