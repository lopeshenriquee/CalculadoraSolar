
package com.lopes.calculadorasolar.MODEL;

public class Simulador {
    
    public static double calcularEconomia(double consumoMensal, double tarifaKWh, double potenciaPainel, int quantidadePaineis, double incentivo) {
        // Estimativa de geração mensal de energia pelos painéis solares
        double geracaoMensal = (potenciaPainel * quantidadePaineis * 5 * 30) / 1000;

        // Economia mensal
        double economiaMensal = (consumoMensal * tarifaKWh) - (geracaoMensal * tarifaKWh);

        // Aplicar incentivo (se houver)
        double economiaComIncentivo = economiaMensal * (1 + incentivo / 100);

        return economiaComIncentivo;
    }
       
}
