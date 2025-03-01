package org.example;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadeDePassageiro, double combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadeDePassageiro, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    double calcularAutonomia() {

        if(capacidadeCarga<=25){
            double novoConsumo = 6.0 - ((6.0/100.0)*capacidadeCarga);
            return 300.0 * novoConsumo;
        }else {
            System.out.println("Limite Atingido");
            return 300.0 * 4.5;
        }
    }
}
