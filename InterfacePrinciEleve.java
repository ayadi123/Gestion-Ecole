/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetpfa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ROCHDI
 */
public class InterfacePrinciEleve extends javax.swing.JFrame {
    Eleve E = new Eleve();
    private String id;
    AjoutEleve a = new AjoutEleve();

    public String getId() {
        int ligne = jTableEleve.getSelectedRow();
      return jTableEleve.getModel().getValueAt(ligne, 10).toString();
    }

    public void updatetable(){
        Eleve[] tabE = null; 
        tabE= Eleve.Afficher_Eleve(tabE);
     
        for (int i=0 ;i<tabE.length;i++)
            jTableEleve.setValueAt(tabE, i, NORMAL);
    
    }
    public InterfacePrinciEleve() {
            
        initComponents();
        updatetable();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCrechercher = new javax.swing.JComboBox<>();
        jTFrechercher = new javax.swing.JTextField();
        jButtonRecher = new javax.swing.JButton();
        jBAjouter = new javax.swing.JButton();
        jBModifier = new javax.swing.JButton();
        jBSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEleve = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jBconsulter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion d'élève");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jCrechercher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nom", "Prenom", "Classe", "Niveau", " " }));

        jButtonRecher.setText("Rechercher");

        jBAjouter.setText("Ajouter");
        jBAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAjouterActionPerformed(evt);
            }
        });

        jBModifier.setText("Modifier");
        jBModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModifierActionPerformed(evt);
            }
        });

        jBSupprimer.setText("Supprimer");
        jBSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSupprimerActionPerformed(evt);
            }
        });

        jTableEleve.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableEleve);

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel1.setText("Rechercher Eleve par : ");

        jBconsulter.setText("Consulter");
        jBconsulter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsulterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jBAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jBModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addComponent(jBconsulter, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jBSupprimer)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCrechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jTFrechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRecher, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCrechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFrechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRecher))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAjouter)
                    .addComponent(jBModifier)
                    .addComponent(jBSupprimer)
                    .addComponent(jBconsulter))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAjouterActionPerformed
        AjoutEleve AJ= new AjoutEleve();
        AJ.setVisible(true);
        AJ.setLocationRelativeTo(null);
        dispose();


    }//GEN-LAST:event_jBAjouterActionPerformed

    private void jBModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModifierActionPerformed
        ModifierEleve me= new ModifierEleve();
        me.setVisible(true);
        me.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jBModifierActionPerformed

    private void jBSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSupprimerActionPerformed
        
        E.SupprimerEleve(getId());
        updatetable();
    }//GEN-LAST:event_jBSupprimerActionPerformed

    private void jBconsulterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsulterActionPerformed
            ConsulterEleve ce = new ConsulterEleve();
            ce.setVisible(true);
            ce.setLocationRelativeTo(null);
            dispose();
    }//GEN-LAST:event_jBconsulterActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrinciEleve().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAjouter;
    private javax.swing.JButton jBModifier;
    private javax.swing.JButton jBSupprimer;
    private javax.swing.JButton jBconsulter;
    private javax.swing.JButton jButtonRecher;
    private javax.swing.JComboBox<String> jCrechercher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFrechercher;
    private javax.swing.JTable jTableEleve;
    // End of variables declaration//GEN-END:variables
}
