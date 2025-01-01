package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class ElectronicRunner {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList();
        collection.add("HP");
        collection.add("Dell");
        collection.add("Lenovo");
        collection.add("Victus");
        collection.add("Apple");
        collection.add("Samsung");
        collection.add("Asus");
        collection.add("Acer");
        collection.add("Sony");
        collection.add("Razer");

        System.out.println("String =="+collection);
        System.out.println("String size before clear=="+collection.size());
        System.out.println("-----------------------------------");
        collection.clear();
        System.out.println("String size after clear=="+collection.size());
    }
}
