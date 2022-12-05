/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.HospitalAdminRole;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.EcoSystem;
import model.UserAccount.UserAccount;
import model.WorkQueue.WorkRequest;

/**
 *
 * @author Akshatha
 */
public class ViewInventoryOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewInventoryOrderJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    public ViewInventoryOrderJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem system) {
        initComponents();
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.system=system;
        populateRequestTable();
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
        InventoryRequestJTable = new javax.swing.JTable();
        refreshTestJButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        NewOrderJLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InventoryRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Logistics Company", "Ordered on ", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(InventoryRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 550, 97));

        refreshTestJButton.setBackground(new java.awt.Color(51, 51, 255));
        refreshTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jButton2.setText("Back");
        jButton2.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 140, 40));

        NewOrderJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewOrderJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NewOrderJLabel.setText("HOSPITAL VIEW ORDER DASHBOARD");
        add(NewOrderJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 360, 23));
    }// </editor-fold>//GEN-END:initComponents

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        //
        //        Component[] comps = this.userProcessContainer.getComponents();
        //        for(Component comp : comps){
            //            if(comp instanceof SystemAdminWorkAreaJPanel){
                //                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                //                systemAdminWorkAreaJPanel.populateTree();
                //            }
            //        }
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable InventoryRequestJTable;
    private javax.swing.JLabel NewOrderJLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshTestJButton;
    // End of variables declaration//GEN-END:variables

private void populateRequestTable() {
         //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel model = (DefaultTableModel) InventoryRequestJTable.getModel();
        for (WorkRequest request :  system.getWorkQueue().getWorkRequestList()) {
            
        
            if (request.getSender().equals(userAccount)){
        model.setRowCount(0);
//        System.out.println("R is");
            Object[] row = new Object[3];
            row[0] = request.getReceiver().getEmployee().getName();
            row[1] = request.getRequestDate();
            row[2] = request.getStatus();


            model.addRow(row);
            }
        }
        
}
}