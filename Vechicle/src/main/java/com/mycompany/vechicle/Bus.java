/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vechicle;

/**
 *
 * @author user
 */
public class Bus extends FourWheeler {
    int passangerCapacity;
    Bus(String EngineType,String Model,String Brand,String TransmissionPurpose,int passangerCapacity){
        super(EngineType,Model,Brand,TransmissionPurpose);
        this.passangerCapacity=passangerCapacity;
    }
}
