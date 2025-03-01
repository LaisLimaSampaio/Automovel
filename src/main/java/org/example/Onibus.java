package org.example;

public class Onibus extends Veiculo{
    private int quantidadeeixos;

    public Onibus(String marca, String modelo, int ano, int capacidadeDePassageiro, double combustivel, int quantidadeeixos) {
        super(marca, modelo, ano, capacidadeDePassageiro, combustivel);
        if (quantidadeeixos < 8 && quantidadeeixos > 6) {
            this.quantidadeeixos = quantidadeeixos;
        }
    }

    @Override
    double calcularAutonomia() {
        return 200.0 * 5.0;
    }
}
