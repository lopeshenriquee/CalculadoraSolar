package com.lopes.calculadorasolar.CONTROLLER;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Properties;

public class BD {

    public static String URL;
    public static String USUARIO;
    public static String SENHA;

    static {
        try {
            Properties props = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            props.load(fis);
            
            URL = props.getProperty("db_url");
            USUARIO = props.getProperty("db_usuario");
            SENHA = props.getProperty("db_senha");
                    
        } catch (Exception e) {
            e.printStackTrace();
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
        }
    }

}
