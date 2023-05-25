package PopUpInterface;

import Database.Beans.SupplimentBrand;
import Database.Tables.BrandNameManagement;
import Database.Tables.PackageNameManagement;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import GUI.adminPanel;

/**
 *
 * @author divsi
 */
public class NewBrandName extends javax.swing.JFrame {

    private static NewBrandName newBrandNameInstance;

    public static synchronized NewBrandName getInstance() {
        if (newBrandNameInstance == null) {
            newBrandNameInstance = new NewBrandName();
        }
        return newBrandNameInstance;
    }

    public NewBrandName() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        refreshBrand();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        packageNamePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        brandName = new javax.swing.JTextField();
        saveBrand = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        brandList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        updateBrand = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        packageNamePanel.setBackground(new java.awt.Color(255, 255, 255));
        packageNamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Brand Name");
        packageNamePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 30));

        brandName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        packageNamePanel.add(brandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 310, 30));

        saveBrand.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        saveBrand.setText("Add New Brand");
        saveBrand.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        saveBrand.setFocusable(false);
        saveBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBrandActionPerformed(evt);
            }
        });
        packageNamePanel.add(saveBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 220, 30));

        brandList.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        brandList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brandListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(brandList);

        packageNamePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 320, 290));

        jLabel1.setBackground(new java.awt.Color(29, 124, 167));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("New Brand          ");
        jLabel1.setOpaque(true);
        packageNamePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        updateBrand.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        updateBrand.setText("Update Brand");
        updateBrand.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        updateBrand.setFocusable(false);
        updateBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBrandActionPerformed(evt);
            }
        });
        packageNamePanel.add(updateBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 220, 30));

        getContentPane().add(packageNamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ResultSet brandNameSet;

    private void loadBrandName() {

        DefaultListModel brandList = new DefaultListModel();
        DefaultComboBoxModel brandCombo = new DefaultComboBoxModel();
        try {
            brandNameSet = BrandNameManagement.getAllBrand();
            brandList.clear();
            brandCombo.removeAllElements();
            while (brandNameSet.next()) {
                brandList.addElement(brandNameSet.getString("brand"));
                brandCombo.addElement(brandNameSet.getString("brand"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        this.brandList.setModel(brandList);
//        this.brandNameCombo.setModel(brandCombo);

    }

    private void refreshBrand() {
        loadBrandName();
        brandName.setText(null);
        saveBrand.setEnabled(true);
        updateBrand.setEnabled(false);        
        GUI.StockPanel.getInstance().loadBrandName();
    }

    ArrayList<String> brandNames ;
    ResultSet rs_allBrand;

    private boolean isAlreadyBrand(String brandName) {
        brandNames = new ArrayList<String>();
        rs_allBrand = BrandNameManagement.getAllBrand();
        try {
            while (rs_allBrand.next()) {
                brandNames.add(rs_allBrand.getString("brand").toLowerCase());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return brandNames.contains(brandName.toLowerCase());
    }

    SupplimentBrand supBrand;
    private void saveBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBrandActionPerformed

        if (!brandName.getText().trim().equals("")) {
            if (!isAlreadyBrand(brandName.getText().trim())) {
                supBrand = new SupplimentBrand();
                
                supBrand.setBrandName(brandName.getText().trim());
                if (BrandNameManagement.saveBrandName(supBrand)) {
                    JOptionPane.showMessageDialog(this, "Successfully added!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
                    refreshBrand();
                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Already saved brand!", "Failed!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Brand cannot be empty!", "Failed!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_saveBrandActionPerformed

    SupplimentBrand selectedSupModel;
    ResultSet rs_selectedBrand;
    private void brandListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brandListMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                saveBrand.setEnabled(false);
                updateBrand.setEnabled(true);
                selectedSupModel = new SupplimentBrand();
                rs_selectedBrand = BrandNameManagement.getSelectedBrand(brandList.getSelectedValue().trim());
                brandName.setText(brandList.getSelectedValue().trim());
                if (rs_selectedBrand.next()) {
                    selectedSupModel.setBrandId(rs_selectedBrand.getInt("idbrand"));
                    
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_brandListMouseClicked


    private void updateBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBrandActionPerformed

        if (!brandName.getText().trim().equals("")) {
            if (!isAlreadyBrand(brandName.getText().trim())) {
                selectedSupModel.setBrandName(brandName.getText().trim());
                if (BrandNameManagement.updateBrandName(selectedSupModel)) {
                    JOptionPane.showMessageDialog(this, "Successfully updated!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
                    refreshBrand();
                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Already saved brand!", "Failed!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Brand cannot be empty!", "Failed!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_updateBrandActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewBrandName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBrandName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBrandName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBrandName.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBrandName().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> brandList;
    private javax.swing.JTextField brandName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel packageNamePanel;
    private javax.swing.JButton saveBrand;
    private javax.swing.JButton updateBrand;
    // End of variables declaration//GEN-END:variables
}
