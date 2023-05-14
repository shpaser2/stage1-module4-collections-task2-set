package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();
        for (Integer i : sourceList) {
            if (i % 2 == 0) {
                while (i % 2 == 0) {
                    resultSet.add(i);
                    i /= 2;
                }
                resultSet.add(i);
            } else {
                resultSet.add(i);
                resultSet.add(i * 2);
            }
        }
        return resultSet;
    }
}
