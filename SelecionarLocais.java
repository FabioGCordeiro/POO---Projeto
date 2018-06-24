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
public class SelecionarLocais extends javax.swing.JFrame {
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private ArrayList<Local> listaLocais = new ArrayList<>();
    private final String nome;
    /**
     * Seleção dos locais que o utilizador pretende visitar, tendo um máximo de 5 locais. É feita uma verificação para evitar erros de seleção no botão "Testar possibilidade".
     * @param listaPessoas lista de pessoas presentes na base de dados.
     * @param listaLocais lista de locais presentes na base de dados.
     * @param nome nome da pessoa cuja conta está ligada.
     */
    public SelecionarLocais(ArrayList<Pessoa> listaPessoas,ArrayList<Local> listaLocais,String nome) {
        this.listaPessoas = listaPessoas;
        this.listaLocais = listaLocais;
        this.nome = nome;
        initComponents();
        adicionaLocais();
        checkNumeroInscricoes();
    }
    
    
    private void adicionaLocais(){
        for(int i=0;i<listaLocais.size();i++){
            localBox.addItem(listaLocais.get(i).getNome());
        }
    }
    
    private void checkNumeroInscricoes(){
        for(int i=0;i<listaPessoas.size();i++){
            if(listaPessoas.get(i).getNome().equals(nome)){
                numLocaisLabel.setText(String.valueOf(listaPessoas.get(i).getListaInscricoes().size()));
            }
        }
    }
    
    private boolean testaErros(){
        for(int i=0;i<listaLocais.size();i++){
            if(listaLocais.get(i).getNome().equals(localBox.getSelectedItem().toString())){
                if(!listaLocais.get(i).getListaInscritos().isEmpty()){
                    for(int j=0;j<listaLocais.get(i).getListaInscritos().size();j++){
                        if(listaLocais.get(i).getListaInscritos().get(j).getNome().equals(nome)){
                            JOptionPane.showMessageDialog(null,"Pessoa já inscrita nesse local!","Erro",JOptionPane.ERROR_MESSAGE);
                            return false;
                        }
                        else if(Integer.parseInt(numLocaisLabel.getText())==5){
                            int confirmacao = JOptionPane.showConfirmDialog(null,"O numero máximo de inscrições será ultrapassado(5)! Deseja substituir algum local?","Erro",JOptionPane.YES_NO_OPTION);
                            if(confirmacao == JOptionPane.YES_OPTION){
                                SubstituirLocais novo = new SubstituirLocais(listaPessoas,listaLocais,nome);
                                novo.setVisible(true);
                                this.dispose();
                            }
                            else{
                                return false;
                            }
                        }
                        else{
                            return true;
                        }
                        if(listaLocais.get(i).getFlag()==6){
                            if(listaLocais.get(i).isFull()){
                                JOptionPane.showMessageDialog(null,"Bar com lotação esgotada!","Erro",JOptionPane.ERROR_MESSAGE);
                            }
                            else{
                                return true;
                            }
                        }
                    }
                }
                else{
                    if(Integer.parseInt(numLocaisLabel.getText())==5){
                        if(!listaLocais.get(i).getListaInscritos().isEmpty()){
                            for(int j=0;j<listaLocais.get(i).getListaInscritos().size();j++){
                                if(listaLocais.get(i).getListaInscritos().get(j).getNome().equals(nome)){
                                    JOptionPane.showMessageDialog(null,"Pessoa já inscrita nesse local!","Erro",JOptionPane.ERROR_MESSAGE);
                                    return false;
                                }
                            }
                        }
                        else{
                            int confirmacao = JOptionPane.showConfirmDialog(null,"O numero máximo de inscrições será ultrapassado(5)! Deseja substituir algum local?","Erro",JOptionPane.YES_NO_OPTION);
                            if(confirmacao == JOptionPane.YES_OPTION){
                                SubstituirLocais novo = new SubstituirLocais(listaPessoas,listaLocais,nome);
                                novo.setVisible(true);
                                this.dispose();
                            }
                            else{
                                return false;
                            }
                        }
                    }
                    else{
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void inscreveLocais(){
        for(int i=0;i<listaPessoas.size();i++){
            if(listaPessoas.get(i).getNome().equals(nome)){
                for(int j=0;j<listaLocais.size();j++){
                    if(listaLocais.get(j).getNome().equals(localBox.getSelectedItem().toString())){
                        listaPessoas.get(i).getListaInscricoes().add(listaLocais.get(j));
                        listaLocais.get(j).getListaInscritos().add(listaPessoas.get(i));
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

        jPanel1 = new javax.swing.JPanel();
        subtituloLabel = new javax.swing.JLabel();
        localLabel = new javax.swing.JLabel();
        localBox = new javax.swing.JComboBox<>();
        numeroLocaisLabel = new javax.swing.JLabel();
        numLocaisLabel = new javax.swing.JLabel();
        removerButton = new javax.swing.JButton();
        regressarButton = new javax.swing.JButton();
        testarButton = new javax.swing.JButton();
        confirmarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escolha os locais a visitar");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        subtituloLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subtituloLabel.setText("Pode escolher até 5 locais para visitar durante o convívio:");

        localLabel.setText("Local");

        localBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localBoxActionPerformed(evt);
            }
        });

        numeroLocaisLabel.setText("Número de locais em que está inscrito: ");

        removerButton.setText("Alterar para remover locais");
        removerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerButtonActionPerformed(evt);
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
                        .addComponent(localLabel)
                        .addGap(18, 18, 18)
                        .addComponent(localBox, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtituloLabel)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numeroLocaisLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numLocaisLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtituloLabel)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLocaisLabel)
                    .addComponent(numLocaisLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(localLabel)
                    .addComponent(removerButton))
                .addContainerGap())
        );

        regressarButton.setText("Regressar");
        regressarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regressarButtonActionPerformed(evt);
            }
        });

        testarButton.setText("Testar Possibilidade");
        testarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testarButtonActionPerformed(evt);
            }
        });

        confirmarButton.setText("Confirmar");
        confirmarButton.setEnabled(false);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(confirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(testarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regressarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regressarButton)
                    .addComponent(testarButton)
                    .addComponent(confirmarButton))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regressarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regressarButtonActionPerformed
        ConvivialMenu novo = new ConvivialMenu(listaPessoas,listaLocais,nome);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regressarButtonActionPerformed

    private void testarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testarButtonActionPerformed
        boolean flag1;
        flag1 = testaErros();
        
        if(flag1){
            confirmarButton.setEnabled(true);
        }
    }//GEN-LAST:event_testarButtonActionPerformed

    private void confirmarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmarButtonMouseEntered
        if(!(confirmarButton.isEnabled()))
            JOptionPane.showMessageDialog(null, "Por favor pré-visualize primeiro as suas opções para evitar erros.");
    }//GEN-LAST:event_confirmarButtonMouseEntered

    private void localBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localBoxActionPerformed
        confirmarButton.setEnabled(false);
    }//GEN-LAST:event_localBoxActionPerformed

    private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
        inscreveLocais();
        int confirmacao = JOptionPane.showConfirmDialog(null,"Local adicionado com sucesso! Quer adicionar mais um local?","Sugestão",JOptionPane.YES_NO_OPTION);
        if(confirmacao == JOptionPane.YES_OPTION){
            SelecionarLocais novo = new SelecionarLocais(listaPessoas,listaLocais,nome);
            novo.setVisible(true);
            this.dispose();
        }
        else{
            ConvivialMenu novo = new ConvivialMenu(listaPessoas,listaLocais,nome);
            novo.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_confirmarButtonActionPerformed

    private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
        RemoverLocais novo = new RemoverLocais(listaPessoas,listaLocais,nome);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_removerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> localBox;
    private javax.swing.JLabel localLabel;
    private javax.swing.JLabel numLocaisLabel;
    private javax.swing.JLabel numeroLocaisLabel;
    private javax.swing.JButton regressarButton;
    private javax.swing.JButton removerButton;
    private javax.swing.JLabel subtituloLabel;
    private javax.swing.JButton testarButton;
    // End of variables declaration//GEN-END:variables

}
