/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CustomerRole;
import model.EcoSystem;
import model.LabAdmin.Lab;
import model.LabAdmin.LabDirectory;
import model.UserAccount.UserAccount;
import model.WorkQueue.BookTestWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * 
 */
public class ViewTestBookingsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTestBookingJPanel
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    LabDirectory labDirectory;
    Lab lab;
    
    public ViewTestBookingsJPanel(JPanel userProcessContainer,UserAccount userAccount,EcoSystem system ) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=userAccount;
        this.system=system;
        populateTable();
    }
    public ViewTestBookingsJPanel() {
        initComponents();
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
        testsBookedTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        testsBookedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lab Name", "Request Date", "Date of test booked", "Status"
            }
        ));
        jScrollPane1.setViewportView(testsBookedTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 680, 200));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("VIEW TEST BOOKINGS");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 270, 30));

        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 199, 410, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/P15.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
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
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable testsBookedTable;
    // End of variables declaration//GEN-END:variables


private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) testsBookedTable.getModel();

        model.setRowCount(0);
//        System.out.println("R is");
        for (WorkRequest request : system.getWorkQueue().getWorkReqList()) {
//            System.out.println("Receiver would be");
//            System.out.println(request.getReceiver());
            if (request.getSender().getUsername().equals(userAccount.getUsername())) {
                if(request instanceof BookTestWorkRequest)
                {                BookTestWorkRequest testRequest = (BookTestWorkRequest) request;
            Object[] row = new Object[4];
            row[0] = request.getRecevr();
            row[1] = request.getReqDate();
            row[2] = testRequest.getdateBooked();
            row[3] = request.getStat();


            model.addRow(row);
            }
            }
        }
    }
}
