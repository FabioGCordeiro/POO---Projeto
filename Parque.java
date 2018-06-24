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
public class Parque extends Local{
    private final double custo;
    /**
     * 
     * @param custo
     * @param nome
     * @param latitude
     * @param longitude 
     */
    public Parque(double custo, String nome, double latitude, double longitude) {
        super(nome, latitude, longitude);
        this.custo = 0;
    }

    @Override
    public double getMoney() {
        return custo;
    }
    
    @Override
    public int getFlag(){
        return 4;
    }
    
}
