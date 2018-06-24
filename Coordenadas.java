/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class Coordenadas implements Serializable{
    private final double longitude;
    private final double latitude;
    /**
     * 
     * @param latitude
     * @param longitude 
     */
    public Coordenadas(double latitude, double longitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
    
    
}
