/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.view;

import hospitalmanagementsystem.controller.OutpatientController;
import hospitalmanagementsystem.controller.PatientController;
import hospitalmanagementsystem.model.InPatient;
import hospitalmanagementsystem.model.OutPatient;
import hospitalmanagementsystem.model.Patient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class UpdatePatient extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdatePatient
     */
    public UpdatePatient() {
        initComponents();
        //inpatientPanal.setVisible(false);
        //outPatientPanal.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patient = new javax.swing.ButtonGroup();
        inpatientPanal = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ward_number = new javax.swing.JComboBox<>();
        bed_no = new javax.swing.JTextField();
        d_id = new javax.swing.JTextField();
        admitted_date = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        reason_patient = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        patient_name = new javax.swing.JLabel();
        patient_gender = new javax.swing.JLabel();
        patient_nic = new javax.swing.JLabel();
        patient_dob = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        outpatient = new javax.swing.JRadioButton();
        inpatient = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        patient_id = new javax.swing.JTextField();
        search_patient = new javax.swing.JButton();
        outPatientPanal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        doctorId = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        Oreason = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Omedicin = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 255));

        inpatientPanal.setBackground(new java.awt.Color(153, 204, 255));
        inpatientPanal.setPreferredSize(new java.awt.Dimension(620, 564));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Ward number :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Bed number   :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Doctor id       :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Date admited :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Reason         :");

        ward_number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ward_number.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "01", "02", "03", "04", "05", " " }));

        bed_no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        d_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        admitted_date.setDateFormatString("yyyy-MM-dd");

        reason_patient.setColumns(20);
        reason_patient.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        reason_patient.setRows(5);
        jScrollPane1.setViewportView(reason_patient);

        javax.swing.GroupLayout inpatientPanalLayout = new javax.swing.GroupLayout(inpatientPanal);
        inpatientPanal.setLayout(inpatientPanalLayout);
        inpatientPanalLayout.setHorizontalGroup(
            inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inpatientPanalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inpatientPanalLayout.createSequentialGroup()
                        .addGroup(inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(30, 30, 30)
                        .addGroup(inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ward_number, 0, 69, Short.MAX_VALUE)
                            .addComponent(d_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bed_no, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(inpatientPanalLayout.createSequentialGroup()
                        .addGroup(inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addGap(33, 33, 33)
                        .addGroup(inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(admitted_date, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        inpatientPanalLayout.setVerticalGroup(
            inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inpatientPanalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inpatientPanalLayout.createSequentialGroup()
                        .addGroup(inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(ward_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(bed_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(d_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14))
                    .addComponent(admitted_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(inpatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inpatientPanalLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Patient Name   :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Patient gender :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Patient NIC      :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Patient Date of birth :");

        patient_name.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        patient_gender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        patient_nic.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        patient_dob.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancel.setText("cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/image/images (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patient_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patient_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(patient_nic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(patient_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patient_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patient_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(patient_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(patient_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        patient.add(outpatient);
        outpatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        outpatient.setText("OutPatient");
        outpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outpatientActionPerformed(evt);
            }
        });

        patient.add(inpatient);
        inpatient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inpatient.setText("InPatient");
        inpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpatientActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Patient id         :");

        search_patient.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_patient.setText("search");
        search_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_patientActionPerformed(evt);
            }
        });

        outPatientPanal.setBackground(new java.awt.Color(153, 204, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Doctor id :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date        :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Reason    :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Medicine  :");

        doctorId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        date.setDateFormatString("yyyy-MM-dd");

        Oreason.setColumns(20);
        Oreason.setRows(5);
        jScrollPane2.setViewportView(Oreason);

        Omedicin.setColumns(20);
        Omedicin.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        Omedicin.setRows(5);
        jScrollPane3.setViewportView(Omedicin);

        javax.swing.GroupLayout outPatientPanalLayout = new javax.swing.GroupLayout(outPatientPanal);
        outPatientPanal.setLayout(outPatientPanalLayout);
        outPatientPanalLayout.setHorizontalGroup(
            outPatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outPatientPanalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(outPatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(outPatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(outPatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(outPatientPanalLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(3, 3, 3)))
                    .addComponent(jLabel9))
                .addGap(52, 52, 52)
                .addGroup(outPatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(doctorId)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        outPatientPanalLayout.setVerticalGroup(
            outPatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outPatientPanalLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(outPatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(outPatientPanalLayout.createSequentialGroup()
                        .addGroup(outPatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(doctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(outPatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(outPatientPanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inpatientPanal, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                    .addComponent(outPatientPanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(226, Short.MAX_VALUE)
                        .addComponent(inpatient)
                        .addGap(27, 27, 27)))
                .addComponent(outpatient)
                .addGap(137, 137, 137)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(patient_id, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(search_patient)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outpatient)
                    .addComponent(inpatient)
                    .addComponent(jLabel1)
                    .addComponent(patient_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_patient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inpatientPanal, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outPatientPanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_patientActionPerformed
        try {
            // TODO add your handling code here:
            Patient patient = new Patient();
            int patientId = Integer.parseInt(patient_id.getText());
            patient.setP_id(patientId);
            ResultSet getpatient = PatientController.getPatient(patient);
            if(getpatient.next()){
                patient_name.setText(getpatient.getString("p_name"));
                patient_gender.setText(getpatient.getString("p_gender"));
                patient_nic.setText(getpatient.getString("p_nic"));
                patient_dob.setText(getpatient.getString("p_dob"));
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "you entered invalid patient id. ","wrong Pass",JOptionPane.ERROR_MESSAGE);
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UpdatePatient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_search_patientActionPerformed

    private void inpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpatientActionPerformed
        // TODO add your handling code here:
        inpatientPanal.setVisible(true);
        outPatientPanal.setVisible(false);
        
    }//GEN-LAST:event_inpatientActionPerformed

    private void outpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outpatientActionPerformed
        // TODO add your handling code here:
        inpatientPanal.setVisible(false);
        outPatientPanal.setVisible(true);
        
    }//GEN-LAST:event_outpatientActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if(inpatient.isSelected()){
            if("".equals(patient_id.getText())){
                JOptionPane.showMessageDialog(rootPane, "patient id can not be empty!");
            }
            else if(d_id.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "doctor id can not be empty. ","wrong Pass",JOptionPane.ERROR_MESSAGE);
               
                }
            else if(reason_patient.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Reason can not be empty. ","wrong Pass",JOptionPane.ERROR_MESSAGE);
               
                }
            else{
            try {
                int inpatient_id = Integer.parseInt(patient_id.getText());
                String wardno = ward_number.getSelectedItem().toString();
                int doctor_Id =Integer.parseInt(d_id.getText());
                String bedNo = bed_no.getText();
                String padmitted_date = ((JTextField)admitted_date.getDateEditor().getUiComponent()).getText();
                //String pdischarged_date =((JTextField)discharge_date.getDateEditor().getUiComponent()).getText();
                String pdischarged_date= "not yet";
                String Reason = reason_patient.getText();
                
                
                
                InPatient inpatient = new InPatient();
                inpatient.setP_id(inpatient_id);
                inpatient.setDoctor_id(doctor_Id);
                inpatient.setBed_number(bedNo);
                inpatient.setDate_admitted(padmitted_date);
                inpatient.setDate_discharge(pdischarged_date);
                inpatient.setDesease(Reason);
                inpatient.setWord_no(wardno);
                
                int  addinpatient = PatientController.addInPatient(inpatient);
                if(addinpatient>0){
                    JOptionPane.showMessageDialog(rootPane, "Patients details entered successfully.!");
                    patient_id.setText("");
                    ward_number.setSelectedItem("");
                    
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "you entered invalid doctor id. ","wrong Pass",JOptionPane.ERROR_MESSAGE);
                
                }
                
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "you entered invalid doctor id. ","wrong Pass",JOptionPane.ERROR_MESSAGE);
                
                Logger.getLogger(UpdatePatient.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }
        else if(outpatient.isSelected()){
            if("".equals(patient_id.getText())){
                JOptionPane.showMessageDialog(rootPane, "patient id can not be empty!");
            }
            
            else{
                try {
                    int outpatient_id = Integer.parseInt(patient_id.getText());
                    int OdotorId = Integer.parseInt(doctorId.getText());
                    String date_o = ((JTextField)date.getDateEditor().getUiComponent()).getText();
                    String reasonO = Oreason.getText();
                    String medicinO = Omedicin.getText();
                    
                    OutPatient outpatient = new OutPatient();
                    
                    outpatient.setP_id(outpatient_id);
                    outpatient.setDoctor_id(OdotorId);
                    outpatient.setDate(date_o);
                    outpatient.setReason(reasonO);
                    outpatient.setMedicine(medicinO);
                    
                    int addoutpatient = OutpatientController.addOutPatient(outpatient);
                    
                    if(addoutpatient>0){
                        JOptionPane.showMessageDialog(rootPane, "Patients details entered successfully.!");
                        patient_id.setText("");
                        doctorId.setText("");
                        Oreason.setText("");
                        Omedicin.setText("");
                        
                    }
                    //to get doctor id is not in the employee list.
                    else{
                    JOptionPane.showMessageDialog(rootPane, "you entered invalid doctor id. ","wrong Pass",JOptionPane.ERROR_MESSAGE);
                
                }
                } catch (ClassNotFoundException | SQLException ex) {
                    //sql query  if there is no doctor id in doctor table 
                    JOptionPane.showMessageDialog(rootPane, "you entered invalid doctor id. ","wrong Pass",JOptionPane.ERROR_MESSAGE);
                
                    //Logger.getLogger(UpdatePatient.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
            
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "select correcte patient type!");
        }
    }//GEN-LAST:event_updateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Omedicin;
    private javax.swing.JTextArea Oreason;
    private com.toedter.calendar.JDateChooser admitted_date;
    private javax.swing.JTextField bed_no;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField d_id;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField doctorId;
    private javax.swing.JRadioButton inpatient;
    private javax.swing.JPanel inpatientPanal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel outPatientPanal;
    private javax.swing.JRadioButton outpatient;
    private javax.swing.ButtonGroup patient;
    private javax.swing.JLabel patient_dob;
    private javax.swing.JLabel patient_gender;
    private javax.swing.JTextField patient_id;
    private javax.swing.JLabel patient_name;
    private javax.swing.JLabel patient_nic;
    private javax.swing.JTextArea reason_patient;
    private javax.swing.JButton search_patient;
    private javax.swing.JButton update;
    private javax.swing.JComboBox<String> ward_number;
    // End of variables declaration//GEN-END:variables
}
