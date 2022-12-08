/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.EmergencyAdmin;

import model.EcoSystem;
import model.UserAccount.UserAccount;
import model.WorkQueue.EmergencyWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aditya Illur
 */
public class EmergencyHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyHistoryJPanel
     */
    JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem system;
    
    public EmergencyHistoryJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua=ua;
        this.system=system;
        
        populateTable();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emergencyRequestJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emergencyRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient", "Request Date and Time", "Patient Status"
            }
        ));
        jScrollPane1.setViewportView(emergencyRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 620, 110));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EMERGENCY DASHBOARD");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 260, 30));

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/emergency.PNG"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton6ActionPerformed

    
    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) emergencyRequestJTable.getModel();
        model.setRowCount(0);
//        System.out.println("R is");
        System.out.println(system.getWorkQueue().getWorkRequestList());
        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {
            
            if(request instanceof EmergencyWorkRequest){
                EmergencyWorkRequest er =(EmergencyWorkRequest) request;
                System.out.println("errrr"+er.getSender());
                System.out.println("errrr"+er.getStatus());
                System.out.println("errrr"+er.getRequestDate());
            if (er.getReceiver().equals(this.ua)) {
                
                  System.out.println("receiver is " + request.getReceiver());
                Object[] row = new Object[3];
                row[0] = er;
                row[1] = er.getRequestDate();
                row[2] = er.getStatus();
//                row[3] = emergencyWorkRequest.getP().get();
                model.addRow(row);
            }
    }}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable emergencyRequestJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
