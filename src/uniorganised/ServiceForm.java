
package uniorganised;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class ServiceForm extends javax.swing.JFrame {
boolean ctr;
    public ServiceForm(boolean ctr) {
        initComponents();
       this.ctr=ctr;
        this.setLocationRelativeTo(null);
        this.setTitle("Services");
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
       if(ctr)
        {
            acc_bt.setEnabled(false);
            fee_bt.setEnabled(false);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uni_bt = new javax.swing.JButton();
        fee_bt = new javax.swing.JButton();
        prog_bt = new javax.swing.JButton();
        stud_bt = new javax.swing.JButton();
        acc_bt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uni_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        uni_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/University.png"))); // NOI18N
        uni_bt.setText("UNIVERSITY");
        uni_bt.setBorder(null);
        uni_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uni_btActionPerformed(evt);
            }
        });
        getContentPane().add(uni_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 223, 60));

        fee_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        fee_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\Fees.png")); // NOI18N
        fee_bt.setText("FEES");
        fee_bt.setBorder(null);
        fee_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee_btActionPerformed(evt);
            }
        });
        getContentPane().add(fee_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 337, 223, 60));

        prog_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        prog_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\output-onlinepngtools (58).png")); // NOI18N
        prog_bt.setText("PROGRAM");
        prog_bt.setBorder(null);
        prog_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prog_btActionPerformed(evt);
            }
        });
        getContentPane().add(prog_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 223, 60));

        stud_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        stud_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\output-onlinepngtools (50).png")); // NOI18N
        stud_bt.setText("STUDENTS");
        stud_bt.setBorder(null);
        stud_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud_btActionPerformed(evt);
            }
        });
        getContentPane().add(stud_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 237, 223, 60));

        acc_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        acc_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\output-onlinepngtools (57).png")); // NOI18N
        acc_bt.setText("ACCOUNT");
        acc_bt.setBorder(null);
        acc_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_btActionPerformed(evt);
            }
        });
        getContentPane().add(acc_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 555, 223, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\college gif.gif")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 480, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\output-onlinepngtools (28).png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 330, 140));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\newBackground.png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prog_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prog_btActionPerformed
        try {
            new Prog_Search(ctr,1).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_prog_btActionPerformed

    private void uni_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uni_btActionPerformed
        try {
            new Uni_Search(ctr).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_uni_btActionPerformed

    private void stud_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud_btActionPerformed
        try {
            new Student_Search(ctr).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stud_btActionPerformed

    private void fee_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee_btActionPerformed
    try {
        new Fee_Search(ctr,1).setVisible(true);
        this.dispose();
    } catch (SQLException ex) {
        Logger.getLogger(ServiceForm.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_fee_btActionPerformed

    private void acc_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_btActionPerformed
        try {
            new UnivAccount_Search(ctr,1).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceForm.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_acc_btActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new MainWindow(ctr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acc_bt;
    private javax.swing.JButton fee_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton prog_bt;
    private javax.swing.JButton stud_bt;
    private javax.swing.JButton uni_bt;
    // End of variables declaration//GEN-END:variables

}
