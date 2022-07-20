
package uniorganised;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ChangePassword extends javax.swing.JFrame {
      Connection con;
      PreparedStatement stmt;
      ResultSet rs;
      boolean flag=true;
      boolean ctr;
    public ChangePassword() throws SQLException {
        initComponents();
        cpswd.setEnabled(false);
        npswd.setEnabled(false);
        confirm_tf.setEnabled(false);
         this.getRootPane().setDefaultButton(change_bt);
         con=ConnDb.conLink();
        this.setLocationRelativeTo(null);
        this.setTitle("Password Change");
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        change_bt.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        user_tf = new javax.swing.JTextField();
        change_bt = new javax.swing.JButton();
        cpswd = new javax.swing.JPasswordField();
        npswd = new javax.swing.JPasswordField();
        confirm_tf = new javax.swing.JPasswordField();
        ceye = new javax.swing.JButton();
        neye = new javax.swing.JButton();
        coeye = new javax.swing.JButton();
        msg = new javax.swing.JLabel();
        nmsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\change_password_preview.png")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User I'd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Current Password");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(92, 92, 92))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Password");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel4)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirm Password");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(90, 90, 90))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        user_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_tf.setToolTipText("Please press tab to move ");
        user_tf.setNextFocusableComponent(cpswd);
        user_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                user_tfFocusLost(evt);
            }
        });

        change_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        change_bt.setText("Change Passsword");
        change_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_btActionPerformed(evt);
            }
        });

        cpswd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cpswd.setNextFocusableComponent(npswd);
        cpswd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpswdFocusLost(evt);
            }
        });
        cpswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpswdKeyTyped(evt);
            }
        });

        npswd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        npswd.setNextFocusableComponent(confirm_tf);
        npswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                npswdKeyPressed(evt);
            }
        });

        confirm_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        confirm_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirm_tfFocusLost(evt);
            }
        });

        ceye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/show.png"))); // NOI18N
        ceye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceyeActionPerformed(evt);
            }
        });

        neye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/show.png"))); // NOI18N
        neye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neyeActionPerformed(evt);
            }
        });

        coeye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/show.png"))); // NOI18N
        coeye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coeyeActionPerformed(evt);
            }
        });

        msg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(change_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cpswd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ceye, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(neye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(user_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(npswd)
                            .addComponent(confirm_tf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(coeye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ceye, neye});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {confirm_tf, cpswd, npswd, user_tf});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel3, jPanel4, jPanel5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ceye, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpswd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(neye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(npswd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(confirm_tf)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(coeye, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(40, 40, 40)
                .addComponent(change_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {confirm_tf, cpswd, npswd, user_tf});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel2, jPanel3, jPanel4, jPanel5});

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
        Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_formWindowClosing

    private void user_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_tfFocusLost
    try {
        stmt=con.prepareStatement("select pswd from login where upper(uname)=?");
         stmt.setString(1,user_tf.getText().toUpperCase());
         rs=stmt.executeQuery();
         if(rs.next()){
          cpswd.setEnabled(true);
          cpswd.requestFocus();}
         else
         {
             user_tf.setText("");
             user_tf.requestFocus();
         }
       } catch (SQLException ex) {
        Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
    }
               
    }//GEN-LAST:event_user_tfFocusLost

    private void confirm_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirm_tfFocusLost
        if(!npswd.getText().equals(confirm_tf.getText())){
           npswd.setText("");
           confirm_tf.setText("");
           npswd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,51,51),3));
           npswd.requestFocus();}
         else
           change_bt.setEnabled(true);
        
        String str=confirm_tf.getText();
         if(str.length()==0)
                {
                 npswd.requestFocus();
                }
        
    }//GEN-LAST:event_confirm_tfFocusLost

    private void ceyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceyeActionPerformed
      if(flag){
           ImageIcon img=new ImageIcon(getClass().getResource("close eye.png"));
           ceye.setIcon(img);
           cpswd.setEchoChar((char)0);
           flag=false;    
       }
       else{
         ImageIcon img=new ImageIcon(getClass().getResource("show.png"));
           ceye.setIcon(img);
           cpswd.setEchoChar('\u25cf');
           flag=true; }    
    }//GEN-LAST:event_ceyeActionPerformed

    private void npswdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npswdKeyPressed
      npswd.setBorder(null);
      nmsg.setText("");
    }//GEN-LAST:event_npswdKeyPressed

    private void cpswdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpswdFocusLost
     try {
        if(cpswd.getText().equals(rs.getString(1))){
            npswd.setEnabled(true);
            npswd.requestFocus();
            confirm_tf.setEnabled(true);
        }
        else
        {   msg.setText("Incorrect Password !");
            cpswd.setText("");
            cpswd.requestFocus();
        }
    } catch (SQLException ex) {
        Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_cpswdFocusLost

    private void neyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neyeActionPerformed
        if(flag){
           ImageIcon img=new ImageIcon(getClass().getResource("close eye.png"));
           neye.setIcon(img);
           npswd.setEchoChar((char)0);
           flag=false;    
       }
       else{
         ImageIcon img=new ImageIcon(getClass().getResource("show.png"));
           neye.setIcon(img);
           npswd.setEchoChar('\u25cf');
           flag=true; }  
    }//GEN-LAST:event_neyeActionPerformed

    private void coeyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coeyeActionPerformed
        if(flag){
           ImageIcon img=new ImageIcon(getClass().getResource("close eye.png"));
           coeye.setIcon(img);
           confirm_tf.setEchoChar((char)0);
           flag=false;    
       }
       else{
         ImageIcon img=new ImageIcon(getClass().getResource("show.png"));
           coeye.setIcon(img);
           confirm_tf.setEchoChar('\u25cf');
           flag=true; }  
    }//GEN-LAST:event_coeyeActionPerformed

    private void change_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_btActionPerformed
    try {
        stmt=con.prepareStatement("update login set pswd=? where upper(uname)=?");
        stmt.setString(1,npswd.getText());
        stmt.setString(2,user_tf.getText().toUpperCase());
        stmt.executeUpdate();
        JOptionPane.showMessageDialog(null,"Password Changed!");
        if(flag){
                this.dispose();
            new LoginWindow().setVisible(true);}
    } catch (SQLException ex) {
        Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
    }
                
    }//GEN-LAST:event_change_btActionPerformed

    private void cpswdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpswdKeyTyped
       msg.setText("");
    }//GEN-LAST:event_cpswdKeyTyped

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ceye;
    private javax.swing.JButton change_bt;
    private javax.swing.JButton coeye;
    private javax.swing.JPasswordField confirm_tf;
    private javax.swing.JPasswordField cpswd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel msg;
    private javax.swing.JButton neye;
    private javax.swing.JLabel nmsg;
    private javax.swing.JPasswordField npswd;
    private javax.swing.JTextField user_tf;
    // End of variables declaration//GEN-END:variables

   
}
