
package uniorganised;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginWindow extends javax.swing.JFrame {
      Connection con;
      PreparedStatement stmt;
      ResultSet rs;
       boolean flag=true;
      boolean ctr=true;
    public LoginWindow() throws SQLException {
        initComponents();
        this.getRootPane().setDefaultButton(login_bt);
       this.setTitle("Login");
       ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        con=ConnDb.conLink();
        user_tf.requestFocus();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user_tf = new javax.swing.JTextField();
        pswd_tf = new javax.swing.JPasswordField();
        fpswd_bt = new javax.swing.JButton();
        login_bt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        eye_bt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        pmsg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setText("USER I'D ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, 30));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, 30));

        user_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 30, 0)));
        user_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                user_tfKeyTyped(evt);
            }
        });
        getContentPane().add(user_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 280, 50));

        pswd_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswd_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 30, 0)));
        pswd_tf.setNextFocusableComponent(eye_bt);
        pswd_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswd_tfFocusGained(evt);
            }
        });
        pswd_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pswd_tfKeyTyped(evt);
            }
        });
        getContentPane().add(pswd_tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 280, 50));

        fpswd_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        fpswd_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/if_unlock_622392.png"))); // NOI18N
        fpswd_bt.setText("Forget password");
        fpswd_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpswd_btActionPerformed(evt);
            }
        });
        getContentPane().add(fpswd_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, 40));

        login_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        login_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\login.png")); // NOI18N
        login_bt.setText("Login");
        login_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btActionPerformed(evt);
            }
        });
        getContentPane().add(login_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 180, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\login ani.gif")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 290, 110));

        eye_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/show.png"))); // NOI18N
        eye_bt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                eye_btFocusGained(evt);
            }
        });
        eye_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eye_btActionPerformed(evt);
            }
        });
        getContentPane().add(eye_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, 50));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("          Notice : Your Password Is Case Sensitive");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 400, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\user id.png")); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 39, 50));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\key 2.png")); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 36, 35));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\user login.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 82, 260, 243));

        lab.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lab.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 280, 20));

        pmsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pmsg.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pmsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 397, 270, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/another login.jpeg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btActionPerformed
  
        try {
              stmt=con.prepareStatement("select * from login");
               rs=stmt.executeQuery();
            byte a=5;
            while(rs.next()){
            if(rs.getString(1).equalsIgnoreCase(user_tf.getText()))
                if(rs.getString(2).equals(pswd_tf.getText()))
                {
                    a=2;
                    if(rs.getInt(5)==0){
                        new ControlForm().setVisible(true);
                    this.dispose();}
                    else
                        new MainWindow(true).setVisible(true);
                    this.dispose();
                    break;
                }
                else
                    a=1;
            else
                a=0;
            }  
            if(a==1)
            {
                   JOptionPane.showMessageDialog(null,"your password is invalid!");
                    pswd_tf.setText("");
                    pswd_tf.requestFocus();
            }   
            else if(a==0){
                    JOptionPane.showMessageDialog(null,"your userid is invalid!");
                    pswd_tf.setText("");
                    user_tf.setText("");
                    user_tf.requestFocus();
            }   
          } catch (SQLException ex) {
              Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
          }
                     
    }//GEN-LAST:event_login_btActionPerformed

    private void fpswd_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpswd_btActionPerformed
          try {
              new ForgetPassword().setVisible(true);
               this.dispose();
          } catch (SQLException ex) {
              Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
          }
      
    }//GEN-LAST:event_fpswd_btActionPerformed

    private void eye_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eye_btActionPerformed
       if(flag){
           ImageIcon img=new ImageIcon(getClass().getResource("close eye.png"));
           eye_bt.setIcon(img);
           pswd_tf.setEchoChar((char)0);
           flag=false;    
       }
       else{
         ImageIcon img=new ImageIcon(getClass().getResource("show.png"));
           eye_bt.setIcon(img);
           pswd_tf.setEchoChar('\u25cf');
           flag=true; }     
    }//GEN-LAST:event_eye_btActionPerformed

    private void pswd_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswd_tfKeyTyped
        pmsg.setText("");
    }//GEN-LAST:event_pswd_tfKeyTyped

    private void user_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_tfKeyTyped
       lab.setText("");
    }//GEN-LAST:event_user_tfKeyTyped

    private void pswd_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswd_tfFocusGained
          String str1=user_tf.getText();
      if(str1.length()==0)
      {
          lab.setText("User I'd cannot be empty");
          user_tf.requestFocus();
      }
    }//GEN-LAST:event_pswd_tfFocusGained

    private void eye_btFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eye_btFocusGained
        String str1=pswd_tf.getText();
      if(str1.length()==0)
      {
          pmsg.setText("Password Required !");
          pswd_tf.requestFocus();
      }
    }//GEN-LAST:event_eye_btFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eye_bt;
    private javax.swing.JButton fpswd_bt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lab;
    private javax.swing.JButton login_bt;
    private javax.swing.JLabel pmsg;
    private javax.swing.JPasswordField pswd_tf;
    private javax.swing.JTextField user_tf;
    // End of variables declaration//GEN-END:variables

}
