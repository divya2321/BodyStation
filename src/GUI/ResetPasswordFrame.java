package GUI;

import Database.Tables.AccountManagement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ResetPasswordFrame extends javax.swing.JFrame {

    private static ResetPasswordFrame instance = null;

    public static synchronized ResetPasswordFrame getInstance(String username, String hint, String answer) {
        if (instance == null) {
            instance = new ResetPasswordFrame();
            recievedUsername = username;
            recievedHint = hint; 
            recievedAns = answer;
            
            System.out.println(recievedUsername);
//            onLoadingResetPAsswords

        }
        return instance;
    }

    private static String recievedUsername, recievedHint, recievedAns;

    public ResetPasswordFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        resetPasswordBtn.setVisible(false);
        
        
    }

    public void onLoadingResetPAssword() {
        titleLbl.setText("  Reset Password? " + recievedUsername);
        accountRecoverHit.setText(recievedHint);
        
        accountPassword.setText(null);
        accountPaswordConfirm.setText(null);
        accountRecoverHit.setEditable(false);
        accountRecoverAnswer.setEditable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        accountPassword = new com.alee.laf.text.WebPasswordField();
        accountPasswordNNote = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        accountPaswordConfirm = new com.alee.laf.text.WebPasswordField();
        accountPaswordConfirmNote = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        resetPasswordBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        accountRecoverHit = new com.alee.laf.text.WebTextField();
        jLabel12 = new javax.swing.JLabel();
        accountRecoverAnswer = new com.alee.laf.text.WebPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 124, 167), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(accountPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 340, 40));

        accountPasswordNNote.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accountPasswordNNote.setForeground(new java.awt.Color(255, 0, 0));
        accountPasswordNNote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountPasswordNNote.setText("Invalid Password. Please try again.");
        jPanel1.add(accountPasswordNNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 320, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(29, 124, 167));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Confim Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 130, -1));

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
        jPanel1.add(accountPaswordConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 340, 40));

        accountPaswordConfirmNote.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accountPaswordConfirmNote.setForeground(new java.awt.Color(255, 0, 0));
        accountPaswordConfirmNote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        accountPaswordConfirmNote.setText("Password is not matching. Check your capslock is on.");
        jPanel1.add(accountPaswordConfirmNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 320, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(29, 124, 167));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Max character count is 8.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 340, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(29, 124, 167));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Must contain uppercase letter, lowercase letter and number.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 340, -1));

        titleLbl.setBackground(new java.awt.Color(29, 124, 167));
        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setText("  Reset Password?");
        titleLbl.setOpaque(true);
        jPanel1.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        resetPasswordBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        resetPasswordBtn.setForeground(new java.awt.Color(29, 124, 167));
        resetPasswordBtn.setText("Reset Password");
        resetPasswordBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        resetPasswordBtn.setContentAreaFilled(false);
        resetPasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPasswordBtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetPasswordBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 130, 40));

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
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 140, 40));

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
        jPanel1.add(accountRecoverHit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 340, 40));

        jLabel12.setForeground(new java.awt.Color(29, 124, 167));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Use simple hint and short answer to recover your account when need.");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 340, -1));

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
        jPanel1.add(accountRecoverAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 220, 40));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Eg: Woofy");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 70, -1));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Eg: My dog name                                                ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            JOptionPane.showMessageDialog(this, "Password field cannot be empty!", "Warning!", JOptionPane.WARNING_MESSAGE);
            accountPasswordNNote.setVisible(true);
        }
    }//GEN-LAST:event_accountPasswordFocusLost

    private void accountPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountPasswordKeyTyped
        if (accountPassword.getPassword().length == 8) {
            evt.consume();
        }

        if (accountPassword.getPassword().length == 0) {
            accountPasswordNNote.setVisible(false);
            resetPasswordBtn.setVisible(false);
        }
    }//GEN-LAST:event_accountPasswordKeyTyped

    private void accountPaswordConfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountPaswordConfirmKeyReleased
        String passwordConfirm = String.valueOf(accountPaswordConfirm.getPassword());
        if (passwordConfirm.length() == passwordLength) {
            evt.consume();
            if (String.valueOf(accountPassword.getPassword()).equals(passwordConfirm)) {
//                resetPasswordBtn.setVisible(true);
                    accountRecoverHit.setEditable(true);
            } else {
                accountPaswordConfirmNote.setVisible(true);
                accountPaswordConfirm.grabFocus();
                accountPaswordConfirm.selectAll();
            }
        }
    }//GEN-LAST:event_accountPaswordConfirmKeyReleased

    private void accountPaswordConfirmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountPaswordConfirmKeyTyped
        if (accountPaswordConfirm.getPassword().length != 8) {
            accountPaswordConfirmNote.setVisible(false);
            resetPasswordBtn.setVisible(false);
        }
    }//GEN-LAST:event_accountPaswordConfirmKeyTyped

    private static String resetPassword;
    private void resetPasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPasswordBtnActionPerformed
        try {
            resetPassword = Encription.Encript.encript(String.valueOf(accountPassword.getPassword()));

            if (AccountManagement.changePassword(recievedUsername, resetPassword)) {
                JOptionPane.showMessageDialog(this, "Successfully changed password. Please log again!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
                accountPassword.setText(null);
                accountPaswordConfirm.setText(null);
                this.dispose();
                AccountLoginFrame alf = AccountLoginFrame.getInstance();
                alf.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Somethin went wrong. Please try again!", "Failed!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_resetPasswordBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void accountRecoverHitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountRecoverHitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accountRecoverHitActionPerformed

    private void accountRecoverHitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountRecoverHitKeyTyped
        if (accountRecoverHit.getText().trim().equals("")) {
            accountRecoverAnswer.setText(null);
            resetPasswordBtn.setVisible(false);
        }
    }//GEN-LAST:event_accountRecoverHitKeyTyped

    private void accountRecoverAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountRecoverAnswerKeyReleased

    }//GEN-LAST:event_accountRecoverAnswerKeyReleased

    private void accountRecoverAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountRecoverAnswerKeyTyped
        if (String.valueOf(accountRecoverAnswer.getPassword()).trim().equals("")) {
            resetPasswordBtn.setVisible(false);
        } else {
            resetPasswordBtn.setVisible(true);
        }
    }//GEN-LAST:event_accountRecoverAnswerKeyTyped

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
            java.util.logging.Logger.getLogger(ResetPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResetPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResetPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResetPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResetPasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.alee.laf.text.WebPasswordField accountPassword;
    private javax.swing.JLabel accountPasswordNNote;
    private com.alee.laf.text.WebPasswordField accountPaswordConfirm;
    private javax.swing.JLabel accountPaswordConfirmNote;
    private com.alee.laf.text.WebPasswordField accountRecoverAnswer;
    private com.alee.laf.text.WebTextField accountRecoverHit;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetPasswordBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
