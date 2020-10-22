package EMS;

import Service.Coordinator_Service;
import javax.swing.JOptionPane;

/**
 *
 * @author wang cc
 */
public class Coordinator extends javax.swing.JFrame {

    /**
     * Creates new form Coordinator
     */
    private final String name;
    private final String role;

    public Coordinator_Service cord;

    public Coordinator(String name, String role) {
        this.name = name;
        this.role = role;

        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        event_name = new javax.swing.JTextField();
        event_attend = new javax.swing.JTextField();
        add_event = new javax.swing.JButton();
        update_event = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        search_field = new javax.swing.JTextField();
        search_event = new javax.swing.JButton();
        day = new javax.swing.JComboBox();
        month = new javax.swing.JComboBox();
        year = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        event_details = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        event_list = new javax.swing.JList();
        delete_event = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        list_all_email = new javax.swing.JList();
        jSeparator2 = new javax.swing.JSeparator();
        send_mail = new javax.swing.JButton();
        email_subject = new javax.swing.JTextField();
        refresh_event_list = new javax.swing.JButton();
        refresh_user = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        event_name.setText("event name");
        event_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                event_nameActionPerformed(evt);
            }
        });

        event_attend.setText("All");

        add_event.setText("Add Event");
        add_event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_eventActionPerformed(evt);
            }
        });

        update_event.setText("Update Event");
        update_event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_eventActionPerformed(evt);
            }
        });

        search_field.setText("event");
        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });

        search_event.setText("Search");
        search_event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_eventActionPerformed(evt);
            }
        });

        day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.setToolTipText("");

        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Months", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));

        event_details.setColumns(20);
        event_details.setRows(5);
        event_details.setText("add event details");
        jScrollPane1.setViewportView(event_details);

        jScrollPane2.setViewportView(event_list);

        delete_event.setText("Delete Event");
        delete_event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_eventActionPerformed(evt);
            }
        });

        message.setColumns(20);
        message.setRows(5);
        jScrollPane3.setViewportView(message);

        jScrollPane4.setViewportView(list_all_email);

        send_mail.setText("Send Email");
        send_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_mailActionPerformed(evt);
            }
        });

        email_subject.setText("Subject");
        email_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_subjectActionPerformed(evt);
            }
        });

        refresh_event_list.setText("Refresh");
        refresh_event_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_event_listActionPerformed(evt);
            }
        });

        refresh_user.setText("Refresh");
        refresh_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_userActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(send_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(refresh_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(event_attend)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(day, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(event_name)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(search_field)
                                        .addGap(18, 18, 18)
                                        .addComponent(search_event, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1))
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_event, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(update_event)
                                .addGap(145, 145, 145)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete_event, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(refresh_event_list, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logout, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_event, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh_event_list)
                    .addComponent(logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(event_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(event_attend, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete_event, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_event)
                            .addComponent(add_event))))
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(email_subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refresh_user)
                    .addComponent(send_mail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void event_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_event_nameActionPerformed

    private void add_eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_eventActionPerformed
        cord = new Coordinator_Service(this);

        String _day = String.valueOf(day.getSelectedItem());
        String _month = String.valueOf(month.getSelectedItem());
        String _year = String.valueOf(year.getSelectedItem());

        String date = _day + "/" + _month + "/" + _year;
        String group = event_attend.getText();
        String detail = event_details.getText();
        String event_new_name = event_name.getText();

        if (event_name.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter new event name !");
        } else {
            if (detail.trim().length() > 0 || group == "") {
                if (_day.equals("Day") || _month.equals("Month") || _year.equals("Year")) {
                    JOptionPane.showMessageDialog(null, "Select Date!");
                } else {
                    if (cord.add_new_event(event_new_name, detail, group, date) == 1) {
                        JOptionPane.showMessageDialog(null, "Event Added Successfully !");
                    } else {
                        JOptionPane.showMessageDialog(null, "Event already exist !");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, group + " : " + detail + " -- All field are required !");
            }
        }

    }//GEN-LAST:event_add_eventActionPerformed

    private void update_eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_eventActionPerformed
        cord = new Coordinator_Service(this);

        String _day = String.valueOf(day.getSelectedItem());
        String _month = String.valueOf(month.getSelectedItem());
        String _year = String.valueOf(year.getSelectedItem());

        String date = _day + "/" + _month + "/" + _year;
        String group = event_attend.getText();
        String detail = event_details.getText();
        String old_name = search_field.getText();
        String event_new_name = event_name.getText();

        if (search_field.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter previous event name in the search field!");
        } else {
            if (event_name.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Enter new event name !");
            } else {
                if (detail.trim().length() > 0 || group == "") {
                    if (_day.equals("Day") || _month.equals("Month") || _year.equals("Year")) {
                        JOptionPane.showMessageDialog(null, "Select Date!");
                    } else {
                        cord.update_event(old_name, event_new_name, date, detail, group);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "All field are required !");
                }
            }

        }
    }//GEN-LAST:event_update_eventActionPerformed

    private void send_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_send_mailActionPerformed

    private void delete_eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_eventActionPerformed
        cord = new Coordinator_Service(this);

        int idx = event_list.getSelectedIndex();
        String evnt = (String) event_list.getSelectedValue();

        if (idx != -1) {
            cord.delete_event(evnt);
        } else {
            JOptionPane.showMessageDialog(null, "Select an Event please");
        }
    }//GEN-LAST:event_delete_eventActionPerformed

    private void email_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_subjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_subjectActionPerformed

    private void refresh_event_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_event_listActionPerformed
        cord = new Coordinator_Service(this);
        cord.list_all_event();
    }//GEN-LAST:event_refresh_event_listActionPerformed

    private void refresh_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_userActionPerformed
        cord = new Coordinator_Service(this);
        cord.list_all_users();
    }//GEN-LAST:event_refresh_userActionPerformed

    private void search_eventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_eventActionPerformed
        String _name = search_field.getText();
        if (_name.equals("")) {
            JOptionPane.showMessageDialog(null, "Event name Cannot be empty!");
        } else {
            if (cord.search_event(_name)) {
                JOptionPane.showMessageDialog(null, "Found name!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Event name!");
            }
        }
    }//GEN-LAST:event_search_eventActionPerformed

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_fieldActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_event;
    private javax.swing.JComboBox day;
    private javax.swing.JButton delete_event;
    private javax.swing.JTextField email_subject;
    public javax.swing.JTextField event_attend;
    public javax.swing.JTextArea event_details;
    public javax.swing.JList event_list;
    public javax.swing.JTextField event_name;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JList list_all_email;
    private javax.swing.JButton logout;
    private javax.swing.JTextArea message;
    private javax.swing.JComboBox month;
    private javax.swing.JButton refresh_event_list;
    private javax.swing.JButton refresh_user;
    private javax.swing.JButton search_event;
    private javax.swing.JTextField search_field;
    private javax.swing.JButton send_mail;
    private javax.swing.JButton update_event;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables
}
