package com.example.kyle.japanesemnemonicsflashcards;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kyle on 11/5/17.
 */

public class Flashcard {
    private ImageView character;
    private TextView characterPronunciation;
    private TextView mnemonicDescription;

    public ImageView getCharacter() {
        return character;
    }

    public void setCharacter(ImageView character) {
        this.character = character;
    }

    public TextView getCharacterPronunciation() {
        return characterPronunciation;
    }

    public void setCharacterPronunciation(TextView characterPronunciation) {
        this.characterPronunciation = characterPronunciation;
    }

    public TextView getMnemonicDescription() {
        return mnemonicDescription;
    }

    public void setMnemonicDescription(TextView mnemonicDescription) {
        this.mnemonicDescription = mnemonicDescription;
    }

    public Flashcard(ImageView character, TextView characterPronunciation, TextView mnemonicDescription) {
        this.character = character;
        this.characterPronunciation = characterPronunciation;
        this.mnemonicDescription = mnemonicDescription;
    }
}
