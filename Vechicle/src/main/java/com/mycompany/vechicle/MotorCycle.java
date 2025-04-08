/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vechicle;

/**
 *
 * @author user
 */
public class MotorCycle extends TwoWheeler {
    float engineCapacity;
    MotorCycle(String EngineType,String Model,String Brand,boolean has_Pedals,float engineCapacity){
        super(EngineType,Model,Brand,has_Pedals);
        this.engineCapacity=engineCapacity;
    }
}
