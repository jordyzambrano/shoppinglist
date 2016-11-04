package Formularios;

import Formularios.Registrar;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Iniciar_sesion extends javax.swing.JFrame 
{
    public Iniciar_sesion(boolean v) {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("iMarket");
        
        if(v){
            lblr.setText("Datos ingresados correctamente");
        }
        else{
          lblr.setText("");  
        }
    }

    public Iniciar_sesion() 
    {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        setTitle("iMarket");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblr = new javax.swing.JLabel();
        lblmensage = new javax.swing.JLabel();
        txtcon = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(java.awt.Color.red);
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        jLabel2.setBackground(new java.awt.Color(0, 204, 0));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 204, 0));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txtusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuActionPerformed(evt);
            }
        });
        getContentPane().add(txtusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 280, -1));

        jButton1.setText("Iniciar sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        getContentPane().add(lblr, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 55, -1, -1));
        getContentPane().add(lblmensage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        getContentPane().add(txtcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 280, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevas imagenes/hh.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 300, 100));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevas imagenes/pp.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 400, 320));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevas imagenes/hh.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 300, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Registrar hola=new Registrar();
        hola.show();
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ArrayList<String> preguntas= leerarchivo("Usuario.txt");
       String[]vector;
       boolean t=false;
        for (int i = 0; i < preguntas.size(); i++) {
            vector=preguntas.get(i).split(";");
            if (vector[2].equals(txtusu.getText())&&vector[5].equals(txtcon.getText())) {
                t=true;
            } 
        }
        if (t) {
            Principal_productos p=new Principal_productos();
            p.show();
            this.setVisible(false);
        } else {
            lblmensage.setText("Datos incorrectos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

      public static ArrayList<String> leerarchivo(String archivo) {
      String cadena;
      ArrayList<String> preguntas=new ArrayList<String>();
          try {
               FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
//          System.out.println(cadena);
            preguntas.add(cadena);
      }
      b.close();
          } catch (Exception e) {
          }
     
      return preguntas;
   } 
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
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Iniciar_sesion().setVisible(true);
            }
        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblmensage;
    private javax.swing.JLabel lblr;
    private javax.swing.JPasswordField txtcon;
    private javax.swing.JTextField txtusu;
    // End of variables declaration//GEN-END:variables
}
