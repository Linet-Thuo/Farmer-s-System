import com.mysql.jdbc.Connection;import com.mysql.jdbc.PreparedStatement;import com.mysql.jdbc.Statement;import java.awt.HeadlessException;
import java.sql.DriverManager;import java.sql.ResultSet;import java.sql.SQLException;import java.util.ArrayList;
import java.util.logging.Level;import java.util.logging.Logger;import javax.swing.JOptionPane;import javax.swing.table.DefaultTableModel;

public class purchase extends javax.swing.JFrame {
String JDBC_Driver="com.mysql.jdbc.Driver";String dburl ="jdbc:mysql://localhost:3306/farm?zeroDateTimeBehavior=convertToNull";
Connection connects=(Connection) DriverManager.getConnection(dburl, "root", "");PreparedStatement stnt=null;
Statement stnt1=stnt1=(Statement) connects.createStatement();ResultSet rs=null;


    public purchase() throws SQLException {initComponents();show_user();}
    
 public ArrayList<User4> userList() throws SQLException{ ArrayList<User4> userList=new ArrayList<>();
 try{Class.forName("com.mysql.jdbc.Driver");stnt1=(Statement) connects.createStatement();
 rs=stnt1.executeQuery("SELECT * FROM purchases");User4 user;
 while (rs.next()){
 user= new User4(rs.getString("item"), rs.getInt("quantity"), rs.getInt("cost"), rs.getString("month"), rs.getInt("year"));userList.add(user);}} 
 catch (ClassNotFoundException | SQLException e) {JOptionPane.showMessageDialog(null, e);}return userList;}
    
    public void show_user() throws SQLException{
    ArrayList<User4> list = userList();DefaultTableModel model= (DefaultTableModel) jTable1.getModel();Object [] row = new Object [5];
    for (int i=0; i<list.size();i++){row[0]=list.get(i).getitem();row[1]=list.get(i).getquantity();
    row[2]=list.get(i).getcost();row[3]=list.get(i).getmonth();row[4]=list.get(i).getyear();model.addRow(row);}}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Cost", "Month", "Year"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PURCHASES:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ITEM:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("QUANTITY:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("COST:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("MONTH:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("YEAR:");

        jComboBox1.setMaximumRowCount(15);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("CLEAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addGap(59, 59, 59)
                                .addComponent(jButton5)))
                        .addGap(113, 113, 113))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(23, 23, 23))
        );

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

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
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
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    menu frame=new menu();frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
    msales frame = null;try{frame = new msales();} catch (SQLException ex) {Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}
    frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
    other frame = null;try {frame = new other();} catch (SQLException ex) {Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}
    frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
    profitloss frame = null;try {frame = new profitloss();} 
    catch (SQLException ex) {Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}
    frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
    debts frame = null;try {frame = new debts();} catch (SQLException ex) {Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}
    frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    mrecords frame = null;try {frame = new mrecords();} catch (SQLException ex) {Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}
        frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{String item=jTextField1.getText();String quantity=jTextField2.getText();String cost=jTextField3.getText();
     String year=jTextField4.getText();String month=jComboBox1.getSelectedItem().toString();            
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}
    if(jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Item Name.");}
    else if (jTextField2.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter quantity.");}
    else if (jTextField3.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Cost.");}
    else if (jTextField4.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year.");}
    else if(jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please enter Month.");}
    else{rs=stnt1.executeQuery("SELECT * FROM purchases WHERE item='"+item+"' AND month='"+month+"' AND year='"+year+"'");
    if(rs.next()){JOptionPane.showMessageDialog(null, "Cannot add. The entry already exists.");}
    else{stnt=(PreparedStatement) connects.prepareStatement("INSERT INTO farm.purchases(item, quantity, cost, month, year) "
    + "VALUES('"+item+"', '"+quantity+"', '"+cost+"', '"+month+"', '"+year+"')");stnt.executeUpdate();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();            
    rs.close();stnt.close();stnt1.close(); connects.close();}}} 
    catch (SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt.close();stnt1.close(); connects.close();} 
    catch (SQLException ex) {Logger.getLogger(debts.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{String item=jTextField1.getText();String quantity=jTextField2.getText();String cost=jTextField3.getText();
     String year=jTextField4.getText();String month=jComboBox1.getSelectedItem().toString();            
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}
    if(jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Item Name.");}
    else if (jTextField2.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter quantity.");}
    else if (jTextField3.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Cost.");}
    else if (jTextField4.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year.");}
    else if(jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please enter Month.");}
    else{rs=stnt1.executeQuery("SELECT * FROM purchases WHERE item='"+item+"' AND month='"+month+"' AND year='"+year+"'");
    if(rs.next()){
    stnt=(PreparedStatement) connects.prepareStatement("UPDATE purchases SET quantity='"+quantity+"', cost='"+cost+"', month='"+month+"', year='"+year+"' "
            + "WHERE item='"+item+"' AND month='"+month+"' AND year='"+year+"'");stnt.executeUpdate();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();}
    else{JOptionPane.showMessageDialog(null, "Cannot Update. The entry doesn't exist.");}rs.close();stnt1.close();stnt.close();connects.close();}} 
    catch (SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt1.close();stnt.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(debts.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{String item=jTextField1.getText();String month=jComboBox1.getSelectedItem().toString();String year=jTextField4.getText();           
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) { Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Item Name.");}
    else if (jTextField4.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year.");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Select Month.");}
    else{rs=stnt1.executeQuery("SELECT * FROM farm.purchases WHERE item='"+item+"' AND month='"+month+"' AND year='"+year+"'");
    if(rs.next()){String quantity=rs.getString("quantity");String cost=rs.getString("cost");
    JOptionPane.showMessageDialog(null, "Item:"+item+". Quantity:"+quantity+". Cost:"+cost+". Month:"+month+". Year:"+year+".");}
    else{JOptionPane.showMessageDialog(null, "Not Found!");}DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);show_user();rs.close();stnt1.close();connects.close();}} 
    catch (SQLException ex) {Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{String item=jTextField1.getText();String month=jComboBox1.getSelectedItem().toString();String year=jTextField4.getText();   
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) { Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Item Name.");}
    else if (jTextField4.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year.");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Select Month.");}
    else{rs=stnt1.executeQuery("SELECT * FROM farm.purchases WHERE item='"+item+"' AND month='"+month+"' AND year='"+year+"'");
    if(rs.next()){
    stnt=(PreparedStatement) connects.prepareStatement("DELETE FROM purchases WHERE item='"+item+"' AND month='"+month+"' AND year='"+year+"'");
    stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();}       
    else{ JOptionPane.showMessageDialog(null, "Cannot Delete. The entry doesn't exist.");}rs.close();stnt.close();stnt1.close();connects.close();}}
    catch (SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt.close();stnt1.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    jTextField1.setText("");jTextField2.setText("");jTextField3.setText("");jTextField4.setText("");jComboBox1.setSelectedItem("NONE");
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {java.awt.EventQueue.invokeLater(() -> {
    try {new purchase().setVisible(true);} catch (SQLException ex) {Logger.getLogger(purchase.class.getName()).log(Level.SEVERE, null, ex);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
