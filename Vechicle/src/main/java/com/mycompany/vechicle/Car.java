/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vechicle;

/**
 *
 * @author user
 */
public class Car extends FourWheeler {
    int seats;
    Car(String EngineType,String Model,String Brand,String TransmissionPurpose,int seats){
        super(EngineType,Model,Brand,TransmissionPurpose);
        this.seats=seats;
    }
}
