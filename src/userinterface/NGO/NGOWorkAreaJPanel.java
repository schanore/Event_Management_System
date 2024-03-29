/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGO;

/**
 *
 * @author ARCHIE SHAH
 */
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.EventManagerRole.ManagePartyHallJPanel;

public class NGOWorkAreaJPanel extends javax.swing.JPanel {

             private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    /**
     * Creates new form NGOWorkAreaJPanel
     */
    public NGOWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
              this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageNGOBtn = new javax.swing.JButton();
        manageFoodBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageNGOBtn.setBackground(new java.awt.Color(0, 102, 255));
        manageNGOBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manageNGOBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageNGOBtn.setText("Manage NGO ");
        manageNGOBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNGOBtnActionPerformed(evt);
            }
        });
        add(manageNGOBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 143, 190, -1));

        manageFoodBtn.setBackground(new java.awt.Color(0, 102, 255));
        manageFoodBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manageFoodBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageFoodBtn.setText("Manage Food");
        manageFoodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFoodBtnActionPerformed(evt);
            }
        });
        add(manageFoodBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 77, 190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageNGOBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNGOBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("NGOMainJPanel", new NGOMainJPanel(userProcessContainer, account, organization,enterprise,business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNGOBtnActionPerformed

    private void manageFoodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFoodBtnActionPerformed
        // TODO add your handling code here:
             CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageRequestJPanel", new ManageRequestJPanel(userProcessContainer, account, organization,enterprise,business));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageFoodBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton manageFoodBtn;
    private javax.swing.JButton manageNGOBtn;
    // End of variables declaration//GEN-END:variables
}
