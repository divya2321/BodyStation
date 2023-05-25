/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PopUpInterface;

import Database.Tables.StockManagement;
import javax.swing.JOptionPane;
import GUI.StockPanel;

/**
 *
 * @author nipun
 */
public class SetSellingPrice extends javax.swing.JFrame {

    /**
     * Creates new form SetSellingPrice
     */
    public SetSellingPrice() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }
    
    private static SetSellingPrice instance;

    public static synchronized SetSellingPrice getInstance() {
        if (instance == null) {
            System.out.println("OPEN WEYANKO");
            instance = new SetSellingPrice();
        }
        return instance;
    }
    
    int stkId = 0;
    
    public void updateSellPrice(int stockId){
        stkId = stockId;
        this.stockId.setText(String.valueOf(stkId));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        stockId = new javax.swing.JLabel();
        supSellingPrice = new javax.swing.JTextField();
        cancelPrice = new javax.swing.JButton();
        addPrice = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(29, 124, 167));
        jPanel1.setForeground(new java.awt.Color(29, 124, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     Add Selling Price");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stockId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        stockId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(stockId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 230, 40));

        supSellingPrice.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        supSellingPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(supSellingPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 190, 30));

        cancelPrice.setBackground(new java.awt.Color(255, 255, 255));
        cancelPrice.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cancelPrice.setForeground(new java.awt.Color(255, 0, 0));
        cancelPrice.setText("Cancel");
        cancelPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        cancelPrice.setContentAreaFilled(false);
        cancelPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPriceActionPerformed(evt);
            }
        });
        jPanel2.add(cancelPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, 40));

        addPrice.setBackground(new java.awt.Color(255, 255, 255));
        addPrice.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        addPrice.setForeground(new java.awt.Color(29, 124, 167));
        addPrice.setText("Add Price");
        addPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        addPrice.setContentAreaFilled(false);
        addPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPriceActionPerformed(evt);
            }
        });
        jPanel2.add(addPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 120, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPriceActionPerformed
        if (StockManagement.setSellingPrice(Double.parseDouble(supSellingPrice.getText()), stkId)) {
            StockPanel.getInstance().loadStock(StockManagement.getAllStock());
            supSellingPrice.setText(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addPriceActionPerformed

    private void cancelPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPriceActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelPriceActionPerformed

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
            java.util.logging.Logger.getLogger(SetSellingPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetSellingPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetSellingPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetSellingPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetSellingPrice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPrice;
    private javax.swing.JButton cancelPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel stockId;
    private javax.swing.JTextField supSellingPrice;
    // End of variables declaration//GEN-END:variables
}
