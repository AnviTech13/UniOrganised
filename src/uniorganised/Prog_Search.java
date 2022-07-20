
package uniorganised;

import java.awt.Color;
import java.awt.Toolkit;
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


public class Prog_Search extends javax.swing.JFrame {
     Connection con;
    PreparedStatement stmt;
    ResultSet rs;
     DefaultTableModel mode;
    int j;
    boolean ctr;
    int a;
    public Prog_Search(boolean ctr,int a) throws SQLException {
        initComponents();
         uni_tf.requestFocus();
        this.ctr=ctr;
        this.setTitle("Program Search");
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.a=a;
        if(ctr){
            tabpane.setEnabledAt(1,false);
            tabpane.setEnabledAt(2,false);
        }
        this.setLocationRelativeTo(null);
        con=ConnDb.conLink();
         search_bt.setEnabled(false);
        clear_bt.setEnabled(false);
        up_bt.setEnabled(false);
        del_bt.setEnabled(false);
        select_bt.setEnabled(false);
        load_bt.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabpane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        search_bt = new javax.swing.JButton();
        clear_bt = new javax.swing.JButton();
        msg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        uni_tf = new org.jdesktop.swingx.JXSearchField();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        up_bt = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        uniname_tf = new javax.swing.JTextField();
        pg_tf = new javax.swing.JTextField();
        pfee_tf = new javax.swing.JTextField();
        min_tf = new javax.swing.JTextField();
        max_tf = new javax.swing.JTextField();
        msg2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        univ_tf = new javax.swing.JTextField();
        del_bt = new javax.swing.JButton();
        msg3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        uni_name = new javax.swing.JTextField();
        load_bt = new javax.swing.JButton();
        select_bt = new javax.swing.JButton();
        msg4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

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

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Icon\\booksearch.png")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(27, 27, 27))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 0));

        search_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        search_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\search.png")); // NOI18N
        search_bt.setText("SEARCH");
        search_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btActionPerformed(evt);
            }
        });

        clear_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        clear_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/if_edit-clear_118917.png"))); // NOI18N
        clear_bt.setText("CLEAR");
        clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btActionPerformed(evt);
            }
        });

        msg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 51, 0));
        msg.setText("*Please enter university name");

        uni_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uni_tfKeyTyped(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(255, 0, 0));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel2.setText("UNIVERSITY NAME");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(179, 179, 179))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(search_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clear_bt)
                .addGap(91, 91, 91))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(142, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(uni_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58))))
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clear_bt, search_bt});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uni_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabpane.addTab("SEARCH", jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        up_bt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        up_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\Reset.png")); // NOI18N
        up_bt.setText("UPDATE");
        up_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_btActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Icon\\newprogup.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(up_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel14)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(up_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jPanel6.setBackground(new java.awt.Color(0, 255, 255));

        uniname_tf.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        uniname_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uniname_tfFocusLost(evt);
            }
        });
        uniname_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uniname_tfKeyTyped(evt);
            }
        });

        pg_tf.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        pfee_tf.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        min_tf.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        max_tf.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        msg2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg2.setForeground(new java.awt.Color(255, 51, 0));
        msg2.setText("*Please enter university name");

        jPanel16.setBackground(new java.awt.Color(255, 255, 102));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setText("University Name");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 102));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel11.setText("Program Nane");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 102));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel19.setText("Program Fee");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 102));

        jLabel18.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel18.setText("Minimum Duration");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(255, 255, 102));

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel20.setText("Maximum Duration");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("YEARS");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("YEARS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(msg2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(max_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(min_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel5)))
                                .addComponent(pfee_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                .addComponent(pg_tf)
                                .addComponent(uniname_tf)))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uniname_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg2)
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pg_tf)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addComponent(pfee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(min_tf)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(max_tf)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabpane.addTab("UPDATE", jPanel2);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\output-onlinepngtools (51).png")); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(331, 331, 331))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel9)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel10.setBackground(new java.awt.Color(204, 255, 255));

        univ_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                univ_tfKeyTyped(evt);
            }
        });

        del_bt.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        del_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/delete.png"))); // NOI18N
        del_bt.setText("DELETE");
        del_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btActionPerformed(evt);
            }
        });

        msg3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg3.setForeground(new java.awt.Color(255, 51, 0));
        msg3.setText("*Please enter university name");

        jPanel13.setBackground(new java.awt.Color(0, 204, 153));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("        UNIVERSITY NAME");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msg3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(univ_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(del_bt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(univ_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg3)
                .addGap(136, 136, 136)
                .addComponent(del_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabpane.addTab("DELETE", jPanel3);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\output-onlinepngtools (31).png")); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(0, 153, 153));

        uni_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uni_nameKeyTyped(evt);
            }
        });

        load_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        load_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/up.png"))); // NOI18N
        load_bt.setText("LOAD");
        load_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                load_btActionPerformed(evt);
            }
        });

        select_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        select_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\output-onlinepngtools (47).png")); // NOI18N
        select_bt.setText("SELECT");
        select_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_btActionPerformed(evt);
            }
        });

        msg4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg4.setForeground(new java.awt.Color(255, 51, 0));
        msg4.setText("*Please enter university name");

        tab1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "University Name", "Program Name", "Program Fee", "Min Duration(year)", "Max Duration(year)", "University Recognisation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tab1);

        jPanel14.setBackground(new java.awt.Color(255, 0, 0));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel12.setText("    UNIVERSITY NAME");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(select_bt)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(load_bt)))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msg4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uni_name, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 42, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );

        jPanel12Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {load_bt, select_bt});

        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uni_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg4)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(select_bt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(load_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel12Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {load_bt, select_bt});

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabpane.addTab("SEARCH ALL", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabpane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btActionPerformed
         if(uni_tf.getText().length()==0)
       {
           msg.setText("*Please enter enrollment no.");
       }
        
        String url="select * from prog_info where ";
          url=url+"upper(uni_name)=?"; 
          try{
            stmt=con.prepareStatement(url,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
             stmt.setString(1,uni_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next()){
                new Prog_Show(rs).setVisible(true);
                this.dispose();}
            else
              JOptionPane.showMessageDialog(null,"Record not found");
          }
          catch(SQLException ex) {
            Logger.getLogger(Prog_Search.class.getName()).log(Level.SEVERE, null, ex);
        }
           
 
    }//GEN-LAST:event_search_btActionPerformed

    private void clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btActionPerformed
        uni_tf.setText("");
        uni_tf.requestFocus();
    }//GEN-LAST:event_clear_btActionPerformed

    private void up_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_btActionPerformed
          if(uniname_tf.getText().length()==0)
       {
           msg2.setText("*Please enter enrollment no.");
       }
        
        try {
            int m=JOptionPane.showConfirmDialog(null,"DO U WANT TO UPDATE THE RECORD","Confirmation Window",JOptionPane.YES_NO_OPTION);
            if(m==0){
             stmt=con.prepareStatement("update prog_info set prog_name=?,prog_fee=?,min_dur=?,max_dur=? where upper(uni_name)=?");
              stmt.setString(5,uniname_tf.getText().toUpperCase());
             stmt.setString(1,pg_tf.getText());
             stmt.setString(2,pfee_tf.getText());
             stmt.setString(3,min_tf.getText());
             stmt.setString(4,max_tf.getText());
             int rs=stmt.executeUpdate();
             sleep(500);
             JOptionPane.showMessageDialog(null,"Succesfully Updated");
         }} catch (SQLException ex) {
             Logger.getLogger(Prog_Search.class.getName()).log(Level.SEVERE, null, ex);
         } catch (InterruptedException ex) {
             Logger.getLogger(Prog_Search.class.getName()).log(Level.SEVERE, null, ex);
         }
            
    }//GEN-LAST:event_up_btActionPerformed

    private void uniname_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uniname_tfFocusLost
         try {
             stmt=con.prepareStatement("select * from prog_info where upper(uni_name)=?");
             stmt.setString(1,uniname_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next())
            {
                pg_tf.setEnabled(true);
                pfee_tf.setEnabled(true);
                min_tf.setEnabled(true);
                max_tf.setEnabled(true);
                pg_tf.setText(rs.getString(1));
                pfee_tf.setText(rs.getString(2));
                min_tf.setText(rs.getString(4));
                max_tf.setText(rs.getString(5));    
            }
         } catch (SQLException ex) {
             Logger.getLogger(Prog_Search.class.getName()).log(Level.SEVERE, null, ex);
         }
            
    }//GEN-LAST:event_uniname_tfFocusLost

    private void del_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btActionPerformed
          if(univ_tf.getText().length()==0)
       {
           msg3.setText("*Please enter university name.");
       }
        
        try {
             int m=JOptionPane.showConfirmDialog(null,"DO U WANT TO DELETE THE RECORD","Confirmation Window",JOptionPane.YES_NO_OPTION);
            if(m==0){
             stmt=con.prepareStatement("delete from prog_info where upper(uni_name)=?");
             stmt.setString(1,univ_tf.getText().toUpperCase());
            int r=stmt.executeUpdate();
            sleep(500);
            JOptionPane.showMessageDialog(null,"Successfully Deleted");
         } }catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Deletion is unsucessful");
         } catch (InterruptedException ex) {
             Logger.getLogger(Prog_Search.class.getName()).log(Level.SEVERE, null, ex);
         }
            
    }//GEN-LAST:event_del_btActionPerformed

    private void load_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_btActionPerformed
         if(uni_name.getText().length()==0)
       {
           msg4.setText("*Please enter university name");
       }
        
        
        try {
             stmt=con.prepareStatement("select * from prog_info");
             rs=stmt.executeQuery();
            mode=(DefaultTableModel)tab1.getModel();
            while(rs.next()){
                mode.addRow(new Object[]{false,rs.getString(3),rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(5),rs.getString(6)});
            }
         } catch (SQLException ex) {
             Logger.getLogger(Prog_Search.class.getName()).log(Level.SEVERE, null, ex);
         }
            
    }//GEN-LAST:event_load_btActionPerformed

    private void select_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_btActionPerformed
       boolean flg=true;
       if(uni_name.getText().length()==0)
       {
           msg4.setText("Please enter enrollment no.");
           uni_name.requestFocus();
       } 
       else
       {
           msg4.setText("");
         for(byte i=0;i<tab1.getRowCount();i++)
             if(mode.getValueAt(i,1).toString().equalsIgnoreCase(uni_name.getText())){
                 mode.setValueAt(false,j,0);
                 tab1.setRowSelectionInterval(i,i);
                 tab1.setSelectionBackground(Color.BLUE);
                 tab1.setSelectionForeground(Color.white);
                 mode.setValueAt(true, i,0);
                 flg=false;
                 j=i;
                 break;
             }
         if(flg)
             JOptionPane.showMessageDialog(null,"Record not available for entered university name :"+uni_name.getText());
       }
    }//GEN-LAST:event_select_btActionPerformed

    private void uniname_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uniname_tfKeyTyped
        msg2.setText("");
        up_bt.setEnabled(true);
    }//GEN-LAST:event_uniname_tfKeyTyped

    private void univ_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_univ_tfKeyTyped
      msg3.setText("");
      del_bt.setEnabled(true);
    }//GEN-LAST:event_univ_tfKeyTyped

    private void tabpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabpaneMouseClicked
         switch (tabpane.getSelectedIndex()) {
            case 0:
                this.getRootPane().setDefaultButton(search_bt);
                break;
            case 1:
                this.getRootPane().setDefaultButton(up_bt);
                 uniname_tf.requestFocus();
                break;
            case 2:
                this.getRootPane().setDefaultButton(del_bt);
                 univ_tf.requestFocus();
                break;
            default:
                this.getRootPane().setDefaultButton(load_bt);
                 uni_name.requestFocus();
                break;
        }
    }//GEN-LAST:event_tabpaneMouseClicked

    private void uni_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uni_nameKeyTyped
       msg4.setText("");
      select_bt.setEnabled(true);
    }//GEN-LAST:event_uni_nameKeyTyped

    private void uni_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uni_tfKeyTyped
        msg.setText("");
        search_bt.setEnabled(true);
        clear_bt.setEnabled(true);
    }//GEN-LAST:event_uni_tfKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         if(a==0)
             new MainWindow(ctr).setVisible(true);
         else
             new ServiceForm(ctr).setVisible(true);
    }//GEN-LAST:event_formWindowClosing
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear_bt;
    private javax.swing.JButton del_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton load_bt;
    private javax.swing.JTextField max_tf;
    private javax.swing.JTextField min_tf;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msg2;
    private javax.swing.JLabel msg3;
    private javax.swing.JLabel msg4;
    private javax.swing.JTextField pfee_tf;
    private javax.swing.JTextField pg_tf;
    private javax.swing.JButton search_bt;
    private javax.swing.JButton select_bt;
    private javax.swing.JTable tab1;
    private javax.swing.JTabbedPane tabpane;
    private javax.swing.JTextField uni_name;
    private org.jdesktop.swingx.JXSearchField uni_tf;
    private javax.swing.JTextField uniname_tf;
    private javax.swing.JTextField univ_tf;
    private javax.swing.JButton up_bt;
    // End of variables declaration//GEN-END:variables

}
