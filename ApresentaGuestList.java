/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class ApresentaGuestList extends javax.swing.JFrame {
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private ArrayList<Local> listaLocais = new ArrayList<>();
    private ArrayList<Pessoa> guestList = new ArrayList<>();
    private final String nome;
    /**
     * Apresenta a GuestList do local escolhido.
     * 
     * @param listaPessoas lista de pessoas presentes na base de dados.
     * @param listaLocais lista de locais presentes na base de dados.
     * @param nome nome do utilizador cuja conta está ligada.
     * @param nomeBar nome do bar pretendido para mostrar a GuestList.
     */
    public ApresentaGuestList(ArrayList<Pessoa> listaPessoas,ArrayList<Local> listaLocais,String nome,String nomeBar) {
        this.listaPessoas = listaPessoas;
        this.listaLocais = listaLocais;
        this.nome = nome;
        initComponents();
        guestList = criaGuestList(nomeBar);
        imprimeGuest(guestList);
        subtituloLabel.setText("GuestList de "+nomeBar);
    }
    
    private void imprimeGuest(ArrayList<Pessoa> guestList){
        for(int i=0;i<guestList.size();i++){
            visorArea.append(guestList.get(i).toString()+"\n");
        }
    }
    
    private ArrayList<Pessoa> criaGuestList(String nomeBar){
        ArrayList<Pessoa> lista = new ArrayList<>();
        
        for(int i=0;i<listaLocais.size();i++){
            if(listaLocais.get(i).getFlag()==6){
                if(listaLocais.get(i).getNome().equals(nomeBar)){
                    if(!listaLocais.get(i).getListaInscritos().isEmpty()){
                        for(int j=0;j<listaLocais.get(i).getListaInscritos().size();j++){
                            if(j<listaLocais.get(i).getNumeroGuest()){
                                lista.add(listaLocais.get(i).getListaInscritos().get(j));
                            }
                            else{
                                if(listaLocais.get(i).getListaInscritos().get(j).getPerfil().equals("Boémio")){
                                    for(int k=lista.size()-1;k>=0;k--){
                                        if(!lista.get(k).getPerfil().equals("Boémio")){
                                            for(int l=k;l<listaLocais.get(i).getNumeroGuest();l++){
                                                lista.set(l,lista.get(l+1));
                                            }
                                            lista.set(lista.size()-1,listaLocais.get(i).getListaInscritos().get(j));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return lista;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @param guestList
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subtituloLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        visorArea = new javax.swing.JTextArea();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apresentação da GuestList");
        setResizable(false);

        subtituloLabel.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        subtituloLabel.setText("GuestList de ");

        visorArea.setEditable(false);
        visorArea.setColumns(20);
        visorArea.setRows(5);
        visorArea.setEnabled(false);
        visorArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                visorAreaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(visorArea);

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtituloLabel)
                .addContainerGap(626, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subtituloLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visorAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_visorAreaKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            getRootPane().setDefaultButton(okButton);
        }
    }//GEN-LAST:event_visorAreaKeyPressed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        ConvivialMenu novo = new ConvivialMenu(listaPessoas,listaLocais,nome);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel subtituloLabel;
    private javax.swing.JTextArea visorArea;
    // End of variables declaration//GEN-END:variables
}
