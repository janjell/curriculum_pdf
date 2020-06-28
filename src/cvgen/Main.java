/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvgen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("CV-Gen v0.2 - By Janjell");
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloMain = new javax.swing.JLabel();
        txtNombreUsr = new javax.swing.JTextField();
        txtApellidoUsr = new javax.swing.JTextField();
        txtDireccionUsr = new javax.swing.JTextField();
        txtTelefonoUsr = new javax.swing.JTextField();
        txtEmailUsr = new javax.swing.JTextField();
        txtCarreraUsr = new javax.swing.JTextField();
        lblNombreAP = new javax.swing.JLabel();
        lblApellidoAP = new javax.swing.JLabel();
        lblDireccionAP = new javax.swing.JLabel();
        lblTelefonoAP = new javax.swing.JLabel();
        lblEmailAP = new javax.swing.JLabel();
        lblCarreraAP = new javax.swing.JLabel();
        lblAreaPersonal = new javax.swing.JLabel();
        lblAreaExperiencia = new javax.swing.JLabel();
        txtTiempoExpUsr = new javax.swing.JTextField();
        lblTiempoAE = new javax.swing.JLabel();
        lblEmpresaAE = new javax.swing.JLabel();
        txtEmpresaExpUsr = new javax.swing.JTextField();
        txtCargoExpUsr = new javax.swing.JTextField();
        lblCargoAE = new javax.swing.JLabel();
        lblAreaEducacion = new javax.swing.JLabel();
        lblRunAP = new javax.swing.JLabel();
        txtRunUsr = new javax.swing.JTextField();
        txtEstadoCivilUsr = new javax.swing.JTextField();
        lblEstadoCivilAP = new javax.swing.JLabel();
        txtNacionalidadUsr = new javax.swing.JTextField();
        lblNacionalidadAP = new javax.swing.JLabel();
        lblEgresoEM = new javax.swing.JLabel();
        lblNombreEM = new javax.swing.JLabel();
        lblUbicacionEM = new javax.swing.JLabel();
        lblTituloEnsenanzaSuperior = new javax.swing.JLabel();
        lblTituloEnsenanzaMedia = new javax.swing.JLabel();
        txtEgresoColegioUsr = new javax.swing.JTextField();
        txtNombreColegioUsr = new javax.swing.JTextField();
        txtUbicacionColegioUsr = new javax.swing.JTextField();
        lblEgresoES = new javax.swing.JLabel();
        lblNombreES = new javax.swing.JLabel();
        lblUbicacionES = new javax.swing.JLabel();
        txtEgresoSuperiorUsr = new javax.swing.JTextField();
        txtNombreSuperiorUsr = new javax.swing.JTextField();
        txtUbicacionSuperiorUsr = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloMain.setText("Generador de Currículum Vitae");

        lblNombreAP.setText("Nombres:");

        lblApellidoAP.setText("Apellidos:");

        lblDireccionAP.setText("Dirección:");

        lblTelefonoAP.setText("Teléfono:");

        lblEmailAP.setText("E-Mail:");

        lblCarreraAP.setText("Profesión:");

        lblAreaPersonal.setText("Área Personal:");

        lblAreaExperiencia.setText("Area de Experiencia:");

        lblTiempoAE.setText("Tiempo:");

        lblEmpresaAE.setText("Empresa:");

        lblCargoAE.setText("Cargo:");

        lblAreaEducacion.setText("Área de Educación:");

        lblRunAP.setText("RUN:");

        lblEstadoCivilAP.setText("Estado Civil:");

        lblNacionalidadAP.setText("Nacionalidad:");

        lblEgresoEM.setText("Egreso:");

        lblNombreEM.setText("Nombre Establecimiento:");

        lblUbicacionEM.setText("Ubicación:");

        lblTituloEnsenanzaSuperior.setText("Enseñanza Superior");

        lblTituloEnsenanzaMedia.setText("Enseñanza Media");

        lblEgresoES.setText("Egreso:");

        lblNombreES.setText("Nombre Establecimiento:");

        lblUbicacionES.setText("Ubicación:");

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAreaPersonal)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombreAP)
                                            .addComponent(lblApellidoAP)
                                            .addComponent(lblDireccionAP)
                                            .addComponent(lblTelefonoAP)
                                            .addComponent(lblEmailAP)
                                            .addComponent(lblCarreraAP)
                                            .addComponent(lblRunAP)
                                            .addComponent(lblEstadoCivilAP)
                                            .addComponent(lblNacionalidadAP))
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNacionalidadUsr)
                                            .addComponent(txtEstadoCivilUsr)
                                            .addComponent(txtEmailUsr)
                                            .addComponent(txtTelefonoUsr)
                                            .addComponent(txtDireccionUsr)
                                            .addComponent(txtApellidoUsr)
                                            .addComponent(txtNombreUsr, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCarreraUsr, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtRunUsr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAreaExperiencia)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTiempoAE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTiempoExpUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEmpresaAE)
                                            .addComponent(lblCargoAE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCargoExpUsr)
                                            .addComponent(txtEmpresaExpUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAreaEducacion)
                                    .addComponent(lblTituloEnsenanzaSuperior)
                                    .addComponent(lblTituloEnsenanzaMedia)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombreEM)
                                            .addComponent(lblEgresoEM)
                                            .addComponent(lblUbicacionEM)
                                            .addComponent(lblEgresoES))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEgresoColegioUsr)
                                            .addComponent(txtNombreColegioUsr)
                                            .addComponent(txtUbicacionColegioUsr)
                                            .addComponent(txtEgresoSuperiorUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombreES)
                                            .addComponent(lblUbicacionES))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreSuperiorUsr)
                                            .addComponent(txtUbicacionSuperiorUsr)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btnProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTituloMain)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloMain)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreaPersonal)
                    .addComponent(lblAreaExperiencia)
                    .addComponent(lblAreaEducacion))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombreAP)
                    .addComponent(txtTiempoExpUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoAE)
                    .addComponent(lblTituloEnsenanzaMedia))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApellidoUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblApellidoAP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDireccionUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDireccionAP)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEmpresaAE)
                                    .addComponent(txtEmpresaExpUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCargoExpUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCargoAE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefonoUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefonoAP))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailAP))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCarreraUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCarreraAP))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRunAP)
                            .addComponent(txtRunUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstadoCivilUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstadoCivilAP))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNacionalidadUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNacionalidadAP)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEgresoEM)
                            .addComponent(txtEgresoColegioUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreEM)
                            .addComponent(txtNombreColegioUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUbicacionColegioUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUbicacionEM))
                        .addGap(30, 30, 30)
                        .addComponent(lblTituloEnsenanzaSuperior)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEgresoES)
                            .addComponent(txtEgresoSuperiorUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombreES)
                            .addComponent(txtNombreSuperiorUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUbicacionES)
                            .addComponent(txtUbicacionSuperiorUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnProcesar)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        String nombreUsr = txtNombreUsr.getText();
        String apellidoUsr = txtApellidoUsr.getText();
        String direccionUsr = txtDireccionUsr.getText();
        String telefonoUsr = txtTelefonoUsr.getText();
        String emailUsr = txtEmailUsr.getText();
        String carreraUsr = txtCarreraUsr.getText();
        String runUsr = txtRunUsr.getText();
        String estadoCivilUsr = txtEstadoCivilUsr.getText();
        String nacionalidadUsr = txtNacionalidadUsr.getText();

        String tiempoExpUsr = txtTiempoExpUsr.getText();
        String empresaExpUsr = txtEmpresaExpUsr.getText();
        String cargoExpUsr = txtCargoExpUsr.getText();

        String egresoColegioUsr = txtEgresoColegioUsr.getText();
        String nombreColegioUsr = txtNombreColegioUsr.getText();
        String ubicacionColegioUsr = txtUbicacionColegioUsr.getText();

        String egresoSuperiorUsr = txtEgresoSuperiorUsr.getText();
        String nombreSuperiorUsr = txtNombreSuperiorUsr.getText();
        String ubicacionSuperiorUsr = txtUbicacionSuperiorUsr.getText();

        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Curriculum Vitae.pdf"));
            document.open();

            document.addAuthor("Usuario CV-Gen");
            document.addCreationDate();
            document.addCreator("Janjell");
            document.addTitle("Currículum Vitae");
            document.addSubject("Currículum Vitae Generado por CV-Gen v0.2");

            document.add(new Paragraph("---- Currículum Vitae ---- "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Datos Personales:"));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Nombre Completo: " + nombreUsr + " " + apellidoUsr + "."));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Cédula de Identidad: " + runUsr));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Nacionalidad: " + nacionalidadUsr));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Estado Civil: " + estadoCivilUsr));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Profesión: " + carreraUsr));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Dirección: " + direccionUsr));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Teléfono Móvil: " + telefonoUsr));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Correo Electrónico: " + emailUsr));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Antecedentes Académicos:"));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Educación Media: " + nombreColegioUsr + " - " + ubicacionColegioUsr + " - " + egresoColegioUsr));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Educación Superior: " + nombreSuperiorUsr + " - " + ubicacionSuperiorUsr + " - " + egresoSuperiorUsr));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Antecedentes Laborales:"));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Cargo desempeñado: " + cargoExpUsr + " - " + tiempoExpUsr));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Empresa: " + empresaExpUsr));

            document.close();
            writer.close();

            String msj = "Currículum Vitae generado en la carpeta del programa.";
            String tit = "Éxito";
            JOptionPane.showMessageDialog(null, msj, tit, JOptionPane.INFORMATION_MESSAGE);

        } catch (DocumentException | FileNotFoundException e) {
            String msj = "Houston tenemos un problema, contacte al desarrollador.";
            String tit = "Error";
            JOptionPane.showMessageDialog(null, msj, tit, JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnProcesarActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel lblApellidoAP;
    private javax.swing.JLabel lblAreaEducacion;
    private javax.swing.JLabel lblAreaExperiencia;
    private javax.swing.JLabel lblAreaPersonal;
    private javax.swing.JLabel lblCargoAE;
    private javax.swing.JLabel lblCarreraAP;
    private javax.swing.JLabel lblDireccionAP;
    private javax.swing.JLabel lblEgresoEM;
    private javax.swing.JLabel lblEgresoES;
    private javax.swing.JLabel lblEmailAP;
    private javax.swing.JLabel lblEmpresaAE;
    private javax.swing.JLabel lblEstadoCivilAP;
    private javax.swing.JLabel lblNacionalidadAP;
    private javax.swing.JLabel lblNombreAP;
    private javax.swing.JLabel lblNombreEM;
    private javax.swing.JLabel lblNombreES;
    private javax.swing.JLabel lblRunAP;
    private javax.swing.JLabel lblTelefonoAP;
    private javax.swing.JLabel lblTiempoAE;
    private javax.swing.JLabel lblTituloEnsenanzaMedia;
    private javax.swing.JLabel lblTituloEnsenanzaSuperior;
    private javax.swing.JLabel lblTituloMain;
    private javax.swing.JLabel lblUbicacionEM;
    private javax.swing.JLabel lblUbicacionES;
    private javax.swing.JTextField txtApellidoUsr;
    private javax.swing.JTextField txtCargoExpUsr;
    private javax.swing.JTextField txtCarreraUsr;
    private javax.swing.JTextField txtDireccionUsr;
    private javax.swing.JTextField txtEgresoColegioUsr;
    private javax.swing.JTextField txtEgresoSuperiorUsr;
    private javax.swing.JTextField txtEmailUsr;
    private javax.swing.JTextField txtEmpresaExpUsr;
    private javax.swing.JTextField txtEstadoCivilUsr;
    private javax.swing.JTextField txtNacionalidadUsr;
    private javax.swing.JTextField txtNombreColegioUsr;
    private javax.swing.JTextField txtNombreSuperiorUsr;
    private javax.swing.JTextField txtNombreUsr;
    private javax.swing.JTextField txtRunUsr;
    private javax.swing.JTextField txtTelefonoUsr;
    private javax.swing.JTextField txtTiempoExpUsr;
    private javax.swing.JTextField txtUbicacionColegioUsr;
    private javax.swing.JTextField txtUbicacionSuperiorUsr;
    // End of variables declaration//GEN-END:variables
}
