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
public class Jardim extends Parque{
    private final double area;
    /**
     * 
     * @param area
     * @param custo
     * @param nome
     * @param latitude
     * @param longitude 
     */
    public Jardim(double area, double custo, String nome, double latitude, double longitude) {
        super(custo, nome, latitude, longitude);
        this.area = area;
    }

    public double getArea() {
        return area;
    }
    
    @Override
    public String toString(){
        return super.toString()+" - Área: "+getArea();
    }
}
