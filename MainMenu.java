/*
 * To change this license header, choose License Headers in MainMenu Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class MainMenu extends javax.swing.JFrame implements Serializable {
    private ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private ArrayList<Local> listaLocais = new ArrayList<>();
    /**
     * Primeiro menu a ser apresentado com as diversas opções possíveis.
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public MainMenu() throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("data")))) {
            if("continue".equals(((String)objectIn.readObject()))){
                leFicheiroPessoas();
                leFicheiroLocais();
            }
        }catch (ClassCastException e){
            ObjectInputStream objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("data")));
            this.listaPessoas = (ArrayList)objectIn.readObject();
            this.listaLocais = (ArrayList)objectIn.readObject();
        }
        
        initComponents();
    }
    
    public MainMenu(ArrayList<Pessoa> listaPessoas,ArrayList<Local> listaLocais){
        this.listaPessoas = listaPessoas;
        this.listaLocais = listaLocais;
        initComponents(); 
    }
    
    private void leFicheiroPessoas() {
        
        try{
            FileReader frd = new FileReader("Pessoas.txt"); 
            BufferedReader bf = new BufferedReader(frd);
            String s;
            String [] s1;
            while((s=bf.readLine())!= null){
                s1 = s.split("/");
                if(s1.length==4){
                    if((s1[2].equals("Boémio"))||(s1[2].equals("Cultural"))||(s1[2].equals("Desportivo"))||(s1[2].equals("Poupadinho"))){
                        switch (s1[1]) {
                            case "Aluno":
                                {
                                    if(s1[3].equals("LEI")||s1[3].equals("LDM")){
                                        Aluno novo = new Aluno(s1[3],s1[0],s1[2]);
                                        listaPessoas.add(novo);
                                    }
                                    break;
                                }
                            case "Professor":
                                {
                                    if(s1[3].equals("Associado")||s1[3].equals("Auxiliar")||s1[3].equals("Catedrático")){
                                        Professor novo = new Professor(s1[3],s1[0],s1[2]);
                                        listaPessoas.add(novo);
                                    }
                                    break;
                                }
                            case "Funcionario":
                                {
                                    if(s1[3].equals("Parcial")||s1[3].equals("Integral")){
                                        Funcionario novo = new Funcionario(s1[3],s1[0],s1[2]);
                                        listaPessoas.add(novo);
                                    }
                                    break;
                                }
                            default:
                                break;
                        }
                    }
                }
            }
            
        }
        catch(IOException e){
            System.out.println("Ocorreu um erro! "+e);
        }
    }   
        
    @SuppressWarnings("empty-statement")
    private  void leFicheiroLocais() {
        
        try{
            FileReader frd = new FileReader("Locais.txt"); 
            BufferedReader bf = new BufferedReader(frd);
            String s;
            String [] s1;
            while((s=bf.readLine())!= null){
                s1 = s.split("/");
                if(s1[2].equals("Bar")){
                    if(s1.length==7){
                        try{
                            if(Integer.parseInt(s1[0])>=0 && Double.parseDouble(s1[1])>=0){
                                Bar novo = new Bar(Integer.parseInt(s1[0]),Double.parseDouble(s1[1]),s1[3],Double.parseDouble(s1[4]),Double.parseDouble(s1[5]),Double.parseDouble(s1[6]));
                                listaLocais.add(novo);
                            }
                        }
                        catch(NumberFormatException e){
                        }
                    }
                }
                if(s1[2].equals("Exposicao")){
                    if(s1.length==6){
                        try{
                            if(Double.parseDouble(s1[0])>=0){
                                Exposicao novo = new Exposicao(Double.parseDouble(s1[0]),s1[1],s1[3],Double.parseDouble(s1[4]),Double.parseDouble(s1[5]));
                                listaLocais.add(novo);
                            }
                        }
                        catch(NumberFormatException e){
                        }
                    }
                }
                if(s1[2].equals("AreaDesportiva")){
                        try{
                            ArrayList<String> listaDesportos = new ArrayList<>();
                            for(int i=5;i<=s1.length-1;i++){
                                listaDesportos.add(s1[i]);
                            }
                            if(Double.parseDouble(s1[0]) == 0){
                                AreaDesportiva novo = new AreaDesportiva(Double.parseDouble(s1[0]),s1[1],Double.parseDouble(s1[3]),Double.parseDouble(s1[4]),listaDesportos);
                                listaLocais.add(novo);
                            }
                        }
                        catch(NumberFormatException e){
                        }
                }
                if(s1[2].equals("Jardim")){
                    if(s1.length==6){
                        try{
                            if(Double.parseDouble(s1[0])>0 && Double.parseDouble(s1[1])==0){
                            Jardim novo = new Jardim(Double.parseDouble(s1[0]),Double.parseDouble(s1[1]),s1[3],Double.parseDouble(s1[4]),Double.parseDouble(s1[5]));
                            listaLocais.add(novo);
                            }
                        }
                        catch(NumberFormatException e){
                        }
                    }
                }
            }
        }
        catch(IOException e){
            System.out.println("Ocorreu um erro! "+e);
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
        novaInscricaoButton = new javax.swing.JButton();
        novoIndividuoButton = new javax.swing.JButton();
        novoLocalButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        subtituloLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Inicial");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setToolTipText("Menu Inicial");
        jPanel1.setName("Menu Inicial"); // NOI18N

        novaInscricaoButton.setText("Inscrição no convívio");
        novaInscricaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaInscricaoButtonActionPerformed(evt);
            }
        });

        novoIndividuoButton.setText("Criar Novo Indivíduo");
        novoIndividuoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoIndividuoButtonActionPerformed(evt);
            }
        });

        novoLocalButton.setText("Criar Novo Local");
        novoLocalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoLocalButtonActionPerformed(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        subtituloLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subtituloLabel.setText("Bem-Vindo ao Menu Inicial!");

        loginButton.setText("Login no convívio");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subtituloLabel)
                .addGap(400, 400, 400))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sairButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novoLocalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novoIndividuoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novaInscricaoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(subtituloLabel)
                .addGap(18, 18, 18)
                .addComponent(novoIndividuoButton)
                .addGap(18, 18, 18)
                .addComponent(novoLocalButton)
                .addGap(18, 18, 18)
                .addComponent(novaInscricaoButton)
                .addGap(18, 18, 18)
                .addComponent(loginButton)
                .addGap(18, 18, 18)
                .addComponent(sairButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        int confirmacao = JOptionPane.showConfirmDialog(null, "Tem a certeza que a pretende encerrar o programa?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if(confirmacao == JOptionPane.YES_OPTION){	
        try {
            FileOutputStream out = new FileOutputStream("data");
            ObjectOutputStream fout = new ObjectOutputStream(out);
            fout.writeObject(listaPessoas);
            fout.writeObject(listaLocais);
            //fout.writeObject("continue");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        this.dispose();
        }
    }//GEN-LAST:event_sairButtonActionPerformed

    private void novoLocalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoLocalButtonActionPerformed
        CheckAdminLocais novo = new CheckAdminLocais(listaPessoas,listaLocais);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_novoLocalButtonActionPerformed

    private void novoIndividuoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoIndividuoButtonActionPerformed
        CheckAdminPessoas novo = new CheckAdminPessoas(listaPessoas,listaLocais);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_novoIndividuoButtonActionPerformed

    private void novaInscricaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaInscricaoButtonActionPerformed
        SubscriptionMenu novo = new SubscriptionMenu(listaPessoas,listaLocais);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_novaInscricaoButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        SelecionarInscrito novo = new SelecionarInscrito(listaPessoas,listaLocais);
        novo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MainMenu().setVisible(true);
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton novaInscricaoButton;
    private javax.swing.JButton novoIndividuoButton;
    private javax.swing.JButton novoLocalButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JLabel subtituloLabel;
    // End of variables declaration//GEN-END:variables
}
