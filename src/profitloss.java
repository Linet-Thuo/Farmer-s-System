import com.mysql.jdbc.Connection;import com.mysql.jdbc.PreparedStatement;import com.mysql.jdbc.Statement;import java.awt.HeadlessException;
import java.sql.DriverManager;import java.sql.ResultSet;import java.sql.SQLException;import java.util.ArrayList;
import java.util.logging.Level;import java.util.logging.Logger;import javax.swing.JOptionPane;import javax.swing.table.DefaultTableModel;

public class profitloss extends javax.swing.JFrame {
String JDBC_Driver="com.mysql.jdbc.Driver";String dburl ="jdbc:mysql://localhost:3306/farm?zeroDateTimeBehavior=convertToNull";
Connection connects=(Connection) DriverManager.getConnection(dburl, "root", "");PreparedStatement stnt=null;
Statement stnt1=(Statement) connects.createStatement();ResultSet rs1=null, rs2=null, rs3=null;


    public profitloss() throws SQLException {initComponents();show_user();}

    public ArrayList<User5> userList() throws SQLException{ArrayList<User5> userList=new ArrayList<>();
    try{Class.forName("com.mysql.jdbc.Driver");rs1=stnt1.executeQuery("SELECT * FROM total");User5 user;
    while (rs1.next()){user= new User5(rs1.getString("month"), rs1.getInt("year"), rs1.getInt("sales"), 
    rs1.getInt("purchases"), rs1.getInt("others"), rs1.getInt("profit"), rs1.getInt("loss"));userList.add(user);}} 
    catch (ClassNotFoundException | SQLException e) {JOptionPane.showMessageDialog(null, e);}return userList;}
    
    public void show_user() throws SQLException{ArrayList<User5> list = userList();
    DefaultTableModel model= (DefaultTableModel) jTable1.getModel();Object [] row = new Object [7];
    for (int i=0; i<list.size();i++){row[0]=list.get(i).getmonth();row[1]=list.get(i).getyear();
    row[2]=list.get(i).getsales();row[3]=list.get(i).getpurchases();row[4]=list.get(i).getothers();
    row[5]=list.get(i).getprofit();row[6]=list.get(i).getloss();model.addRow(row);} }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROFIT AND LOSS:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("MONTH:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("YEAR:");

        jComboBox1.setMaximumRowCount(15);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MILK SALES:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("PURCHASE:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("OTHERS:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("PROFIT:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("LOSS:");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("SEARCH");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("DELETE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NONE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("NONE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("NONE");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("NONE");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("NONE");

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("YEARLY ANALYSIS");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jButton4)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton1)
                        .addGap(55, 55, 55)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton5)
                                .addGap(40, 40, 40)
                                .addComponent(jButton6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton7)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Month", "Year", "Sales", "Purchases", "Others", "Profit", "Loss"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu1.setText("MENU");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu2.setText("MILK RECORDS");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu3.setText("MILK SALES");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu4.setText("PURCHASES");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu5.setText("OTHERS");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu6.setText("PROFIT AND LOSS");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu7.setText("DEBTORS AND CREDITORS");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    menu frame=new menu();frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    mrecords frame = null;try {frame = new mrecords();} 
    catch (SQLException ex) {Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);}frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
    msales frame = null;try {frame = new msales();}catch (SQLException ex) {Logger.getLogger(mrecords.class.getName()).log(Level.SEVERE, null, ex);}
    frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
    purchase frame = null;try {frame = new purchase();} catch (SQLException ex) {Logger.getLogger(mrecords.class.getName()).log(Level.SEVERE, null, ex);}
    frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
    other frame = null;try {frame = new other();} catch (SQLException ex) {Logger.getLogger(mrecords.class.getName()).log(Level.SEVERE, null, ex);}
    frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
    debts frame = null;try {frame = new debts();} catch (SQLException ex) {Logger.getLogger(mrecords.class.getName()).log(Level.SEVERE, null, ex);}
    frame.setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jTextField1.setText("");jComboBox1.setSelectedItem("NONE");jLabel8.setText("0");jLabel9.setText("0");
    jLabel10.setText("0");jLabel11.setText("0");jLabel12.setText("0");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    try{String month=jComboBox1.getSelectedItem().toString();String year=jTextField1.getText();try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) { Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month!");}
    else{rs1=stnt1.executeQuery("SELECT * FROM total WHERE month='"+month+"' AND year='"+year+"'");
    if (rs1.next()){stnt=(PreparedStatement) connects.prepareStatement("DELETE FROM total WHERE month='"+month+"' AND year='"+year+"'");
    stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();}
    else{JOptionPane.showMessageDialog(null, "Cannot Delete. The entry doesn't exist.");}rs1.close();stnt1.close();stnt.close();connects.close();}}
    catch (SQLException | HeadlessException e){ JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs1.close();stnt1.close();stnt.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    try{String month=jComboBox1.getSelectedItem().toString();String year=jTextField1.getText();try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) { Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month!");}
    else{rs1=stnt1.executeQuery("SELECT * FROM total WHERE month='"+month+"' AND year='"+year+"'");
    if (rs1.next()){String sales =rs1.getString("sales"); String purchases =rs1.getString("purchases");
    String others =rs1.getString("others");String profit =rs1.getString("profit");String loss =rs1.getString("loss");
    JOptionPane.showMessageDialog(null, "Month:"+month+". Year:"+year+". Sales:"+sales+". Purchases:"+purchases+". Others:"+others+". Profit:"+profit+". Loss:"+loss+".");
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();}
    else{JOptionPane.showMessageDialog(null, "Not Found!");}rs1.close();stnt1.close();connects.close();}} 
    catch (SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e.getMessage());try {rs1.close();stnt1.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{String month=jComboBox1.getSelectedItem().toString();String year=jTextField1.getText();
    String sales=jLabel8.getText(); String purchases=jLabel9.getText();String others=jLabel10.getText();
    String profit=jLabel11.getText();String loss=jLabel12.getText();try{Class.forName("com.mysql.jdbc.Driver");}
    catch (ClassNotFoundException ex) { Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month!");}
    else{rs1=stnt1.executeQuery("SELECT * FROM total WHERE month='"+month+"' AND year='"+year+"'");
    if(rs1.next()){JOptionPane.showMessageDialog(null, "Cannot add. The entry already exists.");}
    else{stnt=(PreparedStatement) connects.prepareStatement("INSERT INTO farm.total(month, year, sales, purchases, others, profit, loss) "
    + "VALUES('"+month+"', '"+year+"', '"+sales+"', '"+purchases+"', '"+others+"', '"+profit+"', '"+loss+"')");
    stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();}
    rs1.close();stnt.close();stnt1.close();connects.close();}} 
    catch (SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs1.close();stnt.close();stnt1.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{String month=jComboBox1.getSelectedItem().toString();String year=jTextField1.getText();try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) { Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month!");}
    rs1=stnt1.executeQuery("SELECT SUM(totalmonth) as monthtotal FROM sales WHERE month='"+month+"' AND year='"+year+"'");
    if(rs1.next()){int monthtotal=rs1.getInt("monthtotal");String ab=rs1.getString("monthtotal");
    if(monthtotal>0){jLabel8.setText(ab);}else{jLabel8.setText("0");}}else{JOptionPane.showMessageDialog(null, "Not Found!");}
    rs2=stnt1.executeQuery("SELECT SUM(cost) as costb FROM purchases WHERE month='"+month+"' AND year='"+year+"'");
    if(rs2.next()){int costb=rs2.getInt("costb");String ab=rs2.getString("costb");                
    if(costb>0){jLabel9.setText(ab);}else{jLabel9.setText("0");}}else{JOptionPane.showMessageDialog(null, "Not Found!");}
    rs3=stnt1.executeQuery("SELECT SUM(cost) as costa FROM others WHERE month='"+month+"' AND year='"+year+"'");
    if(rs3.next()){int costa=rs3.getInt("costa");String ab=rs3.getString("costa");                
    if(costa>0){jLabel10.setText(ab);}else{jLabel10.setText("0");}}else{JOptionPane.showMessageDialog(null, "Not Found!");}
    int a = 0, b = 0, c=0, d=0, e=0, f=0;a=Integer.parseInt(jLabel8.getText());
    b=Integer.parseInt(jLabel9.getText());c=Integer.parseInt(jLabel10.getText());d=b+c;
    if (a>d){e=a-d;String ans;ans = String.valueOf(e);jLabel11.setText(ans);jLabel12.setText("0");}
    else{f=d-a;String ans=String.valueOf(f);jLabel11.setText("0");jLabel12.setText(ans);}
    rs1.close();rs2.close();rs3.close();stnt1.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);
    JOptionPane.showMessageDialog(null, "Not Found!");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{String month=jComboBox1.getSelectedItem().toString();String year=jTextField1.getText();
    String sales=jLabel8.getText(); String purchases=jLabel9.getText();String others=jLabel10.getText();
    String profit=jLabel11.getText();String loss=jLabel12.getText();try{Class.forName("com.mysql.jdbc.Driver");}
    catch (ClassNotFoundException ex) { Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month!");}
    else{rs1=stnt1.executeQuery("SELECT * FROM total WHERE month='"+month+"' AND year='"+year+"'");
    if(rs1.next()){stnt=(PreparedStatement) connects.prepareStatement("UPDATE total SET sales='"+sales+"', purchases='"+purchases+"', "
    + "others='"+others+"', profit='"+profit+"', loss='"+loss+"' WHERE month='"+month+"' AND year='"+year+"'");        
    stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();}
    else{JOptionPane.showMessageDialog(null, "Cannot Update. The entry doesn't exists.");} rs1.close();stnt.close();stnt1.close();connects.close();}} 
    catch (SQLException ex) {try {Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);
    rs1.close();stnt.close();stnt1.close();connects.close();} 
    catch (SQLException ex1) {Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex1);}}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    yeartotal frame = null;try {frame = new yeartotal();} 
    catch (SQLException ex) {Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);}frame.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {java.awt.EventQueue.invokeLater(() -> {try {new profitloss().setVisible(true);} 
    catch (SQLException ex) {Logger.getLogger(profitloss.class.getName()).log(Level.SEVERE, null, ex);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
