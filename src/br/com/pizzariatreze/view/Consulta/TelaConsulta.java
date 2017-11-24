/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzariatreze.view.Consulta;

import br.com.pizzariatreze.view.TelaInicial;

/**
 *
 * @author gabriel
 */
public class TelaConsulta extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsulta
     */
    public TelaConsulta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonConsultaCliente = new javax.swing.JButton();
        jButtonConsultaFuncionario = new javax.swing.JButton();
        jButtonConsultaEstoque = new javax.swing.JButton();
        jButtonConsultarMesa = new javax.swing.JButton();
        jLabelVoltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Consultas");

        jButtonConsultaCliente.setText("Cliente");
        jButtonConsultaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConsultaClienteMouseClicked(evt);
            }
        });

        jButtonConsultaFuncionario.setText("Funcionário");
        jButtonConsultaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConsultaFuncionarioMouseClicked(evt);
            }
        });

        jButtonConsultaEstoque.setText("Produto/Estoque");
        jButtonConsultaEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConsultaEstoqueMouseClicked(evt);
            }
        });

        jButtonConsultarMesa.setText("Exibir Mesas");
        jButtonConsultarMesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConsultarMesaMouseClicked(evt);
            }
        });

        jLabelVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVoltar.setText("Voltar");
        jLabelVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(289, 289, 289)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonConsultaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonConsultarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonConsultaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 295, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jButtonConsultaCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsultaFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsultaEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsultarMesa)
                .addGap(47, 47, 47)
                .addComponent(jLabelVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVoltarMouseClicked
        // TODO add your handling code here:
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabelVoltarMouseClicked

    private void jButtonConsultaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaClienteMouseClicked
        // TODO add your handling code here:
        ConsultaCliente cc = new ConsultaCliente();
        cc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonConsultaClienteMouseClicked

    private void jButtonConsultaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaFuncionarioMouseClicked
        // TODO add your handling code here:
        ConsultaFuncionario cf = new ConsultaFuncionario();
        cf.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonConsultaFuncionarioMouseClicked

    private void jButtonConsultarMesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarMesaMouseClicked
        // TODO add your handling code here:
        ConsultaMesa cm = new ConsultaMesa();
        cm.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButtonConsultarMesaMouseClicked

    private void jButtonConsultaEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultaEstoqueMouseClicked
        // TODO add your handling code here:
        ConsultaEstoque ce = new ConsultaEstoque();
        ce.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonConsultaEstoqueMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultaCliente;
    private javax.swing.JButton jButtonConsultaEstoque;
    private javax.swing.JButton jButtonConsultaFuncionario;
    private javax.swing.JButton jButtonConsultarMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelVoltar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
