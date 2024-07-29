package interfas;
public class PantallaIntermediaria extends javax.swing.JFrame {
    private PantallaPPL panta=new PantallaPPL();
    private PantallaGuardia pantag=new PantallaGuardia();
    public PantallaGuardia getPantag() {
        return pantag;
    }

    public void setPantag(PantallaGuardia pantag) {
        this.pantag = pantag;
    }
    public PantallaIntermediaria() {
        initComponents();
    }

    public PantallaPPL getPanta() {
        return panta;
    }

    public void setPanta(PantallaPPL panta) {
        this.panta = panta;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonPPL = new javax.swing.JButton();
        botonGuardia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonPPL.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        botonPPL.setText("Agregar PPL");
        botonPPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPPLActionPerformed(evt);
            }
        });
        getContentPane().add(botonPPL, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        botonGuardia.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        botonGuardia.setText("Agregar Guardia");
        botonGuardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardiaActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/R.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 350, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/intermediario.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 728, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPPLActionPerformed
        panta.setVisible(true);
              this.setVisible(false);
              panta.setLocationRelativeTo(null); 
        setPanta(panta);
    }//GEN-LAST:event_botonPPLActionPerformed

    private void botonGuardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardiaActionPerformed
        pantag.setVisible(true);
              this.setVisible(false);
              pantag.setLocationRelativeTo(null); 
        setPantag(pantag);
    }//GEN-LAST:event_botonGuardiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardia;
    private javax.swing.JButton botonPPL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
