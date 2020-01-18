import com.mysql.jdbc.Connection;import com.mysql.jdbc.PreparedStatement;import com.mysql.jdbc.Statement;import java.awt.HeadlessException;
import java.sql.DriverManager;import java.sql.ResultSet;import java.sql.SQLException;import java.util.ArrayList;
import java.util.logging.Level;import java.util.logging.Logger;import javax.swing.JOptionPane;import javax.swing.table.DefaultTableModel;

public class msales extends javax.swing.JFrame {
String JDBC_Driver="com.mysql.jdbc.Driver";String dburl ="jdbc:mysql://localhost:3306/farm?zeroDateTimeBehavior=convertToNull";
Connection connects=(Connection) DriverManager.getConnection(dburl, "root", "");PreparedStatement stnt=null;
Statement stnt1=(Statement) connects.createStatement();ResultSet rs=null;

    public msales() throws SQLException {initComponents();show_user();}

public ArrayList<User6> userList() throws SQLException{ArrayList<User6> userList=new ArrayList<>();
try{Class.forName("com.mysql.jdbc.Driver");rs=stnt1.executeQuery("SELECT * FROM sales");User6 user;
while (rs.next()){user= new User6(rs.getInt("refno"),rs.getString("name"),rs.getInt("quantity"),rs.getInt("cost"),
rs.getInt("totalday"), rs.getInt("totalmonth"),rs.getString("month"), rs.getInt("year"));userList.add(user);}} 
catch (ClassNotFoundException | SQLException e) {JOptionPane.showMessageDialog(null, e);}return userList;}
    
    
    
    public void show_user() throws SQLException{ ArrayList<User6> list = userList();
    DefaultTableModel model= (DefaultTableModel) jTable2.getModel();Object [] row = new Object [8];
    for (int i=0; i<list.size();i++){row[0]=list.get(i).getrefno(); row[1]=list.get(i).getname();
    row[2]=list.get(i).getquantity();row[3]=list.get(i).getcost();row[4]=list.get(i).gettotalday();
    row[5]=list.get(i).gettotalmonth();row[6]=list.get(i).getmonth();row[7]=list.get(i).getyear();model.addRow(row);}}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MILK SALES:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("REF. NO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("CUST. NAME:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("QUANTITY:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("COST:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("TOTAL PER DAY:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("MONTH:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("YEAR:");

        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("INVOICE");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel11.setText("choose from1-10000");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("TOTAL PER MONTH:");

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("CUSTOMER DETAILS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NONE");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("NONE");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("DAYS:");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel7)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton10)
                    .addComponent(jButton6))
                .addGap(54, 54, 54))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ref. No", "Name", "Quantity", "Cost", "Total per Day", "Total per Month", "Month", "Year"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu1.setText("MENU");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
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
        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu3.setText("MILK SALES");
        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu4.setText("PURCHASES");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
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
        jMenuBar1.add(jMenu5);

        jMenu6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu6.setText("PROFIT AND LOSS");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setText("DEBTORS AND CREDITORS");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{String refno=jTextField1.getText();String name=jTextField2.getText(); String quantity=jTextField3.getText();
    String cost=jTextField4.getText();String year=jTextField5.getText();String days=jTextField6.getText();
    String month=jComboBox1.getSelectedItem().toString();int a=Integer.parseInt(jTextField3.getText());int b=Integer.parseInt(jTextField4.getText());
    int c=a*b;int f=Integer.parseInt(jTextField6.getText());int d=c*f;String ans=String.valueOf(c);
    String answ=String.valueOf(d);jLabel4.setText(ans);jLabel9.setText(answ);
    try{ Class.forName("com.mysql.jdbc.Driver");} catch (ClassNotFoundException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Reference Number!");}
    else if (jTextField2.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Name!");}
    else if (jTextField3.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Quantity!");}
    else if (jTextField4.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Cost!");}
    else if (jTextField5.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if (jTextField6.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Days!");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month!");}
    else{rs=stnt1.executeQuery("SELECT * FROM farm.sales WHERE refno='"+refno+"' AND month='"+month+"' AND year='"+year+"'");
    if(rs.next()){JOptionPane.showMessageDialog(null, "Cannot add. The entry already exists.");}
    else{stnt=(PreparedStatement) connects.prepareStatement("INSERT INTO farm.sales(refno, name, quantity, days, cost, totalday, totalmonth, month, year) "
    + "VALUES('"+refno+"', '"+name+"', '"+quantity+"', days='"+days+"', '"+cost+"', '"+ans+"', '"+answ+"', '"+month+"', '"+year+"')");
    stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable2.getModel();model.setRowCount(0);show_user();}
    rs.close();stnt.close();stnt1.close();connects.close();}} 
    catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt.close();stnt1.close();connects.close();} 
    catch (SQLException ex) { Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
    menu frame=new menu();frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    mrecords frame = null;try {frame = new mrecords();} 
    catch (SQLException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
    purchase frame = null;try {frame = new purchase();} 
    catch (SQLException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
    other frame = null;try {frame = new other();} 
    catch (SQLException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
    profitloss frame = null;try {frame = new profitloss();} 
    catch (SQLException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
    debts frame = null;try {frame = new debts();} 
    catch (SQLException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{String refno=jTextField1.getText();String name=jTextField2.getText(); String quantity=jTextField3.getText();
    String cost=jTextField4.getText();String year=jTextField5.getText();String days=jTextField6.getText();
    String month=jComboBox1.getSelectedItem().toString();int a=Integer.parseInt(jTextField3.getText());int b=Integer.parseInt(jTextField4.getText());
    int c=a*b;int f=Integer.parseInt(jTextField6.getText());int d=c*f;String ans=String.valueOf(c);
    String answ=String.valueOf(d);jLabel4.setText(ans);jLabel9.setText(answ);
    try{ Class.forName("com.mysql.jdbc.Driver");} catch (ClassNotFoundException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Reference Number!");}
    else if (jTextField2.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Name!");}
    else if (jTextField3.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Quantity!");}
    else if (jTextField4.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Cost!");}
    else if (jTextField5.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if (jTextField6.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Days!");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month!");}
    else{rs=stnt1.executeQuery("SELECT * FROM farm.sales WHERE refno='"+refno+"' AND month='"+month+"' AND year='"+year+"'");
    if(rs.next()){stnt=(PreparedStatement) connects.prepareStatement("UPDATE sales SET name='"+name+"', quantity='"+quantity+"', days='"+days+"', "
    + "cost='"+cost+"', totalday='"+ans+"', totalmonth='"+answ+"'  WHERE refno='"+refno+"' AND month='"+month+"' AND year='"+year+"'");        
    stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable2.getModel();model.setRowCount(0);show_user();}
    else{JOptionPane.showMessageDialog(null, "Cannot Update. The entry doesn't exist.");}rs.close();stnt.close();stnt1.close(); connects.close();}} 
    catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt.close();stnt1.close(); connects.close();} 
    catch (SQLException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{String refno=jTextField1.getText();String year=jTextField5.getText();String month=jComboBox1.getSelectedItem().toString();
    try{ Class.forName("com.mysql.jdbc.Driver");} catch (ClassNotFoundException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Reference Number!");}
    else if (jTextField5.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month!");}
    else{rs=stnt1.executeQuery("SELECT * FROM farm.sales WHERE refno='"+refno+"' AND month='"+month+"' AND year='"+year+"'");
    if(rs.next()){String name=rs.getString("name");String quantity=rs.getString("quantity");String days=rs.getString("days");
    String cost=rs.getString("cost");String totalday=rs.getString("totalday");String totalmonth=rs.getString("totalmonth");
    JOptionPane.showMessageDialog(null, "Ref No:"+refno+". Name:"+name+". Quantity:"+quantity+".  Days:"+days+".  "
    + "Cost:"+cost+".  Total per Day:"+totalday+".  Total per Month:"+totalmonth+".  Month:"+month+".  Year:"+year+".");}
    else{JOptionPane.showMessageDialog(null, "Not Found!");}DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);show_user();}rs.close();stnt1.close();connects.close();} 
    catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt1.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{String refno=jTextField1.getText();String year=jTextField5.getText();String month=jComboBox1.getSelectedItem().toString();
    try{ Class.forName("com.mysql.jdbc.Driver");} catch (ClassNotFoundException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField1.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Reference Number!");}
    else if (jTextField5.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Year!");}
    else if (jComboBox1.getSelectedItem()=="NONE"){JOptionPane.showMessageDialog(null, "Please select Month!");}
    else{rs=stnt1.executeQuery("SELECT * FROM farm.sales WHERE refno='"+refno+"' AND month='"+month+"' AND year='"+year+"'");
    if(rs.next()){stnt=(PreparedStatement) connects.prepareStatement("DELETE FROM sales WHERE refno='"+refno+"' AND month='"+month+"' AND year='"+year+"'");
    stnt.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable2.getModel();model.setRowCount(0);show_user(); }           
    else{JOptionPane.showMessageDialog(null, "Cannot Delete. The entry doesn't exist!");}rs.close();stnt.close();stnt1.close();connects.close();}}
    catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt.close();stnt1.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    jTextField1.setText("");jTextField2.setText("");jTextField3.setText("");jTextField4.setText("");jTextField5.setText(""); 
    jTextField6.setText("");jLabel4.setText("0");jLabel9.setText("0");jComboBox1.setSelectedItem("NONE");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
    
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    customers frame = null;try {frame = new customers();} 
    catch (SQLException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    Invoices_table frame= new Invoices_table();frame.setVisible(true);this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed


    public static void main(String args[]) {java.awt.EventQueue.invokeLater(() -> {try {new msales().setVisible(true);} 
    catch (SQLException ex) {Logger.getLogger(msales.class.getName()).log(Level.SEVERE, null, ex);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
