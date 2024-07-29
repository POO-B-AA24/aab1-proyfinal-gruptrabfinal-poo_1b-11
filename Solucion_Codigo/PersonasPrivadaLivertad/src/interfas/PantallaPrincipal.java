package interfas;

import Controller.ProcesarGuardia;
import Model.H2_PersonaGuardia;
import java.util.List;

public class PantallaPrincipal extends javax.swing.JFrame {
    private PantallaIntermediaria panta=new PantallaIntermediaria();
    public PantallaPrincipal() {
        initComponents();
    }

    public PantallaIntermediaria getPanta() {
        return panta;
    }

    public void setPanta(PantallaIntermediaria panta) {
        this.panta = panta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        contrasena = new javax.swing.JPasswordField();
        advertencia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("ROG Fonts", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("CONTRASENA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 250, 70));

        jLabel2.setFont(new java.awt.Font("ROG Fonts", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("POLICIA NACIONAL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 490, 70));

        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("ROG Fonts", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("POLICIA NACIONAL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 300, 70));

        nombre.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        nombre.setText("Usuario");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 270, 40));

        contrasena.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        contrasena.setText("jPasswordField1");
        contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                contrasenaMouseExited(evt);
            }
        });
        getContentPane().add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 270, 40));

        advertencia.setBackground(new java.awt.Color(51, 51, 51));
        advertencia.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        advertencia.setForeground(new java.awt.Color(204, 0, 0));
        advertencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advertenciaActionPerformed(evt);
            }
        });
        getContentPane().add(advertencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/p1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 726, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String c= contrasena.getText();
        String num= nombre.getText();
        List<H2_PersonaGuardia> personasGuardia = ProcesarGuardia.obtenerPersonasGuardia();
        for (H2_PersonaGuardia p : personasGuardia) {
            if(p.getContrasena().equals(c)&&p.getNombre().equals(num)){
              panta.setVisible(true);
              this.setVisible(false);
              panta.setLocationRelativeTo(null);  
            }else{
                advertencia.setText("Datos Incorrectos");
            }
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void contrasenaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contrasenaMouseExited
       
    }//GEN-LAST:event_contrasenaMouseExited

    private void advertenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advertenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_advertenciaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField advertencia;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
