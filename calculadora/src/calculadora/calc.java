/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Root
 */
public class calc extends javax.swing.JFrame {
    /**
     * Creates new form calc
     */
    public calc() {
        initComponents();
       
       
    }
    double value1, value2;
    String sinal;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jt_opera = new javax.swing.JTextField();
        BT0 = new javax.swing.JToggleButton();
        BT1 = new javax.swing.JToggleButton();
        BT2 = new javax.swing.JToggleButton();
        BT3 = new javax.swing.JToggleButton();
        BT4 = new javax.swing.JToggleButton();
        BT5 = new javax.swing.JToggleButton();
        BT6 = new javax.swing.JToggleButton();
        BT7 = new javax.swing.JToggleButton();
        BT8 = new javax.swing.JToggleButton();
        BT9 = new javax.swing.JToggleButton();
        BT_igual = new javax.swing.JToggleButton();
        BT_sub = new javax.swing.JToggleButton();
        BT_mult = new javax.swing.JToggleButton();
        BT_adcao = new javax.swing.JToggleButton();
        BT_divi = new javax.swing.JToggleButton();
        BT_ponto = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Jt_opera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jt_operaActionPerformed(evt);
            }
        });

        BT0.setText("0");
        BT0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT0ActionPerformed(evt);
            }
        });

        BT1.setText("1");
        BT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT1ActionPerformed(evt);
            }
        });

        BT2.setText("2");
        BT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT2ActionPerformed(evt);
            }
        });

        BT3.setText("3");
        BT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT3ActionPerformed(evt);
            }
        });

        BT4.setText("4");
        BT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT4ActionPerformed(evt);
            }
        });

        BT5.setText("5");
        BT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT5ActionPerformed(evt);
            }
        });

        BT6.setText("6");
        BT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT6ActionPerformed(evt);
            }
        });

        BT7.setText("7");
        BT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT7ActionPerformed(evt);
            }
        });

        BT8.setText("8");
        BT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT8ActionPerformed(evt);
            }
        });

        BT9.setText("9");
        BT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT9ActionPerformed(evt);
            }
        });

        BT_igual.setText("=");
        BT_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_igualActionPerformed(evt);
            }
        });

        BT_sub.setText("-");
        BT_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_subActionPerformed(evt);
            }
        });

        BT_mult.setText("*");
        BT_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_multActionPerformed(evt);
            }
        });

        BT_adcao.setText("+");
        BT_adcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_adcaoActionPerformed(evt);
            }
        });

        BT_divi.setText("/");
        BT_divi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_diviActionPerformed(evt);
            }
        });

        BT_ponto.setText(".");
        BT_ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_pontoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALCULADORA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BT4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT_ponto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BT5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(BT3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BT6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BT_mult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BT_sub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BT_igual)
                                        .addGap(18, 18, 18)
                                        .addComponent(BT_adcao, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BT7)
                                .addGap(18, 18, 18)
                                .addComponent(BT8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BT9)
                                .addGap(18, 18, 18)
                                .addComponent(BT_divi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Jt_opera, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jt_opera, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT7)
                    .addComponent(BT8)
                    .addComponent(BT9)
                    .addComponent(BT_divi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT4)
                    .addComponent(BT5)
                    .addComponent(BT6)
                    .addComponent(BT_sub))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT1)
                    .addComponent(BT2)
                    .addComponent(BT3)
                    .addComponent(BT_mult))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT0)
                    .addComponent(BT_ponto)
                    .addComponent(BT_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BT_adcao))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT1ActionPerformed
       Jt_opera.setText(Jt_opera.getText()+ "1");
       
    }//GEN-LAST:event_BT1ActionPerformed

    private void BT_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_igualActionPerformed
      value2 = Double.parseDouble(Jt_opera.getText());
      if(sinal == "soma"){
          Jt_opera.setText(String.valueOf(soma(value1, value2)));
      }else if (sinal == "menos"){
          Jt_opera.setText(String.valueOf(sub(value1, value2)));
      }else if (sinal == "mult"){
          Jt_opera.setText(String.valueOf(mult(value1, value2)));
      }else if (sinal == "divi"){
          Jt_opera.setText(String.valueOf(div(value1, value2)));
      }else if(value2 == 0) {
         Jt_opera.setText(String.valueOf("ERRO DE CALCULO"));
      }
        
    }//GEN-LAST:event_BT_igualActionPerformed

    private void BT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT2ActionPerformed
        
        Jt_opera.setText(Jt_opera.getText()+ "2");
    }//GEN-LAST:event_BT2ActionPerformed

    private void BT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT3ActionPerformed
        
      Jt_opera.setText(Jt_opera.getText()+ "3");
    }//GEN-LAST:event_BT3ActionPerformed

    private void BT_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_subActionPerformed
      value1 = Double.parseDouble(Jt_opera.getText());
       Jt_opera.setText("");
       sinal = "menos";
        
    }//GEN-LAST:event_BT_subActionPerformed

    private void BT0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT0ActionPerformed
       Jt_opera.setText(Jt_opera.getText()+ "0");
    }//GEN-LAST:event_BT0ActionPerformed

    private void BT_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_multActionPerformed
    value1 = Double.parseDouble(Jt_opera.getText());
       Jt_opera.setText("");
       sinal = "mult";
    }//GEN-LAST:event_BT_multActionPerformed

    private void BT_adcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_adcaoActionPerformed
       value1 = Double.parseDouble(Jt_opera.getText());
       Jt_opera.setText("");
       sinal = "soma";
    }//GEN-LAST:event_BT_adcaoActionPerformed

    private void BT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT4ActionPerformed
        
        Jt_opera.setText(Jt_opera.getText()+ "4");
    }//GEN-LAST:event_BT4ActionPerformed

    private void BT8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT8ActionPerformed
     Jt_opera.setText(Jt_opera.getText()+ "8");
    }//GEN-LAST:event_BT8ActionPerformed

    private void BT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT5ActionPerformed
        
        Jt_opera.setText(Jt_opera.getText()+ "5");
    }//GEN-LAST:event_BT5ActionPerformed

    private void BT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT6ActionPerformed
        
       Jt_opera.setText(Jt_opera.getText()+ "6");
    }//GEN-LAST:event_BT6ActionPerformed

    private void BT7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT7ActionPerformed
        
        Jt_opera.setText(Jt_opera.getText()+ "7");
    }//GEN-LAST:event_BT7ActionPerformed

    private void BT9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT9ActionPerformed
        
        Jt_opera.setText(Jt_opera.getText()+ "9");
    }//GEN-LAST:event_BT9ActionPerformed

    private void BT_diviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_diviActionPerformed
       value1 = Double.parseDouble(Jt_opera.getText());
       Jt_opera.setText("");
       sinal = "divi";
    }//GEN-LAST:event_BT_diviActionPerformed

    private void Jt_operaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jt_operaActionPerformed
       
      
    }//GEN-LAST:event_Jt_operaActionPerformed

    private void BT_pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_pontoActionPerformed
        Jt_opera.setText(Jt_opera.getText()+ ".");
    }//GEN-LAST:event_BT_pontoActionPerformed

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
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }
    public static double soma(double v1 , double v2){
        
        return v1 + v2;
    }public static double sub(double v1 , double v2){
        
        return v1 - v2;
    }public static double mult(double v1 , double v2){
        
        return v1 * v2;
    }public static double div(double v1 , double v2){
        
        return v1 / v2;
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BT0;
    private javax.swing.JToggleButton BT1;
    private javax.swing.JToggleButton BT2;
    private javax.swing.JToggleButton BT3;
    private javax.swing.JToggleButton BT4;
    private javax.swing.JToggleButton BT5;
    private javax.swing.JToggleButton BT6;
    private javax.swing.JToggleButton BT7;
    private javax.swing.JToggleButton BT8;
    private javax.swing.JToggleButton BT9;
    private javax.swing.JToggleButton BT_adcao;
    private javax.swing.JToggleButton BT_divi;
    private javax.swing.JToggleButton BT_igual;
    private javax.swing.JToggleButton BT_mult;
    private javax.swing.JToggleButton BT_ponto;
    private javax.swing.JToggleButton BT_sub;
    private javax.swing.JTextField Jt_opera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
