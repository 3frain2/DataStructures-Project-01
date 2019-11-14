/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JButton;

/**
 *
 * @author efrai
 */
public class Pantalla extends javax.swing.JFrame {

  /**
   * Creates new form Pantalla
   */
  public Pantalla() {
    initComponents();
  }
  
  public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;
      int lineasX = 75;
      int lineasY = 50;
      int distanciaBotonesX = 0;
      int distanciaBotonesY = 0;
      for(int i = 0; i <17; i++) {
        Line2D linea = new Line2D.Float(0, lineasX, 750, lineasX);
        lineasX+=50;
        g2.draw(linea);
      }
      
      for(int i = 0; i <31; i++) {
        Line2D linea = new Line2D.Float(lineasY, 0, lineasY, 475);
        lineasY+=50;
        g2.draw(linea);
      }
      /*
      for(int i = 0; i <9; i++) {
        for(int j = 0; j <15; j++) {
          JButton button = new JButton("A");
          button.setBounds(distanciaBotonesX, distanciaBotonesY, 50, 50);
          distanciaBotonesX+=50;
          add(button);
        }
        distanciaBotonesX=0;
        distanciaBotonesY+=50;
      }
      */
  }

  public void cuadros() {
    int distanciaBotonesX = 0;
    int distanciaBotonesY = 0;
    for(int i = 0; i <9; i++) {
      for(int j = 0; j <15; j++) {
        JButton button = new JButton("A");
        button.setBounds(distanciaBotonesX, distanciaBotonesY, 50, 50);
        distanciaBotonesX+=50;
        add(button);
      }
      distanciaBotonesX=0;
      distanciaBotonesY+=50;
    }
    repaint();
  }
  
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 594, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 412, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents
  
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
      java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        Pantalla pantalla = new Pantalla();
        
        //pantalla.cuadros();
        
        Graphics g = pantalla.getGraphics();
        pantalla.paint(g);
        
        pantalla.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  // End of variables declaration//GEN-END:variables
}