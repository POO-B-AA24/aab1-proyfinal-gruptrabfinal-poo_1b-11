package interfas;

import Controller.ProcesarGuardia;
import Controller.ProcesarPPL;
import Model.DAO_PersonaGuardia;
import Model.H1_PersonaPrivadaLibertad;
import Model.H2_PersonaGuardia;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PantallaGuardia extends javax.swing.JFrame {
    DefaultTableModel tabla= new DefaultTableModel();
    public PantallaGuardia() {
        initComponents();
        String[] titulo=new String[]{"Genero","Nombres","Nacionalidad","Edad","num id","contrasena","departamento","especialidad"};
        tabla.setColumnIdentifiers(titulo);
        jTable1.setModel(tabla);
    }
     void obtener(){
         List<H2_PersonaGuardia> personasGuardia = ProcesarGuardia.obtenerPersonasGuardia();
        for (H2_PersonaGuardia p : personasGuardia) {
            tabla.addRow(new Object [] {p.getGenero(),p.getNombre(),p.getNacionalidad(),p.getEdad(),p.getNumIdentificacion(),p.getContrasena(),p.getDepartamento(),p.getEspecialidad()});
        }   
    }
    void ultimocambio(){
        List<H2_PersonaGuardia> personasGuardia = ProcesarGuardia.obtenerPersonasGuardia();
        H2_PersonaGuardia p = personasGuardia.getLast();
        tabla.addRow(new Object [] {p.getGenero(),p.getNombre(),p.getNacionalidad(),p.getEdad(),p.getNumIdentificacion(),p.getContrasena(),p.getDepartamento(),p.getEspecialidad()});
           
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        edad_ = new javax.swing.JTextField();
        ObtenerDBG = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nacionalidad = new javax.swing.JLabel();
        numeroID = new javax.swing.JLabel();
        departamento = new javax.swing.JLabel();
        contrasena = new javax.swing.JLabel();
        especialidad = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        nacionalidad_ = new javax.swing.JTextField();
        genero_ = new javax.swing.JTextField();
        numeroid_ = new javax.swing.JTextField();
        contrasena_ = new javax.swing.JTextField();
        departamenrto_ = new javax.swing.JTextField();
        especialidad_ = new javax.swing.JTextField();
        nombre_ = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ObtenerDBG1 = new javax.swing.JButton();
        ultimocambio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(204, 0, 0));
        nombre.setText("NOMBRE:");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        edad_.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        edad_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edad_ActionPerformed(evt);
            }
        });
        getContentPane().add(edad_, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 260, 30));

        ObtenerDBG.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ObtenerDBG.setText("Obtener DBG");
        ObtenerDBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObtenerDBGActionPerformed(evt);
            }
        });
        getContentPane().add(ObtenerDBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, 170, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 250, 770, -1));

        nacionalidad.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        nacionalidad.setForeground(new java.awt.Color(204, 0, 0));
        nacionalidad.setText("NACIONALIDAD:");
        getContentPane().add(nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        numeroID.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        numeroID.setForeground(new java.awt.Color(204, 0, 0));
        numeroID.setText("NUMERO ID");
        getContentPane().add(numeroID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        departamento.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        departamento.setForeground(new java.awt.Color(204, 0, 0));
        departamento.setText("DEPARTAMENTO");
        getContentPane().add(departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        contrasena.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        contrasena.setForeground(new java.awt.Color(204, 0, 0));
        contrasena.setText("CONTRASENA");
        getContentPane().add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        especialidad.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        especialidad.setForeground(new java.awt.Color(204, 0, 0));
        especialidad.setText("ESPECIALIDAD");
        getContentPane().add(especialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        edad.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        edad.setForeground(new java.awt.Color(204, 0, 0));
        edad.setText("EDAD:");
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("REGISTRAR  POLICIA");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        genero.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        genero.setForeground(new java.awt.Color(204, 0, 0));
        genero.setText("GENERO:");
        getContentPane().add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 0, 0));
        jLabel18.setText("TABLA RESULTADOS");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 140, -1, -1));

        nacionalidad_.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        nacionalidad_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidad_ActionPerformed(evt);
            }
        });
        getContentPane().add(nacionalidad_, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 260, 30));

        genero_.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        genero_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genero_ActionPerformed(evt);
            }
        });
        getContentPane().add(genero_, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 510, 260, 30));

        numeroid_.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        numeroid_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroid_ActionPerformed(evt);
            }
        });
        getContentPane().add(numeroid_, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 260, 30));

        contrasena_.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        contrasena_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasena_ActionPerformed(evt);
            }
        });
        getContentPane().add(contrasena_, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 260, 30));

        departamenrto_.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        departamenrto_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamenrto_ActionPerformed(evt);
            }
        });
        getContentPane().add(departamenrto_, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 260, 30));

        especialidad_.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        especialidad_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                especialidad_ActionPerformed(evt);
            }
        });
        getContentPane().add(especialidad_, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 260, 30));

        nombre_.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        nombre_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_ActionPerformed(evt);
            }
        });
        getContentPane().add(nombre_, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 260, 30));

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setText("Establecer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 640, -1, -1));

        ObtenerDBG1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ObtenerDBG1.setText("Limpiar tabla");
        ObtenerDBG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObtenerDBG1ActionPerformed(evt);
            }
        });
        getContentPane().add(ObtenerDBG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 170, 30));

        ultimocambio.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ultimocambio.setText("Ultimo cambio");
        ultimocambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimocambioActionPerformed(evt);
            }
        });
        getContentPane().add(ultimocambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoprincipal.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 2004, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edad_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edad_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edad_ActionPerformed

    private void nacionalidad_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidad_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidad_ActionPerformed

    private void genero_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genero_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genero_ActionPerformed

    private void numeroid_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroid_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroid_ActionPerformed

    private void contrasena_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasena_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasena_ActionPerformed

    private void departamenrto_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamenrto_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departamenrto_ActionPerformed

    private void especialidad_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_especialidad_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_especialidad_ActionPerformed

    private void nombre_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_ActionPerformed

    private void ObtenerDBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObtenerDBGActionPerformed
obtener();        

    }//GEN-LAST:event_ObtenerDBGActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        DAO_PersonaGuardia.crearTabla();
        String id=numeroid_.getText();
        int idx= Integer.parseInt(id);
        String edad=edad_.getText();
        int edadx= Integer.parseInt(edad);
        
        H2_PersonaGuardia guardia = new H2_PersonaGuardia(especialidad_.getText(), departamenrto_.getText(), contrasena_.getText(), idx, nombre_.getText(), nacionalidad_.getText(), genero_.getText(), edadx);
        // Insertar la instancia en la base de datos
        ProcesarGuardia.insertarPersonaGuardia(guardia);
        especialidad_.setText("");
        departamenrto_.setText("");
        numeroid_.setText("");
        contrasena_.setText("");
        edad_.setText("");
        nombre_.setText("");
        nacionalidad_.setText("");
        genero_.setText("");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ObtenerDBG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObtenerDBG1ActionPerformed
        tabla.removeRow(jTable1.getSelectedRowCount());
    }//GEN-LAST:event_ObtenerDBG1ActionPerformed

    private void ultimocambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimocambioActionPerformed
        ultimocambio();
    }//GEN-LAST:event_ultimocambioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ObtenerDBG;
    private javax.swing.JButton ObtenerDBG1;
    private javax.swing.JLabel contrasena;
    private javax.swing.JTextField contrasena_;
    private javax.swing.JTextField departamenrto_;
    private javax.swing.JLabel departamento;
    private javax.swing.JLabel edad;
    private javax.swing.JTextField edad_;
    private javax.swing.JLabel especialidad;
    private javax.swing.JTextField especialidad_;
    private javax.swing.JLabel genero;
    private javax.swing.JTextField genero_;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nacionalidad;
    private javax.swing.JTextField nacionalidad_;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombre_;
    private javax.swing.JLabel numeroID;
    private javax.swing.JTextField numeroid_;
    private javax.swing.JButton ultimocambio;
    // End of variables declaration//GEN-END:variables
}
