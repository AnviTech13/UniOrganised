
package uniorganised;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserDetails extends javax.swing.JFrame {
     Connection con;
        PreparedStatement stmt;
        DefaultTableModel model;
    public UserDetails() throws SQLException {
        initComponents();
        this.getRootPane().setDefaultButton(select_bt);
       this.setTitle("Users Detail");
       ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
        con=ConnDb.conLink();
        stmt=con.prepareStatement("select * from login");
        ResultSet rs=stmt.executeQuery();
        model=(DefaultTableModel)tab.getModel();
        while(rs.next()){
         model.addRow(new Object[]{false,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
        }
   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        select_bt = new javax.swing.JButton();
        del_bt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        user_msg = new javax.swing.JLabel();
        search_tf = new org.jdesktop.swingx.JXSearchField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("User Name");

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\customer Details.png")); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        select_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        select_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\output-onlinepngtools (47).png")); // NOI18N
        select_bt.setText("SELECT");
        select_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_btActionPerformed(evt);
            }
        });

        del_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        del_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\delete.png")); // NOI18N
        del_bt.setText("DELETE");
        del_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btActionPerformed(evt);
            }
        });

        tab.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "User Name", "Password", "Question", "Answer", "Jobrole"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tab.setEnabled(false);
        jScrollPane1.setViewportView(tab);

        user_msg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        user_msg.setForeground(new java.awt.Color(255, 0, 0));
        user_msg.setText("*");

        search_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_tfKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(select_bt))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(del_bt)
                                .addGap(74, 74, 74))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(user_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {del_bt, select_bt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_msg)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_bt)
                    .addComponent(del_bt))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {del_bt, select_bt});

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

    private void del_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btActionPerformed
         if(search_tf.getText().length()==0)
       {
           user_msg.setText("*Please enter User name");
       }
             int r=JOptionPane.showConfirmDialog(null,"DO U WANT TO DELETE THE RECORD","Confirmation Window",JOptionPane.YES_NO_OPTION);
             if(r==0){
             for(byte i=1;i<tab.getRowCount();i++){
               if(model.getValueAt(i,0).toString().equalsIgnoreCase("true")){
                   try {
                       stmt=con.prepareStatement("delete from login where uname=?");
                        stmt.setString(1,model.getValueAt(i,1).toString());
                        stmt.executeUpdate();
                        model.removeRow(i);
                         i--;
                   } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Unsuccessful");
                   }
            }}
         } 
    }//GEN-LAST:event_del_btActionPerformed

    private void select_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_btActionPerformed
         boolean flg=true;
         if(search_tf.getText().length()==0)
       {
           user_msg.setText("Please enter user name");
           search_tf.requestFocus();
       } 
       else
       {
           user_msg.setText("");
         for(byte i=1;i<tab.getRowCount();i++)
             if(model.getValueAt(i,1).toString().equalsIgnoreCase(search_tf.getText())){
                 tab.setRowSelectionInterval(i,i);
                 tab.setSelectionBackground(Color.BLUE);
                 tab.setSelectionForeground(Color.white);
                 model.setValueAt(true, i,0);
                 flg=false;
                 break;
             }
                if(flg)
                  JOptionPane.showMessageDialog(null,"Record not available for entered user name :"+search_tf.getText());
       }
    }//GEN-LAST:event_select_btActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       new ControlForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void search_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_tfKeyTyped
       user_msg.setText("");
    }//GEN-LAST:event_search_tfKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton del_bt;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXSearchField search_tf;
    private javax.swing.JButton select_bt;
    private javax.swing.JTable tab;
    private javax.swing.JLabel user_msg;
    // End of variables declaration//GEN-END:variables

}
