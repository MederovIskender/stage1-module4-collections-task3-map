package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordMap = new HashMap<>();

        // Split the sentence into words using non-word characters as delimiters
        String[] words = sentence.toLowerCase().split("\\s+");

        for (String word : words) {
            word = word.replaceAll("^\\p{Punct}+|\\p{Punct}+$", "");
            // Increment the count if the word already exists in the map
            // Otherwise, add the word to the map with an initial count of 1
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        return wordMap;
    }
}
