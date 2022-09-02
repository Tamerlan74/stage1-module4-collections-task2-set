package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> result = new TreeSet<>();
        for (Integer n : sourceList) {
            result.add(n * n);
        }
        return result.subSet(lowerBound, true, upperBound, true);
    }
}
