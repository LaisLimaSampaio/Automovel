package org.example;

abstract public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private int capacidadeDePassageiro;
    private double combustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidadeDePassageiro, double combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadeDePassageiro = capacidadeDePassageiro;
        this.combustivel = combustivel;
    }

    public Veiculo() {
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.capacidadeDePassageiro = 0;
        this.combustivel = 0;
    }
    abstract double calcularAutonomia();

    void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Capacidade: " + capacidadeDePassageiro);
        System.out.println("Combustivel: " + combustivel);
    }

}

