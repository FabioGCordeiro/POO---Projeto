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
public abstract class Pessoa implements Serializable{

    private final String nome;
    private final String perfil;
    private String password = null;
    private ArrayList<Local> listaInscricoes = new ArrayList<>();

    public ArrayList<Local> getListaInscricoes() {
        return listaInscricoes;
    }
    /**
     * 
     * @param nome
     * @param perfil 
     */
    public Pessoa(String nome, String perfil) {
        this.nome = nome;
        this.perfil = perfil;
    }

    public String getNome() {
        return nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getPassword() {
        return password;
    }
    /**
     * 
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isInscrito(){
        return password != null;
    }
    
    public abstract String getDados();
    public abstract int getFlag();
    
    @Override
    public String toString(){
        return "Nome: "+getNome()+" - Perfil: "+getPerfil();
    }
}
