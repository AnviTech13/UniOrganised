
package uniorganised;


import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;



public class Univ_Info extends javax.swing.JFrame {
     Connection con;
  PreparedStatement stmt;
     boolean ctr;
     ResultSet rs;
     byte i=4;
    public Univ_Info(boolean ctr) throws SQLException {
        initComponents();
        this.getRootPane().setDefaultButton(insert_bt);
        this.setTitle("University Information");
        insert_bt.setEnabled(false);
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.ctr=ctr;
        con=ConnDb.conLink();
        insert_bt.setEnabled(false);
        clear_bt.setEnabled(false);
        this.setLocationRelativeTo(null);
        ButtonGroup bg=new ButtonGroup();
        bg.add(regu_rbt);
        bg.add(dis_rbt);
         attend_check.setEnabled(false);
        nattend_check.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        uniname_tf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        add_ta = new javax.swing.JTextArea();
        regu_rbt = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        dis_rbt = new javax.swing.JRadioButton();
        insert_bt = new javax.swing.JButton();
        clear_bt = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        umsg = new javax.swing.JLabel();
        amsg = new javax.swing.JLabel();
        smsg = new javax.swing.JLabel();
        attend_check = new javax.swing.JCheckBox();
        nattend_check = new javax.swing.JCheckBox();
        jan_check = new javax.swing.JCheckBox();
        july_check = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 170, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Algerian", 2, 30)); // NOI18N
        jLabel4.setText("Information");

        jLabel3.setFont(new java.awt.Font("Algerian", 2, 48)); // NOI18N
        jLabel3.setText("University");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/newiconuni.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(293, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 849, 150));

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jLabel11.setText("University Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jLabel12.setText("University Address");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel12)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jLabel13.setText("University Mode");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel13)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        uniname_tf.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        uniname_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        uniname_tf.setNextFocusableComponent(add_ta);
        uniname_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uniname_tfFocusLost(evt);
            }
        });
        uniname_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                uniname_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uniname_tfKeyTyped(evt);
            }
        });

        add_ta.setColumns(20);
        add_ta.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        add_ta.setRows(5);
        add_ta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add_ta.setNextFocusableComponent(icon);
        add_ta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                add_taKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                add_taKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(add_ta);

        regu_rbt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        regu_rbt.setText("Regular");
        regu_rbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regu_rbtMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jLabel14.setText("Session");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        dis_rbt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        dis_rbt.setSelected(true);
        dis_rbt.setText("Distance");
        dis_rbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dis_rbtMouseClicked(evt);
            }
        });

        insert_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insert_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/add.png"))); // NOI18N
        insert_bt.setText("Insert");
        insert_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_btActionPerformed(evt);
            }
        });

        clear_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/if_edit-clear_118917.png"))); // NOI18N
        clear_bt.setText("Clear");
        clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btActionPerformed(evt);
            }
        });

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/lappy.png"))); // NOI18N
        icon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iconFocusGained(evt);
            }
        });

        umsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        umsg.setForeground(new java.awt.Color(255, 0, 0));

        amsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        amsg.setForeground(new java.awt.Color(255, 0, 0));

        smsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        smsg.setForeground(new java.awt.Color(255, 51, 51));

        attend_check.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        attend_check.setText("Attending");
        attend_check.setContentAreaFilled(false);

        nattend_check.setFont(new java.awt.Font("Cambria", 1, 15)); // NOI18N
        nattend_check.setText("Non-Attending");
        nattend_check.setContentAreaFilled(false);
        nattend_check.setNextFocusableComponent(jan_check);

        jan_check.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jan_check.setText("  January");
        jan_check.setContentAreaFilled(false);

        july_check.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        july_check.setText("  July");
        july_check.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(smsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(237, 237, 237))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(uniname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amsg, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(attend_check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nattend_check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jan_check, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(242, 242, 242)
                                        .addComponent(july_check, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(umsg, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(regu_rbt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(263, 263, 263)
                                .addComponent(dis_rbt)))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(insert_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dis_rbt, regu_rbt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jan_check, july_check});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uniname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(umsg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dis_rbt)
                        .addComponent(regu_rbt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(attend_check)
                        .addGap(18, 18, 18)
                        .addComponent(nattend_check)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jan_check, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(july_check, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dis_rbt, regu_rbt});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 850, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insert_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_btActionPerformed
         try {
             stmt=con.prepareStatement("insert into uni_info values(?,?,?,?)");
              stmt.setString(1,uniname_tf.getText());
            stmt.setString(2,add_ta.getText());
            if(jan_check.isSelected() && july_check.isSelected())
                stmt.setString(4, "January & July");
            else if(july_check.isSelected()) 
                stmt.setString(4,"July");
            else
                stmt.setString(4,"January");
           if(regu_rbt.isSelected())
               if(attend_check.isSelected()&& nattend_check.isSelected())
                stmt.setString(3, "Regular(Attending And Non-Attending)");
               else if(attend_check.isSelected())
                     stmt.setString(3,"Regular(Attending)");
                   else 
                    stmt.setString(3,"Regular(Non-Attending)");
          else 
            stmt.setString(3,"Distance");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record successfully inserted");
            
         }
          catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Record is not inserted");
         }
         try {
             backup.back("select * from uni_info","UniversityDetails.xls");
         } catch (IOException ex) {
             Logger.getLogger(Univ_Info.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Univ_Info.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Univ_Info.class.getName()).log(Level.SEVERE, null, ex);
         } catch (WriteException ex) {
             Logger.getLogger(Univ_Info.class.getName()).log(Level.SEVERE, null, ex);
         } catch (BiffException ex) {
             Logger.getLogger(Univ_Info.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_insert_btActionPerformed

    private void clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btActionPerformed
      uniname_tf.setText("");
      add_ta.setText("");
      july_check.setSelected(false);
      jan_check.setSelected(false);
      attend_check.setEnabled(false);
      nattend_check.setEnabled(false);
      attend_check.setSelected(false);
      nattend_check.setSelected(false);
      regu_rbt.setSelected(false);
      dis_rbt.setSelected(true);
      uniname_tf.requestFocus();
      insert_bt.setEnabled(false);
    }//GEN-LAST:event_clear_btActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      new EntryForms(ctr).setVisible(true);
      this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void uniname_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uniname_tfFocusLost
       String str=uniname_tf.getText();
         try {
             stmt=con.prepareStatement("select uni_name from uni_info where upper(uni_name)=?");
             stmt.setString(1,uniname_tf.getText().toUpperCase());
             rs=stmt.executeQuery();
            if(rs.next()){
                umsg.setText("*This University is already exist !");
                uniname_tf.requestFocus();
            } 
         } catch (SQLException ex) {
             Logger.getLogger(Univ_Info.class.getName()).log(Level.SEVERE, null, ex);
         }
       
       if(str.length()==0)
       {
           umsg.setText("*Please enter University Name !");
           uniname_tf.requestFocus();
       }
       
    }//GEN-LAST:event_uniname_tfFocusLost

    private void uniname_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uniname_tfKeyTyped
        String str=uniname_tf.getText();
        char ch=evt.getKeyChar();
       if((ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           umsg.setText("*Digits Not Allowed !");
       }
       else if((str.length()==0 && ch==' ')){
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           umsg.setText("*University Name cannot start with space !"); 
       }
       else if(str.length()==0 && ch=='.'){
            evt.consume();
           Toolkit.getDefaultToolkit().beep();
           umsg.setText("*University Name cannot start with dot !");
       }
    }//GEN-LAST:event_uniname_tfKeyTyped

    private void uniname_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uniname_tfKeyPressed
        umsg.setText("");
    }//GEN-LAST:event_uniname_tfKeyPressed

    private void iconFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iconFocusGained
        String str=add_ta.getText();
        if(str.length()==0)
        {
            amsg.setText("Please enter University Address !");
            add_ta.requestFocus();
        }
        else
          regu_rbt.requestFocus();
    }//GEN-LAST:event_iconFocusGained

    private void add_taKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add_taKeyTyped
         String str=add_ta.getText();
        char ch=evt.getKeyChar();
       if((str.length()==0 && ch==' ')){
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           amsg.setText("*Address cannot start with space !"); 
       }
       else if(str.length()==0 && ch=='.'){
            evt.consume();
           Toolkit.getDefaultToolkit().beep();
           amsg.setText("*Address cannot start with dot !");
       }
    }//GEN-LAST:event_add_taKeyTyped

    private void add_taKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_add_taKeyPressed
        amsg.setText("");
        insert_bt.setEnabled(true);
        clear_bt.setEnabled(true);
    }//GEN-LAST:event_add_taKeyPressed

    private void regu_rbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regu_rbtMouseClicked
         attend_check.setEnabled(true);
        nattend_check.setEnabled(true);
    }//GEN-LAST:event_regu_rbtMouseClicked

    private void dis_rbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dis_rbtMouseClicked
        attend_check.setEnabled(false);
        nattend_check.setEnabled(false);
    }//GEN-LAST:event_dis_rbtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea add_ta;
    private javax.swing.JLabel amsg;
    private javax.swing.JCheckBox attend_check;
    private javax.swing.JButton clear_bt;
    private javax.swing.JRadioButton dis_rbt;
    private javax.swing.JLabel icon;
    private javax.swing.JButton insert_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jan_check;
    private javax.swing.JCheckBox july_check;
    private javax.swing.JCheckBox nattend_check;
    private javax.swing.JRadioButton regu_rbt;
    private javax.swing.JLabel smsg;
    private javax.swing.JLabel umsg;
    private javax.swing.JTextField uniname_tf;
    // End of variables declaration//GEN-END:variables

}
