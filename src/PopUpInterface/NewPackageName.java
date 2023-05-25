package PopUpInterface;

import Database.Beans.PackageName;
import Database.Tables.PackageNameManagement;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import GUI.RegistrationPanel;
import GUI.adminPanel;

public class NewPackageName extends javax.swing.JFrame {

    private static NewPackageName newPackageNameInstance;

    public NewPackageName() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setResizable(false);

        updatePackage.setEnabled(false);
        packageNameCombo.setEditable(false);
        packageNameCombo.setOpaque(false);

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        loadAllPackageNames();
    }

    public static synchronized NewPackageName getInstance() {
        if (newPackageNameInstance == null) {
            newPackageNameInstance = new NewPackageName();
        }
        return newPackageNameInstance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        packageNamePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        packageName = new javax.swing.JTextField();
        packageNameCombo = new javax.swing.JComboBox<>();
        savePackage = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        packageList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        updatePackage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        packageNamePanel.setBackground(new java.awt.Color(255, 255, 255));
        packageNamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Package Name");
        packageNamePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, -1));

        packageName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        packageNamePanel.add(packageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 300, 30));

        packageNameCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        packageNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageNameComboActionPerformed(evt);
            }
        });
        packageNamePanel.add(packageNameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 320, 30));

        savePackage.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        savePackage.setText("Add New Package");
        savePackage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        savePackage.setFocusable(false);
        savePackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePackageActionPerformed(evt);
            }
        });
        packageNamePanel.add(savePackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 220, 40));

        packageList.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        packageList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packageListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(packageList);

        packageNamePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 320, 310));

        jLabel1.setBackground(new java.awt.Color(29, 124, 167));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Package Setting          ");
        jLabel1.setOpaque(true);
        packageNamePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        updatePackage.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        updatePackage.setText("Update Package");
        updatePackage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        updatePackage.setFocusable(false);
        updatePackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePackageActionPerformed(evt);
            }
        });
        packageNamePanel.add(updatePackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 220, 40));

        getContentPane().add(packageNamePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static String packageNameText;
    private static int packgeStateText;
    public static PackageName packageNameModel = new PackageName();

    private void packageNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageNameComboActionPerformed
        getSelectedPackageNameModel(packageNameCombo.getSelectedItem().toString().trim());
    }//GEN-LAST:event_packageNameComboActionPerformed

    ArrayList<String> packageNameList ;
    ResultSet allPackageNames;

    private void savePackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePackageActionPerformed

        
        getAllPackageNames();

        if (isNotEmpty()) {
            packageNameText = packageName.getText().trim();

            if (isNewPackageName()) {
                PackageNameManagement.savePackageName(packageNameText);
                RegistrationPanel.getInstance().loadPackageCombo();
            } else {
                JOptionPane.showMessageDialog(this, "You already have saved the package!", "Alert!", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Cannot have an empty package name!", "Alert!", JOptionPane.WARNING_MESSAGE);
            packageName.setFocusable(true);
        }

        refreshAll();
    }//GEN-LAST:event_savePackageActionPerformed


    private void updatePackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePackageActionPerformed
        getAllPackageNames();

        if (isNotEmpty()) {
            packageNameText = packageName.getText().trim();
            if (isNewPackageName()) {
                packageNameModel.setPackageName(packageNameText);
                    System.out.println("D"+packageNameModel.getPackageName());
        System.out.println("E"+packageNameModel.getIdPackageName());
                PackageNameManagement.updatePackageName(packageNameModel);                
                RegistrationPanel.getInstance().loadPackageCombo();
            } else {
                JOptionPane.showMessageDialog(this, "You already have saved the package!", "Alert!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cannot have an empty package name!", "Alert!", JOptionPane.WARNING_MESSAGE);
            packageName.setFocusable(true);
        }

        refreshAll();
    }//GEN-LAST:event_updatePackageActionPerformed


    private void packageListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packageListMouseClicked
        if (evt.getClickCount() == 2) {
            getSelectedPackageNameModel(packageList.getSelectedValue().trim());
        }
    }//GEN-LAST:event_packageListMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPackageName().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> packageList;
    private javax.swing.JTextField packageName;
    private javax.swing.JComboBox<String> packageNameCombo;
    private javax.swing.JPanel packageNamePanel;
    private javax.swing.JButton savePackage;
    private javax.swing.JButton updatePackage;
    // End of variables declaration//GEN-END:variables

    ResultSet packageNameSet;

    public void loadAllPackageNames() {
        DefaultListModel packageNameList = new DefaultListModel();
        DefaultComboBoxModel packageNameCombo = new DefaultComboBoxModel();
        try {
            packageNameSet = PackageNameManagement.getAllPackageNames();
            packageNameList.clear();
            packageNameCombo.removeAllElements();
            while (packageNameSet.next()) {
                packageNameList.addElement(packageNameSet.getString("packagename"));
                packageNameCombo.addElement(packageNameSet.getString("packagename"));
                System.out.println(packageNameSet.getString("packagename"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        packageList.setModel(packageNameList);
        this.packageNameCombo.setModel(packageNameCombo);
    }

    public void refreshAll() {
        packageName.setText(null);
        packgeStateText = 1;
        loadAllPackageNames();

        savePackage.setEnabled(true);
        updatePackage.setEnabled(false);

        adminPanel.getInstance().loadOnCreate();
    }

    public void getSelectedPackageNameModel(String selectedPackageName) {
        savePackage.setEnabled(false);
        updatePackage.setEnabled(true);

        packageName.setText(selectedPackageName);
        packageNameModel = PackageNameManagement.getPackageNameModel(selectedPackageName);

    }

    public void getAllPackageNames() {
        packageNameList = new ArrayList<String>();
        allPackageNames = PackageNameManagement.getAllPackageNames();

        try {
            while (allPackageNames.next()) {
                packageNameList.add(allPackageNames.getString("packagename"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isNewPackageName() {
        return !packageNameList.stream().anyMatch(packageName.getText().trim()::equalsIgnoreCase);
    }

    public boolean isNotEmpty() {
        return !packageName.getText().trim().equals("");

    }

}
