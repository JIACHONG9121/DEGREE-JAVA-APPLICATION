/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignment.sem.pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;




/**
 *
 * @author bouoron
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() throws FileNotFoundException{
       initComponents();
        
       jScrollPane1.setVisible(false);
       jScrollPane6.setVisible(false);
       jScrollPane7.setVisible(false);
       jScrollPane8.setVisible(false);
       jScrollPane9.setVisible(false);
       jScrollPane10.setVisible(false);
       jScrollPane11.setVisible(false);
       jScrollPane12.setVisible(false);
       jScrollPane13.setVisible(false);
       jScrollPane14.setVisible(false);
       jScrollPane15.setVisible(false);
       
       File file = new File("Appointment.txt");
       File fileCus = new File("Customer.txt");
       File fileTech = new File("Technician.txt");
       File fileManager = new File("Manager.txt");
       File filePayment = new File("Payment.txt");
  
       String searchCustomerMale = "Male";
       filterCustomerMale(searchCustomerMale);
       
       String searchCustomerFeMale = "Female";
       filterCustomerFemale(searchCustomerFeMale);
       
       String searchtechMale = "Male";
       filtertechmale(searchtechMale);
       
       String searchtechfeMale = "Female";
       filtertechFemale(searchtechfeMale);
       
       String searchmanMale = "Male";
       filtermanmale(searchmanMale);
       
       String searchmanfeMale = "Female";
       filtermanFemale(searchmanfeMale);
       
       String searchDone = "Done";
       filterDone(searchDone);
       
       String searchPending = "Pending";
       filterPending(searchPending);
       
       String searchCanceled = "Canceled";
       filterCanceled(searchCanceled);
       
       
       
       try {
            FileReader read = new FileReader(filePayment);
            BufferedReader buffread = new BufferedReader(read);
            
            DefaultTableModel tablemode = (DefaultTableModel)tablepayment.getModel();
            Object[] lines = buffread.lines().toArray();
            
            for(int i =0; i < lines.length; i++){
                String[] row = lines[i].toString().split("///");
                tablemode.addRow(row);
            }
            
        lbltotalpaid.setText(Integer.toString(getTotal()));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       try {
            FileReader read = new FileReader(fileCus);
            BufferedReader buffread = new BufferedReader(read);
            
            DefaultTableModel tablemode = (DefaultTableModel)tableCus.getModel();
            Object[] lines = buffread.lines().toArray();
            
            for(int i =0; i < lines.length; i++){
                String[] row = lines[i].toString().split("///");
                tablemode.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       lblmale.setText(Integer.toString(+tableCus.getRowCount()));
       
        try {
            FileReader read = new FileReader(fileCus);
            BufferedReader buffread = new BufferedReader(read);
            
            DefaultTableModel tablemode = (DefaultTableModel)tableCusF.getModel();
            Object[] lines = buffread.lines().toArray();
            
            for(int i =0; i < lines.length; i++){
                String[] row = lines[i].toString().split("///");
                tablemode.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       lblCfemale.setText(Integer.toString(+tableCusF.getRowCount()));
       
       try {
            FileReader read = new FileReader(fileTech);
            BufferedReader buffread = new BufferedReader(read);
            
            DefaultTableModel tablemode = (DefaultTableModel)tabletechmale.getModel();
            Object[] lines = buffread.lines().toArray();
            
            for(int i =0; i < lines.length; i++){
                String[] row = lines[i].toString().split("///");
                tablemode.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       lblTmale.setText(Integer.toString(+tabletechmale.getRowCount()));
       
       try {
            FileReader read = new FileReader(fileTech);
            BufferedReader buffread = new BufferedReader(read);
            
            DefaultTableModel tablemode = (DefaultTableModel)tabletechfemale.getModel();
            Object[] lines = buffread.lines().toArray();
            
            for(int i =0; i < lines.length; i++){
                String[] row = lines[i].toString().split("///");
                tablemode.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       lblTfemale.setText(Integer.toString(+tabletechfemale.getRowCount()));
       
       try {
            FileReader read = new FileReader(fileManager);
            BufferedReader buffread = new BufferedReader(read);
            
            DefaultTableModel tablemode = (DefaultTableModel)tablemanmale.getModel();
            Object[] lines = buffread.lines().toArray();
            
            for(int i =0; i < lines.length; i++){
                String[] row = lines[i].toString().split("///");
                tablemode.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       lblMmale.setText(Integer.toString(+tablemanmale.getRowCount()));
       
       try {
            FileReader read = new FileReader(fileManager);
            BufferedReader buffread = new BufferedReader(read);
            
            DefaultTableModel tablemode = (DefaultTableModel)tablemanfemale.getModel();
            Object[] lines = buffread.lines().toArray();
            
            for(int i =0; i < lines.length; i++){
                String[] row = lines[i].toString().split("///");
                tablemode.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       lblMfemale.setText(Integer.toString(+tablemanfemale.getRowCount()));
       
       try {
            FileReader read = new FileReader(file);
            BufferedReader buffread = new BufferedReader(read);
            
            DefaultTableModel tablemode = (DefaultTableModel)tableCanceled.getModel();
            Object[] lines = buffread.lines().toArray();
            
            for(int i =0; i < lines.length; i++){
                String[] row = lines[i].toString().split("///");
                tablemode.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       lblcanceled.setText(Integer.toString(+tableCanceled.getRowCount()));
       
       try {
            FileReader read = new FileReader(file);
            BufferedReader buffread = new BufferedReader(read);
            
            DefaultTableModel tablemode = (DefaultTableModel)tablePending.getModel();
            Object[] lines = buffread.lines().toArray();
            
            for(int i =0; i < lines.length; i++){
                String[] row = lines[i].toString().split("///");
                tablemode.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       lblpending.setText(Integer.toString(+tablePending.getRowCount()));
       
       try {
            FileReader read = new FileReader(file);
            BufferedReader buffread = new BufferedReader(read);
            
            DefaultTableModel tablemode = (DefaultTableModel)tableDone.getModel();
            Object[] lines = buffread.lines().toArray();
            
            for(int i =0; i < lines.length; i++){
                String[] row = lines[i].toString().split("///");
                tablemode.addRow(row);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       lbldone.setText(Integer.toString(+tableDone.getRowCount()));
       
        if(file.exists()){
            try {
                FileReader fr = new FileReader(file);
                LineNumberReader lr = new LineNumberReader(fr);
                int lineNumberCount = 0;
                try {
                    while(lr.readLine()!=null){
                        lineNumberCount++; 
                    } 
                    
                    lblapp.setText(Integer.toString(+lineNumberCount));
                } catch (IOException ex) {
                    Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(file.exists()){
            try {
                FileReader frC = new FileReader(fileCus);
                LineNumberReader lrc = new LineNumberReader(frC);
                int lineNumberCount = 0;
                try {
                    while(lrc.readLine()!=null){
                        lineNumberCount++; 
                    } 
                    
                    lblcus.setText(Integer.toString(+lineNumberCount));
                } catch (IOException ex) {
                    Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(file.exists()){
            try {
                FileReader frt = new FileReader(fileTech);
                LineNumberReader lrt = new LineNumberReader(frt);
                int lineNumberCount = 0;
                try {
                    while(lrt.readLine()!=null){
                        lineNumberCount++; 
                    } 
                    
                    lbltechnum.setText(Integer.toString(+lineNumberCount));
                } catch (IOException ex) {
                    Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(file.exists()){
            try {
                FileReader frm = new FileReader(fileManager);
                LineNumberReader lrm = new LineNumberReader(frm);
                int lineNumberCount = 0;
                try {
                    while(lrm.readLine()!=null){
                        lineNumberCount++; 
                    } 
                    
                    lblmanager.setText(Integer.toString(+lineNumberCount));
                } catch (IOException ex) {
                    Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(file.exists()){
            try {
                FileReader frp = new FileReader(filePayment);
                LineNumberReader lrp = new LineNumberReader(frp);
                int lineNumberCount = 0;
                try {
                    while(lrp.readLine()!=null){
                        lineNumberCount++; 
                    } 
                    
                    lblpayment.setText(Integer.toString(+lineNumberCount));
                } catch (IOException ex) {
                    Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        jLabel17 = new javax.swing.JLabel();
        lblimage2 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tablePending = new javax.swing.JTable();
        lblMfemale = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        tableCanceled = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableCusF = new javax.swing.JTable();
        lbltechnum = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabletechmale = new javax.swing.JTable();
        lbltotalpaid = new javax.swing.JLabel();
        lblcus = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        tablepayment = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabletechfemale = new javax.swing.JTable();
        lblmanager = new javax.swing.JLabel();
        btnMake = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablemanmale = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaReport = new javax.swing.JTextArea();
        lblpayment = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablemanfemale = new javax.swing.JTable();
        lblmale = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableCus = new javax.swing.JTable();
        btnback2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblMmale = new javax.swing.JLabel();
        lbldone = new javax.swing.JLabel();
        lblTmale = new javax.swing.JLabel();
        lblpending = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblcanceled = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tableDone = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTfemale = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCfemale = new javax.swing.JLabel();
        lblapp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 100)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("✺");

        lblimage2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblimage2.setForeground(new java.awt.Color(255, 255, 255));
        lblimage2.setText("APU Hostel Appliances Service Centre");

        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("ManagerName");

        jLabel18.setBackground(new java.awt.Color(0, 204, 204));
        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("X");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblimage2)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)))
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblimage2)
                        .addGap(28, 28, 28)))
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablePending.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer Password", "Gender", "Contact Number", "Address", "Email", "Available Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePendingMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(tablePending);

        lblMfemale.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMfemale.setForeground(new java.awt.Color(0, 0, 0));
        lblMfemale.setText("jLabel15");

        tableCanceled.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer Password", "Gender", "Contact Number", "Address", "Email", "Available Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCanceled.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCanceledMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tableCanceled);

        tableCusF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer Password", "Gender", "Contact Number", "Address", "Email", "Available Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCusF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCusFMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tableCusF);

        lbltechnum.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbltechnum.setForeground(new java.awt.Color(0, 0, 0));
        lbltechnum.setText("jLabel4");

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Total Paid Amount");

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Number of Customer ");

        tabletechmale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer Password", "Gender", "Contact Number", "Address", "Email", "Available Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabletechmale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabletechmaleMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tabletechmale);

        lbltotalpaid.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbltotalpaid.setForeground(new java.awt.Color(0, 0, 0));
        lbltotalpaid.setText("jLabel17");

        lblcus.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblcus.setForeground(new java.awt.Color(0, 0, 0));
        lblcus.setText("jLabel5");

        tablepayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer Password", "Gender", "Contact Number", "Address", "Email", "Available Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablepayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablepaymentMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(tablepayment);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Number of Manager");

        tabletechfemale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer Password", "Gender", "Contact Number", "Address", "Email", "Available Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabletechfemale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabletechfemaleMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tabletechfemale);

        lblmanager.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblmanager.setForeground(new java.awt.Color(0, 0, 0));
        lblmanager.setText("jLabel6");

        btnMake.setBackground(new java.awt.Color(0, 204, 204));
        btnMake.setFont(new java.awt.Font("Dialog", 3, 11)); // NOI18N
        btnMake.setForeground(new java.awt.Color(0, 0, 0));
        btnMake.setText("Make Report");
        btnMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Number of Payment Made");

        tablemanmale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer Password", "Gender", "Contact Number", "Address", "Email", "Available Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablemanmale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablemanmaleMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tablemanmale);

        areaReport.setColumns(20);
        areaReport.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        areaReport.setRows(5);
        jScrollPane1.setViewportView(areaReport);

        lblpayment.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblpayment.setForeground(new java.awt.Color(0, 0, 0));
        lblpayment.setText("jLabel7");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Number of Male ");

        tablemanfemale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer Password", "Gender", "Contact Number", "Address", "Email", "Available Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablemanfemale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablemanfemaleMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tablemanfemale);

        lblmale.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblmale.setForeground(new java.awt.Color(0, 0, 0));
        lblmale.setText("jLabel8");

        tableCus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer Password", "Gender", "Contact Number", "Address", "Email", "Available Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCusMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tableCus);

        btnback2.setBackground(new java.awt.Color(0, 204, 204));
        btnback2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnback2.setForeground(new java.awt.Color(255, 255, 255));
        btnback2.setText("Back");
        btnback2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnback2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Appointment Done");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Number of Male ");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Appointment Pending");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Number of Male ");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Appointment Cancelled");

        lblMmale.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblMmale.setForeground(new java.awt.Color(0, 0, 0));
        lblMmale.setText("jLabel8");

        lbldone.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbldone.setForeground(new java.awt.Color(0, 0, 0));
        lbldone.setText("jLabel16");

        lblTmale.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTmale.setForeground(new java.awt.Color(0, 0, 0));
        lblTmale.setText("jLabel8");

        lblpending.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblpending.setForeground(new java.awt.Color(0, 0, 0));
        lblpending.setText("jLabel17");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Number of Female ");

        lblcanceled.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblcanceled.setForeground(new java.awt.Color(0, 0, 0));
        lblcanceled.setText("jLabel18");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Number of Female ");

        tableDone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Customer Password", "Gender", "Contact Number", "Address", "Email", "Available Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDoneMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tableDone);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Number of Female ");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Report");

        lblTfemale.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTfemale.setForeground(new java.awt.Color(0, 0, 0));
        lblTfemale.setText("jLabel8");

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Number of Appointment Made");

        lblCfemale.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCfemale.setForeground(new java.awt.Color(0, 0, 0));
        lblCfemale.setText("jLabel14");

        lblapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblapp.setForeground(new java.awt.Color(0, 0, 0));
        lblapp.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Number of Technician");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnback2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(35, 35, 35)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(lbltechnum)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(lblmale))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(lblCfemale)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(lblTmale))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(lblTfemale)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(lblMmale))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMfemale)
                                            .addComponent(jLabel12))))
                                .addComponent(lblcus)
                                .addComponent(jLabel5)
                                .addComponent(lblmanager))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblcanceled)
                                .addComponent(jLabel15)
                                .addComponent(lblpayment)
                                .addComponent(lbltotalpaid)
                                .addComponent(jLabel16)
                                .addComponent(jLabel6)
                                .addComponent(lblapp)
                                .addComponent(jLabel2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMake)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(lbldone))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(lblpending)))))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(399, Short.MAX_VALUE)
                .addComponent(btnback2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbltechnum)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTmale)
                                .addComponent(lblTfemale))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblcus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblmale)
                                .addComponent(lblCfemale))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblmanager)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMmale)
                                .addComponent(lblMfemale))
                            .addGap(0, 31, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblapp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel14))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbldone)
                                .addComponent(lblpending))
                            .addGap(7, 7, 7)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblcanceled)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblpayment)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbltotalpaid)
                            .addGap(34, 34, 34)
                            .addComponent(btnMake, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableCusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCusMouseClicked

    }//GEN-LAST:event_tableCusMouseClicked

    private void tableCusFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCusFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableCusFMouseClicked

    private void tabletechmaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletechmaleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabletechmaleMouseClicked

    private void tabletechfemaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabletechfemaleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabletechfemaleMouseClicked

    private void tablemanmaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablemanmaleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablemanmaleMouseClicked

    private void tablemanfemaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablemanfemaleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablemanfemaleMouseClicked

    private void btnback2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnback2ActionPerformed
        Main z = new Main();
        z.lblname.setText(lblname.getText());
        z.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnback2ActionPerformed

    private void tableDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDoneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDoneMouseClicked

    private void tablePendingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePendingMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablePendingMouseClicked

    private void tableCanceledMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCanceledMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableCanceledMouseClicked

    private void tablepaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablepaymentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablepaymentMouseClicked

    private void btnMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeActionPerformed
        Date date = new Date();
        String  datee = date.toString();
        
        areaReport.setText (" ╔═══════════════╗\n");
        areaReport.setText(areaReport.getText()+" ‖         Report         ‖"     +date+"\n");
        areaReport.setText(areaReport.getText()+" ╚═══════════════╝\n\n");
        areaReport.setText(areaReport.getText()+" Number of Technician:\n");
        areaReport.setText(areaReport.getText()+"  "+lbltechnum.getText()+ "                                                                             Number of Appointment Made\n");
        areaReport.setText(areaReport.getText()+" Number of Male :    Number of Female :              "+lblapp.getText()+ "\n");  
        areaReport.setText(areaReport.getText()+"  "+lblTmale.getText()+"                               "+lblTfemale.getText()+"                                            Appointment Done :     Appointment Pending :"+ "\n");
        areaReport.setText(areaReport.getText()+" Number of Customer :                                           "+lbldone.getText()+"                                     "+lblpending.getText()+"\n");
        areaReport.setText(areaReport.getText()+"  "+lblcus.getText()+ "                                                                             Appointment Cancelled :\n");
        areaReport.setText(areaReport.getText()+" Number of Male :    Number of Female :              "+lblcanceled.getText()+"\n");
        areaReport.setText(areaReport.getText()+"  "+lblmale.getText()+"                               "+lblCfemale.getText()+"                                            Number of Payment Made : "+ "\n");
        areaReport.setText(areaReport.getText()+" Number of Manager :                                             "+lblpayment.getText()+"\n");
        areaReport.setText(areaReport.getText()+"  "+lblmanager.getText()+ "                                                                             Total Paid Amount :\n");
        areaReport.setText(areaReport.getText()+" Number of Male :    Number of Female :              "+lbltotalpaid.getText()+"\n");
        areaReport.setText(areaReport.getText()+"  "+lblMmale.getText()+"                               "+lblMfemale.getText());
        
        try{
            areaReport.print();
        }catch (Exception e){
            
        }
        
    }//GEN-LAST:event_btnMakeActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel18MouseClicked
    
    public void filterCustomerMale (String query){
        DefaultTableModel tb;
        tb = (DefaultTableModel) tableCus.getModel();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(tb);
        tableCus.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public void filterCustomerFemale (String query){
        DefaultTableModel tb;
        tb = (DefaultTableModel) tableCusF.getModel();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(tb);
        tableCusF.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public void filtertechmale (String query){
        DefaultTableModel tb;
        tb = (DefaultTableModel) tabletechmale.getModel();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(tb);
        tabletechmale.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public void filtertechFemale (String query){
        DefaultTableModel tb;
        tb = (DefaultTableModel) tabletechfemale.getModel();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(tb);
        tabletechfemale.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public void filtermanmale (String query){
        DefaultTableModel tb;
        tb = (DefaultTableModel) tablemanmale.getModel();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(tb);
        tablemanmale.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public void filtermanFemale (String query){
        DefaultTableModel tb;
        tb = (DefaultTableModel) tablemanfemale.getModel();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(tb);
        tablemanfemale.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public void filterDone (String query){
        DefaultTableModel tb;
        tb = (DefaultTableModel) tableDone.getModel();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(tb);
        tableDone.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public void filterPending (String query){
        DefaultTableModel tb;
        tb = (DefaultTableModel) tablePending.getModel();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(tb);
        tablePending.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public void filterCanceled (String query){
        DefaultTableModel tb;
        tb = (DefaultTableModel) tableCanceled.getModel();
        TableRowSorter<DefaultTableModel> tablerow = new TableRowSorter<DefaultTableModel>(tb);
        tableCanceled.setRowSorter(tablerow);
        tablerow.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public int getTotal() {
        int rows = tablepayment.getRowCount();
        int total = 0;
        for (int i = 0; i < rows; i++){
            total = total+Integer.parseInt(tablepayment.getValueAt(i, 3).toString());    
        }
        return total;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new Report().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaReport;
    private javax.swing.JButton btnMake;
    private javax.swing.JButton btnback2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblCfemale;
    private javax.swing.JLabel lblMfemale;
    private javax.swing.JLabel lblMmale;
    private javax.swing.JLabel lblTfemale;
    private javax.swing.JLabel lblTmale;
    private javax.swing.JLabel lblapp;
    private javax.swing.JLabel lblcanceled;
    private javax.swing.JLabel lblcus;
    private javax.swing.JLabel lbldone;
    private javax.swing.JLabel lblimage2;
    private javax.swing.JLabel lblmale;
    private javax.swing.JLabel lblmanager;
    public javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpayment;
    private javax.swing.JLabel lblpending;
    private javax.swing.JLabel lbltechnum;
    private javax.swing.JLabel lbltotalpaid;
    private javax.swing.JTable tableCanceled;
    private javax.swing.JTable tableCus;
    private javax.swing.JTable tableCusF;
    private javax.swing.JTable tableDone;
    private javax.swing.JTable tablePending;
    private javax.swing.JTable tablemanfemale;
    private javax.swing.JTable tablemanmale;
    private javax.swing.JTable tablepayment;
    private javax.swing.JTable tabletechfemale;
    private javax.swing.JTable tabletechmale;
    // End of variables declaration//GEN-END:variables
}
