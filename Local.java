/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */

public abstract class Local implements Serializable{
    
private final String nome;
private final Coordenadas coordenadas;
ArrayList<Pessoa> listaInscritos = new ArrayList<>();

    public ArrayList<Pessoa> getListaInscritos() {
        return listaInscritos;
    }
    /**
     * 
     * @param nome
     * @param latitude
     * @param longitude 
     */
    public Local(String nome, double latitude, double longitude) {
        this.nome = nome;
        this.coordenadas = new Coordenadas(latitude,longitude);
    }

    public String getNome() {
        return nome;
    }
    
    public int getNumeroGuest(){
        return 1;
    }
    
    public boolean isFull(){
        return true;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }
    
    public int getNumeroInscricoes(){
        return listaInscritos.size();
    }
    
    public abstract double getMoney(); 
    public abstract int getFlag();
    
    
    @Override
    public String toString(){
        return "Nome: "+getNome()+" - Latitude: "+getCoordenadas().getLatitude()+" - Longitude: "+getCoordenadas().getLongitude() + " - Inscrições: "+getListaInscritos().size();
    }


    
}
