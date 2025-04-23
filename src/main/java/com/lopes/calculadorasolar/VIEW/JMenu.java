package com.lopes.calculadorasolar.VIEW;

import com.lopes.calculadorasolar.CONTROLLER.BD;
import com.lopes.calculadorasolar.CONTROLLER.Utilitarios;
import com.lopes.calculadorasolar.MODEL.Simulador;
import java.awt.Color;

public class JMenu extends javax.swing.JFrame {

    private JHistorico historico;

    public JMenu() {
        initComponents();
        this.setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(176, 220, 194));
        btnCalcular.setBackground(new Color(93, 196, 96));
        btnHistorico.setBackground(new Color(93, 196, 96));
        btnSair.setBackground(new Color(93, 196, 96));

        Utilitarios.manipularImgLogo(lblImgLogo);
        Utilitarios.manipularImgMenu(lblImgMenu);
        Utilitarios.manipularImgConfiguracoes(lblConfiguracoes);
        Utilitarios.mostrandoData(lblData);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblData = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblConsumo = new javax.swing.JLabel();
        lblTarifa = new javax.swing.JLabel();
        lblPotencia = new javax.swing.JLabel();
        lblQtd = new javax.swing.JLabel();
        lblIncentivo = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JTextField();
        txtTarifa = new javax.swing.JTextField();
        txtPotencia = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();
        lblImgMenu = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();
        lblImgLogo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        txtIncentivo = new javax.swing.JTextField();
        lblConfiguracoes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Calculadora Solar");
        setMinimumSize(new java.awt.Dimension(1040, 600));

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData.setText("Data");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblTitulo.setText("Descubra quanto irá economizar...");

        lblConsumo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblConsumo.setText("Consumo Mensal (kWh):");

        lblTarifa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTarifa.setText("Tarifa (R$/kWh):");

        lblPotencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPotencia.setText("Potência do Painel (kW):");

        lblQtd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblQtd.setText("Quantidade de Painéis:");

        lblIncentivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIncentivo.setText("Incentivo (%):");

        txtConsumo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTarifa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtPotencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtQtd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtResultado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(0, 0, 0));
        txtResultado.setEnabled(false);

        lblImgMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgMenu.setText("Imagem Menu");
        lblImgMenu.setToolTipText("");
        lblImgMenu.setAlignmentY(0.0F);
        lblImgMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnCalcular.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Calcular");
        btnCalcular.setAlignmentY(0.0F);
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.setPreferredSize(new java.awt.Dimension(60, 25));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnHistorico.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        btnHistorico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHistorico.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorico.setText("Ver Histórico");
        btnHistorico.setAlignmentY(0.0F);
        btnHistorico.setBorder(null);
        btnHistorico.setBorderPainted(false);
        btnHistorico.setPreferredSize(new java.awt.Dimension(100, 25));
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        lblImgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgLogo.setText("Logo");

        btnSair.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setAlignmentY(0.0F);
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblResultado.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblResultado.setText("Resultado: ");

        txtIncentivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblConfiguracoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfiguracoesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(lblTitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConsumo)
                    .addComponent(lblTarifa)
                    .addComponent(lblPotencia)
                    .addComponent(lblQtd)
                    .addComponent(lblIncentivo))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIncentivo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(lblImgMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(390, Short.MAX_VALUE)
                        .addComponent(lblResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303))
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(lblTitulo))
                    .addComponent(lblConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblConsumo)
                                    .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTarifa)
                                    .addComponent(txtTarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPotencia)
                                    .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblQtd)
                                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIncentivo)
                                    .addComponent(txtIncentivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lblImgMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblResultado))
                        .addGap(19, 19, 19)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void lblConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfiguracoesMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JConfiguracoes().setVisible(true);
            }
        });
    }//GEN-LAST:event_lblConfiguracoesMouseClicked

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JHistorico().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnHistoricoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            double consumo = Double.parseDouble(txtConsumo.getText());
            double tarifa = Double.parseDouble(txtTarifa.getText());
            double potencia = Double.parseDouble(txtPotencia.getText());
            int quantidade = Integer.parseInt(txtQtd.getText());
            double incentivo = Double.parseDouble(txtIncentivo.getText()) / 100;

            double economia = Simulador.calcularEconomia(consumo, tarifa, potencia, quantidade, incentivo);
            txtResultado.setText(String.format("%.2f", economia));

            BD.salvarSimulacao(consumo, tarifa, potencia, quantidade, incentivo, economia);
         
        } catch (NumberFormatException ex) {
            txtResultado.setText("Erro: Verifique os valores informados.");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnHistorico;
    public javax.swing.JButton btnSair;
    private javax.swing.JLabel lblConfiguracoes;
    private javax.swing.JLabel lblConsumo;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblImgLogo;
    private javax.swing.JLabel lblImgMenu;
    private javax.swing.JLabel lblIncentivo;
    private javax.swing.JLabel lblPotencia;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTarifa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtIncentivo;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtQtd;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtTarifa;
    // End of variables declaration//GEN-END:variables
}
