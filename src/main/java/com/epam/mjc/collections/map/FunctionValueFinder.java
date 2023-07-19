package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        if (functionMap.containsValue(requiredValue)){
            return true;
        } else {
            return false;
        }
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer,Integer> calculatedMap = new HashMap<>();
        for (Integer number: sourceList){
            int key = number;
            int value = number*5+2;
            calculatedMap.put(key,value);
        }
        return calculatedMap;
    }
}
