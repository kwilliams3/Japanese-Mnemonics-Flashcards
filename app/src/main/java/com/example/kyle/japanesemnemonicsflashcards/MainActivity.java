package com.example.kyle.japanesemnemonicsflashcards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button hiraganaBtn;
    private Button katakanaBtn;
    private Button bothBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSetup();
    }

    private void buttonSetup() {
        hiraganaBtn = (Button) findViewById(R.id.hiraganaBtn);
        katakanaBtn = (Button) findViewById(R.id.katakanaBtn);
        bothBtn = (Button) findViewById(R.id.bothBtn);

        hiraganaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFlashCards(JapaneseAlphabet.HIRAGANA);
            }
        });
        katakanaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFlashCards(JapaneseAlphabet.KATAKANA);
            }
        });
        bothBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFlashCards(JapaneseAlphabet.BOTH);
            }
        });
    }

    private void startFlashCards(JapaneseAlphabet alphabet) {
        Intent intent = new Intent(this, FlashcardRoomActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT, alphabet.toString());
        startActivity(intent);
    }
}
