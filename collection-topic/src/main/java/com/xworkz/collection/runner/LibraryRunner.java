package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.LinkedList;

public class LibraryRunner {

    public static void main(String[] args) {

        Collection<String> collection = new LinkedList<>();
        collection.add("Shri Ramyana Darshanam");
        collection.add("Mahabharata");
        collection.add("Bhagavad Gita");
        collection.add("Panchatantra");
        collection.add("Vikram Betal");
        collection.add("Shakuntala");
        collection.add("Arthashastra");
        collection.add("Jataka Tales");
        collection.add("Ramayana");
        collection.add("Upanishads");

        System.out.println("String using LinkedList==" +collection);
        System.out.println("String size before clear=="+collection.size());
        System.out.println("-----------------------------------");
        collection.clear();
        System.out.println("String size after clear==" +collection.size());
    }
}
