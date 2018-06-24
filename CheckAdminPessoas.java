/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class CheckAdminPessoas extends javax.swing.JFrame {
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private ArrayList<Local> listaLocais = new ArrayList<>();
    /**
     * Creates new form CheckAdminPessoas
     * @param listaPessoas
     * @param listaLocais
     */
    public CheckAdminPessoas(ArrayList<Pessoa> listaPessoas,ArrayList<Local> listaLocais) {
        this.listaPessoas = listaPessoas;
        this.listaLocais = listaLocais;
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

        jPasswordField1 = new javax.swing.JPasswordField();
        subtituloLabel = new javax.swing.JLabel();
        informacaoLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        confirmarButton = new javax.swing.JButton();
        regressarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso do administrador");

        subtituloLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subtituloLabel.setText("Esta funcionalidade é reservada aos administradores.");

        informacaoLabel.setText("No caso de o ser introduza a default password para os administradores:");

        confirmarButton.setText("Confirmar");
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });

        regressarButton.setText("Regressar");
        regressarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regressarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(informacaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtituloLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(confirmarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(regressarButton))))
                    .addComponent(passwordField))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(informacaoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarButton)
                    .addComponent(regressarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        if(passwordField.getText().contains("pessoas")){
            PersonOptionMenu novo = new PersonOptionMenu(listaPessoas,listaLocais);
            novo.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"A password inserida não é correta!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void regressarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regressarButtonActionPerformed
        this.dispose();
        MainMenu novomenu = new MainMenu(listaPessoas,listaLocais);
        novomenu.setVisible(true);
    }//GEN-LAST:event_regressarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarButton;
    private javax.swing.JLabel informacaoLabel;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton regressarButton;
    private javax.swing.JLabel subtituloLabel;
    // End of variables declaration//GEN-END:variables
}
