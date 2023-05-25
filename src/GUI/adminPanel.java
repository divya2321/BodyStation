package GUI;

import Classes.Colors;
import Database.Beans.PackageName;
import Database.Beans.PaymentType;
import Database.Beans.SupplimentModel;
import Database.Beans.UserAccount;
import Database.Tables.AccountManagement;
import Database.Tables.BrandNameManagement;
import Database.Tables.MemberManagement;
import Database.Tables.PackageManagement;
import Database.Tables.PackageNameManagement;
import Database.Tables.StaffManagement;
import Database.Tables.SupplimentManagement;
import Database.Tables.TypeManagement;
import PopUpInterface.NewBrandName;
import PopUpInterface.NewPackageName;
import PopUpInterface.NewType;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class adminPanel extends javax.swing.JPanel {

    public adminPanel() {
        initComponents();

        loadOnCreate();
        loadPackgeTable();

        loadPackageName();
        refreshAll();

        onLoadingAccountSetting();

//        refreshSup();
    }

    private static adminPanel adminPanel = null;

    public static synchronized adminPanel getInstance() {
        if (adminPanel == null) {
            adminPanel = new adminPanel();
        }
        return adminPanel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        accountSettingBtn = new javax.swing.JButton();
        packageSettingBtn = new javax.swing.JButton();
        packagePanel = new javax.swing.JPanel();
        packageSettingPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        packageNameCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        gotoPackageName = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        paymentTypeCombo = new javax.swing.JComboBox<>();
        packageAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        updatePackage = new javax.swing.JButton();
        statePackage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        packageTable = new javax.swing.JTable();
        savePackage = new javax.swing.JButton();
        savePackage1 = new javax.swing.JButton();
        AccountCreatePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        acountUsername = new com.alee.laf.text.WebTextField();
        accountName = new com.alee.laf.text.WebTextField();
        accountPaswordConfirmNote = new javax.swing.JLabel();
        accountPaswordConfirm = new com.alee.laf.text.WebPasswordField();
        accountPassword = new com.alee.laf.text.WebPasswordField();
        accountNicNote = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        accountPasswordNNote = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        accountNic = new com.alee.laf.text.WebTextField();
        accountContinueBtn = new javax.swing.JButton();
        accountUsernameNote = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        recoveryPanel = new javax.swing.JPanel();
        accountRecoverHit = new com.alee.laf.text.WebTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        accountRecoverAnswer = new com.alee.laf.text.WebPasswordField();
        accountStatusBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        accountTable = new javax.swing.JTable();
        accountCreateBtn = new javax.swing.JButton();
        accountCreateBtn1 = new javax.swing.JButton();
        supplimentPanel = new javax.swing.JPanel();
        packageSettingPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        supBrand = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        newBrand = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        supType = new javax.swing.JComboBox<>();
        newType = new javax.swing.JButton();
        supName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        updateSup = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        supTable = new javax.swing.JTable();
        saveSup = new javax.swing.JButton();
        refreshSup = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(29, 124, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountSettingBtn.setBackground(new java.awt.Color(29, 124, 167));
        accountSettingBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        accountSettingBtn.setForeground(new java.awt.Color(255, 255, 255));
        accountSettingBtn.setText("Account Setting");
        buttonGroup1.add(accountSettingBtn);
        accountSettingBtn.setContentAreaFilled(false);
        accountSettingBtn.setFocusPainted(false);
        accountSettingBtn.setOpaque(true);
        accountSettingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountSettingBtnActionPerformed(evt);
            }
        });
        jPanel1.add(accountSettingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 170, 50));

        packageSettingBtn.setBackground(new java.awt.Color(29, 124, 167));
        packageSettingBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        packageSettingBtn.setForeground(new java.awt.Color(255, 255, 255));
        packageSettingBtn.setText("Package Settings");
        buttonGroup1.add(packageSettingBtn);
        packageSettingBtn.setContentAreaFilled(false);
        packageSettingBtn.setFocusPainted(false);
        packageSettingBtn.setOpaque(true);
        packageSettingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageSettingBtnActionPerformed(evt);
            }
        });
        jPanel1.add(packageSettingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 50));

        packagePanel.setBackground(new java.awt.Color(255, 255, 255));
        packagePanel.setLayout(new java.awt.CardLayout());

        packageSettingPanel.setBackground(new java.awt.Color(255, 255, 255));
        packageSettingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Packages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 20, -1, 100));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 20, -1, 110));

        packageNameCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        packageNameCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        packageNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageNameComboActionPerformed(evt);
            }
        });
        packageNameCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                packageNameComboPropertyChange(evt);
            }
        });
        jPanel3.add(packageNameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 250, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Package Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 30));

        gotoPackageName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        gotoPackageName.setText("Add New");
        gotoPackageName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gotoPackageName.setFocusPainted(false);
        gotoPackageName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gotoPackageNameActionPerformed(evt);
            }
        });
        jPanel3.add(gotoPackageName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Payment Type");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 120, 30));

        paymentTypeCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        paymentTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Payment Type", "Monthly", "03 Month", "06 Month", "Annually" }));
        paymentTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentTypeComboActionPerformed(evt);
            }
        });
        paymentTypeCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                paymentTypeComboPropertyChange(evt);
            }
        });
        jPanel3.add(paymentTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 210, 30));

        packageAmount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(packageAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 190, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Amount");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 120, 30));

        packageSettingPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1130, 140));

        updatePackage.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        updatePackage.setText("Edit Package");
        updatePackage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        updatePackage.setFocusPainted(false);
        updatePackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePackageActionPerformed(evt);
            }
        });
        packageSettingPanel.add(updatePackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, 30));

        statePackage.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        statePackage.setForeground(new java.awt.Color(255, 0, 0));
        statePackage.setText("Deactivate");
        statePackage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        statePackage.setContentAreaFilled(false);
        statePackage.setFocusPainted(false);
        statePackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statePackageActionPerformed(evt);
            }
        });
        packageSettingPanel.add(statePackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 180, 30));

        packageTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        packageTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        packageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Package ID", "Package", "Payment Type", "Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        packageTable.setGridColor(new java.awt.Color(29, 124, 167));
        packageTable.setRowHeight(20);
        packageTable.setSelectionBackground(new java.awt.Color(29, 124, 167));
        packageTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packageTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(packageTable);
        if (packageTable.getColumnModel().getColumnCount() > 0) {
            packageTable.getColumnModel().getColumn(0).setResizable(false);
            packageTable.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        packageSettingPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 1130, 350));

        savePackage.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        savePackage.setText("Add Package");
        savePackage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        savePackage.setFocusPainted(false);
        savePackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePackageActionPerformed(evt);
            }
        });
        packageSettingPanel.add(savePackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 180, 30));

        savePackage1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        savePackage1.setText("Refresh");
        savePackage1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        savePackage1.setFocusPainted(false);
        savePackage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePackage1ActionPerformed(evt);
            }
        });
        packageSettingPanel.add(savePackage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 180, 30));

        packagePanel.add(packageSettingPanel, "card2");

        AccountCreatePanel.setBackground(new java.awt.Color(255, 255, 255));
        AccountCreatePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 1, true), "General Account Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(29, 124, 167))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acountUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        acountUsername.setInputPrompt("Username");
        acountUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                acountUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                acountUsernameFocusLost(evt);
            }
        });
        acountUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                acountUsernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                acountUsernameKeyTyped(evt);
            }
        });
        jPanel2.add(acountUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 340, 40));

        accountName.setEditable(false);
        accountName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        accountName.setInputPrompt("Name");
        jPanel2.add(accountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 340, 40));

        accountPaswordConfirmNote.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accountPaswordConfirmNote.setForeground(new java.awt.Color(255, 0, 0));
        accountPaswordConfirmNote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountPaswordConfirmNote.setText("Password is not matching. Check your capslock is on.");
        jPanel2.add(accountPaswordConfirmNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 320, -1));

        accountPaswordConfirm.setEchoChar('#');
        accountPaswordConfirm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        accountPaswordConfirm.setInputPrompt("Body1234");
        accountPaswordConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                accountPaswordConfirmKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountPaswordConfirmKeyTyped(evt);
            }
        });
        jPanel2.add(accountPaswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 340, 40));

        accountPassword.setEchoChar('#');
        accountPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        accountPassword.setInputPrompt("Body1234");
        accountPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                accountPasswordFocusLost(evt);
            }
        });
        accountPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountPasswordKeyTyped(evt);
            }
        });
        jPanel2.add(accountPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 340, 40));

        accountNicNote.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accountNicNote.setForeground(new java.awt.Color(255, 0, 0));
        accountNicNote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountNicNote.setText("Your NIC is not available. Please try again.");
        jPanel2.add(accountNicNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 320, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(29, 124, 167));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Characters should between 5 -  8.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 320, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(29, 124, 167));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Confim Password");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 130, -1));

        accountPasswordNNote.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accountPasswordNNote.setForeground(new java.awt.Color(255, 0, 0));
        accountPasswordNNote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountPasswordNNote.setText("Invalid Password. Please try again.");
        jPanel2.add(accountPasswordNNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 320, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(29, 124, 167));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Max character count is 8.");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 340, -1));

        accountNic.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        accountNic.setInputPrompt("NIC");
        accountNic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                accountNicFocusLost(evt);
            }
        });
        accountNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                accountNicKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountNicKeyTyped(evt);
            }
        });
        jPanel2.add(accountNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 340, 40));

        accountContinueBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        accountContinueBtn.setText("Continue");
        accountContinueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountContinueBtnActionPerformed(evt);
            }
        });
        jPanel2.add(accountContinueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 200, 40));

        accountUsernameNote.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accountUsernameNote.setForeground(new java.awt.Color(255, 0, 0));
        accountUsernameNote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountUsernameNote.setText("Username has already taken.");
        jPanel2.add(accountUsernameNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 330, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(29, 124, 167));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Must contain uppercase letter, lowercase letter and number.");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 340, -1));

        AccountCreatePanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 440, 590));

        recoveryPanel.setBackground(new java.awt.Color(255, 255, 255));
        recoveryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 124, 167), 1, true), "Account Recovery Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(27, 124, 167))); // NOI18N
        recoveryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accountRecoverHit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        accountRecoverHit.setInputPrompt("Type a hint to recover accout");
        accountRecoverHit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountRecoverHitActionPerformed(evt);
            }
        });
        accountRecoverHit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountRecoverHitKeyTyped(evt);
            }
        });
        recoveryPanel.add(accountRecoverHit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 420, 40));

        jLabel12.setForeground(new java.awt.Color(29, 124, 167));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Use a simple hint and short answer to recover your account when need.");
        recoveryPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 670, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Eg: My dog name                                                                                                                          Woofy                                                             ");
        recoveryPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 670, -1));

        accountRecoverAnswer.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        accountRecoverAnswer.setInputPrompt("Answer");
        accountRecoverAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                accountRecoverAnswerKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                accountRecoverAnswerKeyTyped(evt);
            }
        });
        recoveryPanel.add(accountRecoverAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 220, 40));

        AccountCreatePanel.add(recoveryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 710, 140));

        accountStatusBtn.setBackground(new java.awt.Color(255, 255, 255));
        accountStatusBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        accountStatusBtn.setForeground(new java.awt.Color(255, 0, 0));
        accountStatusBtn.setText("Deactivate");
        accountStatusBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        accountStatusBtn.setContentAreaFilled(false);
        accountStatusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountStatusBtnActionPerformed(evt);
            }
        });
        AccountCreatePanel.add(accountStatusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 170, 40));

        accountTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Name", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        accountTable.setRowHeight(22);
        accountTable.setRowMargin(2);
        accountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(accountTable);
        if (accountTable.getColumnModel().getColumnCount() > 0) {
            accountTable.getColumnModel().getColumn(0).setResizable(false);
            accountTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            accountTable.getColumnModel().getColumn(1).setResizable(false);
            accountTable.getColumnModel().getColumn(2).setResizable(false);
            accountTable.getColumnModel().getColumn(2).setPreferredWidth(1);
        }

        AccountCreatePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 710, 310));

        accountCreateBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        accountCreateBtn.setText("Create Your Account");
        accountCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountCreateBtnActionPerformed(evt);
            }
        });
        AccountCreatePanel.add(accountCreateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 310, 40));

        accountCreateBtn1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        accountCreateBtn1.setText("Refresh");
        accountCreateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountCreateBtn1ActionPerformed(evt);
            }
        });
        AccountCreatePanel.add(accountCreateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 130, 40));

        packagePanel.add(AccountCreatePanel, "card3");

        supplimentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        packageSettingPanel1.setBackground(new java.awt.Color(255, 255, 255));
        packageSettingPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        packageSettingPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 60, 10, 100));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        packageSettingPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 60, 10, 100));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Packages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supBrand.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        supBrand.setFocusable(false);
        supBrand.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                supBrandItemStateChanged(evt);
            }
        });
        supBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supBrandActionPerformed(evt);
            }
        });
        supBrand.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                supBrandPropertyChange(evt);
            }
        });
        jPanel5.add(supBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 320, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Brand");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 30));

        newBrand.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        newBrand.setText("Add New");
        newBrand.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        newBrand.setFocusPainted(false);
        newBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBrandActionPerformed(evt);
            }
        });
        jPanel5.add(newBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Type");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 60, 30));

        supType.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Payment Type" }));
        supType.setFocusable(false);
        supType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supTypeActionPerformed(evt);
            }
        });
        supType.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                supTypePropertyChange(evt);
            }
        });
        jPanel5.add(supType, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 290, 30));

        newType.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        newType.setText("Add New");
        newType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        newType.setFocusPainted(false);
        newType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTypeActionPerformed(evt);
            }
        });
        jPanel5.add(newType, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 110, 30));

        supName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel5.add(supName, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 310, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Suppliment Name");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 150, 30));

        packageSettingPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1130, 140));

        updateSup.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        updateSup.setForeground(new java.awt.Color(29, 124, 167));
        updateSup.setText("Update Suppliment");
        updateSup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        updateSup.setContentAreaFilled(false);
        updateSup.setFocusPainted(false);
        updateSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSupActionPerformed(evt);
            }
        });
        packageSettingPanel1.add(updateSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 180, 40));

        supTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        supTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Suppliment ID", "Brand", "Type", "Suppliment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        supTable.setGridColor(new java.awt.Color(29, 124, 167));
        supTable.setRowHeight(20);
        supTable.setSelectionBackground(new java.awt.Color(29, 124, 167));
        supTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(supTable);
        if (supTable.getColumnModel().getColumnCount() > 0) {
            supTable.getColumnModel().getColumn(0).setResizable(false);
            supTable.getColumnModel().getColumn(0).setPreferredWidth(1);
        }

        packageSettingPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 1130, 370));

        saveSup.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        saveSup.setForeground(new java.awt.Color(29, 124, 167));
        saveSup.setText("Save Suppliment");
        saveSup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        saveSup.setContentAreaFilled(false);
        saveSup.setFocusPainted(false);
        saveSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSupActionPerformed(evt);
            }
        });
        packageSettingPanel1.add(saveSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 180, 40));

        refreshSup.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        refreshSup.setForeground(new java.awt.Color(29, 124, 167));
        refreshSup.setText("Refresh");
        refreshSup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        refreshSup.setContentAreaFilled(false);
        refreshSup.setFocusPainted(false);
        refreshSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshSupActionPerformed(evt);
            }
        });
        packageSettingPanel1.add(refreshSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 180, 40));

        supplimentPanel.add(packageSettingPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 640));

        packagePanel.add(supplimentPanel, "card4");

        add(packagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1210, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void gotoPackageNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gotoPackageNameActionPerformed
        NewPackageName newPackageName = NewPackageName.getInstance();
        newPackageName.setVisible(true);
    }//GEN-LAST:event_gotoPackageNameActionPerformed

    private void packageSettingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageSettingBtnActionPerformed
        unselectButton();

        packageSettingBtn.setBackground(Colors.defaultWhite);
        packageSettingBtn.setForeground(Colors.defaultBlue);

        packagePanel.removeAll();
        packagePanel.add(packageSettingPanel);
        packagePanel.repaint();
        packagePanel.revalidate();
        packagePanel.setVisible(true);
    }//GEN-LAST:event_packageSettingBtnActionPerformed

    private void accountSettingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountSettingBtnActionPerformed
        unselectButton();

        accountSettingBtn.setBackground(Colors.defaultWhite);
        accountSettingBtn.setForeground(Colors.defaultBlue);

        packagePanel.removeAll();
        packagePanel.add(AccountCreatePanel);
        packagePanel.repaint();
        packagePanel.revalidate();
        packagePanel.setVisible(true);
    }//GEN-LAST:event_accountSettingBtnActionPerformed

    Database.Beans.Package packageModel;
    private static int packageNameId = 0;
    double packageFee = 0.0;

    private void savePackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePackageActionPerformed
        try {
            packageModel = new Database.Beans.Package();

            if (isEveryDetailSubmitted()) {

                if (isAlreadyRegisteredPackage(packageNameCombo.getSelectedItem().toString() + " " + paymentTypeCombo.getSelectedItem().toString())) {
                    packageModel.setPackageNameId(packageNameId)
                            .setPaymentType(paymentTypeCombo.getSelectedItem().toString())
                            .setAmount(Double.parseDouble(packageAmount.getText()))
                            .setPackageStatus(1);

                    if (PackageManagement.savePackage(packageModel)) {
                        System.out.println("Success!!!!!!!!!!!!!");
                        JOptionPane.showMessageDialog(this, "You have successfully added a package!", "Success!", JOptionPane.INFORMATION_MESSAGE);
                        loadPackgeTable();
                        refreshAll();
                    } else {
                        JOptionPane.showMessageDialog(this, "Something went wrong!", "Alert!", JOptionPane.WARNING_MESSAGE);
                        refreshAll();
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "You already have this package. \nPlease check again!", "Alert!", JOptionPane.WARNING_MESSAGE);
                    refreshAll();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Something wrong with the data you entered. \nPlease check again!", "Alert!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_savePackageActionPerformed

    private static Database.Beans.Package selectedPackage, updatedPackage;

    private void updatePackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePackageActionPerformed

        updatedPackage = new Database.Beans.Package()
                .setPackageId(selectedPackage.getPackageId())
                .setPackageNameId(packageNameId)
                .setPaymentType(paymentTypeCombo.getSelectedItem().toString())
                .setAmount(Double.parseDouble(packageAmount.getText()));

        rs_selectedPackage = PackageManagement.getSelectedPackageDetails(String.valueOf(packageNameId));
        try {
            availablePackageId.clear();
            while (rs_selectedPackage.next()) {
                availablePackageId.add(rs_selectedPackage.getString("idpackage"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        if (!availablePackageId.isEmpty()) {

            if (availablePackageId.contains(String.valueOf(selectedPackage.getPackageId()))) {

                if (PackageManagement.updatePackage(updatedPackage)) {
                    JOptionPane.showMessageDialog(this, "You have successfully updated the package!", "Alert!", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong. \nPlease try again!", "Warning!", JOptionPane.WARNING_MESSAGE);

                }
                availablePackageId.remove(String.valueOf(selectedPackage.getPackageId()));

//                if (!availablePackageId.isEmpty()) {
//                    JOptionPane.showMessageDialog(this, "You have already added the package!", "Warning!", JOptionPane.WARNING_MESSAGE);
//                }
            } else {
                JOptionPane.showMessageDialog(this, "You have already added the package!", "Warning!", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            System.out.println("Its Empty");
            PackageManagement.updatePackage(updatedPackage);
        }

        refreshAll();
        loadPackgeTable();

    }//GEN-LAST:event_updatePackageActionPerformed

    private static int selectedRow, selectedPackageId, selectedPackageStatus;
    private static ResultSet rs_selectedPackage, rs_updatingPackage;
    ArrayList availablePackageId = new ArrayList();

    private void packageTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packageTableMouseClicked
        if (evt.getClickCount() == 2) {

            savePackage.setEnabled(false);
            updatePackage.setEnabled(true);
            statePackage.setEnabled(true);

            packageTableModel = (DefaultTableModel) packageTable.getModel();

            selectedRow = packageTable.getSelectedRow();
            selectedPackageId = Integer.parseInt(packageTable.getValueAt(selectedRow, 0).toString());

            selectedPackage = PackageManagement.getPackageModel(String.valueOf(selectedPackageId));
            packageNameId = selectedPackage.getPackageNameId();

            packageNameCombo.setSelectedItem(PackageNameManagement.getPackageName(String.valueOf(packageNameId)));

            packageAmount.setText(String.valueOf(selectedPackage.getAmount()));
            
            paymentTypeCombo.setSelectedItem(selectedPackage.getPaymentType());

            selectedPackageStatus = selectedPackage.getPackageStatus();

            if (selectedPackageStatus == 1) {
                statePackage.setForeground(Color.red);
                statePackage.setText("Deactivate");
            } else {
                statePackage.setForeground(Color.green);
                statePackage.setText("Activate");
            }

            selectedPackage.setPackageId(selectedPackageId)
                    .setPackageNameId(packageNameId)
                    .setPaymentType(paymentTypeCombo.getSelectedItem().toString());

        }
    }//GEN-LAST:event_packageTableMouseClicked

    public void isUpdatedSetAlreadyRegistered() {

    }


    private void statePackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statePackageActionPerformed
        if (statePackage.getText().equals("Deactivate")) {
            statePackage.setText("Activate");
            statePackage.setForeground(Color.GREEN);

            PackageManagement.changeState(0, selectedPackage.getPackageId());
        } else {
            statePackage.setText("Deactivate");
            statePackage.setForeground(Color.RED);

            PackageManagement.changeState(1, selectedPackage.getPackageId());
        }
           refreshAll();
        loadPackgeTable();
    }//GEN-LAST:event_statePackageActionPerformed

    private static PackageName packageNameModel;
    private void packageNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageNameComboActionPerformed

    }//GEN-LAST:event_packageNameComboActionPerformed

    private static PaymentType paymentTypeModel;
    private void paymentTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentTypeComboActionPerformed

    }//GEN-LAST:event_paymentTypeComboActionPerformed

    private void accountRecoverHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountRecoverHitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountRecoverHitActionPerformed

    ResultSet rs_accountStaffName, rs_CurrentAvailableAccountSet;
    private void accountNicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accountNicFocusLost
        rs_accountStaffName = AccountManagement.getEmployee(accountNic.getText().trim());
        try {
            if (rs_accountStaffName.next()) {
                if (rs_accountStaffName.getInt("generaldetail.status") == 1) {
                    accountName.setText(rs_accountStaffName.getString("name"));
                    acountUsername.setEditable(true);
                    accountNicNote.setVisible(false);
                } else {
                    accountNicNote.setText("The staff member has been deactivated!");
                    accountNicNote.setVisible(true);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_accountNicFocusLost

    public void onLoadingAccountSetting() {
           accountRecoverHit.setText(null);
        accountRecoverAnswer.setText(null);
        accountContinueBtn.setVisible(false);
        accountPaswordConfirmNote.setVisible(false);
        accountNicNote.setVisible(false);
        accountPasswordNNote.setVisible(false);
        accountUsernameNote.setVisible(false);
         accountNic.setEnabled(true);

        accountNic.setText(null);
        accountName.setText(null);
        acountUsername.setText(null);
        accountPassword.setText(null);
        accountPaswordConfirm.setText(null);

     

        acountUsername.setEditable(false);
        accountPassword.setEditable(false);
        accountPaswordConfirm.setEditable(false);

        recoveryPanel.setEnabled(false);
        accountRecoverHit.setEnabled(false);
        accountRecoverAnswer.setEnabled(false);
        accountCreateBtn.setVisible(false);

        loadUserAccountTable();
    }

    char c;
    String currentNic;
    private void accountNicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountNicKeyTyped
        if (accountNic.getText().trim().equals("")) {
            accountName.setText(null);
            accountNicNote.setVisible(false);
            accountUsernameNote.setVisible(false);

            accountRecoverHit.setText(null);
            accountRecoverAnswer.setText(null);
            onLoadingAccountSetting();
        }

        c = evt.getKeyChar();
        currentNic = accountNic.getText().trim();

        if (!currentNic.equals("")) {

            if (currentNic.length() < 12) {

                if (currentNic.length() == 9) {
                    if (!((c >= '0') && (c <= '9')
                            || (c == KeyEvent.VK_BACK_SPACE)
                            || (c == KeyEvent.VK_V)
                            || (c == 'v')
                            || (c == KeyEvent.VK_DELETE))) {
                        evt.consume();
                    }
                } else if (!((c >= '0') && (c <= '9')
                        || (c == KeyEvent.VK_BACK_SPACE)
                        || (c == KeyEvent.VK_DELETE))) {
                    evt.consume();
                }

            } else {
                evt.consume();
            }
        }

    }//GEN-LAST:event_accountNicKeyTyped

    private static int staffId = 0;
    private void accountNicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountNicKeyReleased
        if (accountNic.getText().length() <= 12) {
            if (accountNic.getText().length() == 10 | accountNic.getText().length() == 12) {

                try {

                    rs_accountStaffName = AccountManagement.getEmployee(accountNic.getText().trim());
                    try {
                        if (rs_accountStaffName.next()) {

                            accountNicNote.setVisible(false);

                            rs_CurrentAvailableAccountSet = AccountManagement.getCurrentAccounts(accountNic.getText().trim());

                            if (rs_CurrentAvailableAccountSet.next()) {

                                accountName.setText(rs_CurrentAvailableAccountSet.getString("name"));
                                acountUsername.setText(rs_CurrentAvailableAccountSet.getString("username"));
                                accountPassword.setText(rs_CurrentAvailableAccountSet.getString("password"));
                                accountPaswordConfirm.setText(rs_CurrentAvailableAccountSet.getString("password"));
                                accountRecoverHit.setText(rs_CurrentAvailableAccountSet.getString("recoveryhint"));
                                accountRecoverAnswer.setText(rs_CurrentAvailableAccountSet.getString("recoveryanswer"));

                            } else {
//                                accountName.setText(rs_accountStaffName.getString("name"));

                                staffId = Integer.parseInt(rs_accountStaffName.getString("idStaff"));

                                accountNicNote.setVisible(false);
                                acountUsername.setEditable(true);
                            }

                        } else {
                            accountNicNote.setText("The staff member you have entered is currently unavailable or deactivated!");
                            accountNicNote.setVisible(true);
                            staffId = 0;
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_accountNicKeyReleased

    private static ResultSet rs_usernameSet;
    private static ArrayList usernameList = new ArrayList();
    private void acountUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acountUsernameKeyReleased
        rs_usernameSet = AccountManagement.getUsername(acountUsername.getText().trim());

        try {
            while (rs_usernameSet.next()) {
                usernameList.add(rs_usernameSet.getString("username"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        if (!usernameList.isEmpty()) {
            if (usernameList.contains(acountUsername.getText().trim())) {
                accountUsernameNote.setVisible(true);
                accountPassword.setEditable(false);
                accountPaswordConfirm.setEditable(false);
                accountContinueBtn.setVisible(false);
                accountPaswordConfirm.setText(null);
            } else {
                accountUsernameNote.setVisible(false);
            }
        }

        usernameList.clear();
    }//GEN-LAST:event_acountUsernameKeyReleased

    private void acountUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acountUsernameKeyTyped
        if (acountUsername.getText().length() == 8) {
            evt.consume();
        }
        if (acountUsername.getText().length() < 5 || acountUsername.getText().trim().equals("")) {
            accountPassword.setEditable(false);
            accountPaswordConfirm.setEditable(false);
            accountContinueBtn.setVisible(false);
            accountPaswordConfirm.setText(null);
        } else {
            accountPassword.setEditable(true);
            accountPaswordConfirm.setEditable(true);
        }
    }//GEN-LAST:event_acountUsernameKeyTyped

    private static boolean isValidPassword = false;
    private static int passwordLength = 0;
    private void accountPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accountPasswordFocusLost
        if (!String.valueOf(accountPassword.getPassword()).equals("")) {

            char[] c = String.valueOf(accountPassword.getPassword()).toCharArray();

            for (char cDig : c) {
                if (Character.isDigit(cDig)) {

                    for (char cUp : c) {
                        if (Character.isUpperCase(cUp)) {

                            for (char cLow : c) {
                                if (Character.isLowerCase(cLow)) {
                                    isValidPassword = true;
                                    passwordLength = String.valueOf(accountPassword.getPassword()).length();

                                    accountPassword.setEditable(true);
                                    accountPaswordConfirm.setEditable(true);
                                }
                            }
                        }
                    }

                }
            }

            if (isValidPassword) {
                accountPaswordConfirm.grabFocus();
                isValidPassword = false;
            } else {
                JOptionPane.showMessageDialog(this, "Password should contain atleast one UPPERCASE LETTER & one lowercase letter & 1 number!", "Warnign!", JOptionPane.WARNING_MESSAGE);
                accountPassword.grabFocus();
                accountPassword.selectAll();
                accountPasswordNNote.setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Password field cannot be empty!", "Warnign!", JOptionPane.WARNING_MESSAGE);
            accountPasswordNNote.setVisible(true);
        }
    }//GEN-LAST:event_accountPasswordFocusLost

    private void accountPaswordConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountPaswordConfirmKeyReleased
        String passwordConfirm = String.valueOf(accountPaswordConfirm.getPassword());
        if (passwordConfirm.length() == passwordLength) {
            evt.consume();
            if (String.valueOf(accountPassword.getPassword()).equals(passwordConfirm)) {
                accountContinueBtn.setVisible(true);
            } else {
                accountPaswordConfirmNote.setVisible(true);
                accountPaswordConfirm.grabFocus();
                accountPaswordConfirm.selectAll();
            }
        }
    }//GEN-LAST:event_accountPaswordConfirmKeyReleased

    private void accountPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountPasswordKeyTyped
        if (accountPassword.getPassword().length == 8) {
            evt.consume();
        }

        if (accountPassword.getPassword().length == 0) {
            accountPasswordNNote.setVisible(false);
            accountContinueBtn.setVisible(false);
        }
    }//GEN-LAST:event_accountPasswordKeyTyped

    private void accountPaswordConfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountPaswordConfirmKeyTyped
        if (accountPaswordConfirm.getPassword().length == 0) {
            accountPaswordConfirmNote.setVisible(false);
            accountContinueBtn.setVisible(false);
        }
    }//GEN-LAST:event_accountPaswordConfirmKeyTyped

    private void acountUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_acountUsernameFocusLost
        if (acountUsername.getText().length() < 5) {

            JOptionPane.showMessageDialog(this, "Username should contain atleat 5 characters!", "Warnign!", JOptionPane.WARNING_MESSAGE);

            acountUsername.grabFocus();
            acountUsername.selectAll();

            accountPassword.setEditable(false);
            accountPaswordConfirm.setEditable(false);
        }
    }//GEN-LAST:event_acountUsernameFocusLost

    private void accountContinueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountContinueBtnActionPerformed
        recoveryPanel.setEnabled(true);
        accountRecoverHit.setEnabled(true);
        accountRecoverAnswer.setEnabled(true);
        accountRecoverHit.grabFocus();
    }//GEN-LAST:event_accountContinueBtnActionPerformed

    private void acountUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_acountUsernameFocusGained
        if (accountNic.getText().trim().equals("")) {
            accountNic.grabFocus();
            onLoadingAccountSetting();
        }
    }//GEN-LAST:event_acountUsernameFocusGained

    private void accountRecoverHitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountRecoverHitKeyTyped
        if (accountRecoverHit.getText().trim().equals("")) {
            accountRecoverAnswer.setText(null);
            accountCreateBtn.setVisible(false);
        }
    }//GEN-LAST:event_accountRecoverHitKeyTyped

    private static UserAccount userAccountModel;
    private void accountCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountCreateBtnActionPerformed
        try {
            userAccountModel = new UserAccount();
            userAccountModel.setUserId(staffId)
                    .setUsername(acountUsername.getText().trim())
                    .setPassword(Encription.Encript.encript(String.valueOf(accountPassword.getPassword())))
                    .setRecoverHint(accountRecoverHit.getText().trim())
                    .setRecoverAnswer(accountRecoverAnswer.getText().trim());

            if (AccountManagement.saveUserAccount(userAccountModel)) {
                JOptionPane.showMessageDialog(this, "Successfully created an account!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
                onLoadingAccountSetting();
                loadUserAccountTable();
            } else {
                JOptionPane.showMessageDialog(this, "Something went wrong!", "Warning!", JOptionPane.WARNING_MESSAGE);
                accountNic.grabFocus();
            }
        } catch (Exception ex) {
            Logger.getLogger(adminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_accountCreateBtnActionPerformed

    private void accountRecoverAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountRecoverAnswerKeyReleased

    }//GEN-LAST:event_accountRecoverAnswerKeyReleased

    private void accountRecoverAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountRecoverAnswerKeyTyped
        if (String.valueOf(accountRecoverAnswer.getPassword()).trim().equals("")) {
            accountCreateBtn.setVisible(false);
        } else {
            accountCreateBtn.setVisible(true);
        }
    }//GEN-LAST:event_accountRecoverAnswerKeyTyped

    private static UserAccount selectedUserAccountModel;
    private static ResultSet rs_selectedAccount;
    private static String accountPasswordText, accountStatus;
    private void accountTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountTableMouseClicked
        if (evt.getClickCount() == 2) {
            System.out.println("Clicked" + accountTable.getValueAt(accountTable.getSelectedRow(), 0).toString());
            rs_selectedAccount = AccountManagement.getSelectedAccount(accountTable.getValueAt(accountTable.getSelectedRow(), 0).toString());
            selectedUserAccountModel = new UserAccount();
            try {
                if (rs_selectedAccount.next()) {
                    accountPasswordText = Encription.Encript.decript(rs_selectedAccount.getString("password").toString());
                    selectedUserAccountModel.setUserAccountID(Integer.parseInt(rs_selectedAccount.getString("iduseraccount")));
                    accountNic.setText(rs_selectedAccount.getString("nic"));
                    accountName.setText(rs_selectedAccount.getString("name"));
                    acountUsername.setText(rs_selectedAccount.getString("username"));
                    accountPassword.setText(accountPasswordText);
                    accountPaswordConfirm.setText(accountPasswordText);
                    accountRecoverHit.setText(rs_selectedAccount.getString("recoveryhint"));
                    accountRecoverAnswer.setText(rs_selectedAccount.getString("recoveryanswer"));

                    accountStatus = rs_selectedAccount.getString("accountstatus");

                    if (accountStatus.equals("0")) {
                        accountStatusBtn.setText("Activate");
                        accountStatusBtn.setForeground(Color.green);
                    } else {
                        accountStatusBtn.setText("Deactivate");
                        accountStatusBtn.setForeground(Color.red);
                    }

                    accountCreateBtn.setVisible(false);
                    setUneditableAll();
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_accountTableMouseClicked

    private void setUneditableAll() {
        accountNic.setEditable(false);
        acountUsername.setEditable(false);
        accountPassword.setEditable(false);
        accountPaswordConfirm.setEditable(false);
        accountContinueBtn.setVisible(false);

        accountRecoverHit.setEnabled(false);
        accountRecoverAnswer.setEnabled(false);
        accountCreateBtn.setVisible(false);
    }

    private void accountStatusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountStatusBtnActionPerformed
        System.out.println(accountStatusBtn.getText());
        if (accountStatusBtn.getText().equals("Activate")) {
            accountStatusBtn.setText("Deactivate");
            accountStatusBtn.setForeground(Color.red);
            if (AccountManagement.changeStatus("1", selectedUserAccountModel.getUserAccountID())) {
                JOptionPane.showMessageDialog(this, "You have successffully activated the User Account !", "Activated!", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            System.out.println("Deactivate clicked" + selectedUserAccountModel.getUserAccountID());
            accountStatusBtn.setText("Activate");
            accountStatusBtn.setForeground(Color.green);
            if (AccountManagement.changeStatus("0", selectedUserAccountModel.getUserAccountID())) {
                JOptionPane.showMessageDialog(this, "You have successffully deactivated the User Account !", "Deactivated!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        onLoadingAccountSetting();
        accountNic.setEditable(true);
    }//GEN-LAST:event_accountStatusBtnActionPerformed

    private void packageNameComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_packageNameComboPropertyChange
        if (!packageNameCombo.getSelectedItem().toString().equals("Select Category")) {
            packageNameModel = PackageNameManagement.getPackageNameModel(packageNameCombo.getSelectedItem().toString());
            packageNameId = packageNameModel.getIdPackageName();
        }
    }//GEN-LAST:event_packageNameComboPropertyChange

    private void paymentTypeComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_paymentTypeComboPropertyChange

    }//GEN-LAST:event_paymentTypeComboPropertyChange


    private void supBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supBrandActionPerformed

    private void supBrandPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_supBrandPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_supBrandPropertyChange

    private void newBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBrandActionPerformed
        NewBrandName newBrd = NewBrandName.getInstance();
        newBrd.setVisible(true);
    }//GEN-LAST:event_newBrandActionPerformed

    private void supTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supTypeActionPerformed

    private void supTypePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_supTypePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_supTypePropertyChange

    private void newTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTypeActionPerformed
        NewType newType = NewType.getInstance();
        newType.setVisible(true);
    }//GEN-LAST:event_newTypeActionPerformed

    private void updateSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSupActionPerformed
        try {
            rs_selectedBrand = BrandNameManagement.getSelectedBrand(supBrand.getSelectedItem().toString());
            rs_selectedType = TypeManagement.getSelectedType(supType.getSelectedItem().toString());

            if (rs_selectedBrand.next()) {
                selectedBrandId = Integer.parseInt(rs_selectedBrand.getString("idbrand"));
                System.out.println(selectedBrandId);
            }
            if (rs_selectedType.next()) {
                selectedTypeId = Integer.parseInt(rs_selectedType.getString("idtype"));
                System.out.println(selectedTypeId);
            }

            if (!supName.getText().trim().equals("")) {
                supModel.setSupplimentName(supName.getText().trim()).setIdBrand(selectedBrandId).setIdType(selectedTypeId);

                if (SupplimentManagement.updateSuppliment(supModel)) {
                    JOptionPane.showMessageDialog(this, "Succesfully updated suppliment!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
//                    refreshSup();
                } else {
                    JOptionPane.showMessageDialog(this, "Suppliment name cannot be empty!", "Failed!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Suppliment name cannot be empty!", "Failed!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_updateSupActionPerformed

    ResultSet rs_selectedSuppliment;

    private void supTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supTableMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                rs_selectedSuppliment = SupplimentManagement.getSelectedSuppliment((String) supTable.getValueAt(supTable.getSelectedRow(), 0));

                if (rs_selectedSuppliment.next()) {
                    supBrand.setSelectedItem(rs_selectedSuppliment.getString("brand"));
                    supType.setSelectedItem(rs_selectedSuppliment.getString("type"));
                    supName.setText(rs_selectedSuppliment.getString("supplimentName"));

                    saveSup.setEnabled(false);
                    updateSup.setEnabled(true);

                    supModel = new SupplimentModel();
                    supModel.setIdSuppliment(Integer.parseInt(rs_selectedSuppliment.getString("idsuppliment")));
                }
            } catch (SQLException ex) {
                Logger.getLogger(adminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_supTableMouseClicked

    ResultSet rs_selectedBrand, rs_selectedType;
    int selectedBrandId = 0;
    int selectedTypeId = 0;
    SupplimentModel supModel;
    private void saveSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSupActionPerformed
        try {
            rs_selectedBrand = BrandNameManagement.getSelectedBrand(supBrand.getSelectedItem().toString());
            rs_selectedType = TypeManagement.getSelectedType(supType.getSelectedItem().toString());

            if (rs_selectedBrand.next()) {
                selectedBrandId = Integer.parseInt(rs_selectedBrand.getString("idbrand"));
                System.out.println(selectedBrandId);
            }
            if (rs_selectedType.next()) {
                selectedTypeId = Integer.parseInt(rs_selectedType.getString("idtype"));
                System.out.println(selectedTypeId);
            }

            if (!supName.getText().trim().equals("")) {
                supModel = new SupplimentModel();
                supModel.setSupplimentName(supName.getText().trim()).setIdBrand(selectedBrandId).setIdType(selectedTypeId);

                if (SupplimentManagement.saveSuppliment(supModel)) {
                    JOptionPane.showMessageDialog(this, "Succesfully added to suppliment!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
//                    refreshSup();
                } else {
                    JOptionPane.showMessageDialog(this, "Suppliment name cannot be empty!", "Failed!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Suppliment name cannot be empty!", "Failed!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_saveSupActionPerformed

    private void supBrandItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_supBrandItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_supBrandItemStateChanged

    private void refreshSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshSupActionPerformed
//        refreshSup();
    }//GEN-LAST:event_refreshSupActionPerformed

    private void accountCreateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountCreateBtn1ActionPerformed
        accountNic.setText(null);
        accountNic.setEnabled(true);
        accountName.setText(null);
        acountUsername.setText(null);
        accountPassword.setText(null);
        accountPaswordConfirm.setText(null);
        accountRecoverHit.setText(null);
        accountRecoverAnswer.setText(null);
    }//GEN-LAST:event_accountCreateBtn1ActionPerformed

    private void savePackage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePackage1ActionPerformed
          refreshAll();
        loadPackgeTable();
    }//GEN-LAST:event_savePackage1ActionPerformed

    private static ResultSet rs_allUserAccount;

    public void loadUserAccountTable() {
        DefaultTableModel dtm_userAccount = (DefaultTableModel) accountTable.getModel();

        rs_allUserAccount = AccountManagement.getAllAccount();
        dtm_userAccount.setRowCount(0);
        try {
            while (rs_allUserAccount.next()) {
                Vector v = new Vector();
                v.add(rs_allUserAccount.getString("nic"));
                v.add(rs_allUserAccount.getString("name"));
                v.add(rs_allUserAccount.getString("username"));

                dtm_userAccount.addRow(v);
            }
            accountTable.setDefaultRenderer(Object.class, new AccountTableCellRender());
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccountCreatePanel;
    private javax.swing.JButton accountContinueBtn;
    private javax.swing.JButton accountCreateBtn;
    private javax.swing.JButton accountCreateBtn1;
    private com.alee.laf.text.WebTextField accountName;
    private com.alee.laf.text.WebTextField accountNic;
    private javax.swing.JLabel accountNicNote;
    private com.alee.laf.text.WebPasswordField accountPassword;
    private javax.swing.JLabel accountPasswordNNote;
    private com.alee.laf.text.WebPasswordField accountPaswordConfirm;
    private javax.swing.JLabel accountPaswordConfirmNote;
    private com.alee.laf.text.WebPasswordField accountRecoverAnswer;
    private com.alee.laf.text.WebTextField accountRecoverHit;
    private javax.swing.JButton accountSettingBtn;
    private javax.swing.JButton accountStatusBtn;
    private javax.swing.JTable accountTable;
    private javax.swing.JLabel accountUsernameNote;
    private com.alee.laf.text.WebTextField acountUsername;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton gotoPackageName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton newBrand;
    private javax.swing.JButton newType;
    private javax.swing.JTextField packageAmount;
    private javax.swing.JComboBox<String> packageNameCombo;
    private javax.swing.JPanel packagePanel;
    private javax.swing.JButton packageSettingBtn;
    private javax.swing.JPanel packageSettingPanel;
    private javax.swing.JPanel packageSettingPanel1;
    private javax.swing.JTable packageTable;
    private javax.swing.JComboBox<String> paymentTypeCombo;
    private javax.swing.JPanel recoveryPanel;
    private javax.swing.JButton refreshSup;
    private javax.swing.JButton savePackage;
    private javax.swing.JButton savePackage1;
    private javax.swing.JButton saveSup;
    private javax.swing.JButton statePackage;
    private javax.swing.JComboBox<String> supBrand;
    private javax.swing.JTextField supName;
    private javax.swing.JTable supTable;
    private javax.swing.JComboBox<String> supType;
    private javax.swing.JPanel supplimentPanel;
    private javax.swing.JButton updatePackage;
    private javax.swing.JButton updateSup;
    // End of variables declaration//GEN-END:variables

    ResultSet packageNameSet;

    public void loadPackageName() {
        try {
            packageNameCombo.removeAllItems();
            packageNameCombo.addItem("Select Category");
            packageNameSet = PackageNameManagement.getAllPackageNames();

            while (packageNameSet.next()) {
                packageNameCombo.addItem(packageNameSet.getString("packagename"));

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    DefaultTableModel packageTableModel;
    ResultSet rs_packageTableSet;

    public void loadPackgeTable() {
        try {
            packageTableModel = (DefaultTableModel) packageTable.getModel();
            packageTableModel.setRowCount(0);

            rs_packageTableSet = PackageManagement.getAllDetailedSet();

            while (rs_packageTableSet.next()) {
                Vector v = new Vector();
                v.add(rs_packageTableSet.getString("idpackage"));
                v.add(rs_packageTableSet.getString("packagename"));
                v.add(rs_packageTableSet.getString("packagetype"));
                v.add(rs_packageTableSet.getString("fee"));

                packageTableModel.addRow(v);
            }

            packageTable.setDefaultRenderer(Object.class, new PackegeTableCellRender());
        } catch (SQLException ex) {
            Logger.getLogger(adminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void loadOnCreate() {
        packageSettingBtn.setBackground(Colors.defaultWhite);
        packageSettingBtn.setForeground(Colors.defaultBlue);

    }

    public void unselectButton() {
        packageSettingBtn.setBackground(Colors.defaultBlue);
        packageSettingBtn.setForeground(Colors.defaultWhite);
        accountSettingBtn.setBackground(Colors.defaultBlue);
        accountSettingBtn.setForeground(Colors.defaultWhite);
//        supplimentSettingBtn.setBackground(Colors.defaultBlue);
//        supplimentSettingBtn.setForeground(Colors.defaultWhite);
    }

    double oldFee, newFee;

    public boolean isPackageFeeUpdated() {
        return oldFee != newFee;
    }

    private static boolean isAllCorrect = false;

    public boolean isEveryDetailSubmitted() {
        if (packageNameId != 0 && !paymentTypeCombo.getSelectedItem().toString().equals("Select Payment Type") && !packageAmount.getText().isEmpty()) {
            isAllCorrect = true;
        }
        return isAllCorrect;
    }

    private static ResultSet rs_allPackages;
    private static ArrayList all_Packages = new ArrayList();

    public boolean isAlreadyRegisteredPackage(String all_DetailPackages) {
        try {
            rs_allPackages = PackageManagement.getAllDetailedSet();

            while (rs_allPackages.next()) {
                all_Packages.add(rs_allPackages.getString("packagename") + " " + rs_allPackages.getString("paymenttype") + " " + rs_allPackages.getString("packagetype"));
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return !all_Packages.contains(all_DetailPackages);
    }

    public void refreshAll() {
        packageNameCombo.setSelectedIndex(0);
        paymentTypeCombo.setSelectedIndex(0);

        savePackage.setEnabled(true);
        updatePackage.setEnabled(false);
        statePackage.setEnabled(false);

        packageAmount.setText(null);

        packageNameId = 0;
        isAllCorrect = false;

        loadPackgeTable();

    }

}

class PackegeTableCellRender extends DefaultTableCellRenderer {

    public PackegeTableCellRender() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        c.setFont(new java.awt.Font("Tahoma", 0, 16));
        try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();

            if (PackageManagement.isPackageActive((String) dtm.getValueAt(row, 0))) {
                setBackground(Color.white);
                setForeground(Color.black);
            } else {
                setBackground(Color.decode("#FB7F79"));
                setForeground(Color.black);
            }

            setText(value != null ? value.toString() : "");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }
}

class AccountTableCellRender extends DefaultTableCellRenderer {

    public AccountTableCellRender() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        c.setFont(new java.awt.Font("Tahoma", 0, 16));
        try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();

            if (AccountManagement.isAccountActive((String) dtm.getValueAt(row, 2))) {
                setBackground(Color.white);
                setForeground(Color.black);
            } else {
                setBackground(Color.decode("#FB7F79"));
                setForeground(Color.black);
            }

            setText(value != null ? value.toString() : "");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }
}
