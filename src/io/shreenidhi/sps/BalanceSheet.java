/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.shreenidhi.sps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class BalanceSheet extends javax.swing.JFrame {

    /**
     * Creates new form BalanceSheet
     */
    public BalanceSheet() {
        initComponents();
        fetch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Receipt = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TotTransactions = new javax.swing.JTextField();
        TotCustomers = new javax.swing.JTextField();
        TotBalance = new javax.swing.JTextField();
        WaitingBalance = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        rec = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TimeStamp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PaidCustomer = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Balance Transaction Details");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, null));

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Smart Parking System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        Receipt.setBackground(new java.awt.Color(204, 204, 204));
        Receipt.setBorder(javax.swing.BorderFactory.createTitledBorder("Balance Transaction"));

        jLabel2.setText("Total Number of Transaction   :-");

        jLabel3.setText("Total Number of Customers    :-");

        jLabel4.setText("Total  Credited Balance           :-");

        jLabel5.setText("No of Due Customers             :-");

        TotTransactions.setEditable(false);
        TotTransactions.setBackground(new java.awt.Color(204, 204, 204));

        TotCustomers.setEditable(false);
        TotCustomers.setBackground(new java.awt.Color(204, 204, 204));

        TotBalance.setEditable(false);
        TotBalance.setBackground(new java.awt.Color(204, 204, 204));

        WaitingBalance.setEditable(false);
        WaitingBalance.setBackground(new java.awt.Color(204, 204, 204));

        rec.setColumns(20);
        rec.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rec.setRows(5);
        jScrollPane1.setViewportView(rec);

        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Time Stamp     :");

        TimeStamp.setEditable(false);
        TimeStamp.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setText("No of Fee Paid Customers       :-");

        PaidCustomer.setEditable(false);
        PaidCustomer.setBackground(new java.awt.Color(204, 204, 204));

        jButton2.setText("     Get Details to Print Area    ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReceiptLayout = new javax.swing.GroupLayout(Receipt);
        Receipt.setLayout(ReceiptLayout);
        ReceiptLayout.setHorizontalGroup(
            ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(ReceiptLayout.createSequentialGroup()
                .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReceiptLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReceiptLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))))
                        .addGap(93, 93, 93)
                        .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TotTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(TotCustomers)
                            .addComponent(TotBalance)
                            .addComponent(WaitingBalance)
                            .addComponent(PaidCustomer)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReceiptLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReceiptLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReceiptLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(227, 227, 227))
        );
        ReceiptLayout.setVerticalGroup(
            ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReceiptLayout.createSequentialGroup()
                .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimeStamp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TotTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TotCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TotBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(WaitingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PaidCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Receipt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Receipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fetch()
    {java.util.Date date = new java.util.Date();
    Timestamp timestamp1 = new Timestamp(date.getTime());
 
     // create a calendar and assign it the same time
    Calendar cal = Calendar.getInstance();
    cal.setTimeInMillis(timestamp1.getTime());
    
    TimeStamp.setText("           "+timestamp1);
       // System.out.println((timestamp1));
         try{
            RunMe mc=new RunMe();
            Connection connection;          
            connection=DriverManager.getConnection(mc.StrUrl,mc.StrUid,mc.StrPwd);
            ResultSet rs;
            String mem;
           // mem=USN.getText();
            PreparedStatement stmt;//=connection.prepareStatement("select BookCode from trans where MemId='"+mem+"'   and (trans.receivedt is null  or trans.receivedt='')");
            //rs = stmt.executeQuery();
           // while (rs.next()){
            //    BookList.addItem(rs.getString(1));
           // }
            stmt=connection.prepareStatement("select count(*) from transaction");
            rs = stmt.executeQuery();
            rs.first();
            int count=rs.getInt(1);
            TotTransactions.setText(""+count);
            rs.close();
            
             stmt=connection.prepareStatement("select DISTINCT COUNT(*) from transaction  ");
            rs = stmt.executeQuery();
            rs.first();
            count=rs.getInt(1);
            TotCustomers.setText(""+count);
            rs.close();
            
            stmt=connection.prepareStatement("select SUM(Amount) from transaction where transaction.Amount>0");
            rs = stmt.executeQuery();
            rs.first();
            count=rs.getInt(1);
            TotBalance.setText(""+count);
            rs.close();
            
            stmt=connection.prepareStatement("select  COUNT(*) from transaction where transaction.FeeStatus='"+"Pending"+"'  ");
            rs = stmt.executeQuery();
            rs.first();
            count=rs.getInt(1);
            WaitingBalance.setText(""+count);
            rs.close();
            
            stmt=connection.prepareStatement("select  COUNT(*) from transaction where transaction.FeeStatus='"+"Paid"+"'  ");
            rs = stmt.executeQuery();
            rs.first();
            count=rs.getInt(1);
            PaidCustomer.setText(""+count);
            rs.close();
            
            
        }catch(Exception e)
        {
             
            System.out.println(e);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         clear();
         fetch();
         rec.append("--------------------------Smart Parking System--------------------------\n");
         rec.append("Report Generated at :"+"    "+TimeStamp.getText()+"\n");
         rec.append("--------------------------------------------------------------------------------\n");
         rec.append(jLabel2.getText()+"    "+TotTransactions.getText()+"\n");
         rec.append(jLabel3.getText()+"    "+TotCustomers.getText()+"\n");
         rec.append(jLabel4.getText()+"    "+TotBalance.getText()+"\n");
         rec.append(jLabel5.getText()+"    "+WaitingBalance.getText()+"\n");
         rec.append(jLabel7.getText()+"    "+PaidCustomer.getText()+"\n");
         rec.append("\n\n\n\n\n\n\n \t\t\tSignature\n");
         rec.append("\n\t\t"+TimeStamp.getText()+"\n");
       
    }//GEN-LAST:event_jButton2ActionPerformed
public void clear()
{
    rec.setText(null);
}
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
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BalanceSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BalanceSheet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PaidCustomer;
    private javax.swing.JPanel Receipt;
    private javax.swing.JTextField TimeStamp;
    private javax.swing.JTextField TotBalance;
    private javax.swing.JTextField TotCustomers;
    private javax.swing.JTextField TotTransactions;
    private javax.swing.JTextField WaitingBalance;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea rec;
    // End of variables declaration//GEN-END:variables
}