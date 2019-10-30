/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EventManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventManagementOrganization;
import Business.Organization.Organization;
import Business.Organization.PartyHall;
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
 * @author Shephali Mahajan
 */
public class ManagePartyHallJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePartyHallJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private EventManagementOrganization eventManagementOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    
    public ManagePartyHallJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.eventManagementOrganization = (EventManagementOrganization) organization;
        this.enterprise = enterprise;
        this.business = business;
        populateTable();
    }

    public void populateTable(){
           DefaultTableModel model = (DefaultTableModel) tblPartyHall.getModel();
        
        model.setRowCount(0);
        for (PartyHall p  : eventManagementOrganization.getPartyHallDirectory().getPartyHallDirectory()){
            Object[] row = new Object[6];
            row[0] = p.getHallType();
            row[1] = p.getName();
            row[2] = p.getPrice();
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPartyHall = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxType = new javax.swing.JComboBox();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPartyHall.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblPartyHall);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 47, -1, 162));

        jLabel1.setText("Type : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 264, 107, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 311, 107, -1));

        jLabel3.setText("Price : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 355, 107, -1));

        cbxType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "party hall", "lounge", "open ground ", "ball room " }));
        add(cbxType, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 261, 156, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 308, 156, -1));
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 352, 156, -1));

        btnSubmit.setBackground(new java.awt.Color(0, 102, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        if( txtName.getText().isEmpty() || txtPrice.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Fields Cannot be Empty");
        }
        else{
        try{
            Integer.parseInt(txtPrice.getText());
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Price should be numbers");
            return;
        }
        PartyHall ph = new PartyHall();
        ph.setHallType(cbxType.getSelectedItem().toString());
        ph.setName(txtName.getText());
        ph.setPrice(Integer.parseInt(txtPrice.getText()));
        
        eventManagementOrganization.getPartyHallDirectory().getPartyHallDirectory().add(ph);
        
        
        JOptionPane.showMessageDialog(null, "Place added successfully");
        populateTable();
        
        txtPrice.setText("");
        txtName.setText("");
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbxType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPartyHall;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
