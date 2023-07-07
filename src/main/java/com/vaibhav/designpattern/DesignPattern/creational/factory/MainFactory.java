package com.vaibhav.designpattern.DesignPattern.creational.factory;

public class MainFactory {

    public static void main(String[] args) {
        Computer laptop = ComputerFactory.getComputer("Laptop","2 GB","500 GB","2.4 GHz");
        Computer desktop = ComputerFactory.getComputer("Desktop","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory Laptop Config::"+laptop);
        System.out.println("Factory Desktop Config::"+desktop);
    }
}
