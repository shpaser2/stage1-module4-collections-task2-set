package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (Integer i : sourceList) {
            treeSet.add(i * i);
        }
        return treeSet.subSet(lowerBound, true, upperBound, true);
    }
}
