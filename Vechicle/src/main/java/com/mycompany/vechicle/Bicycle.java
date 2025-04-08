/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vechicle;

/**
 *
 * @author user
 */
public class Bicycle extends TwoWheeler {
    int gearCount;
    Bicycle(String EngineType,String Model,String Brand,boolean has_Pedals,int gearCount){
        super(EngineType,Model,Brand,has_Pedals);
        this.gearCount = gearCount;
    }
}
