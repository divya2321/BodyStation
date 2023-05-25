package GUI;

import Classes.Colors;
import Database.Beans.Address;
import Database.Beans.GeneralDetail;
import Database.Beans.JobRole;
import Database.Beans.MemberModel;
import Database.Beans.PackageName;
import Database.Beans.Staff;
import Database.Beans.Supplier;
import Database.DB;
import Database.Tables.AddressManagement;
import Database.Tables.GeneralDetailManagement;
import Database.Tables.JobRoleMaagement;
import Database.Tables.MemberManagement;
import Database.Tables.PackageNameManagement;
import Database.Tables.StaffManagement;
import Database.Tables.SupplierManagement;
import PopUpInterface.NewPackageName;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistrationPanel extends javax.swing.JPanel {

    private RegistrationPanel() {
        initComponents();
        setBackgroundColor();

        memberbtn.setSelected(true);
        memberbtn.setBackground(Colors.defaultWhite);
        memberbtn.setForeground(Colors.defaultBlue);

        //staff @ loading
        loadInStaff();
        //member @ loading
        loadInMember();

        refreshSupplier();

    }

    private static RegistrationPanel instance;

    public static RegistrationPanel getInstance() {
        if (instance == null) {
            instance = new RegistrationPanel();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ViewWorkoutPlan = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jButton9 = new javax.swing.JButton();
        ViewPackage = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        titleBar = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        staffbtn = new javax.swing.JToggleButton();
        supplierbtn = new javax.swing.JToggleButton();
        memberbtn = new javax.swing.JToggleButton();
        parentPanel = new javax.swing.JPanel();
        memberRegistration = new javax.swing.JPanel();
        female = new javax.swing.JCheckBox();
        male = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        middleName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nic = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        memberNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        contact1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contact2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        street1 = new javax.swing.JTextField();
        street2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        packageCombo = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        updateMember = new javax.swing.JButton();
        saveMember = new javax.swing.JButton();
        refreshForm = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        dob = new com.alee.laf.text.WebFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        activate = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        staffRegistration = new javax.swing.JPanel();
        staffFemale = new javax.swing.JCheckBox();
        staffMale = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        staffLname = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        staffMname = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        staffFname = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        staffNic = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        staffNo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        staffContact1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        staffContact2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        staffAddrNo = new javax.swing.JTextField();
        staffAddrStr1 = new javax.swing.JTextField();
        staffAddrStr2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        staffAddrCity = new javax.swing.JTextField();
        updateStaff = new javax.swing.JButton();
        saveStaff = new javax.swing.JButton();
        staffRefresh = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        staffDob = new com.alee.laf.text.WebFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        staffActivate = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        staffFee = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffDesc = new javax.swing.JTextArea();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        staffJobRole = new javax.swing.JComboBox<>();
        supplierRegistration = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        supplierNo = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        supplierFname = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        supplierLname = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        supplierct1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        supplierct2 = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        supplierDes = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        saveSupplier = new javax.swing.JButton();
        updateSupplier = new javax.swing.JButton();
        loadSupplier = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        supplierTable = new javax.swing.JTable();

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Workout plans");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Workout Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable2);

        jPanel6.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 310, 340));

        jList4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane8.setViewportView(jList4);

        jPanel6.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 310, 340));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Select");
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 450, 90, 30));

        ViewWorkoutPlan.getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Packages");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 50));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ", "Package", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 820, 240));

        ViewPackage.getContentPane().add(jPanel8, java.awt.BorderLayout.CENTER);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1206, 708));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar.setBackground(new java.awt.Color(29, 124, 167));
        titleBar.setFocusable(false);
        titleBar.setPreferredSize(new java.awt.Dimension(1206, 740));
        titleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel.setText(".... Registration");
        titleBar.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 230, 40));

        staffbtn.setBackground(new java.awt.Color(29, 124, 167));
        buttonGroup1.add(staffbtn);
        staffbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffbtn.setForeground(new java.awt.Color(255, 255, 255));
        staffbtn.setText("Staff");
        staffbtn.setBorderPainted(false);
        staffbtn.setContentAreaFilled(false);
        staffbtn.setFocusPainted(false);
        staffbtn.setOpaque(true);
        staffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffbtnActionPerformed(evt);
            }
        });
        titleBar.add(staffbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 40));

        supplierbtn.setBackground(new java.awt.Color(29, 124, 167));
        buttonGroup1.add(supplierbtn);
        supplierbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        supplierbtn.setForeground(new java.awt.Color(255, 255, 255));
        supplierbtn.setText("Supplier");
        supplierbtn.setBorderPainted(false);
        supplierbtn.setContentAreaFilled(false);
        supplierbtn.setFocusPainted(false);
        supplierbtn.setOpaque(true);
        supplierbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierbtnActionPerformed(evt);
            }
        });
        titleBar.add(supplierbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 130, 40));

        memberbtn.setBackground(new java.awt.Color(29, 124, 167));
        buttonGroup1.add(memberbtn);
        memberbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        memberbtn.setForeground(new java.awt.Color(255, 255, 255));
        memberbtn.setText("Member");
        memberbtn.setBorderPainted(false);
        memberbtn.setContentAreaFilled(false);
        memberbtn.setFocusPainted(false);
        memberbtn.setOpaque(true);
        memberbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberbtnActionPerformed(evt);
            }
        });
        titleBar.add(memberbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1206, 40));

        parentPanel.setBackground(new java.awt.Color(255, 255, 255));
        parentPanel.setLayout(new java.awt.CardLayout());

        memberRegistration.setBackground(new java.awt.Color(255, 255, 255));
        memberRegistration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup2.add(female);
        female.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        female.setText("Female");
        female.setContentAreaFilled(false);
        memberRegistration.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, -1, 30));

        buttonGroup2.add(male);
        male.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        male.setText("Male");
        male.setContentAreaFilled(false);
        memberRegistration.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Gender");
        memberRegistration.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Date of Birth");
        memberRegistration.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 110, 30));

        lastName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lastName.setBorder(null);
        lastName.setOpaque(false);
        lastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameFocusLost(evt);
            }
        });
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        lastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameKeyTyped(evt);
            }
        });
        memberRegistration.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 320, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Last Name *");
        memberRegistration.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 110, 30));

        middleName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        middleName.setBorder(null);
        middleName.setOpaque(false);
        middleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleNameActionPerformed(evt);
            }
        });
        middleName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                middleNameKeyTyped(evt);
            }
        });
        memberRegistration.add(middleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 320, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Middle Name");
        memberRegistration.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 30));

        firstName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        firstName.setBorder(null);
        firstName.setOpaque(false);
        firstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameFocusLost(evt);
            }
        });
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        firstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameKeyTyped(evt);
            }
        });
        memberRegistration.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("First Name *");
        memberRegistration.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, 30));

        nic.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nic.setBorder(null);
        nic.setOpaque(false);
        nic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nicFocusLost(evt);
            }
        });
        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });
        nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicKeyTyped(evt);
            }
        });
        memberRegistration.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 320, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("NIC *");
        memberRegistration.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 110, 30));

        memberNo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        memberNo.setBorder(null);
        memberNo.setEnabled(false);
        memberNo.setOpaque(false);
        memberRegistration.add(memberNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 320, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("Member No");
        memberRegistration.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 30));

        contact1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        contact1.setBorder(null);
        contact1.setOpaque(false);
        contact1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contact1FocusLost(evt);
            }
        });
        contact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact1ActionPerformed(evt);
            }
        });
        contact1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contact1KeyTyped(evt);
            }
        });
        memberRegistration.add(contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 320, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Contact No1 *");
        memberRegistration.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 130, 30));

        contact2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        contact2.setBorder(null);
        contact2.setOpaque(false);
        contact2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contact2FocusGained(evt);
            }
        });
        contact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact2ActionPerformed(evt);
            }
        });
        contact2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contact2KeyTyped(evt);
            }
        });
        memberRegistration.add(contact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 320, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Contat No2");
        memberRegistration.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 130, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("No *");
        memberRegistration.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 90, 30));

        no.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        no.setBorder(null);
        no.setOpaque(false);
        no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                noFocusLost(evt);
            }
        });
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        memberRegistration.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 320, 30));

        street1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        street1.setBorder(null);
        street1.setOpaque(false);
        street1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                street1FocusLost(evt);
            }
        });
        street1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                street1ActionPerformed(evt);
            }
        });
        memberRegistration.add(street1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 320, 30));

        street2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        street2.setBorder(null);
        street2.setOpaque(false);
        street2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                street2ActionPerformed(evt);
            }
        });
        memberRegistration.add(street2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 320, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Street 2");
        memberRegistration.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 90, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("City *");
        memberRegistration.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 90, 30));

        city.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        city.setBorder(null);
        city.setOpaque(false);
        city.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityFocusLost(evt);
            }
        });
        memberRegistration.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 320, 30));

        packageCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        packageCombo.setBorder(null);
        packageCombo.setFocusable(false);
        packageCombo.setOpaque(false);
        packageCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                packageComboMouseClicked(evt);
            }
        });
        packageCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageComboActionPerformed(evt);
            }
        });
        packageCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                packageComboPropertyChange(evt);
            }
        });
        memberRegistration.add(packageCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 310, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Package *");
        memberRegistration.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 110, 30));

        updateMember.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updateMember.setText("Update Details");
        updateMember.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateMember.setFocusPainted(false);
        updateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMemberActionPerformed(evt);
            }
        });
        memberRegistration.add(updateMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, 220, 60));

        saveMember.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        saveMember.setText("Save Member");
        saveMember.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveMember.setFocusPainted(false);
        saveMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMemberActionPerformed(evt);
            }
        });
        memberRegistration.add(saveMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, 220, 60));

        refreshForm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        refreshForm.setText("Refresh");
        refreshForm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshForm.setFocusPainted(false);
        refreshForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshFormActionPerformed(evt);
            }
        });
        memberRegistration.add(refreshForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, 220, 60));
        memberRegistration.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 330, 10));
        memberRegistration.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 330, 10));
        memberRegistration.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 330, 10));
        memberRegistration.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 330, 10));
        memberRegistration.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 330, 10));
        memberRegistration.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 330, 10));
        memberRegistration.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 330, 10));
        memberRegistration.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 330, 10));
        memberRegistration.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 330, 10));
        memberRegistration.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 330, 10));
        memberRegistration.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 330, 10));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dob.setToolTipText("");
        dob.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dob.setHideInputPromptOnFocus(false);
        dob.setInputPrompt("dd/MM/YYYY");
        dob.setOpaque(true);
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 190, 30));

        memberRegistration.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 620));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setOpaque(false);
        memberRegistration.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 390, 620));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Code");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));

        code.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        code.setBorder(null);
        code.setOpaque(false);
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        jPanel3.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 30));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 320, 10));

        activate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        activate.setSelected(true);
        activate.setText("Activate");
        activate.setContentAreaFilled(false);
        activate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(activate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 120, -1));

        memberRegistration.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 370, 270));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Street 1 *");
        memberRegistration.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 90, 40));

        parentPanel.add(memberRegistration, "card2");

        staffRegistration.setBackground(new java.awt.Color(255, 255, 255));
        staffRegistration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup4.add(staffFemale);
        staffFemale.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffFemale.setText("Female");
        staffFemale.setContentAreaFilled(false);
        staffRegistration.add(staffFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, -1, 30));

        buttonGroup4.add(staffMale);
        staffMale.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffMale.setText("Male");
        staffMale.setContentAreaFilled(false);
        staffRegistration.add(staffMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 600, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Gender");
        staffRegistration.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 110, 30));

        staffLname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffLname.setBorder(null);
        staffLname.setOpaque(false);
        staffLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                staffLnameFocusLost(evt);
            }
        });
        staffLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffLnameActionPerformed(evt);
            }
        });
        staffLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffLnameKeyTyped(evt);
            }
        });
        staffRegistration.add(staffLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 320, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setText("Last Name *");
        staffRegistration.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 110, 30));

        staffMname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffMname.setBorder(null);
        staffMname.setOpaque(false);
        staffMname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffMnameActionPerformed(evt);
            }
        });
        staffMname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffMnameKeyTyped(evt);
            }
        });
        staffRegistration.add(staffMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 320, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setText("Middle Name");
        staffRegistration.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 30));

        staffFname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffFname.setBorder(null);
        staffFname.setOpaque(false);
        staffFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                staffFnameFocusLost(evt);
            }
        });
        staffFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffFnameActionPerformed(evt);
            }
        });
        staffFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffFnameKeyTyped(evt);
            }
        });
        staffRegistration.add(staffFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setText("First Name *");
        staffRegistration.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 110, 30));

        staffNic.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffNic.setBorder(null);
        staffNic.setOpaque(false);
        staffNic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                staffNicFocusLost(evt);
            }
        });
        staffNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffNicActionPerformed(evt);
            }
        });
        staffNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                staffNicKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffNicKeyTyped(evt);
            }
        });
        staffRegistration.add(staffNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 320, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setText("NIC *");
        staffRegistration.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 110, 30));

        staffNo.setEditable(false);
        staffNo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffNo.setBorder(null);
        staffNo.setOpaque(false);
        staffRegistration.add(staffNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 320, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setText("Staff No");
        staffRegistration.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 30));

        staffContact1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffContact1.setBorder(null);
        staffContact1.setOpaque(false);
        staffContact1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                staffContact1FocusLost(evt);
            }
        });
        staffContact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffContact1ActionPerformed(evt);
            }
        });
        staffContact1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffContact1KeyTyped(evt);
            }
        });
        staffRegistration.add(staffContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 320, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel26.setText("Contact No1 *");
        staffRegistration.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 120, 30));

        staffContact2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffContact2.setBorder(null);
        staffContact2.setOpaque(false);
        staffContact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffContact2ActionPerformed(evt);
            }
        });
        staffContact2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                staffContact2KeyTyped(evt);
            }
        });
        staffRegistration.add(staffContact2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 320, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setText("Contat No2");
        staffRegistration.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 120, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setText("No *");
        staffRegistration.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 90, 30));

        staffAddrNo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffAddrNo.setBorder(null);
        staffAddrNo.setOpaque(false);
        staffAddrNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                staffAddrNoFocusLost(evt);
            }
        });
        staffAddrNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffAddrNoActionPerformed(evt);
            }
        });
        staffRegistration.add(staffAddrNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 320, 30));

        staffAddrStr1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffAddrStr1.setBorder(null);
        staffAddrStr1.setOpaque(false);
        staffAddrStr1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                staffAddrStr1FocusLost(evt);
            }
        });
        staffAddrStr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffAddrStr1ActionPerformed(evt);
            }
        });
        staffRegistration.add(staffAddrStr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 320, 30));

        staffAddrStr2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffAddrStr2.setBorder(null);
        staffAddrStr2.setOpaque(false);
        staffAddrStr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffAddrStr2ActionPerformed(evt);
            }
        });
        staffRegistration.add(staffAddrStr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 320, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel30.setText("Street 2");
        staffRegistration.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 90, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel31.setText("City *");
        staffRegistration.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 90, 30));

        staffAddrCity.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffAddrCity.setBorder(null);
        staffAddrCity.setOpaque(false);
        staffAddrCity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                staffAddrCityFocusLost(evt);
            }
        });
        staffRegistration.add(staffAddrCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 320, 30));

        updateStaff.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        updateStaff.setText("Edit Details");
        updateStaff.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateStaff.setFocusPainted(false);
        updateStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStaffActionPerformed(evt);
            }
        });
        staffRegistration.add(updateStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 220, 50));

        saveStaff.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        saveStaff.setText("Save Staff");
        saveStaff.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveStaff.setFocusPainted(false);
        saveStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveStaffActionPerformed(evt);
            }
        });
        staffRegistration.add(saveStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 220, 50));

        staffRefresh.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        staffRefresh.setText("Refresh");
        staffRefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        staffRefresh.setFocusPainted(false);
        staffRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRefreshActionPerformed(evt);
            }
        });
        staffRegistration.add(staffRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 540, 220, 50));
        staffRegistration.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 330, 10));
        staffRegistration.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 330, 10));
        staffRegistration.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 330, 10));
        staffRegistration.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 330, 10));
        staffRegistration.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 330, 10));
        staffRegistration.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 330, 10));
        staffRegistration.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 330, 10));
        staffRegistration.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 330, 10));
        staffRegistration.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 330, 10));
        staffRegistration.add(jSeparator27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 330, 10));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        staffDob.setToolTipText("");
        staffDob.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffDob.setHideInputPromptOnFocus(false);
        staffDob.setInputPrompt("dd/MM/YYYY");
        staffDob.setOpaque(true);
        jPanel4.add(staffDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 190, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setText("Date of Birth");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 110, 30));

        staffRegistration.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 620));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 330, 10));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel29.setText("Street 1 *");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, 30));

        staffRegistration.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 390, 620));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        staffActivate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffActivate.setText("Activate");
        staffActivate.setContentAreaFilled(false);
        staffActivate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staffActivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActivateActionPerformed(evt);
            }
        });
        jPanel7.add(staffActivate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 100, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel38.setText("Payment");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 90, 30));

        staffFee.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffFee.setBorder(null);
        staffFee.setOpaque(false);
        jPanel7.add(staffFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 220, 30));
        jPanel7.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 240, 10));

        staffDesc.setColumns(20);
        staffDesc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffDesc.setRows(5);
        jScrollPane1.setViewportView(staffDesc);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, 180));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel36.setText("Job Role");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 30));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel37.setText("Discription");
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 30));

        staffJobRole.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffJobRole.setOpaque(false);
        staffJobRole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffJobRoleMouseClicked(evt);
            }
        });
        staffJobRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffJobRoleActionPerformed(evt);
            }
        });
        staffJobRole.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                staffJobRolePropertyChange(evt);
            }
        });
        jPanel7.add(staffJobRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 230, 30));

        staffRegistration.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 370, 410));

        parentPanel.add(staffRegistration, "card3");

        supplierRegistration.setBackground(new java.awt.Color(255, 255, 255));
        supplierRegistration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel33.setText("Supplier No");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 30));

        supplierNo.setEditable(false);
        supplierNo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supplierNo.setBorder(null);
        supplierNo.setEnabled(false);
        supplierNo.setOpaque(false);
        jPanel9.add(supplierNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 320, 30));
        jPanel9.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 330, 10));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel35.setText("First Name *");
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 30));

        supplierFname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supplierFname.setBorder(null);
        supplierFname.setOpaque(false);
        supplierFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                supplierFnameFocusLost(evt);
            }
        });
        supplierFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierFnameActionPerformed(evt);
            }
        });
        supplierFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                supplierFnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supplierFnameKeyTyped(evt);
            }
        });
        jPanel9.add(supplierFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 320, 30));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel40.setText("Last Name ");
        jPanel9.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 110, 30));

        supplierLname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supplierLname.setBorder(null);
        supplierLname.setOpaque(false);
        supplierLname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                supplierLnameFocusLost(evt);
            }
        });
        supplierLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierLnameActionPerformed(evt);
            }
        });
        supplierLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supplierLnameKeyTyped(evt);
            }
        });
        jPanel9.add(supplierLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 320, 30));
        jPanel9.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 10));
        jPanel9.add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 330, 10));

        supplierRegistration.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 380, 280));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel10.setOpaque(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel39.setText("Contact Number 1");
        jPanel10.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, 30));

        supplierct1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supplierct1.setBorder(null);
        supplierct1.setOpaque(false);
        supplierct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierct1ActionPerformed(evt);
            }
        });
        supplierct1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supplierct1KeyTyped(evt);
            }
        });
        jPanel10.add(supplierct1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 320, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel34.setText("Contact Number 2");
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 30));

        supplierct2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supplierct2.setBorder(null);
        supplierct2.setOpaque(false);
        supplierct2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                supplierct2FocusLost(evt);
            }
        });
        supplierct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierct2ActionPerformed(evt);
            }
        });
        supplierct2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supplierct2KeyTyped(evt);
            }
        });
        jPanel10.add(supplierct2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 320, 30));
        jPanel10.add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 330, 10));
        jPanel10.add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 10));

        supplierRegistration.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 390, 280));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel11.setOpaque(false);
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supplierDes.setColumns(20);
        supplierDes.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supplierDes.setRows(5);
        jScrollPane4.setViewportView(supplierDes);

        jPanel11.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 330, 190));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel46.setText("Discription");
        jPanel11.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 110, 30));

        supplierRegistration.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 370, 280));

        saveSupplier.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        saveSupplier.setText("Save Supplier");
        saveSupplier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveSupplier.setFocusPainted(false);
        saveSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveSupplierActionPerformed(evt);
            }
        });
        supplierRegistration.add(saveSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 220, 60));

        updateSupplier.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        updateSupplier.setText("Edit Details");
        updateSupplier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updateSupplier.setFocusPainted(false);
        updateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSupplierActionPerformed(evt);
            }
        });
        supplierRegistration.add(updateSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 470, 220, 60));

        loadSupplier.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        loadSupplier.setText("Load Supplier");
        loadSupplier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loadSupplier.setFocusPainted(false);
        loadSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadSupplierActionPerformed(evt);
            }
        });
        supplierRegistration.add(loadSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 530, 220, 60));

        refresh.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        refresh.setText("Refresh");
        refresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refresh.setFocusPainted(false);
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        supplierRegistration.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, 220, 60));

        supplierTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Supplier No", "Supplier Name", "Contact Numbers", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        supplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supplierTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(supplierTable);

        supplierRegistration.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 870, 330));

        parentPanel.add(supplierRegistration, "card4");

        add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1206, 668));
    }// </editor-fold>//GEN-END:initComponents

    private void memberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberbtnActionPerformed

        unseletButton();
        memberbtn.setSelected(true);
        memberbtn.setBackground(Colors.defaultWhite);
        memberbtn.setForeground(Colors.defaultBlue);

        parentPanel.removeAll();
        parentPanel.add(memberRegistration);
        parentPanel.repaint();
        parentPanel.revalidate();
        parentPanel.setVisible(true);
        
        titleLabel.setText("Member Registration");

    }//GEN-LAST:event_memberbtnActionPerformed

    private void staffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffbtnActionPerformed
        unseletButton();
        staffbtn.setSelected(true);
        staffbtn.setBackground(Colors.defaultWhite);
        staffbtn.setForeground(Colors.defaultBlue);

        parentPanel.removeAll();
        parentPanel.add(staffRegistration);
        parentPanel.repaint();
        parentPanel.revalidate();
        parentPanel.setVisible(true);
        
        titleLabel.setText("Staff Registration");
    }//GEN-LAST:event_staffbtnActionPerformed

    private void saveStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveStaffActionPerformed
        if (isStaffRequiredHave()) {
            addressModel = new Address();
            generalDetailModel = new GeneralDetail();
            setStaffModel();
        } else {
            JOptionPane.showMessageDialog(this, "Some Required Details Have NOT Entered!", "Empty field", JOptionPane.ERROR_MESSAGE);
            staffNic.requestFocus();
        }
    }//GEN-LAST:event_saveStaffActionPerformed

    private void supplierbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierbtnActionPerformed
        unseletButton();
        supplierbtn.setSelected(true);
        supplierbtn.setBackground(Colors.defaultWhite);
        supplierbtn.setForeground(Colors.defaultBlue);

        parentPanel.removeAll();
        parentPanel.add(supplierRegistration);
        parentPanel.repaint();
        parentPanel.revalidate();
        parentPanel.setVisible(true);
        
        titleLabel.setText("Supplier Registration");
    }//GEN-LAST:event_supplierbtnActionPerformed

    public static Address addressModel;
    public static GeneralDetail generalDetailModel;
    public static MemberModel memberModel;
    String gender;
    private void saveMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMemberActionPerformed
        addressModel = new Address();
        generalDetailModel = new GeneralDetail();
        memberModel = new MemberModel();

        if (male.isSelected()) {
            gender = "male";
        } else {
            gender = "female";
        }

        if (packageNameId != 0) {
            addressModel.setNo(no.getText().trim()).setStreet1(street1.getText().trim()).setStreet2(street2.getText().trim()).setCity(city.getText().trim());
            generalDetailModel.setNic(nic.getText().trim()).setFirstName(firstName.getText().trim()).setMiddleName(middleName.getText().trim()).setLastName(lastName.getText().trim())
                    .setDob(dob.getText().trim()).setGender(gender).setContact1(contact1.getText().trim()).setContact2(contact2.getText().trim());
            memberModel.setCode(code.getText().trim()).setPackageId(packageNameId);

            if (MemberManagement.saveMember(addressModel, generalDetailModel, memberModel)) {
                JOptionPane.showMessageDialog(this, "Successfully Saved the Member!", "Saved Successfully", JOptionPane.INFORMATION_MESSAGE);
        GUI.dashboardPanel.getInstance().setAllMemCount();
                MemberManagement.isSuccessful = false;
            } else {
                JOptionPane.showMessageDialog(this, "Something went wrong. Please try again!", "Failed!", JOptionPane.WARNING_MESSAGE);
            }

            refreshMember();

        } else {
            JOptionPane.showMessageDialog(this, "Select a Package for the member!", "Warning!", JOptionPane.WARNING_MESSAGE);
            packageCombo.setFocusable(true);
        }
        MemberManagement.isSuccessful = false;
    }//GEN-LAST:event_saveMemberActionPerformed

    String birthYear, birthMonth, birthDay;
    int noDay, noMonth;
    private void nicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nicFocusLost
        if (!nic.getText().trim().equals("")) {

            try {
                if (MemberManagement.isAlreadyMember(nic.getText().trim()).next()) {
                    loadAlreadyMember(MemberManagement.isAlreadyMember(nic.getText().trim()));

                } else {
                    saveMember.setEnabled(true);
                    updateMember.setEnabled(false);

                    if (nic.getText().length() == 10) {
                        birthYear = "19".concat(nic.getText().substring(0, 2));
                        noDay = Integer.parseInt(nic.getText().substring(2, 5));

                        if (isFemale(noDay)) {
                            female.setSelected(true);
                            noDay = noDay - 500;
                        } else {
                            male.setSelected(true);
                        }

                        dob.setText(checkForLeapYear(noDay));

                    } else if (nic.getText().length() == 12) {
                        birthYear = nic.getText().substring(0, 4);
                        noDay = Integer.parseInt(nic.getText().substring(4, 7));

                        if (isFemale(noDay)) {
                            female.setSelected(true);
                            noDay = noDay - 500;
                        } else {
                            male.setSelected(true);
                        }
                        dob.setText(checkForLeapYear(noDay));

                    } else {
                        JOptionPane.showMessageDialog(this, "There's a problem with NIC. Please check again!", "Invalid NIC", JOptionPane.WARNING_MESSAGE);
                        nic.requestFocus();
                    }

                }
            } catch (SQLException ex) {
                Logger.getLogger(RegistrationPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "NIC Required!", "Empty field", JOptionPane.WARNING_MESSAGE);
            nic.requestFocus();

        }

    }//GEN-LAST:event_nicFocusLost

    private void firstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameFocusLost
        if (firstName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "First Name Required!", "Empty field", JOptionPane.WARNING_MESSAGE);
            firstName.requestFocus();
        }
    }//GEN-LAST:event_firstNameFocusLost

    private void lastNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameFocusLost
        if (lastName.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Last Name Required!", "Empty field", JOptionPane.WARNING_MESSAGE);
            lastName.requestFocus();
        }
    }//GEN-LAST:event_lastNameFocusLost

    private void contact1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contact1FocusLost
        if (contact1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Contact Required!", "Empty field", JOptionPane.WARNING_MESSAGE);
            contact1.requestFocus();
        }
    }//GEN-LAST:event_contact1FocusLost

    private void noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_noFocusLost
        if (no.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Home No Required!", "Empty field", JOptionPane.WARNING_MESSAGE);
            no.requestFocus();
        }
    }//GEN-LAST:event_noFocusLost

    private void street1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_street1FocusLost
        if (street1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Home Street Required!", "Empty field", JOptionPane.WARNING_MESSAGE);
            street1.requestFocus();
        }
    }//GEN-LAST:event_street1FocusLost

    private void cityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityFocusLost
        if (city.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Home City Required!", "Empty field", JOptionPane.WARNING_MESSAGE);
            city.requestFocus();
        }
    }//GEN-LAST:event_cityFocusLost

    private void packageComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_packageComboMouseClicked

    }//GEN-LAST:event_packageComboMouseClicked

    private void contact2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contact2FocusGained

    }//GEN-LAST:event_contact2FocusGained

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        firstName.grabFocus();
    }//GEN-LAST:event_nicActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        middleName.grabFocus();
    }//GEN-LAST:event_firstNameActionPerformed

    private void middleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleNameActionPerformed
        lastName.grabFocus();
    }//GEN-LAST:event_middleNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        contact1.grabFocus();
    }//GEN-LAST:event_lastNameActionPerformed

    private void contact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact1ActionPerformed
        contact2.grabFocus();
    }//GEN-LAST:event_contact1ActionPerformed

    private void contact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact2ActionPerformed
        no.grabFocus();
    }//GEN-LAST:event_contact2ActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        street1.grabFocus();
    }//GEN-LAST:event_noActionPerformed

    private void street1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_street1ActionPerformed
        street2.grabFocus();
    }//GEN-LAST:event_street1ActionPerformed

    private void street2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_street2ActionPerformed
        city.grabFocus();
    }//GEN-LAST:event_street2ActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        //no yet
    }//GEN-LAST:event_codeActionPerformed

    private void packageComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageComboActionPerformed

    }//GEN-LAST:event_packageComboActionPerformed

    private void staffNicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staffNicFocusLost

        if (!staffNic.getText().trim().equals("")) {

            try {
                if (StaffManagement.isAlreadyStaff(staffNic.getText().trim()).next()) {
                    loadAlreadyStaff(StaffManagement.isAlreadyStaff(staffNic.getText().trim()));

                } else {
                    saveStaff.setEnabled(true);
                    updateStaff.setEnabled(false);

                    if (staffNic.getText().length() == 10) {
                        birthYear = "19".concat(staffNic.getText().substring(0, 2));
                        noDay = Integer.parseInt(staffNic.getText().substring(2, 5));

                        if (isFemale(noDay)) {
                            staffFemale.setSelected(true);
                            noDay = noDay - 500;
                        } else {
                            staffMale.setSelected(true);
                        }

                        staffDob.setText(checkForLeapYear(noDay));

                    } else if (staffNic.getText().length() == 12) {
                        birthYear = staffNic.getText().substring(0, 4);
                        noDay = Integer.parseInt(staffNic.getText().substring(4, 7));

                        if (isFemale(noDay)) {
                            staffFemale.setSelected(true);
                            noDay = noDay - 500;
                        } else {
                            staffMale.setSelected(true);
                        }
                        staffDob.setText(checkForLeapYear(noDay));

                    } else {
                        JOptionPane.showMessageDialog(this, "There's a problem with NIC. Please check again!", "Invalid NIC", JOptionPane.WARNING_MESSAGE);
                        staffNic.requestFocus();
                    }

                }
            } catch (SQLException ex) {
                Logger.getLogger(RegistrationPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "NIC Required!", "Empty field", JOptionPane.WARNING_MESSAGE);
            staffNic.requestFocus();

        }

    }//GEN-LAST:event_staffNicFocusLost

    private void staffFnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staffFnameFocusLost
        if (staffFname.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "First Name Required!", "Empty Field", JOptionPane.WARNING_MESSAGE);
            staffFname.setFocusable(true);
        }
    }//GEN-LAST:event_staffFnameFocusLost

    private void staffLnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staffLnameFocusLost
        if (staffLname.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Last Name Required!", "Empty Field", JOptionPane.WARNING_MESSAGE);
            staffLname.setFocusable(true);
        }
    }//GEN-LAST:event_staffLnameFocusLost

    private void staffContact1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staffContact1FocusLost
        if (staffContact1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Contact Number Required!", "Empty Field", JOptionPane.WARNING_MESSAGE);
            staffContact1.setFocusable(true);
        }
    }//GEN-LAST:event_staffContact1FocusLost

    private void staffAddrNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staffAddrNoFocusLost
        if (staffAddrNo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Address Number Required!", "Empty Field", JOptionPane.WARNING_MESSAGE);
            staffAddrNo.setFocusable(true);
        }
    }//GEN-LAST:event_staffAddrNoFocusLost

    private void staffAddrStr1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staffAddrStr1FocusLost
        if (staffAddrStr1.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Address Street Required!", "Empty Field", JOptionPane.WARNING_MESSAGE);
            staffContact1.setFocusable(true);
        }
    }//GEN-LAST:event_staffAddrStr1FocusLost

    private void staffAddrCityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staffAddrCityFocusLost
        if (staffAddrCity.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Address City Required!", "Empty Field", JOptionPane.WARNING_MESSAGE);
            staffAddrCity.setFocusable(true);
        }
    }//GEN-LAST:event_staffAddrCityFocusLost

    private void staffJobRoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffJobRoleMouseClicked
//        JobRoleMaagement.getSelectedJobRole(staffJobRole.getSelectedItem().toString());
    }//GEN-LAST:event_staffJobRoleMouseClicked

    private void staffNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffNicActionPerformed
        staffFname.grabFocus();
    }//GEN-LAST:event_staffNicActionPerformed

    private void staffFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffFnameActionPerformed
        staffMname.grabFocus();
    }//GEN-LAST:event_staffFnameActionPerformed

    private void staffMnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffMnameActionPerformed
        staffLname.grabFocus();
    }//GEN-LAST:event_staffMnameActionPerformed

    private void staffLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffLnameActionPerformed
        staffContact1.grabFocus();
    }//GEN-LAST:event_staffLnameActionPerformed

    private void staffContact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffContact2ActionPerformed
        staffAddrNo.grabFocus();
    }//GEN-LAST:event_staffContact2ActionPerformed

    private void staffContact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffContact1ActionPerformed
        staffContact2.grabFocus();
    }//GEN-LAST:event_staffContact1ActionPerformed

    private void staffAddrNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffAddrNoActionPerformed
        staffAddrStr1.grabFocus();
    }//GEN-LAST:event_staffAddrNoActionPerformed

    private void staffAddrStr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffAddrStr1ActionPerformed
        staffAddrStr2.grabFocus();
    }//GEN-LAST:event_staffAddrStr1ActionPerformed

    private void staffAddrStr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffAddrStr2ActionPerformed
        staffAddrCity.grabFocus();
    }//GEN-LAST:event_staffAddrStr2ActionPerformed

    private static char c;
    private static String currentNic;

    private void staffNicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffNicKeyTyped

        c = evt.getKeyChar();
        currentNic = staffNic.getText().trim();

        if (!currentNic.equals("")) {

            if (currentNic.length() < 12) {
                System.out.println(evt.getKeyChar());

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
        } else {
            refreshStaff();
        }

    }//GEN-LAST:event_staffNicKeyTyped

    private void staffNicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffNicKeyPressed

    }//GEN-LAST:event_staffNicKeyPressed

    private static String currentContact1, currentContact2;
    private static char ct1c, ct2c;

    private void staffContact1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffContact1KeyTyped

        currentContact1 = staffContact1.getText().trim();
        ct1c = evt.getKeyChar();

        if (currentContact1.length() < 10) {

            if (!((ct1c >= '0') && (ct1c <= '9')
                    || (ct1c == KeyEvent.VK_BACK_SPACE)
                    || (ct1c == KeyEvent.VK_DELETE))) {
                evt.consume();
            }

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_staffContact1KeyTyped

    private void staffContact2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffContact2KeyTyped

        currentContact2 = staffContact2.getText().trim();
        ct2c = evt.getKeyChar();

        if (currentContact2.length() < 10) {

            if (!((ct2c >= '0') && (ct2c <= '9')
                    || (ct2c == KeyEvent.VK_BACK_SPACE)
                    || (ct2c == KeyEvent.VK_DELETE))) {
                evt.consume();
            }

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_staffContact2KeyTyped

    private void updateStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStaffActionPerformed
        if (isStaffRequiredHave()) {
            setUpdateStaffModel();
        } else {
            JOptionPane.showMessageDialog(this, "Some Required Details Have NOT Entered!", "Empty field", JOptionPane.ERROR_MESSAGE);
            staffNic.requestFocus();
        }
    }//GEN-LAST:event_updateStaffActionPerformed


    private void staffFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffFnameKeyTyped
        c = evt.getKeyChar();

        if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_staffFnameKeyTyped

    private void staffMnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffMnameKeyTyped
        c = evt.getKeyChar();

        if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_staffMnameKeyTyped

    private void staffLnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffLnameKeyTyped
        c = evt.getKeyChar();

        if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_staffLnameKeyTyped

    private void nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyTyped

        c = evt.getKeyChar();
        currentNic = nic.getText().trim();

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
        } else {
            refreshMember();
        }
    }//GEN-LAST:event_nicKeyTyped

    private void firstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameKeyTyped
        c = evt.getKeyChar();

        if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_firstNameKeyTyped

    private void middleNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_middleNameKeyTyped
        c = evt.getKeyChar();

        if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_middleNameKeyTyped

    private void lastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameKeyTyped
        c = evt.getKeyChar();

        if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_lastNameKeyTyped

    private void contact1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contact1KeyTyped
        currentContact1 = contact1.getText().trim();
        ct1c = evt.getKeyChar();

        if (currentContact1.length() < 10) {

            if (!((ct1c >= '0') && (ct1c <= '9')
                    || (ct1c == KeyEvent.VK_BACK_SPACE)
                    || (ct1c == KeyEvent.VK_DELETE))) {
                evt.consume();
            }

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_contact1KeyTyped

    private void contact2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contact2KeyTyped
        currentContact2 = contact2.getText().trim();
        ct2c = evt.getKeyChar();

        if (currentContact2.length() < 10) {

            if (!((ct2c >= '0') && (ct2c <= '9')
                    || (ct2c == KeyEvent.VK_BACK_SPACE)
                    || (ct2c == KeyEvent.VK_DELETE))) {
                evt.consume();
            }

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_contact2KeyTyped

    private void staffJobRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffJobRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffJobRoleActionPerformed

    private void staffJobRolePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_staffJobRolePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_staffJobRolePropertyChange

    PackageName packageComboModel;
    int packageNameId = 0;
    private void packageComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_packageComboPropertyChange
        if (!packageCombo.getSelectedItem().toString().equals("Select Category")) {
            packageComboModel = PackageNameManagement.getPackageNameModel(packageCombo.getSelectedItem().toString());
            packageNameId = packageComboModel.getIdPackageName();
        }
    }//GEN-LAST:event_packageComboPropertyChange

    private void refreshFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshFormActionPerformed
        refreshMember();
        GUI.dashboardPanel.getInstance().setAllMemCount();
    }//GEN-LAST:event_refreshFormActionPerformed

    private void updateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMemberActionPerformed
        if (isMemberRequiredHave()) {
            setUpdateMemberModel();
        GUI.dashboardPanel.getInstance().setAllMemCount();
        } else {
            JOptionPane.showMessageDialog(this, "Some Required Details Have NOT Entered!", "Empty field", JOptionPane.ERROR_MESSAGE);
            nic.requestFocus();
        }
    }//GEN-LAST:event_updateMemberActionPerformed

    private void supplierFnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplierFnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierFnameFocusLost

    private void supplierFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierFnameActionPerformed

    private void supplierFnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierFnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierFnameKeyPressed

    private void supplierFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierFnameKeyTyped
        c = evt.getKeyChar();

        if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_supplierFnameKeyTyped

    private void supplierLnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplierLnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierLnameFocusLost

    private void supplierLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierLnameActionPerformed

    private void supplierLnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierLnameKeyTyped
        c = evt.getKeyChar();

        if (!(Character.isAlphabetic(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_supplierLnameKeyTyped

    private void supplierct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierct1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierct1ActionPerformed

    private static String currentSupContact1, currentSupContact2;
    private static char sct1c, sct2c;
    private void supplierct1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierct1KeyTyped

        currentSupContact1 = supplierct1.getText().trim();
        sct1c = evt.getKeyChar();

        if (currentSupContact1.length() < 10) {

            if (!((sct1c >= '0') && (sct1c <= '9')
                    || (sct1c == KeyEvent.VK_BACK_SPACE)
                    || (sct1c == KeyEvent.VK_DELETE))) {
                evt.consume();
            }

        } else {
            evt.consume();
        }

    }//GEN-LAST:event_supplierct1KeyTyped

    private void supplierct2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supplierct2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierct2FocusLost

    private void supplierct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierct2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierct2ActionPerformed

    private void supplierct2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supplierct2KeyTyped
        currentSupContact2 = supplierct2.getText().trim();
        sct2c = evt.getKeyChar();

        if (currentSupContact2.length() < 10) {

            if (!((sct2c >= '0') && (sct2c <= '9')
                    || (sct2c == KeyEvent.VK_BACK_SPACE)
                    || (sct2c == KeyEvent.VK_DELETE))) {
                evt.consume();
            }

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_supplierct2KeyTyped

    public void setSupplierID() {
        supplierNo.setText(String.valueOf(SupplierManagement.setSupplierId()));
    }

    ResultSet allSupplier;

    public void loadSupplierTable() {
        DefaultTableModel dtm_supplierTable = (DefaultTableModel) supplierTable.getModel();
        allSupplier = SupplierManagement.getAllSupplier();
        dtm_supplierTable.setRowCount(0);
        try {
            while (allSupplier.next()) {
                Vector v = new Vector();
                v.add(allSupplier.getString("idsupplier"));
                v.add(allSupplier.getString("fname") + " " + allSupplier.getString("lname"));
                v.add(allSupplier.getString("contact1") + "/" + allSupplier.getString("contact2"));
                v.add(allSupplier.getString("description"));
                dtm_supplierTable.addRow(v);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void refreshSupplier() {
        supplierFname.setText(null);
        supplierLname.setText(null);
        supplierct1.setText(null);
        supplierct2.setText(null);
        supplierDes.setText(null);
        saveSupplier.setEnabled(true);
        updateSupplier.setEnabled(true);
        setSupplierID();
        loadSupplierTable();

        selectedSupId = 0;

        saveSupplier.setEnabled(true);
        updateSupplier.setEnabled(false);
    }

    Supplier supplier, selectedSupplier;
    private void saveSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveSupplierActionPerformed
        if (!supplierFname.getText().trim().equals("")) {
            supplier = new Supplier().setFname(supplierFname.getText().trim())
                    .setLname(supplierLname.getText().trim()).setContact1(supplierct1.getText().trim())
                    .setContact2(supplierct2.getText().trim()).setDescription(supplierDes.getText().trim());
            if (SupplierManagement.saveSupplier(supplier)) {
                JOptionPane.showMessageDialog(this, "Succefully added supplier!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
                refreshSupplier();
                StockPanel sp = StockPanel.getInstance();
                sp.loadSupplier();
            } else {
                JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "First Name Required!", "Failed!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_saveSupplierActionPerformed

    private void updateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSupplierActionPerformed
        selectedSupplier.setFname(supplierFname.getText().trim()).setLname(supplierLname.getText().trim())
                .setContact1(supplierct1.getText().trim()).setContact2(supplierct2.getText().trim())
                .setDescription(supplierDes.getText().trim());
        if (SupplierManagement.updateSupplier(selectedSupplier)) {
            JOptionPane.showMessageDialog(this, "Succefully updated supplier!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
            refreshSupplier();
            saveSupplier.setEnabled(true);
            updateSupplier.setEnabled(false);
            StockPanel sp = StockPanel.getInstance();
            sp.loadSupplier();
        } else {
            JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_updateSupplierActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        refreshSupplier();
        saveSupplier.setEnabled(true);
        updateSupplier.setEnabled(false);
    }//GEN-LAST:event_refreshActionPerformed

    private void loadSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadSupplierActionPerformed
        loadSupplierTable();
    }//GEN-LAST:event_loadSupplierActionPerformed

    private void staffRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRefreshActionPerformed
        refreshStaff();
        saveStaff.setEnabled(true);
        updateStaff.setEnabled(false);
    }//GEN-LAST:event_staffRefreshActionPerformed

    ResultSet rs_selectedSup;
    int selectedSupId;
    private void supplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supplierTableMouseClicked
        if (evt.getClickCount() == 2) {
            selectedSupId = Integer.parseInt(supplierTable.getValueAt(supplierTable.getSelectedRow(), 0).toString());

            selectedSupplier = new Supplier();
            selectedSupplier.setSupplierId(selectedSupId);

            rs_selectedSup = SupplierManagement.getSelectedSupplier(selectedSupId);

            try {
                if (rs_selectedSup.next()) {
                    supplierNo.setText(String.valueOf(selectedSupId));
                    supplierFname.setText(rs_selectedSup.getString("fname"));
                    supplierLname.setText(rs_selectedSup.getString("lname"));
                    supplierct1.setText(rs_selectedSup.getString("contact1"));
                    supplierct2.setText(rs_selectedSup.getString("contact2"));
                    supplierDes.setText(rs_selectedSup.getString("description"));

                    saveSupplier.setEnabled(false);
                    updateSupplier.setEnabled(true);
                }
            } catch (SQLException ex) {
                Logger.getLogger(RegistrationPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_supplierTableMouseClicked

    private void staffActivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActivateActionPerformed

    }//GEN-LAST:event_staffActivateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog ViewPackage;
    private javax.swing.JDialog ViewWorkoutPlan;
    private javax.swing.JCheckBox activate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField city;
    private javax.swing.JTextField code;
    private javax.swing.JTextField contact1;
    private javax.swing.JTextField contact2;
    private com.alee.laf.text.WebFormattedTextField dob;
    private javax.swing.JCheckBox female;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField lastName;
    private javax.swing.JButton loadSupplier;
    private javax.swing.JCheckBox male;
    private javax.swing.JTextField memberNo;
    private javax.swing.JPanel memberRegistration;
    private javax.swing.JToggleButton memberbtn;
    private javax.swing.JTextField middleName;
    private javax.swing.JTextField nic;
    private javax.swing.JTextField no;
    private javax.swing.JComboBox<String> packageCombo;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JButton refresh;
    private javax.swing.JButton refreshForm;
    private javax.swing.JButton saveMember;
    private javax.swing.JButton saveStaff;
    private javax.swing.JButton saveSupplier;
    private javax.swing.JCheckBox staffActivate;
    private javax.swing.JTextField staffAddrCity;
    private javax.swing.JTextField staffAddrNo;
    private javax.swing.JTextField staffAddrStr1;
    private javax.swing.JTextField staffAddrStr2;
    private javax.swing.JTextField staffContact1;
    private javax.swing.JTextField staffContact2;
    private javax.swing.JTextArea staffDesc;
    private com.alee.laf.text.WebFormattedTextField staffDob;
    private javax.swing.JTextField staffFee;
    private javax.swing.JCheckBox staffFemale;
    private javax.swing.JTextField staffFname;
    private javax.swing.JComboBox<String> staffJobRole;
    private javax.swing.JTextField staffLname;
    private javax.swing.JCheckBox staffMale;
    private javax.swing.JTextField staffMname;
    private javax.swing.JTextField staffNic;
    private javax.swing.JTextField staffNo;
    private javax.swing.JButton staffRefresh;
    private javax.swing.JPanel staffRegistration;
    private javax.swing.JToggleButton staffbtn;
    private javax.swing.JTextField street1;
    private javax.swing.JTextField street2;
    private javax.swing.JTextArea supplierDes;
    private javax.swing.JTextField supplierFname;
    private javax.swing.JTextField supplierLname;
    private javax.swing.JTextField supplierNo;
    private javax.swing.JPanel supplierRegistration;
    private javax.swing.JTable supplierTable;
    private javax.swing.JToggleButton supplierbtn;
    private javax.swing.JTextField supplierct1;
    private javax.swing.JTextField supplierct2;
    private javax.swing.JPanel titleBar;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateMember;
    private javax.swing.JButton updateStaff;
    private javax.swing.JButton updateSupplier;
    // End of variables declaration//GEN-END:variables

    public void setBackgroundColor() {
        Color backGroundCOlor = Classes.Colors.defaultbackground;
        this.setBackground(backGroundCOlor);
    }

    private void unseletButton() {
        memberbtn.setSelected(false);
        memberbtn.setBackground(Colors.defaultBlue);
        memberbtn.setForeground(Colors.defaultWhite);
        staffbtn.setSelected(false);
        staffbtn.setBackground(Colors.defaultBlue);
        staffbtn.setForeground(Colors.defaultWhite);
        supplierbtn.setSelected(false);
        supplierbtn.setBackground(Colors.defaultBlue);
        supplierbtn.setForeground(Colors.defaultWhite);
    }

    public boolean isFemale(int femaleCount) {
        return femaleCount > 500;
    }

    public boolean isNormYear(int normYear) {
        return normYear % 4 != 0;
    }

    public String checkForLeapYear(int noDay) {
        System.out.println(noDay);
        if (noDay <= 31) {
            birthMonth = "01";
            noMonth = noDay;
        } else if (noDay <= 60) {
            birthMonth = "02";
            noMonth = noDay - 31;
        } else if (noDay <= 91) {
            birthMonth = "03";
            noMonth = noDay - 60;
        } else if (noDay <= 121) {
            birthMonth = "04";
            noMonth = noDay - 91;
        } else if (noDay <= 152) {
            birthMonth = "05";
            noMonth = noDay - 121;
        } else if (noDay <= 182) {
            birthMonth = "06";
            noMonth = noDay - 152;
        } else if (noDay <= 213) {
            birthMonth = "07";
            noMonth = noDay - 182;
        } else if (noDay <= 244) {
            birthMonth = "08";
            System.out.println(noDay - 213);
            noMonth = noDay - 213;
        } else if (noDay <= 274) {
            birthMonth = "09";
            noMonth = noDay - 244;
        } else if (noDay <= 305) {
            birthMonth = "10";
            noMonth = noDay - 274;
        } else if (noDay <= 335) {
            birthMonth = "11";
            noMonth = noDay - 305;
        } else if (noDay <= 366) {
            birthMonth = "12";
            noMonth = noDay - 335;
        } else {
            System.out.println("Wrong");
        }

        return (noMonth + "/" + birthMonth + "/" + birthYear);

    }

    ResultSet packageNameSet;

    public void loadPackageCombo() {
        try {
            packageCombo.removeAllItems();
            packageCombo.addItem("Select a Package");

            packageNameSet = PackageNameManagement.getAllPackageNames();
            
                while (packageNameSet.next()) {
                    packageCombo.addItem(packageNameSet.getString("packagename"));
            
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
    String nicno, fname, mname, lname, ct1, ct2, num, str1, str2, cty, cde;
    Date assignedDate;

    String superAdminId;

    public void setValueModel() {
        assignedDate = new Date();

        //this should be select from useraccount NOT superadmin
        ResultSet rs = DB.search("SELECT idsuperadmin FROM superadmin WHERE status='1'");
        try {
            if (rs.next()) {
                superAdminId = rs.getString("idsuperadmin");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        addressModel.setNo(no.getText().trim()).setStreet1(street1.getText().trim()).setStreet2(street2.getText().trim()).setCity(city.getText().trim());
//        System.out.println(addressModel);
        AddressManagement.saveAddress(addressModel);

        System.out.println(superAdminId);
        generalDetailModel.setNic(nic.getText().trim()).setFirstName(firstName.getText().trim()).setMiddleName(middleName.getText().trim()).setLastName(lastName.getText().trim())
                .setContact1(contact1.getText().trim()).setContact2(contact2.getText().trim()).setDob(dob.getText());

        System.out.println(generalDetailModel);

        GeneralDetailManagement.saveGeneralDetail(generalDetailModel);
        memberModel.setCode(code.getText().trim())
                .setAddressId(AddressManagement.lastAddressId)
                .setGeneralDetailId(GeneralDetailManagement.lastGeneralId)
                .setPackageId(NewPackageName.packageNameModel.getIdPackageName());
    }

    ResultSet jobRolesSet;

    public void loadInStaff() {

        staffNo.setText(String.valueOf(StaffManagement.getStaffCount()));
        try {
            staffActivate.setSelected(true);

            jobRolesSet = JobRoleMaagement.getAllJobRole();
            staffJobRole.removeAllItems();
            staffJobRole.addItem("Select Job Role");
            while (jobRolesSet.next()) {
                staffJobRole.addItem(jobRolesSet.getString("jobrole"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    ResultSet packageNameSet;
    public void loadInMember() {

        memberNo.setText(String.valueOf(MemberManagement.getMemberCount()));
        activate.setSelected(true);
        loadPackageCombo();
    }

    public boolean isStaffRequiredHave() {

        return !(staffNic.getText().isEmpty()
                || staffFname.getText().isEmpty()
                || staffLname.getText().isEmpty()
                || staffContact1.getText().isEmpty()
                || staffAddrNo.getText().isEmpty()
                || staffAddrStr1.getText().isEmpty()
                || staffAddrCity.getText().isEmpty());

    }

    public boolean isMemberRequiredHave() {

        return !(nic.getText().trim().equals("")
                || firstName.getText().trim().equals("")
                || lastName.getText().trim().equals("")
                || contact1.getText().trim().equals("")
                || no.getText().trim().equals("")
                || street1.getText().trim().equals("")
                || city.getText().trim().equals("")
                || packageCombo.getSelectedItem().toString().equals("Select a Package"));

    }

    String staffGender, staffAccess;
    Staff staffModel;

    public void setStaffModel() {
        if (staffMale.isSelected()) {
            staffGender = "male";
        } else {
            staffGender = "female";
        }

        staffAccess = "nonaccess";

        if (!staffJobRole.getSelectedItem().toString().equals("Select Job Role")) {
            JobRoleMaagement.getSelectedJobRole(staffJobRole.getSelectedItem().toString());
            staffModel = new Staff();
            
            double staffF = 0.0;
            

            addressModel.setNo(staffAddrNo.getText().trim()).setStreet1(staffAddrStr1.getText().trim()).setStreet2(staffAddrStr2.getText().trim()).setCity(staffAddrCity.getText().trim());
            generalDetailModel.setNic(staffNic.getText().trim()).setFirstName(staffFname.getText().trim()).setMiddleName(staffMname.getText().trim())
                    .setLastName(staffLname.getText().trim()).setDob(staffDob.getText().trim()).setGender(staffGender).setContact1(staffContact1.getText().trim())
                    .setContact2(staffContact2.getText().trim());

            if (!staffFee.getText().isEmpty()) {
                staffF = Double.parseDouble(staffFee.getText().trim());
            }
             staffModel.setDescription(staffDesc.getText().trim()).setFee(staffF).setAccessbility(staffAccess).setJobRoleId(JobRoleMaagement.selectedJobrole);

            if (StaffManagement.saveStaff(addressModel, generalDetailModel, staffModel)) {
                JOptionPane.showMessageDialog(this, "Successfully Saved to Staff!", "Saved Successfully", JOptionPane.INFORMATION_MESSAGE);
                        refreshStaff();
            } else {
                JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
                        refreshStaff();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Select a Job Role for Staff Member!", "Not assigned", JOptionPane.WARNING_MESSAGE);
            staffJobRole.setFocusable(true);
        }

    }
 int act;
    public void setUpdateStaffModel() {
        if (staffMale.isSelected()) {
            staffGender = "male";
        } else {
            staffGender = "female";
        }
//
//        if (!staffAccessbility.isSelected()) {
        staffAccess = "nonaccess";
//        } else {
//            staffAccess = "access";
//        }

        if (staffActivate.isSelected()) {
            act = 1;
        } else {
            act = 0;
        }


        if (!staffJobRole.getSelectedItem().toString().equals("Select Job Role")) {
            JobRoleMaagement.getSelectedJobRole(staffJobRole.getSelectedItem().toString());

            alreadyStaffAddress.setNo(staffAddrNo.getText().trim()).setStreet1(staffAddrStr1.getText().trim()).setStreet2(staffAddrStr2.getText().trim()).setCity(staffAddrCity.getText().trim());
            alreadyStaffGD.setNic(staffNic.getText().trim()).setFirstName(staffFname.getText().trim()).setMiddleName(staffMname.getText().trim())
                    .setLastName(staffLname.getText().trim()).setDob(staffDob.getText().trim()).setGender(staffGender).setContact1(staffContact1.getText().trim())
                    .setContact2(staffContact2.getText().trim()).setGeneralStatus(act);

            alreadyStaffModel.setDescription(staffDesc.getText().trim()).setFee(Double.parseDouble(staffFee.getText().trim())).setAccessbility(staffAccess).setJobRoleId(JobRoleMaagement.selectedJobrole);

            if (StaffManagement.updateStaff(alreadyStaffAddress, alreadyStaffGD, alreadyStaffModel)) {
                JOptionPane.showMessageDialog(this, "Successfully Updated to Staff!", "Updated Successfully", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Something went wrong!", "Saved Failed", JOptionPane.WARNING_MESSAGE);
            }

            refreshStaff();

        } else {
            JOptionPane.showMessageDialog(this, "Select a Job Role for Staff Member!", "Not assigned", JOptionPane.WARNING_MESSAGE);
            staffJobRole.setFocusable(true);
        }

    }

    int actv;
    public void setUpdateMemberModel() {
        if (male.isSelected()) {
            gender = "male";
        } else {
            gender = "female";
        }
        
        if (activate.isSelected()) {
            actv = 1;
        } else {
            actv = 0;
        }
        
        

        if (!packageCombo.getSelectedItem().toString().equals("Select a Package")) {
            PackageNameManagement.getPackageNameModel(packageCombo.getSelectedItem().toString());

            alreadyStaffAddress.setNo(no.getText().trim()).setStreet1(street1.getText().trim()).setStreet2(street2.getText().trim()).setCity(city.getText().trim());
            alreadyStaffGD.setNic(nic.getText().trim()).setFirstName(firstName.getText().trim()).setMiddleName(middleName.getText().trim())
                    .setLastName(lastName.getText().trim()).setDob(dob.getText().trim()).setGender(gender).setContact1(contact1.getText().trim())
                    .setContact2(contact2.getText().trim()).setGeneralStatus(actv);

            alreadyMemberModel.setCode(code.getText().trim()).setPackageId(packageNameId);

            if (MemberManagement.updateMember(alreadyStaffAddress, alreadyStaffGD, alreadyMemberModel)) {
                JOptionPane.showMessageDialog(this, "Successfully Updated to Member!", "Updated Successfully", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Select a Package Name for Member!", "Not assigned", JOptionPane.WARNING_MESSAGE);
            packageCombo.setFocusable(true);
        }
        refreshMember();
    }

    public void refreshStaff() {
        staffNo.setText(String.valueOf(StaffManagement.getStaffCount()));
        staffNic.setText(null);
        staffFname.setText(null);
        staffMname.setText(null);
        staffLname.setText(null);
        staffDob.setText(null);
        staffMale.setSelected(true);
        staffContact1.setText(null);
        staffContact2.setText(null);
        staffAddrNo.setText(null);
        staffAddrStr1.setText(null);
        staffAddrStr2.setText(null);
        staffAddrCity.setText(null);
        staffJobRole.setSelectedIndex(0);
        staffDesc.setText(null);
        staffFee.setText(null);
    }

    public void refreshMember() {
        memberNo.setText(String.valueOf(MemberManagement.getMemberCount()));
        nic.setText(null);
        firstName.setText(null);
        middleName.setText(null);
        lastName.setText(null);
        dob.setText(null);
        male.setSelected(true);
        contact1.setText(null);
        contact2.setText(null);
        no.setText(null);
        street1.setText(null);
        street2.setText(null);
        city.setText(null);
        packageCombo.setSelectedIndex(0);
        code.setText(null);
        staffFee.setText(null);
        activate.setSelected(true);
    }

    public static Staff alreadyStaffModel = new Staff();
    public static Address alreadyStaffAddress = new Address();
    public static GeneralDetail alreadyStaffGD = new GeneralDetail();
    public static JobRole alreadyStaffJob = new JobRole();

    public void loadAlreadyStaff(ResultSet staffAlreadySet) {
        try {
            staffAlreadySet = StaffManagement.alreadyStaffSet;

            if (staffAlreadySet.next()) {
                staffFname.setText(staffAlreadySet.getString("fname"));
                staffMname.setText(staffAlreadySet.getString("mname"));
                staffLname.setText(staffAlreadySet.getString("lname"));
                staffDob.setText(staffAlreadySet.getString("dob"));
                if (staffAlreadySet.getString("gender").equals("male")) {
                    staffMale.setSelected(true);
                } else {
                    staffFemale.setSelected(true);
                }
                if (staffAlreadySet.getString("status").equals("1")) {
                    staffActivate.setSelected(true);
                }else{
                     staffActivate.setSelected(false);
                }

                staffAddrNo.setText(staffAlreadySet.getString("no"));
                staffAddrStr1.setText(staffAlreadySet.getString("street1"));
                staffAddrStr2.setText(staffAlreadySet.getString("street2"));
                staffAddrCity.setText(staffAlreadySet.getString("city"));
                staffContact1.setText(staffAlreadySet.getString("contact1"));
                staffContact2.setText(staffAlreadySet.getString("contact2"));
                staffDesc.setText(staffAlreadySet.getString("description"));
                staffFee.setText(staffAlreadySet.getString("fee"));
                staffJobRole.setSelectedItem(JobRoleMaagement.selectJobRole(staffAlreadySet.getString("jobrole_idjobrole")));


                alreadyStaffModel.setStaffid(Integer.parseInt(staffAlreadySet.getString("idstaff")))
                        .setAddressId(Integer.parseInt(staffAlreadySet.getString("idaddress")))
                        .setGeneralDetailId(Integer.parseInt(staffAlreadySet.getString("idgeneraldetail")))
                        .setJobRoleId(Integer.parseInt(staffAlreadySet.getString("jobrole_idjobrole")));

                alreadyStaffJob.setIdjobrole(Integer.parseInt(staffAlreadySet.getString("jobrole_idjobrole")));

                alreadyStaffAddress.setAddressId(Integer.parseInt(staffAlreadySet.getString("idaddress")));

                alreadyStaffGD.setGeneralDetailId(Integer.parseInt(staffAlreadySet.getString("idgeneraldetail")));

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        saveStaff.setEnabled(false);
        updateStaff.setEnabled(true);

    }

    public static MemberModel alreadyMemberModel = new MemberModel();
    public static PackageName alreadyPackageName = new PackageName();

    public void loadAlreadyMember(ResultSet memberAlreadySet) {
        try {
            memberAlreadySet = MemberManagement.allreadyMemberSet;

            if (memberAlreadySet.next()) {
                memberNo.setText(memberAlreadySet.getString("idmember"));
                firstName.setText(memberAlreadySet.getString("fname"));
                middleName.setText(memberAlreadySet.getString("mname"));
                lastName.setText(memberAlreadySet.getString("lname"));
                dob.setText(memberAlreadySet.getString("dob"));
                if (memberAlreadySet.getString("gender").equals("male")) {
                    male.setSelected(true);
                } else {
                    female.setSelected(true);
                }
                if (memberAlreadySet.getString("generaldetail.status").equals("1")) {
                    activate.setSelected(true);
                }else{
                 activate.setSelected(false);
                }
                packageNameId = Integer.parseInt(memberAlreadySet.getString("packagename_idpackagename"));
                no.setText(memberAlreadySet.getString("no"));
                street1.setText(memberAlreadySet.getString("street1"));
                street2.setText(memberAlreadySet.getString("street2"));
                city.setText(memberAlreadySet.getString("city"));
                contact1.setText(memberAlreadySet.getString("contact1"));
                contact2.setText(memberAlreadySet.getString("contact2"));
                code.setText(memberAlreadySet.getString("code"));
                packageCombo.setSelectedItem(PackageNameManagement.getPackageName(memberAlreadySet.getString("packagename_idpackagename")));


                alreadyMemberModel.setMemberId(Integer.parseInt(memberAlreadySet.getString("idmember")))
                        .setAddressId(Integer.parseInt(memberAlreadySet.getString("address_idaddress")))
                        .setGeneralDetailId(Integer.parseInt(memberAlreadySet.getString("idgeneraldetail")))
                        .setPackageId(Integer.parseInt(memberAlreadySet.getString("packagename_idpackagename")));

                alreadyPackageName.setIdPackageName(Integer.parseInt(memberAlreadySet.getString("packagename_idpackagename")));

                alreadyStaffAddress.setAddressId(Integer.parseInt(memberAlreadySet.getString("address_idaddress")));

                alreadyStaffGD.setGeneralDetailId(Integer.parseInt(memberAlreadySet.getString("idgeneraldetail")));

            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        saveMember.setEnabled(false);
        updateMember.setEnabled(true);

    }

}
