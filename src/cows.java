import com.mysql.jdbc.Connection;import com.mysql.jdbc.PreparedStatement;import com.mysql.jdbc.Statement;import java.awt.HeadlessException;
import java.sql.DriverManager;import java.sql.ResultSet;import java.sql.SQLException;import java.util.ArrayList;
import java.util.logging.Level;import java.util.logging.Logger;import javax.swing.JOptionPane;import javax.swing.table.DefaultTableModel;

public class cows extends javax.swing.JFrame {
String JDBC_Driver="com.mysql.jdbc.Driver";String dburl ="jdbc:mysql://localhost:3306/farm?zeroDateTimeBehavior=convertToNull";
Connection connects=(Connection) DriverManager.getConnection(dburl, "root", "");PreparedStatement stnt1=null;Statement stnt=null;ResultSet rs=null;

    public cows() throws SQLException {        initComponents();        show_user();    }
    
    public ArrayList<User> userList() throws SQLException{ArrayList<User> userList=new ArrayList<>();
    try{  Class.forName("com.mysql.jdbc.Driver"); stnt=(Statement) connects.createStatement();rs=stnt.executeQuery("SELECT * FROM cows"); User user;
    while (rs.next()){ user= new User(rs.getInt("serialno"),rs.getString("name"));userList.add(user); rs.close();stnt.close();connects.close();}} 
    catch (ClassNotFoundException | SQLException e) { JOptionPane.showMessageDialog(null, e);rs.close();stnt.close();connects.close();} return userList;}
    
    
    
    public void show_user() throws SQLException{ ArrayList<User> list = userList();
        DefaultTableModel model= (DefaultTableModel) jTable2.getModel(); Object [] row = new Object [2];
        for (int i=0; i<list.size();i++){row[0]=list.get(i).getserialno();row[1]=list.get(i).getname();model.addRow(row);}}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "COW DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("SERIAL NO:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("COW NAME:");

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("UPDATE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("DELETE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("CLEAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("ADD");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel11.setText("choose from1-10000");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SERIAL NO", "COW NAME"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    try{String serial=jTextField6.getText(); String name=jTextField7.getText();
    try{Class.forName("com.mysql.jdbc.Driver");}catch (ClassNotFoundException ex) {Logger.getLogger(cows.class.getName()).log(Level.SEVERE, null, ex);}
    stnt=(Statement) connects.createStatement(); rs=stnt.executeQuery("SELECT * FROM cows WHERE serialno='"+serial+"' AND name='"+name+"'");
    if (rs.next()){JOptionPane.showMessageDialog(null, "Cannot Add. The entry already exist");}
    else{stnt1=(PreparedStatement) connects.prepareStatement("INSERT INTO cows(serialno, name) VALUES('"+serial+"', '"+name+"')");
    if (jTextField6.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Serial Number.");}
    else if(jTextField7.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Cow Name.");}
    else{stnt1.executeUpdate(); DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);show_user();rs.close();stnt.close();stnt1.close(); connects.close();}} }
    catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt.close();stnt1.close();connects.close();}catch (SQLException ex) {Logger.getLogger(cows.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextField6.setText("");jTextField7.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    try{String serial=jTextField6.getText();String name=jTextField7.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} catch (ClassNotFoundException ex) {Logger.getLogger(cows.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");
    stnt=(Statement) connects.createStatement(); rs=stnt.executeQuery("SELECT * FROM cows WHERE serialno='"+serial+"' AND name='"+name+"'");
    if (rs.next()){JOptionPane.showMessageDialog(null, "Cannot Add. The entry already exist");}
    stnt1=(PreparedStatement) connects.prepareStatement("DELETE FROM cows WHERE serialno='"+serial+"' AND name='"+name+"'");
    if (jTextField6.getText().length()==0){ JOptionPane.showMessageDialog(null, "Please enter Serial Number.");}
    else{stnt1.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);show_user();rs.close();stnt.close();stnt1.close(); connects.close();}}
    catch (SQLException | HeadlessException e){JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt.close();stnt1.close();connects.close();} catch (SQLException ex) {Logger.getLogger(cows.class.getName()).log(Level.SEVERE, null, ex);}}
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    try{String serial=jTextField6.getText();String name=jTextField7.getText();
    try{Class.forName("com.mysql.jdbc.Driver");} catch (ClassNotFoundException ex) {Logger.getLogger(cows.class.getName()).log(Level.SEVERE, null, ex);}
    connects=(Connection) DriverManager.getConnection(dburl, "root", "");stnt=(Statement) connects.createStatement(); 
    rs=stnt.executeQuery("SELECT * FROM cows WHERE serialno='"+serial+"' AND name='"+name+"'");
    if (rs.next()){stnt1=(PreparedStatement) connects.prepareStatement("UPDATE farm.cows SET name='"+name+"' WHERE serialno='"+serial+"'");
    if (jTextField6.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Serial Number.");}
    else if (jTextField7.getText().length()==0){JOptionPane.showMessageDialog(null, "Please enter Cows Name.");}
    else{stnt1.executeUpdate();DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
    model.setRowCount(0);show_user();rs.close();stnt.close();stnt1.close(); connects.close();}}
    else{JOptionPane.showMessageDialog(null, "Cannot Add. The entry doesn't exist");}} 
    catch (SQLException | HeadlessException e) {JOptionPane.showMessageDialog(null, e.getMessage());
    try {rs.close();stnt.close();stnt1.close();connects.close();} catch (SQLException ex) {Logger.getLogger(cows.class.getName()).log(Level.SEVERE, null, ex);}
}
    }//GEN-LAST:event_jButton6ActionPerformed
    public static void main(String args[]) {java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {try {new cows().setVisible(true);} 
    catch (SQLException ex) {Logger.getLogger(cows.class.getName()).log(Level.SEVERE, null, ex);}}});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
