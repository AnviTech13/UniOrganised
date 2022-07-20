
package uniorganised;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Student_DetailReport extends javax.swing.JFrame {
       Connection con;
       PreparedStatement stmt;
       ResultSet rs;
       boolean flag=true;
       boolean ctr;
    public Student_DetailReport() throws SQLException {
        initComponents();
        this.getRootPane().setDefaultButton(print_bt);
        this.setTitle("Student Report");
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
         Container co=this.getContentPane();
        co.setBackground(Color.white);
        con=ConnDb.conLink();
        Calendar c=Calendar.getInstance();
        SimpleDateFormat sf=new SimpleDateFormat("dd:MM:yyyy");
        this.setLocationRelativeTo(null);
         Thread clock=new Thread(){
            public void run(){
                for(;;){
                    java.util.Date d=new java.util.Date();
                    date_lb.setText(DateFormat.getDateInstance().format(d));
                }
                    
            }
        };
        clock.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        date_lb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sname_lb = new javax.swing.JLabel();
        pic_lb = new javax.swing.JLabel();
        fname_lb = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        pg_lb = new javax.swing.JLabel();
        sess_lb = new javax.swing.JLabel();
        enroll_tf = new javax.swing.JTextField();
        user_lb = new javax.swing.JLabel();
        pswd_lb = new javax.swing.JLabel();
        print_bt = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        dob_lb = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Students Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel1)
                .addContainerGap(341, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 944, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        date_lb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Student I'D");

        sname_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        sname_lb.setText("Students Name:-");

        pic_lb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pic_lb.setText("                  Photo");
        pic_lb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fname_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        fname_lb.setText("Father's Name:-");

        dob.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        dob.setText("D.O.B :-");

        pg_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        pg_lb.setText("Program:- ");

        sess_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        sess_lb.setText("Session:-");

        enroll_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enroll_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                enroll_tfFocusLost(evt);
            }
        });

        user_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        user_lb.setText("User I'd :-");

        pswd_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        pswd_lb.setText("Password:-");

        print_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/if_print_16_22615.png"))); // NOI18N
        print_bt.setBorderPainted(false);
        print_bt.setContentAreaFilled(false);
        print_bt.setFocusPainted(false);
        print_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                print_btMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel12.setText(" Signature    ..................................");

        dob_lb.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("   Date:-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(fname_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(user_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(56, 56, 56))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dob_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pg_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sess_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pswd_lb, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(27, 27, 27)
                                        .addComponent(enroll_tf))
                                    .addComponent(sname_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(126, 126, 126)
                                .addComponent(pic_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(523, 523, 523)
                                .addComponent(print_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date_lb, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enroll_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addComponent(sname_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pic_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pg_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sess_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswd_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(print_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enroll_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enroll_tfFocusLost
           try {
               stmt=con.prepareStatement("select sname,fname,dob,user_id,password,prog_name,photo,year from stud_info where upper (enrol_no)=?");
                stmt.setString(1,enroll_tf.getText().toUpperCase());
                rs=stmt.executeQuery();
                   if(rs.next()){
                 sname_lb.setText(sname_lb.getText()+"   "+rs.getString(1));
                 fname_lb.setText(fname_lb.getText()+"   "+rs.getString(2));
                  dob_lb.setText(rs.getString(3));
                 user_lb.setText(user_lb.getText()+"   "+rs.getString(4));
                  pswd_lb.setText(pswd_lb.getText()+"   "+rs.getString(5));
                  pg_lb.setText(pg_lb.getText()+"   "+rs.getString(6));
                  sess_lb.setText(sess_lb.getText()+"    "+rs.getString(8));
                   Blob b=rs.getBlob(7);
                   byte[] imgdata = b.getBytes(1,(int) b.length());
                  ImageIcon img1=new ImageIcon(new ImageIcon(imgdata).getImage().getScaledInstance(pic_lb.getWidth(), pic_lb.getHeight(),Image.SCALE_SMOOTH));
                  pic_lb.setIcon(img1);
                    
                 
               
            }}
            catch (SQLException ex) {
               Logger.getLogger(Student_DetailReport.class.getName()).log(Level.SEVERE, null, ex);
           }
 
    }//GEN-LAST:event_enroll_tfFocusLost

    private void print_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print_btMouseClicked
        int r=JOptionPane.showConfirmDialog(null,"DO U WANT TO PRINT THE RECORD","Confirmation Window",JOptionPane.YES_NO_OPTION);
         if(r==0)
         {
              flag=false;
              enroll_tf.setBorder(null);
             PrinterJob pjob = PrinterJob.getPrinterJob();
             PageFormat preformat = pjob.defaultPage();
             preformat.setOrientation(PageFormat.LANDSCAPE);
             PageFormat postformat = pjob.pageDialog(preformat);
             //If user does not hit cancel then print.
             if (preformat != postformat) {
                 //Set print component
                 pjob.setPrintable(new Fee_ReportDetail.Printer(this), postformat);
                 if (pjob.printDialog()) {
                     try {
                         print_bt.setVisible(false);
                         pjob.print();
                         this.dispose();
                     } catch (PrinterException ex) {
                     }
                 }
             }
         }
    }//GEN-LAST:event_print_btMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new MainWindow(ctr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing
public static class Printer implements Printable {
    final Component comp;

    public Printer(Component comp){
        this.comp = comp;
    }
    @Override
        public int print(Graphics g, PageFormat format, int page_index) 
            throws PrinterException {
        if (page_index > 0) {
            return Printable.NO_SUCH_PAGE;
        }

        // get the bounds of the component
        Dimension dim = comp.getSize();
        double cHeight = dim.getHeight();
        double cWidth = dim.getWidth();
        // get the bounds of the printable area
        double pHeight = format.getImageableHeight();
        double pWidth = format.getImageableWidth();

        double pXStart = format.getImageableX();
        double pYStart = format.getImageableY();

        double xRatio = pWidth / cWidth;
        double yRatio = pHeight / cHeight;
        Graphics2D g2 = (Graphics2D) g;
        g2.translate(pXStart, pYStart);
        g2.scale(xRatio, yRatio);
        comp.paint(g2);
        return Printable.PAGE_EXISTS;
    }}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date_lb;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel dob_lb;
    private javax.swing.JTextField enroll_tf;
    private javax.swing.JLabel fname_lb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pg_lb;
    private javax.swing.JLabel pic_lb;
    private javax.swing.JButton print_bt;
    private javax.swing.JLabel pswd_lb;
    private javax.swing.JLabel sess_lb;
    private javax.swing.JLabel sname_lb;
    private javax.swing.JLabel user_lb;
    // End of variables declaration//GEN-END:variables
}
