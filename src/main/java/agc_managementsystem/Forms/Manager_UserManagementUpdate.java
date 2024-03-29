package agc_managementsystem.Forms;

import com.mycompany.agc_managementsystem.FilePath;
import com.mycompany.agc_managementsystem.User;
import com.mycompany.agc_managementsystem.User1;
import com.mycompany.agc_managementsystem.UserType;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Manager_UserManagementUpdate extends javax.swing.JFrame {

    private String month = "01";
    private int day = 0;
    private String ErrorMSG = "";
    private User modifyingUser = null;
    private User user = null;
    
    public Manager_UserManagementUpdate() {
        initComponents();      
    }
    
    public void setUser(User u, User u2) {
        this.modifyingUser = u;
        this.user = u2;
    }
    public void showInfo(){
                // pre-process the passed data to the text field, etc.
        switch(modifyingUser.getUsertype())
        {
            case MANAGER:
                cbUserType.setSelectedIndex(0);
                break;
            case TRAINER:
                cbUserType.setSelectedIndex(1);
                break;
            case CUSTOMER:
                cbUserType.setSelectedIndex(2);
                break;
        }
        txtFullname.setText(modifyingUser.getFullName());
        txtUsername.setText(modifyingUser.getUsername());
        txtEmail.setText(modifyingUser.getEmail());
        txtContactNo.setText(modifyingUser.getContactNo());
        // Special processing the dob
        String[] tempDate = modifyingUser.getDOB().split("-");
        cbYear.setSelectedIndex(2010-Integer.parseInt(tempDate[0]));
        cbMonth.setSelectedIndex(Integer.parseInt(tempDate[1])-1);
        cbDay.setSelectedIndex(Integer.parseInt(tempDate[2])-1);
        // End process   
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
        jLabel3 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtFullname = new javax.swing.JTextField();
        cbMonth = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbDay = new javax.swing.JComboBox<>();
        txtUsername = new javax.swing.JTextField();
        cbYear = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        cbUserType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(796, 425));
        setMinimumSize(new java.awt.Dimension(796, 425));

        jPanel1.setBackground(new java.awt.Color(60, 42, 77));
        jPanel1.setMaximumSize(new java.awt.Dimension(796, 425));
        jPanel1.setMinimumSize(new java.awt.Dimension(796, 425));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fullname");

        btnUpdate.setBackground(new java.awt.Color(153, 255, 153));
        btnUpdate.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));
        cbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonthActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        cbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903" }));
        cbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact No.");

        cbUserType.setBackground(new java.awt.Color(255, 255, 255));
        cbUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MANAGER", "TRAINER", "CUSTOMER" }));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date of Birth");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update User Details");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Type");

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtFullname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtContactNo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEmail)
                                .addComponent(cbUserType, javax.swing.GroupLayout.Alignment.LEADING, 0, 204, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnBack)
                        .addGap(258, 258, 258)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbUserType)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(16, 16, 16))))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String Day;
        if(cbDay.getSelectedItem().toString().length()==1) Day = '0'+cbDay.getSelectedItem().toString();
        else Day = cbDay.getSelectedItem().toString();

        String Date = cbYear.getSelectedItem().toString()+"-"+month+"-"+Day;
        ErrorMSG += new User().validateFullname(txtFullname.getText());
        ErrorMSG += new User().validateUsername(txtUsername.getText());
        ErrorMSG += new User().validateEmail(txtEmail.getText());
        ErrorMSG += new User().validateContactNo(txtContactNo.getText());

        if(!"".equals(ErrorMSG)) JOptionPane.showMessageDialog(null, ErrorMSG, "Updating Failed", JOptionPane.ERROR_MESSAGE);
        else
        {
            BufferedReader br = null;
            String Target_ID = modifyingUser.getID();
            boolean repeat = false;
            try {
                br = new BufferedReader(new FileReader(FilePath.getPath(FilePath.USER_DETAILS)));
                String dataLine = null;
                String[] data = null;
                //// Process it
                // Repetation check -> username, email, contactno
                while((dataLine = br.readLine())!= null){
                    data = dataLine.split(";");
                    if((data[1].equals(txtUsername.getText()) || data[2].equals(txtEmail.getText()) || data[3].equals(txtContactNo.getText())) && !data[7].equals(modifyingUser.getID())){
                        repeat = true;
                        break;
                    }
                }    
                br.close();
                
                // get user id
                br = new BufferedReader(new FileReader(FilePath.getPath(FilePath.USER_DETAILS)));
                StringBuffer inputBuffer = new StringBuffer();
                String inputString = "";
                while((dataLine = br.readLine())!= null && !repeat){
                    data = dataLine.split(";");
                    if(data[7].equals(Target_ID)){
                        String id = data[7];
                        // if current user type is different from the user id, generate new id
                        if((cbUserType.getSelectedItem().toString().equals("MANAGER") && !Character.toString(data[7].charAt(0)).equals("M"))||
                                (cbUserType.getSelectedItem().toString().equals("TRAINER") && !Character.toString(data[7].charAt(0)).equals("T")) || 
                                (cbUserType.getSelectedItem().toString().equals("CUSTOMER") && !Character.toString(data[7].charAt(0)).equals("C"))){
                            // generate new id
                            id = User.GenerateNewID(UserType.getUserType(cbUserType.getSelectedItem().toString()));
                        }
                        
                        inputString = txtFullname.getText() + ";"+txtUsername.getText() +";"+
                                        txtEmail.getText() + ";" + txtContactNo.getText() +";"+
                                            Date + ";" + data[5] + ";" + cbUserType.getSelectedItem().toString() + ";"+ id;
                        
                        // record new id into the log
                        if(!modifyingUser.getID().equals(id)){
                            BufferedWriter bw = new BufferedWriter(new FileWriter(FilePath.getPath(FilePath.ID_CHANGE_LOG), true));
                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd|HH:mm:ss");
                            bw.write(modifyingUser.getID()+"->"+id+"["+dtf.format(LocalDateTime.now())+"]"+"\n");
                            bw.close();
                        }
                        
                        inputBuffer.append(inputString);
                        inputString = "";
                    } else{
                        inputBuffer.append(dataLine);
                    }
                    inputBuffer.append("\n");
                }
                br.close();
                
                // Write into the file and Show message
                if(!repeat){
                    String fileInput = inputBuffer.toString();
                    FileOutputStream fos = new FileOutputStream(new File(FilePath.getPath(FilePath.USER_DETAILS)));
                    fos.write(fileInput.getBytes());
                    fos.close();
                    JOptionPane.showMessageDialog(null, "Successfully Updated!");
                }
                else JOptionPane.showMessageDialog(null, "Username, Email or Contact No you have typed is being used.", "Updating Failed", JOptionPane.ERROR_MESSAGE);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "File not Found!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "File Input or Output Exception Error!");
            }
        }

        ErrorMSG = "";
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonthActionPerformed
        refreshMonth();
    }//GEN-LAST:event_cbMonthActionPerformed

    private void cbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYearActionPerformed
        refreshMonth();
    }//GEN-LAST:event_cbYearActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Manager_UserManagement m = new Manager_UserManagement();
        m.setManager(this.user);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void refreshMonth(){
                cbDay.removeAllItems();
        int year = Integer.parseInt(cbYear.getSelectedItem().toString());
        switch(cbMonth.getSelectedItem().toString()){
            case "JANUARY" -> {
                day = 31;
                month = "01";
            }
            case "FEBRUARY" -> {
                
                // check if this year is the leap year
                day = 28;
                if(year%400==0||(year%100!=0&&year%4==0))
                    day = 29;
                month = "02";
            }
            case "MARCH" -> {
                day = 31;
                month = "03";
            }
            case "APRIL" -> {
                day = 30;
                month = "04";
            }
            case "MAY" -> {
                day = 31;
                month = "05";
            }
            case "JUNE" -> {
                day = 30;
                month = "06";
            }
            case "JULY" -> {
                day = 31;
                month = "07";
            }
            case "AUGUST" -> {
                day = 31;
                month = "08";
            }
            case "SEPTEMBER" -> {
                day = 30;
                month = "09";
            }
            case "OCTOBER" -> {
                day = 31;
                month = "10";
            }
            case "NOVEMBER" -> {
                day = 30;
                month = "11";
            }
            case "DECEMBER" -> {
                day = 31;
                month = "12";
            }
        }
        for(int i=1;i<=day;i++) cbDay.addItem(Integer.toString(i));
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
            java.util.logging.Logger.getLogger(Manager_UserManagementUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_UserManagementUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_UserManagementUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_UserManagementUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_UserManagementUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbDay;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JComboBox<String> cbUserType;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    void setUser(User u, User1 user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
