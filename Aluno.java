/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author ASUS
 */
public class Aluno extends Pessoa{
    private final String curso;
    /**
     * 
     * @param curso
     * @param nome
     * @param perfil 
     */
    public Aluno(String curso, String nome, String perfil){
        super(nome, perfil);
        this.curso = curso;
    }
    
    @Override
    
    public int getFlag(){
        return 1;
    }
    
    @Override
    public String getDados() {
        return curso;
    }
    
    @Override
    public String toString(){
        return super.toString()+" - Curso: "+getDados();
    }  
}
