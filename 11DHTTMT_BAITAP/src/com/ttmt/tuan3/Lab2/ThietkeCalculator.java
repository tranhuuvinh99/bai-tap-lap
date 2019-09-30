/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ttmt.tuan3.Lab2;

/**
 *
 * @author Lâm Hoàng Minh Tuấn
 */
public class ThietkeCalculator extends javax.swing.JFrame {
    private long a = 0;
    private String phepToan="";
    
    /**
     * Creates new form ThietkeCalculator
     */
    public ThietkeCalculator() {
        initComponents();
        setSize(300, 400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPnchinh = new javax.swing.JPanel();
        JPnmanhinh = new javax.swing.JPanel();
        hienThi = new javax.swing.JLabel();
        JPnbanphim = new javax.swing.JPanel();
        so1 = new javax.swing.JButton();
        so2 = new javax.swing.JButton();
        so3 = new javax.swing.JButton();
        chia = new javax.swing.JButton();
        canB2 = new javax.swing.JButton();
        so4 = new javax.swing.JButton();
        so5 = new javax.swing.JButton();
        so6 = new javax.swing.JButton();
        nhan = new javax.swing.JButton();
        phantram = new javax.swing.JButton();
        so7 = new javax.swing.JButton();
        so8 = new javax.swing.JButton();
        so9 = new javax.swing.JButton();
        tru = new javax.swing.JButton();
        motphanx = new javax.swing.JButton();
        so0 = new javax.swing.JButton();
        conghoactru = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        cong = new javax.swing.JButton();
        bang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        JPnchinh.setLayout(new java.awt.BorderLayout());

        JPnmanhinh.setBackground(new java.awt.Color(255, 255, 255));

        hienThi.setBackground(new java.awt.Color(255, 255, 255));
        hienThi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hienThi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        hienThi.setText("0");

        javax.swing.GroupLayout JPnmanhinhLayout = new javax.swing.GroupLayout(JPnmanhinh);
        JPnmanhinh.setLayout(JPnmanhinhLayout);
        JPnmanhinhLayout.setHorizontalGroup(
            JPnmanhinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hienThi, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        JPnmanhinhLayout.setVerticalGroup(
            JPnmanhinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPnmanhinhLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(hienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        JPnchinh.add(JPnmanhinh, java.awt.BorderLayout.PAGE_START);

        JPnbanphim.setLayout(new java.awt.GridLayout(4, 5));

        so1.setText("1");
        so1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so1ActionPerformed(evt);
            }
        });
        JPnbanphim.add(so1);

        so2.setText("2");
        so2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so2ActionPerformed(evt);
            }
        });
        JPnbanphim.add(so2);

        so3.setText("3");
        so3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so3ActionPerformed(evt);
            }
        });
        JPnbanphim.add(so3);

        chia.setText("/");
        chia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiaActionPerformed(evt);
            }
        });
        JPnbanphim.add(chia);

        canB2.setText("sqrt");
        JPnbanphim.add(canB2);

        so4.setText("4");
        so4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so4ActionPerformed(evt);
            }
        });
        JPnbanphim.add(so4);

        so5.setText("5");
        so5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so5ActionPerformed(evt);
            }
        });
        JPnbanphim.add(so5);

        so6.setText("6");
        so6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so6ActionPerformed(evt);
            }
        });
        JPnbanphim.add(so6);

        nhan.setText("*");
        nhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanActionPerformed(evt);
            }
        });
        JPnbanphim.add(nhan);

        phantram.setText("%");
        phantram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phantramActionPerformed(evt);
            }
        });
        JPnbanphim.add(phantram);

        so7.setText("7");
        so7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so7ActionPerformed(evt);
            }
        });
        JPnbanphim.add(so7);

        so8.setText("8");
        so8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so8ActionPerformed(evt);
            }
        });
        JPnbanphim.add(so8);

        so9.setText("9");
        so9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so9ActionPerformed(evt);
            }
        });
        JPnbanphim.add(so9);

        tru.setText("-");
        tru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truActionPerformed(evt);
            }
        });
        JPnbanphim.add(tru);

        motphanx.setText("1/x");
        JPnbanphim.add(motphanx);

        so0.setText("0");
        so0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                so0ActionPerformed(evt);
            }
        });
        JPnbanphim.add(so0);

        conghoactru.setText("+/-");
        JPnbanphim.add(conghoactru);

        xoa.setText("C");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });
        JPnbanphim.add(xoa);

        cong.setText("+");
        cong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                congActionPerformed(evt);
            }
        });
        JPnbanphim.add(cong);

        bang.setText("=");
        bang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bangActionPerformed(evt);
            }
        });
        JPnbanphim.add(bang);

        JPnchinh.add(JPnbanphim, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPnchinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPnchinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void so1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so1ActionPerformed
        // TODO add your handling code here:
        String gt=hienThi.getText();
        if (gt.length()<12);{
        if (gt.equals("0")) gt="";
        long so = Long.parseLong(gt+ so1.getText());
        hienThi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so1ActionPerformed

    private void so2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so2ActionPerformed
        // TODO add your handling code here:
        String gt=hienThi.getText();
        if (gt.length()<12);{
        if (gt.equals("0")) gt="";
        long so = Long.parseLong(gt+ so2.getText());
        hienThi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so2ActionPerformed

    private void so3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so3ActionPerformed
        // TODO add your handling code here:
        String gt=hienThi.getText();
        if (gt.length()<12);{
        if (gt.equals("0")) gt="";
        long so = Long.parseLong(gt+ so3.getText());
       hienThi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so3ActionPerformed

    private void so4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so4ActionPerformed
        // TODO add your handling code here:
        String gt=hienThi.getText();
        if (gt.length()<12);{
        if (gt.equals("0")) gt="";
        long so = Long.parseLong(gt+ so4.getText());
        hienThi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so4ActionPerformed

    private void so5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so5ActionPerformed
        // TODO add your handling code here:
        String gt=hienThi.getText();
        if (gt.length()<12);{
        if (gt.equals("0")) gt="";
        long so = Long.parseLong(gt+ so5
                .getText());
        hienThi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so5ActionPerformed

    private void so6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so6ActionPerformed
        // TODO add your handling code here:
        String gt=hienThi.getText();
        if (gt.length()<12);{
        if (gt.equals("0")) gt="";
        long so = Long.parseLong(gt+ so6.getText());
        hienThi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so6ActionPerformed

    private void so7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so7ActionPerformed
        // TODO add your handling code here:
        String gt=hienThi.getText();
        if (gt.length()<12);{
        if (gt.equals("0")) gt="";
        long so = Long.parseLong(gt+ so7.getText());
        hienThi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so7ActionPerformed

    private void so8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so8ActionPerformed
        // TODO add your handling code here:
        String gt=hienThi.getText();
        if (gt.length()<12);{
        if (gt.equals("0")) gt="";
        long so = Long.parseLong(gt+ so8.getText());
        hienThi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so8ActionPerformed

    private void so9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so9ActionPerformed
        // TODO add your handling code here:
        String gt=hienThi.getText();
        if (gt.length()<12);{
        if (gt.equals("0")) gt="";
        long so = Long.parseLong(gt+ so9.getText());
        hienThi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so9ActionPerformed

    private void so0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_so0ActionPerformed
        // TODO add your handling code here:
        String gt=hienThi.getText();
        if (gt.length()<12);{
        if (gt.equals("0")) gt="";
        long so = Long.parseLong(gt+ so0.getText());
        hienThi.setText(String.valueOf(so));
        }
    }//GEN-LAST:event_so0ActionPerformed

    private void chiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiaActionPerformed
        // TODO add your handling code here:
         a = Long.parseLong(hienThi.getText());
        if (a !=0) {
            phepToan = "/";
            hienThi.setText("0");
        }
    }//GEN-LAST:event_chiaActionPerformed

    private void nhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanActionPerformed
        // TODO add your handling code here:
        a = Long.parseLong(hienThi.getText());
        if (a !=0) {
            phepToan = "*";
            hienThi.setText("0");
        }
    }//GEN-LAST:event_nhanActionPerformed

    private void truActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truActionPerformed
        // TODO add your handling code here:
        a = Long.parseLong(hienThi.getText());
        if (a !=0) {
            phepToan = "-";
            hienThi.setText("0");
        }
    }//GEN-LAST:event_truActionPerformed

    private void congActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_congActionPerformed
        // TODO add your handling code here:
        a = Long.parseLong(hienThi.getText());
        if (a !=0) {
            phepToan = "+";
            hienThi.setText("0");
        }
    }//GEN-LAST:event_congActionPerformed

    private void bangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bangActionPerformed
        // TODO add your handling code here:
        if(phepToan.length()>0){
            long b= Long.parseLong(hienThi.getText());
            if (phepToan.equals("+")){
                long kq = a + b;
                hienThi.setText(String.valueOf(kq));
            }else if (phepToan.equals("-")){
                long kq = a - b;
                hienThi.setText(String.valueOf(kq));
            }else if (phepToan.equals("*")){
                long kq = a * b;
                hienThi.setText(String.valueOf(kq));
            }else if (phepToan.equals("/")){
                float kq = (float)a / b;
                hienThi.setText(String.valueOf(kq));
            }else if(phepToan.equals("%")){
                float kq = a % b;
                hienThi.setText(String.valueOf(kq));
            }
            phepToan = ""; a=0;
        }
    }//GEN-LAST:event_bangActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
        hienThi.setText("0");
    }//GEN-LAST:event_xoaActionPerformed

    private void phantramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phantramActionPerformed
        // TODO add your handling code here:
        a = Long.parseLong(hienThi.getText());
        if (a !=0) {
            phepToan = "%";
            hienThi.setText("0");
        }
    }//GEN-LAST:event_phantramActionPerformed

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
            java.util.logging.Logger.getLogger(ThietkeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThietkeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThietkeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThietkeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThietkeCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPnbanphim;
    private javax.swing.JPanel JPnchinh;
    private javax.swing.JPanel JPnmanhinh;
    private javax.swing.JButton bang;
    private javax.swing.JButton canB2;
    private javax.swing.JButton chia;
    private javax.swing.JButton cong;
    private javax.swing.JButton conghoactru;
    private javax.swing.JLabel hienThi;
    private javax.swing.JButton motphanx;
    private javax.swing.JButton nhan;
    private javax.swing.JButton phantram;
    private javax.swing.JButton so0;
    private javax.swing.JButton so1;
    private javax.swing.JButton so2;
    private javax.swing.JButton so3;
    private javax.swing.JButton so4;
    private javax.swing.JButton so5;
    private javax.swing.JButton so6;
    private javax.swing.JButton so7;
    private javax.swing.JButton so8;
    private javax.swing.JButton so9;
    private javax.swing.JButton tru;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}