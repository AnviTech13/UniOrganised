
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
public class Program_DetailsReport extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
       ResultSet rs;
       boolean flag=true;
       boolean ctr;
    public Program_DetailsReport() throws SQLException {
        initComponents();
        this.getRootPane().setDefaultButton(print_bt);
        this.setTitle("Program Report");
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
        pg_lb = new javax.swing.JLabel();
        fee_lb = new javax.swing.JLabel();
        dur_lb = new javax.swing.JLabel();
        uni_tf = new javax.swing.JTextField();
        print_bt = new javax.swing.JButton();
        date_lb = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        add_lb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setText("Program Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("University Name");

        pg_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        pg_lb.setText("Program Name :-");

        fee_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        fee_lb.setText(" Fees :-");

        dur_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        dur_lb.setText("Duration :-");

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

        date_lb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("   Date :");

        add_lb.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        add_lb.setText("University Address :-");

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("Signature  ........................................");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fee_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dur_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pg_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(211, 211, 211))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(uni_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(date_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(add_lb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 211, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(print_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_lb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uni_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(add_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(pg_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(fee_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(dur_lb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uni_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_uni_tfFocusLost
        try {
            stmt=con.prepareStatement("select uni_adr from uni_info where (uni_name)=?");
            stmt.setString(1,uni_tf.getText());
         rs=stmt.executeQuery();
               if(rs.next()){
                add_lb.setText(add_lb.getText()+"    "+rs.getString(1));
               stmt=con.prepareStatement("select prog_name,prog_fee,duration from prog_info where (uni_name)=?");
               stmt.setString(1,uni_tf.getText());
                rs=stmt.executeQuery();
                if(rs.next())
                pg_lb.setText(pg_lb.getText()+"    "+rs.getString(1));
                fee_lb.setText(fee_lb.getText()+"    "+rs.getString(2));
                dur_lb.setText(dur_lb.getText()+"    "+rs.getString(3));
                } } catch (SQLException ex) {
            Logger.getLogger(Program_DetailsReport.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel dur_lb;
    private javax.swing.JLabel fee_lb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pg_lb;
    private javax.swing.JButton print_bt;
    private javax.swing.JTextField uni_tf;
    // End of variables declaration//GEN-END:variables
}
