/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.Administration;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectUserInterface.MainJFrameForm;

import javax.swing.JOptionPane;

/**
 *
 * @author sneha
 */
public class AdminMainPageForm extends javax.swing.JPanel {

    /**
     * Creates new form AdminMainPageForm
     */
    MainJFrameForm MainLoginPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;

    public AdminMainPageForm(MainJFrameForm mainPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLoginPage = mainPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;

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
        lbl_Admintitle = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lbl_pass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setMaximumSize(new java.awt.Dimension(1080, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Admintitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_Admintitle.setText("Administration");
        jPanel1.add(lbl_Admintitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 210, -1));

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_username.setText("Username:");
        jPanel1.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 20));
        jPanel1.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 197, 30));

        lbl_pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_pass.setText("Password:");
        jPanel1.add(lbl_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, 20));
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 197, 30));

        btnLogin.setBackground(new java.awt.Color(255, 102, 102));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/admin-bg (4).jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1290, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 647, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (txtusername.getText().toString().equals("Admin") && txtPass.getText().toString().equals("Admin")) {
            AdminSplitPage ap = new AdminSplitPage(MainLoginPage, dB4OUtility, operatingSystem);

            MainLoginPage.setContentPane(ap);
            MainLoginPage.invalidate();
            MainLoginPage.validate();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Incorrect credential !!");
        }

    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Admintitle;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}