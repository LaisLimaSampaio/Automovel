package org.example;

public class CaminhaoRefrigerado extends Caminhao {
    private double temperaturaMinima;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadeDePassageiro, double combustivel, double capacidadeCarga, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadeDePassageiro, combustivel, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public double calcularAutonomia() {
        double autonomiaNormal = super.calcularAutonomia();
        return autonomiaNormal * 0.9;
    }
}
