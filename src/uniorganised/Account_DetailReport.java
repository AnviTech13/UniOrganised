
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Account_DetailReport extends javax.swing.JFrame {
       Connection con;
       PreparedStatement stmt;
       ResultSet rs;
       boolean flag=true;
       boolean ctr;
    public Account_DetailReport() throws SQLException {
        initComponents();
        this.getRootPane().setDefaultButton(print_bt);
        this.setTitle("Accounts Report");
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
         Container co=this.getContentPane();
        co.setBackground(Color.white);
        con=ConnDb.conLink();
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
        jLabel2 = new javax.swing.JLabel();
        uni_tf = new javax.swing.JTextField();
        print_bt = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        date_lb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        add_lb = new javax.swing.JLabel();
        mode_lb = new javax.swing.JLabel();
        rec_lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("University Account Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1026, 110));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("University Name");

        uni_tf.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        uni_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                uni_tfFocusLost(evt);
            }
        });

        print_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Icon\\if_print_16_22615.png")); // NOI18N
        print_bt.setBorderPainted(false);
        print_bt.setContentAreaFilled(false);
        print_bt.setFocusPainted(false);
        print_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                print_btMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Date :");

        date_lb.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        tab.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Total Amount", "Paid Amount", "Dues Amount", "Payment Mode"
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

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Signature :-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("...............................");

        add_lb.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        add_lb.setText("University Address :-");

        mode_lb.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        mode_lb.setText(" University Mode:-");

        rec_lb.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        rec_lb.setText(" University Recognisation:-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(print_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(uni_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(date_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 148, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(mode_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(rec_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uni_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(date_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(add_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(mode_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rec_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(print_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 107, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uni_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uni_tfFocusLost
           try {
                stmt=con.prepareStatement("select uni_adr,uni_recog,uni_mode from uni_info where (uni_name)=?");
                stmt.setString(1,uni_tf.getText());
               rs=stmt.executeQuery();
               if(rs.next()){
                add_lb.setText(add_lb.getText()+"    "+rs.getString(1));
                rec_lb.setText(rec_lb.getText()+"    "+rs.getString(2));
                 mode_lb.setText(mode_lb.getText()+"    "+rs.getString(3));
               stmt=con.prepareStatement("select tot_amount,paid_amount,due,pay_mode from acc_details where (uni_name)=?");
               stmt.setString(1,uni_tf.getText());
               rs=stmt.executeQuery();
            DefaultTableModel mode=(DefaultTableModel)tab.getModel();
            while(rs.next()){
                mode.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)});
            }}
           } catch (SQLException ex) {
               Logger.getLogger(Account_DetailReport.class.getName()).log(Level.SEVERE, null, ex);
           }
              
    }//GEN-LAST:event_uni_tfFocusLost

    private void print_btMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print_btMouseClicked
        int r=JOptionPane.showConfirmDialog(null,"DO U WANT TO PRINT THE RECORD","Confirmation Window",JOptionPane.YES_NO_OPTION);
         if(r==0)
         {
              flag=false;
              uni_tf.setBorder(null);
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
    private javax.swing.JLabel add_lb;
    private javax.swing.JLabel date_lb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mode_lb;
    private javax.swing.JButton print_bt;
    private javax.swing.JLabel rec_lb;
    private javax.swing.JTable tab;
    private javax.swing.JTextField uni_tf;
    // End of variables declaration//GEN-END:variables
}
