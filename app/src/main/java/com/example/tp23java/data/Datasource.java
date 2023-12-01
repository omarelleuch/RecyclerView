package com.example.tp23java.data;


import com.example.tp23java.model.Word;

import java.util.LinkedList;

public class Datasource {

    public Datasource(){}

    public LinkedList<Word> loadWords(){
        // Mettre les données initiales dans la liste de mots.
        LinkedList<Word> wordList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            wordList.addLast(new Word("Word " + i));
        }
        return wordList;
    }
}
