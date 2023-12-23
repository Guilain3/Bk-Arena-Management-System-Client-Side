/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Model.Department;
import Model.Staff;
import Service.DepartmentService;
import Service.StaffService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;


/**
 *
 * @author Guilaine
 */
public class Staff_Frame extends javax.swing.JFrame {
    private JTable table;
    private Timer timer;


    /**
     * Creates new form Staff_Frame
     */
    public Staff_Frame() {
        initComponents();
        addComboItem();  
    }
    private void addComboItem(){
        try {
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1" ,5000);
            DepartmentService service=(DepartmentService) theRegistry.lookup("dep");
            List<Department> departs=service.Departmentall();
            Department selectDepartment = new Department();
            selectDepartment.setDep_name("Select");
            combostaff.addItem(selectDepartment);
            for (Department thedepart : departs){
                combostaff.addItem(thedepart); 
            }
        } catch (Exception ex) {
            ex.printStackTrace();
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        staffageTxt = new javax.swing.JTextField();
        staffaddressTxt = new javax.swing.JTextField();
        staffIdTxt = new javax.swing.JTextField();
        stafffirstnameTxt = new javax.swing.JTextField();
        StafflastnameTxt = new javax.swing.JTextField();
        staffregisterbtn = new javax.swing.JButton();
        Staffupdatebtn = new javax.swing.JButton();
        Staffdeletebtn = new javax.swing.JButton();
        staffclearbtn = new javax.swing.JButton();
        searchidtxt = new javax.swing.JTextField();
        retrieveallstaffbtn = new javax.swing.JButton();
        combostaff = new javax.swing.JComboBox<>();
        searchstaff = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        staffclicked = new javax.swing.JLabel();
        eventsclicked = new javax.swing.JLabel();
        collaboratorsclicked = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logoutmouseclicked = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("STAFF MANAGEMENT");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Staff ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Stafff Last Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Staff Address:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Staff First Name:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Staff Age:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Staff  Department:");

        staffageTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staffageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffageTxtActionPerformed(evt);
            }
        });

        staffaddressTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staffaddressTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffaddressTxtActionPerformed(evt);
            }
        });

        staffIdTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        stafffirstnameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        StafflastnameTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        StafflastnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StafflastnameTxtActionPerformed(evt);
            }
        });

        staffregisterbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staffregisterbtn.setText("Register");
        staffregisterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffregisterbtnActionPerformed(evt);
            }
        });

        Staffupdatebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Staffupdatebtn.setText("Update");
        Staffupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffupdatebtnActionPerformed(evt);
            }
        });

        Staffdeletebtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Staffdeletebtn.setText("Delete");
        Staffdeletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffdeletebtnActionPerformed(evt);
            }
        });

        staffclearbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staffclearbtn.setText("Clear");
        staffclearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffclearbtnActionPerformed(evt);
            }
        });

        searchidtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        retrieveallstaffbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        retrieveallstaffbtn.setText("Retrieve all staff");
        retrieveallstaffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieveallstaffbtnActionPerformed(evt);
            }
        });

        combostaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        searchstaff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchstaff.setText("Search");
        searchstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchstaffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(staffregisterbtn)
                                    .addGap(52, 52, 52)
                                    .addComponent(retrieveallstaffbtn)
                                    .addGap(74, 74, 74)
                                    .addComponent(staffclearbtn)
                                    .addGap(25, 25, 25))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(368, 368, 368)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(93, 93, 93))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(searchidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(searchstaff)
                                        .addGap(38, 38, 38)
                                        .addComponent(Staffupdatebtn))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(stafffirstnameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(staffIdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(StafflastnameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(staffaddressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(staffageTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                        .addComponent(combostaff, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(60, 60, 60)))
                        .addComponent(Staffdeletebtn)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Staffupdatebtn)
                    .addComponent(Staffdeletebtn)
                    .addComponent(searchstaff))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(staffIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stafffirstnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StafflastnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staffaddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(staffageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(combostaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retrieveallstaffbtn)
                    .addComponent(staffregisterbtn)
                    .addComponent(staffclearbtn))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 890, 690));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 170));

        staffclicked.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        staffclicked.setForeground(new java.awt.Color(240, 240, 240));
        staffclicked.setText("Manage Staff");
        staffclicked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffclickedMouseClicked(evt);
            }
        });

        eventsclicked.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        eventsclicked.setForeground(new java.awt.Color(240, 240, 240));
        eventsclicked.setText("Manage Events");
        eventsclicked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventsclickedMouseClicked(evt);
            }
        });

        collaboratorsclicked.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        collaboratorsclicked.setForeground(new java.awt.Color(240, 240, 240));
        collaboratorsclicked.setText("Manage Collaborators");
        collaboratorsclicked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                collaboratorsclickedMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilaine\\Pictures\\Bk Arena\\Bk arena.jpg")); // NOI18N

        logoutmouseclicked.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logoutmouseclicked.setForeground(new java.awt.Color(240, 240, 240));
        logoutmouseclicked.setText("LOGOUT");
        logoutmouseclicked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutmouseclickedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(logoutmouseclicked))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(collaboratorsclicked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(eventsclicked)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(staffclicked))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staffclicked)
                .addGap(18, 18, 18)
                .addComponent(eventsclicked)
                .addGap(18, 18, 18)
                .addComponent(collaboratorsclicked)
                .addGap(18, 18, 18)
                .addComponent(logoutmouseclicked)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 280, 690));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Guilaine\\Pictures\\Arena enough size\\pexels-wendy-wei-1047940  1.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffclickedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffclickedMouseClicked
        // TODO add your handling code here:
        Staff_Frame staff=new Staff_Frame();
        staff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_staffclickedMouseClicked

    private void eventsclickedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventsclickedMouseClicked
        // TODO add your handling code here:
        Events_Frame event=new Events_Frame();
        event.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_eventsclickedMouseClicked

    private void collaboratorsclickedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_collaboratorsclickedMouseClicked
        // TODO add your handling code here:
        Collaborators_frame colla=new Collaborators_frame();
        colla.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_collaboratorsclickedMouseClicked

    private void StafflastnameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StafflastnameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StafflastnameTxtActionPerformed

    private void staffaddressTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffaddressTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffaddressTxtActionPerformed

    private void staffageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffageTxtActionPerformed

    private void StaffupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffupdatebtnActionPerformed
        // TODO add your handling code here:
       // Validations
// 1. ID mandatory
if (staffIdTxt.getText().trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, " staff ID is mandatory!", "Mandatory field", JOptionPane.WARNING_MESSAGE);
} else if (searchidtxt.getText().trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, "ID is mandatory!", "Mandatory field", JOptionPane.WARNING_MESSAGE);
}
else if (staffIdTxt.getText().trim().length() != 5) {
    JOptionPane.showMessageDialog(this, "Staff ID must be exactly 5 characters long!", "Invalid input", JOptionPane.ERROR_MESSAGE);
} else {
    // 2. Age should be a valid integer
    if (staffageTxt.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Age is mandatory!", "Mandatory field", JOptionPane.WARNING_MESSAGE);
    }  else {
            try {
                Registry theregistry = LocateRegistry.getRegistry("127.0.0.1" ,5000);
                StaffService service=(StaffService)theregistry.lookup("st");
                Staff thestaff=new Staff();
                thestaff.setStaffid(searchidtxt.getText());
                thestaff.setStaffid(staffIdTxt.getText());
                thestaff.setFirstname(stafffirstnameTxt.getText());
                thestaff.setLastname(StafflastnameTxt.getText());
                thestaff.setS_address(staffaddressTxt.getText());
                thestaff.setS_age(staffageTxt.getText());
                Department selectedDepart=(Department) combostaff.getSelectedItem();
                thestaff.setDepartments(selectedDepart);
                Staff stobj=service.modifyStaff(thestaff);
                if(stobj!= null){
                    JOptionPane.showMessageDialog(this, "staff Updated!");
                }else{
                    JOptionPane.showMessageDialog(this, "Staff not Updated! Try again.");
                }
            } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}    
    }//GEN-LAST:event_StaffupdatebtnActionPerformed

    private void staffregisterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffregisterbtnActionPerformed
        // TODO add your handling code here:
        //validations
        //1.Mandatory fields
        if (staffIdTxt.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "ID is mandatory!", "Mandatory field", JOptionPane.WARNING_MESSAGE);
    } else if (stafffirstnameTxt.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "First Name is mandatory!", "Mandatory field", JOptionPane.WARNING_MESSAGE);
    } else if (StafflastnameTxt.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Last Name is mandatory!", "Mandatory field", JOptionPane.WARNING_MESSAGE);
    } else if (staffaddressTxt.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Address is mandatory!", "Mandatory field", JOptionPane.WARNING_MESSAGE);
    } else if (staffageTxt.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Age is mandatory!", "Mandatory field", JOptionPane.WARNING_MESSAGE);
    } else if (staffIdTxt.getText().trim().length() != 5) {
        JOptionPane.showMessageDialog(this, "Staff ID must be exactly 5 characters long!", "Invalid input", JOptionPane.ERROR_MESSAGE);
    }   else {
            try {
                Registry theregistry = LocateRegistry.getRegistry("127.0.0.1" ,5000);
                StaffService service=(StaffService)theregistry.lookup("st");
                Staff thestaff=new Staff();
                thestaff.setStaffid(staffIdTxt.getText());
                thestaff.setFirstname(stafffirstnameTxt.getText());
                thestaff.setLastname(StafflastnameTxt.getText());
                thestaff.setS_address(staffaddressTxt.getText());
                thestaff.setS_age(staffageTxt.getText());
                Department selectedDepart=(Department) combostaff.getSelectedItem();
                thestaff.setDepartments(selectedDepart);
                 if ("Select".equals(selectedDepart.getDep_name())) {
    JOptionPane.showMessageDialog(this, "Select your department to continue!", "Mandatory Field", JOptionPane.WARNING_MESSAGE);
}
                Staff stobj=service.recordStaff(thestaff);
                if(stobj!=null){
                    JOptionPane.showMessageDialog(this, "staff registered!");
                }else{
                    JOptionPane.showMessageDialog(this, "Staff not registered! Try again.");
                }
            } catch (Exception ex) {
            ex.printStackTrace();
            }
            }
    }//GEN-LAST:event_staffregisterbtnActionPerformed

    private void staffclearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffclearbtnActionPerformed
        // TODO add your handling code here:
        stafffirstnameTxt.setEditable(true);
        StafflastnameTxt.setEditable(true);
        staffaddressTxt.setEditable(true);
        staffageTxt.setEditable(true);
        combostaff.setEditable(true);
        searchidtxt.setText("");
    staffIdTxt.setText("");
    stafffirstnameTxt.setText("");
    StafflastnameTxt.setText("");
    staffaddressTxt.setText("");
    staffageTxt.setText("");
    combostaff.setSelectedIndex(0);
    }//GEN-LAST:event_staffclearbtnActionPerformed

    private void StaffdeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffdeletebtnActionPerformed
        // TODO add your handling code here:
        if (searchidtxt.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "ID is mandatory!", "Mandatory field", JOptionPane.WARNING_MESSAGE);
    }  else
    {
            try {
                Registry theregistry = LocateRegistry.getRegistry("127.0.0.1" ,5000);
                StaffService service=(StaffService)theregistry.lookup("st");
                Staff thestaff=new Staff();
                thestaff.setStaffid(searchidtxt.getText());
                Staff stobj=service.removeStaff(thestaff);
             if (stobj!=null) {
            stafffirstnameTxt.setEditable(false);
            StafflastnameTxt.setEditable(false);
            staffaddressTxt.setEditable(false);
            staffageTxt.setEditable(false);
            combostaff.setEditable(false);
            staffIdTxt.setEditable(false);
                JOptionPane.showMessageDialog(this, "Staff's information deleted successfully!", "Deletion Successful", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Staff's information not deleted", "Deletion Failed", JOptionPane.ERROR_MESSAGE);
            }
            } catch (Exception ex) {
                    ex.printStackTrace();            
            }
    }
    }//GEN-LAST:event_StaffdeletebtnActionPerformed

    private void logoutmouseclickedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutmouseclickedMouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION);
    if (choice == JOptionPane.YES_OPTION) {
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_logoutmouseclickedMouseClicked

    private void searchstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchstaffActionPerformed
                                               
        // TODO add your handling code here:
        if (searchidtxt.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "ID is mandatory!", "Mandatory field", JOptionPane.WARNING_MESSAGE);
    } 
    //else if (staffIdTxt.getText().trim().length() != 5) {
    //JOptionPane.showMessageDialog(this, "Staff ID must be exactly 5 characters long!", "Invalid input", JOptionPane.ERROR_MESSAGE);
    //}
    else {
            try {
                Registry theregistry = LocateRegistry.getRegistry("127.0.0.1" ,5000);
                StaffService service=(StaffService)theregistry.lookup("st");
                Staff thestaff=new Staff();
                thestaff.setStaffid(searchidtxt.getText());
                //thestaff.setStaffid(searchidtxt.getText());
                Staff stobj=service.findidStaff(thestaff);
                if (stobj!=null){
                    staffIdTxt.setText(stobj.getStaffid());
                    stafffirstnameTxt.setText(stobj.getFirstname());
                StafflastnameTxt.setText(stobj.getLastname());
                staffaddressTxt.setText(stobj.getS_address());
                staffageTxt.setText(String.valueOf(stobj.getS_age()));
                Department department = stobj.getDepartments();
                if (department != null) {
        combostaff.setSelectedItem(department);
    } else {
        combostaff.setSelectedIndex(-1);
    }
            //combostaff.setSelectedItem(stobj.getDepartments());
                
            // Disable editing of the text fields
            staffIdTxt.setEditable(false);
            stafffirstnameTxt.setEditable(false);
            StafflastnameTxt.setEditable(false);
            staffaddressTxt.setEditable(false);
            staffageTxt.setEditable(false);
            combostaff.setEditable(false);
                }else{
                stafffirstnameTxt.setText("");
                StafflastnameTxt.setText("");
                staffaddressTxt.setText("");
                staffageTxt.setText("");
                combostaff.setSelectedIndex(-1);
                JOptionPane.showMessageDialog(this, "Staff not found");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }    
    }
    }//GEN-LAST:event_searchstaffActionPerformed

    private void retrieveallstaffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieveallstaffbtnActionPerformed
        // TODO add your handling code here:
        Retrievestaff_Frame ret=new Retrievestaff_Frame();
        ret.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_retrieveallstaffbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Staff_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Staffdeletebtn;
    private javax.swing.JTextField StafflastnameTxt;
    private javax.swing.JButton Staffupdatebtn;
    private javax.swing.JLabel collaboratorsclicked;
    private javax.swing.JComboBox<Department> combostaff;
    private javax.swing.JLabel eventsclicked;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoutmouseclicked;
    private javax.swing.JButton retrieveallstaffbtn;
    private javax.swing.JTextField searchidtxt;
    private javax.swing.JButton searchstaff;
    private javax.swing.JTextField staffIdTxt;
    private javax.swing.JTextField staffaddressTxt;
    private javax.swing.JTextField staffageTxt;
    private javax.swing.JButton staffclearbtn;
    private javax.swing.JLabel staffclicked;
    private javax.swing.JTextField stafffirstnameTxt;
    private javax.swing.JButton staffregisterbtn;
    // End of variables declaration//GEN-END:variables
}
