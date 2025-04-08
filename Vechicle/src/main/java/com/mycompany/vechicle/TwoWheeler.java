/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vechicle;

/**
 *
 * @author user
 */
public class TwoWheeler extends Vechicle {
    boolean has_Pedals;
    TwoWheeler(String EngineType,String Model,String Brand,boolean has_Pedals){
        super(EngineType,Model,Brand);
        this.has_Pedals=has_Pedals;
    }
}
