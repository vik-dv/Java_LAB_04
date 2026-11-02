package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String[] words = {
                "яблоко", "банан", "апельсин", "яблоко", "груша",
                "банан", "виноград", "яблоко", "киви", "апельсин",
                "манго", "груша", "банан", "персик", "слива",
                "яблоко", "киви", "виноград", "манго", "слива"
        };

        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println("Уникальные слова (" + uniqueWords.size() + " шт.):");
        System.out.println(uniqueWords);
        System.out.println();

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

        }

        System.out.println("Частота слов:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}