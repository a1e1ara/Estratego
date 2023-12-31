/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectomarvelstratego;

/**
 *
 * @author hp
 */
import javax.swing.JOptionPane;
import proyectomarvelstratego.Configuracion;
import proyectomarvelstratego.MenuPrincipal;
import proyectomarvelstratego.MiPerfil;
import proyectomarvelstratego.PartidaNueva;
import proyectomarvelstratego.SistemaUsuarios;
import proyectomarvelstratego.Stats;
import proyectomarvelstratego.UniversoMarvel;
import proyectomarvelstratego.Usuario;

public class MenuInicio extends javax.swing.JFrame {

    /**
     * Creates new form MenuInicio
     */
    private Usuario usuario;
    SistemaUsuarios sistemaUsuarios;
    Stats stats = new Stats();
    
    public MenuInicio(SistemaUsuarios sistemaUsuarios) {
        initComponents();
       
        this.sistemaUsuarios = sistemaUsuarios;
        usuario = sistemaUsuarios.getUsuarioActual();
        setResizable(false);
        habilitarBotonPartidaNueva();        
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
        
    private void habilitarBotonPartidaNueva() {
        Usuario[] usuarios = sistemaUsuarios.getUsuariosActivos();
        boolean habilitar = usuarios.length > 1;;
        jugarBtn.setEnabled(habilitar);
    }

    public void setSistemaUsuarios(SistemaUsuarios sistemaUsuarios) {
        this.sistemaUsuarios = sistemaUsuarios;
    }
    
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        //mostrarInformacionUsuario();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jugarBtn = new javax.swing.JButton();
        configBtn = new javax.swing.JButton();
        perfilBtn = new javax.swing.JButton();
        rankingBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MarvelStratLogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel4)
                .addContainerGap(551, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MenuBackground.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MenuIronMan.png"))); // NOI18N

        jugarBtn.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jugarBtn.setForeground(new java.awt.Color(255, 255, 255));
        jugarBtn.setText("STRATEGO - MARVEL HEROES!");
        jugarBtn.setBorderPainted(false);
        jugarBtn.setContentAreaFilled(false);
        jugarBtn.setFocusPainted(false);
        jugarBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jugarBtn.setIconTextGap(-525);
        jugarBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonIcons/MenuInicioFade.png"))); // NOI18N
        jugarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarBtnActionPerformed(evt);
            }
        });

        configBtn.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        configBtn.setForeground(new java.awt.Color(255, 255, 255));
        configBtn.setText("CONFIGURACION");
        configBtn.setBorderPainted(false);
        configBtn.setContentAreaFilled(false);
        configBtn.setFocusPainted(false);
        configBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        configBtn.setIconTextGap(-305);
        configBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonIcons/MenuInicioFade.png"))); // NOI18N
        configBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configBtnActionPerformed(evt);
            }
        });

        perfilBtn.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        perfilBtn.setForeground(new java.awt.Color(255, 255, 255));
        perfilBtn.setText("MI PERFIL");
        perfilBtn.setBorderPainted(false);
        perfilBtn.setContentAreaFilled(false);
        perfilBtn.setFocusPainted(false);
        perfilBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        perfilBtn.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        perfilBtn.setIconTextGap(-175);
        perfilBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonIcons/MenuInicioFade.png"))); // NOI18N
        perfilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilBtnActionPerformed(evt);
            }
        });

        rankingBtn.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        rankingBtn.setForeground(new java.awt.Color(255, 255, 255));
        rankingBtn.setText("UNIVERSO MARVEL");
        rankingBtn.setBorderPainted(false);
        rankingBtn.setContentAreaFilled(false);
        rankingBtn.setFocusPainted(false);
        rankingBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rankingBtn.setIconTextGap(-342);
        rankingBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonIcons/MenuInicioFade.png"))); // NOI18N
        rankingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankingBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("CERRAR SESION");
        logoutBtn.setBorderPainted(false);
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        logoutBtn.setIconTextGap(-280);
        logoutBtn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonIcons/MenuInicioFade.png"))); // NOI18N
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(414, 414, 414)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rankingBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jugarBtn)
                    .addComponent(configBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(perfilBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jugarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(configBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(perfilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rankingBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))))
        );

        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MenuVenom.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 798, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 285, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.setLayer(jPanel4, javax.swing.JLayeredPane.POPUP_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel3, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(jPanel2, javax.swing.JLayeredPane.MODAL_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("CREANDO UNA NUEVA PARTIDA...");
        PartidaNueva partida = new PartidaNueva(sistemaUsuarios, stats, this);
        partida.cargarUsuarios();
        partida.setVisible(true);              
    }//GEN-LAST:event_jugarBtnActionPerformed

    private void perfilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilBtnActionPerformed
        // TODO add your handling code here:

        MiPerfil perfil = new MiPerfil(sistemaUsuarios, this);
        perfil.setUsuario(usuario);
        perfil.setVisible(true);
    }//GEN-LAST:event_perfilBtnActionPerformed

    private void configBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configBtnActionPerformed
        // TODO add your handling code here:
        Configuracion config = new Configuracion(sistemaUsuarios, this);
        config.setUsuario(usuario);
        config.setVisible(true);
    }//GEN-LAST:event_configBtnActionPerformed

    private void rankingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankingBtnActionPerformed
        // TODO add your handling code here:
        UniversoMarvel ranks = new UniversoMarvel(sistemaUsuarios, stats);
        ranks.setVisible(true);
    }//GEN-LAST:event_rankingBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas cerrar sesión?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            sistemaUsuarios.usuarioIniciado = null;
            menuPrincipal.setSistemaUsuarios(sistemaUsuarios);
            menuPrincipal.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicio(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton configBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jugarBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton perfilBtn;
    private javax.swing.JButton rankingBtn;
    // End of variables declaration//GEN-END:variables
}
