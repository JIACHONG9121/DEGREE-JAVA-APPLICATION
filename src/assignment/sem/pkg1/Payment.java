/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.sem.pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author jiach
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        String filePathCus = "Appointment.txt";
        File file = new File(filePathCus);
        
        
        try {
            FileReader fr = new FileReader(file); // reads characters from a file
            BufferedReader br = new BufferedReader(fr); // reads characters from another Reader
            
            DefaultTableModel model = (DefaultTableModel)tblapp.getModel();
            Object[] lines = br.lines().toArray();
            
            
            for(int i = 0; i<lines.length; i++){
                String[] row = lines[i].toString().split("///");
                model.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        
    }
        String filepayment = "Payment.txt";
        File M = new File(filepayment);
        try {
            FileReader fr = new FileReader(filepayment); // reads characters from a file
            BufferedReader br = new BufferedReader(fr); // reads characters from another Reader
            
            DefaultTableModel model = (DefaultTableModel)tblpay.getModel();
            Object[] lines = br.lines().toArray();
            
            
            for(int i = 0; i<lines.length; i++){
                String[] row = lines[i].toString().split("///");
                model.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        
    }
        
                showdate();
                showtime();
                Appointtxt.setEnabled(false);
                Techname.setEnabled(false);
                Cnametxt.setEnabled(false);
                Cnumtxt.setEnabled(false);
                Addresstxt.setEnabled(false);
                Modify.setEnabled(false);
                txtappoint.setEnabled(false);
                PaytName.setEnabled(false);
                PaymentID.setEnabled(false);

                
                
                
    }
        public void filter1 (String query){
        DefaultTableModel tb;
        tb = (DefaultTableModel) tblapp.getModel();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(tb);
        tblapp.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(query));
    

      
    }
        public void filter2 (String query){
        DefaultTableModel tb;
        tb = (DefaultTableModel) tblpay.getModel();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(tb);
        tblpay.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(query));
        }
        
    void showdate(){
       Date date = new Date();
       SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
       ExDate.setText(s.format(date));
    }
    void showtime(){
        new javax.swing.Timer(0, new ActionListener() {

            @Override//  define a behavior that's specific to the subclass type
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                ExTime.setText(s.format(date));
            }
            
        }).start();
        
        String filepayment = "Payment.txt";

        try {
            FileReader fr = new FileReader(filepayment); // reads characters from a file
            BufferedReader br = new BufferedReader(fr); // reads characters from another Reader

            DefaultTableModel model = (DefaultTableModel) tblpay.getModel();
            Object[] lines = br.lines().toArray();
            model.setRowCount(0);
            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split("///");
                model.addRow(row);
            }
            
            int newID = model.getRowCount() + 1;
            PaymentID.setText("Pay"+Integer.toString(newID));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        
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
        jLabel8 = new javax.swing.JLabel();
        lblimage2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Modify = new javax.swing.JButton();
        ExDate = new javax.swing.JLabel();
        ExTime = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblapp = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Payment = new javax.swing.JTextField();
        PaymentID = new javax.swing.JTextField();
        clearapp = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Appointtxt = new javax.swing.JTextField();
        PaytName = new javax.swing.JTextField();
        Feedback = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtappoint = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Techname = new javax.swing.JTextField();
        CreatePayment = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cnametxt = new javax.swing.JTextField();
        clearpay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblpay = new javax.swing.JTable();
        Cnumtxt = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Addresstxt = new javax.swing.JTextArea();
        txtDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("✺");

        lblimage2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblimage2.setForeground(new java.awt.Color(255, 255, 255));
        lblimage2.setText("APU Hostel Appliances Service Centre");

        jLabel9.setBackground(new java.awt.Color(0, 204, 204));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblimage2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblimage2)))
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Modify.setBackground(new java.awt.Color(0, 204, 204));
        Modify.setText("Modify");
        Modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ModifyMouseReleased(evt);
            }
        });
        Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyActionPerformed(evt);
            }
        });

        ExDate.setText("Date");

        ExTime.setText("Time");

        jLabel13.setText("PaymentID");

        tblapp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Technician Name", "Customer Name", "Customer Contact Number", "Customer Address", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblappMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblapp);

        jLabel7.setText("Status");

        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        Payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PaymentKeyTyped(evt);
            }
        });

        PaymentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentIDActionPerformed(evt);
            }
        });
        PaymentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PaymentIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PaymentIDKeyTyped(evt);
            }
        });

        clearapp.setBackground(new java.awt.Color(0, 204, 204));
        clearapp.setText("Clear");
        clearapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearappActionPerformed(evt);
            }
        });

        jLabel11.setText("Feedback");

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Appointment ID");

        jLabel4.setText("Customer Contact Number");

        jLabel12.setText("Technician Name");

        Techname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TechnameActionPerformed(evt);
            }
        });

        CreatePayment.setBackground(new java.awt.Color(0, 204, 204));
        CreatePayment.setText("Create Payment ");
        CreatePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatePaymentActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(0, 204, 204));
        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                UpdateMouseReleased(evt);
            }
        });
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jLabel3.setText("Customer Name");

        jLabel6.setText("Date ");

        clearpay.setBackground(new java.awt.Color(0, 204, 204));
        clearpay.setText("Clear");
        clearpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearpayActionPerformed(evt);
            }
        });

        tblpay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PaymentID", "Technician Name", "Appointment ID", "Paid", "Feedback", "Date", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblpay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblpay);

        jLabel2.setText("Technician Name");

        jLabel14.setText("Appointment ID");

        jLabel5.setText("Customer Address");

        jLabel10.setText("Pay Amount");

        Addresstxt.setColumns(20);
        Addresstxt.setRows(5);
        jScrollPane3.setViewportView(Addresstxt);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(265, 265, 265))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CreatePayment)
                                        .addGap(36, 36, 36)
                                        .addComponent(Modify))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addComponent(Update)
                                        .addGap(52, 52, 52)
                                        .addComponent(clearapp)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clearpay)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Feedback)
                                        .addComponent(txtappoint, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PaymentID, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Payment, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PaytName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Techname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Appointtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(Cnumtxt))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ExDate)
                        .addGap(81, 81, 81)
                        .addComponent(ExTime))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(218, 218, 218))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Appointtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Techname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearapp)
                            .addComponent(Update)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExTime)
                    .addComponent(ExDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PaymentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(PaytName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtappoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Feedback, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreatePayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Modify)
                                .addComponent(clearpay)))
                        .addGap(49, 49, 49)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseReleased

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void ModifyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifyMouseReleased

    }//GEN-LAST:event_ModifyMouseReleased

    private void ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyActionPerformed

        if(PaymentID.getText().equals("")||txtappoint.getText().equals("")||Payment.getText().equals("") || Feedback.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Please insert all data");
       }else{ 
       String g = PaymentID.getText() + "///" + PaytName.getText() + "///" +txtappoint.getText()+ "///" +Payment.getText()+ "///" + Feedback.getText() + "///" + ExDate.getText() + "///" + ExTime.getText();
       
        
       DefaultTableModel model = (DefaultTableModel)tblpay.getModel();
       model.getDataVector().removeAllElements();
       try {
            String TData = "Payment.txt";
            // input the file content to the StringBuffer "input"
            BufferedReader file = new BufferedReader(new FileReader(TData));
            StringBuffer inputBuffer = new StringBuffer();
            String line;
            String[] rowArr;

            while ((line = file.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            file.close();
            String inputStr = inputBuffer.toString();
            //clean txt file
            PrintWriter delete = new PrintWriter(TData);
            delete.close();
            // write txt file
            PrintWriter addNew = new PrintWriter(TData);
            // inputStr got all row
            rowArr = inputStr.split("[\n]");
            

            // save
            for (int i = 0; i < rowArr.length; i++) {

                String[] debug = null;
                debug = rowArr[i].split("///");
                for (int a = 0; a < debug.length; a++) {
                    if (debug[a].equals(PaymentID.getText())) {

                        addNew.println(g);
                        break;
                    }
                    addNew.println(rowArr[i]);
                }
            }
            addNew.close();
        } catch (Exception e) {
            System.out.println("Problem reading file.");
        }
        // remove duplicate row
        String tempRow = null;
        try {
            String TData = "Payment.txt";
            // input the file content to the StringBuffer "input"
            BufferedReader file = new BufferedReader(new FileReader(TData));
            StringBuffer inputBuffer = new StringBuffer();
            String line;
            String[] rowArr;

            while ((line = file.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            file.close();
            String inputStr = inputBuffer.toString();
            //clean txt file
            PrintWriter delete = new PrintWriter(TData);
            delete.close();
            // write txt file
            PrintWriter addNew = new PrintWriter(TData);

            rowArr = inputStr.split("[\n]");

            for (int i = 0; i < rowArr.length; i++) {
                if (!rowArr[i].equals(tempRow)) {
                    addNew.println(rowArr[i]);
                    tempRow = rowArr[i];
                }

            }
            addNew.close();
        } catch (Exception e) {
            System.out.println("Problem reading file.");
        }
        model.setRowCount(0);
        showMessageDialog(null, "Update successful");
        
        
        
         String filePathw  = "Payment.txt";
         File filew = new File(filePathw);
        try {
            FileReader fr = new FileReader(filew); // reads characters from a file
            BufferedReader br = new BufferedReader(fr); // reads characters from another Reader
            Object[] lines = br.lines().toArray();
            filter2(PaytName.getText());
            
            
            
            for(int i = 0; i<lines.length; i++){
                String[] row = lines[i].toString().split("///");
                model.addRow(row);
                
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        
    }
        String filepayment = "Payment.txt";

        try {
            FileReader fr = new FileReader(filepayment); // reads characters from a file
            BufferedReader br = new BufferedReader(fr); // reads characters from another Reader

            
            Object[] lines = br.lines().toArray();
            model.setRowCount(0);
            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split("///");
                model.addRow(row);
            }
            
            int newID = model.getRowCount() + 1;
            PaymentID.setText("Pay"+Integer.toString(newID));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);

        }

        txtappoint.setText("");
        Payment.setText("");
        Feedback.setText("");
        CreatePayment.setEnabled(true);
       }
        
    }//GEN-LAST:event_ModifyActionPerformed

    private void tblappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblappMouseClicked

        //set data to text field when row is slected

        String tb1Appointment= tblapp.getValueAt(tblapp.getSelectedRow(), 0). toString();
        String tb1Techname= tblapp.getValueAt(tblapp.getSelectedRow(), 1). toString();
        String tb1CustomerName= tblapp.getValueAt(tblapp.getSelectedRow(), 2). toString();
        String tb1CustomerContactNumber= tblapp.getValueAt(tblapp.getSelectedRow(), 3). toString();
        String tb1CustomerAddress= tblapp.getValueAt(tblapp.getSelectedRow(), 4). toString();
        Date tableDay;
        try {
            tableDay = new SimpleDateFormat("yyyy-MM-dd").parse((String)tblapp.getValueAt(tblapp.getSelectedRow(), 5));
            txtDate.setDate(tableDay);
        } catch (ParseException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
        String tblStatus = tblapp.getValueAt(tblapp.getSelectedRow(), 6). toString();

        Appointtxt.setText(tb1Appointment);
        Techname.setText(tb1Techname);
        Cnametxt.setText(tb1CustomerName);
        Cnumtxt.setText(tb1CustomerContactNumber);
        Addresstxt.setText(tb1CustomerAddress);
        txtstatus.setText(tblStatus);
        txtappoint.setText(tb1Appointment);
        PaytName.setText(tb1Techname);
    }//GEN-LAST:event_tblappMouseClicked

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed

    }//GEN-LAST:event_PaymentActionPerformed

    private void PaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaymentKeyTyped
        char v = evt.getKeyChar();

        if(!Character.isDigit(v)){
            evt.consume();
        }
    }//GEN-LAST:event_PaymentKeyTyped

    private void PaymentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentIDActionPerformed

    private void PaymentIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaymentIDKeyPressed

    }//GEN-LAST:event_PaymentIDKeyPressed

    private void PaymentIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaymentIDKeyTyped
        char v = evt.getKeyChar();

        if(!Character.isDigit(v)){
            evt.consume();
        }
    }//GEN-LAST:event_PaymentIDKeyTyped

    private void clearappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearappActionPerformed
        txtstatus.setText("");
        tblapp.clearSelection();
    }//GEN-LAST:event_clearappActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TechnicianPage z = new TechnicianPage();
        z.techName.setText(Techname.getText());
        z.techName.setText(PaytName.getText());
        this.setVisible(false);
        z.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TechnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TechnameActionPerformed

    }//GEN-LAST:event_TechnameActionPerformed

    private void CreatePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatePaymentActionPerformed
        String s = "";
        boolean exists = false;
        boolean max = false;
        if(PaymentID.getText().equals("")||txtappoint.getText().equals("")||Payment.getText().equals("") || Feedback.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please insert all data");
            txtappoint.setText("");
            Payment.setText("");
            Feedback.setText("");

        }else{
            for (int i = 0; i < tblpay.getRowCount(); i++) {
                s = tblpay.getValueAt(i, 0).toString().trim();
                //if any product name match then exit
                if (PaymentID.getText().equals(s)){
                    exists = true;
                    JOptionPane.showMessageDialog(null,"Payment ID Exist");
                    Payment.setText("");
                    Feedback.setText("");

                    break;
                }
            }
            //if none product name match
            if(exists == false && max == false){
                
                
                String data[] = {PaymentID.getText(),PaytName.getText(),txtappoint.getText(),Payment.getText(), Feedback.getText(), ExDate.getText(), ExTime.getText()};

                DefaultTableModel tb1model = (DefaultTableModel)tblpay.getModel();

                tb1model.addRow(data);

                JOptionPane.showMessageDialog(this, "Add data successfully");
                
                

            }
            String g =PaymentID.getText() + "///" + PaytName.getText() + "///" +txtappoint.getText()+ "///" +Payment.getText()+ "///" + Feedback.getText() + "///" + ExDate.getText() + "///" + ExTime.getText();
            try {

                File file = new File("Payment.txt");
                FileWriter fwv = new FileWriter(file, true);
                PrintWriter pwv = new PrintWriter(fwv);
       
                pwv.println(g);
                pwv.close();

            } catch (IOException ex) {
                Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            String filepayment = "Payment.txt";

        try {
            FileReader fr = new FileReader(filepayment); // reads characters from a file
            BufferedReader br = new BufferedReader(fr); // reads characters from another Reader

            DefaultTableModel model = (DefaultTableModel) tblpay.getModel();
            Object[] lines = br.lines().toArray();
            model.setRowCount(0);
            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split("///");
                model.addRow(row);
            }
            
            int newID = model.getRowCount() + 1;
            PaymentID.setText("Pay"+Integer.toString(newID));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);

        }
                
                txtappoint.setText("");
                Payment.setText("");
                Feedback.setText("");
        }
                
    }//GEN-LAST:event_CreatePaymentActionPerformed

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked

    }//GEN-LAST:event_UpdateMouseClicked

    private void UpdateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseReleased

    }//GEN-LAST:event_UpdateMouseReleased

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        if(txtstatus.getText().equals("")){
           JOptionPane.showMessageDialog(this,"Please insert status");
       }else{
        
       
        SimpleDateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
        String date = datef.format(txtDate.getDate());
        String g = Appointtxt.getText() + "///" + Techname.getText() + "///" +Cnametxt.getText()+ "///" +Cnumtxt.getText()+ "///" + Addresstxt.getText() + "///" + date + "///" + txtstatus.getText();

        
       DefaultTableModel model = (DefaultTableModel)tblapp.getModel();
       model.getDataVector().removeAllElements();
       try {
            String TData = "Appointment.txt";
            // input the file content to the StringBuffer "input"
            BufferedReader file = new BufferedReader(new FileReader(TData));
            StringBuffer inputBuffer = new StringBuffer();
            String line;
            String[] rowArr;

            while ((line = file.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            file.close();
            String inputStr = inputBuffer.toString();
            //clean txt file
            PrintWriter delete = new PrintWriter(TData);
            delete.close();
            // write txt file
            PrintWriter addNew = new PrintWriter(TData);
            // inputStr got all row
            rowArr = inputStr.split("[\n]");
            

            // save
            for (int i = 0; i < rowArr.length; i++) {

                String[] debug = null;
                debug = rowArr[i].split("///");
                for (int a = 0; a < debug.length; a++) {
                    if (debug[a].equals(Appointtxt.getText())) {

                        addNew.println(g);
                        break;
                    }
                    addNew.println(rowArr[i]);
                }
            }
            addNew.close();
        } catch (Exception e) {
            System.out.println("Problem reading file.");
        }
        // remove duplicate row
        String tempRow = null;
        try {
            String TData = "Appointment.txt";
            // input the file content to the StringBuffer "input"
            BufferedReader file = new BufferedReader(new FileReader(TData));
            StringBuffer inputBuffer = new StringBuffer();
            String line;
            String[] rowArr;

            while ((line = file.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            file.close();
            String inputStr = inputBuffer.toString();
            //clean txt file
            PrintWriter delete = new PrintWriter(TData);
            delete.close();
            // write txt file
            PrintWriter addNew = new PrintWriter(TData);

            rowArr = inputStr.split("[\n]");

            for (int i = 0; i < rowArr.length; i++) {
                if (!rowArr[i].equals(tempRow)) {
                    addNew.println(rowArr[i]);
                    tempRow = rowArr[i];
                }

            }
            addNew.close();
        } catch (Exception e) {
            System.out.println("Problem reading file.");
        }
        showMessageDialog(null, "Update successful");
        Appointtxt.setText("");
        Cnametxt.setText("");
        Cnumtxt.setText("");
        Addresstxt.setText("");
        txtstatus.setText("");

        
         String filePathw  = "Appointment.txt";
         File filew = new File(filePathw);
        try {
            FileReader fr = new FileReader(filew); // reads characters from a file
            BufferedReader br = new BufferedReader(fr); // reads characters from another Reader
            Object[] lines = br.lines().toArray();
            filter1(Techname.getText());
            
            for(int i = 0; i<lines.length; i++){

                String[] row = lines[i].toString().split("///");
                model.addRow(row);
                
                
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        
    }
       }
    }//GEN-LAST:event_UpdateActionPerformed

    private void clearpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearpayActionPerformed
        PaymentID.setText("");
        txtappoint.setText("");
        Payment.setText("");
        Feedback.setText("");
        CreatePayment.setEnabled(true);
        Modify.setEnabled(false);
        tblpay.clearSelection();
        PaymentID.setEnabled(false);
        
        
    }//GEN-LAST:event_clearpayActionPerformed

    private void tblpayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpayMouseClicked

        //set data to text field when raw is slected

        String tb1PayamentID= tblpay.getValueAt(tblpay.getSelectedRow(), 0). toString();
        String tb1PayTname= tblpay.getValueAt(tblpay.getSelectedRow(), 1). toString();
        String tb1appoint= tblpay.getValueAt(tblpay.getSelectedRow(), 2). toString();
        String tb1payment= tblpay.getValueAt(tblpay.getSelectedRow(), 3). toString();
        String tb1feedback= tblpay.getValueAt(tblpay.getSelectedRow(), 4). toString();

        PaymentID.setText(tb1PayamentID);
        PaytName.setText(tb1PayTname);
        txtappoint.setText(tb1appoint);
        Payment.setText(tb1payment);
        Feedback.setText(tb1feedback);
        PaymentID.setEnabled(false);
        CreatePayment.setEnabled(false);
        Modify.setEnabled(true);
        clearpay.setEnabled(true);
        
    }//GEN-LAST:event_tblpayMouseClicked

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Addresstxt;
    private javax.swing.JTextField Appointtxt;
    private javax.swing.JTextField Cnametxt;
    private javax.swing.JTextField Cnumtxt;
    private javax.swing.JButton CreatePayment;
    private javax.swing.JLabel ExDate;
    private javax.swing.JLabel ExTime;
    private javax.swing.JTextField Feedback;
    private javax.swing.JButton Modify;
    private javax.swing.JTextField Payment;
    private javax.swing.JTextField PaymentID;
    public javax.swing.JTextField PaytName;
    public javax.swing.JTextField Techname;
    private javax.swing.JButton Update;
    private javax.swing.JButton clearapp;
    private javax.swing.JButton clearpay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblimage2;
    private javax.swing.JTable tblapp;
    private javax.swing.JTable tblpay;
    private com.toedter.calendar.JDateChooser txtDate;
    public javax.swing.JTextField txtappoint;
    private javax.swing.JTextField txtstatus;
    // End of variables declaration//GEN-END:variables
}
