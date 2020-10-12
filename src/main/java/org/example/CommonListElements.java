package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class CommonListElements {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,1,1,2,3,4);
        List<Integer> l2 = Arrays.asList(1,1,3,3,4);

        System.out.println(mergeCommonUniqueElements(l1, l2));
    }


    static List<Integer> mergeCommonUniqueElements(List<Integer> l1, List<Integer> l2) {
        Set<Integer> merged = new HashSet<>();

        return l1.stream()
                .filter(merged::add)
                .filter(l2::contains)
                .sorted()
                .collect(Collectors.toList());
    }
}
