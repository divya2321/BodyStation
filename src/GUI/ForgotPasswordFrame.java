package GUI;

import Database.Tables.AccountManagement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ForgotPasswordFrame extends javax.swing.JFrame {

    private static ForgotPasswordFrame instance = null;

    public static synchronized ForgotPasswordFrame getInstance() {
        if (instance == null) {
            instance = new ForgotPasswordFrame();
        }
        return instance;
    }

    public ForgotPasswordFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        forgotUsername = new com.alee.laf.text.WebTextField();
        requestBtn = new javax.swing.JButton();
        forgetQuestionLbl = new javax.swing.JLabel();
        forgetAnswer = new com.alee.laf.text.WebPasswordField();
        forgetSubmitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 124, 167), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(29, 124, 167));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Forgot Your Password?");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        forgotUsername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        forgotUsername.setInputPrompt("Your Username Here");
        forgotUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                forgotUsernameFocusLost(evt);
            }
        });
        forgotUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotUsernameActionPerformed(evt);
            }
        });
        forgotUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                forgotUsernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                forgotUsernameKeyTyped(evt);
            }
        });
        jPanel1.add(forgotUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 320, 40));

        requestBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        requestBtn.setForeground(new java.awt.Color(51, 51, 51));
        requestBtn.setText("Request Recovery Question");
        requestBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        requestBtn.setContentAreaFilled(false);
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });
        jPanel1.add(requestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 240, 30));

        forgetQuestionLbl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        forgetQuestionLbl.setForeground(new java.awt.Color(29, 124, 167));
        forgetQuestionLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(forgetQuestionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 40));

        forgetAnswer.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        forgetAnswer.setInputPrompt("Answer");
        forgetAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                forgetAnswerKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                forgetAnswerKeyTyped(evt);
            }
        });
        jPanel1.add(forgetAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 220, 40));

        forgetSubmitBtn.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        forgetSubmitBtn.setForeground(new java.awt.Color(29, 124, 167));
        forgetSubmitBtn.setText("Submit");
        forgetSubmitBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(29, 124, 167), 2, true));
        forgetSubmitBtn.setContentAreaFilled(false);
        forgetSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetSubmitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(forgetSubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 110, 40));

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
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 110, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Your Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forgotUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_forgotUsernameFocusLost

    }//GEN-LAST:event_forgotUsernameFocusLost

    private void forgotUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotUsernameActionPerformed

    private void forgotUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forgotUsernameKeyTyped


    }//GEN-LAST:event_forgotUsernameKeyTyped

    private static ResultSet rs_forgotQnA;
    private static String recAns, recHint;
    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        if (AccountManagement.isAvailableAccount(forgotUsername.getText().trim())) {
            forgotUsername.setEditable(false);

            rs_forgotQnA = AccountManagement.getHintAnswer(forgotUsername.getText().trim());
            try {
                if (rs_forgotQnA.next()) {
                    recAns = rs_forgotQnA.getString("recoveryanswer");
                    recHint = rs_forgotQnA.getString("recoveryhint");

                    forgetQuestionLbl.setText(rs_forgotQnA.getString("recoveryhint"));
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            forgotUsername.selectAll();
            JOptionPane.showMessageDialog(this, "User Account does NOT exist!", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_requestBtnActionPerformed

    private void forgetAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forgetAnswerKeyReleased

    }//GEN-LAST:event_forgetAnswerKeyReleased

    private void forgetAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forgetAnswerKeyTyped

    }//GEN-LAST:event_forgetAnswerKeyTyped

    private void forgetSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetSubmitBtnActionPerformed
     if(recAns != null){
        if (recAns.equals(String.valueOf(forgetAnswer.getPassword()))) {
            ResetPasswordFrame rpf = ResetPasswordFrame.getInstance(forgotUsername.getText().trim(), recHint, recAns);
            rpf.onLoadingResetPAssword();
            rpf.setVisible(true);
            forgotUsername.setText(null);
            forgetQuestionLbl.setText(null);
            forgetAnswer.setText(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Answer is incorrect!", "Warning!", JOptionPane.WARNING_MESSAGE);
        }
     }
    }//GEN-LAST:event_forgetSubmitBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void forgotUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forgotUsernameKeyReleased

   
    }//GEN-LAST:event_forgotUsernameKeyReleased

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
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPasswordFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPasswordFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private com.alee.laf.text.WebPasswordField forgetAnswer;
    private javax.swing.JLabel forgetQuestionLbl;
    private javax.swing.JButton forgetSubmitBtn;
    private com.alee.laf.text.WebTextField forgotUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton requestBtn;
    // End of variables declaration//GEN-END:variables
}
