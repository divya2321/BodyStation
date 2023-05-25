package GUI;

import java.awt.Color;


public class AttendencePanel extends javax.swing.JPanel {

    
    Color background = new Color(153,153,153);
    Color unselectedColor = new Color(51, 51, 51);
    
    public AttendencePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleBar = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        staffbtn = new javax.swing.JToggleButton();
        memberbtn = new javax.swing.JToggleButton();
        staffbtn1 = new javax.swing.JToggleButton();
        parentPanel = new javax.swing.JPanel();
        staffRegistration = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleBar.setBackground(new java.awt.Color(51, 51, 51));
        titleBar.setFocusable(false);
        titleBar.setPreferredSize(new java.awt.Dimension(1206, 740));
        titleBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleLabel.setText("... Attendence");
        titleBar.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 230, 40));

        staffbtn.setBackground(new java.awt.Color(51, 51, 51));
        staffbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffbtn.setForeground(new java.awt.Color(255, 255, 255));
        staffbtn.setText("All");
        staffbtn.setBorderPainted(false);
        staffbtn.setContentAreaFilled(false);
        staffbtn.setFocusPainted(false);
        staffbtn.setOpaque(true);
        staffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffbtnActionPerformed(evt);
            }
        });
        titleBar.add(staffbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 130, 40));

        memberbtn.setBackground(new java.awt.Color(51, 51, 51));
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

        staffbtn1.setBackground(new java.awt.Color(51, 51, 51));
        staffbtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffbtn1.setForeground(new java.awt.Color(255, 255, 255));
        staffbtn1.setText("Staff");
        staffbtn1.setBorderPainted(false);
        staffbtn1.setContentAreaFilled(false);
        staffbtn1.setFocusPainted(false);
        staffbtn1.setOpaque(true);
        staffbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffbtn1ActionPerformed(evt);
            }
        });
        titleBar.add(staffbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 130, 40));

        jPanel1.add(titleBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1206, 40));

        parentPanel.setLayout(new java.awt.CardLayout());

        staffRegistration.setBackground(new java.awt.Color(153, 153, 153));
        staffRegistration.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Card No", "In Time", "Out Time", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        staffRegistration.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 1130, 480));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        staffRegistration.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 210, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        staffRegistration.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 40, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Amount");
        staffRegistration.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 610, 210, 40));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search by NIC", "Search by Card No" }));
        staffRegistration.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 160, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Today");
        staffRegistration.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 180, 30));

        dateChooserCombo1.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 14));
        staffRegistration.add(dateChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, 210, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Search by Date");
        staffRegistration.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(814, 50, 130, 30));

        parentPanel.add(staffRegistration, "card3");

        jPanel1.add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1206, 668));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void staffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffbtnActionPerformed
//        unseletButton();
        staffbtn.setSelected(true);
        staffbtn.setBackground(background);

        parentPanel.removeAll();
        parentPanel.add(staffRegistration);
        parentPanel.repaint();
        parentPanel.revalidate();
        parentPanel.setVisible(true);
    }//GEN-LAST:event_staffbtnActionPerformed

    private void memberbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberbtnActionPerformed

//        unseletButton();
        memberbtn.setSelected(true);
        memberbtn.setBackground(background);


    }//GEN-LAST:event_memberbtnActionPerformed

    private void staffbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffbtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton memberbtn;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPanel staffRegistration;
    private javax.swing.JToggleButton staffbtn;
    private javax.swing.JToggleButton staffbtn1;
    private javax.swing.JPanel titleBar;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
