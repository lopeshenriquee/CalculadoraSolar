package com.lopes.calculadorasolar.VIEW;

import com.lopes.calculadorasolar.CONTROLLER.BD;
import com.lopes.calculadorasolar.CONTROLLER.Utilitarios;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class JHistorico extends javax.swing.JFrame {

    public JHistorico() {
        initComponents();
        this.setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(176, 220, 194));
        btnPesquisar.setBackground(new Color(93, 196, 96));
        btnVoltar.setBackground(new Color(93, 196, 96));

        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        Utilitarios.manipularImgLogo(lblImgLogo);
        Utilitarios.mostrandoData(lblData);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblData = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHistorico = new javax.swing.JTable();
        lblImgLogo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Solar");
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(1040, 600));
        setPreferredSize(new java.awt.Dimension(1040, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData.setText("Data");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblTitulo.setText("Histórico");

        tblHistorico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Economia (R$)", "Consumo (kWh)", "Tarifa (kWh)", "Quantidade de Painéis", "Potência (kWh)", "Incentivo (%)"
            }
        ));
        tblHistorico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblHistorico.setRowHeight(25);
        tblHistorico.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblHistorico.setShowGrid(true);
        jScrollPane1.setViewportView(tblHistorico);

        lblImgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgLogo.setText("Logo");

        btnVoltar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.setAlignmentY(0.0F);
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.background"));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setAlignmentY(0.0F);
        btnPesquisar.setBorder(null);
        btnPesquisar.setBorderPainted(false);
        btnPesquisar.setPreferredSize(new java.awt.Dimension(80, 35));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(lblTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 156, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblTitulo)))
                .addGap(40, 40, 40)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblHistorico.getModel();
        modelo.setRowCount(0);
        System.out.println("Chamando listarConsultas...");
        BD.listarConsultas(modelo);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Data");
        model.addColumn("Economia(R$)");
        model.addColumn("Consumo Mensal (kWh)");
        model.addColumn("Tarifa (R$)");
        model.addColumn("Quantidade de Painéis (kW)");
        model.addColumn("Potência do Painel");
        model.addColumn("Incentivo");

        tblHistorico.setModel(model);

        DefaultTableModel modelo = (DefaultTableModel) tblHistorico.getModel();
        BD.listarConsultas(modelo);
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnPesquisar;
    public javax.swing.JButton btnVoltar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblImgLogo;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JTable tblHistorico;
    // End of variables declaration//GEN-END:variables
}
