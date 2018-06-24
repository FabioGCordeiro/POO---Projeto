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
public class Exposicao extends Local{
    private final double custo;
    private final String formaArte;
    /**
     * 
     * @param custo
     * @param formaArte
     * @param nome
     * @param latitude
     * @param longitude 
     */
    public Exposicao(double custo, String formaArte, String nome, double latitude, double longitude) {
        super(nome, latitude, longitude);
        this.custo = custo;
        this.formaArte = formaArte;
    }

    @Override
    public double getMoney() {
        return custo;
    }

    public String getFormaArte() {
        return formaArte;
    }
    
    @Override
    public String toString(){
        return super.toString()+" - Forma de Arte: "+getFormaArte()+" - Custo: "+getMoney();
    }
    
    @Override
    public int getFlag(){
        return 5;
    }
    
    
}
