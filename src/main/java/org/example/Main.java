package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, 50, TipoCarro.SEDAN);
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2021, 2, 300, 10);
        Onibus onibus = new Onibus("Mercedes-Benz", "O500", 2020, 50, 200, 6);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2023, 5, 100, TipoCarro.SEDAN, 85);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "R450", 2022, 2, 300.0, 5, -5.0);

        // Exibindo detalhes e calculando autonomia
        System.out.println("=== Teste dos Veículos ===");

        System.out.println("\nCARRO:");
        carro.exibirDetalhes();
        System.out.println("Autonomia: " + carro.calcularAutonomia() + " km");

        System.out.println("\nCAMINHÃO:");
        caminhao.exibirDetalhes();
        System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km");

        System.out.println("\nÔNIBUS:");
        onibus.exibirDetalhes();
        System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km");

        System.out.println("\nCARRO ELÉTRICO:");
        carroEletrico.exibirDetalhes();
        System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km");


        System.out.println("CAMINHÃO REFRIGERADO:");
        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("Autonomia: " + caminhaoRefrigerado.calcularAutonomia() + " km");

    }
}