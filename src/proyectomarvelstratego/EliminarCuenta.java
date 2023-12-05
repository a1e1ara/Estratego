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
public class EliminarCuenta extends javax.swing.JFrame {

    /**
     * Creates new form EliminarCuenta
     */
    private Usuario usuario;
    SistemaUsuarios sistemaUsuarios;
    MenuInicio ventanaPrincipal;
    
    public EliminarCuenta(SistemaUsuarios sistemaUsuarios, MenuInicio ventanaPrincipal) {
        initComponents();
        this.sistemaUsuarios = sistemaUsuarios;
        this.ventanaPrincipal = ventanaPrincipal;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        // Esconder label de prueba
        jLabel1.setVisible(false);
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        btnBorrarCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        jLabel2.setText("Ingrese su contraseña para confirmar:");

        btnBorrarCuenta.setText("Borrar");
        btnBorrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnBorrarCuenta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnBorrarCuenta)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCuentaActionPerformed
        // TODO add your handling code here:
            // Obtener la contraseña ingresada para luego verificar si es la misma y proceder a eliminar cuenta
    String contrasenaIngresada = txtContraseña.getText();

    if (usuario != null) {
        // Verifica si la contraseña ingresada coincide con la contraseña actual del usuario (actual porque antes pudo haberse cambiado)
        if (contrasenaIngresada.equals(usuario.getContrasena())) {
            // Eliminar la cuenta del usuario
            sistemaUsuarios.eliminarUsuario(usuario);

            JOptionPane.showMessageDialog(this, "La cuenta ha sido eliminada exitosamente.");
            
            // Abrir el menu prinicpal
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setSistemaUsuarios(sistemaUsuarios); 
            menuPrincipal.setVisible(true); 
            
            // Cerrar la ventana del menu de inicio
            ventanaPrincipal.dispose();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "La contraseña ingresada es incorrecta.");
        }
    }
    
    
    }//GEN-LAST:event_btnBorrarCuentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtContraseña;
    // End of variables declaration//GEN-END:variables
}