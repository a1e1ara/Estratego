/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectomarvelstratego;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabby
 */

import javax.swing.*;
public class CambiarPassword extends javax.swing.JFrame {
    /**
     * Creates new form CambiarPassword
     */    
    private Usuario usuario;
    SistemaUsuarios sistemaUsuarios;
    MiPerfil ventanaPerfil;
    
    public CambiarPassword(SistemaUsuarios sistemaUsuarios, MiPerfil ventanaPrincipal) {
        initComponents();
        this.sistemaUsuarios = sistemaUsuarios;
        this.ventanaPerfil = ventanaPrincipal;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
        jLabel2 = new javax.swing.JLabel();
        btnCambiarContra = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtContraseñaActual = new javax.swing.JPasswordField();
        txtContraseñaNueva = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña Actual:");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña Nueva:");

        btnCambiarContra.setBackground(new java.awt.Color(255, 255, 102));
        btnCambiarContra.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        btnCambiarContra.setText("ACTUALIZAR PASSWORD");
        btnCambiarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cambiar Contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtContraseñaActual)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtContraseñaNueva)
                        .addGap(49, 49, 49))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(btnCambiarContra)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtContraseñaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtContraseñaNueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnCambiarContra)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraActionPerformed
        // TODO add your handling code here:
        if (usuario != null) {
            String contrasenaActual = usuario.getContrasena();
            String contrasenaIngresada = txtContraseñaActual.getText();

            if (contrasenaIngresada.equals(contrasenaActual)) {
                String nuevaContrasena = txtContraseñaNueva.getText();
                
                if (nuevaContrasena.length() != 5) {
                    JOptionPane.showMessageDialog(this, "ERROR. La contrasena debe ser de 5 caracteres");
                    return;
                }
                
                usuario.setContrasena(nuevaContrasena); // Actualiza contraseña en el objeto Usuario
                sistemaUsuarios.actualizarUsuario(usuario);
                ventanaPerfil.setSistemaUsuarios(sistemaUsuarios);
                JOptionPane.showMessageDialog(this, "Contraseña cambiada exitosamente a: " + nuevaContrasena);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "La contraseña actual es incorrecta.");
                return;
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo cambiar la contraseña.");
            dispose();
        }
    }//GEN-LAST:event_btnCambiarContraActionPerformed

    private void txtContraseñaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActualActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarContra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContraseñaActual;
    private javax.swing.JPasswordField txtContraseñaNueva;
    // End of variables declaration//GEN-END:variables
}
