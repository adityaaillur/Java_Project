/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Doctor;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.DB4OUtil.DB4OUtil;
import model.Doctor.Doctor;
import model.EcoSystem;
import model.HospitalAdmin.Hospital;
import model.UserAccount.UserAccount;

/**
 *
 * @author Akshatha
 */
public class DoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private  UserAccount user;
    private Hospital resObj;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private String hosname;
    
    public DoctorJPanel(JPanel userProcessContainer,EcoSystem system,UserAccount user) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.user = user;
        hosname = user.getEmployee().getName();
        populateTable();
    
    }
    public void populateTable(){
     
        DefaultTableModel dtm = (DefaultTableModel) doctorDetails.getModel();
        dtm.setRowCount(0);
        
         //System.out.println("Res len "+ system.getDoctorDirectory().getDoctorList());
       String city = user.getEmployee().getCity();
         
        if(system.findNetwork(city).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getOrganizationList()!=null &&system.findNetwork(city).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getDoctorDirectory()!=null){
        for(Doctor org : system.findNetwork(city).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getDoctorDirectory().getDocList()) {
           //System.out.println(org.getEnterpriseType1().getClass()+" "+ org.getEnterpriseType1().getValue());
              
                    
          
            Object row[] = new Object[3];
            row[0] = org;
            row[1] = org.getSpecialization();
            dtm.addRow(row);
        
        }
        System.out.println("hooos "+hosname);
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
        doctorDetails = new javax.swing.JTable();
        createNewDoctor = new javax.swing.JButton();
        deleteDoctor = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        deleteDoctor1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 246, 232));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctorDetails.setBackground(new java.awt.Color(204, 255, 204));
        doctorDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Doctor name", "Doctor Specialization"
            }
        ));
        jScrollPane1.setViewportView(doctorDetails);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 580, 120));

        createNewDoctor.setBackground(new java.awt.Color(51, 153, 255));
        createNewDoctor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createNewDoctor.setText("Create New Doctor");
        createNewDoctor.setPreferredSize(new java.awt.Dimension(156, 43));
        createNewDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewDoctorActionPerformed(evt);
            }
        });
        add(createNewDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 180, 40));

        deleteDoctor.setBackground(new java.awt.Color(255, 102, 102));
        deleteDoctor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteDoctor.setText("Delete Doctor");
        deleteDoctor.setPreferredSize(new java.awt.Dimension(156, 43));
        deleteDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDoctorActionPerformed(evt);
            }
        });
        add(deleteDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, 40));

        enterpriseLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        enterpriseLabel.setText("Manage Doctors");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 400, 40));

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 140, 40));

        deleteDoctor1.setBackground(new java.awt.Color(51, 153, 255));
        deleteDoctor1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteDoctor1.setText("Refresh");
        deleteDoctor1.setPreferredSize(new java.awt.Dimension(156, 43));
        deleteDoctor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDoctor1ActionPerformed(evt);
            }
        });
        add(deleteDoctor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/managedoctors.PNG"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, 780, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void createNewDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewDoctorActionPerformed
        // TODO add your handling code here:

        AddDoctorJpanel createDoctorJPanel = new AddDoctorJpanel(userProcessContainer, system,user);
        userProcessContainer.add("CreateDoctor", createDoctorJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createNewDoctorActionPerformed

    private void deleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDoctorActionPerformed
        // TODO add your handling code here:

        int selectedRow = doctorDetails.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Doctor doc = (Doctor)doctorDetails.getValueAt(selectedRow,0);
        system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().deleteOrganization(doc);
        System.out.println("doctor deleted"+doc);
        system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(user.getEmployee().getName()).getOrganizationDirectory().getDoctorDirectory().deleteDoctor(doc);
        UserAccount ua = system.getUserAccountDirectory().findUserAccount(doc.getName());
        system.getUserAccountDirectory().getUserAccountList().remove(ua);
        populateTable();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_deleteDoctorActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        //        Component[] comps = this.userProcessContainer.getComponents();
        //        for(Component comp : comps){
            //            if(comp instanceof SystemAdminWorkAreaJPanel){
                //                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                //                systemAdminWorkAreaJPanel.populateTree();
                //            }
            //        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void deleteDoctor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDoctor1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_deleteDoctor1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createNewDoctor;
    private javax.swing.JButton deleteDoctor;
    private javax.swing.JButton deleteDoctor1;
    private javax.swing.JTable doctorDetails;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
