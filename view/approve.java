
package view;
import model.*;
import DAO.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP-
 */
public class approve extends javax.swing.JInternalFrame {

    /**
     * Creates new form approve
     */
    public approve() {
        initComponents();
        addintable();
        
    }

    private void addintable()
{
    appointmentDao dao = new appointmentDao();
    DefaultTableModel tableModel = (DefaultTableModel) patientTable.getModel();
    List<Appointment> appoints = dao.alldata();
    tableModel.setRowCount(0);
    if(appoints !=null){
    for (Appointment app : appoints){
      tableModel.addRow(new Object[]{
          app.getFullName(),
          app.getAppDate(),
          app.getStatus(),
          app.getGender(),
          app.getDescription()
    });  
}
}
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fullnameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        approveBtn = new javax.swing.JButton();
        DenyBtn = new javax.swing.JButton();
        fullNameSearchTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Patient Approve or Deny For Appointment");

        fullnameTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 2, true));

        jLabel2.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jLabel2.setText("Patient Full Names:");

        approveBtn.setBackground(new java.awt.Color(0, 153, 153));
        approveBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        approveBtn.setForeground(new java.awt.Color(255, 255, 255));
        approveBtn.setText("Approve");
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });

        DenyBtn.setBackground(new java.awt.Color(255, 102, 102));
        DenyBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        DenyBtn.setForeground(new java.awt.Color(255, 255, 255));
        DenyBtn.setText("Deny");
        DenyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DenyBtnActionPerformed(evt);
            }
        });

        fullNameSearchTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 2, true));

        searchBtn.setBackground(new java.awt.Color(0, 51, 51));
        searchBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search Patient");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(DenyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(approveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fullNameSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addComponent(searchBtn)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fullnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DenyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNameSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Names", "Appointment Date", "Status", "Gender", "Description"
            }
        ));
        jScrollPane1.setViewportView(patientTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(962, 962, 962))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        if(fullNameSearchTxt.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Fill in The name So that You can Find Patient","Required Field",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Appointment appoint = new Appointment();
            appoint.setFullName(fullNameSearchTxt.getText());
            appointmentDao dao = new appointmentDao();
            Appointment result = dao.searchpatient(appoint);
            if(result !=null)
            {
                fullnameTxt.setText(result.getFullName());
            }
            else
                JOptionPane.showMessageDialog(this, "No Data Found");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed
        Appointment appoint = new Appointment();
        appoint.setFullName(fullnameTxt.getText());
        appointmentDao dao = new appointmentDao();
        String feedback = dao.requestapprove(appoint);
        JOptionPane.showMessageDialog(this, feedback);
        addintable();
    }//GEN-LAST:event_approveBtnActionPerformed

    private void DenyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DenyBtnActionPerformed
        Appointment appoint = new Appointment();
        appoint.setFullName(fullnameTxt.getText());
        appointmentDao dao = new appointmentDao();
        String feedback = dao.requestdeny(appoint);
        JOptionPane.showMessageDialog(this, feedback);
        addintable();
    }//GEN-LAST:event_DenyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DenyBtn;
    private javax.swing.JButton approveBtn;
    private javax.swing.JTextField fullNameSearchTxt;
    private javax.swing.JTextField fullnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}
