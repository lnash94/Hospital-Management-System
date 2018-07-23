/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.view;

import hospitalmanagementsystem.controller.DbConnector;
import hospitalmanagementsystem.controller.PatientController;
import hospitalmanagementsystem.controller.PatientReportController;
import hospitalmanagementsystem.model.Patient;
import hospitalmanagementsystem.model.PatientReport;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import sun.misc.IOUtils;


/**
 *
 * @author PC
 */
public class PatientReportUpdate extends javax.swing.JInternalFrame {

    /**
     * Creates new form PatientReportUpdate
     */
    public PatientReportUpdate() {
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

        report = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        patient_id = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doctor_id = new javax.swing.JTextField();
        reportPath = new javax.swing.JTextField();
        brows = new javax.swing.JButton();
        reportType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        pNmae = new javax.swing.JLabel();
        reportdate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        canclebtn = new javax.swing.JButton();
        searchimage = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        reportImage = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporttable = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Patient id");

        search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Report Type");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Doctor id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Report");

        brows.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        brows.setText("Brows");
        brows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsActionPerformed(evt);
            }
        });

        reportType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("pateint name");

        pNmae.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        reportdate.setDateFormatString("yyyy-MM-dd\n");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Date");

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        canclebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        canclebtn.setText("Cancle");
        canclebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canclebtnActionPerformed(evt);
            }
        });

        searchimage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchimage.setText("search");
        searchimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchimageActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel7.setText("patient report update");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(canclebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(reportdate, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                    .addComponent(reportPath))
                                .addGap(18, 18, 18)
                                .addComponent(brows, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(patient_id, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(search))
                            .addComponent(doctor_id, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pNmae, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reportType, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(searchimage, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(patient_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(pNmae, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doctor_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brows))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(canclebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchimage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        reporttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        reporttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reporttable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reportImage, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser(); 
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        reportPath.setText(filename);
        reportImage.setIcon(ResizeImage(filename,null));
        path =filename;
        
        
        
        
    }//GEN-LAST:event_browsActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            // TODO add your handling code here:
            Patient patient = new Patient();
            int patientId = Integer.parseInt(patient_id.getText());
            patient.setP_id(patientId);
            ResultSet getpatient = PatientController.getPatient(patient);
            if(getpatient.next()){
                pNmae.setText(getpatient.getString("p_name"));
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "you entered invalid patient id. ","wrong Pass",JOptionPane.ERROR_MESSAGE);
                patient_id.setText("");
            
            }
        } catch (ClassNotFoundException | SQLException ex) {
                
            Logger.getLogger(PatientReportUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
      
        InputStream is = null;
        try {
            // TODO add your handling code here:
            Connection conn = DbConnector.connectDb();
            int patientId = Integer.parseInt(patient_id.getText());
            int doctorId = Integer.parseInt(doctor_id.getText());
            String report_Type = reportType.getSelectedItem().toString();
            String date =((JTextField)reportdate.getDateEditor().getUiComponent()).getText();
            //File image = new File(reportImage.getText());
            //FileInputStream fin = new FileInputStream(image);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO patient_report(patient_id, doctor_id, report_date, reportType, report) VALUES (?,?,?,?,?)");
            //input image to database .
            is = new FileInputStream(new File(path));
            ps.setInt(1, patientId);
            ps.setInt(2, doctorId);
            ps.setString(3, date);
            ps.setString(4, report_Type);
            ps.setBlob(5, is);
            if(ps.executeUpdate()==1){
                JOptionPane.showMessageDialog(rootPane,"report added successfully");
                //load table.
                patient_id.setText("");
                doctor_id.setText("");
                reportPath.setText("");
                
                //tableLoad();
            }
            
            /*//byte[] img = File.readAllBytes()
            
            //ByteArrayInputStream img = new ByteArrayInputStream(is.toByteArray());
            
            
            PatientReport report2 = new PatientReport();
            report2.setDoctorId(doctorId);
            report2.setPatientId(patientId);
            report2.setReportType(report_Type);
            report2.setReport_date(date);
            //report2.setReport(img);
            int addReport = PatientReportController.addReport(report2);
            
            
            if(addReport>0 ){
            //if(==1){
            JOptionPane.showMessageDialog(rootPane,"report added successfully");
            }//}*/
        } catch (FileNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "you entered invalid doctor id. ","wrong Pass",JOptionPane.ERROR_MESSAGE);
                
            //Logger.getLogger(PatientReportUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                is.close();
            } catch (IOException ex) {
                Logger.getLogger(PatientReportUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
    }//GEN-LAST:event_addActionPerformed

    private void searchimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchimageActionPerformed
        
        //load report table using patient_id
        tableLoad();
        
        
        
        /**try {
            // TODO add your handling code here:
            int p_id = Integer.parseInt(patient_id.getText());
            
            PatientReport report = new PatientReport();
            report.setPatientId(p_id);
            
            ResultSet getReport = PatientReportController.getReort(report);
            
            if(getReport.next()){
                byte[] img = getReport.getBytes("report");
                ImageIcon image =new ImageIcon(img);
                Image im = image.getImage();
                Image myimg =im.getScaledInstance(reportImage.getWidth(), reportImage.getHeight(),Image.SCALE_SMOOTH );
                ImageIcon newImage = new ImageIcon(myimg);
                reportImage.setIcon(newImage);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PatientReportUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        
        
    }//GEN-LAST:event_searchimageActionPerformed

    private void canclebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canclebtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_canclebtnActionPerformed

    private void reporttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporttableMouseClicked
        // TODO add your handling code here:
        int r = reporttable.getSelectedRow();
        
        
        
    }//GEN-LAST:event_reporttableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton brows;
    private javax.swing.JButton canclebtn;
    private javax.swing.JTextField doctor_id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pNmae;
    private javax.swing.JTextField patient_id;
    private javax.swing.ButtonGroup report;
    private javax.swing.JLabel reportImage;
    private javax.swing.JTextField reportPath;
    private javax.swing.JComboBox<String> reportType;
    private com.toedter.calendar.JDateChooser reportdate;
    private javax.swing.JTable reporttable;
    private javax.swing.JButton search;
    private javax.swing.JButton searchimage;
    // End of variables declaration//GEN-END:variables

    public ImageIcon ResizeImage(String imagepath,byte [] pic){
        
        ImageIcon Myimage = null;
        if(imagepath != null){
            Myimage = new ImageIcon(imagepath);
        }
        else{
            Myimage = new ImageIcon(pic);
        }
        Image img = Myimage.getImage();
        Image newImg = img.getScaledInstance(reportImage.getWidth(), reportImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
       
    }
    
       public void tableLoad() {
        
        try {
            PatientReport report1 = new PatientReport();
            int patientid = Integer.parseInt(patient_id.getText());
            report1.setPatientId(patientid);
            
            ResultSet getReport = PatientReportController.getReort(report1);
            if(getReport.next()){
                reporttable.setModel(DbUtils.resultSetToTableModel(getReport));
                
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "you entered invalid patient id. ","wrong Pass",JOptionPane.ERROR_MESSAGE);
                patient_id.setText("");
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "you entered invalid patient id. ","wrong Pass",JOptionPane.ERROR_MESSAGE);
                patient_id.setText("");
                
            Logger.getLogger(PatientReportUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
      
           
       }
       
       
       
  String path;     

}