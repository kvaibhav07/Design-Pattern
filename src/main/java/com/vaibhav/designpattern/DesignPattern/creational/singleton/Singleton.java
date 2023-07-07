package com.vaibhav.designpattern.DesignPattern.creational.singleton;

public class Singleton {

    private Singleton(){}

    //Eager initialization
    private static final Singleton instance1 = new Singleton();

    public static Singleton getInstance1(){
        return instance1;
    }

    // Static block Initialization
    private static final Singleton instance2;
    static {
        instance2 = new Singleton();
    }

    public static Singleton getInstance2(){
        return instance2;
    }

    //Lazy Initialization
    private static Singleton instance3;

    public static Singleton getInstance3(){
        if(instance3 == null)
            instance3 = new Singleton();
        return instance3;
    }

    //Thread Safe Initialization(synchronized method)
    private static Singleton instance4;

    public static synchronized Singleton getInstance4(){
        if(instance4 == null)
            instance4 = new Singleton();
        return instance4;
    }

    //Thread Safe Initialization(synchronized block)
    private static Singleton instance5;

    public static Singleton getInstance5(){
        if(instance5 == null){
            synchronized (Singleton.class){
                if(instance5 == null)
                    instance5 = new Singleton();
            }
        }
        return instance5;
    }
}
