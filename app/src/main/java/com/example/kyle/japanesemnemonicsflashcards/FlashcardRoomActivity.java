package com.example.kyle.japanesemnemonicsflashcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FlashcardRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashcard_room);
        String alphabet = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        if (alphabet.equals(JapaneseAlphabet.HIRAGANA.toString())) {
            // do something
        } else if (alphabet.equals(JapaneseAlphabet.KATAKANA.toString())) {
            // do something
        } else {
            // do something
        }
    }
}
