package com.example.kyle.japanesemnemonicsflashcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Map;

public class FlashcardRoomActivity extends AppCompatActivity {
    View flashcardLayout;

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
        flashcardLayout = findViewById(R.id.flashcardLayout);
        flashcardLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_LONG).show();
            }
        });
    }

    private Map<Flashcard, Flashcard> createHiraganaList() {}

    private Map<Flashcard, Flashcard> createKatakanaList() {}

    private Map<Flashcard, Flashcard> createBothList() {}
}
