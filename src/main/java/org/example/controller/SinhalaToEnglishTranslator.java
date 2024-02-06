package org.example.controller;

import java.util.HashMap;
import java.util.Map;

public class SinhalaToEnglishTranslator {

    private static final Map<String, String> sinhalaToEnglishMap = new HashMap<>();

    //  ක්‍රමයක් ඇතොත් මටත් කියන්න
    static {
        // Initialize the Sinhala to English translation map
        sinhalaToEnglishMap.put("අ", "a");
        sinhalaToEnglishMap.put("ආ", "aa");
        sinhalaToEnglishMap.put("ඇ", "ae");
        sinhalaToEnglishMap.put("ඈ", "ae");
        sinhalaToEnglishMap.put("ඉ", "i");
        sinhalaToEnglishMap.put("ඊ", "ii");
        sinhalaToEnglishMap.put("උ", "u");
        sinhalaToEnglishMap.put("ඌ", "uu");
        sinhalaToEnglishMap.put("එ", "e");
        sinhalaToEnglishMap.put("ඒ", "ee");
        sinhalaToEnglishMap.put("ඔ", "o");
        sinhalaToEnglishMap.put("ඕ", "oo");
        sinhalaToEnglishMap.put("ක", "ka");
        sinhalaToEnglishMap.put("ක්", "k");
        sinhalaToEnglishMap.put("ක්‍ව", "kva");
        sinhalaToEnglishMap.put("ක්‍ව්", "kv");
        sinhalaToEnglishMap.put("ක්‍වෝ", "kvoo");
        sinhalaToEnglishMap.put("ඛ", "kha");

        // Add mappings for consonants with vowels
       /* addConsonantWithVowels("ක", "k");
        addConsonantWithVowels("ඛ", "kh");
        addConsonantWithVowels("ග", "g");
        addConsonantWithVowels("ඝ", "gh");
        addConsonantWithVowels("ඞ", "ng");*/

    }

    /*private static void addConsonantWithVowels(String consonant, String transliteration) {
        String[] vowels = {"", "ා", "ැ", "ෑ", "ි", "ී", "ු", "ූ", "ෙ", "ේ", "ො", "ෝ", "්"};
        for (String vowel : vowels) {
            sinhalaToEnglishMap.put(consonant + vowel, transliteration + vowel);
        }*/


    public static String translateToEnglish(String sinhalaText) {
        /*StringBuilder translatedText = new StringBuilder();
        for (char c : sinhalaText.toCharArray()) {
            String translation = sinhalaToEnglishMap.getOrDefault(c, String.valueOf(c));
            translatedText.append(translation);
        }
        return translatedText.toString();
    }*/
        StringBuilder translatedText = new StringBuilder();
        int index = 0;
        while (index < sinhalaText.length()) {
            int codePoint = sinhalaText.codePointAt(index);
            String character = Character.toString(codePoint);
            String translation = sinhalaToEnglishMap.getOrDefault(character, character);
            translatedText.append(translation);
            index += Character.charCount(codePoint);
        }
        return translatedText.toString();
    }
}

