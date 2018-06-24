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
public class NewJardim extends javax.swing.JFrame {
    ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    ArrayList<Local> listaLocais = new ArrayList<>();

    /**
     * Secção de criação de um novo local, jardim neste caso, e é inserido na lista de locais que faz parte da base de dados.
     * @param listaPessoas lista de pessoas presentes na base de dados.
     * @param listaLocais lista de locais presentes na base de dados.
     */
    public NewJardim(ArrayList<Pessoa> listaPessoas,ArrayList<Local> listaLocais) {
        this.listaPessoas = listaPessoas;
        this.listaLocais = listaLocais;
        initComponents();
    }
    
    private void criarJardim(){
        if(nomeField.getText().equals("")||areaField.getText().equals("")||latitudeField.getText().equals("")||longitudeField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos!","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                Jardim novo = new Jardim(Double.parseDouble(areaField.getText()),0,nomeField.getText(),Double.parseDouble(latitudeField.getText()),Double.parseDouble(longitudeField.getText()));
                listaLocais.add(novo);
                JOptionPane.showMessageDialog(null,"Novo jardim criado com sucesso!","Informação",JOptionPane.INFORMATION_MESSAGE);
                MainMenu novomenu = new MainMenu(listaPessoas,listaLocais);
                novomenu.setVisible(true);
                this.dispose();
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Preencha os campos corretamente!","Aviso",JOptionPane.WARNING_MESSAGE);
            }
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

        jPanel1 = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        nomeField = new javax.swing.JTextField();
        areaLabel = new javax.swing.JLabel();
        areaField = new javax.swing.JTextField();
        coordenadasLabel = new javax.swing.JLabel();
        latitudeLabel = new javax.swing.JLabel();
        latitudeField = new javax.swing.JTextField();
        longitudeLabel = new javax.swing.JLabel();
        longitudeField = new javax.swing.JTextField();
        criarButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar novo jardim");
        setResizable(false);

        nomeLabel.setText("Nome:");

        areaLabel.setText("Área:");

        coordenadasLabel.setText("Coordenadas");

        latitudeLabel.setText("Latitude:");

        latitudeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                latitudeFieldActionPerformed(evt);
            }
        });

        longitudeLabel.setText("Longitude:");

        longitudeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longitudeFieldActionPerformed(evt);
            }
        });

        criarButton.setText("Criar");
        criarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(areaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(areaField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(coordenadasLabel)
                        .addGap(35, 35, 35)
                        .addComponent(latitudeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(latitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(longitudeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(longitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(criarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel)
                    .addComponent(areaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coordenadasLabel)
                    .addComponent(latitudeLabel)
                    .addComponent(latitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(longitudeLabel)
                    .addComponent(longitudeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(criarButton)
                    .addComponent(resetButton)
                    .addComponent(sairButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void latitudeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_latitudeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_latitudeFieldActionPerformed

    private void longitudeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longitudeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_longitudeFieldActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        nomeField.setText("");
        areaField.setText("");
        latitudeField.setText("");
        longitudeField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        this.dispose();
        MainMenu novomenu = new MainMenu(listaPessoas,listaLocais);
        novomenu.setVisible(true);
    }//GEN-LAST:event_sairButtonActionPerformed

    private void criarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarButtonActionPerformed
        criarJardim();
    }//GEN-LAST:event_criarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaField;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JLabel coordenadasLabel;
    private javax.swing.JButton criarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField latitudeField;
    private javax.swing.JLabel latitudeLabel;
    private javax.swing.JTextField longitudeField;
    private javax.swing.JLabel longitudeLabel;
    private javax.swing.JTextField nomeField;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
