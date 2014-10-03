/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whiteclover.himss;

import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Akash
 */
public class AddSalesDetails extends javax.swing.JFrame {

    /**
             * Creates new form AddSalesDetails
             */

    public AddSalesDetails() {
        initComponents();
        String[] items = {"Apple", "Ball", "Cat", "Dog"};
        JList list = new JList(items);
        AutoCompleteDecorator.decorate(productID, Arrays.asList(items), true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        customerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        productID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rate = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        errorPlace = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        modifyButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        date.setDate(new Date());

        jLabel1.setText("Date");

        jLabel2.setText("Customer Name");

        jLabel3.setText("Product ID");

        jLabel4.setText("Quantity");

        jLabel5.setText("Rate");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        tableModel = new AddSalesDetailTableModel();
        table.setModel(tableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getSelectionModel().addListSelectionListener(listSelectionListener);
        jScrollPane2.setViewportView(table);

        modifyButton.setText("Modify");
        modifyButton.setEnabled(false);
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.setEnabled(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(clearButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(deleteButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(modifyButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(addButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(customerName)
                                        .addComponent(productID)
                                        .addComponent(quantity)
                                        .addComponent(rate)
                                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))))
                            .addComponent(errorPlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 304, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(productID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addComponent(errorPlace)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(modifyButton)
                    .addComponent(deleteButton)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        SalesDetail newData = getDataFromForm();
        if (newData==null)
            return;
        tableModel.append(newData);
        clearForm();
    }//GEN-LAST:event_addButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        SalesDetail newDetail = getDataFromForm();
        if (newDetail==null)
            return;
        int rowSelected = table.getSelectedRow();
        tableModel.modify(newDetail, rowSelected);
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearForm();
        table.clearSelection();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int rowSelected = table.getSelectedRow();
        tableModel.delete(rowSelected);
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddSalesDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSalesDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSalesDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSalesDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSalesDetails().setVisible(true);
            }
        });
    }
    
    ListSelectionListener listSelectionListener = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent lse) {
            if(tableModel!=null && table.getSelectedRow()>=0){
                int selectedRow = table.getSelectedRow();
                modifyButton.setEnabled(true);
                deleteButton.setEnabled(true);
                SalesDetail row = tableModel.getRow(selectedRow);
                clearForm();
                renderFormData(row);
            }
            else{
                modifyButton.setEnabled(false);
                deleteButton.setEnabled(false);
            }
        }
    };
    
    private void clearForm(){
        date.setDate(new Date());
        customerName.setText("");
        errorPlace.setText("");
        productID.setText("");
        quantity.setText("");
        rate.setText("");
    }
    
    private void renderFormData(SalesDetail sales){
        date.setDate(sales.getDate());
        customerName.setText(sales.getCustomer_name());
        errorPlace.setText("");
        productID.setText(sales.getProductID());
        quantity.setText(sales.getQuantity()+"");
        rate.setText(sales.getRate()+"");
    }
    
    private SalesDetail getDataFromForm(){
        errorPlace.setText("");
        Date dateSel = this.date.getDate();
        String nameSel = this.customerName.getText();
        String productIDSel = this.productID.getText();
        int quantitySel = 0, rateSel = 0;
        try {
            quantitySel = Integer.parseInt(this.quantity.getText());
        } catch (NumberFormatException e) {
            errorPlace.setForeground(Color.RED);
            errorPlace.setText("* Quantity isn't number.");
            return null;
        }
        try {
            rateSel = Integer.parseInt(this.rate.getText());
        } catch (NumberFormatException e) {
            errorPlace.setForeground(Color.RED);
            errorPlace.setText("* Rate isn't number.");
            return null;
        }

        System.out.println(dateSel + " " + nameSel + " " + productIDSel + " " + quantitySel + " " + rateSel);
        SalesDetail newData = new SalesDetail(dateSel, nameSel, productIDSel, quantitySel, rateSel);
        return newData;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField customerName;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel errorPlace;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextField productID;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField rate;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    private AddSalesDetailTableModel tableModel;
    
    
    class AddSalesDetailTableModel extends AbstractTableModel {
        private ArrayList<SalesDetail> data;
        private String[] columns = { // Administrator will need to show the column Uploader as well.
            "Date",
            "Name",
            "ProductID",
            "Quantity",
            "Rate"
        };

        AddSalesDetailTableModel() {
            this.data = new ArrayList<SalesDetail>();
        }


        @Override
        public Object getValueAt(int row, int column) {

            switch (columns[column]) {
                case "Date":
                    return data.get(row).getDate();
                case "Name":
                    return data.get(row).getCustomer_name();
                case "ProductID":
                    return data.get(row).getProductID();
                case "Quantity":
                    return data.get(row).getQuantity();
                case "Rate":
                    return data.get(row).getRate();
                default:
                    System.err.println("Logic Error");
            }
            return "";
        }

        @Override
        public int getColumnCount() {
            return columns.length;
        }

        @Override
        public Class getColumnClass(int column) {
            if ("Quantity".equals(columns[column]) || "Rate".equals(columns[column])) {
                return Integer.class;
            }
            return String.class;
        }

        public String getColumnName(int column) {
            return columns[column];
        }

        public int getRowCount() {
            return data.size();
        }

        public String getCurrentProduct(int row) {
            return data.get(row).getProductID();
        }
        
        public void append(SalesDetail d){
            data.add(d);
            fireTableDataChanged();
        }
        public SalesDetail getRow(int rowNum){
            return this.data.get(rowNum);
        }
        public void modify(SalesDetail newDetail, int row){
            data.set(row, newDetail);
            fireTableDataChanged();
        }
        public void delete(int row){
            data.remove(row);
            fireTableDataChanged();
        }
    }
}
