package personas.test;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import personas.jdbc.PersonaDaoJDBC;
import personas.dto.PersonaDTO;

public class app extends javax.swing.JFrame {

    static PersonaDaoJDBC manager = new PersonaDaoJDBC();

    public app() {
        initComponents();
        tipUpdate.setVisible(false);
        setTitle("myCRUD");
        setLocationRelativeTo(null);
        PanelTabla.setVisible(false);
        closeTable.setVisible(false);
        setSize(400, 330);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myPanel = new javax.swing.JPanel();
        myComboBox = new javax.swing.JComboBox<>();
        id_persona = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submit_btn = new javax.swing.JButton();
        tipUpdate = new javax.swing.JLabel();
        PanelTabla = new javax.swing.JScrollPane();
        tablaDB = new javax.swing.JTable();
        closeTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una Opcion", "SELECT", "UPDATE", "DELETE", "INSERT" }));
        myComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myComboBoxActionPerformed(evt);
            }
        });

        id_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_personaActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Persona");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 1, 48)); // NOI18N
        jLabel5.setText("CRUD");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        submit_btn.setText("Submit");
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        tipUpdate.setText("Ingrese el ID que quiera reemplazar");

        tablaDB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID persona", "Nombre", "Apellido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PanelTabla.setViewportView(tablaDB);

        closeTable.setText("Cerrar");
        closeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout myPanelLayout = new javax.swing.GroupLayout(myPanel);
        myPanel.setLayout(myPanelLayout);
        myPanelLayout.setHorizontalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, myPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelLayout.createSequentialGroup()
                        .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelLayout.createSequentialGroup()
                        .addComponent(tipUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(closeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(myPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        myPanelLayout.setVerticalGroup(
            myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, myPanelLayout.createSequentialGroup()
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(myComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(myPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(myPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(submit_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(PanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myComboBoxActionPerformed
        int eleccion = myComboBox.getSelectedIndex();
        switch (eleccion) {
            case 0:
                tipUpdate.setVisible(false);
                nombre.setEnabled(true);
                id_persona.setEnabled(true);
                apellido.setEnabled(true);
                break;
            case 1:
                nombre.setEnabled(false);
                id_persona.setEnabled(false);
                apellido.setEnabled(false);
                break;
            case 2:
                tipUpdate.setVisible(true);
                break;
            case 3:
                nombre.setEnabled(false);
                apellido.setEnabled(false);
            case 4:
                id_persona.setEnabled(false);
        }

    }//GEN-LAST:event_myComboBoxActionPerformed

    private void id_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_personaActionPerformed
    }//GEN-LAST:event_id_personaActionPerformed

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed

        int operation = myComboBox.getSelectedIndex();
        String name;
        String lastName;
        int ID;
        PersonaDTO newPersona;
        switch (operation) {
            case 1:
                refreshTable();
                PanelTabla.setVisible(true);
                closeTable.setVisible(true);
                this.setSize(400, 650);

                break;
            case 2:
                name = nombre.getText();
                lastName = apellido.getText();
                ID = Integer.parseInt(id_persona.getText());
                newPersona = new PersonaDTO(ID, name, lastName);
                manager.update(newPersona);
                JOptionPane.showMessageDialog(myPanel, "UPDATE realizado correctamente");
                refreshTable();
                break;
            case 3:
                name = "-";
                lastName = "-";
                ID = Integer.parseInt(id_persona.getText());
                newPersona = new PersonaDTO(ID, name, lastName);
                manager.delete(newPersona);
                JOptionPane.showMessageDialog(myPanel, "DELETE realizado correctamente");
                refreshTable();
                break;
            case 4:
                name = nombre.getText();
                lastName = apellido.getText();
                ID = 0;
                newPersona = new PersonaDTO(ID, name, lastName);
                manager.insert(newPersona);
                JOptionPane.showMessageDialog(myPanel, "INSERT realizado correctamente");
                refreshTable();
                break;
        }
        myComboBox.setSelectedIndex(0);
        if (!id_persona.getText().equals("")) {
            id_persona.setText("");
        }
        if (!nombre.getText().equals("")) {
            nombre.setText("");
        }
        if (!apellido.getText().equals("")) {
            apellido.setText("");
        }
    }//GEN-LAST:event_submit_btnActionPerformed

    private void closeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeTableActionPerformed
        PanelTabla.setVisible(false);
        closeTable.setVisible(false);
        setSize(400, 330);
    }//GEN-LAST:event_closeTableActionPerformed

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
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new app().setVisible(true);
            }
        });
    }

    public void refreshTable() {
        List<PersonaDTO> datos = new ArrayList<>();
        datos = manager.select();
        String[][] matrix = new String[datos.size()][3];
        for (int i = 0; i < datos.size(); i++) {
            matrix[i][0] = String.valueOf(datos.get(i).getId());
            matrix[i][1] = datos.get(i).getNombre();
            matrix[i][2] = datos.get(i).getApellido();
        }
        tablaDB.setModel(new javax.swing.table.DefaultTableModel(
                matrix,
                new String[]{
                    "ID persona", "Nombre", "Apellido"
                }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PanelTabla;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton closeTable;
    private javax.swing.JTextField id_persona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> myComboBox;
    private javax.swing.JPanel myPanel;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton submit_btn;
    private javax.swing.JTable tablaDB;
    private javax.swing.JLabel tipUpdate;
    // End of variables declaration//GEN-END:variables
}
