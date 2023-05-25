package GUI;

import Database.Tables.MemberManagement;
import java.awt.Image;
import javax.swing.ImageIcon;

public class dashboardPanel extends javax.swing.JPanel {

    private static dashboardPanel instance;

    public dashboardPanel() {
        initComponents();
        setAllMemCount();
    }


    public void setAllMemCount() {
        allMemCount.setText(String.valueOf(MemberManagement.getAllMemCount()));
        activeMemCount.setText(String.valueOf(MemberManagement.getAllActMemCount()));
        deactiveMemCount.setText(String.valueOf(MemberManagement.getAllDeactMemCount()));
    }


    public static dashboardPanel getInstance() {
        if (instance == null) {
            instance = new dashboardPanel();
        }
        return instance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        parentdashboardPanel = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        paymentButton = new javax.swing.JToggleButton();
        dueButton = new javax.swing.JToggleButton();
        deactiveMemCount = new javax.swing.JToggleButton();
        specialnoteButton1 = new javax.swing.JToggleButton();
        specialnoteButton2 = new javax.swing.JToggleButton();
        allMemCount = new javax.swing.JToggleButton();
        activeMemCount = new javax.swing.JToggleButton();
        specialnoteButton3 = new javax.swing.JToggleButton();
        specialnoteButton4 = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1206, 740));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        parentdashboardPanel.setBackground(new java.awt.Color(255, 255, 255));
        parentdashboardPanel.setLayout(new java.awt.CardLayout());

        dashboardPanel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardPanel.setPreferredSize(new java.awt.Dimension(1206, 740));
        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymentButton.setBackground(new java.awt.Color(29, 124, 167));
        paymentButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paymentButton.setForeground(new java.awt.Color(255, 255, 255));
        paymentButton.setText("Deactive Member Count : ");
        paymentButton.setContentAreaFilled(false);
        paymentButton.setFocusPainted(false);
        paymentButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        paymentButton.setOpaque(true);
        dashboardPanel.add(paymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 270, 60));

        dueButton.setBackground(new java.awt.Color(29, 124, 167));
        dueButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dueButton.setForeground(new java.awt.Color(255, 255, 255));
        dueButton.setText("Active Member Count : ");
        dueButton.setContentAreaFilled(false);
        dueButton.setFocusPainted(false);
        dueButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        dueButton.setOpaque(true);
        dashboardPanel.add(dueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 270, 60));

        deactiveMemCount.setBackground(new java.awt.Color(255, 0, 0));
        deactiveMemCount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deactiveMemCount.setForeground(new java.awt.Color(255, 0, 0));
        deactiveMemCount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        deactiveMemCount.setContentAreaFilled(false);
        deactiveMemCount.setFocusPainted(false);
        deactiveMemCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dashboardPanel.add(deactiveMemCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 160, 130, 60));

        specialnoteButton1.setBackground(new java.awt.Color(29, 124, 167));
        specialnoteButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        specialnoteButton1.setForeground(new java.awt.Color(255, 255, 255));
        specialnoteButton1.setText("All Member Count : ");
        specialnoteButton1.setContentAreaFilled(false);
        specialnoteButton1.setFocusPainted(false);
        specialnoteButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        specialnoteButton1.setOpaque(true);
        dashboardPanel.add(specialnoteButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 270, 60));

        specialnoteButton2.setBackground(new java.awt.Color(29, 120, 160));
        specialnoteButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        specialnoteButton2.setForeground(new java.awt.Color(255, 255, 255));
        specialnoteButton2.setText("Dutodu");
        specialnoteButton2.setContentAreaFilled(false);
        specialnoteButton2.setFocusPainted(false);
        specialnoteButton2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        specialnoteButton2.setOpaque(true);
        dashboardPanel.add(specialnoteButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 630, 240, 30));

        allMemCount.setBackground(new java.awt.Color(29, 124, 167));
        allMemCount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        allMemCount.setForeground(new java.awt.Color(29, 124, 167));
        allMemCount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        allMemCount.setContentAreaFilled(false);
        allMemCount.setFocusPainted(false);
        allMemCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dashboardPanel.add(allMemCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 130, 60));

        activeMemCount.setBackground(new java.awt.Color(29, 124, 167));
        activeMemCount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        activeMemCount.setForeground(new java.awt.Color(29, 124, 167));
        activeMemCount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        activeMemCount.setContentAreaFilled(false);
        activeMemCount.setFocusPainted(false);
        activeMemCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dashboardPanel.add(activeMemCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 90, 130, 60));

        specialnoteButton3.setBackground(new java.awt.Color(29, 110, 140));
        specialnoteButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        specialnoteButton3.setForeground(new java.awt.Color(255, 255, 255));
        specialnoteButton3.setText("0778221800");
        specialnoteButton3.setContentAreaFilled(false);
        specialnoteButton3.setFocusPainted(false);
        specialnoteButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        specialnoteButton3.setOpaque(true);
        dashboardPanel.add(specialnoteButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 660, 240, 30));

        specialnoteButton4.setBackground(new java.awt.Color(29, 124, 167));
        specialnoteButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        specialnoteButton4.setForeground(new java.awt.Color(255, 255, 255));
        specialnoteButton4.setText("Developed by:");
        specialnoteButton4.setContentAreaFilled(false);
        specialnoteButton4.setFocusPainted(false);
        specialnoteButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        specialnoteButton4.setOpaque(true);
        dashboardPanel.add(specialnoteButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 600, 240, 30));

        parentdashboardPanel.add(dashboardPanel, "card2");

        add(parentdashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1670, 748));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton activeMemCount;
    private javax.swing.JToggleButton allMemCount;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JToggleButton deactiveMemCount;
    private javax.swing.JToggleButton dueButton;
    private javax.swing.JPanel parentdashboardPanel;
    private javax.swing.JToggleButton paymentButton;
    private javax.swing.JToggleButton specialnoteButton1;
    private javax.swing.JToggleButton specialnoteButton2;
    private javax.swing.JToggleButton specialnoteButton3;
    private javax.swing.JToggleButton specialnoteButton4;
    // End of variables declaration//GEN-END:variables

    public void unseletButton() {
        paymentButton.setSelected(false);
        dueButton.setSelected(false);
        deactiveMemCount.setSelected(false);
    }
}
