package interfas;

import Controller.ProcesarPPL;
import Model.DAO_PersonaPrivadaLibertad;
import Model.H1_PersonaPrivadaLibertad;
import Model.H1_T_Agravante;
import Model.H1_T_Delito;
import Model.H3_TH1_PersonaVisita;

public class Pantalla extends javax.swing.JFrame {
    public Pantalla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        _edad = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        edad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nacionalidad = new javax.swing.JLabel();
        fechadeIngreso = new javax.swing.JLabel();
        descripcionAgravante = new javax.swing.JLabel();
        gravedad = new javax.swing.JLabel();
        descripcion = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        _nacionalidad = new javax.swing.JTextField();
        _relacion = new javax.swing.JTextField();
        _visitaspermitidas = new javax.swing.JTextField();
        _fechaingreso = new javax.swing.JTextField();
        _descripcion = new javax.swing.JTextField();
        _gravedadd = new javax.swing.JTextField();
        _descipciond = new javax.swing.JTextField();
        _nombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tipodelito = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JLabel();
        edad1 = new javax.swing.JLabel();
        nacionalidad1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        _nombre1 = new javax.swing.JTextField();
        _edad1 = new javax.swing.JTextField();
        _nacionalidad1 = new javax.swing.JTextField();
        _genero1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        _identificacion = new javax.swing.JTextField();
        _direccion = new javax.swing.JTextField();
        _telefono = new javax.swing.JTextField();
        _generov = new javax.swing.JTextField();
        _descripciona = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        _edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _edadActionPerformed(evt);
            }
        });
        getContentPane().add(_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 180, -1));

        jToggleButton1.setText("Procesar PPL");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, -1, -1));

        edad.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        edad.setForeground(new java.awt.Color(0, 204, 204));
        edad.setText("EDAD");
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("VISITANTE PPL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        nacionalidad.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nacionalidad.setForeground(new java.awt.Color(0, 204, 204));
        nacionalidad.setText("NACIONALIDAD");
        getContentPane().add(nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        fechadeIngreso.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        fechadeIngreso.setForeground(new java.awt.Color(0, 204, 204));
        fechadeIngreso.setText("FECHA DE INGRESO");
        getContentPane().add(fechadeIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        descripcionAgravante.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        descripcionAgravante.setForeground(new java.awt.Color(0, 204, 204));
        descripcionAgravante.setText("DESCRIPCION");
        getContentPane().add(descripcionAgravante, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        gravedad.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        gravedad.setForeground(new java.awt.Color(0, 204, 204));
        gravedad.setText("GRAVEDAD");
        getContentPane().add(gravedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        descripcion.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        descripcion.setForeground(new java.awt.Color(0, 204, 204));
        descripcion.setText("DESCRIPCION");
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        nombre.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 204, 204));
        nombre.setText("NOMBRE");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Relacion Con PPL");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 204));
        jLabel12.setText("VISITAS PERMITIDAS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 255, 255));
        jLabel13.setText("LLENAR DATOS PPL");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        _nacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _nacionalidadActionPerformed(evt);
            }
        });
        getContentPane().add(_nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 180, -1));

        _relacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _relacionActionPerformed(evt);
            }
        });
        getContentPane().add(_relacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, 180, -1));

        _visitaspermitidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _visitaspermitidasActionPerformed(evt);
            }
        });
        getContentPane().add(_visitaspermitidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 180, -1));

        _fechaingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _fechaingresoActionPerformed(evt);
            }
        });
        getContentPane().add(_fechaingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 180, -1));

        _descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _descripcionActionPerformed(evt);
            }
        });
        getContentPane().add(_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 180, -1));

        _gravedadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _gravedaddActionPerformed(evt);
            }
        });
        getContentPane().add(_gravedadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 180, -1));

        _descipciond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _descipciondActionPerformed(evt);
            }
        });
        getContentPane().add(_descipciond, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 180, -1));

        _nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _nombreActionPerformed(evt);
            }
        });
        getContentPane().add(_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 180, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("LLENAR DATOS DELITO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 204));
        jLabel15.setText("TIPO DELITO");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        tipodelito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodelitoActionPerformed(evt);
            }
        });
        getContentPane().add(tipodelito, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("AGRAVANTE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        nombre1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nombre1.setForeground(new java.awt.Color(0, 204, 204));
        nombre1.setText("NOMBRE");
        getContentPane().add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        edad1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        edad1.setForeground(new java.awt.Color(0, 204, 204));
        edad1.setText("EDAD");
        getContentPane().add(edad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        nacionalidad1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        nacionalidad1.setForeground(new java.awt.Color(0, 204, 204));
        nacionalidad1.setText("NACIONALIDAD");
        getContentPane().add(nacionalidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 204));
        jLabel16.setText("GENERO");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        _nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _nombre1ActionPerformed(evt);
            }
        });
        getContentPane().add(_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 180, -1));

        _edad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _edad1ActionPerformed(evt);
            }
        });
        getContentPane().add(_edad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 180, -1));

        _nacionalidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _nacionalidad1ActionPerformed(evt);
            }
        });
        getContentPane().add(_nacionalidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 180, -1));

        _genero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _genero1ActionPerformed(evt);
            }
        });
        getContentPane().add(_genero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 180, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 204, 204));
        jLabel17.setText("IDENTIFICACION");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 204, 204));
        jLabel18.setText("DIRECCION");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 204));
        jLabel19.setText("TELEFONO");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 204, 204));
        jLabel20.setText("GENERO");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, -1));

        _identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _identificacionActionPerformed(evt);
            }
        });
        getContentPane().add(_identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 180, -1));

        _direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _direccionActionPerformed(evt);
            }
        });
        getContentPane().add(_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 180, -1));

        _telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 180, -1));

        _generov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _generovActionPerformed(evt);
            }
        });
        getContentPane().add(_generov, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 180, -1));

        _descripciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.png"))); // NOI18N
        _descripciona.setText("jLabel2");
        getContentPane().add(_descripciona, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
         // Crear las tablas en la base de datos: 
        DAO_PersonaPrivadaLibertad.crearTabla();
        String a=_visitaspermitidas.getText();
        int diasvpermitidas = Integer.parseInt(a);
        String a1=_edad1.getText();
        int edad1 = Integer.parseInt(a1);
        String a2=_edad.getText();
        int edad = Integer.parseInt(a2);
        // Crear una instancia de PersonaPrivadaLibertad
        H1_PersonaPrivadaLibertad persona = new H1_PersonaPrivadaLibertad(
                diasvpermitidas, 2, _fechaingreso.getText(), _nombre1.getText(),_nacionalidad1.getText(), _genero1.getText(), edad1);

        // Agregar algunos delitos y agravantes
        persona.agregarDelito(new H1_T_Delito(_descripciona.getText(), _gravedadd.getText(), _descipciond.getText()));
        persona.agregarVisita(new H3_TH1_PersonaVisita(_relacion.getText(),_telefono.getText(),_direccion.getText(),_identificacion.getText(),_nombre.getText(),_nacionalidad.getText(),_generov.getText(),edad));
        persona.agregarAgravante(new H1_T_Agravante(_descripcion.getText()));

        // Insertar la persona en la base de datos
        
        ProcesarPPL.insertarPersonaPrivadaLibertad(persona);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void _edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__edadActionPerformed

    private void _nacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__nacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__nacionalidadActionPerformed

    private void _relacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__relacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__relacionActionPerformed

    private void _visitaspermitidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__visitaspermitidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__visitaspermitidasActionPerformed

    private void _fechaingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__fechaingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__fechaingresoActionPerformed

    private void _descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__descripcionActionPerformed

    private void _gravedaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__gravedaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__gravedaddActionPerformed

    private void _descipciondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__descipciondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__descipciondActionPerformed

    private void _nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__nombreActionPerformed

    private void tipodelitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodelitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipodelitoActionPerformed

    private void _nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__nombre1ActionPerformed

    private void _edad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__edad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__edad1ActionPerformed

    private void _nacionalidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__nacionalidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__nacionalidad1ActionPerformed

    private void _genero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__genero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__genero1ActionPerformed

    private void _identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__identificacionActionPerformed

    private void _direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__direccionActionPerformed

    private void _telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__telefonoActionPerformed

    private void _generovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__generovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event__generovActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField _descipciond;
    private javax.swing.JTextField _descripcion;
    private javax.swing.JLabel _descripciona;
    private javax.swing.JTextField _direccion;
    private javax.swing.JTextField _edad;
    private javax.swing.JTextField _edad1;
    private javax.swing.JTextField _fechaingreso;
    private javax.swing.JTextField _genero1;
    private javax.swing.JTextField _generov;
    private javax.swing.JTextField _gravedadd;
    private javax.swing.JTextField _identificacion;
    private javax.swing.JTextField _nacionalidad;
    private javax.swing.JTextField _nacionalidad1;
    private javax.swing.JTextField _nombre;
    private javax.swing.JTextField _nombre1;
    private javax.swing.JTextField _relacion;
    private javax.swing.JTextField _telefono;
    private javax.swing.JTextField _visitaspermitidas;
    private javax.swing.JLabel descripcion;
    private javax.swing.JLabel descripcionAgravante;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel edad1;
    private javax.swing.JLabel fechadeIngreso;
    private javax.swing.JLabel gravedad;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel nacionalidad;
    private javax.swing.JLabel nacionalidad1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre1;
    private javax.swing.JTextField tipodelito;
    // End of variables declaration//GEN-END:variables
}
