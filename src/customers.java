import com.mysql.jdbc.Connection;import com.mysql.jdbc.PreparedStatement;import com.mysql.jdbc.Statement;import java.awt.HeadlessException;
import java.sql.DriverManager;import java.sql.ResultSet;import java.sql.SQLException;import java.util.ArrayList;
import java.util.logging.Level;import java.util.logging.Logger;import javax.swing.JOptionPane;import javax.swing.table.DefaultTableModel;

public class customers extends javax.swing.JFrame {
String JDBC_Driver="com.mysql.jdbc.Driver";String dburl ="jdbc:mysql://localhost:3306/farm?zeroDateTimeBehavior=convertToNull";
Connection connects=(Connection) DriverManager.getConnection(dburl, "root", "");PreparedStatement stnt1=null;Statement stnt=null;ResultSet rs=null;

    public customers() throws SQLException {initComponents();show_user();}
    public ArrayList<User8> userList() throws SQLException{ ArrayList<User8> userList=new ArrayList<>();
    try{Class.forName("com.mysql.jdbc.Driver");stnt=(Statement) connects.createStatement();
    rs=stnt.executeQuery("SELECT * FROM customers"); User8 user;
    while (rs.next()){user= new User8(rs.getInt("refno"),rs.getString("name"),rs.getInt("quantity"));userList.add(user);}} 
    catch (ClassNotFoundException | SQLException e) {JOptionPane.showMessageDialog(null, e);}return userList;}
    
    
    
    public void show_user() throws SQLException{ArrayList<User8> list = userList();
    DefaultTableModel model= (DefaultTableModel) jTable1.getModel();Object [] row = new Object [3];
    for (int i=0; i<list.size();i++){row[0]=list.get(i).getserialno();row[1]=list.get(i).getname();row[2]=list.get(i).getquantity();model.addRow(row);}}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUSTOMER:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 24))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("REF. NO:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("CUST. NAME:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("QUANTITY:");

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("ADD");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("UPDATE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("DELETE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("CLEAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ref. No", "Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton8)
                    .addComponent(jButton7)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    try{String refno=jTextField7.getText();String name=jTextField8.getText();String quantity=jTextField9.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);}
    if (jTextField7.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Reference Number.");}
    else if (jTextField8.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Customer Name.");}
    else if (jTextField9.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Quantity.");}
    else{stnt=(Statement) connects.createStatement();rs=stnt.executeQuery("SELECT * FROM customers WHERE refno='"+refno+"' AND name='"+name+"'");
    if (rs.next()){JOptionPane.showMessageDialog(null, "Cannot Add. The entry already exist.");}
    else{stnt1=(PreparedStatement) connects.prepareStatement("INSERT INTO farm.customers(refno, name, quantity) VALUES('"+refno+"', '"+name+"', '"+quantity+"')");
    stnt1.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable1.getModel();model.setRowCount(0);show_user();}
    rs.close();stnt.close();stnt1.close();connects.close();} }
    catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt.close();stnt1.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    try{String refno=jTextField7.getText();String name=jTextField8.getText();String quantity=jTextField9.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);}
    stnt=(Statement) connects.createStatement();rs=stnt.executeQuery("SELECT * FROM customers WHERE refno='"+refno+"' AND name='"+name+"'");
    if (jTextField7.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Reference Number.");}
    else if (jTextField8.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Customer Name.");}
    else if (jTextField9.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Quantity.");}
    else{if (rs.next()){
    stnt1=(PreparedStatement) connects.prepareStatement("UPDATE farm.customers SET name='"+name+"', quantity='"+quantity+"' WHERE refno='"+refno+"'");
    stnt1.executeUpdate();}else{JOptionPane.showMessageDialog(null, "Cannot Update The entry doesn't exist."); 
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
    model.setRowCount(0);show_user();rs.close();stnt.close();stnt1.close();connects.close();}}} 
    catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt.close();stnt1.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    try{String refno=jTextField7.getText();String name=jTextField8.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} 
    catch (ClassNotFoundException ex) {Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);}
    stnt=(Statement) connects.createStatement();rs=stnt.executeQuery("SELECT * FROM customers WHERE refno='"+refno+"' AND name='"+name+"'");
    if (jTextField7.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Reference Number.");}
    else if (jTextField8.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Customer Name.");}
    else{if (rs.next()){
    stnt1=(PreparedStatement) connects.prepareStatement("DELETE FROM customers WHERE refno='"+refno+"' AND name='"+name+"'");
    stnt1.executeUpdate();}else{JOptionPane.showMessageDialog(null, "Cannot Update The entry doesn't exist."); }
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); 
    model.setRowCount(0);show_user();rs.close();stnt.close();stnt1.close();connects.close();}}
    catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt.close();stnt1.close();connects.close();} 
    catch (SQLException ex) {Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    jTextField7.setText("");jTextField8.setText("");jTextField9.setText("");
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {java.awt.EventQueue.invokeLater(() -> {
    try {new customers().setVisible(true);} catch (SQLException ex) {Logger.getLogger(customers.class.getName()).log(Level.SEVERE, null, ex);}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
