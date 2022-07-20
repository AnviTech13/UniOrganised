
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

public class Univaccount_info extends javax.swing.JFrame {
   Connection con;
    PreparedStatement stmt;
    boolean ctr;
    ResultSet rs;
    int tot;
    public Univaccount_info(boolean ctr) throws SQLException {
        initComponents();
        insert_bt.setEnabled(false);
        due_tf.setEditable(false);
        this.ctr=ctr;
        this.setTitle("Account Information");
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        con=ConnDb.conLink();
        this.setLocationRelativeTo(null);
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

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        tot_lb = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        pd_lb = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        paid_tf = new javax.swing.JTextField();
        pamt_cmb = new javax.swing.JComboBox<>();
        due_tf = new javax.swing.JTextField();
        sess_tf = new javax.swing.JTextField();
        tot_tf = new javax.swing.JTextField();
        clear_bt = new javax.swing.JButton();
        insert_bt = new javax.swing.JButton();
        uni_cmb = new javax.swing.JComboBox<>();
        smsg = new javax.swing.JLabel();
        tmsg = new javax.swing.JLabel();
        pmsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\output-onlinepngtools (34).png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        jLabel1.setText("UNIVERSITY");

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        jLabel2.setText("ACCOUNT");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 30)); // NOI18N
        jLabel5.setText("INFORMATION");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("University Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(153, 255, 153));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 102));
        jLabel10.setText("Session");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel10)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(153, 255, 153));

        tot_lb.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        tot_lb.setForeground(new java.awt.Color(0, 153, 102));
        tot_lb.setText("Total Amount");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(tot_lb)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tot_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(153, 255, 153));

        pd_lb.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        pd_lb.setForeground(new java.awt.Color(0, 153, 102));
        pd_lb.setText("Paid Amount");
        pd_lb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pd_lbFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(pd_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pd_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.setBackground(new java.awt.Color(153, 255, 153));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 102));
        jLabel14.setText("Payment Mode");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(153, 255, 153));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 102));
        jLabel13.setText("Dues Amount");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel13)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        paid_tf.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        paid_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        paid_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                paid_tfFocusLost(evt);
            }
        });
        paid_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paid_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paid_tfKeyTyped(evt);
            }
        });

        pamt_cmb.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        pamt_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UPI", "CASH", "NEFT", "PAYTM" }));

        due_tf.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        due_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        sess_tf.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        sess_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sess_tf.setNextFocusableComponent(tot_tf);
        sess_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sess_tfFocusLost(evt);
            }
        });
        sess_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sess_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sess_tfKeyTyped(evt);
            }
        });

        tot_tf.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tot_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tot_tf.setNextFocusableComponent(pd_lb);
        tot_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tot_tfFocusLost(evt);
            }
        });
        tot_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tot_tfKeyTyped(evt);
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

        insert_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insert_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\add.png")); // NOI18N
        insert_bt.setText("Insert");
        insert_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_btActionPerformed(evt);
            }
        });

        uni_cmb.setFont(new java.awt.Font("Cambria", 1, 17)); // NOI18N

        smsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        smsg.setForeground(new java.awt.Color(255, 51, 51));

        tmsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tmsg.setForeground(new java.awt.Color(255, 0, 51));

        pmsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pmsg.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(317, 317, 317)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(insert_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(uni_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tot_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                .addComponent(paid_tf)
                                .addComponent(due_tf)
                                .addComponent(sess_tf)
                                .addComponent(pamt_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(smsg, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tmsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(pmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 31, Short.MAX_VALUE))))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel10, jPanel3, jPanel6, jPanel7, jPanel8, jPanel9});

        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(uni_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(sess_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smsg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(tot_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(paid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(due_tf))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pamt_cmb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insert_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(56, 56, 56))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {due_tf, paid_tf, sess_tf, tot_tf});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel10, jPanel3, jPanel6, jPanel7, jPanel8, jPanel9});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insert_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_btActionPerformed
       try {
           stmt=con.prepareStatement("insert into acc_details values(?,?,?,?,?,?)");
           stmt.setString(1,tot_tf.getText());
           stmt.setString(2,paid_tf.getText());
            stmt.setString(3,pamt_cmb.getSelectedItem().toString());
            stmt.setString(4,uni_cmb.getSelectedItem().toString());
            stmt.setString(5,due_tf.getText());
            stmt.setString(6,sess_tf.getText());
           stmt.executeUpdate();
             JOptionPane.showMessageDialog(null,"Record successfully inserted");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Record is not inserted");
       }
       try {
           backup.back("select * from acc_details","AccountDetails.xls");
       } catch (IOException ex) {
           Logger.getLogger(Univaccount_info.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Univaccount_info.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(Univaccount_info.class.getName()).log(Level.SEVERE, null, ex);
       } catch (WriteException ex) {
           Logger.getLogger(Univaccount_info.class.getName()).log(Level.SEVERE, null, ex);
       } catch (BiffException ex) {
           Logger.getLogger(Univaccount_info.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_insert_btActionPerformed

    private void clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btActionPerformed
       uni_cmb.setSelectedIndex(0);
       sess_tf.setText("");
       tot_tf.setText("");
       paid_tf.setText("");
       due_tf.setText("");
       pamt_cmb.setSelectedIndex(0);
       uni_cmb.requestFocus();
       clear_bt.setEnabled(false);
    }//GEN-LAST:event_clear_btActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
     new EntryForms(ctr).setVisible(true);
     this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void sess_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sess_tfFocusLost
        String str=sess_tf.getText();
      if(str.length()==0){
          smsg.setText("*Please enter session ");
          sess_tf.requestFocus();}
    }//GEN-LAST:event_sess_tfFocusLost

    private void sess_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sess_tfKeyTyped
         String str=sess_tf.getText();
        char ch=evt.getKeyChar();
       if((ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           smsg.setText("*Digits Not Allowed !");   
      }
       else if((str.length()==0 && ch==' ')){
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           smsg.setText("*Session cannot start with space"); 
       }
       else if(str.length()==0 && ch=='.'){
            evt.consume();
           Toolkit.getDefaultToolkit().beep();
           smsg.setText("*Session cannot start with dot");
       }
    }//GEN-LAST:event_sess_tfKeyTyped

    private void tot_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tot_tfKeyTyped
        String str=tot_tf.getText();
        char ch=evt.getKeyChar();
       if(!(ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
       }
    }//GEN-LAST:event_tot_tfKeyTyped

    private void pd_lbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pd_lbFocusGained
        String str=tot_tf.getText();
         if(str.length()==0){
          tmsg.setText("*Please enter Total Amount ");
          tot_tf.requestFocus();}
         else
           paid_tf.requestFocus();
            
    }//GEN-LAST:event_pd_lbFocusGained

    private void sess_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sess_tfKeyPressed
        smsg.setText("");
    }//GEN-LAST:event_sess_tfKeyPressed

    private void paid_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paid_tfFocusLost
   due_tf.setText(""+(tot-Integer.parseInt(paid_tf.getText())));      
        String str=paid_tf.getText();
         if(str.length()==0){
          pmsg.setText("*Please enter Total Amount ");
          paid_tf.requestFocus();}
         else
           pamt_cmb.requestFocus();
    }//GEN-LAST:event_paid_tfFocusLost

    private void paid_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paid_tfKeyTyped
       String str=paid_tf.getText();
        char ch=evt.getKeyChar();
       if(!(ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
      }
    }//GEN-LAST:event_paid_tfKeyTyped

    private void paid_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paid_tfKeyPressed
       insert_bt.setEnabled(true);
    }//GEN-LAST:event_paid_tfKeyPressed

    private void tot_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tot_tfFocusLost
              tot=Integer.parseInt(tot_tf.getText());
       try {
           stmt=con.prepareStatement("select due from acc_details where uni_name=?");
           stmt.setString(1,uni_cmb.getSelectedItem().toString());
                rs=stmt.executeQuery();
                if(rs.next()){
                    tot_tf.setText(tot_tf.getText()+"+"+rs.getString(1)+"(Dues)");
                    tot=tot+Integer.parseInt(rs.getString(1));
                }       
                
                else
                    JOptionPane.showMessageDialog(null,"records not found");
       } catch (SQLException ex) {
           Logger.getLogger(Univaccount_info.class.getName()).log(Level.SEVERE, null, ex);
       }
                

    }//GEN-LAST:event_tot_tfFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_bt;
    private javax.swing.JTextField due_tf;
    private javax.swing.JButton insert_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField paid_tf;
    private javax.swing.JComboBox<String> pamt_cmb;
    private javax.swing.JLabel pd_lb;
    private javax.swing.JLabel pmsg;
    private javax.swing.JTextField sess_tf;
    private javax.swing.JLabel smsg;
    private javax.swing.JLabel tmsg;
    private javax.swing.JLabel tot_lb;
    private javax.swing.JTextField tot_tf;
    private javax.swing.JComboBox<String> uni_cmb;
    // End of variables declaration//GEN-END:variables

}
