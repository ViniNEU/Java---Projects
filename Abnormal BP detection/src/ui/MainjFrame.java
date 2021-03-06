
package ui;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSigns;

/**
 *
 * @author Vini
 */
public class MainjFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainjFrame
     */
    
    PersonDirectory persons;
    PatientDirectory patients;
    VitalSigns vitalSignsHistory;
    File selectedFile = null;
    public MainjFrame() throws IOException{
        initComponents();
        this.persons = new PersonDirectory();
        this.patients = new PatientDirectory();
        this.vitalSignsHistory = new VitalSigns();
        Person p = persons.addNewPerson();
         p.setName("def");
        p.setMedicalRecordNo(1);
        p.setAge(43);
        p.setAddress("123 ccc");
        p.setCity("new york");
        p.setCommunity("Roxbury");
        p.setGender("MALE");
        
        p = persons.addNewPerson();
        p.setName("abc");
        p.setMedicalRecordNo(2);
        p.setAge(33);
        p.setAddress("123 ddd");
        p.setCity("boston");
        p.setCommunity("Roxbury");
        p.setGender("FEMALE");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnAddPerson = new javax.swing.JButton();
        btnDisplayPerson = new javax.swing.JButton();
        btnDisplayPatient = new javax.swing.JButton();
        btnViewHistoricRecords = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 25, 800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        splitPane.setDividerLocation(200);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnDisplayPerson.setText("View Person");
        btnDisplayPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayPersonActionPerformed(evt);
            }
        });

        btnDisplayPatient.setText("View Patients");
        btnDisplayPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayPatientActionPerformed(evt);
            }
        });

        btnViewHistoricRecords.setText("View Historty Of Patient");
        btnViewHistoricRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHistoricRecordsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDisplayPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDisplayPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewHistoricRecords, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btnAddPerson)
                .addGap(18, 18, 18)
                .addComponent(btnDisplayPerson)
                .addGap(22, 22, 22)
                .addComponent(btnDisplayPatient)
                .addGap(18, 18, 18)
                .addComponent(btnViewHistoricRecords)
                .addContainerGap(461, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        AddPersonjFrame addPersonjFrame = new AddPersonjFrame(persons);
        splitPane.setRightComponent(addPersonjFrame);
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnDisplayPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayPersonActionPerformed
        // TODO add your handling code here:
        ViewPersonjPanel displayPersonPanel = new ViewPersonjPanel(persons, patients, vitalSignsHistory);
        splitPane.setRightComponent(displayPersonPanel);
    }//GEN-LAST:event_btnDisplayPersonActionPerformed

    private void btnDisplayPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayPatientActionPerformed
        // TODO add your handling code here:
        ViewPatientjPanel displayPatientPanel = new ViewPatientjPanel(patients, vitalSignsHistory);
        splitPane.setRightComponent(displayPatientPanel);
    }//GEN-LAST:event_btnDisplayPatientActionPerformed

    private void btnViewHistoricRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHistoricRecordsActionPerformed
        // TODO add your handling code here:
        HistoryRecordjPanel historyRecordPanel = new HistoryRecordjPanel(vitalSignsHistory);
        splitPane.setRightComponent(historyRecordPanel);
    }//GEN-LAST:event_btnViewHistoricRecordsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 try {
                new MainjFrame().setVisible(true);
                 }catch (IOException ex) {
                        Logger.getLogger(MainjFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnDisplayPatient;
    private javax.swing.JButton btnDisplayPerson;
    private javax.swing.JButton btnViewHistoricRecords;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
