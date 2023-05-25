package GUI;

import Classes.Colors;
import Database.Beans.InvoiceModel;
import Database.Beans.PaymentInvoiceModel;
import Database.Beans.SupplimentInvoiceModel;
import Database.DB;
import Database.Tables.InvoiceManagement;
import Database.Tables.MemberManagement;
import Database.Tables.StaffManagement;
import Database.Tables.StockManagement;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author divsi
 */
public class InvoicePanel extends javax.swing.JPanel {

    /**
     * Creates new form InvoicePanel
     */
    public InvoicePanel() {
        initComponents();

        payInvBtn.setBackground(Colors.defaultWhite);
        payInvBtn.setForeground(Colors.defaultBlue);

        packagePanel.removeAll();
        packagePanel.add(supInvPanel);
        packagePanel.repaint();
        packagePanel.revalidate();
        packagePanel.setVisible(true);

        payInvPay.setEnabled(false);

        setPayInvId();

        loadSupInvCombo();

        loadSupInvoice(InvoiceManagement.getAllSupInvoice());
        loadPayInv(InvoiceManagement.getAllPayInvoice());

        supInvRadio.setSelected(true);
    }

    public void setPayInvId() {
        payInvId.setText(String.valueOf(InvoiceManagement.getPayInvId()));
        supInvId.setText(String.valueOf(InvoiceManagement.getPayInvId()));
    }

    public void setSupInvId() {
    }

    private static InvoicePanel instance;

    public static InvoicePanel getInstance() {
        if (instance == null) {
            instance = new InvoicePanel();
        }
        return instance;
    }

    public void unselectButton() {
        supInvBtn.setBackground(Colors.defaultBlue);
        supInvBtn.setForeground(Colors.defaultWhite);

        payInvBtn.setBackground(Colors.defaultBlue);
        payInvBtn.setForeground(Colors.defaultWhite);

        viewInvBtn.setBackground(Colors.defaultBlue);
        viewInvBtn.setForeground(Colors.defaultWhite);
    }

    public void setBuyerName() {

    }

    ResultSet rs_supName;

    public void loadSupInvCombo() {
        try {
            rs_supName = InvoiceManagement.getAllAVailableSuppliments();

            Vector v = new Vector();
            while (rs_supName.next()) {
                v.add(rs_supName.getString("fullsup"));
            }
            DefaultComboBoxModel dcm = new DefaultComboBoxModel(v);
            supInvSupCombo.setModel(dcm);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        supInvBtn = new javax.swing.JButton();
        payInvBtn = new javax.swing.JButton();
        viewInvBtn = new javax.swing.JButton();
        packagePanel = new javax.swing.JPanel();
        supInvPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        payInvPayType = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        payInvId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        payInvNic = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        payInvFrom = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        payInvTo = new com.toedter.calendar.JDateChooser();
        payInvPack = new javax.swing.JLabel();
        payInvName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        payInvCalAmount = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        payInvTable = new javax.swing.JTable();
        payInvPay = new javax.swing.JButton();
        payInfRefrsh = new javax.swing.JButton();
        payLBL = new javax.swing.JLabel();
        payInvBalance = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        payInvCash = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        payInvAmount = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        payInvPanel = new javax.swing.JPanel();
        removeInvItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        supInvTable = new javax.swing.JTable();
        subTotal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        supInvDis = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        netTotal = new javax.swing.JTextField();
        supInvDisCombo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        supInvId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        supInvNic = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        supInvName = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        supInvSupName = new javax.swing.JTextField();
        supInvSupCombo = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        supInvPrice = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        supInvQty = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        supInvAmount = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        supInvDiscount = new javax.swing.JTextField();
        supInvAdd = new javax.swing.JButton();
        supInvPay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cancelInv = new javax.swing.JButton();
        viewInvPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        insidePanel = new javax.swing.JPanel();
        supplimentInvoice = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        supDetailTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        supInv = new javax.swing.JTable();
        paymentInvoice = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        payInv = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        invId = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        invTo = new com.toedter.calendar.JDateChooser();
        invFrom = new com.toedter.calendar.JDateChooser();
        searchbtn = new javax.swing.JButton();
        searchByInvId = new javax.swing.JButton();
        searchByDate = new javax.swing.JButton();
        nicSearch = new javax.swing.JTextField();
        searchByNic = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        payInvRadio = new javax.swing.JRadioButton();
        supInvRadio = new javax.swing.JRadioButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(29, 124, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supInvBtn.setBackground(new java.awt.Color(29, 124, 167));
        supInvBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supInvBtn.setForeground(new java.awt.Color(255, 255, 255));
        supInvBtn.setText("Suppliment Invoice");
        buttonGroup1.add(supInvBtn);
        supInvBtn.setContentAreaFilled(false);
        supInvBtn.setFocusPainted(false);
        supInvBtn.setOpaque(true);
        supInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supInvBtnActionPerformed(evt);
            }
        });
        jPanel1.add(supInvBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 190, 50));

        payInvBtn.setBackground(new java.awt.Color(29, 124, 167));
        payInvBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        payInvBtn.setForeground(new java.awt.Color(255, 255, 255));
        payInvBtn.setText("Payment Invoice");
        buttonGroup1.add(payInvBtn);
        payInvBtn.setContentAreaFilled(false);
        payInvBtn.setFocusPainted(false);
        payInvBtn.setOpaque(true);
        payInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payInvBtnActionPerformed(evt);
            }
        });
        jPanel1.add(payInvBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));

        viewInvBtn.setBackground(new java.awt.Color(29, 124, 167));
        viewInvBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewInvBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewInvBtn.setText("View Invoice");
        buttonGroup1.add(viewInvBtn);
        viewInvBtn.setContentAreaFilled(false);
        viewInvBtn.setFocusPainted(false);
        viewInvBtn.setOpaque(true);
        viewInvBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewInvBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 200, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 50));

        packagePanel.setBackground(new java.awt.Color(255, 255, 255));
        packagePanel.setLayout(new java.awt.CardLayout());

        supInvPanel.setBackground(new java.awt.Color(255, 255, 255));
        supInvPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Invoice Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(29, 124, 167))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payInvPayType.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        payInvPayType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Payment Type", "Monthly", "03 Month", "06 Month", "Annually" }));
        payInvPayType.setFocusable(false);
        payInvPayType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                payInvPayTypeItemStateChanged(evt);
            }
        });
        payInvPayType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payInvPayTypeActionPerformed(evt);
            }
        });
        payInvPayType.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                payInvPayTypePropertyChange(evt);
            }
        });
        jPanel5.add(payInvPayType, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 190, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Invoice No");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 30));

        payInvId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(payInvId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("NIC ");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 110, 30));

        payInvNic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        payInvNic.setBorder(null);
        payInvNic.setOpaque(false);
        payInvNic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                payInvNicFocusLost(evt);
            }
        });
        payInvNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payInvNicActionPerformed(evt);
            }
        });
        payInvNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                payInvNicKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                payInvNicKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                payInvNicKeyTyped(evt);
            }
        });
        jPanel5.add(payInvNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 200, 30));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 200, 10));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Name");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 300, 30));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 390, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("From");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 50, 30));

        payInvFrom.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel5.add(payInvFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 170, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("To");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 30, 30));

        payInvTo.setEnabled(false);
        payInvTo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel5.add(payInvTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 170, 30));

        payInvPack.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        payInvPack.setForeground(new java.awt.Color(29, 124, 167));
        payInvPack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payInvPack.setText("Package Name");
        jPanel5.add(payInvPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 260, 30));

        payInvName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        payInvName.setBorder(null);
        payInvName.setOpaque(false);
        payInvName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                payInvNameFocusLost(evt);
            }
        });
        payInvName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payInvNameActionPerformed(evt);
            }
        });
        payInvName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                payInvNameKeyTyped(evt);
            }
        });
        jPanel5.add(payInvName, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 390, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Type");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 30));

        payInvCalAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        payInvCalAmount.setForeground(new java.awt.Color(29, 124, 167));
        payInvCalAmount.setText("Calculate Amount");
        payInvCalAmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 1, true));
        payInvCalAmount.setContentAreaFilled(false);
        payInvCalAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payInvCalAmountActionPerformed(evt);
            }
        });
        jPanel5.add(payInvCalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 110, 140, 30));

        supInvPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 1160, 170));

        payInvTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        payInvTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        payInvTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "Amount", "Duration", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        payInvTable.setGridColor(new java.awt.Color(29, 124, 167));
        payInvTable.setRowHeight(20);
        payInvTable.setSelectionBackground(new java.awt.Color(29, 124, 167));
        payInvTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payInvTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(payInvTable);

        supInvPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 840, 400));

        payInvPay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        payInvPay.setForeground(new java.awt.Color(255, 255, 255));
        payInvPay.setText("PAY");
        payInvPay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        payInvPay.setContentAreaFilled(false);
        payInvPay.setFocusPainted(false);
        payInvPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payInvPayActionPerformed(evt);
            }
        });
        supInvPanel.add(payInvPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 400, 140, 50));

        payInfRefrsh.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        payInfRefrsh.setForeground(new java.awt.Color(29, 124, 167));
        payInfRefrsh.setText("Refresh");
        payInfRefrsh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        payInfRefrsh.setContentAreaFilled(false);
        payInfRefrsh.setFocusPainted(false);
        payInfRefrsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payInfRefrshActionPerformed(evt);
            }
        });
        supInvPanel.add(payInfRefrsh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 550, 180, 50));

        payLBL.setBackground(new java.awt.Color(29, 124, 167));
        payLBL.setOpaque(true);
        supInvPanel.add(payLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 400, 140, 50));

        payInvBalance.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supInvPanel.add(payInvBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, 230, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Balance");
        supInvPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 70, 50));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setText("Cash");
        supInvPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 70, 50));

        payInvCash.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        payInvCash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                payInvCashKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                payInvCashKeyTyped(evt);
            }
        });
        supInvPanel.add(payInvCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 230, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Amount");
        supInvPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 190, 70, 30));

        payInvAmount.setEditable(false);
        payInvAmount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        payInvAmount.setForeground(new java.awt.Color(29, 124, 167));
        payInvAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        payInvAmount.setBorder(null);
        payInvAmount.setOpaque(false);
        payInvAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                payInvAmountFocusLost(evt);
            }
        });
        payInvAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payInvAmountActionPerformed(evt);
            }
        });
        payInvAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                payInvAmountKeyTyped(evt);
            }
        });
        supInvPanel.add(payInvAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, 160, 40));
        supInvPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 160, 10));

        packagePanel.add(supInvPanel, "card5");

        payInvPanel.setBackground(new java.awt.Color(255, 255, 255));
        payInvPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        removeInvItem.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        removeInvItem.setForeground(new java.awt.Color(0, 255, 0));
        removeInvItem.setText("Remove Item");
        removeInvItem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 2, true));
        removeInvItem.setContentAreaFilled(false);
        removeInvItem.setFocusPainted(false);
        removeInvItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeInvItemActionPerformed(evt);
            }
        });
        payInvPanel.add(removeInvItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 180, 40));

        supInvTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        supInvTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supInvTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Suppliment", "Price", "QTY", "Discount", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        supInvTable.setGridColor(new java.awt.Color(29, 124, 167));
        supInvTable.setRowHeight(20);
        supInvTable.setSelectionBackground(new java.awt.Color(29, 124, 167));
        supInvTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supInvTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(supInvTable);

        payInvPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 1160, 200));

        subTotal.setEditable(false);
        subTotal.setBackground(new java.awt.Color(255, 255, 255));
        subTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        subTotal.setForeground(new java.awt.Color(29, 124, 167));
        subTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subTotal.setBorder(null);
        payInvPanel.add(subTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 480, 210, 50));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Sub Total");
        payInvPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, 90, 30));

        supInvDis.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supInvDis.setText("0.0");
        supInvDis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supInvDisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supInvDisKeyTyped(evt);
            }
        });
        payInvPanel.add(supInvDis, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 530, 160, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("Discount");
        payInvPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 530, 90, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setText("Net Total");
        payInvPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 580, 90, 30));

        netTotal.setEditable(false);
        netTotal.setBackground(new java.awt.Color(255, 255, 255));
        netTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        netTotal.setForeground(new java.awt.Color(29, 124, 167));
        netTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        netTotal.setBorder(null);
        payInvPanel.add(netTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 560, 210, 50));

        supInvDisCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supInvDisCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LKR", "%" }));
        supInvDisCombo.setToolTipText("");
        supInvDisCombo.setFocusable(false);
        supInvDisCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                supInvDisComboItemStateChanged(evt);
            }
        });
        payInvPanel.add(supInvDisCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 530, 50, 30));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Invoice Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(29, 124, 167))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(29, 124, 167));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Invoice ID");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 30));

        supInvId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supInvId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supInvIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supInvIdKeyTyped(evt);
            }
        });
        jPanel3.add(supInvId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("NIC ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 110, 30));

        supInvNic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supInvNic.setBorder(null);
        supInvNic.setOpaque(false);
        supInvNic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                supInvNicFocusLost(evt);
            }
        });
        supInvNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supInvNicActionPerformed(evt);
            }
        });
        supInvNic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supInvNicKeyTyped(evt);
            }
        });
        jPanel3.add(supInvNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 200, 30));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 200, 10));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setText("Name");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 300, 30));

        supInvName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supInvName.setBorder(null);
        supInvName.setOpaque(false);
        supInvName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                supInvNameFocusLost(evt);
            }
        });
        supInvName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supInvNameActionPerformed(evt);
            }
        });
        supInvName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supInvNameKeyTyped(evt);
            }
        });
        jPanel3.add(supInvName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 460, 30));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 460, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Suppliment");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 100, 30));

        supInvSupName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supInvSupName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supInvSupNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supInvSupNameKeyTyped(evt);
            }
        });
        jPanel3.add(supInvSupName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 480, 30));

        supInvSupCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supInvSupCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        supInvSupCombo.setOpaque(false);
        supInvSupCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                supInvSupComboItemStateChanged(evt);
            }
        });
        supInvSupCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supInvSupComboMouseClicked(evt);
            }
        });
        supInvSupCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supInvSupComboActionPerformed(evt);
            }
        });
        supInvSupCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                supInvSupComboPropertyChange(evt);
            }
        });
        jPanel3.add(supInvSupCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 500, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setText("Unit Price");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 140, 30));

        supInvPrice.setEditable(false);
        supInvPrice.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supInvPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supInvPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supInvPriceKeyTyped(evt);
            }
        });
        jPanel3.add(supInvPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 140, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("QTY");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, 70, 30));

        supInvQty.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supInvQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                supInvQtyFocusLost(evt);
            }
        });
        supInvQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supInvQtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supInvQtyKeyTyped(evt);
            }
        });
        jPanel3.add(supInvQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 70, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setText("Amount");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 130, 30));

        supInvAmount.setEditable(false);
        supInvAmount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel3.add(supInvAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 130, 130, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setText("Discount");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, 140, 30));

        supInvDiscount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supInvDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                supInvDiscountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                supInvDiscountKeyTyped(evt);
            }
        });
        jPanel3.add(supInvDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 140, 30));

        supInvAdd.setBackground(new java.awt.Color(29, 124, 167));
        supInvAdd.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        supInvAdd.setForeground(new java.awt.Color(29, 124, 167));
        supInvAdd.setText("Add");
        supInvAdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        supInvAdd.setContentAreaFilled(false);
        supInvAdd.setFocusPainted(false);
        supInvAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supInvAddActionPerformed(evt);
            }
        });
        jPanel3.add(supInvAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 130, 40));

        payInvPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1160, 230));

        supInvPay.setBackground(new java.awt.Color(29, 124, 167));
        supInvPay.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        supInvPay.setForeground(new java.awt.Color(255, 255, 255));
        supInvPay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        supInvPay.setContentAreaFilled(false);
        supInvPay.setFocusPainted(false);
        supInvPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supInvPayActionPerformed(evt);
            }
        });
        payInvPanel.add(supInvPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 180, 40));

        jLabel1.setBackground(new java.awt.Color(29, 124, 167));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pay");
        jLabel1.setOpaque(true);
        payInvPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 180, 40));

        cancelInv.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cancelInv.setForeground(new java.awt.Color(255, 0, 0));
        cancelInv.setText("Cancel Invoice");
        cancelInv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        cancelInv.setContentAreaFilled(false);
        cancelInv.setFocusPainted(false);
        cancelInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelInvActionPerformed(evt);
            }
        });
        payInvPanel.add(cancelInv, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 180, 40));

        packagePanel.add(payInvPanel, "card2");

        viewInvPanel.setBackground(new java.awt.Color(255, 255, 255));
        viewInvPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 1, true), "Invoices", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(29, 124, 167))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insidePanel.setBackground(new java.awt.Color(255, 255, 255));
        insidePanel.setLayout(new java.awt.CardLayout());

        supplimentInvoice.setBackground(new java.awt.Color(255, 255, 255));
        supplimentInvoice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supDetailTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Brand", "Suppliment", "Unit Price", "Item Discount", "Selled To", "QTY", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        supDetailTable.setRowHeight(22);
        supDetailTable.setRowMargin(2);
        supDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supDetailTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(supDetailTable);

        supplimentInvoice.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1140, 220));

        supInv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        supInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "Customer NIC", "Sub Total", "Invoice Discount", "Net Total", "Entered By", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        supInv.setRowHeight(22);
        supInv.setRowMargin(2);
        supInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supInvMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(supInv);
        if (supInv.getColumnModel().getColumnCount() > 0) {
            supInv.getColumnModel().getColumn(6).setHeaderValue("Date");
        }

        supplimentInvoice.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 220));

        insidePanel.add(supplimentInvoice, "card3");

        paymentInvoice.setBackground(new java.awt.Color(255, 255, 255));
        paymentInvoice.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        payInv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        payInv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "Customer NIC", "Amount", "From", "To", "Collected By", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        payInv.setRowHeight(22);
        payInv.setRowMargin(2);
        payInv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                payInvMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(payInv);

        paymentInvoice.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 440));

        insidePanel.add(paymentInvoice, "card2");

        jPanel2.add(insidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1140, 460));

        viewInvPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1180, 490));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Search by Invoice");
        viewInvPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        invId.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        invId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                invIdFocusGained(evt);
            }
        });
        invId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invIdActionPerformed(evt);
            }
        });
        invId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                invIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                invIdKeyTyped(evt);
            }
        });
        viewInvPanel.add(invId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("To");
        viewInvPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 60, 30, 30));

        invTo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewInvPanel.add(invTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 60, 150, 30));

        invFrom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        invFrom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                invFromFocusGained(evt);
            }
        });
        viewInvPanel.add(invFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 150, 30));

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(29, 124, 167));
        searchbtn.setText("Refresh");
        searchbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        searchbtn.setContentAreaFilled(false);
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        viewInvPanel.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 90, 40));

        searchByInvId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchIcon.png"))); // NOI18N
        searchByInvId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByInvIdActionPerformed(evt);
            }
        });
        viewInvPanel.add(searchByInvId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 30, 30));

        searchByDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchIcon.png"))); // NOI18N
        searchByDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByDateActionPerformed(evt);
            }
        });
        viewInvPanel.add(searchByDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 60, 30, 30));

        nicSearch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        nicSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nicSearchFocusGained(evt);
            }
        });
        nicSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nicSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicSearchKeyTyped(evt);
            }
        });
        viewInvPanel.add(nicSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 140, 30));

        searchByNic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchIcon.png"))); // NOI18N
        searchByNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByNicActionPerformed(evt);
            }
        });
        viewInvPanel.add(searchByNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 30, 30));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Search by NIC");
        viewInvPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 120, 30));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("From");
        viewInvPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 70, 30));

        buttonGroup2.add(payInvRadio);
        payInvRadio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        payInvRadio.setText("Payment Invoices");
        payInvRadio.setContentAreaFilled(false);
        payInvRadio.setFocusable(false);
        payInvRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payInvRadioActionPerformed(evt);
            }
        });
        viewInvPanel.add(payInvRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        buttonGroup2.add(supInvRadio);
        supInvRadio.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supInvRadio.setText("Suppliment Invoices");
        supInvRadio.setContentAreaFilled(false);
        supInvRadio.setFocusable(false);
        supInvRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supInvRadioActionPerformed(evt);
            }
        });
        viewInvPanel.add(supInvRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        packagePanel.add(viewInvPanel, "card3");

        add(packagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1240, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void supInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supInvBtnActionPerformed
        unselectButton();

        supInvBtn.setBackground(Colors.defaultWhite);
        supInvBtn.setForeground(Colors.defaultBlue);

        packagePanel.removeAll();
        packagePanel.add(payInvPanel);
        packagePanel.repaint();
        packagePanel.revalidate();
        packagePanel.setVisible(true);
    }//GEN-LAST:event_supInvBtnActionPerformed

    private void payInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInvBtnActionPerformed
        unselectButton();

        payInvBtn.setBackground(Colors.defaultWhite);
        payInvBtn.setForeground(Colors.defaultBlue);

        packagePanel.removeAll();
        packagePanel.add(supInvPanel);
        packagePanel.repaint();
        packagePanel.revalidate();
        packagePanel.setVisible(true);
    }//GEN-LAST:event_payInvBtnActionPerformed

    private void viewInvBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvBtnActionPerformed
        unselectButton();

        viewInvBtn.setBackground(Colors.defaultWhite);
        viewInvBtn.setForeground(Colors.defaultBlue);

        packagePanel.removeAll();
        packagePanel.add(viewInvPanel);
        packagePanel.repaint();
        packagePanel.revalidate();
        packagePanel.setVisible(true);
    }//GEN-LAST:event_viewInvBtnActionPerformed

    int selectedRow;
    private void removeInvItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeInvItemActionPerformed
        selectedRow = supInvTable.getSelectedRow();

        DefaultTableModel dtm_grn = (DefaultTableModel) supInvTable.getModel();
        dtm_grn.removeRow(selectedRow);

        setSubTotal();

    }//GEN-LAST:event_removeInvItemActionPerformed

    private void supInvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supInvTableMouseClicked
        if (evt.getClickCount() == 2) {
            stockId = Integer.parseInt(String.valueOf(supInvTable.getValueAt(supInvTable.getSelectedRow(), 0)));
            supInvSupName.setText(supInvTable.getValueAt(supInvTable.getSelectedRow(), 1).toString());
            supInvPrice.setText(supInvTable.getValueAt(supInvTable.getSelectedRow(), 2).toString());
            supInvQty.setText(supInvTable.getValueAt(supInvTable.getSelectedRow(), 3).toString());
            supInvDiscount.setText(supInvTable.getValueAt(supInvTable.getSelectedRow(), 4).toString());
            supInvAmount.setText(supInvTable.getValueAt(supInvTable.getSelectedRow(), 5).toString());

            DefaultTableModel dtm = (DefaultTableModel) supInvTable.getModel();
            dtm.removeRow(supInvTable.getSelectedRow());

            setSubTotal();
        }
    }//GEN-LAST:event_supInvTableMouseClicked

    private void supInvSupComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supInvSupComboActionPerformed
//
//        try {
//            supInvSupName.setText(supInvSupCombo.getSelectedItem().toString().split(",")[0]);
//            supInvPrice.setText(supInvSupCombo.getSelectedItem().toString().split(",")[1].split("R")[1]);
//            supInvAmount.setText(supInvPrice.getText());
//                supInvQty.setText("1");
//
//        } catch (Exception ex) {
//            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_supInvSupComboActionPerformed

    private void supInvSupComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_supInvSupComboPropertyChange

    }//GEN-LAST:event_supInvSupComboPropertyChange

    private void supInvDisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvDisKeyReleased
        setNetTotal();
    }//GEN-LAST:event_supInvDisKeyReleased

    private void supInvDisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvDisKeyTyped

        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (supInvDis.getText().trim().isEmpty() && evt.getKeyChar() == '.') {
            evt.consume();
        }
        if (supInvDis.getText().trim().contains(".") && evt.getKeyChar() == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_supInvDisKeyTyped

    private void supInvPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvPriceKeyReleased

    }//GEN-LAST:event_supInvPriceKeyReleased

    private void supInvPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvPriceKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (supInvPrice.getText().trim().isEmpty() && evt.getKeyChar() == '.') {
            evt.consume();
        }
        if (supInvPrice.getText().trim().contains(".") && evt.getKeyChar() == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_supInvPriceKeyTyped

    int  y = 0;
    ResultSet rs_suggest, rs_clicked;
    int stockId, supId;
    private void supInvSupNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvSupNameKeyReleased
        if (!supInvSupName.getText().isEmpty()) {
            try {

                rs_suggest = StockManagement.getSuggestSuppliment(supInvSupName.getText().trim());
            Vector v = new Vector();
                while (rs_suggest.next()) {
                    supInvSupCombo.showPopup();
                    v.add(rs_suggest.getString("supname"));
                }
                DefaultComboBoxModel dcm = new DefaultComboBoxModel(v);
                supInvSupCombo.setModel(dcm);
                supInvSupCombo.showPopup();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            if (supInvSupCombo.getItemCount() != 0) {
                supInvSupCombo.showPopup();

                int c = supInvSupCombo.getItemCount();
//                if (evt.getKeyCode() == 40) {
//                    i++;
//                    if (i == c) {
//                        i = 0;
//                    }
//                    supInvSupCombo.setSelectedIndex(i);
//                }
//
//                if (evt.getKeyCode() == 38) {
//                    i--;
//                    if (i == -1) {
//                        i = c - 1;
//                    }
//                    supInvSupCombo.setSelectedIndex(i);
//                }
                
                   if (evt.getKeyCode() == 40) {
                       System.out.println(y);
                        y++;
                        if (y == c) {
                            y = 0;
                        }
                        supInvSupCombo.setSelectedIndex(y);
                    }

                    if (evt.getKeyCode() == 38) {
                          System.out.println(y);
                        y--;
                        if (y == -1) {
                            y = c - 1;
                        }
                        supInvSupCombo.setSelectedIndex(y);
                    }

                stockId = 0;
                if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                    try {
                        supInvSupCombo.setSelectedIndex(y);
                        supInvSupCombo.hidePopup();
                        y= 0;
                        supInvSupName.setText(supInvSupCombo.getSelectedItem().toString().split(",")[0]);
                        supInvPrice.setText(supInvSupCombo.getSelectedItem().toString().split(",")[1].split("R")[1]);
                        supInvAmount.setText(supInvPrice.getText());
//                        loadInvSup(StockManagement.getSuggestSuppliment(supInvSupName.getText()));

                        supInvQty.setText("1");
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

            } else {
                supInvSupCombo.hidePopup();
            }

        }
    }//GEN-LAST:event_supInvSupNameKeyReleased

    public void loadInvSup(ResultSet rs) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) supInvTable.getModel();
            dtm.setRowCount(0);

            Vector v = new Vector();
            while (rs.next()) {
                v.add(rs.getString("idsupplimentstock"));
                v.add(rs.getString("brand"));
                v.add(rs.getString("supplimentname"));
                v.add(rs.getString("supplimentstock.mfd"));
                v.add(rs.getString("supplimentstock.exp"));
                v.add(rs.getString("amount"));
                v.add(rs.getString("sellingprice"));
                v.add(rs.getDouble("sellingprice") - rs.getDouble("amount"));
                v.add(rs.getString("stkqty"));

                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void supInvSupNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvSupNameKeyTyped

    }//GEN-LAST:event_supInvSupNameKeyTyped

    private void supInvDisComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_supInvDisComboItemStateChanged
        supInvDis.setText(null);
    }//GEN-LAST:event_supInvDisComboItemStateChanged

    int buyerId;
    int invid;
    SupplimentInvoiceModel supInvMod;
    private void supInvPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supInvPayActionPerformed
        if (MainFrame.mainUserId != -1) {
            if(!netTotal.getText().isEmpty() && ! subTotal.getText().isEmpty()){
        if (!supInvNic.getText().isEmpty()) {
            invModel = new InvoiceModel().setInvNic(supInvNic.getText()).setInvType("sup").setNetTotal(Double.parseDouble(netTotal.getText()))
                    .setSubTotal(Double.parseDouble(subTotal.getText())).setUserId(MainFrame.mainUserId);
            invid = InvoiceManagement.saveInvoice(invModel, "sup");
            if (invid != -1) {
                for (int i = 0; i < supInvTable.getRowCount(); i++) {
                    System.out.println(supInvTable.getValueAt(i, 0).toString());
                    System.out.println(supInvTable.getValueAt(i, 3).toString());
                    System.out.println(supInvTable.getValueAt(i, 4).toString());
                    System.out.println(invid);
                    supInvMod = new SupplimentInvoiceModel()
                            .setSupStockId(Integer.parseInt(supInvTable.getValueAt(i, 0).toString())).setQty(Double.parseDouble(supInvTable.getValueAt(i, 3).toString()))
                            .setDiscount(Double.parseDouble(supInvTable.getValueAt(i, 4).toString())).setInvId(invid);
                    InvoiceManagement.saveSupplimentnvoice(supInvMod);
                    loadSupInvoice(InvoiceManagement.getAllSupInvoice());

                    StockManagement.updateStockQty(Integer.parseInt(supInvTable.getValueAt(i, 0).toString()), Double.parseDouble(supInvTable.getValueAt(i, 3).toString()));
                }
                printSupplimentInvoice();
                JOptionPane.showMessageDialog(this, "Paid!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
                refreshAllSupInv();
            } else {
                JOptionPane.showMessageDialog(this, "Buyer NIC required!", "Failed!", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Buyer NIC required!", "Failed!", JOptionPane.INFORMATION_MESSAGE);
        }
            }
        }
    }//GEN-LAST:event_supInvPayActionPerformed

    private void invIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_invIdFocusGained
        invFrom.setDate(null);
        invTo.setDate(null);
    }//GEN-LAST:event_invIdFocusGained

    private void invIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invIdKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_invIdKeyReleased
    String currentInvId;
    private void invIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invIdKeyTyped
        currentInvId = invId.getText().trim();
        cc = evt.getKeyChar();

        if (currentInvId.length() < 10) {

            if (!((cc >= '0') && (cc <= '9')
                    || (cc == KeyEvent.VK_BACK_SPACE)
                    || (cc == KeyEvent.VK_DELETE))) {
                evt.consume();
            }

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_invIdKeyTyped

    private void invFromFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_invFromFocusGained
        invId.setText(null);
    }//GEN-LAST:event_invFromFocusGained

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        invId.setText(null);
        invFrom.setDate(null);
        invTo.setDate(null);
        nicSearch.setText(null);
        loadPayInv(InvoiceManagement.getAllPayInvoice());
        loadSupInvoice(InvoiceManagement.getAllSupInvoice());
    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchByInvIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByInvIdActionPerformed
        if (!invId.getText().isEmpty()) {
            if (supInvRadio.isSelected()) {
                loadSupInvoice(InvoiceManagement.getAllSupInvoiceInvId(invId.getText().trim()));
            } else {
                loadPayInv(InvoiceManagement.getAllPayInvoiceInvId(invId.getText().trim()));
            }
        }
    }//GEN-LAST:event_searchByInvIdActionPerformed

    private void searchByDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByDateActionPerformed
        if (!(invFrom.getDate() == null || invTo.getDate() == null)) {
            Date fromd = invFrom.getDate();
            Date tod = invTo.getDate();
            String fromdt = new SimpleDateFormat("YYYY-MM-dd").format(fromd);
            String todt = new SimpleDateFormat("YYYY-MM-dd").format(tod);
            if (supInvRadio.isSelected()) {
                loadSupInvoice(InvoiceManagement.getAllSupInvoiceDate(fromdt, todt));
            } else {
                loadPayInv(InvoiceManagement.getAllPayInvoiceDate(fromdt, todt));
            }
        } else {
        }
    }//GEN-LAST:event_searchByDateActionPerformed

    private void payInvPayTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInvPayTypeActionPerformed
        int month;
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d,yyyy");
        Date date = payInvFrom.getDate();
        if(date != null){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        Date toDate;
        System.out.println("State Changed");
        if (!payInvAmount.getText().isEmpty()) {
            payInvAmount.setText(null);
        }
        try {
            if (payInvPayType.getSelectedItem().equals("Monthly")) {
                cal.add(Calendar.MONTH, 1);
                toDate = cal.getTime();
                System.out.println(toDate);
                payInvTo.setDate(toDate);
            } else if (payInvPayType.getSelectedItem().equals("03 Month")) {
                cal.add(Calendar.MONTH, 3);
                toDate = cal.getTime();
                System.out.println(toDate);
                payInvTo.setDate(toDate);
            } else if (payInvPayType.getSelectedItem().equals("06 Month")) {
                cal.add(Calendar.MONTH, 6);
                toDate = cal.getTime();
                System.out.println(toDate);
                payInvTo.setDate(toDate);
            } else if (payInvPayType.getSelectedItem().equals("Annually")) {
                cal.add(Calendar.YEAR, 1);
                toDate = cal.getTime();
                System.out.println(toDate);
                payInvTo.setDate(toDate);
            } else {
                payInvTo.setDate(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_payInvPayTypeActionPerformed

    private void payInvPayTypePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_payInvPayTypePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_payInvPayTypePropertyChange

    private void payInvTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payInvTableMouseClicked

    }//GEN-LAST:event_payInvTableMouseClicked

    private void payInvPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInvPayActionPerformed
        try {
            if(MainFrame.mainUserId !=-1){
            
            invModel = new InvoiceModel().setInvNic(payInvNic.getText().trim()).setSubTotal(Double.parseDouble(payInvAmount.getText().trim())).setUserId(MainFrame.mainUserId);

            int i = -1;
            i = InvoiceManagement.saveInvoice(invModel, "pay");

            java.sql.Date f = new java.sql.Date(payInvFrom.getDate().getTime());
            java.sql.Date t = new java.sql.Date(payInvTo.getDate().getTime());

            if (i != -1) {
                payInvModel = new PaymentInvoiceModel().setFromD(f).setToD(t).setPaymentType(payInvPayType.getSelectedItem().toString()).setInvId(i).setMemId(memberId);

                if (!(payInvNic.getText().isEmpty() || payInvPayType.getSelectedIndex() == 0 || payInvFrom.getDate() == null || payInvTo.getDate() == null)) {

                    if (InvoiceManagement.savePaymentInvoice(payInvModel)) {
                        printPaymentInvoice();
                        JOptionPane.showMessageDialog(this, "Paid!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
                        refreshPayInv();
                    } else {
                        JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Some rewuired information has not added!", "Failed!", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);

            }
            
            }
        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_payInvPayActionPerformed

    private void refreshPayInv() {
        payInvNic.setText(null);
        payInvName.setText(null);
        payInvPack.setText(null);
        payInvCash.setText(null);
        payInvBalance.setText(null);
        payInvFrom.setDate(null);
        payInvTo.setDate(null);
        payInvPayType.setSelectedIndex(0);
        payInvAmount.setText(null);

        DefaultTableModel dtm = (DefaultTableModel) payInvTable.getModel();
        dtm.setRowCount(0);

        setPayInvId();

    }

    private void payInfRefrshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInfRefrshActionPerformed
        refreshPayInv();
    }//GEN-LAST:event_payInfRefrshActionPerformed

    private void payInvNicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_payInvNicFocusLost

    }//GEN-LAST:event_payInvNicFocusLost

    private void payInvNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInvNicActionPerformed

    }//GEN-LAST:event_payInvNicActionPerformed

    char c;
    String buyerNic, buyerPackage;
    String[] buyPack;
    ResultSet rs_oldInv, rs_memid;
    int memberId;
    private void payInvNicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payInvNicKeyTyped
        c = evt.getKeyChar();
        buyerNic = payInvNic.getText().trim();
        memberId = 0;

        if (!buyerNic.equals("")) {

            if (buyerNic.length() == 10 || buyerNic.length() == 12) {
                try {
                    //                System.out.println(buyerNic);
                    buyerPackage = InvoiceManagement.getBuyerName(buyerNic);
                    buyPack = buyerPackage.split("-");
                    rs_memid = MemberManagement.getSelectedAllMemberNic(buyerNic);

                    if (rs_memid.next()) {
                        memberId = rs_memid.getInt("idmember");
                    }

                    if (!buyPack[0].equals("")) {
                        payInvName.setText(buyPack[0]);
                    } else {
                        payInvName.setText("");

                    }

                    if (!buyPack[1].equals("")) {
                        payInvPack.setText(buyPack[1]);

                        rs_oldInv = InvoiceManagement.getOldInv(payInvNic.getText().trim());

                        DefaultTableModel dtm = (DefaultTableModel) payInvTable.getModel();
                        dtm.setRowCount(0);

                        while (rs_oldInv.next()) {
                            Vector v = new Vector();
                            v.add(rs_oldInv.getString("idinvoice"));
                            v.add(rs_oldInv.getString("subtotal"));
                            v.add(rs_oldInv.getString("from") + " to " + rs_oldInv.getString("to"));
                            v.add(rs_oldInv.getString("date"));
                            dtm.addRow(v);
                        }

                    }

                    String lastFrom = "";
                    String notfrom = "";
                    Date fromDate;
                    Date notDate = null;
                    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");

                    if (rs_oldInv.last()) {
                        payInvFrom.setDate(rs_oldInv.getDate("to"));
                    } else {
                        rs_oldInv = MemberManagement.getSelectedAllMemberNic(buyerNic);
                        if (rs_oldInv.next()) {
                            notDate = rs_oldInv.getDate("generaldetail.date");
                            payInvFrom.setDate(notDate);
                        }
                    }

                    loadPaymentType();
                } catch (Exception ex) {
                    Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (buyerNic.length() < 12) {

                if (buyerNic.length() == 9) {
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
            payInvName.setText(null);
            payInvPack.setText(null);
        }


    }//GEN-LAST:event_payInvNicKeyTyped

    ResultSet rs_payType;

    public void loadPaymentType() {
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        dcm.removeAllElements();

    }

    public void refreshInvoice() {

    }

    private void payInvAmountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_payInvAmountFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_payInvAmountFocusLost

    private void payInvAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInvAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payInvAmountActionPerformed

    private void payInvAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payInvAmountKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_payInvAmountKeyTyped

    private void payInvNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_payInvNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_payInvNameFocusLost

    private void payInvNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInvNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payInvNameActionPerformed

    private void payInvNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payInvNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_payInvNameKeyTyped

    private void supInvNicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supInvNicFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_supInvNicFocusLost

    private void supInvNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supInvNicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supInvNicActionPerformed

    String currentNic;
    private void supInvNicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvNicKeyTyped
        char c = evt.getKeyChar();
        currentNic = supInvNic.getText().trim();

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

        if (currentNic.length() == 10 || currentNic.length() == 12) {
            ResultSet rs = MemberManagement.getSelectedAllMemberNic(currentNic);
            ResultSet rs_stf = StaffManagement.getSelectedAllStaffNic(currentNic);
            try {
                if (rs.next()) {
                    supInvName.setText(rs.getString("fullname"));
                } else if (rs_stf.next()) {
                    supInvName.setText(rs_stf.getString("fullname"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_supInvNicKeyTyped

    private void supInvNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supInvNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_supInvNameFocusLost

    private void supInvNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supInvNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supInvNameActionPerformed

    private void supInvNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvNameKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_supInvNameKeyTyped

    private void supInvIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvIdKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_supInvIdKeyReleased

    private void supInvIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvIdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_supInvIdKeyTyped

    private void supInvQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvQtyKeyReleased
        if (!supInvQty.getText().isEmpty()) {
            supInvAmount.setText(String.valueOf(Double.parseDouble(supInvPrice.getText()) * Double.parseDouble(supInvQty.getText())));
            supInvDiscount.setText(null);
        } else {
            supInvAmount.setText(null);
            supInvDiscount.setText(null);
        }
    }//GEN-LAST:event_supInvQtyKeyReleased

    private void supInvQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvQtyKeyTyped

    }//GEN-LAST:event_supInvQtyKeyTyped

    private void nicSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nicSearchFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nicSearchFocusGained

    private void nicSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicSearchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nicSearchKeyReleased

    char cc;
    private void nicSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicSearchKeyTyped
//
//        cc = evt.getKeyChar();
//        currentNic = nicSearch.getText().trim();
//
//        if (!currentNic.equals("")) {
//
//            if (currentNic.length() < 12) {
//
//                if (currentNic.length() == 9) {
//                    if (!((c >= '0') && (c <= '9')
//                            || (c == KeyEvent.VK_BACK_SPACE)
//                            || (c == KeyEvent.VK_V)
//                            || (c == 'v')
//                            || (c == KeyEvent.VK_DELETE))) {
//                        evt.consume();
//                    }
//                } else if (!((c >= '0') && (c <= '9')
//                        || (c == KeyEvent.VK_BACK_SPACE)
//                        || (c == KeyEvent.VK_DELETE))) {
//                    evt.consume();
//                }
//
//            } else {
//                evt.consume();
//            }
//        }
        
                char c = evt.getKeyChar();
        currentNic = nicSearch.getText().trim();

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
    }//GEN-LAST:event_nicSearchKeyTyped

    private void searchByNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByNicActionPerformed
        if (!nicSearch.getText().isEmpty()) {
            if (supInvRadio.isSelected()) {
                loadSupInvoice(InvoiceManagement.getAllSupInvoiceNic(nicSearch.getText().trim()));
            } else {
                loadPayInv(InvoiceManagement.getAllPayInvoiceNic(nicSearch.getText().trim()));
            }
        }
    }//GEN-LAST:event_searchByNicActionPerformed

    private void invIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invIdActionPerformed

    private void payInvNicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payInvNicKeyReleased

    }//GEN-LAST:event_payInvNicKeyReleased

    private void payInvNicKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payInvNicKeyPressed

    }//GEN-LAST:event_payInvNicKeyPressed

    private void payInvPayTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_payInvPayTypeItemStateChanged

    }//GEN-LAST:event_payInvPayTypeItemStateChanged

    ResultSet rs_amt;
    private void payInvCalAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInvCalAmountActionPerformed
        try {
            rs_amt = InvoiceManagement.getAllPayInvDetail(payInvPack.getText() + "," + payInvPayType.getSelectedItem().toString());

            if (rs_amt.next()) {
                payInvAmount.setText(rs_amt.getString("package.fee"));

                payInvBtn.setVisible(true);
                payLBL.setVisible(true);
                payInvBtn.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "No payment option suitable for selected!", "Failed!", JOptionPane.WARNING_MESSAGE);
                payInvAmount.setText("0.0");
                payLBL.setVisible(false);
                payInvBtn.setVisible(false);
                payInvBtn.setEnabled(false);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }//GEN-LAST:event_payInvCalAmountActionPerformed

    double fee, cash, balance;
    private void payInvCashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payInvCashKeyReleased
        fee = 0.0;
        cash = 0.0;
        balance = 0.0;

        if (payInvCash.getText().isEmpty()) {
            payInvBalance.setText(null);
            cash = 0.0;
            payInvPay.setEnabled(false);
        } else {

            payInvPay.setEnabled(true);
            fee = Double.parseDouble(payInvAmount.getText());
            cash = Double.parseDouble(payInvCash.getText());
        }

        payInvBalance.setText(String.valueOf(cash - fee));
    }//GEN-LAST:event_payInvCashKeyReleased

    InvoiceModel invModel;
    PaymentInvoiceModel payInvModel;
    private void payInvCashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payInvCashKeyTyped


    }//GEN-LAST:event_payInvCashKeyTyped

    double supIDis = 0.0;
    private void supInvDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvDiscountKeyReleased
        if (!supInvDiscount.getText().isEmpty()) {
            supIDis = Double.parseDouble(supInvDiscount.getText());
        } else {
            supIDis = 0.0;
        }
        supInvAmount.setText(String.valueOf((Double.parseDouble(supInvPrice.getText()) - supIDis) * Double.parseDouble(supInvQty.getText())));
    }//GEN-LAST:event_supInvDiscountKeyReleased

    private void supInvDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_supInvDiscountKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_supInvDiscountKeyTyped

    double supDis = 0.0;
    boolean isRowAlready = false;
    SupplimentInvoiceModel supInvModel;
    int stkId;
    private void supInvAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supInvAddActionPerformed
        if (!supInvSupName.getText().isEmpty()) {
            if (!supInvDiscount.getText().isEmpty()) {
                supDis = Double.parseDouble(supInvDiscount.getText());
            } else {
                supDis = 0.0;
            }
            stkId = StockManagement.getSelectedStockId(supInvSupName.getText().trim(), supInvPrice.getText());
            isRowAlready = false;

            
            System.out.println("OUT"+StockManagement.getDueQty(stkId));
            if (StockManagement.getDueQty(stkId)  >= Double.parseDouble((supInvQty.getText())) ) {
                System.out.println(StockManagement.getDueQty(stkId));
                DefaultTableModel dtm = (DefaultTableModel) supInvTable.getModel();
                for (int i = 0; i < supInvTable.getRowCount(); i++) {

                    if ((stkId + String.valueOf(supDis)).equals((supInvTable.getValueAt(i, 0) + String.valueOf(supInvTable.getValueAt(i, 4))))) {
                        System.out.println("OLD");
                        isRowAlready = true;
                        supInvTable.setValueAt(Double.parseDouble(supInvTable.getValueAt(i, 3).toString()) + Double.parseDouble(supInvQty.getText()), i, 3);
                        supInvTable.setValueAt(
                                (Double.parseDouble(supInvTable.getValueAt(i, 2).toString()) - Double.parseDouble(supInvTable.getValueAt(i, 4).toString()))
                                * Double.parseDouble(supInvTable.getValueAt(i, 3).toString()), i, 5);
                        break;

                    }

                }

                if (!isRowAlready) {
                    if (!supInvPrice.getText().equals("0")) {
                        System.out.println("NEW");
                        Vector v = new Vector();
                        v.add(stkId);
                        v.add(supInvSupName.getText().split(",")[0]);
                        v.add(supInvPrice.getText());
                        v.add(supInvQty.getText());
                        v.add(supDis);
                        v.add(supInvAmount.getText());
                        dtm.addRow(v);

                    } 
                    refreshSupUp();
                } else {
                    JOptionPane.showMessageDialog(this, "Add a  selling price to the item!", "Failed!", JOptionPane.WARNING_MESSAGE);
                    refreshSupUp();
                }

            }else {
                        JOptionPane.showMessageDialog(this, "You don't have enough amount of suppliment in this stock!", "Failed!", JOptionPane.WARNING_MESSAGE);
                    }
            stockId = 0;
        } else {
            JOptionPane.showMessageDialog(this, "Select a suppliment!", "Failed!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_supInvAddActionPerformed

    double subTot = 0.0;

    public void setSubTotal() {
        subTot = 0.0;
        for (int i = 0; i < supInvTable.getRowCount(); i++) {
            subTot += Double.parseDouble(supInvTable.getValueAt(i, 5).toString());
        }
        subTotal.setText(String.valueOf(subTot));
        setNetTotal();
    }

    double netTot = 0.0;
    double disTot = 0.0;

    public void setNetTotal() {
        netTot = 0.0;
        if (!supInvDis.getText().isEmpty()) {
            disTot = Double.parseDouble(supInvDis.getText());
        } else {
            disTot = 0.0;
        }
        if (supInvDisCombo.getSelectedItem().equals("LKR")) {
            netTot = Double.parseDouble(subTotal.getText()) - disTot;
        } else {
            netTot = (Double.parseDouble(subTotal.getText()) * (100.0 - disTot)) / 100;
        }
        netTotal.setText(String.valueOf(netTot));
    }

    public void refreshSupUp() {
        supInvSupName.setText(null);
        supInvPrice.setText(null);
        supInvQty.setText(null);
        supInvDiscount.setText(null);
        supInvAmount.setText(null);

        setSubTotal();
    }

    private void supInvSupComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supInvSupComboMouseClicked

    }//GEN-LAST:event_supInvSupComboMouseClicked

    private void supInvSupComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_supInvSupComboItemStateChanged

    }//GEN-LAST:event_supInvSupComboItemStateChanged

    private void supInvQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supInvQtyFocusLost
        if (supInvQty.getText().isEmpty()) {
            supInvQty.setText("1");
            supInvAmount.setText(supInvPrice.getText());
        }
    }//GEN-LAST:event_supInvQtyFocusLost

    private void supDetailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supDetailTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_supDetailTableMouseClicked

    private void supInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supInvMouseClicked
  
            if(supInv.getSelectedRow() != -1){
            loadSupInvDetail(InvoiceManagement.getSupInvbyInvID(supInv.getValueAt(supInv.getSelectedRow(), 0).toString()));
            }
     
    }//GEN-LAST:event_supInvMouseClicked

    private void supInvRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supInvRadioActionPerformed
        insidePanel.removeAll();
        insidePanel.add(supplimentInvoice);
        insidePanel.repaint();
        insidePanel.revalidate();
        insidePanel.setVisible(true);
    }//GEN-LAST:event_supInvRadioActionPerformed

    private void payInvRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInvRadioActionPerformed
        insidePanel.removeAll();
        insidePanel.add(paymentInvoice);
        insidePanel.repaint();
        insidePanel.revalidate();
        insidePanel.setVisible(true);
    }//GEN-LAST:event_payInvRadioActionPerformed

    private void payInvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payInvMouseClicked
        if (evt.getClickCount() == 2) {
            loadPayInvTable(InvoiceManagement.getPayInvbyInvID(payInv.getValueAt(payInv.getSelectedRow(), 0).toString()));
        }
    }//GEN-LAST:event_payInvMouseClicked

    private void cancelInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelInvActionPerformed
        refreshAllSupInv();
    }//GEN-LAST:event_cancelInvActionPerformed

    public void refreshAllSupInv() {
        refreshSupUp();
        setPayInvId();
        setSubTotal();
        supInvNic.setText(null);
        supInvName.setText(null);
        supInvDis.setText("0.0");
        subTotal.setText(null);
        netTotal.setText(null);

        DefaultTableModel dtm = (DefaultTableModel) supInvTable.getModel();
        dtm.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancelInv;
    private javax.swing.JPanel insidePanel;
    private com.toedter.calendar.JDateChooser invFrom;
    private javax.swing.JTextField invId;
    private com.toedter.calendar.JDateChooser invTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField netTotal;
    private javax.swing.JTextField nicSearch;
    private javax.swing.JPanel packagePanel;
    private javax.swing.JButton payInfRefrsh;
    private javax.swing.JTable payInv;
    private javax.swing.JTextField payInvAmount;
    private javax.swing.JTextField payInvBalance;
    private javax.swing.JButton payInvBtn;
    private javax.swing.JButton payInvCalAmount;
    private javax.swing.JTextField payInvCash;
    private com.toedter.calendar.JDateChooser payInvFrom;
    private javax.swing.JTextField payInvId;
    private javax.swing.JTextField payInvName;
    private javax.swing.JTextField payInvNic;
    private javax.swing.JLabel payInvPack;
    private javax.swing.JPanel payInvPanel;
    private javax.swing.JButton payInvPay;
    private javax.swing.JComboBox<String> payInvPayType;
    private javax.swing.JRadioButton payInvRadio;
    private javax.swing.JTable payInvTable;
    private com.toedter.calendar.JDateChooser payInvTo;
    private javax.swing.JLabel payLBL;
    private javax.swing.JPanel paymentInvoice;
    private javax.swing.JButton removeInvItem;
    private javax.swing.JButton searchByDate;
    private javax.swing.JButton searchByInvId;
    private javax.swing.JButton searchByNic;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField subTotal;
    private javax.swing.JTable supDetailTable;
    private javax.swing.JTable supInv;
    private javax.swing.JButton supInvAdd;
    private javax.swing.JTextField supInvAmount;
    private javax.swing.JButton supInvBtn;
    private javax.swing.JTextField supInvDis;
    private javax.swing.JComboBox<String> supInvDisCombo;
    private javax.swing.JTextField supInvDiscount;
    private javax.swing.JTextField supInvId;
    private javax.swing.JTextField supInvName;
    private javax.swing.JTextField supInvNic;
    private javax.swing.JPanel supInvPanel;
    private javax.swing.JButton supInvPay;
    private javax.swing.JTextField supInvPrice;
    private javax.swing.JTextField supInvQty;
    private javax.swing.JRadioButton supInvRadio;
    private javax.swing.JComboBox<String> supInvSupCombo;
    private javax.swing.JTextField supInvSupName;
    private javax.swing.JTable supInvTable;
    private javax.swing.JPanel supplimentInvoice;
    private javax.swing.JButton viewInvBtn;
    private javax.swing.JPanel viewInvPanel;
    // End of variables declaration//GEN-END:variables

    public void loadSupInvoice(ResultSet rs) {
        DefaultTableModel dtm = (DefaultTableModel) supInv.getModel();
        dtm.setRowCount(0);

        try {
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("idinvoice"));
                v.add(rs.getString("buyernic"));
                v.add(rs.getDouble("subtotal"));
                v.add(rs.getDouble("subtotal") - rs.getDouble("nettotal"));
                v.add(rs.getDouble("nettotal"));
                v.add(rs.getString("usernm"));
                v.add(rs.getDate("date"));
                dtm.addRow(v);
                
                  loadSupInvDetail(InvoiceManagement.getSupInvbyInvID(supInv.getValueAt(0, 0).toString()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadSupInvDetail(ResultSet rs) {
        DefaultTableModel dtm = (DefaultTableModel) supDetailTable.getModel();
        dtm.setRowCount(0);
        
        System.out.println("Aaa");

        try {
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("idsupplimentstock"));
                v.add(rs.getString("brand"));
                v.add(rs.getString("supplimentname"));
                System.out.println(rs.getString("supplimentname"));
                v.add(rs.getDouble("sellingprice"));
                v.add(rs.getDouble("supplimentinvoice.discount"));
                v.add(rs.getDouble("sellingprice") - rs.getDouble("supplimentinvoice.discount"));
                v.add(rs.getDouble("qty"));
                v.add((rs.getDouble("sellingprice") - rs.getDouble("supplimentinvoice.discount")) * rs.getDouble("qty"));
                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadPayInvTable(ResultSet rs) {
//        DefaultTableModel dtm = (DefaultTableModel) payInvDetailTable.getModel();
//        dtm.setRowCount(0);

        try {
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("idmember"));
                v.add(rs.getString("fullname"));
                v.add(rs.getString("packagename.packagename"));
                v.add(rs.getString("payment"));
                v.add(rs.getDate("paymentinvoice.from"));
                v.add(rs.getDate("paymentinvoice.to"));
//                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadPayInv(ResultSet rs) {
        DefaultTableModel dtm = (DefaultTableModel) payInv.getModel();
        dtm.setRowCount(0);

        try {
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("idinvoice"));
                v.add(rs.getString("buyernic"));
                v.add(rs.getString("subTotal"));
                v.add(rs.getString("from"));
                v.add(rs.getString("to"));
                v.add(rs.getString("usernm"));
                v.add(rs.getString("date"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     private void printPaymentInvoice() {
        try {
            HashMap<String, Object> m = new HashMap();
            String i = String.valueOf(Integer.parseInt(payInvId.getText()));
            System.out.println(i);
            m.put("invId", i);
//            InputStream is = InvoicePanel.class.getResourceAsStream("/BodyStation_PaymentInvoice.jrxml");
            JasperReport report = JasperCompileManager.compileReport("F://BodyStation_PaymentInvoice.jrxml");

            JasperPrint print1 = JasperFillManager.fillReport(report, m, DB.getConnection());
            JasperViewer.viewReport(print1, false);
            JasperPrintManager.printReport(print1, true);

        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
     
     private void printSupplimentInvoice() {
        try {
            
                        HashMap<String, Object> m = new HashMap();
            String i = String.valueOf(Integer.parseInt(supInvId.getText()));
            System.out.println("abc"+i);
         m.put("invId", i);
  InputStream is = InvoicePanel.class.getResourceAsStream("/Reports/BodyStation_SupplimentInvoice.jrxml");
            JasperReport report = JasperCompileManager.compileReport(is);

            JasperPrint print1 = JasperFillManager.fillReport(report, null, DB.getConnection());
            JasperViewer.viewReport(print1, false);
            JasperPrintManager.printReport(print1, true);
            
//            InputStream is = InvoicePanel.class.getResourceAsStream("/Reports/BodyStation_SupplimentInvoice.jrxml");
//            InputStream is = new FileInputStream("/Reports/BodyStation_SupplimentInvoice.jrxml");

        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
}
