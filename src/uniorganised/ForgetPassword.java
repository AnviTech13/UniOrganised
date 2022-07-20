
package uniorganised;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ForgetPassword extends javax.swing.JFrame {
      boolean flag,flg=false;
      Connection con;
      PreparedStatement stmt;
      ResultSet rs;
      byte i=1;
    public ForgetPassword() throws SQLException {
        initComponents();
        change_bt.setEnabled(false);
         this.getRootPane().setDefaultButton(change_bt);
        con=ConnDb.conLink();
        que_cmb.setEnabled(false);
        ans_tf.setEnabled(false);
        new_ptf.setEnabled(false);
        confirm_ptf.setEnabled(false);
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        this.setTitle("Forget Password");
        stmt=con.prepareStatement("select ques from login");
        rs=stmt.executeQuery();
        que_cmb.addItem("Select Your Question");
        while(rs.next()){
            que_cmb.addItem(rs.getString(1));
        }
        flg=true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        user_tf = new javax.swing.JTextField();
        ans_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        change_bt = new javax.swing.JButton();
        que_cmb = new javax.swing.JComboBox<>();
        neye_bt = new javax.swing.JButton();
        ceye_bt = new javax.swing.JButton();
        new_ptf = new javax.swing.JPasswordField();
        confirm_ptf = new javax.swing.JPasswordField();
        msg = new javax.swing.JLabel();
        umsg = new javax.swing.JLabel();
        amsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("User I'D");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 153));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setText("Question");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 204, 153));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("  Answer");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 204, 153));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("New Password");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(0, 204, 153));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setText("Confirm password");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel5)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        user_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_tf.setNextFocusableComponent(que_cmb);
        user_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                user_tfFocusLost(evt);
            }
        });
        user_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_tfKeyPressed(evt);
            }
        });

        ans_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ans_tf.setNextFocusableComponent(new_ptf);
        ans_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ans_tfFocusLost(evt);
            }
        });
        ans_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ans_tfKeyPressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\forget - Copy.png")); // NOI18N

        change_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        change_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/Save-icon.png"))); // NOI18N
        change_bt.setText("CHANGE");
        change_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_btActionPerformed(evt);
            }
        });

        que_cmb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        que_cmb.setNextFocusableComponent(ans_tf);
        que_cmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                que_cmbItemStateChanged(evt);
            }
        });
        que_cmb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                que_cmbFocusLost(evt);
            }
        });

        neye_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/show.png"))); // NOI18N
        neye_bt.setBorder(null);
        neye_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neye_btActionPerformed(evt);
            }
        });

        ceye_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/show.png"))); // NOI18N
        ceye_bt.setBorder(null);
        ceye_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceye_btActionPerformed(evt);
            }
        });

        new_ptf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        new_ptf.setNextFocusableComponent(confirm_ptf);
        new_ptf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                new_ptfKeyPressed(evt);
            }
        });

        confirm_ptf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm_ptf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirm_ptfFocusLost(evt);
            }
        });
        confirm_ptf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                confirm_ptfKeyTyped(evt);
            }
        });

        msg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 0, 0));

        umsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        umsg.setForeground(new java.awt.Color(255, 0, 0));

        amsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        amsg.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(change_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 110, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(umsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(que_cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(user_tf)
                            .addComponent(ans_tf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(new_ptf)
                            .addComponent(confirm_ptf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(neye_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ceye_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(umsg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(que_cmb, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amsg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(neye_bt, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(new_ptf))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confirm_ptf, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(change_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ceye_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            new LoginWindow().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowClosing

    private void neye_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neye_btActionPerformed
        if(flag){
           ImageIcon img=new ImageIcon(getClass().getResource("close eye.png"));
           neye_bt.setIcon(img);
           new_ptf.setEchoChar((char)0);
           flag=false;    
       }
       else{
         ImageIcon img=new ImageIcon(getClass().getResource("show.png"));
           neye_bt.setIcon(img);
           new_ptf.setEchoChar('\u25cf');
           flag=true; }     
    }//GEN-LAST:event_neye_btActionPerformed

    private void ceye_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceye_btActionPerformed
       if(flag){
           ImageIcon img=new ImageIcon(getClass().getResource("close eye.png"));
           ceye_bt.setIcon(img);
           confirm_ptf.setEchoChar((char)0);
           flag=false;    
       }
       else{
         ImageIcon img=new ImageIcon(getClass().getResource("show.png"));
           ceye_bt.setIcon(img);
           confirm_ptf.setEchoChar('\u25cf');
           flag=true; }     
    }//GEN-LAST:event_ceye_btActionPerformed

    private void user_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_tfFocusLost
          try {
              stmt=con.prepareStatement("select ques,ans from login where upper(uname)=?");
              stmt.setString(1,user_tf.getText().toUpperCase());
               rs=stmt.executeQuery();
             if(rs.next()){
                que_cmb.setEnabled(true);
                
              }
            else
            {
               umsg.setText("Invalid User I'D !");
               user_tf.setText("");
               user_tf.requestFocus();
            }
            } catch (SQLException ex) {
              Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
            }
         
    }//GEN-LAST:event_user_tfFocusLost

    private void que_cmbFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_que_cmbFocusLost
         msg.setText("");
    }//GEN-LAST:event_que_cmbFocusLost

    private void ans_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ans_tfFocusLost
          try {
              if(ans_tf.getText().equals(rs.getString(2)))
              {
                  new_ptf.setEnabled(true);
                  new_ptf.requestFocus();
                  confirm_ptf.setEnabled(true);
              }
              else
              { 
               amsg.setText("Answer is incorrect !");
              ans_tf.setText("");
              ans_tf.requestFocus();
              } } catch (SQLException ex) {
              Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_ans_tfFocusLost

    private void confirm_ptfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirm_ptfFocusLost
      if(!new_ptf.getText().equals(confirm_ptf.getText())){
           new_ptf.setText("");
           confirm_ptf.setText("");
           new_ptf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,51,51),3));
           new_ptf.requestFocus();
       }
    }//GEN-LAST:event_confirm_ptfFocusLost

    private void new_ptfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_new_ptfKeyPressed
        new_ptf.setBorder(null);
    }//GEN-LAST:event_new_ptfKeyPressed

    private void change_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_btActionPerformed
          try {
              stmt=con.prepareStatement("update login set pswd=? where upper(uname)=?");
              stmt.setString(1,new_ptf.getText());
              stmt.setString(2,user_tf.getText().toUpperCase());
              stmt.executeUpdate();
             JOptionPane.showMessageDialog(null,"Password Changed!");
             if(flag){
                this.dispose();
                new LoginWindow().setVisible(true);}
          } catch (SQLException ex) {
              Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
          }
        
    }//GEN-LAST:event_change_btActionPerformed

    private void user_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_tfKeyPressed
        umsg.setText("");
    }//GEN-LAST:event_user_tfKeyPressed

    private void ans_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ans_tfKeyPressed
        amsg.setText("");
    }//GEN-LAST:event_ans_tfKeyPressed

    private void confirm_ptfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirm_ptfKeyTyped
       change_bt.setEnabled(true);
    }//GEN-LAST:event_confirm_ptfKeyTyped

    private void que_cmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_que_cmbItemStateChanged
        if(flg) {
        try {
              if(que_cmb.getSelectedItem().toString().equals(rs.getString(1))){
                  ans_tf.setEnabled(true);
                  ans_tf.requestFocus();
              }
              else
              {   
                  msg.setText("Question selection is incorrect !");
                 que_cmb.requestFocus();
              } } catch (SQLException ex) {
              Logger.getLogger(ForgetPassword.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
    }//GEN-LAST:event_que_cmbItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amsg;
    private javax.swing.JTextField ans_tf;
    private javax.swing.JButton ceye_bt;
    private javax.swing.JButton change_bt;
    private javax.swing.JPasswordField confirm_ptf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel msg;
    private javax.swing.JPasswordField new_ptf;
    private javax.swing.JButton neye_bt;
    private javax.swing.JComboBox<String> que_cmb;
    private javax.swing.JLabel umsg;
    private javax.swing.JTextField user_tf;
    // End of variables declaration//GEN-END:variables


   
}
