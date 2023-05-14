package com.epam.mjc.collections.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>(firstSet);
        resultSet.retainAll(secondSet);
        resultSet.removeAll(thirdSet);

        Set<String> thirdSetUnique = new HashSet<>(thirdSet);
        thirdSetUnique.removeAll(firstSet);
        thirdSetUnique.removeAll(secondSet);

        resultSet.addAll(thirdSetUnique);
        return resultSet;
    }
}
