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
public class Funcionario extends Pessoa{
    private final String regime;
    /**
     * 
     * @param regime
     * @param nome
     * @param perfil 
     */
    public Funcionario(String regime, String nome, String perfil) {
        super(nome, perfil);
        this.regime = regime;
    }
    
    @Override
    public String getDados() {
        return regime;
    }
    
    @Override
    public int getFlag(){
        return 3;
    }
    
    
}
