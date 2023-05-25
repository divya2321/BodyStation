/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PopUpInterface;

import Database.Beans.SupplimentBrand;
import Database.Beans.TypeModel;
import Database.Tables.BrandNameManagement;
import Database.Tables.TypeManagement;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import GUI.adminPanel;

/**
 *
 * @author divsi
 */
public class NewType extends javax.swing.JFrame {

    private static NewType newTypeInstance;

    public static synchronized NewType getInstance() {
        if (newTypeInstance == null) {
            System.out.println("OPEN WEYANKO");
            newTypeInstance = new NewType();
        }
        return newTypeInstance;
    }

    public NewType() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        refreshType();
    }

    ResultSet typeNameSet;

    private void loadTypeName() {

        DefaultListModel typeList = new DefaultListModel();
        DefaultComboBoxModel typeCombo = new DefaultComboBoxModel();
        try {
            typeNameSet = TypeManagement.getAllType();
            typeList.clear();
            typeCombo.removeAllElements();
            while (typeNameSet.next()) {
                typeList.addElement(typeNameSet.getString("type"));
                typeCombo.addElement(typeNameSet.getString("type"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        this.typeList.setModel(typeList);
//        this.typeCombo.setModel(typeCombo);

    }

    private void refreshType() {
        loadTypeName();
        typeName.setText(null);
        saveType.setEnabled(true);
        updateType.setEnabled(false);
        GUI.StockPanel.getInstance().loadType();
    }

    ArrayList<String> types = new ArrayList<String>();
    ResultSet rs_allType;

    private boolean isAlreadyType(String typeName) {
        rs_allType = BrandNameManagement.getAllBrand();
        try {
            while (rs_allType.next()) {
                types.add(rs_allType.getString("type").toLowerCase());
            }
        } catch (Exception e) {

        }
        return types.contains(typeName.toLowerCase());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        packageNamePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        typeName = new javax.swing.JTextField();
        saveType = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        typeList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        updateType = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        packageNamePanel.setBackground(new java.awt.Color(255, 255, 255));
        packageNamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Type Name");
        packageNamePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 130, 30));

        typeName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        packageNamePanel.add(typeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 320, 30));

        saveType.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        saveType.setText("Add New Brand");
        saveType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        saveType.setFocusable(false);
        saveType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveTypeActionPerformed(evt);
            }
        });
        packageNamePanel.add(saveType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 220, 30));

        typeList.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        typeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                typeListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(typeList);

        packageNamePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 320, 290));

        jLabel1.setBackground(new java.awt.Color(29, 124, 167));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("New Type          ");
        jLabel1.setOpaque(true);
        packageNamePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        updateType.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        updateType.setText("Update Brand");
        updateType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        updateType.setFocusable(false);
        updateType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTypeActionPerformed(evt);
            }
        });
        packageNamePanel.add(updateType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 220, 30));

        getContentPane().add(packageNamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    TypeModel typeModel;
    private void saveTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveTypeActionPerformed

        if (!typeName.getText().trim().equals("")) {
            if (!isAlreadyType(typeName.getText().trim())) {
                typeModel = new TypeModel();
                typeModel.setTypeName(typeName.getText().trim());
                if (TypeManagement.saveTypeName(typeModel)) {
                    JOptionPane.showMessageDialog(this, "Successfully added!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
                    refreshType();
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Already saved brand!", "Failed!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Brand cannot be empty!", "Failed!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_saveTypeActionPerformed

    TypeModel selectedTypeModel;
    ResultSet rs_selectedType;
    private void typeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeListMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                saveType.setEnabled(false);
                updateType.setEnabled(true);
                selectedTypeModel = new TypeModel();
                rs_selectedType = TypeManagement.getSelectedType(typeList.getSelectedValue().trim());
                typeName.setText(typeList.getSelectedValue().trim());
                if (rs_selectedType.next()) {
                    selectedTypeModel.setTypeId(rs_selectedType.getInt("idtype"));
                    
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_typeListMouseClicked

    private void updateTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTypeActionPerformed

        if (!typeName.getText().trim().equals("")) {
            if (!isAlreadyType(typeName.getText().trim())) {
                selectedTypeModel.setTypeName(typeName.getText().trim());
                if (TypeManagement.updateTypeName(selectedTypeModel)) {
                    JOptionPane.showMessageDialog(this, "Successfully updated!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
                    refreshType();
                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Already saved brand!", "Failed!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Brand cannot be empty!", "Failed!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_updateTypeActionPerformed

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
            java.util.logging.Logger.getLogger(NewType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel packageNamePanel;
    private javax.swing.JButton saveType;
    private javax.swing.JList<String> typeList;
    private javax.swing.JTextField typeName;
    private javax.swing.JButton updateType;
    // End of variables declaration//GEN-END:variables
}
