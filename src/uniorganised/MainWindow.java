
package uniorganised;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MainWindow extends javax.swing.JFrame {
    boolean ctr;
    public MainWindow(boolean ctr) {
        initComponents();
        ImageIcon img=new ImageIcon(getClass().getResource("univ.png"));
        this.setIconImage(img.getImage());
       this.ctr=ctr;
        this.setLocationRelativeTo(null);
        this.setTitle("Main Window");
       if(ctr){
          report_bt.setEnabled(false);
           add_bt.setEnabled(false);
           recover_bt.setEnabled(false);
           back_bt.setEnabled(false);
        }    
        Thread clock=new Thread(){
            public void run(){
                for(;;){
                    try {
                         java.util.Date d=new java.util.Date();
                    lab1.setText(DateFormat.getDateTimeInstance().format(d));
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    
            }
        };
        clock.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_bt = new javax.swing.JButton();
        fee_bt = new javax.swing.JButton();
        pg_bt = new javax.swing.JButton();
        report_bt = new javax.swing.JButton();
        univ_bt1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        back_bt = new javax.swing.JButton();
        logout_bt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        recover_bt = new javax.swing.JButton();
        aboutus_bt = new javax.swing.JButton();
        change_bt = new javax.swing.JButton();
        service_bt = new javax.swing.JButton();
        entry_bt = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_bt.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        add_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\output-onlinepngtools (18).png")); // NOI18N
        add_bt.setText("Add New Students");
        add_bt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        add_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btActionPerformed(evt);
            }
        });
        getContentPane().add(add_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 520, 60));

        fee_bt.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        fee_bt.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\New icons\\output-onlinepngtools (19).png")); // NOI18N
        fee_bt.setText("Fee Details ");
        fee_bt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fee_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fee_btActionPerformed(evt);
            }
        });
        getContentPane().add(fee_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 520, 60));

        pg_bt.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        pg_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/bookk.png"))); // NOI18N
        pg_bt.setText("Program Information");
        pg_bt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pg_bt.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        pg_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pg_btActionPerformed(evt);
            }
        });
        getContentPane().add(pg_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 520, 60));

        report_bt.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        report_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/bill.png"))); // NOI18N
        report_bt.setText("Reports");
        report_bt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        report_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_btActionPerformed(evt);
            }
        });
        getContentPane().add(report_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 810, 520, 60));

        univ_bt1.setFont(new java.awt.Font("Times New Roman", 1, 23)); // NOI18N
        univ_bt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/mainwindowUniversity.png"))); // NOI18N
        univ_bt1.setText("University Account Information");
        univ_bt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        univ_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                univ_bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(univ_bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 930, 520, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        back_bt.setBackground(new java.awt.Color(255, 255, 255));
        back_bt.setForeground(new java.awt.Color(255, 255, 255));
        back_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/backbutton.png"))); // NOI18N
        back_bt.setBorderPainted(false);
        back_bt.setContentAreaFilled(false);
        back_bt.setFocusPainted(false);
        back_bt.setOpaque(true);
        back_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btActionPerformed(evt);
            }
        });

        logout_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/cancel_50px.png"))); // NOI18N
        logout_bt.setBorderPainted(false);
        logout_bt.setContentAreaFilled(false);
        logout_bt.setFocusPainted(false);
        logout_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anwesha\\Desktop\\Icon\\newunipic.jpg")); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/redlogo.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/welcome.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/welcome.jpg"))); // NOI18N

        lab1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        recover_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        recover_bt.setForeground(new java.awt.Color(255, 51, 51));
        recover_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/recovericon.png"))); // NOI18N
        recover_bt.setText("Recovery");
        recover_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recover_btActionPerformed(evt);
            }
        });

        aboutus_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        aboutus_bt.setForeground(new java.awt.Color(255, 51, 51));
        aboutus_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/about.png"))); // NOI18N
        aboutus_bt.setText("About Us");
        aboutus_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutus_btActionPerformed(evt);
            }
        });

        change_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        change_bt.setForeground(new java.awt.Color(255, 51, 51));
        change_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/key.png"))); // NOI18N
        change_bt.setText("Change Password");
        change_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_btActionPerformed(evt);
            }
        });

        service_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        service_bt.setForeground(new java.awt.Color(255, 51, 51));
        service_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/formicon.png"))); // NOI18N
        service_bt.setText("Services Forms");
        service_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                service_btActionPerformed(evt);
            }
        });

        entry_bt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        entry_bt.setForeground(new java.awt.Color(255, 51, 51));
        entry_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/entryicon.png"))); // NOI18N
        entry_bt.setText("Entry Forms");
        entry_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entry_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(logout_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(entry_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(service_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(change_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(recover_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(aboutus_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {aboutus_bt, change_bt, entry_bt, recover_bt, service_bt});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout_bt)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(back_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                            .addComponent(lab1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(recover_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aboutus_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(change_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(service_bt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(entry_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {aboutus_bt, change_bt, entry_bt, recover_bt, service_bt});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 410));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/unigif.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, 600));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniorganised/greenbg.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 410, 1350, 620));

        setBounds(0, 0, 1351, 1012);
    }// </editor-fold>//GEN-END:initComponents

    private void recover_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recover_btActionPerformed
        try {
            new Recovery_Form(ctr).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_recover_btActionPerformed

    private void change_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_btActionPerformed
        try {
            new ChangePassword().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_change_btActionPerformed

    private void service_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_service_btActionPerformed
        new ServiceForm(ctr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_service_btActionPerformed

    private void entry_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entry_btActionPerformed
        new EntryForms(ctr).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_entry_btActionPerformed

    private void univ_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_univ_bt1ActionPerformed
        try {
            new UnivAccount_Search(ctr,0).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_univ_bt1ActionPerformed

    private void fee_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fee_btActionPerformed
        try {
            new Fee_Search(ctr,0).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fee_btActionPerformed

    private void report_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_btActionPerformed
        try {
            new Report().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_report_btActionPerformed

    private void pg_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pg_btActionPerformed
        try {
            new Prog_Search(ctr,0).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_pg_btActionPerformed

    private void add_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btActionPerformed
        try {
            new Student_info(ctr,0).setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_add_btActionPerformed

    private void back_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btActionPerformed
        new ControlForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btActionPerformed

    private void logout_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btActionPerformed
        try {
            new LoginWindow().setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logout_btActionPerformed

    private void aboutus_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutus_btActionPerformed
        new AboutUs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_aboutus_btActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutus_bt;
    private javax.swing.JButton add_bt;
    private javax.swing.JButton back_bt;
    private javax.swing.JButton change_bt;
    private javax.swing.JButton entry_bt;
    private javax.swing.JButton fee_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lab1;
    private javax.swing.JButton logout_bt;
    private javax.swing.JButton pg_bt;
    private javax.swing.JButton recover_bt;
    private javax.swing.JButton report_bt;
    private javax.swing.JButton service_bt;
    private javax.swing.JButton univ_bt1;
    // End of variables declaration//GEN-END:variables

}
