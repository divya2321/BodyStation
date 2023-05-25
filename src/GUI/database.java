package GUI;

import Classes.Colors;
import Database.Tables.MemberManagement;
import Database.Tables.StaffDatabaseManagement;
import Database.Tables.StaffManagement;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class database extends javax.swing.JPanel {

    public database() {
        initComponents();

        memberbtn.setBackground(Colors.defaultWhite);
        memberbtn.setForeground(Colors.defaultBlue);

        loadStaffDB();
        loadMemberDB();
    }

    private static database instance;

    public static database getInstance() {
        if (instance == null) {
            instance = new database();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        titleBar = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        memberbtn = new javax.swing.JToggleButton();
        staffbtn = new javax.swing.JToggleButton();
        parentPanel = new javax.swing.JPanel();
        searchMember = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        memberTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        memberAddressText = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        memberContactText = new javax.swing.JTextArea();
        memberLbl = new javax.swing.JLabel();
        memberSortOption = new javax.swing.JComboBox<>();
        memberSearchText = new javax.swing.JTextField();
        memberEnrollLbl = new javax.swing.JLabel();
        memberTypeSearchCombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        memberAllName = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        memberNivLbl = new javax.swing.JLabel();
        refreshMemberBtn = new javax.swing.JButton();
        memberSearchOption = new javax.swing.JComboBox<>();
        memberLoadOption = new javax.swing.JComboBox<>();
        searchStaff = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        staffTable = new javax.swing.JTable();
        typeSearch = new javax.swing.JTextField();
        sortOptionCombo = new javax.swing.JComboBox<>();
        staffFeelbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        typeSearchCombo = new javax.swing.JComboBox<>();
        staffNiclbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        staffAddressText = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        staffContactText = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        staffNamelbl = new javax.swing.JLabel();
        staffEnrolllbl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        loadOptionCombo = new javax.swing.JComboBox<>();
        searchOptionCombo = new javax.swing.JComboBox<>();
        refreshStaffDB = new javax.swing.JButton();

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

        add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        parentPanel.setLayout(new java.awt.CardLayout());

        searchMember.setBackground(new java.awt.Color(255, 255, 255));
        searchMember.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        memberTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        memberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enroll No", "NIC", "Name", "Gender", "DOB", "Package", "Entroll Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        memberTable.setOpaque(false);
        memberTable.setRowHeight(22);
        memberTable.setRowMargin(2);
        memberTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(memberTable);
        if (memberTable.getColumnModel().getColumnCount() > 0) {
            memberTable.getColumnModel().getColumn(0).setResizable(false);
            memberTable.getColumnModel().getColumn(0).setPreferredWidth(3);
            memberTable.getColumnModel().getColumn(1).setResizable(false);
            memberTable.getColumnModel().getColumn(1).setPreferredWidth(15);
            memberTable.getColumnModel().getColumn(3).setResizable(false);
            memberTable.getColumnModel().getColumn(3).setPreferredWidth(2);
        }

        searchMember.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 83, 1150, 360));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Contact Number");
        searchMember.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, -1, 30));

        memberAddressText.setColumns(20);
        memberAddressText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        memberAddressText.setRows(5);
        jScrollPane6.setViewportView(memberAddressText);

        searchMember.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 360, 110));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Address");
        searchMember.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 480, -1, 30));

        memberContactText.setColumns(20);
        memberContactText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        memberContactText.setRows(5);
        jScrollPane7.setViewportView(memberContactText);

        searchMember.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 320, 110));

        memberLbl.setBackground(new java.awt.Color(29, 124, 167));
        memberLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        memberLbl.setForeground(new java.awt.Color(29, 124, 167));
        memberLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchMember.add(memberLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 460, 150, 30));

        memberSortOption.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        memberSortOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enroll No", "Name" }));
        memberSortOption.setFocusable(false);
        memberSortOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberSortOptionActionPerformed(evt);
            }
        });
        searchMember.add(memberSortOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 180, 30));

        memberSearchText.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        memberSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                memberSearchTextKeyReleased(evt);
            }
        });
        searchMember.add(memberSearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 330, 30));

        memberEnrollLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchMember.add(memberEnrollLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 250, 30));

        memberTypeSearchCombo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        memberTypeSearchCombo.setOpaque(false);
        searchMember.add(memberTypeSearchCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 350, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Load Only");
        searchMember.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, 30));

        memberAllName.setBackground(new java.awt.Color(29, 124, 167));
        memberAllName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        memberAllName.setForeground(new java.awt.Color(29, 124, 167));
        searchMember.add(memberAllName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 400, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Sort By");
        searchMember.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, 30));

        memberNivLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchMember.add(memberNivLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 250, 30));

        refreshMemberBtn.setBackground(new java.awt.Color(255, 255, 255));
        refreshMemberBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        refreshMemberBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 124, 167), 2, true));
        refreshMemberBtn.setFocusPainted(false);
        refreshMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshMemberBtnActionPerformed(evt);
            }
        });
        searchMember.add(refreshMemberBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 580, 60, 60));

        memberSearchOption.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        memberSearchOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Name", "Search by NIC" }));
        memberSearchOption.setFocusable(false);
        memberSearchOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberSearchOptionActionPerformed(evt);
            }
        });
        searchMember.add(memberSearchOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 30));

        memberLoadOption.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        memberLoadOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Activated", "Deactivated" }));
        memberLoadOption.setFocusable(false);
        memberLoadOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberLoadOptionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                memberLoadOptionMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                memberLoadOptionMouseReleased(evt);
            }
        });
        memberLoadOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberLoadOptionActionPerformed(evt);
            }
        });
        searchMember.add(memberLoadOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 180, 30));

        parentPanel.add(searchMember, "card2");

        searchStaff.setBackground(new java.awt.Color(255, 255, 255));
        searchStaff.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        staffTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enroll No", "NIC", "Name", "Gender", "Job Role", "Entroll Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        staffTable.setOpaque(false);
        staffTable.setRowHeight(22);
        staffTable.setRowMargin(2);
        staffTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(staffTable);
        if (staffTable.getColumnModel().getColumnCount() > 0) {
            staffTable.getColumnModel().getColumn(0).setResizable(false);
            staffTable.getColumnModel().getColumn(0).setPreferredWidth(2);
            staffTable.getColumnModel().getColumn(1).setResizable(false);
            staffTable.getColumnModel().getColumn(1).setPreferredWidth(15);
            staffTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            staffTable.getColumnModel().getColumn(3).setResizable(false);
            staffTable.getColumnModel().getColumn(3).setPreferredWidth(2);
            staffTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        searchStaff.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 83, 1150, 370));

        typeSearch.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        typeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeSearchActionPerformed(evt);
            }
        });
        typeSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                typeSearchKeyReleased(evt);
            }
        });
        searchStaff.add(typeSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 330, 30));

        sortOptionCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sortOptionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Enroll No" }));
        sortOptionCombo.setFocusable(false);
        sortOptionCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortOptionComboActionPerformed(evt);
            }
        });
        searchStaff.add(sortOptionCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 180, 30));

        staffFeelbl.setBackground(new java.awt.Color(29, 124, 167));
        staffFeelbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        staffFeelbl.setForeground(new java.awt.Color(29, 124, 167));
        staffFeelbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        searchStaff.add(staffFeelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 470, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Sort By");
        searchStaff.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, 30));

        typeSearchCombo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        typeSearchCombo.setOpaque(false);
        searchStaff.add(typeSearchCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 350, 30));

        staffNiclbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchStaff.add(staffNiclbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 250, 30));

        staffAddressText.setColumns(20);
        staffAddressText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffAddressText.setRows(5);
        jScrollPane3.setViewportView(staffAddressText);

        searchStaff.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 360, 110));

        staffContactText.setColumns(20);
        staffContactText.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        staffContactText.setRows(5);
        jScrollPane4.setViewportView(staffContactText);

        searchStaff.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 320, 110));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Address");
        searchStaff.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 480, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Contact Number");
        searchStaff.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, -1, 30));

        staffNamelbl.setBackground(new java.awt.Color(29, 124, 167));
        staffNamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staffNamelbl.setForeground(new java.awt.Color(29, 124, 167));
        searchStaff.add(staffNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 400, 30));

        staffEnrolllbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchStaff.add(staffEnrolllbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 250, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Load Only");
        searchStaff.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, 30));

        loadOptionCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        loadOptionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Activated", "Deactivated" }));
        loadOptionCombo.setFocusable(false);
        loadOptionCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                loadOptionComboItemStateChanged(evt);
            }
        });
        loadOptionCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadOptionComboMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loadOptionComboMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loadOptionComboMouseReleased(evt);
            }
        });
        loadOptionCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadOptionComboActionPerformed(evt);
            }
        });
        searchStaff.add(loadOptionCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 180, 30));

        searchOptionCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchOptionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by Name", "Search by NIC" }));
        searchOptionCombo.setFocusable(false);
        searchOptionCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOptionComboActionPerformed(evt);
            }
        });
        searchStaff.add(searchOptionCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 30));

        refreshStaffDB.setBackground(new java.awt.Color(255, 255, 255));
        refreshStaffDB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/refresh.png"))); // NOI18N
        refreshStaffDB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 124, 167), 2, true));
        refreshStaffDB.setFocusPainted(false);
        refreshStaffDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshStaffDBActionPerformed(evt);
            }
        });
        searchStaff.add(refreshStaffDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 560, 60, 60));

        parentPanel.add(searchStaff, "card2");

        add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1206, 668));
    }// </editor-fold>//GEN-END:initComponents

    private void memberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberbtnActionPerformed

        unseletButton();
        memberbtn.setSelected(true);

        memberbtn.setBackground(Colors.defaultWhite);
        memberbtn.setForeground(Colors.defaultBlue);

        staffbtn.setBackground(Colors.defaultBlue);
        staffbtn.setForeground(Colors.defaultWhite);

        titleLabel.setText("Member Database      ");

        parentPanel.removeAll();
        parentPanel.add(searchMember);
        parentPanel.repaint();
        parentPanel.revalidate();
        parentPanel.setVisible(true);

    }//GEN-LAST:event_memberbtnActionPerformed

    private void staffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffbtnActionPerformed
        unseletButton();
        staffbtn.setSelected(true);

        staffbtn.setBackground(Colors.defaultWhite);
        staffbtn.setForeground(Colors.defaultBlue);

        memberbtn.setBackground(Colors.defaultBlue);
        memberbtn.setForeground(Colors.defaultWhite);

        titleLabel.setText("Staff Database      ");

        parentPanel.removeAll();
        parentPanel.add(searchStaff);
        parentPanel.repaint();
        parentPanel.revalidate();
        parentPanel.setVisible(true);
    }//GEN-LAST:event_staffbtnActionPerformed

    ResultSet selectedAllStaffSet;
    private void staffTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffTableMouseClicked
        if (evt.getClickCount() == 1) {
            if(staffTable.getSelectedRow() != -1){
            String staffid = staffTable.getValueAt(staffTable.getSelectedRow(), 0).toString();
            selectedAllStaffSet = StaffManagement.getSelectedAllStaff(staffid);

            setSelectedInfo(selectedAllStaffSet);
            }
        }

    }//GEN-LAST:event_staffTableMouseClicked
    int x = 0;
    int i = 0;
    private void typeSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typeSearchKeyReleased

        if (!typeSearch.getText().isEmpty()) {

            typeSearchCombo.showPopup();

            if (searchOptionCombo.getSelectedItem().toString().equalsIgnoreCase("Search by Name")) {

                loadStaffDBbyName(typeSearch.getText().trim().toLowerCase());

                if (typeSearchCombo.getItemCount() != 0) {
                    typeSearchCombo.showPopup();

                    int c = typeSearchCombo.getItemCount();
                    if (evt.getKeyCode() == 40) {
                        i++;
                        if (i == c) {
                            i = 0;
                        }
                        typeSearchCombo.setSelectedIndex(i);
                    }

                    if (evt.getKeyCode() == 38) {
                        i--;
                        if (i == -1) {
                            i = c - 1;
                        }
                        typeSearchCombo.setSelectedIndex(i);
                    }

                    if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                        typeSearchCombo.setSelectedIndex(i);
                        typeSearchCombo.hidePopup();
                        i = 0;
                        typeSearch.setText(typeSearchCombo.getSelectedItem().toString());

                        System.out.println(typeSearch.getText());
                        loadStaffDBName(typeSearch.getText());
                    }

                }

            } else {
                loadStaffDBbyNic(typeSearch.getText().trim().toLowerCase());

                if (typeSearchCombo.getItemCount() != 0) {
                    typeSearchCombo.showPopup();

                    int c = typeSearchCombo.getItemCount();
                    if (evt.getKeyCode() == 40) {
                        x++;
                        if (x == c) {
                            x = 0;
                        }
                        typeSearchCombo.setSelectedIndex(x);
                    }

                    if (evt.getKeyCode() == 38) {
                        x--;
                        if (x == -1) {
                            x = c - 1;
                        }
                        typeSearchCombo.setSelectedIndex(x);
                    }
                    if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                        typeSearchCombo.setSelectedIndex(x);
                        typeSearchCombo.hidePopup();
                        x = 0;
                        typeSearch.setText(typeSearchCombo.getSelectedItem().toString());

                        System.out.println(typeSearch.getText());
                        loadStaffDBNIC(typeSearch.getText());
                    }

                }
            }

        } else {
            typeSearchCombo.hidePopup();
            typeSearch.setText(null);
            loadStaffDB();
        }
    }//GEN-LAST:event_typeSearchKeyReleased

    private void loadOptionComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadOptionComboMouseClicked

    }//GEN-LAST:event_loadOptionComboMouseClicked

    private void loadOptionComboMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadOptionComboMouseEntered

    }//GEN-LAST:event_loadOptionComboMouseEntered

    private void loadOptionComboMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadOptionComboMouseReleased

    }//GEN-LAST:event_loadOptionComboMouseReleased

    private void loadOptionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadOptionComboActionPerformed
        typeSearch.setText(null);
//        searchOptionCombo.setSelectedIndex(0);
//        sortOptionCombo.setSelectedIndex(0);

        if (loadOptionCombo.getSelectedItem().toString().equals("All")) {
            loadStaffDB();
        } else if (loadOptionCombo.getSelectedItem().toString().equals("Activated")) {
            loadActivatedStaffDB();
        } else {
            loadDeactivatedStaffDB();
        }
    }//GEN-LAST:event_loadOptionComboActionPerformed

    private void sortOptionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortOptionComboActionPerformed
        typeSearch.setText(null);

        if (sortOptionCombo.getSelectedItem().toString().equals("Name")) {
            loadStaffSortedName();
        } else {
            loadStaffSortedNo();
        }

    }//GEN-LAST:event_sortOptionComboActionPerformed

    private void searchOptionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOptionComboActionPerformed

    }//GEN-LAST:event_searchOptionComboActionPerformed

    private void refreshStaffDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshStaffDBActionPerformed
        searchOptionCombo.setSelectedIndex(0);
        loadOptionCombo.setSelectedIndex(0);
        sortOptionCombo.setSelectedIndex(0);

        typeSearch.setText(null);
        staffContactText.setText(null);
        staffAddressText.setText(null);
        staffFeelbl.setText(null);
        staffNamelbl.setText(null);
        staffNiclbl.setText(null);
        staffEnrolllbl.setText(null);

        loadStaffDB();
    }//GEN-LAST:event_refreshStaffDBActionPerformed

    ResultSet rs_selmem;
    private void memberTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberTableMouseClicked
        try {
            rs_selmem = MemberManagement.getSelectedMember(memberTable.getValueAt(memberTable.getSelectedRow(), 0).toString());

            if (rs_selmem.next()) {
                memberAllName.setText(rs_selmem.getString("fullname"));
                memberEnrollLbl.setText(rs_selmem.getString("idmember"));
                memberNivLbl.setText(rs_selmem.getString("nic"));

                if (!rs_selmem.getString("contact2").toString().equals("")) {
                    memberContactText.setText(rs_selmem.getString("contact1") + "\n" + rs_selmem.getString("contact2"));
                } else {
                    memberContactText.setText(rs_selmem.getString("contact1"));
                }

                memberAddressText.setText(rs_selmem.getString("no") + ",\n" + rs_selmem.getString("street1") + ",\n" + rs_selmem.getString("street2") + ",\n" + rs_selmem.getString("city"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_memberTableMouseClicked

    private void memberSortOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberSortOptionActionPerformed
        memberSearchText.setText(null);

        if (memberSortOption.getSelectedItem().toString().equals("Name")) {
            loadMemberSortedName();
        } else {
            loadMemberSortedNo();
        }
    }//GEN-LAST:event_memberSortOptionActionPerformed
int y = 0;
int z = 0;
    private void memberSearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memberSearchTextKeyReleased

        if (!memberSearchText.getText().isEmpty()) {

            memberTypeSearchCombo.showPopup();

            if (memberSearchOption.getSelectedItem().toString().equalsIgnoreCase("Search by Name")) {

                loadMemberDBName(memberSearchText.getText().trim().toLowerCase());

                if (memberTypeSearchCombo.getItemCount() != 0) {
                    memberTypeSearchCombo.showPopup();

                    int c = memberTypeSearchCombo.getItemCount();
                    if (evt.getKeyCode() == 40) {
                        y++;
                        if (y == c) {
                            y = 0;
                        }
                        memberTypeSearchCombo.setSelectedIndex(y);
                    }

                    if (evt.getKeyCode() == 38) {
                        y--;
                        if (y == -1) {
                            y = c - 1;
                        }
                        memberTypeSearchCombo.setSelectedIndex(y);
                    }

                    if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                        memberTypeSearchCombo.setSelectedIndex(y);
                        memberTypeSearchCombo.hidePopup();
                        y = 0;
                        memberSearchText.setText(memberTypeSearchCombo.getSelectedItem().toString());

                        loadMemberDBName(memberSearchText.getText());
                    }

                }

            } else {
                loadMemberDBbyNic(memberSearchText.getText().trim().toLowerCase());

                if (memberTypeSearchCombo.getItemCount() != 0) {
                    memberTypeSearchCombo.showPopup();

                    int c = memberTypeSearchCombo.getItemCount();
                    if (evt.getKeyCode() == 40) {
                        z++;
                        if (z == c) {
                            z = 0;
                        }
                        memberTypeSearchCombo.setSelectedIndex(z);
                    }

                    if (evt.getKeyCode() == 38) {
                        z--;
                        if (z == -1) {
                            z = c - 1;
                        }
                        memberTypeSearchCombo.setSelectedIndex(z);
                    }
                    if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                        memberTypeSearchCombo.setSelectedIndex(z);
                        memberTypeSearchCombo.hidePopup();
                        z = 0;
                        memberSearchText.setText(memberTypeSearchCombo.getSelectedItem().toString());

                        System.out.println(memberSearchText.getText());
                        loadMemberDBbyNic(memberSearchText.getText());
                    }

                }
            }

        } else {
            memberTypeSearchCombo.hidePopup();
            memberSearchText.setText(null);
            loadMemberDB();
        }
    }//GEN-LAST:event_memberSearchTextKeyReleased

    private void refreshMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshMemberBtnActionPerformed
        memberSearchOption.setSelectedIndex(0);
        memberLoadOption.setSelectedIndex(0);
        memberSortOption.setSelectedIndex(0);

        memberSearchText.setText(null);
        memberContactText.setText(null);
        memberAddressText.setText(null);
        memberAllName.setText(null);
        memberEnrollLbl.setText(null);
        memberNivLbl.setText(null);

        loadMemberDB();
    }//GEN-LAST:event_refreshMemberBtnActionPerformed

    private void memberSearchOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberSearchOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberSearchOptionActionPerformed

    private void memberLoadOptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberLoadOptionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_memberLoadOptionMouseClicked

    private void memberLoadOptionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberLoadOptionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_memberLoadOptionMouseEntered

    private void memberLoadOptionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberLoadOptionMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_memberLoadOptionMouseReleased

    private void memberLoadOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberLoadOptionActionPerformed
        memberSearchText.setText(null);

        if (memberLoadOption.getSelectedItem().toString().equals("All")) {
            loadMemberDB();
        } else if (memberLoadOption.getSelectedItem().toString().equals("Activated")) {
            loadActivatedMemberDB();
        } else {
            loadDeactivatedMemberDB();
        }
    }//GEN-LAST:event_memberLoadOptionActionPerformed

    private void loadOptionComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_loadOptionComboItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_loadOptionComboItemStateChanged

    private void typeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JComboBox<String> loadOptionCombo;
    private javax.swing.JTextArea memberAddressText;
    private javax.swing.JLabel memberAllName;
    private javax.swing.JTextArea memberContactText;
    private javax.swing.JLabel memberEnrollLbl;
    private javax.swing.JLabel memberLbl;
    private javax.swing.JComboBox<String> memberLoadOption;
    private javax.swing.JLabel memberNivLbl;
    private javax.swing.JComboBox<String> memberSearchOption;
    private javax.swing.JTextField memberSearchText;
    private javax.swing.JComboBox<String> memberSortOption;
    private javax.swing.JTable memberTable;
    private javax.swing.JComboBox<String> memberTypeSearchCombo;
    private javax.swing.JToggleButton memberbtn;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JButton refreshMemberBtn;
    private javax.swing.JButton refreshStaffDB;
    private javax.swing.JPanel searchMember;
    private javax.swing.JComboBox<String> searchOptionCombo;
    private javax.swing.JPanel searchStaff;
    private javax.swing.JComboBox<String> sortOptionCombo;
    private javax.swing.JTextArea staffAddressText;
    private javax.swing.JTextArea staffContactText;
    private javax.swing.JLabel staffEnrolllbl;
    private javax.swing.JLabel staffFeelbl;
    private javax.swing.JLabel staffNamelbl;
    private javax.swing.JLabel staffNiclbl;
    private javax.swing.JTable staffTable;
    private javax.swing.JToggleButton staffbtn;
    private javax.swing.JPanel titleBar;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField typeSearch;
    private javax.swing.JComboBox<String> typeSearchCombo;
    // End of variables declaration//GEN-END:variables

    private void unseletButton() {
        memberbtn.setSelected(false);
        memberbtn.setBackground(Colors.defaultBlue);
        memberbtn.setForeground(Colors.defaultWhite);
        staffbtn.setSelected(false);
        staffbtn.setBackground(Colors.defaultBlue);
        staffbtn.setForeground(Colors.defaultWhite);
        memberbtn.setForeground(Colors.defaultWhite);
    }

    private static ResultSet allStaffSet;
    private static DefaultTableModel dtm;
    private static String access;

    public void loadStaffDB() {

        allStaffSet = StaffManagement.getAllStaff();
        dtm = (DefaultTableModel) staffTable.getModel();
        dtm.setRowCount(0);

        try {

            while (allStaffSet.next()) {

                Vector v = new Vector();

                v.add(allStaffSet.getString("idstaff"));
                v.add(allStaffSet.getString("nic"));
                v.add(allStaffSet.getString("fname") + " " + allStaffSet.getString("mname") + " " + allStaffSet.getString("lname"));
                v.add(allStaffSet.getString("gender"));
                v.add(allStaffSet.getString("jobrole"));

                v.add(allStaffSet.getString("date"));

                dtm.addRow(v);
            }

            staffTable.setDefaultRenderer(Object.class, new StaffTableCellRender());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private static ResultSet allMemberSet;
    private static DefaultTableModel dtm_mem;
    private static String access_mem;

    public void loadMemberDB() {

        allMemberSet = MemberManagement.getAllMember();
        dtm_mem = (DefaultTableModel) memberTable.getModel();
        dtm_mem.setRowCount(0);

        try {

            while (allMemberSet.next()) {

                Vector v = new Vector();

                v.add(allMemberSet.getString("idmember"));
                v.add(allMemberSet.getString("nic"));
                v.add(allMemberSet.getString("fullname"));
                v.add(allMemberSet.getString("gender"));
                v.add(allMemberSet.getString("dob"));
                v.add(allMemberSet.getString("packagename"));
                v.add(allMemberSet.getString("date"));

                dtm_mem.addRow(v);
            }
        memberTable.setDefaultRenderer(Object.class, new MemberTableCellRender());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadActivatedStaffDB() {

        allStaffSet = StaffManagement.getAllActivatedStaff();
        dtm = (DefaultTableModel) staffTable.getModel();
        dtm.setRowCount(0);

        try {

            while (allStaffSet.next()) {

                Vector v = new Vector();

                v.add(allStaffSet.getString("idstaff"));
                v.add(allStaffSet.getString("nic"));
                v.add(allStaffSet.getString("fname") + " " + allStaffSet.getString("mname") + " " + allStaffSet.getString("lname"));
                v.add(allStaffSet.getString("gender"));
                v.add(allStaffSet.getString("jobrole"));

                v.add(allStaffSet.getString("date"));

                dtm.addRow(v);
            }
            staffTable.setDefaultRenderer(Object.class, new StaffTableCellRender());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadActivatedMemberDB() {

        allMemberSet = MemberManagement.getAllActivatedMember();
        dtm_mem = (DefaultTableModel) memberTable.getModel();
        dtm_mem.setRowCount(0);

        try {

            while (allMemberSet.next()) {

                Vector v = new Vector();

                v.add(allMemberSet.getString("idmember"));
                v.add(allMemberSet.getString("nic"));
                v.add(allMemberSet.getString("fname") + " " + allMemberSet.getString("mname") + " " + allMemberSet.getString("lname"));
                v.add(allMemberSet.getString("gender"));
                v.add(allMemberSet.getString("dob"));
                v.add(allMemberSet.getString("packagename"));
                v.add(allMemberSet.getString("date"));

                dtm_mem.addRow(v);
            }
      memberTable.setDefaultRenderer(Object.class, new MemberTableCellRender());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadDeactivatedStaffDB() {

        allStaffSet = StaffManagement.getAllDeactivatedStaff();
        dtm = (DefaultTableModel) staffTable.getModel();
        dtm.setRowCount(0);

        try {

            while (allStaffSet.next()) {

                Vector v = new Vector();

                v.add(allStaffSet.getString("idstaff"));
                v.add(allStaffSet.getString("nic"));
                v.add(allStaffSet.getString("fname") + " " + allStaffSet.getString("mname") + " " + allStaffSet.getString("lname"));
                v.add(allStaffSet.getString("gender"));
                v.add(allStaffSet.getString("jobrole"));

                v.add(allStaffSet.getString("date"));

                dtm.addRow(v);
            }
            staffTable.setDefaultRenderer(Object.class, new StaffTableCellRender());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadDeactivatedMemberDB() {

        allMemberSet = MemberManagement.getAllDeactivatedMember();
        dtm_mem = (DefaultTableModel) memberTable.getModel();
        dtm_mem.setRowCount(0);

        try {

            while (allMemberSet.next()) {

                Vector v = new Vector();

                v.add(allMemberSet.getString("idmember"));
                v.add(allMemberSet.getString("nic"));
                v.add(allMemberSet.getString("fname") + " " + allMemberSet.getString("mname") + " " + allMemberSet.getString("lname"));
                v.add(allMemberSet.getString("gender"));
                v.add(allMemberSet.getString("dob"));
                v.add(allMemberSet.getString("packagename"));
                v.add(allMemberSet.getString("date"));

                dtm_mem.addRow(v);
            }
      memberTable.setDefaultRenderer(Object.class, new MemberTableCellRender());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadStaffSortedName() {

        allStaffSet = StaffManagement.getStaffSortName();
        dtm = (DefaultTableModel) staffTable.getModel();
        dtm.setRowCount(0);

        try {

            while (allStaffSet.next()) {

                Vector v = new Vector();

                v.add(allStaffSet.getString("idstaff"));
                v.add(allStaffSet.getString("nic"));
                v.add(allStaffSet.getString("fname") + " " + allStaffSet.getString("mname") + " " + allStaffSet.getString("lname"));
                v.add(allStaffSet.getString("gender"));
                v.add(allStaffSet.getString("jobrole"));

                v.add(allStaffSet.getString("date"));

                dtm.addRow(v);
            }
            
                   staffTable.setDefaultRenderer(Object.class, new StaffTableCellRender());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadMemberSortedName() {

        allMemberSet = MemberManagement.getMemberSortName();
        dtm_mem = (DefaultTableModel) memberTable.getModel();
        dtm_mem.setRowCount(0);

        try {

            while (allMemberSet.next()) {

                Vector v = new Vector();

                v.add(allMemberSet.getString("idmember"));
                v.add(allMemberSet.getString("nic"));
                v.add(allMemberSet.getString("fullname"));
                v.add(allMemberSet.getString("gender"));
                v.add(allMemberSet.getString("dob"));
                v.add(allMemberSet.getString("packagename"));
                v.add(allMemberSet.getString("date"));

                dtm_mem.addRow(v);
            }
      memberTable.setDefaultRenderer(Object.class, new MemberTableCellRender());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadStaffSortedNo() {

        allStaffSet = StaffManagement.getStaffSortNo();
        dtm = (DefaultTableModel) staffTable.getModel();
        dtm.setRowCount(0);

        try {

            while (allStaffSet.next()) {

                Vector v = new Vector();

                v.add(allStaffSet.getString("idstaff"));
                v.add(allStaffSet.getString("nic"));
                v.add(allStaffSet.getString("fname") + " " + allStaffSet.getString("mname") + " " + allStaffSet.getString("lname"));
                v.add(allStaffSet.getString("gender"));
                v.add(allStaffSet.getString("jobrole"));

                v.add(allStaffSet.getString("date"));

                dtm.addRow(v);
            }
       staffTable.setDefaultRenderer(Object.class, new StaffTableCellRender());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadMemberSortedNo() {

        allMemberSet = MemberManagement.getMemberSortNo();
        dtm_mem = (DefaultTableModel) memberTable.getModel();
        dtm_mem.setRowCount(0);

        try {

            while (allMemberSet.next()) {

                Vector v = new Vector();

                v.add(allMemberSet.getString("idmember"));
                v.add(allMemberSet.getString("nic"));
                v.add(allMemberSet.getString("fullname"));
                v.add(allMemberSet.getString("gender"));
                v.add(allMemberSet.getString("dob"));
                v.add(allMemberSet.getString("packagename"));
                v.add(allMemberSet.getString("date"));

                dtm_mem.addRow(v);
            }
      memberTable.setDefaultRenderer(Object.class, new MemberTableCellRender());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadStaffDBName(String selectedName) {

        allStaffSet = StaffManagement.getSelectedStaffByName(selectedName);
        dtm = (DefaultTableModel) staffTable.getModel();
        dtm.setRowCount(0);

        try {

            while (allStaffSet.next()) {

                Vector v = new Vector();

                v.add(allStaffSet.getString("idstaff"));
                v.add(allStaffSet.getString("nic"));
                v.add(allStaffSet.getString("fname") + " " + allStaffSet.getString("mname") + " " + allStaffSet.getString("lname"));
                v.add(allStaffSet.getString("gender"));
                v.add(allStaffSet.getString("jobrole"));

                v.add(allStaffSet.getString("date"));

                dtm.addRow(v);
            }
            
                   staffTable.setDefaultRenderer(Object.class, new StaffTableCellRender());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadMemberDBName(String selectedName) {

        allMemberSet = MemberManagement.getSelectedMemberByName(selectedName);
        dtm_mem = (DefaultTableModel) memberTable.getModel();
        dtm_mem.setRowCount(0);

        Vector nameVector = new Vector();

        try {

            while (allMemberSet.next()) {
                System.out.println("allmemberset");

                Vector v = new Vector();

                v.add(allMemberSet.getString("idmember"));
                v.add(allMemberSet.getString("nic"));
                v.add(allMemberSet.getString("fname") + " " + allMemberSet.getString("mname") + " " + allMemberSet.getString("lname"));
                nameVector.add(allMemberSet.getString("fname") + " " + allMemberSet.getString("mname") + " " + allMemberSet.getString("lname"));
                v.add(allMemberSet.getString("gender"));
                v.add(allMemberSet.getString("dob"));
                v.add(allMemberSet.getString("packagename"));
                v.add(allMemberSet.getString("date"));

                dtm_mem.addRow(v);
            }
      memberTable.setDefaultRenderer(Object.class, new MemberTableCellRender());
            DefaultComboBoxModel dcb = new DefaultComboBoxModel(nameVector);
            memberTypeSearchCombo.setModel(dcb);
            memberTypeSearchCombo.showPopup();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadStaffDBNIC(String staffNic) {

        System.out.println(staffNic);
        allStaffSet = StaffManagement.getSelectedStaffByNic(staffNic);
        dtm = (DefaultTableModel) staffTable.getModel();
        dtm.setRowCount(0);

        try {

            while (allStaffSet.next()) {

                Vector v = new Vector();

                v.add(allStaffSet.getString("idstaff"));
                v.add(allStaffSet.getString("nic"));
                v.add(allStaffSet.getString("fname") + " " + allStaffSet.getString("mname") + " " + allStaffSet.getString("lname"));
                v.add(allStaffSet.getString("gender"));
                v.add(allStaffSet.getString("jobrole"));

                v.add(allStaffSet.getString("date"));

                dtm.addRow(v);
            }
            
                   staffTable.setDefaultRenderer(Object.class, new StaffTableCellRender());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadStaffDBbyName(String typingName) {

        allStaffSet = StaffManagement.getSelectedAllStaffName(typingName);
        dtm = (DefaultTableModel) staffTable.getModel();
        dtm.setRowCount(0);

        Vector nameVector = new Vector();

        try {

            while (allStaffSet.next()) {

                Vector v = new Vector();
                System.out.println(allStaffSet.getString("idstaff"));
                v.add(allStaffSet.getString("idstaff"));
                v.add(allStaffSet.getString("nic"));
                v.add(allStaffSet.getString("fname") + " " + allStaffSet.getString("mname") + " " + allStaffSet.getString("lname"));
                nameVector.add(allStaffSet.getString("fname") + " " + allStaffSet.getString("mname") + " " + allStaffSet.getString("lname"));
                v.add(allStaffSet.getString("gender"));
                v.add(allStaffSet.getString("jobrole"));

                v.add(allStaffSet.getString("date"));

                dtm.addRow(v);
            }

            DefaultComboBoxModel dcb = new DefaultComboBoxModel(nameVector);
            typeSearchCombo.setModel(dcb);
            typeSearchCombo.showPopup();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadStaffDBbyNic(String typingNic) {

        allStaffSet = StaffManagement.getSelectedAllStaffNic(typingNic);
        dtm = (DefaultTableModel) staffTable.getModel();
        dtm.setRowCount(0);

        Vector nicVector = new Vector();

        try {

            while (allStaffSet.next()) {

                Vector v = new Vector();

                v.add(allStaffSet.getString("idstaff"));
                v.add(allStaffSet.getString("nic"));
                nicVector.add(allStaffSet.getString("nic"));
                v.add(allStaffSet.getString("fname") + " " + allStaffSet.getString("mname") + " " + allStaffSet.getString("lname"));
                v.add(allStaffSet.getString("gender"));
                v.add(allStaffSet.getString("jobrole"));

                v.add(allStaffSet.getString("date"));

                dtm.addRow(v);
            }

            DefaultComboBoxModel dcb = new DefaultComboBoxModel(nicVector);
            typeSearchCombo.setModel(dcb);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void loadMemberDBbyNic(String typingNic) {

        allMemberSet = MemberManagement.getSelectedAllMemberNic(typingNic);
        dtm_mem = (DefaultTableModel) memberTable.getModel();
        dtm_mem.setRowCount(0);

        Vector nicVector = new Vector();

        try {

            while (allMemberSet.next()) {

                Vector v = new Vector();

                v.add(allMemberSet.getString("idmember"));
                v.add(allMemberSet.getString("nic"));
                nicVector.add(allMemberSet.getString("nic"));
                v.add(allMemberSet.getString("fname") + " " + allMemberSet.getString("mname") + " " + allMemberSet.getString("lname"));
                v.add(allMemberSet.getString("gender"));
                v.add(allMemberSet.getString("packagename"));
                v.add(allMemberSet.getString("date"));

                dtm_mem.addRow(v);
            }
      memberTable.setDefaultRenderer(Object.class, new MemberTableCellRender());
            DefaultComboBoxModel dcb = new DefaultComboBoxModel(nicVector);
            memberTypeSearchCombo.setModel(dcb);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setSelectedInfo(ResultSet selectedInfo) {
        try {
            if (selectedInfo.next()) {
                staffNamelbl.setText(selectedInfo.getString("fname") + " " + selectedInfo.getString("mname") + " " + selectedInfo.getString("lname"));
                staffEnrolllbl.setText(selectedInfo.getString("idstaff"));
                staffNiclbl.setText(selectedInfo.getString("nic"));

                if (!selectedInfo.getString("contact2").toString().equals("")) {
                    staffContactText.setText(selectedInfo.getString("contact1") + "\n" + selectedInfo.getString("contact2"));
                } else {
                    staffContactText.setText(selectedInfo.getString("contact1"));
                }

                staffAddressText.setText(selectedInfo.getString("no") + ",\n" + selectedInfo.getString("street1") + ",\n" + selectedInfo.getString("street2") + ",\n" + selectedInfo.getString("city"));

                staffFeelbl.setText(selectedInfo.getString("fee"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}

class StaffTableCellRender extends DefaultTableCellRenderer {

    public StaffTableCellRender() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            c.setFont(new java.awt.Font("Tahoma", 0, 16));
        try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();

            if (StaffManagement.isStaffActive((String) dtm.getValueAt(row, 0))) {
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

class MemberTableCellRender extends DefaultTableCellRenderer {

    public MemberTableCellRender() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
             c.setFont(new java.awt.Font("Tahoma", 0, 16));
        try {
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();

            if (MemberManagement.isMemberActive((String) dtm.getValueAt(row, 0))) {
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
