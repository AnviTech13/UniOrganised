
package uniorganised;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Student_Search extends javax.swing.JFrame {

    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    DefaultTableModel mode;
    int j;
    boolean ctr;
    public Student_Search(boolean ctr) throws SQLException {
        initComponents();
         search_tf.requestFocus();
        this.setTitle("Student Search");
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.ctr=ctr;
        if(ctr){
            tabpane.setEnabledAt(1,false);
            tabpane.setEnabledAt(2,false);
        }
        con=ConnDb.conLink();
        this.setLocationRelativeTo(null);
        search_bt.setEnabled(false);
        clear_bt.setEnabled(false);
        update_bt.setEnabled(false);
        del_bt.setEnabled(false);
        searchall_bt.setEnabled(false);
        load_bt.setEnabled(true);
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabpane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        search_cmb = new javax.swing.JComboBox<>();
        search_bt = new javax.swing.JButton();
        clear_bt = new javax.swing.JButton();
        msg = new javax.swing.JLabel();
        search_tf = new org.jdesktop.swingx.JXSearchField();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        update_bt = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        sid_up = new javax.swing.JTextField();
        start_sess = new javax.swing.JTextField();
        cont_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pg_tf = new javax.swing.JTextField();
        msg2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        end_sess = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pfee_tf = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sid_del = new javax.swing.JTextField();
        del_bt = new javax.swing.JButton();
        msg3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        search_tab = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        sid_search = new javax.swing.JTextField();
        searchall_bt = new javax.swing.JButton();
        load_bt = new javax.swing.JButton();
        msg4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tabpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabpaneMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Icon\\ssearch.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel15)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(110, 110, 110))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 153));

        search_cmb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        search_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student I'd", "Name" }));
        search_cmb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));

        search_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        search_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\search.png")); // NOI18N
        search_bt.setText("SEARCH");
        search_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));
        search_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btActionPerformed(evt);
            }
        });

        clear_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        clear_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/if_edit-clear_118917.png"))); // NOI18N
        clear_bt.setText("CLEAR");
        clear_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));
        clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btActionPerformed(evt);
            }
        });

        msg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 51, 0));
        msg.setText("*Please enter Student I'd");

        search_tf.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        search_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_tfKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                        .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clear_bt, search_bt});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabpane.addTab("SEARCH", jPanel1);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Icon\\upstud.png")); // NOI18N

        update_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\Reset.png")); // NOI18N
        update_bt.setText("UPDATE");
        update_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel8))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(update_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(107, 107, 107)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(update_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));

        sid_up.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        sid_up.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        sid_up.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sid_upFocusLost(evt);
            }
        });
        sid_up.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sid_upKeyTyped(evt);
            }
        });

        start_sess.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        start_sess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        cont_tf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cont_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        email_tf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        email_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("STUDENT I'D");

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("PROGRAM NAME");

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel5.setText("STARTING SESSION");

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setText("CONTACT NO");

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel7.setText("EMAIL");

        pg_tf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        pg_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        msg2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg2.setForeground(new java.awt.Color(255, 51, 0));
        msg2.setText("*Please enter Student I'd");

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setText("ENDING SESSION");

        end_sess.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        end_sess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel12.setText("PROGRAM FEE");

        pfee_tf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        pfee_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(end_sess, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start_sess, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(cont_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(email_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addGap(87, 87, 87)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sid_up, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pg_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(msg2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cont_tf, email_tf, pg_tf, sid_up, start_sess});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sid_up, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(msg2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pg_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(42, 42, 42)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(start_sess, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(end_sess, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cont_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cont_tf, email_tf, pg_tf, sid_up, start_sess});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabpane.addTab("UPDATE", jPanel2);

        jPanel10.setBackground(new java.awt.Color(197, 230, 161));

        jPanel14.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("STUDENT I'D");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        sid_del.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sid_del.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sid_del.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sid_delKeyTyped(evt);
            }
        });

        del_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        del_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\delete.png")); // NOI18N
        del_bt.setText("DELETE");
        del_bt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        del_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btActionPerformed(evt);
            }
        });

        msg3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg3.setForeground(new java.awt.Color(255, 0, 0));
        msg3.setText("*Please enter Student I'd");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/delicon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msg3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sid_del, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(del_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(sid_del, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(del_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/delstud.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabpane.addTab("DELETE", jPanel3);

        search_tab.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        search_tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "Student I'd", "Enroll No", "Name", "Father's Name", "Mother's Name", "DOB", "Email", "Contact No", "UserId", "pasword", "Start Session", "End sess", "University Name", "Program Name", "Fee", "Aadhar No.", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(search_tab);

        jPanel9.setBackground(new java.awt.Color(153, 204, 255));

        sid_search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        sid_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sid_searchKeyTyped(evt);
            }
        });

        searchall_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        searchall_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\output-onlinepngtools (47).png")); // NOI18N
        searchall_bt.setText("SELECT");
        searchall_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchall_btActionPerformed(evt);
            }
        });

        load_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        load_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\another project icons\\up.png")); // NOI18N
        load_bt.setText("LOAD");
        load_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_btActionPerformed(evt);
            }
        });

        msg4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg4.setForeground(new java.awt.Color(255, 0, 0));
        msg4.setText("*Please enter Student I'd");

        jPanel15.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("STUDENT I'D");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel2)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(msg4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(searchall_bt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(load_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(sid_search, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sid_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg4)
                .addGap(88, 88, 88)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(load_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchall_bt))
                .addGap(28, 28, 28))
        );

        jPanel9Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {load_bt, searchall_bt});

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Icon\\studsearch.png")); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel11)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tabpane.addTab("SEARCH ALL", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1219, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabpane, javax.swing.GroupLayout.PREFERRED_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 1237, 646);
    }// </editor-fold>//GEN-END:initComponents

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed

       try {
           int m=JOptionPane.showConfirmDialog(null,"DO U WANT TO UPDATE THE RECORD","Confirmation Window",JOptionPane.YES_NO_OPTION);
            if(m==0){
            stmt=con.prepareStatement("update stud_info set prog_name=?,prog_fee=?,start_sess=?,end_sess=?,contact=?,email=? where upper(enrol_no)=?");
             stmt.setString(7,sid_up.getText().toUpperCase());
             stmt.setString(1,pg_tf.getText());
             stmt.setString(2,pfee_tf.getText());
             stmt.setString(3,start_sess.getText());
             stmt.setString(4,end_sess.getText());
             stmt.setString(5,cont_tf.getText());
             stmt.setString(6,email_tf.getText());
             int rs=stmt.executeUpdate();
             sleep(500);
             JOptionPane.showMessageDialog(null,"Succesfully Updated");
        }} catch (SQLException ex) {
            Logger.getLogger(Student_Search.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Student_Search.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }//GEN-LAST:event_update_btActionPerformed

    private void sid_upFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sid_upFocusLost

        try {
            stmt=con.prepareStatement("select * from stud_info where upper(enrol_no)=?");
            stmt.setString(1,sid_up.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next())
            {
                pg_tf.setEnabled(true);
                start_sess.setEnabled(true);
                cont_tf.setEnabled(true);
                email_tf.setEnabled(true);
                end_sess.setEnabled(true);
                pg_tf.setText(rs.getString(11));
                pfee_tf.setText(rs.getString(18));
                start_sess.setText(rs.getString(16));
                end_sess.setText(rs.getString(17));
                cont_tf.setText(rs.getString(7));
                email_tf.setText(rs.getString(6));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Unsucessful Action ");
        }
       
    }//GEN-LAST:event_sid_upFocusLost

    private void del_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btActionPerformed
       if(sid_del.getText().length()==0)
       {
           msg3.setText("*Please enter enrollment no.");
       }
        try {
             int m=JOptionPane.showConfirmDialog(null,"DO U WANT TO DELETE THE RECORD","Confirmation Window",JOptionPane.YES_NO_OPTION);
            if(m==0){
            stmt=con.prepareStatement("delete from stud_info where upper(enrol_no)=?");
            stmt.setString(1,sid_del.getText().toUpperCase());
            int r=stmt.executeUpdate();
            sleep(500);
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } }catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Deletion is unsucess");
        } catch (InterruptedException ex) {
            Logger.getLogger(Student_Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_del_btActionPerformed

    private void load_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_btActionPerformed
       if(sid_search.getText().length()==0)
       {
           msg4.setText("*Please enter Student I'd");
       }
        
        try {
            boolean flag=false;
            stmt=con.prepareStatement("select * from stud_info");
            rs=stmt.executeQuery();
            mode=(DefaultTableModel)search_tab.getModel();
            while(rs.next()){
                flag=true;
                mode.addRow(new Object[]{false,rs.getString(1),rs.getString(14),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(16),rs.getString(17),rs.getString(15),rs.getString(11),rs.getString(18),rs.getString(10),rs.getString(13)});
            }
            if(flag)
            {
                sid_search.setEnabled(true);
                searchall_bt.setEnabled(true);
                load_bt.setEnabled(false);
                sid_search.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_load_btActionPerformed

    private void tabpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabpaneMouseClicked
        switch (tabpane.getSelectedIndex()) {
            case 0:
                this.getRootPane().setDefaultButton(search_bt);
                break;
            case 1:
                this.getRootPane().setDefaultButton(update_bt);
                 sid_up.requestFocus();
                break;
            case 2:
                this.getRootPane().setDefaultButton(del_bt);
                 sid_del.requestFocus();
                break;
            default:
                this.getRootPane().setDefaultButton(load_bt);
                 sid_search.requestFocus();
                break;
        }
    }//GEN-LAST:event_tabpaneMouseClicked

    private void sid_upKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sid_upKeyTyped
        msg2.setText("");
        update_bt.setEnabled(true);
    }//GEN-LAST:event_sid_upKeyTyped

    private void sid_delKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sid_delKeyTyped
       msg3.setText("");
       del_bt.setEnabled(true);
    }//GEN-LAST:event_sid_delKeyTyped

    private void sid_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sid_searchKeyTyped
      msg4.setText("");
      searchall_bt.setEnabled(true);
    }//GEN-LAST:event_sid_searchKeyTyped

    private void searchall_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchall_btActionPerformed
       boolean flg=true;
       if(sid_search.getText().length()==0)
       {
           msg4.setText("Please enter Student I'd");
           sid_search.requestFocus();
       } 
       else
       {
           msg4.setText("");
         for(byte i=0;i<search_tab.getRowCount();i++)
             if(mode.getValueAt(i,1).toString().equalsIgnoreCase(sid_search.getText())){
                 mode.setValueAt(false,j,0);
                 search_tab.setRowSelectionInterval(i,i);
                 search_tab.setSelectionBackground(Color.BLUE);
                 search_tab.setSelectionForeground(Color.white);
                 mode.setValueAt(true, i,0);
                 flg=false;
                 j=i;
                 break;
             }
         if(flg)
             JOptionPane.showMessageDialog(null,"Record not available for entered Student I'd :"+sid_search.getText());
       }
    }//GEN-LAST:event_searchall_btActionPerformed

    private void search_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btActionPerformed
        if(search_tf.getText().length()==0)
        {
            msg.setText("*Please enter enrollment no.");
        }

        String url="select * from stud_info where ";
        if(search_cmb.getSelectedIndex()==0)
        url=url+"upper(enrol_no)=?";
        else
        url=url+"upper(sname)=?";
        try {
            stmt=con.prepareStatement(url,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1,search_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next())
            {
                this.dispose();
            new StudentShow(rs).setVisible(true);
            }
            else
            JOptionPane.showMessageDialog(null, "Record not found");
        }
        catch (SQLException ex) {
            Logger.getLogger(Student_Search.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_search_btActionPerformed

    private void clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btActionPerformed
       search_tf.setText("");
       search_tf.requestFocus();
    }//GEN-LAST:event_clear_btActionPerformed

    private void search_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_tfKeyTyped
      msg.setText("");
      search_bt.setEnabled(true);
      clear_bt.setEnabled(true);
    }//GEN-LAST:event_search_tfKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new ServiceForm(ctr).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_bt;
    private javax.swing.JTextField cont_tf;
    private javax.swing.JButton del_bt;
    private javax.swing.JTextField email_tf;
    private javax.swing.JTextField end_sess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton load_bt;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msg2;
    private javax.swing.JLabel msg3;
    private javax.swing.JLabel msg4;
    private javax.swing.JTextField pfee_tf;
    private javax.swing.JTextField pg_tf;
    private javax.swing.JButton search_bt;
    private javax.swing.JComboBox<String> search_cmb;
    private javax.swing.JTable search_tab;
    private org.jdesktop.swingx.JXSearchField search_tf;
    private javax.swing.JButton searchall_bt;
    private javax.swing.JTextField sid_del;
    private javax.swing.JTextField sid_search;
    private javax.swing.JTextField sid_up;
    private javax.swing.JTextField start_sess;
    private javax.swing.JTabbedPane tabpane;
    private javax.swing.JButton update_bt;
    // End of variables declaration//GEN-END:variables

}
