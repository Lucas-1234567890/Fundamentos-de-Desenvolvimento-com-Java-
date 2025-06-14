package br.edu.infnet;

import br.edu.infnet.models.Veiculo;

public class ex06 {

    public static void main(String[] args) {
        // Criando dois veículos com dados fictícios
        Veiculo carro1 = new Veiculo("ABC-1234", "Toyota Corolla", 2018, 45000);
        Veiculo carro2 = new Veiculo("XYZ-5678", "Honda Civic", 2020, 32000);

        // Exibindo detalhes iniciais
        System.out.println("--- Detalhes Iniciais ---");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();

        // Registrando viagens
        System.out.println("--- Registrando Viagens ---");
        carro1.registrarViagem(150);
        carro2.registrarViagem(300);

        // Exibindo detalhes atualizados
        System.out.println("\n--- Detalhes Após as Viagens ---");
        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
    }
}
