package com.example.kyle.japanesemnemonicsflashcards;

/**
 * Created by kyle on 11/1/17.
 */

public enum JapaneseAlphabet {
    HIRAGANA("HIRAGANA"), KATAKANA("KATAKANA"), BOTH("BOTH");

    private String alphabet;

    JapaneseAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    @Override
    public String toString() {
        return alphabet;
    }
}