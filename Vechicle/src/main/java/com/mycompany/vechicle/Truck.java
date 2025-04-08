/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vechicle;

/**
 *
 * @author user
 */
public class Truck extends FourWheeler {
    float loadCapacity;
    Truck(String EngineType,String Model,String Brand,String TransmissionPurpose,float loadCapacity){
        super(EngineType,Model,Brand,TransmissionPurpose);
        this.loadCapacity=loadCapacity;
    }
    
}
