/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import javax.sql.rowset.CachedRowSet;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import java.util.List;
import javax.swing.event.*;
import javax.swing.event.TableModelListener;
/**
 *
 * @author levat_000
 */
public class Reports extends javax.swing.JFrame implements TableModelListener
{
 //String [] listModel ={ "Appetizers", "burgers", "Fries", "ect.."} ;
 private static final String DataBase = "org.sqlite.JDBC";
    private static final String JDBCThinger = "jdbc:sqlite:";
    private static String DBName = "E:\\411project\\Gouglersville-\\Gouglersville\\src\\Menu\\GouglersvilleMenu.db"; 
    Connection connect = null;
    Statement searchstatement = null;
    ListSelectionListener listSelectionListener;
    
    public static final int intKEYCOLUMN = 0;
    
    
    //{
    // @Override
    // public void valueChanged(ListSelectionEvent e) {
      //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     //}
 //};
//ResultSet rs;
    ResultSet rs; 
    DefaultListModel tableNames = new DefaultListModel();
    /**DefaultListModel dlmTables = new DefaultListModel();
     * Creates new form Reports
     */
    public Reports() {
        
       


        initComponents();
       startJlist();
       
tablelist.addListSelectionListener(listSelectionListener);

    }
    

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        all = new javax.swing.JCheckBox();
        stocked = new javax.swing.JCheckBox();
        sold = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablelist = new javax.swing.JList<String>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        startDate = new javax.swing.JFormattedTextField();
        endDate = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ReturntoMain = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Inventory Reporting ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Start Date (YYYY-MM-DD):");

        all.setText("Curent on Hand");

        stocked.setText("Depleted Reports");
        stocked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockedActionPerformed(evt);
            }
        });

        sold.setText("Inventory Reports");
        sold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldActionPerformed(evt);
            }
        });

        tablelist.setModel( tableNames);
        tablelist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tablelist);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setWheelScrollingEnabled(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Please make a selction of what item you would like to check inventory on: ");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(null);
        jScrollPane3.setViewportView(jTextArea1);

        startDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        endDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("End Date (YYYY-MM-DD):");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Run Report");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ReturntoMain.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ReturntoMain.setText("Return to Main Menu");
        ReturntoMain.setBorder(null);
        ReturntoMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturntoMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startDate)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(270, 270, 270)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(382, 382, 382)
                                        .addComponent(sold))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(all)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(stocked)))))
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252)
                .addComponent(ReturntoMain, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sold)
                    .addComponent(all)
                    .addComponent(stocked))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ReturntoMain, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

       
        

    private void ReturntoMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturntoMainActionPerformed
          
          MainFrame MF = new MainFrame();
          MF.main(null);

    }//GEN-LAST:event_ReturntoMainActionPerformed

    public void startJlist()
{

try
{

connectBook();
DatabaseMetaData meta = connect.getMetaData();
ResultSet res = meta.getTables(null, null, "%",
new String[] {"TABLE"});
while (res.next())
{
tableNames.addElement(res.getString("TABLE_NAME"));
}
res.close();
                                        
 } 
     catch (SQLException ex)
     {
             Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
         }
    tablelist.addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent e) {
            if (e.getValueIsAdjusting()){
            final List<String> selectedValuesList;
                selectedValuesList = tablelist.getSelectedValuesList();
           fillTableSelected();
        
        }
        }
    });
  
    
    }
    public void connectBook()
{
     try {
Class.forName(DataBase);
connect = DriverManager.getConnection(JDBCThinger + DBName);
searchstatement = connect.createStatement();
     }
  catch(SQLException e)
    {
    }    catch (ClassNotFoundException ex) {
             Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
         }
}
    
public void closeConnect ()
{
         try {
               rs.close();
              // res.close();
             searchstatement.close();
             connect.close();
         } catch (SQLException ex) {
             Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
         }
}
 private void createNewTableModel()  {
    table.setModel(DbUtils.resultSetToTableModel(rs));
  }

 public void fillTableSelected ()
 {try {
             
String selected = tablelist.getSelectedValue();

           ResultSet rs = searchstatement.executeQuery("SELECT * from " + selected );
                  // + "Select column 1, column 2, column 3, column 4 from " + selected);
                              
             table.setModel(DbUtils.resultSetToTableModel(rs));
             table.getModel().addTableModelListener(this);
             while ( rs.next() ) {
                 

                 int count = rs.getInt("count");
                 String  Burger_ID = rs.getString("Burger_ID");
                 
                
                 
                 closeConnect();
                 
                 
                 
             }        
                 
                 
        
    //}                                        
         } catch (SQLException ex) {
             Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
         }
 }
 
    private void soldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldActionPerformed
        String fromDate = startDate.getText();
        String toDate = endDate.getText();
        if (endDate.getText().equals("") )
            {
                toDate=fromDate;
        System.out.println(toDate + fromDate);
            }
        try {
             
//String selected = tablelist.getSelectedValue();

           ResultSet rs = searchstatement.executeQuery("SELECT * FROM Truck_In WHERE   Date >= '" + fromDate +"' AND Date   <= '" + toDate+ "'");
                              
             table.setModel(DbUtils.resultSetToTableModel(rs));
             
             while ( rs.next() ) {
                 

                 int count = rs.getInt("count");
                 String  Burger_ID = rs.getString("Burger_ID");
                 
                
                 
                 closeConnect();
                 
                 
                 
             }        
                 
                 
        
    //}                                        
         } catch (SQLException ex) {
             Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_soldActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//          try {
//            rs.acceptChanges();
//          } 
//          catch (SQLException sqle) {
//            
//              // Now revert back changes
//              createNewTableModel();
//          }
//        
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void stockedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReturntoMain;
    private javax.swing.JCheckBox all;
    private javax.swing.JFormattedTextField endDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox sold;
    private javax.swing.JFormattedTextField startDate;
    private javax.swing.JCheckBox stocked;
    private javax.swing.JTable table;
    private javax.swing.JList<String> tablelist;
    // End of variables declaration//GEN-END:variables

    @Override
    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();  
        int column = e.getColumn();  
        TableModel model = (TableModel)e.getSource();  
        String strKey = (String) model.getValueAt(row, intKEYCOLUMN);
        Object data = model.getValueAt(row, column);  
        System.out.println("key = " + strKey + "   data = " + data);
  
            
     try {
         int it = searchstatement.executeUpdate("UPDATE BURGERS SET ONHAND =" +data+ " WHERE BURGER_ID ='"+ strKey+ "';");
     } catch (SQLException ex) {
         Logger.getLogger(Reports.class.getName()).log(Level.SEVERE, null, ex);
     }
            

//            ResultSet rs = stmt.executeQuery( 
//            "select price, title from titles where title like '%Visual Basic%';" );
//
//            while ( rs.next() ) {
//                String  title = rs.getString("title");
//                int price = rs.getInt("price");
//               
//                jTextArea1.append("    title = " + title+ "    price = " + price+  "\n");
//            }
//            rs.close();
//            stmt.close();
//            c.close();UPDATE Burgers
//  SET OnHand = data
//  WHERE EMPNO = strKey;
    }
}
