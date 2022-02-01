package com.example.demokafka.example;

import java.lang.reflect.Constructor;

public class Singleton {

    //Eager Initialization
    //Below instance is guaranteed to be thread safe.

    private static final Singleton uniqueInstance = new Singleton();

    private Singleton() {
        if (uniqueInstance != null) {
            throw new RuntimeException("Can't create instance. Please use getInsance() to create it.");
        }
    }

    public static Singleton getInstance() {

        //We have already got an instance, so just return it.

        return uniqueInstance;

    }

    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("Hashcode of Object s1: " + s1.hashCode());
        System.out.println("Hashcode of Object s2: " + s2.hashCode());

        Class<Singleton> clazz = (Class<Singleton>) Class.forName("com.example.demokafka.example.Singleton");
        Constructor<Singleton> ctr = clazz.getDeclaredConstructor();
        ctr.setAccessible(true);
        Singleton s3 = ctr.newInstance();
        System.out.println("Hashcode of Object s3: " + s3.hashCode());

    }
}
