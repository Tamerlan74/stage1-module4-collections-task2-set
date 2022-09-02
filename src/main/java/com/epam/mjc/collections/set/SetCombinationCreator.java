package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> result = new HashSet<>();
        result.addAll(firstSet);
        result.addAll(secondSet);
        result.addAll(thirdSet);
        result.removeAll(firstSet);
        result.removeAll(secondSet);
        firstSet.retainAll(secondSet);
        result.addAll(firstSet);
        return result;
    }
}
