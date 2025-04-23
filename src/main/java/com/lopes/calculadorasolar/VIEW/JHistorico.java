package com.lopes.calculadorasolar.VIEW;

import com.lopes.calculadorasolar.CONTROLLER.Utilitarios;
import java.awt.Color;

public class JHistorico extends javax.swing.JFrame {

    public JHistorico() {
        initComponents();
        this.setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(176, 220, 194));
        btnPesquisar.setBackground(new Color(93, 196, 96));
        btnVoltar.setBackground(new Color(93, 196, 96)); 

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
        lblConsumo = new javax.swing.JLabel();
        txtConsumo = new javax.swing.JTextField();
        txtConsumo1 = new javax.swing.JTextField();
        lblConsumo1 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Calculadora Solar");
        setMaximumSize(null);
        setMinimumSize(new java.awt.Dimension(1040, 600));
        setPreferredSize(new java.awt.Dimension(1040, 600));

        lblData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblData.setText("Data");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblTitulo.setText("Histórico");

        tblHistorico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Economia", "Consumo Mensal", "Tarifa", "Qtd Painéis", "Incentivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        lblConsumo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblConsumo.setText("-");

        txtConsumo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtConsumo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblConsumo1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblConsumo1.setText("Período:");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblConsumo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblConsumo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConsumo1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtConsumo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblConsumo)
                        .addComponent(lblConsumo1)))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
    private javax.swing.JLabel lblConsumo;
    private javax.swing.JLabel lblConsumo1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblImgLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblHistorico;
    private javax.swing.JTextField txtConsumo;
    private javax.swing.JTextField txtConsumo1;
    // End of variables declaration//GEN-END:variables
}
