
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


public class Uni_Search extends javax.swing.JFrame {
 Connection con;
    PreparedStatement stmt;
    ResultSet rs;
     DefaultTableModel mode;
    int j;
    boolean ctr;  

    public Uni_Search(boolean ctr) throws SQLException {
        initComponents();
        this.setTitle("University Search");
         search_tf.requestFocus();
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.ctr=ctr;
        if(ctr){
            uni_tabpane.setEnabledAt(1,false);
            uni_tabpane.setEnabledAt(2,false);
        }
         con=ConnDb.conLink();
         search_bt.setEnabled(false);
        clear_bt.setEnabled(false);
        up_bt.setEnabled(false);
        del_bt.setEnabled(false);
        searchall_bt.setEnabled(false);
        load_bt.setEnabled(true);
         this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uni_tabpane = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        search_bt = new javax.swing.JButton();
        clear_bt = new javax.swing.JButton();
        search_tf = new org.jdesktop.swingx.JXSearchField();
        msg = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        up_bt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        uni_name = new javax.swing.JTextField();
        sess_tf = new javax.swing.JTextField();
        up_msg = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ad_ta = new javax.swing.JTextArea();
        jPanel19 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        mode_tf = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        del_tf = new javax.swing.JTextField();
        del_bt = new javax.swing.JButton();
        msg2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        search_tab = new javax.swing.JTable();
        uni_tf = new javax.swing.JTextField();
        load_bt = new javax.swing.JButton();
        searchall_bt = new javax.swing.JButton();
        msg4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        uni_tabpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uni_tabpaneMouseClicked(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Icon\\univsearch.png")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(204, 255, 102));

        search_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        search_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Project icons\\search.png")); // NOI18N
        search_bt.setText("SEARCH");
        search_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btActionPerformed(evt);
            }
        });

        clear_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        clear_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\another project icons\\if_edit-clear_118917.png")); // NOI18N
        clear_bt.setText("CLEAR");
        clear_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btActionPerformed(evt);
            }
        });

        search_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_tfActionPerformed(evt);
            }
        });
        search_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_tfKeyTyped(evt);
            }
        });

        msg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 51, 51));
        msg.setText("*Please enter university name");

        jPanel15.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UNIVERSITY NAME");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(search_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        uni_tabpane.addTab("SEARCH", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\upp.png")); // NOI18N

        up_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        up_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/Reset.png"))); // NOI18N
        up_bt.setText("Update");
        up_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(up_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(up_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        uni_name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        uni_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        uni_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uni_nameFocusLost(evt);
            }
        });
        uni_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uni_nameKeyTyped(evt);
            }
        });

        sess_tf.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sess_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        up_msg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        up_msg.setForeground(new java.awt.Color(255, 51, 51));
        up_msg.setText("*Please enter university name");

        jPanel16.setBackground(new java.awt.Color(255, 204, 153));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel2.setText("University Name");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(255, 204, 153));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel3.setText("University Address");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(255, 204, 153));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel10.setText("  Mode");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        ad_ta.setColumns(20);
        ad_ta.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ad_ta.setRows(5);
        jScrollPane3.setViewportView(ad_ta);

        jPanel19.setBackground(new java.awt.Color(255, 204, 153));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel12.setText("Session");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        mode_tf.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        mode_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(up_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                            .addComponent(sess_tf)
                            .addComponent(uni_name)
                            .addComponent(mode_tf))))
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel16, jPanel17});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uni_name, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(up_msg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mode_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sess_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel16, jPanel17});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {sess_tf, uni_name});

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        uni_tabpane.addTab("UPDATE", jPanel4);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/blackuniversity.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(115, 115, 115)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 153, 153));

        del_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                del_tfKeyTyped(evt);
            }
        });

        del_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        del_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\another project icons\\if_free-27_616650.png")); // NOI18N
        del_bt.setText("DELETE");
        del_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btActionPerformed(evt);
            }
        });

        msg2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg2.setForeground(new java.awt.Color(255, 255, 51));
        msg2.setText("*Please enter University name");

        jPanel14.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jLabel4.setText("UNIVERSITY NAME");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(20, 276, Short.MAX_VALUE)
                        .addComponent(msg2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(del_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(del_bt)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(70, 70, 70))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(del_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(msg2)
                .addGap(114, 114, 114)
                .addComponent(del_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        uni_tabpane.addTab("DELETE", jPanel5);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/tick.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(0, 204, 204));

        search_tab.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select", "University Name", "Address", "Mode", "Session"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(search_tab);

        uni_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uni_tfKeyTyped(evt);
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

        searchall_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        searchall_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\output-onlinepngtools (47).png")); // NOI18N
        searchall_bt.setText("SELECT");
        searchall_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchall_btActionPerformed(evt);
            }
        });

        msg4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg4.setForeground(new java.awt.Color(255, 0, 0));
        msg4.setText("*Please enter university name");

        jPanel13.setBackground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 17)); // NOI18N
        jLabel5.setText("UNIVERSITY NAME");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(load_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(searchall_bt)
                        .addGap(82, 82, 82))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msg4, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uni_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uni_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg4)
                .addGap(85, 85, 85)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(load_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchall_bt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        uni_tabpane.addTab("SEARCH ALL", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uni_tabpane, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uni_tabpane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btActionPerformed
         String url="select * from uni_info where ";
            url=url+"upper(uni_name)=?";
      
     try {
         stmt=con.prepareStatement(url,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
          stmt.setString(1,search_tf.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next()){
                new UniInfo_Show(rs).setVisible(true);
            this.dispose();}
            else
              JOptionPane.showMessageDialog(null, "Record not found");
     } catch (SQLException ex) {
         Logger.getLogger(Uni_Search.class.getName()).log(Level.SEVERE, null, ex);
     }
            
           
            
    }//GEN-LAST:event_search_btActionPerformed

    private void up_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_btActionPerformed
     try {
          int m=JOptionPane.showConfirmDialog(null,"DO U WANT TO UPDATE THE RECORD","Confirmation Window",JOptionPane.YES_NO_OPTION);
            if(m==0){
          stmt=con.prepareStatement("update uni_info set uni_adr=?, uni_mode=?, sess=? where upper(uni_name)=?");
             stmt.setString(4,uni_name.getText().toUpperCase());
             stmt.setString(3,sess_tf.getText());
             stmt.setString(1,ad_ta.getText());
             stmt.setString(2,mode_tf.getText());
             int rs=stmt.executeUpdate();
             sleep(500);
             JOptionPane.showMessageDialog(null,"Successfully Updated");
     }} catch (SQLException ex) {
         Logger.getLogger(Uni_Search.class.getName()).log(Level.SEVERE, null, ex);
     } catch (InterruptedException ex) {
         Logger.getLogger(Uni_Search.class.getName()).log(Level.SEVERE, null, ex);
     }
            
    }//GEN-LAST:event_up_btActionPerformed

    private void uni_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uni_nameFocusLost
     try {
         stmt=con.prepareStatement("select * from uni_info where upper(uni_name)=?");
          stmt.setString(1,uni_name.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next())
            {
                sess_tf.setEnabled(true);
                sess_tf.setText(rs.getString(4));
                ad_ta.setEnabled(true);
                ad_ta.setText(rs.getString(2));
                mode_tf.setEnabled(true);
                mode_tf.setText(rs.getString(3));
    
            }
     } catch (SQLException ex) {
         Logger.getLogger(Uni_Search.class.getName()).log(Level.SEVERE, null, ex);
     }
            
    }//GEN-LAST:event_uni_nameFocusLost

    private void del_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btActionPerformed
        try {
            int m=JOptionPane.showConfirmDialog(null,"DO U WANT TO DELETE THE RECORD","Confirmation Window",JOptionPane.YES_NO_OPTION);
            if(m==0){
             stmt=con.prepareStatement("delete from uni_info where upper(uni_name)=?");
             stmt.setString(1,del_tf.getText().toUpperCase());
            int r=stmt.executeUpdate();
            sleep(500);
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
         }} catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Deletion is unsucessful");
         } catch (InterruptedException ex) {
         Logger.getLogger(Uni_Search.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_del_btActionPerformed

    private void load_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_load_btActionPerformed

       try {
            boolean flag=false;
            stmt=con.prepareStatement("select * from uni_info");
            rs=stmt.executeQuery();
            mode=(DefaultTableModel)search_tab.getModel();
            while(rs.next()){
                flag=true;
                mode.addRow(new Object[]{false,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }
            if(flag)
            {
                 uni_tf.setEnabled(true);
                searchall_bt.setEnabled(true);
                load_bt.setEnabled(false);
                uni_tf.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_Search.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_load_btActionPerformed

    private void uni_tabpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uni_tabpaneMouseClicked
        switch (uni_tabpane.getSelectedIndex()) {
            case 0:
                this.getRootPane().setDefaultButton(search_bt);
                break;
            case 1:
                this.getRootPane().setDefaultButton(up_bt);
                uni_name.requestFocus();
                break;
            case 2:
                this.getRootPane().setDefaultButton(del_bt);
                del_tf.requestFocus();
                break;
            default:
                this.getRootPane().setDefaultButton(load_bt);
                uni_tf.requestFocus();
                break;
        }
    }//GEN-LAST:event_uni_tabpaneMouseClicked

    private void clear_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btActionPerformed
       search_tf.setText("");
       search_tf.requestFocus();
    }//GEN-LAST:event_clear_btActionPerformed

    private void searchall_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchall_btActionPerformed
        boolean flg=true;
       if(uni_tf.getText().length()==0)
       {
           msg4.setText("Please enter university name");
           uni_tf.requestFocus();
       } 
       else
       {
           msg4.setText("");
         for(byte i=0;i<search_tab.getRowCount();i++)
             if(mode.getValueAt(i,1).toString().equalsIgnoreCase(uni_tf.getText())){
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
             JOptionPane.showMessageDialog(null,"Record not available for entered university name :"+uni_tf.getText());
       }
    }//GEN-LAST:event_searchall_btActionPerformed

    private void search_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_tfKeyTyped
        msg.setText("");
        search_bt.setEnabled(true);
        clear_bt.setEnabled(true);
    }//GEN-LAST:event_search_tfKeyTyped

    private void del_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_del_tfKeyTyped
        msg2.setText("");
        del_bt.setEnabled(true);
    }//GEN-LAST:event_del_tfKeyTyped

    private void uni_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uni_tfKeyTyped
       msg4.setText("");
       searchall_bt.setEnabled(true);
    }//GEN-LAST:event_uni_tfKeyTyped

    private void uni_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uni_nameKeyTyped
       up_msg.setText("");
       up_bt.setEnabled(true);
    }//GEN-LAST:event_uni_nameKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      new ServiceForm(ctr).setVisible(true);
      this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void search_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_tfActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ad_ta;
    private javax.swing.JButton clear_bt;
    private javax.swing.JButton del_bt;
    private javax.swing.JTextField del_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton load_bt;
    private javax.swing.JTextField mode_tf;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msg2;
    private javax.swing.JLabel msg4;
    private javax.swing.JButton search_bt;
    private javax.swing.JTable search_tab;
    private org.jdesktop.swingx.JXSearchField search_tf;
    private javax.swing.JButton searchall_bt;
    private javax.swing.JTextField sess_tf;
    private javax.swing.JTextField uni_name;
    private javax.swing.JTabbedPane uni_tabpane;
    private javax.swing.JTextField uni_tf;
    private javax.swing.JButton up_bt;
    private javax.swing.JLabel up_msg;
    // End of variables declaration//GEN-END:variables

}
