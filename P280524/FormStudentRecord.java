/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo_2301083004.P280524;

/**
 *
 * @author acer
 */
public class FormStudentRecord extends javax.swing.JFrame {

    /**
     * Creates new form FormStudentRecord
     */
    public FormStudentRecord() {
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

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMathGrade = new javax.swing.JTextField();
        txtEnglishGrade = new javax.swing.JTextField();
        txtScienceGrade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAverage = new javax.swing.JTextField();
        btnproses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(14, 9, 130, 30);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(150, 8, 270, 30);

        jLabel2.setText("Address");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 120, 30);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(150, 50, 270, 30);

        jLabel3.setText("Age");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 90, 130, 30);

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        getContentPane().add(txtAge);
        txtAge.setBounds(150, 90, 270, 30);

        jLabel4.setText("Math Grade");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 130, 130, 30);

        jLabel5.setText("English Grade");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 170, 130, 30);

        jLabel6.setText("Science Grade");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 216, 120, 20);
        getContentPane().add(txtMathGrade);
        txtMathGrade.setBounds(150, 130, 270, 30);
        getContentPane().add(txtEnglishGrade);
        txtEnglishGrade.setBounds(150, 170, 270, 30);
        getContentPane().add(txtScienceGrade);
        txtScienceGrade.setBounds(150, 210, 270, 30);

        jLabel7.setText("Average");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 326, 110, 20);
        getContentPane().add(txtAverage);
        txtAverage.setBounds(150, 320, 270, 30);

        btnproses.setText("Proses");
        btnproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprosesActionPerformed(evt);
            }
        });
        getContentPane().add(btnproses);
        btnproses.setBounds(40, 270, 410, 30);

        setSize(new java.awt.Dimension(499, 408));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprosesActionPerformed
        // TODO add your handling code here:
        pbo_2301083004.P260324.StudentRecord student = new pbo_2301083004.P260324.StudentRecord();
        student.setName(txtName.getText());
        student.setAddress(txtAddress.getText());
        student.setAge(Integer.parseInt(txtAge.getText()));
        student.setMathGrade(Double.parseDouble(txtMathGrade.getText()));
        student.setEnglishGrade(Double.parseDouble(txtEnglishGrade.getText()));
        student.setScienceGrade(Double.parseDouble(txtScienceGrade.getText()));
        ////
        txtAverage.setText(student.getAverage()+"");
    }//GEN-LAST:event_btnprosesActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

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
            java.util.logging.Logger.getLogger(FormStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormStudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormStudentRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnproses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAverage;
    private javax.swing.JTextField txtEnglishGrade;
    private javax.swing.JTextField txtMathGrade;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtScienceGrade;
    // End of variables declaration//GEN-END:variables
}
