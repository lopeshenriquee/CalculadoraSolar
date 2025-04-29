/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lopes.calculadorasolar.CONTROLLER;

import java.awt.Image;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Utilitarios {

    public static void manipularImgLogo(JLabel label) {
        ImageIcon icon = new ImageIcon("src/main/java/com/lopes/calculadorasolar/view/img/logo.png");
        Image img = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), 1);
        label.setIcon(new ImageIcon(img));
    }

    public static void manipularImgMenu(JLabel label) {
        ImageIcon icon = new ImageIcon("src/main/java/com/lopes/calculadorasolar/view/img/solar pannel.png");
        Image img = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), 1);
        label.setIcon(new ImageIcon(img));
    }

    public static void manipularImgConfiguracoes(JLabel label) {
        ImageIcon icon = new ImageIcon(Utilitarios.class.getResource("/settings-icon.png"));
        Image imagemRedimensionada = icon.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(imagemRedimensionada));
    }

    public static void mostrandoData(JLabel data) {
        data.setText("Data Atual: " + pegarDataAtual());
    }

    public static LocalDate pegarDataSQL() {
        return LocalDate.now(); // Retorna a data atual como LocalDate
    }

    public static String pegarDataAtual() {
        return LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static Double devolverTarifa(String regiaoSelecionada) {
        Map<String, Double> tarifas = new HashMap<>();
        tarifas.put("Norte", 0.85);
        tarifas.put("Nordeste", 0.75);
        tarifas.put("Centro-Oeste", 0.65);
        tarifas.put("Sudeste", 0.60);
        tarifas.put("Sul", 0.55);

        System.out.println("Procurando tarifa para: " + regiaoSelecionada); // Debug

        if (regiaoSelecionada != null && tarifas.containsKey(regiaoSelecionada)) {
            Double tarifa = tarifas.get(regiaoSelecionada);
            System.out.println("Tarifa encontrada: " + tarifa); // Debug
            
            System.out.println("tarifa");
            return tarifa;
        } else {
            System.out.println("Tarifa nula: " + regiaoSelecionada); // Debug
            return 0.00;
        }

    }

}
