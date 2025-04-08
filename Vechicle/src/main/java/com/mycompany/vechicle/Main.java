/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vechicle;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car1 = new Car("Petrol","ep23","TataNano","Daily Use",4);
        Truck truck1 = new Truck("Disel","Eg23","Eicher","Milk Transport",100.5f);
        Bus bus1 = new Bus("Disel","Ps3","Tata","Public Transport",100);
        Bicycle b1 = new Bicycle("Human","Hero12","Hero",true,3);
        MotorCycle m1 = new MotorCycle("Petrol","P3","Honda",true,100);
        System.out.println(car1.Brand);
        System.out.println(truck1.EngineType);
        System.out.println(bus1.Model);
        System.out.println(b1.has_Pedals);
        System.out.println(m1.engineCapacity);
    }
}
