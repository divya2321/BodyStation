package GUI;

import Classes.Colors;
import Database.Beans.GRNModel;
import Database.Beans.SupplimentModel;
import Database.DB;
import Database.Tables.BrandNameManagement;
import Database.Tables.GRNManagement;
import Database.Tables.StockManagement;
import Database.Tables.SupplierManagement;
import Database.Tables.SupplimentManagement;
import Database.Tables.TypeManagement;
import PopUpInterface.NewBrandName;
import PopUpInterface.NewType;
import PopUpInterface.SetSellingPrice;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
public class StockPanel extends javax.swing.JPanel {

    private static StockPanel instance;

    public static StockPanel getInstance() {
        if (instance == null) {
            instance = new StockPanel();
        }
        return instance;
    }

    public StockPanel() {
        initComponents();

        refreshAllGRN();
        loadAllViewGRN();
        loadStock(StockManagement.getAllStock());

        loadSuppliment();

        stockButton.setSelected(true);
        stockButton.setForeground(Colors.defaultBlue);
        stockButton.setBackground(Colors.defaultWhite);

        loadBrandName();
        loadType();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        grnButton = new javax.swing.JButton();
        stockButton = new javax.swing.JButton();
        viewGRNButton = new javax.swing.JButton();
        supplimentSettingBtn = new javax.swing.JButton();
        packagePanel = new javax.swing.JPanel();
        viewStockPanel = new javax.swing.JPanel();
        packageSettingPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        searchSuppliment = new javax.swing.JTextField();
        searchSupOnly = new javax.swing.JComboBox<>();
        searchSupplimentCombo = new javax.swing.JComboBox<>();
        refreshStock = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        sortSupCombo = new javax.swing.JComboBox<>();
        addPrice = new javax.swing.JButton();
        addPrice1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        grnPanel = new javax.swing.JPanel();
        refresh = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grnTable = new javax.swing.JTable();
        savePackage = new javax.swing.JButton();
        grnId = new javax.swing.JLabel();
        supplimentCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subTotal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        grnDiscount = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        netTotal = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        unitPrice = new javax.swing.JTextField();
        unitDiscount = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        grnDiscountCombo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        supplierCombo = new javax.swing.JComboBox<>();
        pay = new javax.swing.JButton();
        exp = new com.toedter.calendar.JDateChooser();
        mfd = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        GRNViewPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        viewGRNTabel = new javax.swing.JTable();
        recoveryPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewGRNItemTable = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        searchbyid = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        togrn = new com.toedter.calendar.JDateChooser();
        grnfrom = new com.toedter.calendar.JDateChooser();
        searchbtn = new javax.swing.JButton();
        searchByGrnId = new javax.swing.JButton();
        searchfromto = new javax.swing.JButton();
        supplimentPanel = new javax.swing.JPanel();
        packageSettingPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        supBrand = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        newBrand = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        supType = new javax.swing.JComboBox<>();
        newType = new javax.swing.JButton();
        supName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        updateSup = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        supTable = new javax.swing.JTable();
        saveSup = new javax.swing.JButton();
        refreshSup = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(29, 124, 167));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grnButton.setBackground(new java.awt.Color(29, 124, 167));
        grnButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        grnButton.setForeground(new java.awt.Color(255, 255, 255));
        grnButton.setText("GRN");
        buttonGroup1.add(grnButton);
        grnButton.setContentAreaFilled(false);
        grnButton.setFocusPainted(false);
        grnButton.setOpaque(true);
        grnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grnButtonActionPerformed(evt);
            }
        });
        jPanel1.add(grnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 170, 50));

        stockButton.setBackground(new java.awt.Color(29, 124, 167));
        stockButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        stockButton.setForeground(new java.awt.Color(255, 255, 255));
        stockButton.setText("Stock");
        buttonGroup1.add(stockButton);
        stockButton.setContentAreaFilled(false);
        stockButton.setFocusPainted(false);
        stockButton.setOpaque(true);
        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });
        jPanel1.add(stockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 50));

        viewGRNButton.setBackground(new java.awt.Color(29, 124, 167));
        viewGRNButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        viewGRNButton.setForeground(new java.awt.Color(255, 255, 255));
        viewGRNButton.setText("View GRN");
        buttonGroup1.add(viewGRNButton);
        viewGRNButton.setContentAreaFilled(false);
        viewGRNButton.setFocusPainted(false);
        viewGRNButton.setOpaque(true);
        viewGRNButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGRNButtonActionPerformed(evt);
            }
        });
        jPanel1.add(viewGRNButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 180, 50));

        supplimentSettingBtn.setBackground(new java.awt.Color(29, 124, 167));
        supplimentSettingBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        supplimentSettingBtn.setForeground(new java.awt.Color(255, 255, 255));
        supplimentSettingBtn.setText("Suppliment Setting");
        supplimentSettingBtn.setContentAreaFilled(false);
        supplimentSettingBtn.setFocusPainted(false);
        supplimentSettingBtn.setOpaque(true);
        supplimentSettingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplimentSettingBtnActionPerformed(evt);
            }
        });
        jPanel1.add(supplimentSettingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 180, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 50));

        packagePanel.setBackground(new java.awt.Color(255, 255, 255));
        packagePanel.setLayout(new java.awt.CardLayout());

        viewStockPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        packageSettingPanel1.setBackground(new java.awt.Color(255, 255, 255));
        packageSettingPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Packages", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Search Only");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 120, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Search by Suppliment");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, 30));

        searchSuppliment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchSuppliment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchSupplimentKeyReleased(evt);
            }
        });
        jPanel5.add(searchSuppliment, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 410, 30));

        searchSupOnly.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchSupOnly.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Available", "Empty", "Expired" }));
        searchSupOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSupOnlyActionPerformed(evt);
            }
        });
        searchSupOnly.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                searchSupOnlyPropertyChange(evt);
            }
        });
        jPanel5.add(searchSupOnly, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 150, 30));

        searchSupplimentCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchSupplimentCombo.setOpaque(false);
        searchSupplimentCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSupplimentComboActionPerformed(evt);
            }
        });
        jPanel5.add(searchSupplimentCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 430, 30));

        refreshStock.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        refreshStock.setForeground(new java.awt.Color(29, 124, 167));
        refreshStock.setText("Refresh");
        refreshStock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        refreshStock.setContentAreaFilled(false);
        refreshStock.setFocusPainted(false);
        refreshStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshStockActionPerformed(evt);
            }
        });
        jPanel5.add(refreshStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 120, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Sort By");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 100, 30));

        sortSupCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        sortSupCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suppliment", "Expire Soon", "Expire Last", "Stock" }));
        sortSupCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortSupComboActionPerformed(evt);
            }
        });
        jPanel5.add(sortSupCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 60, 190, 30));

        addPrice.setBackground(new java.awt.Color(255, 255, 255));
        addPrice.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        addPrice.setForeground(new java.awt.Color(29, 124, 167));
        addPrice.setText("Add Price");
        addPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        addPrice.setContentAreaFilled(false);
        jPanel5.add(addPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, 40));

        addPrice1.setBackground(new java.awt.Color(255, 255, 255));
        addPrice1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        addPrice1.setForeground(new java.awt.Color(29, 124, 167));
        addPrice1.setText("Add Price");
        addPrice1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        addPrice1.setContentAreaFilled(false);
        addPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPrice1ActionPerformed(evt);
            }
        });
        jPanel5.add(addPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 90, 120, 30));

        packageSettingPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1170, 130));

        stockTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        stockTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stock ID", "Brand", "Suppliment", "MFD", "EXP", "Buying Price", "Selling Price", "Profit", "QTY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockTable.setGridColor(new java.awt.Color(29, 124, 167));
        stockTable.setRowHeight(20);
        stockTable.setSelectionBackground(new java.awt.Color(29, 124, 167));
        stockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(stockTable);

        packageSettingPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1170, 440));

        viewStockPanel.add(packageSettingPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 640));

        packagePanel.add(viewStockPanel, "card4");

        grnPanel.setBackground(new java.awt.Color(255, 255, 255));
        grnPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refresh.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        refresh.setForeground(new java.awt.Color(29, 124, 167));
        refresh.setText("Cancel GRN");
        refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        refresh.setContentAreaFilled(false);
        refresh.setFocusPainted(false);
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        grnPanel.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 180, 40));

        remove.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 0, 0));
        remove.setText("Remove Item");
        remove.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        remove.setContentAreaFilled(false);
        remove.setFocusPainted(false);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        grnPanel.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 530, 180, 40));

        grnTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        grnTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        grnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SupplimentID", "Suppliment", "MFD", "EXP", "Unit Price", "Unit Discount", "QTY", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grnTable.setGridColor(new java.awt.Color(29, 124, 167));
        grnTable.setRowHeight(20);
        grnTable.setSelectionBackground(new java.awt.Color(29, 124, 167));
        grnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grnTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grnTable);
        if (grnTable.getColumnModel().getColumnCount() > 0) {
            grnTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            grnTable.getColumnModel().getColumn(1).setPreferredWidth(9);
            grnTable.getColumnModel().getColumn(2).setPreferredWidth(4);
            grnTable.getColumnModel().getColumn(3).setPreferredWidth(4);
            grnTable.getColumnModel().getColumn(5).setPreferredWidth(4);
            grnTable.getColumnModel().getColumn(6).setPreferredWidth(1);
            grnTable.getColumnModel().getColumn(7).setPreferredWidth(5);
        }

        grnPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 1160, 230));

        savePackage.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        savePackage.setForeground(new java.awt.Color(29, 124, 167));
        savePackage.setText("Add");
        savePackage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        savePackage.setContentAreaFilled(false);
        savePackage.setFocusPainted(false);
        savePackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePackageActionPerformed(evt);
            }
        });
        grnPanel.add(savePackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 190, 150, 40));

        grnId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        grnId.setForeground(new java.awt.Color(29, 124, 167));
        grnPanel.add(grnId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 160, 30));

        supplimentCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supplimentCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        supplimentCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplimentComboActionPerformed(evt);
            }
        });
        supplimentCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                supplimentComboPropertyChange(evt);
            }
        });
        grnPanel.add(supplimentCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 430, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MFD");
        grnPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 140, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("EXP");
        grnPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Suppliment");
        grnPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("GRN ID");
        grnPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 70, 30));

        subTotal.setEditable(false);
        subTotal.setBackground(new java.awt.Color(255, 255, 255));
        subTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        subTotal.setForeground(new java.awt.Color(29, 124, 167));
        subTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subTotal.setBorder(null);
        grnPanel.add(subTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 470, 210, 50));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Sub Total");
        grnPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 120, 30));

        grnDiscount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        grnDiscount.setText("0.0");
        grnDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                grnDiscountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                grnDiscountKeyTyped(evt);
            }
        });
        grnPanel.add(grnDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 530, 160, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("GRN Discount");
        grnPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, 120, 30));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setText("Net Total");
        grnPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 580, 120, 30));

        netTotal.setEditable(false);
        netTotal.setBackground(new java.awt.Color(255, 255, 255));
        netTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        netTotal.setForeground(new java.awt.Color(29, 124, 167));
        netTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        netTotal.setBorder(null);
        grnPanel.add(netTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 570, 210, 50));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Unit Discount");
        grnPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, 150, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Unit Price");
        grnPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 160, 30));

        unitPrice.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        unitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unitPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unitPriceKeyTyped(evt);
            }
        });
        grnPanel.add(unitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 160, 30));

        unitDiscount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        unitDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unitDiscountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unitDiscountKeyTyped(evt);
            }
        });
        grnPanel.add(unitDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 150, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Amount");
        grnPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 120, 150, 30));

        amount.setEditable(false);
        amount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        grnPanel.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 150, 150, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("QTY");
        grnPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 90, 30));

        qty.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });
        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyKeyTyped(evt);
            }
        });
        grnPanel.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 50, 30));

        grnDiscountCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grnDiscountCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LKR", "%" }));
        grnDiscountCombo.setToolTipText("");
        grnDiscountCombo.setFocusable(false);
        grnDiscountCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                grnDiscountComboItemStateChanged(evt);
            }
        });
        grnPanel.add(grnDiscountCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 530, 50, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Supplier");
        grnPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 100, 30));

        supplierCombo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        supplierCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        supplierCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboActionPerformed(evt);
            }
        });
        supplierCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                supplierComboPropertyChange(evt);
            }
        });
        grnPanel.add(supplierCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, 290, 30));

        pay.setBackground(new java.awt.Color(29, 124, 167));
        pay.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        pay.setForeground(new java.awt.Color(255, 255, 255));
        pay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        pay.setContentAreaFilled(false);
        pay.setFocusPainted(false);
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        grnPanel.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 180, 40));

        exp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grnPanel.add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 140, 30));

        mfd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grnPanel.add(mfd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 140, 30));

        jLabel1.setBackground(new java.awt.Color(29, 124, 167));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pay");
        jLabel1.setOpaque(true);
        grnPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 180, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Clear GRN Item");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        grnPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 150, 40));

        packagePanel.add(grnPanel, "card2");

        GRNViewPanel.setBackground(new java.awt.Color(255, 255, 255));
        GRNViewPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 1, true), "GRNs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(29, 124, 167))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewGRNTabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewGRNTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GRN ID", "Supplier", "Sub Total", "GRN Discount", "Net Total", "Date", "Entered By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewGRNTabel.setRowHeight(22);
        viewGRNTabel.setRowMargin(2);
        viewGRNTabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewGRNTabelMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(viewGRNTabel);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1140, 230));

        GRNViewPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1190, 280));

        recoveryPanel.setBackground(new java.awt.Color(255, 255, 255));
        recoveryPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(27, 124, 167), 1, true), "GRN Items", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(27, 124, 167))); // NOI18N
        recoveryPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewGRNItemTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewGRNItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Suppliment ID", "Suppliment Name", "Unit Price", "Unit Discount", "QTY", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewGRNItemTable.setRowHeight(22);
        viewGRNItemTable.setRowMargin(2);
        viewGRNItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewGRNItemTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(viewGRNItemTable);

        recoveryPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1140, 250));

        GRNViewPanel.add(recoveryPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 1190, 300));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Search by GRN ID");
        GRNViewPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 30));

        searchbyid.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        searchbyid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchbyidFocusGained(evt);
            }
        });
        searchbyid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbyidKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchbyidKeyTyped(evt);
            }
        });
        GRNViewPanel.add(searchbyid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 150, 30));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("From");
        GRNViewPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 70, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("To");
        GRNViewPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 30, 30));

        togrn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GRNViewPanel.add(togrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 170, 30));

        grnfrom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        grnfrom.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                grnfromFocusGained(evt);
            }
        });
        GRNViewPanel.add(grnfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 170, 30));

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(29, 124, 167));
        searchbtn.setText("Refresh");
        searchbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        searchbtn.setContentAreaFilled(false);
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        GRNViewPanel.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, 140, 50));

        searchByGrnId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchIcon.png"))); // NOI18N
        searchByGrnId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByGrnIdActionPerformed(evt);
            }
        });
        GRNViewPanel.add(searchByGrnId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 30, 30));

        searchfromto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searchIcon.png"))); // NOI18N
        searchfromto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfromtoActionPerformed(evt);
            }
        });
        GRNViewPanel.add(searchfromto, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 30, 30));

        packagePanel.add(GRNViewPanel, "card3");

        supplimentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        packageSettingPanel2.setBackground(new java.awt.Color(255, 255, 255));
        packageSettingPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        packageSettingPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 60, 10, 100));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        packageSettingPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 60, 10, 100));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Suppliments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel6.add(supBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 320, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Brand");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 30));

        newBrand.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        newBrand.setText("Add New");
        newBrand.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        newBrand.setFocusPainted(false);
        newBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBrandActionPerformed(evt);
            }
        });
        jPanel6.add(newBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 110, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Type");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 60, 30));

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
        jPanel6.add(supType, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 290, 30));

        newType.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        newType.setText("Add New");
        newType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        newType.setFocusPainted(false);
        newType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTypeActionPerformed(evt);
            }
        });
        jPanel6.add(newType, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 110, 30));

        supName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel6.add(supName, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 80, 310, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Suppliment Name");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 150, 30));

        packageSettingPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 1130, 140));

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
        packageSettingPanel2.add(updateSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 180, 40));

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
        jScrollPane5.setViewportView(supTable);

        packageSettingPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 1130, 370));

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
        packageSettingPanel2.add(saveSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 180, 40));

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
        packageSettingPanel2.add(refreshSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 180, 40));

        supplimentPanel.add(packageSettingPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 640));

        packagePanel.add(supplimentPanel, "card4");

        add(packagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1240, 640));
    }// </editor-fold>//GEN-END:initComponents

    public void loadStock(ResultSet rs) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) stockTable.getModel();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
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
    
    public void loadExpiredStock(ResultSet rs) {
        try {
            DefaultTableModel dtm = (DefaultTableModel) stockTable.getModel();
            dtm.setRowCount(0);
                 SimpleDateFormat sdf = new SimpleDateFormat("MMM-dd-YYYY");
            while (rs.next()) {
                 Date expDate = sdf.parse(rs.getString("supplimentstock.exp"));

                if (expDate.after(new Date())) {
                Vector v = new Vector();
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    char c;

    ResultSet rs_allSuppliment;

    public void loadSuppliment() {
        rs_allSuppliment = SupplimentManagement.getAllSuppliment();
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        dcm.removeAllElements();
        dcm.addElement("Select a Suppliment");
        try {
            while (rs_allSuppliment.next()) {
                dcm.addElement(rs_allSuppliment.getString("brand") + "-" + rs_allSuppliment.getString("supplimentname"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        supplimentCombo.setModel(dcm);
    }

    ResultSet rs_allSupplier;

    public void loadSupplier() {
        rs_allSupplier = SupplierManagement.getAllSupplier();
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        dcm.removeAllElements();
        dcm.addElement("Select a Supplier");
        try {
            while (rs_allSupplier.next()) {
                dcm.addElement(rs_allSupplier.getString("name"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        supplierCombo.setModel(dcm);
    }

    public void refreshGRNUp() {
        loadSuppliment();
        mfd.setCalendar(null);
        exp.setCalendar(null);
        unitPrice.setText(null);
        qty.setText(null);
        unitDiscount.setText(null);
        amount.setText(null);

        setGRNId();
        loadAllViewGRN();
    }

    public void refreshAllGRN() {
        refreshGRNUp();
        loadSupplier();
        subTotal.setText(null);
        netTotal.setText(null);
        grnDiscount.setText(null);
        grnDiscountCombo.setSelectedIndex(0);
        subTot = 0.0;
        netTot = 0.0;

        DefaultTableModel dtm = (DefaultTableModel) grnTable.getModel();
        dtm.setRowCount(0);
    }

    public void setGRNId() {
        grnId.setText(String.valueOf(GRNManagement.getGRNId()));
    }

    ResultSet rs_allViewGrn;

    public void loadAllViewGRN() {
        try {
            rs_allViewGrn = GRNManagement.getAllGRN();

            DefaultTableModel dtm = (DefaultTableModel) viewGRNTabel.getModel();
            dtm.setRowCount(0);

            while (rs_allViewGrn.next()) {
                Vector v = new Vector();
                v.add(rs_allViewGrn.getString("idgrn"));
                v.add(rs_allViewGrn.getString("suppliername"));
                v.add(rs_allViewGrn.getString("subtotal"));
                v.add(rs_allViewGrn.getString("grndiscount"));
//                v.add((Double.parseDouble(rs_allViewGrn.getString("subtotal"))-Double.parseDouble(rs_allViewGrn.getString("nettotal"))));
                v.add(rs_allViewGrn.getString("nettotal"));
                v.add(rs_allViewGrn.getString("date"));
                v.add(rs_allViewGrn.getString("usersname"));
                dtm.addRow(v);
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }


    private void grnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grnButtonActionPerformed
        unselectButton();

        grnButton.setBackground(Colors.defaultWhite);
        grnButton.setForeground(Colors.defaultBlue);

        packagePanel.removeAll();
        packagePanel.add(grnPanel);
        packagePanel.repaint();
        packagePanel.revalidate();
        packagePanel.setVisible(true);
    }//GEN-LAST:event_grnButtonActionPerformed

    public void unselectButton() {
        stockButton.setBackground(Colors.defaultBlue);
        stockButton.setForeground(Colors.defaultWhite);
        grnButton.setBackground(Colors.defaultBlue);
        grnButton.setForeground(Colors.defaultWhite);
        viewGRNButton.setBackground(Colors.defaultBlue);
        viewGRNButton.setForeground(Colors.defaultWhite);
        supplimentSettingBtn.setBackground(Colors.defaultBlue);
        supplimentSettingBtn.setForeground(Colors.defaultWhite);
    }

    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockButtonActionPerformed
        unselectButton();

        stockButton.setBackground(Colors.defaultWhite);
        stockButton.setForeground(Colors.defaultBlue);

        packagePanel.removeAll();
        packagePanel.add(viewStockPanel);
        packagePanel.repaint();
        packagePanel.revalidate();
        packagePanel.setVisible(true);
    }//GEN-LAST:event_stockButtonActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        refreshAllGRN();

    }//GEN-LAST:event_refreshActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        selectedRow = grnTable.getSelectedRow();

        DefaultTableModel dtm_grn = (DefaultTableModel) grnTable.getModel();
        dtm_grn.removeRow(selectedRow);

        setSubTotal();
        setNetTotal();
    }//GEN-LAST:event_removeActionPerformed

    int selectedRow;
    Date mfdate, exdate;
    private void grnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grnTableMouseClicked
        if (evt.getClickCount() == 2) {
            try {
                selectedRow = grnTable.getSelectedRow();
                supplimentCombo.setSelectedItem(grnTable.getValueAt(selectedRow, 1));

                mfdate = new SimpleDateFormat("MMM-d-yyy").parse(grnTable.getValueAt(selectedRow, 2).toString());
                exdate = new SimpleDateFormat("MMM-d-yyy").parse(grnTable.getValueAt(selectedRow, 3).toString());

                mfd.setDate(mfdate);
                exp.setDate(exdate);

                unitPrice.setText(grnTable.getValueAt(selectedRow, 4).toString());
                qty.setText(grnTable.getValueAt(selectedRow, 6).toString());
                unitDiscount.setText(grnTable.getValueAt(selectedRow, 5).toString());
//                amount.setText(grnTable.getValueAt(selectedRow, 7).toString());
                setAmount();

                DefaultTableModel dtm_grn = (DefaultTableModel) grnTable.getModel();
                dtm_grn.removeRow(selectedRow);

                setSubTotal();
                setNetTotal();
            } catch (ParseException ex) {
                Logger.getLogger(StockPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_grnTableMouseClicked

    public void setAmount() {
        double quantity = 0.0;
        double unitDisc = 0.0;
        double unitPrc = Double.parseDouble(unitPrice.getText());

        if (!qty.getText().isEmpty()) {
            quantity = Double.parseDouble(qty.getText());
        }
        if (!unitDiscount.getText().isEmpty()) {
            unitDisc = Double.parseDouble(unitDiscount.getText());
        }

        amount.setText(String.valueOf((unitPrc - unitDisc) * quantity));
    }

    ResultSet rs_supId, rs_sppl;
    int supId, suplId, unitPrc, supqty, unitDict;
    boolean isRowAlready = false;
    double unitD = 0.0;

    private void savePackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePackageActionPerformed
        addToTable();
    }//GEN-LAST:event_savePackageActionPerformed

    public void addToTable() {
        if (supplierCombo.getSelectedIndex() != 0) {
            if (supplimentCombo.getSelectedIndex() != 0) {

                if (!(mfd.getDate() == null || exp.getDate() == null)) {

                    if (!(unitPrice.getText().trim().equals("") || qty.getText().trim().equals(""))) {
                        try {
                            unitD = 0.0;
                            rs_supId = SupplimentManagement.getSelectedSupplimentID(supplimentCombo.getSelectedItem().toString());
                            rs_sppl = SupplierManagement.getSupplierId(supplierCombo.getSelectedItem().toString());
                            if (rs_supId.next()) {
                                supId = Integer.parseInt(rs_supId.getString("idsuppliment"));
                            }
                            if (rs_sppl.next()) {
                                suplId = Integer.parseInt(rs_sppl.getString("idsupplier"));
                            }
                            isRowAlready = false;
                            DefaultTableModel dtm = (DefaultTableModel) grnTable.getModel();
                            SimpleDateFormat sdf = new SimpleDateFormat("MMM-dd-YYYY");
                            String mfdate = sdf.format(mfd.getDate());
                            String expdate = sdf.format(exp.getDate());

                            if (!unitDiscount.getText().trim().equals("")) {
                                unitD = Double.parseDouble(unitDiscount.getText());
                            }

                            for (int i = 0; i < grnTable.getRowCount(); i++) {

                                if ((supplimentCombo.getSelectedItem().toString() + mfdate + expdate
                                        + unitPrice.getText() + unitD).equals(grnTable.getValueAt(i, 1).toString()
                                        + grnTable.getValueAt(i, 2).toString() + grnTable.getValueAt(i, 3).toString()
                                        + grnTable.getValueAt(i, 4).toString() + grnTable.getValueAt(i, 5).toString())) {
                                    System.out.println("OLD");
                                    isRowAlready = true;
                                    grnTable.setValueAt(Double.parseDouble(grnTable.getValueAt(i, 6).toString()) + Double.parseDouble(qty.getText()), i, 6);
                                    grnTable.setValueAt(
                                            (Double.parseDouble(grnTable.getValueAt(i, 4).toString()) - Double.parseDouble(grnTable.getValueAt(i, 5).toString())) * Double.parseDouble(grnTable.getValueAt(i, 6).toString()), i, 7);
                                    break;

                                }

                            }

                            if (!isRowAlready) {
                                System.out.println("NEW");
                                Vector v = new Vector();
                                v.add(String.valueOf(supId));
                                v.add(supplimentCombo.getSelectedItem().toString());
                                v.add(mfdate);
                                v.add(expdate);
                                v.add(unitPrice.getText());
                                v.add(unitD);
                                v.add(qty.getText());
                                v.add(amount.getText());
                                dtm.addRow(v);

                            }

                            if (!subTotal.getText().equals("")) {
                                subTotal.setText(String.valueOf(Double.parseDouble(subTotal.getText()) + Double.parseDouble(amount.getText())));
                            } else {
                                subTotal.setText(amount.getText());
                            }
                            netTotal.setText(subTotal.getText());
                            refreshGRNUp();
                            setSubTotal();
                            setNetTotal();

                        } catch (SQLException ex) {
                            Logger.getLogger(StockPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Set Unit Price & QTY!", "Failed!", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Set MFD & EXP!", "Failed!", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Select a suppliment!", "Failed!", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Select a supplier!", "Failed!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void viewGRNItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewGRNItemTableMouseClicked

    }//GEN-LAST:event_viewGRNItemTableMouseClicked

    private void stockTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTableMouseClicked

    }//GEN-LAST:event_stockTableMouseClicked

    private void refreshStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshStockActionPerformed
        loadStock(StockManagement.getAllStock());
        searchSuppliment.setText(null);
        searchSupOnly.setSelectedIndex(0);
        sortSupCombo.setSelectedIndex(0);
    }//GEN-LAST:event_refreshStockActionPerformed

    private void viewGRNButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGRNButtonActionPerformed
        unselectButton();

        viewGRNButton.setBackground(Colors.defaultWhite);
        viewGRNButton.setForeground(Colors.defaultBlue);

        packagePanel.removeAll();
        packagePanel.add(GRNViewPanel);
        packagePanel.repaint();
        packagePanel.revalidate();
        packagePanel.setVisible(true);
    }//GEN-LAST:event_viewGRNButtonActionPerformed

    private void supplimentComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_supplimentComboPropertyChange

    }//GEN-LAST:event_supplimentComboPropertyChange

    private void supplimentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplimentComboActionPerformed

    }//GEN-LAST:event_supplimentComboActionPerformed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void supplierComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierComboActionPerformed

    private void supplierComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_supplierComboPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierComboPropertyChange

    int idGrn, idsupplimentgrn, idsupplimentstock;
    double unitDisct;
    GRNModel grnModel;
    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
      if(MainFrame.mainUserId != -1){
        idGrn = 0;
        idsupplimentgrn = 0;
        idsupplimentstock = 0;
        unitDisct = 0;

        grnModel = new GRNModel();

        idGrn = GRNManagement.getSavedGRN(grnModel.setIdsupplier(suplId).setSubTotal(Double.parseDouble(subTotal.getText()))
                .setNetTotal(Double.parseDouble(netTotal.getText())).setIduser(MainFrame.mainUserId));
        if (idGrn != -1) {
            for (int i = 0; i < grnTable.getRowCount(); i++) {
                grnModel = new GRNModel();
                grnModel.setIdgrn(idGrn).setIdsuppliment(Integer.parseInt(grnTable.getValueAt(i, 0).toString()))
                        .setQty(Double.parseDouble(grnTable.getValueAt(i, 6).toString())).setAmount(Double.parseDouble(grnTable.getValueAt(i, 4).toString()))
                        .setUnitdiscount(Double.parseDouble(grnTable.getValueAt(i, 5).toString()));
                idsupplimentgrn = GRNManagement.getSavedSupplimentGRN(grnModel);
            }
                if (idsupplimentgrn != -1) {
                    grnModel.setIdsupplimentgrn(idsupplimentgrn).setMfd(grnTable.getValueAt(i, 2).toString()).setExp(grnTable.getValueAt(i, 3).toString())
                            .setStockqty(Double.parseDouble(grnTable.getValueAt(i, 6).toString())).setSellingPrice(0.0);
                    idsupplimentstock = GRNManagement.getSavedStock(grnModel);
                    if (idsupplimentstock != -1) {
                        printGrn();
                        refreshAllGRN();
                        JOptionPane.showMessageDialog(this, "Seccessfully added!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
                }
            
        } else {
            JOptionPane.showMessageDialog(this, "Something went wrong!", "Failed!", JOptionPane.WARNING_MESSAGE);
        }
      }
    }//GEN-LAST:event_payActionPerformed

    private void unitPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitPriceKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (unitPrice.getText().trim().isEmpty() && evt.getKeyChar() == '.') {
            evt.consume();
        }
        if (unitPrice.getText().trim().contains(".") && evt.getKeyChar() == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_unitPriceKeyTyped

    private void qtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (qty.getText().trim().isEmpty() && evt.getKeyChar() == '.') {
            evt.consume();
        }
        if (qty.getText().trim().contains(".") && evt.getKeyChar() == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_qtyKeyTyped

    private void unitDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitDiscountKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (unitDiscount.getText().trim().isEmpty() && evt.getKeyChar() == '.') {
            evt.consume();
        }
        if (unitDiscount.getText().trim().contains(".") && evt.getKeyChar() == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_unitDiscountKeyTyped

    private void grnDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grnDiscountKeyTyped

        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (grnDiscount.getText().trim().isEmpty() && evt.getKeyChar() == '.') {
            evt.consume();
        }
        if (grnDiscount.getText().trim().contains(".") && evt.getKeyChar() == '.') {
            evt.consume();
        }
    }//GEN-LAST:event_grnDiscountKeyTyped

    private void unitPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitPriceKeyReleased

    }//GEN-LAST:event_unitPriceKeyReleased

    private void qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyReleased
//        amount.setText(String.valueOf(Double.parseDouble(unitPrice.getText()) * Double.parseDouble(qty.getText())));
        setAmount();
    }//GEN-LAST:event_qtyKeyReleased

    private void unitDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unitDiscountKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            addToTable();
        }
        setAmount();
    }//GEN-LAST:event_unitDiscountKeyReleased

    double grnDict;
    private void grnDiscountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grnDiscountKeyReleased
        if (!grnDiscount.getText().isEmpty()) {
            grnDict = Double.parseDouble(grnDiscount.getText().trim());
        } else {
            grnDict = 0.0;
        }
        if (grnDiscountCombo.getSelectedItem().equals("LKR")) {
            netTotal.setText(String.valueOf(Double.parseDouble(subTotal.getText()) - grnDict));
        } else {
            netTotal.setText(String.valueOf((Double.parseDouble(subTotal.getText()) * (100 - grnDict)) / 100));
        }
    }//GEN-LAST:event_grnDiscountKeyReleased

    private void grnDiscountComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_grnDiscountComboItemStateChanged
        grnDiscount.setText(null);
        setNetTotal();
    }//GEN-LAST:event_grnDiscountComboItemStateChanged

    ResultSet rs_grnitem;
    private void viewGRNTabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewGRNTabelMouseClicked
        try {
            if(viewGRNTabel.getSelectedRow() != -1){
            System.out.println("CLICKED");
            rs_grnitem = GRNManagement.getSelectedGRNItem(String.valueOf(viewGRNTabel.getValueAt(viewGRNTabel.getSelectedRow(), 0)));

            DefaultTableModel dtm = (DefaultTableModel) viewGRNItemTable.getModel();
            dtm.setRowCount(0);

            while (rs_grnitem.next()) {
                System.out.println("BADU HAVE");
                Vector v = new Vector();
                v.add(rs_grnitem.getString("idsuppliment"));
                v.add(rs_grnitem.getString("supname"));
                v.add(rs_grnitem.getString("amount"));
                v.add(rs_grnitem.getString("unitdiscount"));
                v.add(rs_grnitem.getString("supplimentgrn.qty"));
                v.add(rs_grnitem.getString("allamount"));
//                v.add(String.valueOf(Double.parseDouble(rs_grnitem.getString("amount"))*Double.parseDouble(rs_grnitem.getString("qty"))));
                dtm.addRow(v);
            }
            }
        } catch (Exception e) {
          e.printStackTrace();
        }
    }//GEN-LAST:event_viewGRNTabelMouseClicked

    private void searchbyidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbyidKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            chosenGRN();
        }
    }//GEN-LAST:event_searchbyidKeyReleased

    private void searchbyidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbyidKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbyidKeyTyped

    private void searchByGrnIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByGrnIdActionPerformed
        chosenGRN();
    }//GEN-LAST:event_searchByGrnIdActionPerformed

    public void chosenGRN() {
        try {
            rs_allViewGrn = GRNManagement.getAllGRNById(searchbyid.getText());

            DefaultTableModel dtm = (DefaultTableModel) viewGRNTabel.getModel();
            dtm.setRowCount(0);

            if (rs_allViewGrn.next()) {
                Vector v = new Vector();
                v.add(rs_allViewGrn.getString("idgrn"));
                v.add(rs_allViewGrn.getString("suppliername"));
                v.add(rs_allViewGrn.getString("subtotal"));
                v.add(rs_allViewGrn.getString("discount"));
//                v.add((Double.parseDouble(rs_allViewGrn.getString("subtotal"))-Double.parseDouble(rs_allViewGrn.getString("nettotal"))));
                v.add(rs_allViewGrn.getString("nettotal"));
                v.add(rs_allViewGrn.getString("date"));
                v.add(rs_allViewGrn.getString("usersname"));
                dtm.addRow(v);

                DefaultTableModel dtmview = (DefaultTableModel) viewGRNItemTable.getModel();
                dtmview.setRowCount(0);

                rs_grnitem = GRNManagement.getSelectedGRNItem(String.valueOf(viewGRNTabel.getValueAt(0, 0)));

                while (rs_grnitem.next()) {
                    Vector vv = new Vector();
                    vv.add(rs_grnitem.getString("idsuppliment"));
                    vv.add(rs_grnitem.getString("supname"));
                    vv.add(rs_grnitem.getString("amount"));
                    vv.add(rs_grnitem.getString("unitdiscount"));
                    vv.add(rs_grnitem.getString("supplimentgrn.qty"));
                    vv.add(rs_grnitem.getString("allamount"));
//                v.add(String.valueOf(Double.parseDouble(rs_grnitem.getString("amount"))*Double.parseDouble(rs_grnitem.getString("qty"))));
                    dtmview.addRow(vv);
                }
            } else {
                DefaultTableModel dtmview = (DefaultTableModel) viewGRNItemTable.getModel();
                dtmview.setRowCount(0);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchfromtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfromtoActionPerformed
        try {
            Date fromd = grnfrom.getDate();
            Date tod = togrn.getDate();
            String fromdt = new SimpleDateFormat("YYYY-MM-dd").format(fromd);
            System.out.println(fromdt);
            String todt = new SimpleDateFormat("YYYY-MM-dd").format(tod);
            System.out.println(todt);

            rs_allViewGrn = GRNManagement.getAllGRNByDate(fromdt, todt);

            DefaultTableModel dtm = (DefaultTableModel) viewGRNTabel.getModel();
            dtm.setRowCount(0);

            while (rs_allViewGrn.next()) {
                Vector v = new Vector();
                v.add(rs_allViewGrn.getString("idgrn"));
                v.add(rs_allViewGrn.getString("suppliername"));
                v.add(rs_allViewGrn.getString("subtotal"));
                v.add(rs_allViewGrn.getString("discount"));
//                v.add((Double.parseDouble(rs_allViewGrn.getString("subtotal"))-Double.parseDouble(rs_allViewGrn.getString("nettotal"))));
                v.add(rs_allViewGrn.getString("nettotal"));
                v.add(rs_allViewGrn.getString("date"));
                v.add(rs_allViewGrn.getString("usersname"));
                dtm.addRow(v);
            }

            DefaultTableModel dtmview = (DefaultTableModel) viewGRNItemTable.getModel();
            dtmview.setRowCount(0);

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_searchfromtoActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        searchbyid.setText(null);
        grnfrom.setDate(null);
        togrn.setDate(null);

        loadAllViewGRN();

        DefaultTableModel dtm = (DefaultTableModel) viewGRNItemTable.getModel();
        dtm.setRowCount(0);
    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchbyidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchbyidFocusGained
        grnfrom.setDate(null);
        togrn.setDate(null);
    }//GEN-LAST:event_searchbyidFocusGained

    private void grnfromFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_grnfromFocusGained
        searchbyid.setText(null);
    }//GEN-LAST:event_grnfromFocusGained
    String selectedSort;
    private void sortSupComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortSupComboActionPerformed
        selectedSort = sortSupCombo.getSelectedItem().toString();
        if (selectedSort.equals("Suppliment")) {
            loadStock(StockManagement.getAllStockSuppliment());
        } else if (selectedSort.equals("Expire Soon")) {
            loadStock(StockManagement.getAllExpiredStockSoon());
        } else if (selectedSort.equals("Expire Last")) {
            loadStock(StockManagement.getAllExpiredStockLate());
        } else {
            loadStock(StockManagement.getAllStock());
        }
    }//GEN-LAST:event_sortSupComboActionPerformed

    private void searchSupOnlyPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_searchSupOnlyPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_searchSupOnlyPropertyChange

    String selectedOnly;
    private void searchSupOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSupOnlyActionPerformed
        selectedOnly = searchSupOnly.getSelectedItem().toString();
        if (selectedOnly.equals("All")) {
            loadStock(StockManagement.getAllStock());
        } else if (selectedOnly.equals("Available")) {
            loadStock(StockManagement.getAllSAvailabletSock());
        } else if (selectedOnly.equals("Empty")) {
            loadStock(StockManagement.getAllEmptyStock());
        } else {
            loadExpiredStock(StockManagement.getAllStock());
        }
    }//GEN-LAST:event_searchSupOnlyActionPerformed

    ResultSet rs_suggest;
    int i = 0;
//    int x = 0;
    private void searchSupplimentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchSupplimentKeyReleased
        if (!searchSuppliment.getText().isEmpty()) {
            Vector v = new Vector();
            try {
                rs_suggest = StockManagement.getSockSuppliment(searchSuppliment.getText());
                while (rs_suggest.next()) {
                    searchSupplimentCombo.showPopup();
                    v.add(rs_suggest.getString("supname"));
                }
                DefaultComboBoxModel dcm = new DefaultComboBoxModel(v);
                searchSupplimentCombo.setModel(dcm);
                searchSupplimentCombo.showPopup();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            if (searchSupplimentCombo.getItemCount() != 0) {
                searchSupplimentCombo.showPopup();

//                int c = searchSupplimentCombo.getItemCount();
//                if (evt.getKeyCode() == 40) {
//                    i++;
//                    if (i == c) {
//                        i = 0;
//                    }
//                    searchSupplimentCombo.setSelectedIndex(i);
//                }
//
//                if (evt.getKeyCode() == 38) {
//                    i--;
//                    if (i == -1) {
//                        i = c - 1;
//                    }
//                    searchSupplimentCombo.setSelectedIndex(i);
//                }
                int c = searchSupplimentCombo.getItemCount();
                System.out.println("c " + c);
                if (evt.getKeyCode() == 40) {
                    i++;
                    if (i == c) {

                        i = 0;
                    }
                    System.out.println("i " + i);
                    searchSupplimentCombo.setSelectedIndex(i);
                }

                if (evt.getKeyCode() == 38) {
                    i--;
                    if (i == -1) {
                        i = c - 1;
                    }
//                            System.out.println("i "+ i);
                    searchSupplimentCombo.setSelectedIndex(i);
                }

                if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
//                        System.out.println(searchSupplimentCombo.getSelectedIndex());
//                    System.out.println(searchSupplimentCombo.getSelectedItem().toString());
                    System.out.println(i);
                    searchSupplimentCombo.setSelectedIndex(i);
                    searchSupplimentCombo.hidePopup();
                    i = 0;
                    searchSuppliment.setText(searchSupplimentCombo.getSelectedItem().toString());

                    loadStock(StockManagement.getSuggestSuppliment(searchSuppliment.getText()));
                }

            } else {
                searchSupplimentCombo.hidePopup();
            }
//            if (searchSupplimentCombo.getItemCount() != 0) {
//                searchSupplimentCombo.showPopup();
//
//                int c = searchSupplimentCombo.getItemCount();
//                if (evt.getKeyCode() == 40) {
//                    x++;
//                    if (x == c) {
//                        x = 0;
//                    }
//                    searchSupplimentCombo.setSelectedIndex(x);
//                }
//
//                if (evt.getKeyCode() == 38) {
//                    x--;
//                    if (x == -1) {
//                        x = c - 1;
//                    }
//                    searchSupplimentCombo.setSelectedIndex(x);
//                }
//                if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
//                    searchSupplimentCombo.setSelectedIndex(x);
//                    searchSupplimentCombo.hidePopup();
//                    x = 0;
//                    searchSuppliment.setText(searchSupplimentCombo.getSelectedItem().toString());
//
//                    loadStock(StockManagement.getSuggestSuppliment(searchSuppliment.getText()));
//                }
//
//            } else {
//                searchSupplimentCombo.hidePopup();
//            }
        } else {
            loadStock(StockManagement.getAllStock());
        }
//        loadStock(StockManagement.getSuggestSuppliment(searchSuppliment.getText()));
    }//GEN-LAST:event_searchSupplimentKeyReleased

    private void searchSupplimentComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSupplimentComboActionPerformed
//        searchSuppliment.setText(searchSupplimentCombo.getSelectedItem().toString());
    }//GEN-LAST:event_searchSupplimentComboActionPerformed

    private void supplimentSettingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplimentSettingBtnActionPerformed
        unselectButton();

        supplimentSettingBtn.setBackground(Colors.defaultWhite);
        supplimentSettingBtn.setForeground(Colors.defaultBlue);

        packagePanel.removeAll();
        packagePanel.add(supplimentPanel);
        packagePanel.repaint();
        packagePanel.revalidate();
        packagePanel.setVisible(true);
    }//GEN-LAST:event_supplimentSettingBtnActionPerformed

    private void supBrandItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_supBrandItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_supBrandItemStateChanged

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

    ResultSet rs_selectedBrand, rs_selectedType;
    int selectedBrandId, selectedTypeId;
    SupplimentModel supModel;
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
                    loadSuppliment();
                    refreshSup();
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

    public void refreshSup() {
        loadBrandName();
        loadType();
        loadSupTable();
        supName.setText(null);
        saveSup.setEnabled(true);
        updateSup.setEnabled(false);
    }

    ResultSet rs_allSup;

    public void loadSupTable() {
        DefaultTableModel dtm_sup = (DefaultTableModel) supTable.getModel();
        dtm_sup.setRowCount(0);
        rs_allSup = SupplimentManagement.getAllSuppliment();
        try {
            while (rs_allSup.next()) {
                Vector v_allSup = new Vector();
                v_allSup.add(rs_allSup.getString("idsuppliment"));
                v_allSup.add(rs_allSup.getString("brand"));
                v_allSup.add(rs_allSup.getString("type"));
                v_allSup.add(rs_allSup.getString("supplimentname"));
                dtm_sup.addRow(v_allSup);
            }
        } catch (Exception e) {
        }
    }

    ResultSet rs_typesNames;

    public void loadType() {
        try {
            supType.removeAllItems();
            supType.addItem("Select a Type");
            rs_typesNames = TypeManagement.getAllType();
            while (rs_typesNames.next()) {
                supType.addItem(rs_typesNames.getString("type"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    ResultSet rs_brandNames;

    public void loadBrandName() {
        try {
            supBrand.removeAllItems();
            supBrand.addItem("Select a Brand");
            rs_brandNames = BrandNameManagement.getAllBrand();
            while (rs_brandNames.next()) {
                supBrand.addItem(rs_brandNames.getString("brand"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

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
                    loadSuppliment();
                    refreshSup();
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

    private void refreshSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshSupActionPerformed
        refreshSup();
    }//GEN-LAST:event_refreshSupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refreshGRNUp();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPrice1ActionPerformed
        SetSellingPrice.getInstance().updateSellPrice(Integer.parseInt(stockTable.getValueAt(stockTable.getSelectedRow(), 0).toString()));
        SetSellingPrice.getInstance().setVisible(true);
    }//GEN-LAST:event_addPrice1ActionPerformed

    double subTot = 0;
    double netTot = 0;

    public void setSubTotal() {
        subTot = 0;
        DefaultTableModel dtm = (DefaultTableModel) grnTable.getModel();
        if (dtm.getRowCount() > 0) {
            for (int i = 0; i < grnTable.getRowCount(); i++) {
                subTot += Double.parseDouble(grnTable.getValueAt(i, 7).toString());
            }
            subTotal.setText(String.valueOf(subTot));
        } else {
            subTotal.setText("0");
        }

    }

    public void setNetTotal() {
        netTot = 0;
        if (grnDiscount.getText().isEmpty()) {
            netTotal.setText(subTotal.getText());
        } else {
            if (grnDiscountCombo.getSelectedItem().equals("LKR")) {
                netTotal.setText(String.valueOf(Double.parseDouble(subTotal.getText()) - Double.parseDouble(grnDiscount.getText())));
            } else {
                netTotal.setText(String.valueOf((Double.parseDouble(subTotal.getText()) * (100 - Double.parseDouble(grnDiscount.getText()))) / 100));
            }
        }
    }
    
        private void printGrn() {
        try {
            HashMap<String, Object> m = new HashMap();
            String i = String.valueOf(Integer.parseInt(grnId.getText()));
            System.out.println(i);
            m.put("grnId", i);
            InputStream is = StockPanel.class.getResourceAsStream("/Reports/BodyStation_Grn.jrxml");
            JasperReport report = JasperCompileManager.compileReport(is);

            JasperPrint print1 = JasperFillManager.fillReport(report, m, DB.getConnection());
            JasperViewer.viewReport(print1, false);
            JasperPrintManager.printReport(print1, true);

        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GRNViewPanel;
    private javax.swing.JButton addPrice;
    private javax.swing.JButton addPrice1;
    private javax.swing.JTextField amount;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser exp;
    private javax.swing.JButton grnButton;
    private javax.swing.JTextField grnDiscount;
    private javax.swing.JComboBox<String> grnDiscountCombo;
    private javax.swing.JLabel grnId;
    private javax.swing.JPanel grnPanel;
    private javax.swing.JTable grnTable;
    private com.toedter.calendar.JDateChooser grnfrom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private com.toedter.calendar.JDateChooser mfd;
    private javax.swing.JTextField netTotal;
    private javax.swing.JButton newBrand;
    private javax.swing.JButton newType;
    private javax.swing.JPanel packagePanel;
    private javax.swing.JPanel packageSettingPanel1;
    private javax.swing.JPanel packageSettingPanel2;
    private javax.swing.JButton pay;
    private javax.swing.JTextField qty;
    private javax.swing.JPanel recoveryPanel;
    private javax.swing.JButton refresh;
    private javax.swing.JButton refreshStock;
    private javax.swing.JButton refreshSup;
    private javax.swing.JButton remove;
    private javax.swing.JButton savePackage;
    private javax.swing.JButton saveSup;
    private javax.swing.JButton searchByGrnId;
    private javax.swing.JComboBox<String> searchSupOnly;
    private javax.swing.JTextField searchSuppliment;
    private javax.swing.JComboBox<String> searchSupplimentCombo;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchbyid;
    private javax.swing.JButton searchfromto;
    private javax.swing.JComboBox<String> sortSupCombo;
    private javax.swing.JButton stockButton;
    private javax.swing.JTable stockTable;
    private javax.swing.JTextField subTotal;
    private javax.swing.JComboBox<String> supBrand;
    private javax.swing.JTextField supName;
    private javax.swing.JTable supTable;
    private javax.swing.JComboBox<String> supType;
    private javax.swing.JComboBox<String> supplierCombo;
    private javax.swing.JComboBox<String> supplimentCombo;
    private javax.swing.JPanel supplimentPanel;
    private javax.swing.JButton supplimentSettingBtn;
    private com.toedter.calendar.JDateChooser togrn;
    private javax.swing.JTextField unitDiscount;
    private javax.swing.JTextField unitPrice;
    private javax.swing.JButton updateSup;
    private javax.swing.JButton viewGRNButton;
    private javax.swing.JTable viewGRNItemTable;
    private javax.swing.JTable viewGRNTabel;
    private javax.swing.JPanel viewStockPanel;
    // End of variables declaration//GEN-END:variables
}
