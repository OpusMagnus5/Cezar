package com.damian.bodzioch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Podaj treść do zaszyfrowania: ");
        String input = in.nextLine();

        System.out.print("Podaj współczynnik przesunięcia: ");
        int displacementFactor = in.nextInt();

        System.out.println(encrypt(input, displacementFactor));
    }

    public static String encrypt(String input, int displacementFactor){
        int index;
        int indexNewLetter;
        String output = "";
        for (int i = 0; i < input.length(); i++){
            if (Character.isLetter(input.charAt(i))) {
                index = Alphabet.getAlphabet().letters.indexOf(Character.toUpperCase(input.charAt(i)));
                if (index + displacementFactor >= Alphabet.getAlphabet().letters.size()) {
                    indexNewLetter = index + displacementFactor - Alphabet.getAlphabet().letters.size() - 1;
                } else if (index + displacementFactor < 0) {
                    indexNewLetter = index + displacementFactor + Alphabet.getAlphabet().letters.size() - 1;
                } else {
                    indexNewLetter = index + displacementFactor;
                }
                if (Character.isUpperCase(input.charAt(i))) {
                    output += Alphabet.getAlphabet().letters.get(indexNewLetter);
                } else {
                    output += Character.toLowerCase(Alphabet.getAlphabet().letters.get(indexNewLetter));
                }
            } else{
                output += input.charAt(i);
            }
        }
        return output;
    }
}
