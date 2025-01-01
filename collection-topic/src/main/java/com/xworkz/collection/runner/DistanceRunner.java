package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;

public class DistanceRunner {

    public static void main(String[] args) {

        Collection<Long> collection=new ArrayList();
        collection.add(987654321234567890L);
        collection.add(123456789012345678L);
        collection.add(456789012345678901L);
        collection.add(876543210987654321L);
        collection.add(234567890123456789L);
        collection.add(678901234567890123L);
        collection.add(567890123456789012L);
        collection.add(901234567890123456L);
        collection.add(345678901234567890L);
        collection.add(789012345678901234L);

        System.out.println("Long ==" +collection);
        System.out.println("Long size before clear=="+collection.size());
        System.out.println("-----------------------------------");
        collection.clear();
        System.out.println("Long size after clear==" +collection.size());
    }
}
