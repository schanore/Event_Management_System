/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EventManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventManagementOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chano
 */
public class WasteFoodRequestJPanel extends javax.swing.JPanel {
       private JPanel userProcessContainer;
    private UserAccount account;
    private EventManagementOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    
    

    /**
     * Creates new form WasteFoodRequestJPanel
     */
    public WasteFoodRequestJPanel(JPanel userProcessContainer, UserAccount account, EventManagementOrganization emOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = emOrganization;
        this.enterprise = enterprise;
        this.business = business;
        populateTable();
        
    }
    
      
    public void populateTable(){
     //   DefaultTableModel model = (DefaultTableModel)leftFoodRequestJTable.getModel();
        
   //     model.setRowCount(0);
        
 //       for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
//            Object[] row = new Object[6];
//            row[0] = request;
//            row[1] = request.getSender().getEmployee().getName();
//            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
//           // row[2] = request.getQuantity();
//            row[4] = request.getStatus();
//            row[3] = request.getFoodType();
//           // row[4] = request.getRequestDate();
//           // row[5] = request.getSender();
 //            Object[] row = new Object[6];
   //          row[0] = request.getSender();
   //          row[1] = request.getReceiver();
     //        row[4] = request.getStatus();
            
//            String result = ((LabTestWorkRequest) request).getTestResult();
//            row[5] = result == null ? "Waiting" : result;
    //        row[2]= request.getLeftFoodQuantity();
     //       row[3] = request.getLeftFoodType();
            
            
       //     model.addRow(row);
      //  }
         DefaultTableModel model = (DefaultTableModel)leftFoodRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
             Object[] row = new Object[6];
             row[0] = request;
             row[1] = request.getReceiver();
             row[4] = request.getStatus();
             row[2]= request.getLeftFoodQuantity();
            row[3] = request.getLeftFoodType();
            
            
            model.addRow(row);
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

        refreshBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        leftFoodRequestJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshBtn.setBackground(new java.awt.Color(0, 102, 255));
        refreshBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 32, -1, -1));

        leftFoodRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Receiver", "Quantity", "FoodType", "Status"
            }
        ));
        jScrollPane1.setViewportView(leftFoodRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, 119));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        assignJButton.setBackground(new java.awt.Color(0, 102, 255));
        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        processJButton.setBackground(new java.awt.Color(0, 102, 255));
        processJButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed




        userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

     //   int row = leftFoodRequestJTable.getSelectedRow();
     //   if(row < 0)
     //   {
     //       JOptionPane.showMessageDialog(null, "Please Select a row");

       // }

      //  int selectedRow = leftFoodRequestJTable.getSelectedRow();

      //  if (selectedRow < 0){
       //     return;
        //}

       // WorkRequest request = (WorkRequest)leftFoodRequestJTable.getValueAt(selectedRow, 0);
        //request.setReceiver(account);
       // request.setStatus("Pending");
       // populateTable();
         int row = leftFoodRequestJTable.getSelectedRow();
        if(row < 0)
        {
            JOptionPane.showMessageDialog(null, "Please Select a row");

        }

        int selectedRow = leftFoodRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)leftFoodRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int row = leftFoodRequestJTable.getSelectedRow();
        if(row < 0)
        {
            JOptionPane.showMessageDialog(null, "Please Select a row");

        }
        int selectedRow = leftFoodRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        LabTestWorkRequest request = (LabTestWorkRequest)leftFoodRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        WasteFoodRequestProcessJPanel processWorkRequestJPanel = new WasteFoodRequestProcessJPanel(userProcessContainer, request);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable leftFoodRequestJTable;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshBtn;
    // End of variables declaration//GEN-END:variables
}