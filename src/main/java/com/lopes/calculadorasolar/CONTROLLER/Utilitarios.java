/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lopes.calculadorasolar.CONTROLLER;

import java.awt.Image;
import java.time.LocalDate;
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
    
    public static void manipularImgConfiguracoes (JLabel label){
        ImageIcon icon = new ImageIcon("src/main/java/com/lopes/calculadorasolar/view/img/settings.png");
        Image imagemRedimensionada = icon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), 1);
        label.setIcon(new ImageIcon(imagemRedimensionada));
    }
    
    public static LocalDate pegarDataSQL() {
        return LocalDate.now(); // Retorna a data atual como LocalDate
    }

    public static String pegarDataAtual() {
        return LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static void mostrandoData(JLabel data) {
        data.setText("Data Atual: " + pegarDataAtual());
    }
}
