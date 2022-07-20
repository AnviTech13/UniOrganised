
package uniorganised;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;


public class Student_info extends javax.swing.JFrame {
     boolean flag=true,flg=false;
    Connection con;
    PreparedStatement stmt;
    ImageIcon img; File f;
    int ano;
    ResultSet rs;
    String str;
    boolean ctr;int a;
    public Student_info(boolean ctr,int a) throws SQLException {
        initComponents();
        this.getRootPane().setDefaultButton(insert_bt);
        pfee_tf.setEditable(false);
        this.setTitle("Students Information");
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.ctr=ctr;
        this.a=a;
        con=ConnDb.conLink();
        stmt=con.prepareStatement("select aenrol from automatic");
        rs=stmt.executeQuery();
        rs.next();
        ano=rs.getInt(1);
        ano++;
        auto();
        ButtonGroup bg=new ButtonGroup();
        bg.add(male_rbt);
        bg.add(female_rbt);
        male_rbt.setSelected(true);
        this.setLocationRelativeTo(null);
        Calendar c=Calendar.getInstance();
        SimpleDateFormat sf=new SimpleDateFormat("dd:MM:yyyy");
        dob_tf.setText(sf.format(c.getTime()));
        pg_cmb.setEnabled(false);
        stmt=con.prepareStatement("select uni_name from uni_info");
        rs=stmt.executeQuery();
        uni_cmb.addItem("select university");
        while(rs.next()){
            uni_cmb.addItem(rs.getString(1));
        }
        flg=true;
        pg_cmb.setEnabled(true);
        next_bt.setEnabled(true);
        insert_bt.setEnabled(false);
         enroll_tf.requestFocus();    
    }
    void auto(){
        boolean flag1=true;
        if(ano<10)
            str="S00"+ano;
        else if(ano<100)
            str="S0"+ano;
        else if(ano<1000)
            str="S"+ano;
        else{
            JOptionPane.showMessageDialog(null,"More than 999 not allowed");
             flag1=false;
        }
        if(flag1)
        {
        sid_tf.setText(str);
        sname_tf.requestFocus();
        }
        else
           insert_bt.setVisible(false);
    }   
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        id_lb = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        mob_lb = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        user_lb = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        sid_tf = new javax.swing.JTextField();
        sname_tf = new javax.swing.JTextField();
        fname_tf = new javax.swing.JTextField();
        mname_tf = new javax.swing.JTextField();
        aadhar_tf = new javax.swing.JTextField();
        amsg = new javax.swing.JLabel();
        start_sess = new javax.swing.JTextField();
        male_rbt = new javax.swing.JRadioButton();
        female_rbt = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        pic_lb = new javax.swing.JLabel();
        email_tf = new javax.swing.JTextField();
        cont_tf = new javax.swing.JTextField();
        msg_lb = new javax.swing.JLabel();
        user_tf = new javax.swing.JTextField();
        pswrd_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        insert_bt = new javax.swing.JButton();
        next_bt = new javax.swing.JButton();
        upload_bt = new javax.swing.JButton();
        title_lb = new javax.swing.JLabel();
        icon_lb = new javax.swing.JLabel();
        ficon = new javax.swing.JButton();
        male_icon = new javax.swing.JButton();
        smsg = new javax.swing.JLabel();
        fmsg = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        enroll_tf = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        uni_cmb = new javax.swing.JComboBox<>();
        msg = new javax.swing.JLabel();
        emsg = new javax.swing.JLabel();
        semsg = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        end_sess = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        pfee_tf = new javax.swing.JTextField();
        pg_cmb = new javax.swing.JComboBox<>();
        dob_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        id_lb.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        id_lb.setForeground(new java.awt.Color(153, 0, 153));
        id_lb.setText(" Student I'D");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(id_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(id_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText(" Student Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));

        jLabel8.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText(" Father's Name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 153));
        jLabel10.setText(" Mother's Name");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 66, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 153, 153));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 153));
        jLabel13.setText(" Program Name");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 67, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 153, 153));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 153));
        jLabel15.setText(" Aadhar No.");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 103, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 153, 153));

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 153));
        jLabel17.setText(" Session");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 153, 153));

        jLabel9.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText(" Gender");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 132, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(255, 153, 153));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setText(" D.O.B");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(0, 139, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 153, 153));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 153));
        jLabel16.setText(" Email I'd");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 109, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(255, 153, 153));

        mob_lb.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        mob_lb.setForeground(new java.awt.Color(153, 0, 153));
        mob_lb.setText(" Mobile No.");
        mob_lb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mob_lbFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(mob_lb)
                .addGap(0, 93, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mob_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 153, 153));

        user_lb.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        user_lb.setForeground(new java.awt.Color(153, 0, 153));
        user_lb.setText(" User I'd");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(user_lb)
                .addGap(0, 119, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(255, 153, 153));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 153));
        jLabel14.setText(" Password");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(0, 101, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        sid_tf.setEditable(false);
        sid_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sid_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sid_tf.setNextFocusableComponent(sname_tf);

        sname_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sname_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sname_tf.setNextFocusableComponent(fname_tf);
        sname_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sname_tfFocusLost(evt);
            }
        });
        sname_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sname_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sname_tfKeyTyped(evt);
            }
        });

        fname_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fname_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fname_tf.setNextFocusableComponent(icon_lb);
        fname_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fname_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fname_tfKeyTyped(evt);
            }
        });

        mname_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mname_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mname_tf.setNextFocusableComponent(title_lb);
        mname_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mname_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mname_tfKeyTyped(evt);
            }
        });

        aadhar_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        aadhar_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aadhar_tf.setNextFocusableComponent(start_sess);
        aadhar_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                aadhar_tfFocusLost(evt);
            }
        });
        aadhar_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                aadhar_tfKeyTyped(evt);
            }
        });

        amsg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        amsg.setForeground(new java.awt.Color(255, 0, 0));

        start_sess.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        start_sess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        start_sess.setNextFocusableComponent(ficon);
        start_sess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                start_sessKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                start_sessKeyTyped(evt);
            }
        });

        male_rbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        male_rbt.setText("Male");
        male_rbt.setNextFocusableComponent(upload_bt);

        female_rbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        female_rbt.setText("Female");
        female_rbt.setNextFocusableComponent(upload_bt);

        pic_lb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pic_lb.setText("                           Pic");
        pic_lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        email_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        email_tf.setToolTipText("");
        email_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        email_tf.setNextFocusableComponent(mob_lb);
        email_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                email_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                email_tfKeyTyped(evt);
            }
        });

        cont_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cont_tf.setNextFocusableComponent(user_lb);
        cont_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cont_tfFocusLost(evt);
            }
        });
        cont_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cont_tfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cont_tfKeyTyped(evt);
            }
        });

        msg_lb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        msg_lb.setForeground(new java.awt.Color(255, 0, 0));

        user_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        user_tf.setNextFocusableComponent(pswrd_tf);

        pswrd_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswrd_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pswrd_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswrd_tfKeyPressed(evt);
            }
        });

        insert_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        insert_bt.setText("INSERT");
        insert_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_btActionPerformed(evt);
            }
        });

        next_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        next_bt.setText("NEXT");
        next_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btActionPerformed(evt);
            }
        });

        upload_bt.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        upload_bt.setText("UPLOAD");
        upload_bt.setNextFocusableComponent(email_tf);
        upload_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upload_btActionPerformed(evt);
            }
        });

        title_lb.setFont(new java.awt.Font("Cambria", 3, 45)); // NOI18N
        title_lb.setText("STUDENTS INFORMATION");
        title_lb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                title_lbFocusGained(evt);
            }
        });

        icon_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/stud 2.png"))); // NOI18N
        icon_lb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                icon_lbFocusGained(evt);
            }
        });

        ficon.setBorderPainted(false);
        ficon.setContentAreaFilled(false);
        ficon.setFocusPainted(false);
        ficon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ficonFocusGained(evt);
            }
        });

        male_icon.setBorderPainted(false);
        male_icon.setContentAreaFilled(false);
        male_icon.setFocusPainted(false);

        smsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        smsg.setForeground(new java.awt.Color(255, 51, 51));

        fmsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        fmsg.setForeground(new java.awt.Color(255, 51, 51));

        jPanel15.setBackground(new java.awt.Color(255, 153, 153));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setText(" Enrollment No.");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        enroll_tf.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        enroll_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        enroll_tf.setNextFocusableComponent(sname_tf);

        jPanel16.setBackground(new java.awt.Color(255, 153, 153));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 0, 153));
        jLabel19.setText(" University Name");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(0, 51, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        uni_cmb.setFont(new java.awt.Font("Cambria", 1, 17)); // NOI18N
        uni_cmb.setNextFocusableComponent(pg_cmb);
        uni_cmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                uni_cmbItemStateChanged(evt);
            }
        });

        msg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        msg.setForeground(new java.awt.Color(255, 0, 0));

        emsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        emsg.setForeground(new java.awt.Color(255, 0, 0));

        semsg.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        semsg.setForeground(new java.awt.Color(255, 0, 0));

        lb.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb.setText("       -");
        lb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lbFocusGained(evt);
            }
        });

        end_sess.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        end_sess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        end_sess.setNextFocusableComponent(female_rbt);
        end_sess.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                end_sessKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                end_sessKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Starting Year");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("End Year");

        jPanel17.setBackground(new java.awt.Color(255, 153, 153));

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 0, 153));
        jLabel20.setText(" Program Fee");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(0, 88, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        pfee_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pfee_tf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pfee_tf.setNextFocusableComponent(male_icon);

        pg_cmb.setFont(new java.awt.Font("Cambria", 1, 17)); // NOI18N
        pg_cmb.setNextFocusableComponent(aadhar_tf);
        pg_cmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pg_cmbItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(insert_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(semsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(male_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(male_rbt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ficon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(female_rbt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel3)
                        .addGap(79, 79, 79)
                        .addComponent(title_lb))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1087, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enroll_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(smsg, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(icon_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(pic_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(upload_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(778, 778, 778)
                        .addComponent(emsg, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(aadhar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(114, 114, 114))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(start_sess, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(end_sess, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(amsg, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pswrd_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(next_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dob_tf)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(uni_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(email_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(pg_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(pfee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cont_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                    .addComponent(user_tf))))
                        .addGap(1060, 1060, 1060)
                        .addComponent(msg_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(next_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(title_lb))
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(sid_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(enroll_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(sname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(smsg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(fname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(fmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(mname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(icon_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(pic_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(upload_bt)))
                        .addGap(3, 3, 3)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uni_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(emsg, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(cont_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(pg_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(msg_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(pfee_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(user_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pswrd_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(aadhar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(amsg, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(start_sess, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(end_sess, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dob_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(male_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(female_rbt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ficon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(male_rbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(semsg, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(insert_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(13, 13, 13))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cont_tf, email_tf});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1132, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1150, 1026);
    }// </editor-fold>//GEN-END:initComponents

    private void insert_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_btActionPerformed
     try {
         stmt=con.prepareStatement("insert into stud_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
          stmt.setString(1,sid_tf.getText());
            stmt.setString(2,sname_tf.getText());
            stmt.setString(3,fname_tf.getText());
            stmt.setString(4,mname_tf.getText());
            stmt.setString(5,dob_tf.getText());
            stmt.setString(14,enroll_tf.getText());
             stmt.setString(15,uni_cmb.getSelectedItem().toString());
            stmt.setString(6,email_tf.getText());
             stmt.setString(7,cont_tf.getText());
            stmt.setString(8,user_tf.getText());
            stmt.setString(9,pswrd_tf.getText());
             stmt.setString(16,start_sess.getText());
             stmt.setString(17,end_sess.getText());
             stmt.setString(18,pfee_tf.getText());
            stmt.setString(10,aadhar_tf.getText());
            stmt.setString(11,pg_cmb.getSelectedItem().toString());
            if(male_rbt.isSelected())
                stmt.setString(13,"Male");
            else
                stmt.setString(13,"Female");
            if(f!=null){
            FileInputStream fin=new FileInputStream(f);
            stmt.setBinaryStream(12,fin,fin.available());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record successfully inserted");
           stmt=con.prepareStatement("update automatic set aenrol=?");
           stmt.setInt(1,ano);
           stmt.executeUpdate();
           ano++;
            backup.back("select * from stud_info","studentdetails.xls");
           backup.back("select * from automatic","Automatic.xls");
            }
            else
                JOptionPane.showMessageDialog(null,"Please upload a photo");
     } catch (SQLException ex) {
         Logger.getLogger(Student_info.class.getName()).log(Level.SEVERE, null, ex);
     }  catch (FileNotFoundException ex) {
            Logger.getLogger(Student_info.class.getName()).log(Level.SEVERE, null, ex);
     }   catch (IOException ex) {
             Logger.getLogger(Student_info.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Student_info.class.getName()).log(Level.SEVERE, null, ex);
         } catch (WriteException ex) {
             Logger.getLogger(Student_info.class.getName()).log(Level.SEVERE, null, ex);
         } catch (BiffException ex) {
             Logger.getLogger(Student_info.class.getName()).log(Level.SEVERE, null, ex);
         }
           
    }//GEN-LAST:event_insert_btActionPerformed

    private void upload_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upload_btActionPerformed
       JFileChooser jf=new JFileChooser();
       jf.showOpenDialog(null);
       f=jf.getSelectedFile();
       img=new ImageIcon(new ImageIcon(""+f).getImage().getScaledInstance(pic_lb.getWidth(), pic_lb.getHeight(),Image.SCALE_SMOOTH));
       pic_lb.setIcon(img);
    }//GEN-LAST:event_upload_btActionPerformed

    private void next_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btActionPerformed
             enroll_tf.setText("");
             uni_cmb.setSelectedIndex(0);
            sname_tf.setText("");
            pic_lb.setIcon(null);
           fname_tf.setText("");
            mname_tf.setText("");
            email_tf.setText("");
            cont_tf.setText("");
            user_tf.setText("");
            pswrd_tf.setText("");
            start_sess.setText("");
            end_sess.setText("");
            aadhar_tf.setText("");
            pg_cmb.setSelectedIndex(0);
            pic_lb.setText("");
            dob_tf.setText("");
            pfee_tf.setText("");
            insert_bt.setEnabled(false);
            sname_tf.requestFocus();
            auto();
    }//GEN-LAST:event_next_btActionPerformed

    private void aadhar_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aadhar_tfKeyTyped
         char ch=evt.getKeyChar();
         String str1=aadhar_tf.getText();
        if(aadhar_tf.getText().length()==14)
        {
            evt.consume();
            amsg.setText("*It must not be >12 digit!");
        } 
        else if(!(ch>=48 && ch<=57 ||ch==' ')){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            amsg.setText("*Alphabets are not allowed !");
        }
       
        else{
            int len=aadhar_tf.getText().length();
            if(len==4 || len==9)
                aadhar_tf.setText(aadhar_tf.getText()+' ');
        }
        amsg.setText("");
       
    }//GEN-LAST:event_aadhar_tfKeyTyped

    private void sname_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sname_tfFocusLost
     String str=sname_tf.getText();
      if(str.length()==0){
          smsg.setText("*Name cannot be empty");
          sname_tf.requestFocus();}
    }//GEN-LAST:event_sname_tfFocusLost

    private void cont_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cont_tfKeyTyped

        char ch=evt.getKeyChar();
       if(!(ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           msg_lb.setText("*Alphabets not allowed !");
       }
       else if(cont_tf.getText().length()==10)
        {
            evt.consume();
           msg_lb.setText("*Mobile no. cannot be greater than 10 digits");
        }
        else
           msg_lb.setText("");
    }//GEN-LAST:event_cont_tfKeyTyped

    private void aadhar_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_aadhar_tfFocusLost
       String str1=aadhar_tf.getText();
       if(str1.length()==0)
       {
           amsg.setText("*Aadhar  No. is required");
          aadhar_tf.requestFocus();
       }
       else if(str1.length()<14)
       {
           amsg.setText("*Aadhar no must be in 12 digits");
           aadhar_tf.requestFocus();
       }
       else
         start_sess.requestFocus();
    }//GEN-LAST:event_aadhar_tfFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
         if(a==0)
             new MainWindow(ctr).setVisible(true);
         else
             new EntryForms(ctr).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void cont_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cont_tfFocusLost
       String str=cont_tf.getText();
       if(str.length()==0)
       {
           msg_lb.setText("*Mobile No is required !");
           cont_tf.requestFocus();
       }
       else if(str.length()<10)
       {
           msg_lb.setText("*Mobile no must be in 10 digits");
           cont_tf.requestFocus();
       }
       else{
         user_tf.requestFocus();
         msg_lb.setText("");
       }
    }//GEN-LAST:event_cont_tfFocusLost

    private void sname_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sname_tfKeyTyped
//        String str=sname_tf.getText();
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
           smsg.setText("*Name cannot start with space"); 
       }
       else if(str.length()==0 && ch=='.'){
            evt.consume();
           Toolkit.getDefaultToolkit().beep();
           smsg.setText("*Name cannot start with dot");
       }
    }//GEN-LAST:event_sname_tfKeyTyped

    private void sname_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sname_tfKeyPressed
       smsg.setText("");
    }//GEN-LAST:event_sname_tfKeyPressed

    private void fname_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fname_tfKeyTyped
       String str=fname_tf.getText();
        char ch=evt.getKeyChar();
       if((ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           fmsg.setText("*Digits Not Allowed !");
       }
       else if((str.length()==0 && ch==' ')){
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           fmsg.setText("*Name cannot start with space"); 
       }
       else if(str.length()==0 && ch=='.'){
            evt.consume();
           Toolkit.getDefaultToolkit().beep();
           fmsg.setText("*Name cannot start with dot");
       }
    }//GEN-LAST:event_fname_tfKeyTyped

    private void fname_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fname_tfKeyPressed
        fmsg.setText("");
        
    }//GEN-LAST:event_fname_tfKeyPressed

    private void icon_lbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_icon_lbFocusGained
         String str=fname_tf.getText();
      if(str.length()==0){
          fmsg.setText("*Name cannot be empty");
          fname_tf.requestFocus();}
      else
          mname_tf.requestFocus();
    }//GEN-LAST:event_icon_lbFocusGained

    private void mname_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mname_tfKeyPressed
        String str=mname_tf.getText();
        char ch=evt.getKeyChar();
       if((ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           msg.setText("*Digits Not Allowed !");}
       else if((str.length()==0 && ch==' ')){
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           msg.setText("*Name cannot start with space"); 
       }
       else if(str.length()==0 && ch=='.'){
            evt.consume();
           Toolkit.getDefaultToolkit().beep();
           msg.setText("*Name cannot start with dot");
       }
    }//GEN-LAST:event_mname_tfKeyPressed

    private void mname_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mname_tfKeyTyped
       msg.setText("");
    }//GEN-LAST:event_mname_tfKeyTyped

    private void ficonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ficonFocusGained
       String str=start_sess.getText();
        if(str.length()==0){
            semsg.setText("*Session required !");
            start_sess.requestFocus();}
        else
          end_sess.requestFocus();
    }//GEN-LAST:event_ficonFocusGained

    private void start_sessKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_start_sessKeyPressed
        semsg.setText("");
    }//GEN-LAST:event_start_sessKeyPressed

    private void title_lbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_title_lbFocusGained
      String str=mname_tf.getText();
      if(str.length()==0){
          msg.setText("*Name cannot be empty");
          mname_tf.requestFocus();}
      else
          uni_cmb.requestFocus();
    }//GEN-LAST:event_title_lbFocusGained

    private void mob_lbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mob_lbFocusGained
        String str=email_tf.getText();
      if(str.length()==0){
          emsg.setText("*Email I'd Required !");
          email_tf.requestFocus();} 
      else
         cont_tf.requestFocus();
    }//GEN-LAST:event_mob_lbFocusGained

    private void email_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_tfKeyTyped
     String str=email_tf.getText();
        char ch=evt.getKeyChar();
        if((str.length()==0 && ch==' ')){
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           emsg.setText("*Email I'd cannot start with space"); 
       }
       else if(str.length()==0 && ch=='.'){
            evt.consume();
           Toolkit.getDefaultToolkit().beep();
           emsg.setText("*Email I'd cannot start with dot");
       }
    }//GEN-LAST:event_email_tfKeyTyped

    private void cont_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cont_tfKeyPressed
      msg_lb.setText("");
    }//GEN-LAST:event_cont_tfKeyPressed

    private void email_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_tfKeyPressed
        emsg.setText("");
    }//GEN-LAST:event_email_tfKeyPressed

    private void lbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lbFocusGained
        String str=end_sess.getText();
        if(str.length()==0){
            semsg.setText("*Session required !");
            end_sess.requestFocus();}
    }//GEN-LAST:event_lbFocusGained

    private void start_sessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_start_sessKeyTyped
        char ch=evt.getKeyChar();
       if(!(ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           semsg.setText("*Alphabets not allowed !");
       }
       else if(start_sess.getText().length()==4)
        {
            evt.consume();
           semsg.setText("*Year cannot be greater than 4 digits");
        }
    }//GEN-LAST:event_start_sessKeyTyped

    private void end_sessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_end_sessKeyTyped
       char ch=evt.getKeyChar();
       if(!(ch>=48 && ch<=57))
       {
           evt.consume();
           Toolkit.getDefaultToolkit().beep();
           semsg.setText("*Alphabets not allowed !");
       }
       else if(end_sess.getText().length()==4)
        {
            evt.consume();
           semsg.setText("*Year cannot be greater than 4 digits");
        }
    }//GEN-LAST:event_end_sessKeyTyped

    private void end_sessKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_end_sessKeyPressed
       semsg.setText("");
    }//GEN-LAST:event_end_sessKeyPressed

    private void pswrd_tfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswrd_tfKeyPressed
        insert_bt.setEnabled(true);
    }//GEN-LAST:event_pswrd_tfKeyPressed

    private void uni_cmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_uni_cmbItemStateChanged
    if(flg){
        try{
            flg=false;
        pg_cmb.removeAllItems();
        stmt=con.prepareStatement("select distinct prog_name from prog_info where uni_name=?");
        stmt.setString(1,uni_cmb.getSelectedItem().toString());
        rs=stmt.executeQuery();
        pg_cmb.addItem("select program");
        while(rs.next())
            pg_cmb.addItem(rs.getString(1));
        flg=true;
       }
       catch(SQLException p){
           JOptionPane.showMessageDialog(null,"Query unsuccess");
       }
    }  
    }//GEN-LAST:event_uni_cmbItemStateChanged

    private void pg_cmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pg_cmbItemStateChanged
      if(flg){
        try{
        stmt=con.prepareStatement("select prog_fee from prog_info where uni_name=?");
        stmt.setString(1,uni_cmb.getSelectedItem().toString());
        rs=stmt.executeQuery();
        if(rs.next())
            pfee_tf.setText(rs.getString(1));
        else
            JOptionPane.showMessageDialog(null,"fee is missing");
       }
       catch(SQLException p){
           JOptionPane.showMessageDialog(null,"Query unsuccess");
       }
      }
    }//GEN-LAST:event_pg_cmbItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar_tf;
    private javax.swing.JLabel amsg;
    private javax.swing.JTextField cont_tf;
    private javax.swing.JTextField dob_tf;
    private javax.swing.JTextField email_tf;
    private javax.swing.JLabel emsg;
    private javax.swing.JTextField end_sess;
    private javax.swing.JTextField enroll_tf;
    private javax.swing.JRadioButton female_rbt;
    private javax.swing.JButton ficon;
    private javax.swing.JLabel fmsg;
    private javax.swing.JTextField fname_tf;
    private javax.swing.JLabel icon_lb;
    private javax.swing.JLabel id_lb;
    private javax.swing.JButton insert_bt;
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
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb;
    private javax.swing.JButton male_icon;
    private javax.swing.JRadioButton male_rbt;
    private javax.swing.JTextField mname_tf;
    private javax.swing.JLabel mob_lb;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel msg_lb;
    private javax.swing.JButton next_bt;
    private javax.swing.JTextField pfee_tf;
    private javax.swing.JComboBox<String> pg_cmb;
    private javax.swing.JLabel pic_lb;
    private javax.swing.JTextField pswrd_tf;
    private javax.swing.JLabel semsg;
    private javax.swing.JTextField sid_tf;
    private javax.swing.JLabel smsg;
    private javax.swing.JTextField sname_tf;
    private javax.swing.JTextField start_sess;
    private javax.swing.JLabel title_lb;
    private javax.swing.JComboBox<String> uni_cmb;
    private javax.swing.JButton upload_bt;
    private javax.swing.JLabel user_lb;
    private javax.swing.JTextField user_tf;
    // End of variables declaration//GEN-END:variables

}
