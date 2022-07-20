package uniorganised;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class CreateUser extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    boolean flag;
    ResultSet rs;
    public CreateUser(boolean flag) throws SQLException {
        initComponents();
        create_bt.setEnabled(false);
        pswd_tf.setEnabled(false);
        confirm_tf.setEnabled(false);
        que_tf.setEnabled(false);
        ans_tf.setEnabled(false);
        this.setTitle("Create User ");
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.getRootPane().setDefaultButton(create_bt);
        this.setLocationRelativeTo(null);
        this.flag=flag;
        if(flag)
        {
           ad_rbt.setSelected(true);
            simple_rbt.setEnabled(false);
            next_bt.setEnabled(false);
            pswd_tf.setEnabled(true);
        }
        con=ConnDb.conLink();
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
        anslb = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ad_rbt = new javax.swing.JRadioButton();
        simple_rbt = new javax.swing.JRadioButton();
        piclb = new javax.swing.JLabel();
        user_tf = new javax.swing.JTextField();
        ans_tf = new javax.swing.JTextField();
        create_bt = new javax.swing.JButton();
        next_bt = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pswd_tf = new javax.swing.JPasswordField();
        confirm_tf = new javax.swing.JPasswordField();
        c_bt = new javax.swing.JButton();
        p_bt = new javax.swing.JButton();
        umsg = new javax.swing.JLabel();
        pmsg = new javax.swing.JLabel();
        amsg = new javax.swing.JLabel();
        que_tf = new javax.swing.JTextField();
        qmsg = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(102, 51, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("User name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(102, 51, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 153));
        jLabel2.setText("Password");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(102, 51, 255));

        anslb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        anslb.setForeground(new java.awt.Color(255, 255, 153));
        anslb.setText("Answer");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(anslb)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anslb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(102, 51, 255));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Question");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel4)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        ad_rbt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        ad_rbt.setText("Admin");

        simple_rbt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        simple_rbt.setSelected(true);
        simple_rbt.setText("Simple user");

        piclb.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\add icon.png")); // NOI18N

        user_tf.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        user_tf.setNextFocusableComponent(pswd_tf);
        user_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                user_tfFocusLost(evt);
            }
        });
        user_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                user_tfKeyTyped(evt);
            }
        });

        ans_tf.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        ans_tf.setToolTipText("Press Tab to create");
        ans_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ans_tfFocusLost(evt);
            }
        });
        ans_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ans_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ans_tfKeyTyped(evt);
            }
        });

        create_bt.setFont(new java.awt.Font("Cambria", 1, 17)); // NOI18N
        create_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\create icon.png")); // NOI18N
        create_bt.setText("Create");
        create_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_btActionPerformed(evt);
            }
        });

        next_bt.setFont(new java.awt.Font("Cambria", 1, 17)); // NOI18N
        next_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\output-onlinepngtools (44).png")); // NOI18N
        next_bt.setText("Next");
        next_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\adminn.png")); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\userss.png")); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);

        jPanel7.setBackground(new java.awt.Color(102, 51, 255));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 153));
        jLabel8.setText("Confirm Password");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(40, 40, 40))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        pswd_tf.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        pswd_tf.setNextFocusableComponent(confirm_tf);
        pswd_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswd_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pswd_tfKeyTyped(evt);
            }
        });

        confirm_tf.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        confirm_tf.setNextFocusableComponent(que_tf);
        confirm_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirm_tfFocusLost(evt);
            }
        });

        c_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/show.png"))); // NOI18N
        c_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_btActionPerformed(evt);
            }
        });

        p_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/show.png"))); // NOI18N
        p_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_btActionPerformed(evt);
            }
        });

        umsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        umsg.setForeground(new java.awt.Color(255, 0, 0));

        pmsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pmsg.setForeground(new java.awt.Color(255, 0, 0));

        amsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        amsg.setForeground(new java.awt.Color(255, 0, 0));

        que_tf.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        que_tf.setNextFocusableComponent(ans_tf);
        que_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                que_tfFocusLost(evt);
            }
        });
        que_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                que_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                que_tfKeyTyped(evt);
            }
        });

        qmsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        qmsg.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(create_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(user_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(umsg, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pswd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(simple_rbt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ad_rbt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(c_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(p_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(confirm_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(que_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(qmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(next_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ans_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amsg, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(piclb, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel2, jPanel3, jPanel4, jPanel5});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {confirm_tf, pswd_tf});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(user_tf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(umsg, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ad_rbt)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(simple_rbt)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pswd_tf)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirm_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ans_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(c_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(piclb, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(que_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(107, 107, 107)
                                        .addComponent(amsg, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(next_bt))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(create_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(29, 29, 29))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {create_bt, next_bt});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel2, jPanel3, jPanel4, jPanel5});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {confirm_tf, pswd_tf});

        jPanel6.setBackground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 153));
        jLabel5.setText("  Create User");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\users img.png")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(flag)
                try {
                    new LoginWindow().setVisible(true);
                    this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        else{
        new ControlForm().setVisible(true);
        this.dispose();
             
        }
           
    }//GEN-LAST:event_formWindowClosing

    private void c_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_btActionPerformed
        if(flag){
            ImageIcon img=new ImageIcon(getClass().getResource("close eye.png"));
            c_bt.setIcon(img);
            confirm_tf.setEchoChar((char)0);
            flag=false;
        }
        else{
            ImageIcon img=new ImageIcon(getClass().getResource("show.png"));
            c_bt.setIcon(img);
            confirm_tf.setEchoChar('\u25cf');
            flag=true; }
    }//GEN-LAST:event_c_btActionPerformed

    private void confirm_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirm_tfFocusLost
        if(!pswd_tf.getText().equals(confirm_tf.getText())){
             pmsg.setText("Please enter same password !");
            pswd_tf.setText("");
            confirm_tf.setText("");
            pswd_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,51,51),3));
            pswd_tf.requestFocus();
        }
        else{
            que_tf.setEnabled(true);
            que_tf.requestFocus();
        }       
    }//GEN-LAST:event_confirm_tfFocusLost

    private void pswd_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswd_tfKeyPressed
        pswd_tf.setBorder(null);
        pmsg.setText("");
        user_tf.setBorder(null);
        umsg.setText("");
    }//GEN-LAST:event_pswd_tfKeyPressed

    private void next_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btActionPerformed
        simple_rbt.setSelected(true);
        user_tf.setText("");
        pswd_tf.setText("");
        confirm_tf.setText("");
        que_tf.setText("");
        ans_tf.setText("");
        user_tf.requestFocus();
        user_tf.setBorder(null);
        umsg.setText("");
        create_bt.setEnabled(false);
    }//GEN-LAST:event_next_btActionPerformed

    private void create_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_btActionPerformed
        try {
            stmt=con.prepareStatement("insert into login values(?,?,?,?,?)");
            stmt.setString(1,user_tf.getText());
            stmt.setString(2,pswd_tf.getText());
            stmt.setString(3,que_tf.getText());
            stmt.setString(4,ans_tf.getText());
            if(ad_rbt.isSelected())
            stmt.setInt(5,0);
            else
            stmt.setInt(5,1);
            int r=stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"User I'd Created !");
            if(flag){
                this.dispose();
                new LoginWindow().setVisible(true);
            }
            else
            {
                new LoginWindow().setVisible(false);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_create_btActionPerformed

    private void user_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_tfKeyTyped
         String str=user_tf.getText();
        char ch=evt.getKeyChar();
       if((str.length()==0 && ch==' ')){
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           umsg.setText("*UserName cannot start with space"); 
       }
       else if(str.length()==0 && ch=='.'){
            evt.consume();
           Toolkit.getDefaultToolkit().beep();
           umsg.setText("*UserName cannot start with dot");
       }
    }//GEN-LAST:event_user_tfKeyTyped

    private void user_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_user_tfFocusLost
        try {
            String str=user_tf.getText();
            stmt=con.prepareStatement("select uname from login where upper(uname)=?");
            stmt.setString(1,user_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(str.length()==0)
            {
                umsg.setText("*Username Required !");
                user_tf.requestFocus();
            }
            else if(rs.next()){
              umsg.setText("User I'd already exist !");
                user_tf.setText("");  
                user_tf.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red,2));
                umsg.setFont(new java.awt.Font("Tahoma", 1, 13));
                 umsg.setForeground(Color.red);
                user_tf.requestFocus();    
            }
            else
            {
                umsg.setFont(new java.awt.Font("Tahoma", 1, 13));
                umsg.setForeground(new java.awt.Color(51, 204, 0));
              umsg.setText("User I'd is available");
              user_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0),2));
              pswd_tf.setEnabled(true);
              pswd_tf.requestFocus();
             confirm_tf.setEnabled(true);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_user_tfFocusLost

    private void ans_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ans_tfFocusLost
        String str=ans_tf.getText();
       if(str.length()==0){
           amsg.setText("Required !");
           ans_tf.requestFocus();     
     }
       else
         create_bt.setEnabled(true);
    }//GEN-LAST:event_ans_tfFocusLost

    private void ans_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ans_tfKeyTyped
 String str=user_tf.getText();
        char ch=evt.getKeyChar();
       if((str.length()==0 && ch==' ')){
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           amsg.setText("*Answer cannot start with space"); 
       }
       else if(str.length()==0 && ch=='.'){
            evt.consume();
           Toolkit.getDefaultToolkit().beep();
           amsg.setText("*Answer cannot start with dot");
       }
    }//GEN-LAST:event_ans_tfKeyTyped

    private void que_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_que_tfFocusLost
       String str=que_tf.getText();
       if(str.length()==0){
           qmsg.setText("Question is required !");
           qmsg.requestFocus();
       }
       else{
          ans_tf.setEnabled(true);
          ans_tf.requestFocus();}
    }//GEN-LAST:event_que_tfFocusLost

    private void user_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_tfKeyPressed
        umsg.setText("");
         user_tf.setBorder(javax.swing.BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_user_tfKeyPressed

    private void pswd_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswd_tfKeyTyped
        String str=pswd_tf.getText();
        char ch=evt.getKeyChar();
       if((str.length()==0 && ch==' ')){
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           pmsg.setText("*Password cannot start with space"); 
       }
    }//GEN-LAST:event_pswd_tfKeyTyped

    private void que_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_que_tfKeyTyped
        String str=que_tf.getText();
        char ch=evt.getKeyChar();
       if((ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           qmsg.setText("*Digits Not Allowed !");   
      }
       else if((str.length()==0 && ch==' ')){
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           qmsg.setText("*Question cannot start with space"); 
       }
       else if(str.length()==0 && ch=='.'){
            evt.consume();
           Toolkit.getDefaultToolkit().beep();
           qmsg.setText("*Question cannot start with dot");
       }
    }//GEN-LAST:event_que_tfKeyTyped

    private void que_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_que_tfKeyPressed
        qmsg.setText("");
    }//GEN-LAST:event_que_tfKeyPressed

    private void ans_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ans_tfKeyPressed
        amsg.setText("");
    }//GEN-LAST:event_ans_tfKeyPressed

    private void p_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_btActionPerformed
        if(flag){
            ImageIcon img=new ImageIcon(getClass().getResource("close eye.png"));
            p_bt.setIcon(img);
            pswd_tf.setEchoChar((char)0);
            flag=false;
        }
        else{
            ImageIcon img=new ImageIcon(getClass().getResource("show.png"));
            p_bt.setIcon(img);
            pswd_tf.setEchoChar('\u25cf');
            flag=true; }
    }//GEN-LAST:event_p_btActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ad_rbt;
    private javax.swing.JLabel amsg;
    private javax.swing.JTextField ans_tf;
    private javax.swing.JLabel anslb;
    private javax.swing.JButton c_bt;
    private javax.swing.JPasswordField confirm_tf;
    private javax.swing.JButton create_bt;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton next_bt;
    private javax.swing.JButton p_bt;
    private javax.swing.JLabel piclb;
    private javax.swing.JLabel pmsg;
    private javax.swing.JPasswordField pswd_tf;
    private javax.swing.JLabel qmsg;
    private javax.swing.JTextField que_tf;
    private javax.swing.JRadioButton simple_rbt;
    private javax.swing.JLabel umsg;
    private javax.swing.JTextField user_tf;
    // End of variables declaration//GEN-END:variables
  
}
