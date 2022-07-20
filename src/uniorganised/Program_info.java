
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


public class Program_info extends javax.swing.JFrame {
 Connection con;
  PreparedStatement stmt;
  boolean ctr; ResultSet rs;
    public Program_info(boolean ctr) throws SQLException 
    {
        initComponents();
        con=ConnDb.conLink(); 
        this.setLocationRelativeTo(null);
       this.setTitle("Program Info");
       ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.ctr=ctr;
        insert_bt.setEnabled(false);
        stmt=con.prepareStatement("select uni_name from uni_info");
        rs=stmt.executeQuery();
        uni_cmb.addItem("select university");
        while(rs.next()){
            uni_cmb.addItem(rs.getString(1));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pfee_lb = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        min = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        pg_tf = new javax.swing.JTextField();
        pfee_tf = new javax.swing.JTextField();
        insert_bt = new javax.swing.JButton();
        clear_bt = new javax.swing.JButton();
        uni_cmb = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        rec_cmb = new javax.swing.JComboBox<>();
        pnmsg = new javax.swing.JLabel();
        pf_lb = new javax.swing.JLabel();
        yr_lb = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        min_cmb = new javax.swing.JComboBox<>();
        max_cmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        jLabel2.setText("PROGRAMS");

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 30)); // NOI18N
        jLabel3.setText("DETAILS");

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\University Project\\UniOrganised\\src\\uniorganised\\bookstock.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(184, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(146, 146, 146))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 596, 140));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setForeground(new java.awt.Color(255, 153, 153));

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("University Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Program Name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel13)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 255));

        pfee_lb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pfee_lb.setForeground(new java.awt.Color(255, 255, 255));
        pfee_lb.setText("Program Fee");
        pfee_lb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfee_lbFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(pfee_lb)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pfee_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 255));

        min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        min.setForeground(new java.awt.Color(255, 255, 255));
        min.setText(" Minimum  Duration");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(min, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(min, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(51, 51, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Maximum  Duration");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel14)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        pg_tf.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        pg_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pg_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pg_tfFocusLost(evt);
            }
        });
        pg_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pg_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pg_tfKeyTyped(evt);
            }
        });

        pfee_tf.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        pfee_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pfee_tf.setNextFocusableComponent(pfee_lb);
        pfee_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfee_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfee_tfKeyTyped(evt);
            }
        });

        insert_bt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        insert_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/add.png"))); // NOI18N
        insert_bt.setText("Insert");
        insert_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_btActionPerformed(evt);
            }
        });

        clear_bt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        clear_bt.setIcon(new javax.swing.ImageIcon("D:\\University Project\\UniOrganised\\src\\uniorganised\\if_edit-clear_118917.png")); // NOI18N
        clear_bt.setText("Clear");
        clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btActionPerformed(evt);
            }
        });

        uni_cmb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(51, 51, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("University Recognisation");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        rec_cmb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rec_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Recognisation", "UGC" }));
        rec_cmb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rec_cmbFocusGained(evt);
            }
        });

        pnmsg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        pnmsg.setForeground(new java.awt.Color(255, 0, 0));

        pf_lb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pf_lb.setForeground(new java.awt.Color(255, 0, 0));

        yr_lb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        yr_lb.setText("YEARS");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("YEARS");

        min_cmb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        min_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        min_cmb.setNextFocusableComponent(max_cmb);

        max_cmb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        max_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        max_cmb.setNextFocusableComponent(rec_cmb);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(insert_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pg_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(pfee_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(pnmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(max_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(min_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yr_lb))
                    .addComponent(pf_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uni_cmb, 0, 0, Short.MAX_VALUE)
                    .addComponent(rec_cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel3, jPanel4, jPanel5, jPanel6, jPanel7});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pfee_tf, pg_tf});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clear_bt, insert_bt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uni_cmb))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pg_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pfee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pf_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(min_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yr_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(max_cmb)
                            .addComponent(jLabel6))
                        .addGap(44, 44, 44)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rec_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel3, jPanel4, jPanel5, jPanel6, jPanel7});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clear_bt, insert_bt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {rec_cmb, uni_cmb});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {max_cmb, min_cmb});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 141, 600, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insert_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_btActionPerformed
     try {
         stmt=con.prepareStatement("insert into prog_info values(?,?,?,?,?,?)");
            stmt.setString(1,pg_tf.getText());
            stmt.setString(5,max_cmb.getSelectedItem().toString());
            stmt.setString(2,pfee_tf.getText());
            stmt.setString(3,uni_cmb.getSelectedItem().toString());
            stmt.setString(4,max_cmb.getSelectedItem().toString());
           stmt.setString(6,rec_cmb.getSelectedItem().toString());
            stmt.executeUpdate();
             JOptionPane.showMessageDialog(null,"Record successfully inserted");
     } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Record is not inserted");
     }
     try {      
         backup.back("select * from prog_info","Programdetails.xls");
     } catch (IOException ex) {
         Logger.getLogger(Program_info.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Program_info.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(Program_info.class.getName()).log(Level.SEVERE, null, ex);
     } catch (WriteException ex) {
         Logger.getLogger(Program_info.class.getName()).log(Level.SEVERE, null, ex);
     } catch (BiffException ex) {
         Logger.getLogger(Program_info.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_insert_btActionPerformed

    private void clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btActionPerformed
           uni_cmb.setSelectedIndex(0);
           rec_cmb.setSelectedIndex(0);
           min_cmb.setSelectedIndex(0);
           max_cmb.setSelectedIndex(0);
           pg_tf.setText("");
            pfee_tf.setText("");
            insert_bt.setEnabled(false);
            uni_cmb.requestFocus();
    }//GEN-LAST:event_clear_btActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       new EntryForms(ctr).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void pg_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pg_tfFocusLost
       String str=pg_tf.getText();
       if(str.length()==0)
       {
           pnmsg.setText("*Program Name cannot be empty !");
           pg_tf.requestFocus();
       }
       else
          pfee_tf.requestFocus();
    }//GEN-LAST:event_pg_tfFocusLost

    private void pg_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pg_tfKeyTyped
       String str=pg_tf.getText();
        char ch=evt.getKeyChar();
        if(str.length()==0 && ch==' '){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            pnmsg.setText("*Program name cannot start with space!");
        } 
        else if(str.length()==0 && ch=='.')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            pnmsg.setText("*Program name cannot start with dot!");
        }
       if((ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           pnmsg.setText("*Digits Not Allowed !");
       }
    }//GEN-LAST:event_pg_tfKeyTyped

    private void pg_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pg_tfKeyPressed
      pnmsg.setText("");
    }//GEN-LAST:event_pg_tfKeyPressed

    private void pfee_lbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfee_lbFocusGained
       String str=pfee_tf.getText();
        if(str.length()==0)
        {
            pf_lb.setText("*Please enter Program fee !");
            pfee_tf.requestFocus();
        }
        else
          min_cmb.requestFocus();
    }//GEN-LAST:event_pfee_lbFocusGained

    private void pfee_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfee_tfKeyPressed
       pf_lb.setText("");
    }//GEN-LAST:event_pfee_tfKeyPressed

    private void pfee_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfee_tfKeyTyped
       String str=pfee_tf.getText();
        char ch=evt.getKeyChar();
       if(!(ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_pfee_tfKeyTyped

    private void rec_cmbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rec_cmbFocusGained
       insert_bt.setEnabled(true);
    }//GEN-LAST:event_rec_cmbFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_bt;
    private javax.swing.JButton insert_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JComboBox<String> max_cmb;
    private javax.swing.JLabel min;
    private javax.swing.JComboBox<String> min_cmb;
    private javax.swing.JLabel pf_lb;
    private javax.swing.JLabel pfee_lb;
    private javax.swing.JTextField pfee_tf;
    private javax.swing.JTextField pg_tf;
    private javax.swing.JLabel pnmsg;
    private javax.swing.JComboBox<String> rec_cmb;
    private javax.swing.JComboBox<String> uni_cmb;
    private javax.swing.JLabel yr_lb;
    // End of variables declaration//GEN-END:variables

}
