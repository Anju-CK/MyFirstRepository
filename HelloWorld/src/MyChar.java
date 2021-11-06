
package dataTypes;

public class MyChar {
    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if (ch == 'a' || ch == 'A') {
            return true;
        }
        if (ch == 'e' || ch == 'E') {
            return true;
        }
        if (ch == 'i' || ch == 'I') {
            return true;
        }
        if (ch == 'o' || ch == 'O') {
            return true;
        }
        if (ch == 'u' || ch == 'U') {
            return true;
        }

        return false;
    }

    public boolean isDigit() {
        if (ch >= 48 && ch <= 57) {
            return true;
        }
        return false;
    }

    public boolean isAlphabet() {
        if (ch >= 65 && ch <= 90) {
            return true;
        }
        if (ch >= 97 && ch <= 122) {
            return true;
        }

        return false;
    }

    public boolean isConsonant() {
        if (isAlphabet() && !isVowel()) {
            return true;
        }

        return false;
    }


}

