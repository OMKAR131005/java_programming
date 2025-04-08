/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vechicle;

/**
 *
 * @author user
 */

public class FourWheeler extends Vechicle {
    String TransmissionPurpose;
    FourWheeler(String EngineType,String Model,String Brand,String TransmissionPurpose){
        super(EngineType,Model,Brand);
        this.TransmissionPurpose=TransmissionPurpose;
    } 
}
