package org.example;

public class Carro extends Veiculo {
    private TipoCarro tipoCarro;

    public Carro(String marca, String modelo, int ano, int capacidadeDePassageiro, double combustivel, TipoCarro tipoCarro) {
        super(marca, modelo, ano, capacidadeDePassageiro, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    double calcularAutonomia() {
        return 12.0 * 50.0;
    }

}
