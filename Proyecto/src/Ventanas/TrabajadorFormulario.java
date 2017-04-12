/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Modelo.Categoria;
import Modelo.ControladorBaseDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 7fbd06
 */
public class TrabajadorFormulario extends javax.swing.JFrame {

    /**
     * Creates new form TrabajadorFormulario
     */
    public TrabajadorFormulario() throws SQLException {
        initComponents();
        String seleccion = "SELECT nombre FROM tabla";
        PreparedStatement ps = ControladorBaseDatos.getConexion().prepareStatement(seleccion);

        ArrayList<String> ls = new ArrayList<String>();

        ResultSet rs = ps.executeQuery();

        while(rs.next()){

        ls.add(rs.getString("NOMBRE")); 
        }
        centroCombo.removeAllItems();
            for(int i=0; i<ls.size();i++){
            centroCombo.addItem(ls.get(i));
        }
    
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dniTexto = new javax.swing.JTextField();
        nombreTexto = new javax.swing.JTextField();
        ap1Texto = new javax.swing.JTextField();
        ap2Texto = new javax.swing.JTextField();
        direccionTexto = new javax.swing.JTextField();
        telEmpresaTexto = new javax.swing.JTextField();
        telPersonalTexto = new javax.swing.JTextField();
        salarioTexto = new javax.swing.JTextField();
        categoriaOpciones = new javax.swing.JComboBox<>();
        aceptarBoton = new javax.swing.JButton();
        atrasBoton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        fechaTexto = new javax.swing.JTextField();
        centroCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("D.N.I.:");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDO 1:");

        jLabel4.setText("APELLIDO 2:");

        jLabel5.setText("DIRECCIÓN:");

        jLabel6.setText("TELÉFONO DE EMPRESA:");

        jLabel7.setText("TELÉFONO PERSONAL:");

        jLabel8.setText("CATEGORIA:");

        jLabel9.setText("SALARIO");

        jLabel10.setText("FECHA DE NACIMIENTO:");

        ap1Texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap1TextoActionPerformed(evt);
            }
        });

        ap2Texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap2TextoActionPerformed(evt);
            }
        });

        categoriaOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrativo", "Transportista" }));

        aceptarBoton.setText("Aceptar");
        aceptarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarBotonActionPerformed(evt);
            }
        });

        atrasBoton.setText("Atrás");
        atrasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBotonActionPerformed(evt);
            }
        });

        jLabel11.setText("CENTRO AL QUE PERTENECE:");

        fechaTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTextoActionPerformed(evt);
            }
        });

        centroCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        centroCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centroComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(atrasBoton)
                            .addGap(18, 18, 18)
                            .addComponent(aceptarBoton))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dniTexto)
                                .addComponent(nombreTexto)
                                .addComponent(ap1Texto)
                                .addComponent(ap2Texto)
                                .addComponent(direccionTexto)
                                .addComponent(telEmpresaTexto)
                                .addComponent(telPersonalTexto)
                                .addComponent(salarioTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                                .addComponent(categoriaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaTexto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(centroCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 414, Short.MAX_VALUE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dniTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ap1Texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ap2Texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(direccionTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telEmpresaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(telPersonalTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(categoriaOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(salarioTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fechaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(centroCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarBoton)
                    .addComponent(atrasBoton))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ap1TextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap1TextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ap1TextoActionPerformed

    private void ap2TextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap2TextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ap2TextoActionPerformed

    private void atrasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atrasBotonActionPerformed

    private void aceptarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarBotonActionPerformed
        /*Como crear un objeto trabajador*/
        Modelo.Categoria categoria;
        if(categoriaOpciones.getName().equalsIgnoreCase(Modelo.Categoria.Administrativo.toString())){
            categoria = Categoria.Administrativo;
        }else{
            categoria =Categoria.Transportista;
        }
        double salario=Double.parseDouble(salarioTexto.getText());
        
        String centro= centroCombo.getName();
        
        Modelo.Trabajador t=new Modelo.Trabajador(dniTexto.getText(),nombreTexto.getText(),
        ap1Texto.getText(), ap2Texto.getText(), direccionTexto.getText(),telEmpresaTexto.getText(),
        telPersonalTexto.getText(),categoria, salario, fechaTexto.getText());
        
        
        t.guardarTrabajador(centro,t);
        
        
    }//GEN-LAST:event_aceptarBotonActionPerformed

    private void fechaTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTextoActionPerformed

    private void centroComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centroComboActionPerformed
        
    }//GEN-LAST:event_centroComboActionPerformed

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
            java.util.logging.Logger.getLogger(TrabajadorFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrabajadorFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrabajadorFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrabajadorFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TrabajadorFormulario().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TrabajadorFormulario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarBoton;
    private javax.swing.JTextField ap1Texto;
    private javax.swing.JTextField ap2Texto;
    private javax.swing.JButton atrasBoton;
    private javax.swing.JComboBox<String> categoriaOpciones;
    private javax.swing.JComboBox<String> centroCombo;
    private javax.swing.JTextField direccionTexto;
    private javax.swing.JTextField dniTexto;
    private javax.swing.JTextField fechaTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nombreTexto;
    private javax.swing.JTextField salarioTexto;
    private javax.swing.JTextField telEmpresaTexto;
    private javax.swing.JTextField telPersonalTexto;
    // End of variables declaration//GEN-END:variables
}
