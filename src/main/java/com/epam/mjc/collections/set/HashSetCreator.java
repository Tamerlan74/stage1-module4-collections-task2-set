package com.epam.mjc.collections.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            result.addAll(addNumber(sourceList.get(i)));
        }
        return result;
    }

    private HashSet<Integer> addOddNumber(int n) {
        Collection<Integer> numbers = List.of(n, n * 2);
        return new HashSet<>(numbers);
    }

    private HashSet<Integer> addEvenNumber(int n) {
        HashSet<Integer> result = new HashSet<>();
        result.add(n);
        if (n % 2 == 0) {
            result.addAll(addEvenNumber(n / 2));
        }
        return result;
    }

    private HashSet<Integer> addNumber(int n) {
        if (n % 2 == 0) {
            return addEvenNumber(n);
        } else {
            return addOddNumber(n);
        }
    }
}
