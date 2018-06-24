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
public class RemoverLocais extends javax.swing.JFrame {
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private ArrayList<Local> listaLocais = new ArrayList<>();
    private final String nome;
    /**
     * Creates new form RemoverLocais
     * @param listaPessoas
     * @param listaLocais
     * @param nome
     */
    public RemoverLocais(ArrayList<Pessoa> listaPessoas,ArrayList<Local> listaLocais,String nome) {
        this.listaPessoas = listaPessoas;
        this.listaLocais = listaLocais;
        this.nome = nome;
        initComponents();
        adicionaLocaisInscritos();
    }
    
    private void desinscreveLocais(){
        for(int i=0;i<listaPessoas.size();i++){
            if(listaPessoas.get(i).getNome().equals(nome)){
                for(int j=0;j<listaLocais.size();j++){
                    if(listaLocais.get(j).getNome().equals(localBox.getSelectedItem().toString())){
                        listaPessoas.get(i).getListaInscricoes().remove(listaLocais.get(j));
                        listaLocais.get(j).getListaInscritos().remove(listaPessoas.get(i));
                    }
                }
            }
        }
    }
    
    private void adicionaLocaisInscritos(){
        for(int i=0;i<listaPessoas.size();i++){
            if(listaPessoas.get(i).getNome().equals(nome)){
                for(int j=0;j<listaPessoas.get(i).getListaInscricoes().size();j++){
                    localBox.addItem(listaPessoas.get(i).getListaInscricoes().get(j).getNome());
                }
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

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        subtituloLabel = new javax.swing.JLabel();
        localLabel = new javax.swing.JLabel();
        localBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        adicionarButton = new javax.swing.JButton();
        confirmarButton = new javax.swing.JButton();
        regressarButton = new javax.swing.JButton();

        jButton3.setText("Regressar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subtituloLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subtituloLabel.setText("Escolha o local que quer remover das suas inscrições:");

        localLabel.setText("Local");

        localBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localBoxActionPerformed(evt);
            }
        });

        adicionarButton.setText("Alterar para adicionar locais");
        adicionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtituloLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(localLabel)
                        .addGap(18, 18, 18)
                        .addComponent(localBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adicionarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtituloLabel)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(localLabel)
                        .addComponent(localBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adicionarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        confirmarButton.setText("Confirmar");
        confirmarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmarButtonMouseEntered(evt);
            }
        });
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regressarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarButton)
                    .addComponent(regressarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void localBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localBoxActionPerformed

    }//GEN-LAST:event_localBoxActionPerformed

    private void confirmarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarButtonMouseEntered

    }//GEN-LAST:event_confirmarButtonMouseEntered

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        desinscreveLocais();
        ConvivialMenu novo = new ConvivialMenu(listaPessoas,listaLocais,nome);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ConvivialMenu novo = new ConvivialMenu(listaPessoas,listaLocais,nome);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void regressarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regressarButtonActionPerformed
        ConvivialMenu novo = new ConvivialMenu(listaPessoas,listaLocais,nome);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regressarButtonActionPerformed

    private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
        SelecionarLocais novo = new SelecionarLocais(listaPessoas,listaLocais,nome);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adicionarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarButton;
    private javax.swing.JButton confirmarButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> localBox;
    private javax.swing.JLabel localLabel;
    private javax.swing.JButton regressarButton;
    private javax.swing.JLabel subtituloLabel;
    // End of variables declaration//GEN-END:variables
}
