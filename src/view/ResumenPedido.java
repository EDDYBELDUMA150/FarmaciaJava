/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Shalva
 */
public class ResumenPedido extends javax.swing.JFrame {

    /**
     * Creates new form ResumenPedido
     */
    public ResumenPedido() {
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
        jltitulo = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlMedicamento = new javax.swing.JLabel();
        jltipomedi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlsucursa = new javax.swing.JLabel();
        btenviar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jltitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jltitulo.setText("Informacion de pedido");
        jPanel1.add(jltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabelCantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 40, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("unidades del ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jlMedicamento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(jlMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 180, 20));

        jltipomedi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jPanel1.add(jltipomedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 120, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("•");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 20, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Para la Farmacia situada en:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jlsucursa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlsucursa.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(jlsucursa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 480, 20));

        btenviar.setBackground(new java.awt.Color(153, 255, 0));
        btenviar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btenviar.setText("Enviar");
        jPanel1.add(btenviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        btcancelar.setBackground(new java.awt.Color(153, 255, 0));
        btcancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btcancelar.setText("Cancelar");
        jPanel1.add(btcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    public JLabel getjLabelCantidad() {
        return jLabelCantidad;
    }

    public void setjLabelCantidad(JLabel jLabelCantidad) {
        this.jLabelCantidad = jLabelCantidad;
    }

    public JLabel getJlMedicamento() {
        return jlMedicamento;
    }

    public void setJlMedicamento(JLabel jlMedicamento) {
        this.jlMedicamento = jlMedicamento;
    }

    public JLabel getJlsucursa() {
        return jlsucursa;
    }

    public void setJlsucursa(JLabel jlsucursa) {
        this.jlsucursa = jlsucursa;
    }

    public JLabel getJltipomedi() {
        return jltipomedi;
    }

    public void setJltipomedi(JLabel jltipomedi) {
        this.jltipomedi = jltipomedi;
    }

    public JLabel getJltitulo() {
        return jltitulo;
    }

    /**
     * @param args the command line arguments
     */
    public void setJltitulo(JLabel jltitulo) {
        this.jltitulo = jltitulo;
    }

    public JButton getBtcancelar() {
        return btcancelar;
    }

    public void setBtcancelar(JButton btcancelar) {
        this.btcancelar = btcancelar;
    }

    public JButton getBtenviar() {
        return btenviar;
    }

    public void setBtenviar(JButton btenviar) {
        this.btenviar = btenviar;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btenviar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlMedicamento;
    private javax.swing.JLabel jlsucursa;
    private javax.swing.JLabel jltipomedi;
    private javax.swing.JLabel jltitulo;
    // End of variables declaration//GEN-END:variables
}
