/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Accounts;
import Service.AccountService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilaine
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        staffidloginTxt = new javax.swing.JTextField();
        loginbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cancelbtnlogin = new javax.swing.JButton();
        passwordloginTxt = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 120));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Staff id:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Password:");

        staffidloginTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staffidloginTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffidloginTxtActionPerformed(evt);
            }
        });

        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("<Html><u>Have no account?Click here to SignUp.</u></Html> ");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        cancelbtnlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelbtnlogin.setText("Cancel");
        cancelbtnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnloginActionPerformed(evt);
            }
        });

        passwordloginTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(loginbtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancelbtnlogin)
                            .addComponent(staffidloginTxt)
                            .addComponent(passwordloginTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(staffidloginTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordloginTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbtn)
                    .addComponent(cancelbtnlogin))
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 700, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilaine\\Pictures\\Arena enough size\\Rwanda 2.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffidloginTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffidloginTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffidloginTxtActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
         if (staffidloginTxt.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Id is required!", "Mandatory Field", JOptionPane.WARNING_MESSAGE);
    } else if (new String(passwordloginTxt.getPassword()).trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Password is required!", "Mandatory Field", JOptionPane.WARNING_MESSAGE);
    }else{
            try {
        Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 5000);
            AccountService service = (AccountService) theRegistry.lookup("acc");
             Accounts theuser = new Accounts();
            theuser.setStaff_id(staffidloginTxt.getText());
            theuser.setPassword(new String (passwordloginTxt.getPassword()));
            Accounts userObj = service.recordAccounts(theuser);
            if(userObj!= null){
                this.dispose();
                Staff_Frame st=new Staff_Frame();
                st.setVisible(true);
                
            }else {
               JOptionPane.showMessageDialog(this, "Login Failed! try again! ");  
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }  
        } 
    }//GEN-LAST:event_loginbtnActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        SignUp sign=new SignUp();
        sign.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void cancelbtnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnloginActionPerformed
        // TODO add your handling code here:
        int userChoice = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (userChoice == JOptionPane.YES_OPTION) {          
            this.dispose();
        } else {

        }
    }//GEN-LAST:event_cancelbtnloginActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelbtnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passwordloginTxt;
    private javax.swing.JTextField staffidloginTxt;
    // End of variables declaration//GEN-END:variables
}
