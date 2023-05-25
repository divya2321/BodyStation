package GUI;

import Database.DB;
import Database.Tables.AccountManagement;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class AccountLoginFrame extends javax.swing.JFrame {

    private static AccountLoginFrame instance = null;

    public static synchronized AccountLoginFrame getInstance() {
        if (instance == null) {
            instance = new AccountLoginFrame();
        }
        return instance;
    }

    public AccountLoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginUsername = new com.alee.laf.text.WebTextField();
        loginPassword = new com.alee.laf.text.WebPasswordField();
        jLabel2 = new javax.swing.JLabel();
        loginWarninglbl = new javax.swing.JLabel();
        loginForgetLbl = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(29, 124, 167));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TBS");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 280));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 124, 167), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        loginUsername.setInputPrompt("Username");
        loginUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                loginUsernameFocusLost(evt);
            }
        });
        loginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsernameActionPerformed(evt);
            }
        });
        loginUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginUsernameKeyTyped(evt);
            }
        });
        jPanel1.add(loginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 310, 40));

        loginPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        loginPassword.setInputPrompt("Password");
        loginPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginPasswordFocusGained(evt);
            }
        });
        loginPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                loginPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(loginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 124, 167));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login To Your Account");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 310, 30));

        loginWarninglbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        loginWarninglbl.setForeground(new java.awt.Color(255, 0, 0));
        loginWarninglbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(loginWarninglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 310, 20));

        loginForgetLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        loginForgetLbl.setForeground(new java.awt.Color(29, 124, 167));
        loginForgetLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        loginForgetLbl.setText("Forgot your password?");
        loginForgetLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginForgetLblMouseClicked(evt);
            }
        });
        jPanel1.add(loginForgetLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 190, 20));

        cancelBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 0, 0));
        cancelBtn.setText("cancel");
        cancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        cancelBtn.setContentAreaFilled(false);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 110, 40));

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(29, 124, 167));
        loginBtn.setText("login");
        loginBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        loginBtn.setContentAreaFilled(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 390, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUsernameActionPerformed

    private void loginPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginPasswordFocusGained
        if (loginUsername.getText().isEmpty() || loginUsername.getText().equals("")) {
            loginUsername.grabFocus();
            JOptionPane.showMessageDialog(this, "Username required!", "Alert!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_loginPasswordFocusGained

    private void loginUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginUsernameKeyTyped
        if (loginUsername.getText().length() == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_loginUsernameKeyTyped

    private void loginUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginUsernameFocusLost

    }//GEN-LAST:event_loginUsernameFocusLost

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private static String usernamePassword;
    private static int i = 3;
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        try {

            String username = loginUsername.getText();
            String password = String.valueOf(loginPassword.getPassword());
            if (!username.isEmpty()) {

                Loggers.Log4JTest.exceptionLogger();
                Logger logger = Logger.getLogger("Login");

                if (AccountManagement.isSuperAdmin(username, password)) {
                    logger.info(username + " loging to system");
                    this.dispose();
                    MainFrame mainFrame = MainFrame.getInstance();
                    mainFrame.setVisible(true);
                            mainFrame.setUsername("Admin");
                } else {
                    usernamePassword = AccountManagement.getPassword(username.trim());

                    if (!usernamePassword.equals("ERRORPASSWORD") && !usernamePassword.equals("ACCOUNTDEACT")) {

                        if (usernamePassword.equals(String.valueOf(password))) {

                            if (AccountManagement.deactivateAllCurrentStatus()) {
                                if (AccountManagement.activateCurrentStatus(username.trim())) {
                                    if (AccountManagement.saveLoginUserLog(AccountManagement.getUserAccountId(username.trim()))) {
                                        logger.info(username + " loging to system");
                                        this.dispose();
                                        MainFrame mainFrame = MainFrame.getInstance();
                                        mainFrame.setVisible(true);
                                        mainFrame.setUsername(AccountManagement.fname);
                                        mainFrame.setUserId(username.trim());
                                    }
                                }
                            }

                        } else {

                            if (i != 0) {
                                System.out.println("E");
                                logger.warn(username + " trying to login with password " + password );
                                loginWarninglbl.setText("You have " + (i - 1) + "more attempts!");
                                i--;
                            } else {
                                if (AccountManagement.deactivateAccount(username.trim())) {
                                    loginForgetLbl.setVisible(false);
                                    logger.info(username + " user account has been locked!");
                                    JOptionPane.showMessageDialog(this, "Your account has been locked!", "Locked!", JOptionPane.WARNING_MESSAGE);

                                }
                            }
                        }

                    } else if (usernamePassword.equals("ERRORPASSWORD")) {
                        System.out.println("H");
                        System.out.println("");
                        logger.warn("Someone trying to login with username " + username);
                        JOptionPane.showMessageDialog(this, "This account does NOT exists!", "Failed!", JOptionPane.WARNING_MESSAGE);

                    } else if (usernamePassword.equals("ACCOUNTDEACT")) {
                        System.out.println("I");
                         logger.info(username + " user account has been deactivated!");
                        JOptionPane.showMessageDialog(this, "Your account has been deactivated!", "Failed!", JOptionPane.WARNING_MESSAGE);

                    }
                }
            }

        } catch (Exception e) {
           e.printStackTrace();
        }

    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPasswordKeyTyped
        if (loginPassword.getPassword().length == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_loginPasswordKeyTyped

    private void loginForgetLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginForgetLblMouseClicked
        ForgotPasswordFrame fpf = ForgotPasswordFrame.getInstance();
        fpf.setVisible(true);
    }//GEN-LAST:event_loginForgetLblMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AccountLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginForgetLbl;
    private com.alee.laf.text.WebPasswordField loginPassword;
    private com.alee.laf.text.WebTextField loginUsername;
    private javax.swing.JLabel loginWarninglbl;
    // End of variables declaration//GEN-END:variables
}
