
package uniorganised;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Recovery_Form extends javax.swing.JFrame {
String str,filename,url;
PreparedStatement stmt,st;
ResultSet rs;
Connection con;
File f;
boolean ctr;
    
    public Recovery_Form(boolean ctr) throws SQLException {
        initComponents();
        con=ConnDb.conLink();
        this.ctr=ctr;
        this.setLocationRelativeTo(null);
        this.setTitle("Recovery");
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
        this.getRootPane().setDefaultButton(recover_bt);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rcvr_cmb = new javax.swing.JComboBox<>();
        recover_bt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("RECOVERY OPTIONS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        rcvr_cmb.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        rcvr_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Details", "Fee Details", "Program Details", "Account Details", "University Details", "Automatic" }));

        recover_bt.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        recover_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/recovericon.png"))); // NOI18N
        recover_bt.setText("RECOVER");
        recover_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recover_btActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/datarecover.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(rcvr_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(recover_bt)
                        .addGap(119, 119, 119)))
                .addComponent(jLabel2)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rcvr_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(recover_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void recover_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recover_btActionPerformed
         try {
        str=rcvr_cmb.getSelectedItem().toString();
        if(str.equalsIgnoreCase("Student Details")){
            stmt=con.prepareStatement("truncate table stud_info");
            stmt.executeUpdate();
            f=new File("backup\\studentdetails.xls"); 
            st=con.prepareStatement("select enrol_no,sname,fname,mo_name,dob,email,contact,user_id,password,year,adhar,prog_name,gen from stud_info");
            url="Insert into stud_info (enrol_no,sname,fname,mo_name,dob,email,contact,user_id,password,year,adhar,prog_name,gen) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("Fee Details")){
            stmt=con.prepareStatement("truncate table fee_info");
            stmt.executeUpdate();
            f=new File("backup\\Feesdetails.xls"); 
            st=con.prepareStatement("select * from fee_info");
            url="Insert into fee_info values(?,?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("Program Details")){
            stmt=con.prepareStatement("truncate table prog_info");
            stmt.executeUpdate();
            f=new File("backup\\Programdetails.xls");
            st=con.prepareStatement("select * from prog_info");
            url="Insert into prog_info values(?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("Account Details")){
            stmt=con.prepareStatement("truncate table acc_details");
            stmt.executeUpdate();
            f=new File("backup\\AccountDetails.xls"); 
            st=con.prepareStatement("select * from acc_details");
            url="Insert into acc_details values(?,?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("University Details")){
            stmt=con.prepareStatement("truncate table uni_info");
            stmt.executeUpdate();
            f=new File("backup\\UniversityDetails.xls");
            st=con.prepareStatement("select * from uni_info");
            url="Insert into uni_info values(?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("Automatic")){
            stmt=con.prepareStatement("truncate table automatic");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from automatic");
            f=new File("backup\\Automatic.xls");     
            url="insert into automatic values(?,?)";
        }
                FileInputStream fs=new FileInputStream(f);
                Workbook wb=Workbook.getWorkbook(fs);
                Sheet sh=wb.getSheet(0);
                stmt=con.prepareStatement(url);
                ResultSetMetaData rsmd=st.getMetaData();
                for(byte i=1;i<sh.getRows();i++){
                    for(byte j=0;j<sh.getColumns();j++){
                        String str=sh.getCell(j,i).getContents();
                        if(rsmd.getColumnTypeName(j+1).equalsIgnoreCase("number"))
                            stmt.setInt(j+1,Integer.parseInt(str.substring(1,str.length())));
                        else
                            stmt.setString(j+1,str.substring(1,str.length()));
                    }
                    stmt.executeUpdate();
                }
                System.out.print("Recovery complete!");
        
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Recovery_Form.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | BiffException | SQLException ex) {
                Logger.getLogger(Recovery_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_recover_btActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       new MainWindow(ctr).setVisible(true);
       this.dispose();
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> rcvr_cmb;
    private javax.swing.JButton recover_bt;
    // End of variables declaration//GEN-END:variables
}
