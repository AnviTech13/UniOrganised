
package uniorganised;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
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
import javax.swing.table.DefaultTableModel;


public class Fee_ReportDetail extends javax.swing.JFrame {
 Connection con;
       PreparedStatement stmt;
       ResultSet rs;
       boolean flag=true;
       boolean ctr;
    public Fee_ReportDetail() throws SQLException {
        initComponents();
        this.getRootPane().setDefaultButton(print_bt);
        this.setTitle("Fee Report");
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
        jLabel2 = new javax.swing.JLabel();
        sname_lb = new javax.swing.JLabel();
        pg_lb = new javax.swing.JLabel();
        sess_lb = new javax.swing.JLabel();
        enroll_tf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        date_lb = new javax.swing.JLabel();
        print_bt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fee Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Enrollment No. ");

        sname_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        sname_lb.setText("Student Name:-");

        pg_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        pg_lb.setText("Program Name:-");

        sess_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        sess_lb.setText("Session:-");

        enroll_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enroll_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                enroll_tfFocusLost(evt);
            }
        });

        tab.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Amount", "Paid Amount", "Dues Amount", "Pay Mode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(0).setResizable(false);
            tab.getColumnModel().getColumn(1).setResizable(false);
            tab.getColumnModel().getColumn(2).setResizable(false);
            tab.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Date :-");

        date_lb.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        print_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/if_print_16_22615.png"))); // NOI18N
        print_bt.setBorderPainted(false);
        print_bt.setContentAreaFilled(false);
        print_bt.setFocusPainted(false);
        print_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                print_btMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("Signature  ..................................................");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(sess_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enroll_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sname_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pg_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(date_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enroll_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(sname_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(pg_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sess_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enroll_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enroll_tfFocusLost
     try {
         stmt=con.prepareStatement("select sname,prog_name,year from stud_info where upper (enrol_no)=?");
         stmt.setString(1,enroll_tf.getText().toUpperCase());
         rs=stmt.executeQuery();
               if(rs.next()){
                sname_lb.setText(sname_lb.getText()+"    "+rs.getString(1));
                pg_lb.setText(pg_lb.getText()+"    "+rs.getString(2));
                sess_lb.setText(sess_lb.getText()+"    "+rs.getString(3));
         stmt=con.prepareStatement("select tot_amount,paid_amount,due,pay_mode from fee_info where upper (enrol_no)=?");
                  stmt.setString(1,enroll_tf.getText().toUpperCase());
               rs=stmt.executeQuery();
            DefaultTableModel mode=(DefaultTableModel)tab.getModel();
            while(rs.next()){
                mode.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }}      
            } catch (SQLException ex) {
         Logger.getLogger(Fee_ReportDetail.class.getName()).log(Level.SEVERE, null, ex);
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
                 pjob.setPrintable(new Printer(this), postformat);
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
    private javax.swing.JTextField enroll_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pg_lb;
    private javax.swing.JButton print_bt;
    private javax.swing.JLabel sess_lb;
    private javax.swing.JLabel sname_lb;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
}
