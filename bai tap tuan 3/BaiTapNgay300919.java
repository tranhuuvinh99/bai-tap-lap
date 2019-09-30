/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhttmmt.tuan3;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tran Huu Vinh
 */
public class BaiTapNgay300919 extends javax.swing.JFrame {

    /**
     * Creates new form BaiTapNgay300919
     */
    public BaiTapNgay300919() {
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

        btngender = new javax.swing.ButtonGroup();
        buttonKnowledge = new javax.swing.ButtonGroup();
        jPanelcha = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblKnowledge = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        RdMale = new javax.swing.JRadioButton();
        RdFemale = new javax.swing.JRadioButton();
        cboSubject = new javax.swing.JComboBox<>();
        chkJava = new javax.swing.JCheckBox();
        chkPython = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Name.setText("Name :");

        Address.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Address.setText("Address :");

        lblGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblGender.setText("Gender :");

        lblKnowledge.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblKnowledge.setText("Knowledge :");

        lblSubject.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblSubject.setText("Subject :");

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        btngender.add(RdMale);
        RdMale.setText("Male");
        RdMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdMaleActionPerformed(evt);
            }
        });

        btngender.add(RdFemale);
        RdFemale.setText("Female");
        RdFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdFemaleActionPerformed(evt);
            }
        });

        cboSubject.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cboSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science " }));
        cboSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSubjectActionPerformed(evt);
            }
        });

        buttonKnowledge.add(chkJava);
        chkJava.setText("Java");
        chkJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkJavaActionPerformed(evt);
            }
        });

        buttonKnowledge.add(chkPython);
        chkPython.setText("Python");
        chkPython.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPythonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelchaLayout = new javax.swing.GroupLayout(jPanelcha);
        jPanelcha.setLayout(jPanelchaLayout);
        jPanelchaLayout.setHorizontalGroup(
            jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelchaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelchaLayout.createSequentialGroup()
                        .addComponent(Name)
                        .addGap(39, 39, 39)
                        .addComponent(txtName))
                    .addGroup(jPanelchaLayout.createSequentialGroup()
                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelchaLayout.createSequentialGroup()
                            .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblKnowledge)
                                .addComponent(lblGender))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RdMale)
                                .addComponent(chkJava))
                            .addGap(56, 56, 56)
                            .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkPython)
                                .addComponent(RdFemale))
                            .addGap(33, 33, 33))
                        .addGroup(jPanelchaLayout.createSequentialGroup()
                            .addComponent(lblSubject)
                            .addGap(51, 51, 51)
                            .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelchaLayout.createSequentialGroup()
                                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, Short.MAX_VALUE))
        );
        jPanelchaLayout.setVerticalGroup(
            jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelchaLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdMale)
                    .addComponent(RdFemale)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKnowledge, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkJava)
                    .addComponent(chkPython))
                .addGap(30, 30, 30)
                .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelchaLayout.createSequentialGroup()
                        .addComponent(cboSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelcha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void cboSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSubjectActionPerformed

    private void RdFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RdFemaleActionPerformed

    private void RdMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RdMaleActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        //code o day 
        Connection conn = null;
        String url="jdbc:jtds:sqlserver://localhost:1433/";
        String user = "sa";
        String password = "123";
        String sql ="INSET INTO Employee"
                +"VALUES(?, ?, ?, ?, ? )";
        PreparedStatement preStmt =null;
        String StrName = txtName.getText();
        String StrDiaChi = txtAddress.getText();
        String StrGioiTinh ="";
        String StrKnowledge="";
        if(RdMale.isSelected()){
           StrGioiTinh="Male";
        }else{
          StrGioiTinh="FeMale";   
        }
        if(chkJava.isSelected()){
            StrKnowledge = StrKnowledge + "Java";
        }
        if(chkJava.isSelected()){
            StrKnowledge = StrKnowledge + "Python";
        }
        StrSubject = cboSubject.getSelectedItem().toString();
        
 
        try {
            conn = DriverManager.getConnection(url, user, password);
            preStmt = conn.prepareStatement(sql);
            preStmt.setString(1, StrName);
            preStmt.setString(2, StrDiaChi);
            preStmt.setString(3,StrGioiTinh);
            preStmt.setString(4, StrKnowledge);
            preStmt.setString(5, StrSubject);
            row = preStmt.executeUpdate();
            System.out.println("Row inserted " + row);
            conn.close();
            
            
          
        } catch (SQLException ex) {
            Logger.getLogger(BaiTapNgay300919.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void chkJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkJavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkJavaActionPerformed

    private void chkPythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPythonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPythonActionPerformed

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
            java.util.logging.Logger.getLogger(BaiTapNgay300919.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BaiTapNgay300919.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BaiTapNgay300919.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BaiTapNgay300919.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaiTapNgay300919().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Name;
    private javax.swing.JRadioButton RdFemale;
    private javax.swing.JRadioButton RdMale;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Save;
    private javax.swing.ButtonGroup btngender;
    private javax.swing.ButtonGroup buttonKnowledge;
    private javax.swing.JComboBox<String> cboSubject;
    private javax.swing.JCheckBox chkJava;
    private javax.swing.JCheckBox chkPython;
    private javax.swing.JPanel jPanelcha;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblKnowledge;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}