
package ui;

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
public class HistoryRecordjPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayPersonJpanel
     */
    
    int currentSelectedRow;
    VitalSigns vitalSignsHistory;
    
    public HistoryRecordjPanel(VitalSigns vitalSignsHistory) {
        initComponents();     
        this.currentSelectedRow = 0;
        this.vitalSignsHistory = vitalSignsHistory;
        
        populateHistoryTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        lblCreate1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Medical Record No", "Age", "Address", "City", "Community", "BP", "Encounter Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVitalSigns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVitalSignsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblVitalSigns);
        if (tblVitalSigns.getColumnModel().getColumnCount() > 0) {
            tblVitalSigns.getColumnModel().getColumn(5).setPreferredWidth(140);
            tblVitalSigns.getColumnModel().getColumn(6).setPreferredWidth(150);
        }

        lblCreate1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCreate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreate1.setText("Patient Vital Signs History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblCreate1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(401, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblVitalSignsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVitalSignsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblVitalSignsMouseClicked
    
    public void populateHistoryTable() {
        DefaultTableModel model = (DefaultTableModel) tblVitalSigns.getModel();
        model.setRowCount(0);
            
        for(VitalSign p: vitalSignsHistory.getVitalSignsHistory()) {
            Object[] row = new Object[8];
            row[0] = p;
            row[1] = p.getMedicalRecordNo();
            row[2] = p.getAge();
            row[3] = p.getAddress();
            row[4] = p.getCity();
            row[5] = p.getCommunity();
            row[6] = p.getBloodPressure();
            row[7] = p.getReportedDate();

            model.addRow(row);
        }   
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCreate1;
    private javax.swing.JTable tblVitalSigns;
    // End of variables declaration//GEN-END:variables
}
