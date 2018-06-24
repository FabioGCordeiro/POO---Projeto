/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 * 
 * @author Gonçalo
 */

public class Bar extends Local{
    private final int lotacao;
    private final double consumoMinimo;
    private final double percentagem;
    
    /**
     * 
     * @param lotacao
     * @param consumoMinimo
     * @param nome
     * @param latitude
     * @param longitude
     * @param percentagem 
     */
    public Bar(int lotacao, double consumoMinimo, String nome, double latitude, double longitude,double percentagem) {
        super(nome, latitude, longitude);
        this.lotacao = lotacao;
        this.percentagem = percentagem;
        this.consumoMinimo = consumoMinimo;
    }

    public int getLotacao() {
        return lotacao;
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean isFull(){
        return listaInscritos.size()==lotacao;
    }
    
    @Override
    public int getNumeroGuest(){
        return (int) (lotacao * percentagem);
    }

    @Override
    public double getMoney() {
        return consumoMinimo;
    }
    
    @Override
    public String toString(){
        return super.toString()+" - Lotação: "+getLotacao()+" - Consumo Mínimo: "+getMoney();
    }
    
    /**
     *
     * @return
     */
    @Override
    public int getFlag(){
        return 6;
    }
    
}
