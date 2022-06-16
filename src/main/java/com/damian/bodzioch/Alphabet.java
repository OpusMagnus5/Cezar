package com.damian.bodzioch;

import java.util.ArrayList;

public class Alphabet {
    public final ArrayList<Character> letters = new ArrayList<>();


    private static final Alphabet alphabet = new Alphabet();

    private Alphabet(){
        for (int i = 65; i <= 90; i++){
            if (i == 'Q' || i == 'V' || i == 'X'){
                continue;
            }
            this.letters.add((char) i);
        }
        this.letters.add(1, 'Ą');
        this.letters.add(4, 'Ć');
        this.letters.add(7, 'Ę');
        this.letters.add(15, 'Ł');
        this.letters.add(18, 'Ń');
        this.letters.add(20, 'Ó');
        this.letters.add(24, 'Ś');
        this.letters.add('Ź');
        this.letters.add('Ż');
    }

    public static Alphabet getAlphabet() {
        return alphabet;
    }
}
