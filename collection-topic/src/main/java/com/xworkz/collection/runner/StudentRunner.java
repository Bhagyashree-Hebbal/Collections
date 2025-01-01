package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.LinkedList;

public class StudentRunner {

    public static void main(String[] args) {

        Collection<String> collection = new LinkedList<>();
        collection.add("Bhagyashree");
        collection.add("Soumyashree");
        collection.add("Shantamma");
        collection.add("Sohita");
        collection.add("Ambika");
        collection.add("Renuka");
        collection.add("Kalpana");
        collection.add("Ashwini");
        collection.add("Sahana");
        collection.add("Sushma");

        System.out.println("String using LinkedList==" +collection);
        System.out.println("String size before clear=="+collection.size());
        System.out.println("-----------------------------------");
        collection.clear();
        System.out.println("String size after clear==" +collection.size());
    }
}
