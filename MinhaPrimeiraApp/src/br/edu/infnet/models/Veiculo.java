package br.edu.infnet.models;

public class Veiculo {
	 private String placa;
	    private String modelo;
	    private int anoFabricacao;
	    private double quilometragem;

	    // Construtor
	    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
	        this.placa = placa;
	        this.modelo = modelo;
	        this.anoFabricacao = anoFabricacao;
	        this.quilometragem = quilometragem;
	    }

	    // Método para exibir detalhes
	    public void exibirDetalhes() {
	        System.out.println("Placa: " + placa);
	        System.out.println("Modelo: " + modelo);
	        System.out.println("Ano de Fabricação: " + anoFabricacao);
	        System.out.println("Quilometragem: " + quilometragem + " km");
	        System.out.println("-----------------------------------");
	    }

	    // Método para registrar uma viagem
	    public void registrarViagem(double km) {
	        if (km > 0) {
	            quilometragem += km;
	            System.out.println("Viagem registrada: +" + km + " km");
	        } else {
	            System.out.println("Erro: Quilometragem inválida!");
	        }
	    }
	}

