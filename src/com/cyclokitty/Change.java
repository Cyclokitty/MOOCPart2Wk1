package com.cyclokitty;

public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        String changedWord = "";
        for (int i = 0; i < characterString.length(); i++) {
            char character = characterString.charAt(i);
            if (character == this.fromCharacter) {
                changedWord += this.toCharacter;
            } else {
                changedWord += character;
            }
        }
        return changedWord;
    }
}
