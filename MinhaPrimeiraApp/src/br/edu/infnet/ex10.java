package br.edu.infnet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caminhoArquivo = "compras.txt";

        try {
            
            FileWriter writer = new FileWriter(caminhoArquivo);

            System.out.println("--- Cadastro de Compras ---");
            for (int i = 1; i <= 3; i++) {
                System.out.printf("\nCompra %d:\n", i);

                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                System.out.print("Preço Unitário: ");
                double preco = Double.parseDouble(scanner.nextLine());

                // Grava no arquivo (Exemplo de linha: ProdutoX;5;10.50)
                writer.write(produto + ";" + quantidade + ";" + preco + "\n");
            }

            writer.close();
            System.out.println("\n✔ Dados salvos com sucesso em " + caminhoArquivo);

            // Parte 2: Leitura e exibição
            System.out.println("\n--- Compras Registradas ---");
            BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));

            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                String produto = partes[0];
                int quantidade = Integer.parseInt(partes[1]);
                double preco = Double.parseDouble(partes[2]);

                System.out.printf("Produto: %s | Quantidade: %d | Preço Unitário: R$ %.2f\n", produto, quantidade, preco);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro de formato numérico: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
