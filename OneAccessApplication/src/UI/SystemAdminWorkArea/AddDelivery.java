/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminWorkArea;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise;
import model.HospitalAdmin.Hospital;
import model.Organization;
import model.Role.DeliverManRole;
import model.Role.DoctorRole;
import model.Role.HospitalAdminRole;
import model.Role.LabAdminRole;
import model.Role.PharamacyAdminRole;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author pratiksannakki
 */
public class AddDelivery extends javax.swing.JPanel {

    /**
     * Creates new form AddDelivery
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount user;
    public AddDelivery(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.system=system;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dName = new javax.swing.JTextField();
        dspe = new javax.swing.JTextField();
        dUname = new javax.swing.JTextField();
        dPass = new javax.swing.JTextField();
        addHospital = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dName1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dspe1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dName.setPreferredSize(new java.awt.Dimension(164, 30));
        add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        dspe.setPreferredSize(new java.awt.Dimension(164, 30));
        add(dspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        dUname.setPreferredSize(new java.awt.Dimension(164, 30));
        add(dUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        dPass.setPreferredSize(new java.awt.Dimension(164, 30));
        add(dPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        addHospital.setBackground(new java.awt.Color(24, 31, 46));
        addHospital.setForeground(new java.awt.Color(255, 255, 255));
        addHospital.setText("Add DeliveryMan");
        addHospital.setPreferredSize(new java.awt.Dimension(156, 43));
        addHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHospitalActionPerformed(evt);
            }
        });
        add(addHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "San francisco" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(140, 30));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 170, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("ADD DELIVERY MAN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 380, 37));

        jButton2.setText("Back");
        jButton2.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setText("Delivery Man Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 96, -1));

        jLabel3.setText("Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 40, -1));

        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 50, -1));

        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 47, -1));

        jLabel6.setText("City Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 51, -1));
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 410, 310));

        jLabel10.setText("Email");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 27, -1));

        dName1.setPreferredSize(new java.awt.Dimension(15, 30));
        add(dName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 164, -1));

        jLabel11.setText("Phone");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        dspe1.setPreferredSize(new java.awt.Dimension(15, 30));
        add(dspe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 164, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHospitalActionPerformed
        // TODO add your handling code here:
        if (dUname.getText().isEmpty() || dPass.getText().isEmpty() || dName.getText().isEmpty() || dspe.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all mandatory fields");
        } else {
            if (!dName.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper name");
                dName.setText("");
                return;
            }
            else if(!dspe.getText().matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
                JOptionPane.showMessageDialog(this, "Address should be in valid format like 123 abc ");
                dspe.setText("");
                return;
            }
            else if(!dName1.getText().matches("^(.+)@(.+)$")){
                JOptionPane.showMessageDialog(this, "Enter proper Email in the format of abc@gmail.com");
                dName1.setText("");
                return;
            }
            else if(!dspe1.getText().matches("^\\d{10}$")){
                JOptionPane.showMessageDialog(this, "Enter a 10 digit phone number");
                dspe1.setText("");
                return;
            }
            else if (strongUsername() == false) {
                dUname.setText("");
                JOptionPane.showMessageDialog(null, "Username should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            }
            else if (strongPassword() == false) {
                dPass.setText("");
                JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
            }
            String name = dName.getText();
            String add = dspe.getText();
            String username = dUname.getText();
            String pass = dPass.getText();
            Object selectedItem = jComboBox1.getSelectedItem();

            String city = selectedItem.toString();
            //String city = "Boston";
            Employee emp = system.getEmployeeDirectory().createEmployee(name);
            emp.setCity(city);
            UserAccount account = system.getUserAccountDirectory().createUserAccount(username, pass, emp, new DeliverManRole());
            if(system.getNetworkList()==null || system.findNetwork(city)==null){
                system.createNetwork(city);
                System.out.println("cities"+system.findNetwork(city));
            }

            if(system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList()==null || system.findNetwork(city).getEnterpriseDirectory().findEnterprise(name)==null){
                system.findNetwork(city).getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.Delivery );
                system.findNetwork(city).getEnterpriseDirectory().findEnterprise(name).getOrganizationDirectory().createOrganization(name, Organization.Type.DeliveryMan, "Test");
                JOptionPane.showMessageDialog(this," Delivery enterprise created");
                dName.setText("");
                dspe.setText("");
                dName1.setText("");
                dspe1.setText("");
                dUname.setText("");
                dPass.setText("");
            }else{
                System.out.println("already there");
                JOptionPane.showMessageDialog(this," Delivery enterprise already exists");
            }

        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_addHospitalActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
    private javax.swing.JButton addHospital;
    private javax.swing.JTextField dName;
    private javax.swing.JTextField dName1;
    private javax.swing.JTextField dPass;
    private javax.swing.JTextField dUname;
    private javax.swing.JTextField dspe;
    private javax.swing.JTextField dspe1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

private boolean strongUsername() {
        Pattern pat = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = pat.matcher(dUname.getText());
        boolean boo = m.matches();
        return boo;
    }

    private boolean strongPassword() {
        Pattern pat1;
        pat1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = pat1.matcher(dPass.getText());
        boolean bat1 = m1.matches();
        return bat1;
    }
}

