package hhssadventure;

import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author brayden
 */
public class GUI extends javax.swing.JFrame {

    private Controller controller;
    private ImageComponent imagePanel;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    public void setController(Controller c) {
        controller = c;
    }

    public void setImage(BufferedImage img) {
        // the image panel sets its image
        imagePanel.setImage(img);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        northButton = new javax.swing.JButton();
        westButton = new javax.swing.JButton();
        eastButton = new javax.swing.JButton();
        southButton = new javax.swing.JButton();
        Advance = new javax.swing.JButton();
        imageComponent1 = new hhssadventure.ImageComponent();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        northButton.setText("North");
        northButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                northButtonActionPerformed(evt);
            }
        });

        westButton.setText("West");
        westButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                westButtonActionPerformed(evt);
            }
        });

        eastButton.setText("East");
        eastButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eastButtonActionPerformed(evt);
            }
        });

        southButton.setText("South");
        southButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                southButtonActionPerformed(evt);
            }
        });

        Advance.setText("Advance");
        Advance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdvanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(westButton)
                        .addGap(47, 47, 47)
                        .addComponent(eastButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(northButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(southButton)
                        .addGap(105, 105, 105)
                        .addComponent(Advance)))
                .addContainerGap(132, Short.MAX_VALUE))
            .addComponent(imageComponent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(imageComponent1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(northButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(westButton)
                    .addComponent(eastButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(southButton)
                    .addComponent(Advance))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void northButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_northButtonActionPerformed
        controller.turnNorth();
    }//GEN-LAST:event_northButtonActionPerformed

    private void westButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_westButtonActionPerformed
        controller.turnWest();
    }//GEN-LAST:event_westButtonActionPerformed

    private void eastButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eastButtonActionPerformed
        controller.turnEast();
    }//GEN-LAST:event_eastButtonActionPerformed

    private void southButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_southButtonActionPerformed
        controller.turnSouth();
    }//GEN-LAST:event_southButtonActionPerformed

    private void AdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdvanceActionPerformed
        controller.moveForwards();
    }//GEN-LAST:event_AdvanceActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Advance;
    private javax.swing.JButton eastButton;
    private hhssadventure.ImageComponent imageComponent1;
    private javax.swing.JButton northButton;
    private javax.swing.JButton southButton;
    private javax.swing.JButton westButton;
    // End of variables declaration//GEN-END:variables
}
