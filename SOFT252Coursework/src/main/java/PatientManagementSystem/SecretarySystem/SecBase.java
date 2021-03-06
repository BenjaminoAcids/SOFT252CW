/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystem.SecretarySystem;

/**
 *
 * @author apper
 */
public class SecBase extends javax.swing.JFrame {

    /**
     * Creates new form SecBase
     */
    public SecBase() {
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

        lblTitle = new javax.swing.JLabel();
        btnAccount = new javax.swing.JButton();
        btnAppointments = new javax.swing.JButton();
        btnRemovePatient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("Secretary Page");

        btnAccount.setText("Approve Patient Accounts");
        btnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccountActionPerformed(evt);
            }
        });

        btnAppointments.setText("Appointment Requests");
        btnAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentsActionPerformed(evt);
            }
        });

        btnRemovePatient.setText("Remove Patients");
        btnRemovePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAccount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnAppointments)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnRemovePatient)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccount)
                    .addComponent(btnAppointments))
                .addGap(34, 34, 34)
                .addComponent(btnRemovePatient)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccountActionPerformed
        this.setVisible(false);
        new SecretaryApproveAccount().setVisible(true);
    }//GEN-LAST:event_btnAccountActionPerformed

    private void btnAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentsActionPerformed
        this.setVisible(false);
        new SecretaryApproveAppointment().setVisible(true);
    }//GEN-LAST:event_btnAppointmentsActionPerformed

    private void btnRemovePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePatientActionPerformed
        this.setVisible(false);
        new SecretaryRemove().setVisible(true);
    }//GEN-LAST:event_btnRemovePatientActionPerformed

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
            java.util.logging.Logger.getLogger(SecBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnAppointments;
    private javax.swing.JButton btnRemovePatient;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
