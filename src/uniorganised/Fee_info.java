
package uniorganised;

import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class Fee_info extends javax.swing.JFrame {
    Connection con;
    int ano;
    PreparedStatement stmt;
    ResultSet rs;
    String str;
    boolean ctr;
    boolean flag=true; int tot;
    public Fee_info(boolean ctr) throws SQLException {
        initComponents();
        insert_bt.setEnabled(false);
        due_tf.setEditable(false);
        sid_tf.requestFocus();
        this.getRootPane().setDefaultButton(insert_bt);
        this.setTitle("Fee Information");
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.ctr=ctr;
        con=ConnDb.conLink();
        this.setLocationRelativeTo(null);
        ad_yr.setEditable(false);
        tot_tf.setEditable(false);
        
            
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        yr_lb = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        due_tf = new javax.swing.JTextField();
        insert_bt = new javax.swing.JButton();
        online_cmb = new javax.swing.JComboBox<>();
        plb = new javax.swing.JLabel();
        pmnt_tf = new javax.swing.JTextField();
        next_bt = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        dis_amnt = new javax.swing.JTextField();
        sid_tf = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tot_lb = new javax.swing.JLabel();
        rlb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ad_yr = new javax.swing.JTextField();
        tot_tf = new javax.swing.JTextField();
        dmsg = new javax.swing.JLabel();
        pmsg = new javax.swing.JLabel();
        due_lb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel9.setText("Student I'D");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        yr_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        yr_lb.setText("Admission Year");
        getContentPane().add(yr_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 40));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel13.setText("Total Amount");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel14.setText("Dues Amount");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 130, -1));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel15.setText("Payment Mode");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, -1, 30));

        due_tf.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        due_tf.setNextFocusableComponent(online_cmb);
        due_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                due_tfFocusLost(evt);
            }
        });
        due_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                due_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                due_tfKeyTyped(evt);
            }
        });
        getContentPane().add(due_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 290, 40));

        insert_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        insert_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/add.png"))); // NOI18N
        insert_bt.setText("Insert");
        insert_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_btActionPerformed(evt);
            }
        });
        getContentPane().add(insert_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, 120, 40));

        online_cmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        online_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UPI", "CASH", "NEFT", "PAYTM" }));
        getContentPane().add(online_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 160, 40));

        plb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        plb.setText("Paid Amount");
        plb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                plbFocusGained(evt);
            }
        });
        getContentPane().add(plb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, 30));

        pmnt_tf.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        pmnt_tf.setNextFocusableComponent(plb);
        pmnt_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pmnt_tfFocusLost(evt);
            }
        });
        pmnt_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pmnt_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pmnt_tfKeyTyped(evt);
            }
        });
        getContentPane().add(pmnt_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 290, 40));

        next_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        next_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/next icon.png"))); // NOI18N
        next_bt.setText("Next");
        next_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btActionPerformed(evt);
            }
        });
        getContentPane().add(next_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 690, 130, 40));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel16.setText("Discount Amount");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        dis_amnt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        dis_amnt.setNextFocusableComponent(rlb);
        dis_amnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dis_amntKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dis_amntKeyTyped(evt);
            }
        });
        getContentPane().add(dis_amnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 290, 40));

        sid_tf.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        sid_tf.setToolTipText("Press tab to move");
        sid_tf.setNextFocusableComponent(dis_amnt);
        sid_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sid_tfFocusLost(evt);
            }
        });
        getContentPane().add(sid_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 290, 43));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        jLabel6.setText("FEE  DETAILS");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/money.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 140));

        tot_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/rupee.png"))); // NOI18N
        getContentPane().add(tot_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, 40));

        rlb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/rupee.png"))); // NOI18N
        rlb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rlbFocusGained(evt);
            }
        });
        getContentPane().add(rlb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 20, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/rupee.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 20, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/rupee.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 20, 40));

        ad_yr.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        ad_yr.setNextFocusableComponent(dis_amnt);
        getContentPane().add(ad_yr, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 290, 43));

        tot_tf.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        tot_tf.setNextFocusableComponent(dis_amnt);
        getContentPane().add(tot_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 290, 43));

        dmsg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dmsg.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(dmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 350, 24));

        pmsg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pmsg.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 330, 20));

        due_lb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        due_lb.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(due_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 290, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Icon\\skybluee.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 630, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insert_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_btActionPerformed
        try {
            stmt=con.prepareStatement("insert into fee_info values(?,?,?,?,?,?,?)");
             stmt.setString(1,sid_tf.getText());
             stmt.setString(2,due_tf.getText());
             stmt.setString(6,ad_yr.getText());
             stmt.setString(3,online_cmb.getSelectedItem().toString());
             stmt.setString(4,dis_amnt.getText());
             stmt.setString(5,pmnt_tf.getText());
             stmt.setString(7,tot_tf.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record successfully inserted");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Record is not successfully inserted");
        }
        try {  
            backup.back("select * from fee_info","Feesdetails.xls");
        } catch (IOException ex) {
            Logger.getLogger(Fee_info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fee_info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Fee_info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriteException ex) {
            Logger.getLogger(Fee_info.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BiffException ex) {
            Logger.getLogger(Fee_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_insert_btActionPerformed

    private void next_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btActionPerformed
        sid_tf.setText("");
        due_tf.setText("");
        dis_amnt.setText("");
        pmnt_tf.setText("");
        online_cmb.setSelectedIndex(0);
        ad_yr.setText("");
        tot_tf.setText("");
        insert_bt.setEnabled(false);
         sid_tf.requestFocus();
    }//GEN-LAST:event_next_btActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       new EntryForms(ctr).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void due_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_due_tfKeyTyped
        String str=due_tf.getText();
        char ch=evt.getKeyChar();
        if(str.length()==0 && ch==' '){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            due_lb.setText("*Dues Amount cannot start with space !");
        } 
        else if(str.length()==0 && ch=='.')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            due_lb.setText("*Dues Amount cannot start with dot !");
        }
       if(!(ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();}
    }//GEN-LAST:event_due_tfKeyTyped

    private void plbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_plbFocusGained
       String str=pmnt_tf.getText();
       if(str.length()==0)
       {
           pmsg.setText("Please Enter paid amount !");
           pmnt_tf.requestFocus();
       }
       else
          due_tf.requestFocus();
    }//GEN-LAST:event_plbFocusGained

    private void due_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_due_tfFocusLost
        String str=due_tf.getText();
       if(str.length()==0)
       {
           due_lb.setText("Please Enter dues amount !");
           due_tf.requestFocus();
       }
       else
         online_cmb.requestFocus();
    }//GEN-LAST:event_due_tfFocusLost

    private void dis_amntKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dis_amntKeyPressed
      dmsg.setText("");
      insert_bt.setEnabled(true);
    }//GEN-LAST:event_dis_amntKeyPressed

    private void pmnt_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pmnt_tfKeyPressed
        pmsg.setText("");
    }//GEN-LAST:event_pmnt_tfKeyPressed

    private void due_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_due_tfKeyPressed
       due_lb.setText("");
    }//GEN-LAST:event_due_tfKeyPressed

    private void pmnt_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pmnt_tfKeyTyped
       String str=pmnt_tf.getText();
        char ch=evt.getKeyChar();
        if(str.length()==0 && ch==' '){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            pmsg.setText("*Paid Amount cannot start with space !");
        } 
        else if(str.length()==0 && ch=='.')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            pmsg.setText("*Paid Amount cannot start with dot !");
        }
       if(!(ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_pmnt_tfKeyTyped

    private void dis_amntKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dis_amntKeyTyped
      String str=dis_amnt.getText();
        char ch=evt.getKeyChar();
        if(str.length()==0 && ch==' '){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            dmsg.setText("*Discount Amount cannot start with space !");
        } 
      else if(!(ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
       }
        else if(str.length()==0 && ch=='.')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            dmsg.setText("*Discount Amount cannot start with dot !");
        }
    }//GEN-LAST:event_dis_amntKeyTyped

    private void sid_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sid_tfFocusLost
        try {
            stmt=con.prepareStatement("select start_sess,prog_fee from stud_info where (enrol_no)=?");
             stmt.setString(1,sid_tf.getText().toUpperCase());
                rs=stmt.executeQuery();
                if(rs.next()){
                ad_yr.setText(rs.getString(1));
                tot_tf.setText(rs.getString(2));
                tot=Integer.parseInt(tot_tf.getText());
                stmt=con.prepareStatement("select due from fee_info where upper(enrol_no)=?");
                stmt.setString(1,sid_tf.getText().toUpperCase());
                rs=stmt.executeQuery();
                if(rs.next()){
                    tot_tf.setText(tot_tf.getText()+"(Fee)"+"+"+rs.getString(1)+"(Dues)");
                    tot=tot+Integer.parseInt(rs.getString(1));
                }       
                }
                else
                    JOptionPane.showMessageDialog(null,"Records not found");
        } catch (SQLException ex) {
            Logger.getLogger(Fee_info.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_sid_tfFocusLost

    private void pmnt_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pmnt_tfFocusLost
        due_tf.setText(""+(tot-Integer.parseInt(dis_amnt.getText())-Integer.parseInt(pmnt_tf.getText())));
    }//GEN-LAST:event_pmnt_tfFocusLost

    private void rlbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rlbFocusGained
        String str=dis_amnt.getText();
       if(str.length()==0)
       {
           dmsg.setText("Please Enter discount amount !");
           dis_amnt.requestFocus();
       }
    }//GEN-LAST:event_rlbFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_yr;
    private javax.swing.JTextField dis_amnt;
    private javax.swing.JLabel dmsg;
    private javax.swing.JLabel due_lb;
    private javax.swing.JTextField due_tf;
    private javax.swing.JButton insert_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton next_bt;
    private javax.swing.JComboBox<String> online_cmb;
    private javax.swing.JLabel plb;
    private javax.swing.JTextField pmnt_tf;
    private javax.swing.JLabel pmsg;
    private javax.swing.JLabel rlb;
    private javax.swing.JTextField sid_tf;
    private javax.swing.JLabel tot_lb;
    private javax.swing.JTextField tot_tf;
    private javax.swing.JLabel yr_lb;
    // End of variables declaration//GEN-END:variables

}
