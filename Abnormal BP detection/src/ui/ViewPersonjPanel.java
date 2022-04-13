
package ui;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSign;
import model.VitalSigns;

/**
 *
 * @author Vini
 */
public class ViewPersonjPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayPersonJpanel
     */
    
    PersonDirectory persons;
    PatientDirectory patients;
    VitalSigns vitalSignsHistory;
    
    int currentSelectedRow;
    
    public ViewPersonjPanel(PersonDirectory persons, PatientDirectory patients, VitalSigns vitalSignsHistory) {
        initComponents();
        this.persons = persons;
        this.patients = patients;
        this.vitalSignsHistory = vitalSignsHistory;
        populatePersonTable();
        this.currentSelectedRow = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplayPerson = new javax.swing.JTable();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        txtBP = new javax.swing.JTextField();
        btnAddPatient = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        txtMedicalRecordNo = new javax.swing.JTextField();
        lblMedicalRecordNo = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        lblCreate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreate.setText("Person's Directory");

        tblDisplayPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Medical Record No", "Age", "Address", "City", "Community", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDisplayPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisplayPersonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDisplayPerson);

        lblCity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity.setText("City:");

        lblCommunity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCommunity.setText("Community:");

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Name:");

        lblAge.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAge.setText("Age:");

        lblBloodPressure.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblBloodPressure.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBloodPressure.setText("Set Blood Pressure:");

        txtBP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBPActionPerformed(evt);
            }
        });

        btnAddPatient.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        txtName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAge.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtCity.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        txtCommunity.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityActionPerformed(evt);
            }
        });

        txtMedicalRecordNo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtMedicalRecordNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicalRecordNoActionPerformed(evt);
            }
        });

        lblMedicalRecordNo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblMedicalRecordNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMedicalRecordNo.setText("Medical Record No:");

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblAddress.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Gender:");

        txtGender.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnDelete.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Delete Selected person from directory");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMedicalRecordNo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCommunity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddPatient)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMedicalRecordNo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(lblBloodPressure))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBP)
                                            .addComponent(txtGender, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCity)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(lblAge)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicalRecordNo)
                    .addComponent(txtMedicalRecordNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBloodPressure))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPatient)
                    .addComponent(btnDelete)
                    .addComponent(jLabel2))
                .addGap(331, 331, 331))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBPActionPerformed

    private void tblDisplayPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisplayPersonMouseClicked
        // TODO add your handling code here:        
        DefaultTableModel model = (DefaultTableModel) tblDisplayPerson.getModel();
        currentSelectedRow = tblDisplayPerson.getSelectedRow();
        
        String name = model.getValueAt(tblDisplayPerson.getSelectedRow(), 0).toString();
        String medicalRecordNo = model.getValueAt(tblDisplayPerson.getSelectedRow(), 1).toString();
        String age = model.getValueAt(tblDisplayPerson.getSelectedRow(), 2).toString();
        String address= model.getValueAt(tblDisplayPerson.getSelectedRow(), 3).toString();
        String city = model.getValueAt(tblDisplayPerson.getSelectedRow(), 4).toString();
        String community = model.getValueAt(tblDisplayPerson.getSelectedRow(), 5).toString();
         String gender = model.getValueAt(tblDisplayPerson.getSelectedRow(), 6).toString();
        
        txtName.setText(name);
        txtMedicalRecordNo.setText(medicalRecordNo);
        txtAge.setText(age);
        txtAddress.setText(address);
        txtCity.setText(city);
        txtCommunity.setText(community);
        txtGender.setText(gender);
        
    }//GEN-LAST:event_tblDisplayPersonMouseClicked

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        int medicalRecordNo = Integer.parseInt(txtMedicalRecordNo.getText());
        int age = Integer.parseInt(txtAge.getText());
        String address = (txtAddress.getText());
        String community = txtCommunity.getText();
        String city = txtCity.getText();
        Integer bloodPressure = Integer.parseInt(txtBP.getText());
        String gender = txtGender.getText();
             
        VitalSign newVitals = vitalSignsHistory.addNewVitalSigns();
        Patient newPatient = patients.getPatients().stream().filter(p -> p.getMedicalRecordNo() == medicalRecordNo).findFirst().orElse(null);
        if (newPatient == null){
            newPatient = patients.addNewPatient();
        }
        for (Patient p: patients.getPatients()) {
            if (p.getMedicalRecordNo() == medicalRecordNo) {
                JOptionPane.showMessageDialog(this, "The patient is already registered as a patient!\nVital Signs has been registered again!");
        
                Date encounter = new Date();
              
                newVitals.setName(name);
                newVitals.setMedicalRecordNo(medicalRecordNo);
                newVitals.setAge(age);
                newVitals.setAddress(address);
                newVitals.setCommunity(community);
                newVitals.setCity(city);
                newVitals.setBloodPressure(bloodPressure);
                newVitals.setReportedDate(encounter);  
                newVitals.setGender(gender);

                txtName.setText("");
                txtMedicalRecordNo.setText("");
                txtAge.setText("");
                txtAddress.setText("");
                txtCommunity.setText("");
                txtCity.setText("");
                txtBP.setText(""); 
                txtGender.setText("");
                break;
            } 
            else {                              
                    newPatient.setName(name);                
                    newPatient.setMedicalRecordNo(medicalRecordNo);                
                    newPatient.setAge(age);
                    newPatient.setAddress(address);
                    newPatient.setCommunity(community);
                    newPatient.setCity(city);
                    newPatient.setBloodPressure(bloodPressure);
                    newPatient.setGender(gender);
                    
                Date encounter = new Date();          
                newVitals.setName(name);            
                newVitals.setMedicalRecordNo(medicalRecordNo);            
                newVitals.setAge(age); 
                newVitals.setAddress(address);
                newVitals.setCommunity(community);            
                newVitals.setCity(city);            
                newVitals.setBloodPressure(bloodPressure);            
                newVitals.setReportedDate(encounter);
                newVitals.setGender(gender);

                txtName.setText("");            
                txtMedicalRecordNo.setText("");            
                txtAge.setText("");  
                txtAddress.setText("");
                txtCommunity.setText("");            
                txtCity.setText("");            
                txtBP.setText("");
                txtGender.setText("");
                JOptionPane.showMessageDialog(this, "Patient has been registered!");
            break;
            }
        }
            
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityActionPerformed

    private void txtMedicalRecordNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicalRecordNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicalRecordNoActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model =(DefaultTableModel)tblDisplayPerson.getModel();
         try{
        int selectedRowIndex = tblDisplayPerson.getSelectedRow();
        model.removeRow(selectedRowIndex);
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null , e);
         }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void populatePersonTable() {
        DefaultTableModel model = (DefaultTableModel) tblDisplayPerson.getModel();
        model.setRowCount(0);

            
        for(Person p: persons.getPersons()) {
            Object[] row = new Object[7];
            row[0] = p;
            row[1] = p.getMedicalRecordNo();
            row[2] = p.getAge();
            row[3] = p.getAddress();
            row[4] = p.getCity();
            row[5] = p.getCommunity();
            row[6] = p.getGender();

            model.addRow(row);
        }   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblMedicalRecordNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblDisplayPerson;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBP;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtMedicalRecordNo;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}