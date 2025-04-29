package com.lopes.calculadorasolar.CONTROLLER;

import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BD {

    public static String URL;
    public static String USUARIO;
    public static String SENHA;

    static {
        try {
            Properties props = new Properties();
            InputStream input = BD.class.getClassLoader().getResourceAsStream("config.properties");

            props.load(input);

            URL = props.getProperty("db.url");
            USUARIO = props.getProperty("db.usuario");
            SENHA = props.getProperty("db.senha");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao carregar o arquivo de configuração.");
        }
    }

    public static void salvarSimulacao(double consumo, double tarifa, double potencia, int quantidade, double incentivo, double economia) {

        String query = "INSERT INTO tb_registros (data_atual, consumo_mensal, tarifa_kwh, potencia_painel, qtd_paineis, incentivo, economia_estimada) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (
                Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA); PreparedStatement stmt = conn.prepareStatement(query)) {

            Date data_atual = Date.valueOf(Utilitarios.pegarDataSQL());

            stmt.setDate(1, data_atual);
            stmt.setDouble(2, consumo);
            stmt.setDouble(3, tarifa);
            stmt.setDouble(4, potencia);
            stmt.setInt(5, quantidade);
            stmt.setDouble(6, incentivo);
            stmt.setDouble(7, economia);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao salvar os dados no banco.");
        }
    }

    public static void listarConsultas(DefaultTableModel modelo) {
        String quuery = "SELECT * FROM tb_registros ORDER BY data_atual DESC LIMIT 10";

        try (
                Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA); PreparedStatement stmt = conn.prepareStatement(quuery); ResultSet rs = stmt.executeQuery()) {

            modelo.setRowCount(0);
            
            while (rs.next()) {
                Date data_atual = rs.getDate("data_atual");
                double consumo_mensal = rs.getDouble("consumo_mensal");
                double tarifa_kwh = rs.getDouble("tarifa_kwh");
                double potencia_painel = rs.getDouble("potencia_painel");
                int qtd_paineis = rs.getInt("qtd_paineis");
                double incentivo = rs.getDouble("incentivo");
                double economia_estimada = rs.getDouble("economia_estimada");

                modelo.addRow(new Object[]{data_atual,
                    economia_estimada,
                    consumo_mensal,
                    tarifa_kwh,
                    qtd_paineis,
                    potencia_painel,
                    incentivo
                });

            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao consultar dados no banco");
        }
    }
}
