package com.vaibhav.designpattern.DesignPattern.creational.factory;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("Laptop".equalsIgnoreCase(type))
            return new Laptop(ram, hdd, cpu);
        else if("Desktop".equalsIgnoreCase(type))
            return new Desktop(ram, hdd, cpu);
        return null;
    }
}
