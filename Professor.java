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
public class Professor extends Pessoa{
    private final String categoria;
    /**
     * 
     * @param categoria
     * @param nome
     * @param perfil 
     */
    public Professor(String categoria, String nome, String perfil) {
        super(nome, perfil);
        this.categoria = categoria;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getDados(){
        return categoria;
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getFlag(){
        return 2;
    }
    
}
