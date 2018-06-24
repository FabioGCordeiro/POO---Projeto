/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class AreaDesportiva extends Parque{
    private ArrayList<String> desportos;
    /**
     * 
     * @param custo
     * @param nome
     * @param latitude
     * @param longitude
     * @param listaDesportos 
     */
    public AreaDesportiva(double custo, String nome, double latitude, double longitude, ArrayList<String> listaDesportos) {
        super(custo, nome, latitude, longitude);
        this.desportos = listaDesportos;
    }
    /**
     * 
     * @param i
     * @return 
     */
    public String printDesportos(int i){
            if(i==desportos.size()-1){
                return desportos.get(i);
            }
            else{
                return desportos.get(i)+", ";
            }
   }

    public ArrayList<String> getDesportos() {
        return desportos;
    }
    
    @Override
    public String toString(){
        int j=0;
        String fim  = new String();
        for(int i=0;i<desportos.size();i++){
            fim += printDesportos(j);
            j++;
        }
        return super.toString() + " - Desportos Particáveis: "+fim;
    }
}
