package br.edu.infnet;

import br.edu.infnet.models.Estagiario;
import br.edu.infnet.models.Funcionario;
import br.edu.infnet.models.Gerente;

public class ex08 {

    public static void main(String[] args) {
        // Criando um Gerente e um Estagiário
        Funcionario gerente = new Gerente("Carlos - Gerente", 5000);
        Funcionario estagiario = new Estagiario("Lucas - Estagiário", 2000);

        // Exibindo os salários finais
        System.out.println("--- Salários Finais ---");
        gerente.exibirSalario();
        estagiario.exibirSalario();
    }
}
