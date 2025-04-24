
package com.lopes.calculadorasolar.VIEW;

import com.lopes.calculadorasolar.CONTROLLER.Utilitarios;
import java.awt.Color;

public class JInicial extends javax.swing.JFrame {

    public JInicial() {
        initComponents();
        this.setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(176, 220, 194));
        btnSimular.setBackground(new Color(93, 196, 96));
        btnSair.setBackground(new Color(93, 196, 96));

        Utilitarios.manipularImgLogo(lblImgLogo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        btnSimular = new javax.swing.JButton();
        lblImgLogo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Versão 1.01");
        setBackground(java.awt.SystemColor.activeCaption);
        setName("FrameInicial"); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblTitulo.setText("Calculadora Solar");

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblSubtitulo.setText("Seja Bem-Vindo");

        btnSimular.setBackground(new java.awt.Color(102, 102, 102));
        btnSimular.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSimular.setForeground(new java.awt.Color(255, 255, 255));
        btnSimular.setText("Simular");
        btnSimular.setToolTipText("");
        btnSimular.setAlignmentY(0.0F);
        btnSimular.setBorder(null);
        btnSimular.setBorderPainted(false);
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });

        lblImgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgLogo.setText("logo");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSubtitulo)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSubtitulo)
                .addGap(29, 29, 29)
                .addComponent(btnSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lblTitulo.getAccessibleContext().setAccessibleName("lblTitulo");
        lblSubtitulo.getAccessibleContext().setAccessibleName("");
        btnSimular.getAccessibleContext().setAccessibleName("");
        btnSair.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new JMenu().setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_btnSimularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnSair;
    public javax.swing.JButton btnSimular;
    private javax.swing.JLabel lblImgLogo;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
