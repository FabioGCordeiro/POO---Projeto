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
public class SubstituirLocais extends javax.swing.JFrame {
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private ArrayList<Local> listaLocais = new ArrayList<>();
    private final String nome;
    /**
     * Creates new form RemoverLocais
     * @param listaPessoas
     * @param listaLocais
     * @param nome
     */
    public SubstituirLocais(ArrayList<Pessoa> listaPessoas,ArrayList<Local> listaLocais,String nome) {
        this.listaPessoas = listaPessoas;
        this.listaLocais = listaLocais;
        this.nome = nome;
        initComponents();
        adicionaLocaisInscritos();
        adicionaLocais();
    }
    
    private boolean verificaInscricao(String nomeLocal){
        for(int i=0;i<listaLocais.size();i++){
            if(listaLocais.get(i).getNome().equals(nomeLocal)){
                if(!listaLocais.get(i).getListaInscritos().isEmpty()){
                    for(int j=0;j<listaLocais.get(i).getListaInscritos().size();j++){
                        if(listaLocais.get(i).getListaInscritos().get(j).getNome().equals(nome)){
                            JOptionPane.showMessageDialog(null,"Pessoa já inscrita em "+listaLocais.get(i).getNome()+"!","Erro",JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            return true;
                        }
                    }
                }
                else{
                        return true;
                }
            }
        }
        return false;
    }

    private void adicionaLocais(){
        for(int i=0;i<listaLocais.size();i++){
            localInseridoBox.addItem(listaLocais.get(i).getNome());
        }
    }
    
    private void adicionaLocaisInscritos(){
        for(int i=0;i<listaPessoas.size();i++){
            if(listaPessoas.get(i).getNome().equals(nome)){
                for(int j=0;j<listaPessoas.get(i).getListaInscricoes().size();j++){
                    localRetiradoBox.addItem(listaPessoas.get(i).getListaInscricoes().get(j).getNome());
                }
            }
        }
    }
    
    private void inscreveLocais(){
        for(int i=0;i<listaPessoas.size();i++){
            if(listaPessoas.get(i).getNome().equals(nome)){
                for(int j=0;j<listaLocais.size();j++){
                    if(listaLocais.get(j).getNome().equals(localInseridoBox.getSelectedItem().toString())){
                        listaPessoas.get(i).getListaInscricoes().add(listaLocais.get(j));
                        listaLocais.get(j).getListaInscritos().add(listaPessoas.get(i));
                    }
                }
            }
        }
    }
    
    private void desinscreveLocais(){
        for(int i=0;i<listaPessoas.size();i++){
            if(listaPessoas.get(i).getNome().equals(nome)){
                for(int j=0;j<listaLocais.size();j++){
                    if(listaLocais.get(j).getNome().equals(localRetiradoBox.getSelectedItem().toString())){
                        listaPessoas.get(i).getListaInscricoes().remove(listaLocais.get(j));
                        listaLocais.get(j).getListaInscritos().remove(listaPessoas.get(i));
                    }
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

        subtituloLabel = new javax.swing.JLabel();
        localRetiradoLabel = new javax.swing.JLabel();
        localInseridoLabel = new javax.swing.JLabel();
        localRetiradoBox = new javax.swing.JComboBox<>();
        localInseridoBox = new javax.swing.JComboBox<>();
        confirmarButton = new javax.swing.JButton();
        testarButton = new javax.swing.JButton();
        regressarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        subtituloLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subtituloLabel.setText("Escolha os locais que quer substituir:");

        localRetiradoLabel.setText("Local a retirar: ");

        localInseridoLabel.setText("Local a inserir: ");

        localRetiradoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localRetiradoBoxActionPerformed(evt);
            }
        });

        confirmarButton.setText("Confirmar");
        confirmarButton.setEnabled(false);
        confirmarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarButtonActionPerformed(evt);
            }
        });

        testarButton.setText("Testar possibilidade");
        testarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testarButtonActionPerformed(evt);
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
                    .addComponent(subtituloLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(localInseridoLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(localInseridoBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(localRetiradoLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(localRetiradoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(confirmarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(testarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regressarButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtituloLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localRetiradoLabel)
                    .addComponent(localRetiradoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localInseridoLabel)
                    .addComponent(localInseridoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmarButton)
                    .addComponent(testarButton)
                    .addComponent(regressarButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        desinscreveLocais();
        inscreveLocais();
        JOptionPane.showMessageDialog(null, "Alteração efetuada com sucesso!","Informação",JOptionPane.INFORMATION_MESSAGE);
        ConvivialMenu novo = new ConvivialMenu(listaPessoas,listaLocais,nome);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void testarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testarButtonActionPerformed
        boolean flag2 = false;
        if(!localRetiradoBox.getSelectedItem().toString().equals(localInseridoBox.getSelectedItem().toString()))
            flag2 = verificaInscricao(localInseridoBox.getSelectedItem().toString());
        else{
            JOptionPane.showMessageDialog(null, "Inscreva-se num local diferente do que pretende remover!","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        if(flag2){
            confirmarButton.setEnabled(true);
        }
    }//GEN-LAST:event_testarButtonActionPerformed

    private void regressarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regressarButtonActionPerformed
        ConvivialMenu novo = new ConvivialMenu(listaPessoas,listaLocais,nome);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regressarButtonActionPerformed

    private void localRetiradoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localRetiradoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_localRetiradoBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarButton;
    private javax.swing.JComboBox<String> localInseridoBox;
    private javax.swing.JLabel localInseridoLabel;
    private javax.swing.JComboBox<String> localRetiradoBox;
    private javax.swing.JLabel localRetiradoLabel;
    private javax.swing.JButton regressarButton;
    private javax.swing.JLabel subtituloLabel;
    private javax.swing.JButton testarButton;
    // End of variables declaration//GEN-END:variables
}
