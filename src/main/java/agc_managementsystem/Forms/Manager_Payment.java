package agc_managementsystem.Forms;

import com.mycompany.agc_managementsystem.FilePath;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Manager_Payment extends javax.swing.JFrame {
    
    private String CID = null;
    
    public Manager_Payment() {
        BufferedReader br = null;
        try {
            initComponents();
            // put all case id into cbCaseID
            br = new BufferedReader(new FileReader(FilePath.getPath(FilePath.SCHEDULE)));
            String[] data = null;
            String dataLine = null;
            while((dataLine = br.readLine())!= null){
                data = dataLine.split(";");
                if(Integer.parseInt(data[8])==0){
                    cbCaseID.addItem(data[0]);
                }
            }
            
            br.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File is not found!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File input or output error!");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbCaseID = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGC Management System");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(60, 42, 77));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Payment");

        cbCaseID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbCaseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCaseIDActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Case ID:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Name:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        lblCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerName.setText(" ");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date:");

        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText(" ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Time:");

        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setText(" ");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Duration:");

        lblDuration.setForeground(new java.awt.Color(255, 255, 255));
        lblDuration.setText(" ");

        btnPay.setText("Pay");
        btnPay.setToolTipText("");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDuration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCaseID, 0, 130, Short.MAX_VALUE))))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCaseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(lblCustomerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblDuration))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btnPay)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCaseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCaseIDActionPerformed
        
        BufferedReader br = null;
        try {
            // Get CaseId
            CID = cbCaseID.getSelectedItem().toString();
            br = new BufferedReader(new FileReader(FilePath.getPath(FilePath.SCHEDULE)));
            String dataLine = null;
            String[] data = null;
            String CusID = null;
            while((dataLine = br.readLine())!=null){
                data = dataLine.split(";");
                if(data[0].equals(CID)){
                    CusID = data[1];
                    lblDate.setText(data[3]);
                    lblTime.setText(data[4]);
                    lblDuration.setText(getDuration(Integer.parseInt(data[5])));
                    break;
                }
            }
            br.close();

            br = new BufferedReader(new FileReader(FilePath.getPath(FilePath.USER_DETAILS)));
            while((dataLine = br.readLine())!=null){
                data = dataLine.split(";");
                if(data[7].equals(CusID)){
                    lblCustomerName.setText(data[0]);
                    break;
                }
            }   
            br.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File is not found!");
        }  catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "File input or output error!");
        }
        
        
    }//GEN-LAST:event_cbCaseIDActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        int select = JOptionPane.showConfirmDialog(null, "Are you sure to pay?");
        if(select == 0){
            try {
                BufferedReader br = new BufferedReader(new FileReader(FilePath.getPath(FilePath.SCHEDULE)));
                StringBuffer inputBuffer = new StringBuffer();
                String dataLine = null;
                String[] data = null;
                while((dataLine = br.readLine())!= null){
                    data = dataLine.split(";");
                    if(data[0].equals(CID)){
                        data[8] = "1";
                        inputBuffer.append(String.join(";", data) + ";");

                    } else{
                        inputBuffer.append(dataLine);
                    }
                    inputBuffer.append("\n");
                }
                br.close();
                String fileInput = inputBuffer.toString();
                FileOutputStream fos = new FileOutputStream(new File(FilePath.getPath(FilePath.SCHEDULE)));
                fos.write(fileInput.getBytes());
                fos.close();
                JOptionPane.showMessageDialog(null, "Successfully Updated!");
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File is not found!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "File input or output error!");
            }
        }
    }//GEN-LAST:event_btnPayActionPerformed

    private String getDuration(int i){
        switch(i){
            case 1:
                return "30 minutes";
            case 2:
                return "1 hour";
            case 3:
                return "1 hour 30 minutes";
            case 4:
                return "2 hours";
        }
    
        return null;
    }
    
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
            java.util.logging.Logger.getLogger(Manager_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPay;
    private javax.swing.JComboBox<String> cbCaseID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables
}