package org.example;

public class CarroEletrico extends Carro{

    private double bateriaKWh;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadeDePassageiro, double combustivel, TipoCarro tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadeDePassageiro, combustivel, tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    double calcularAutonomia() {
        return 5.0 * bateriaKWh;
    }
}
