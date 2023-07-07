package com.vaibhav.designpattern.DesignPattern.creational.prototype;

public class Prototype implements Cloneable{

    private String name, address;

    public Prototype(){
        System.out.println("Print the record....\n");
    }

    public Prototype(String name, String address) {
        this();
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println("Name : "+name+" Address : "+address);
    }

    public Object getCloObject(){
        return new Prototype(name, address);
    }

    public static void main(String[] args) {
        Prototype prototype = new Prototype("Mudit", "Banglore");
        prototype.display();
        Prototype prototype1 = (Prototype) prototype.getCloObject();
        prototype1.display();
    }
}