
package uniorganised;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


public class EntryForms extends javax.swing.JFrame {
 boolean ctr;
    public EntryForms(boolean ctr) {
        initComponents();
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
         this.ctr=ctr;
         this.setTitle("Entry Forms");
         if(ctr){
             acc_bt.setEnabled(false);
             stud_bt.setEnabled(false);
             fee_bt.setEnabled(false);
         }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uni_bt = new javax.swing.JButton();
        prog_bt = new javax.swing.JButton();
        stud_bt = new javax.swing.JButton();
        fee_bt = new javax.swing.JButton();
        acc_bt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uni_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        uni_bt.setForeground(new java.awt.Color(255, 0, 0));
        uni_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/University.png"))); // NOI18N
        uni_bt.setText("UNIVERSITY DETAILS");
        uni_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uni_btActionPerformed(evt);
            }
        });
        getContentPane().add(uni_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, 62));

        prog_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        prog_bt.setForeground(new java.awt.Color(255, 0, 0));
        prog_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\output-onlinepngtools (58).png")); // NOI18N
        prog_bt.setText("PROGRAM DETAILS");
        prog_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prog_btActionPerformed(evt);
            }
        });
        getContentPane().add(prog_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 270, 60));

        stud_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        stud_bt.setForeground(new java.awt.Color(255, 0, 0));
        stud_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\output-onlinepngtools (50).png")); // NOI18N
        stud_bt.setText("STUDENTS DETAILS");
        stud_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud_btActionPerformed(evt);
            }
        });
        getContentPane().add(stud_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 250, 60));

        fee_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        fee_bt.setForeground(new java.awt.Color(255, 0, 0));
        fee_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\output-onlinepngtools (54).png")); // NOI18N
        fee_bt.setText("FEE DETAILS");
        fee_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee_btActionPerformed(evt);
            }
        });
        getContentPane().add(fee_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 270, 60));

        acc_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        acc_bt.setForeground(new java.awt.Color(255, 0, 0));
        acc_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\output-onlinepngtools (57).png")); // NOI18N
        acc_bt.setText("ACCOUNT DETAILS");
        acc_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acc_btActionPerformed(evt);
            }
        });
        getContentPane().add(acc_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 250, 60));

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 50)); // NOI18N
        jLabel1.setText("ENTRY ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 13, -1, 61));

        jLabel3.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel3.setText("FORMS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 81, 154, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Icon\\pointing.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 135));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Icon\\entryback.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uni_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uni_btActionPerformed
        try {
            new Univ_Info(ctr).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(EntryForms.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_uni_btActionPerformed

    private void stud_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud_btActionPerformed
        try {
            new Student_info(ctr,1).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(EntryForms.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stud_btActionPerformed

    private void prog_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prog_btActionPerformed
        try {
            new Program_info(ctr).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(EntryForms.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_prog_btActionPerformed

    private void fee_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee_btActionPerformed
        try {
            new Fee_info(ctr).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(EntryForms.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_fee_btActionPerformed

    private void acc_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acc_btActionPerformed
        try {
            new Univaccount_info(ctr).setVisible(true);
             this.dispose();
                    } catch (SQLException ex) {
            Logger.getLogger(EntryForms.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton prog_bt;
    private javax.swing.JButton stud_bt;
    private javax.swing.JButton uni_bt;
    // End of variables declaration//GEN-END:variables

   
}
