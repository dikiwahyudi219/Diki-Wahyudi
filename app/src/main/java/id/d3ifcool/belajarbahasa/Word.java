package id.d3ifcool.belajarbahasa;

public class Word {
    private String linguisWord;
    private String defaultWord;

    public Word(String miwokWord, String defaultWord) {
        this.linguisWord = miwokWord;
        this.defaultWord = defaultWord;
    }


    public String getLinguisWord() {
        return linguisWord;
    }

    public void setLinguisWord(String linguisWord) {
        this.linguisWord = linguisWord;
    }

    public String getDefaultWord() {
        return defaultWord;
    }

    public void setDefaultWord(String defaultWord) {
        this.defaultWord = defaultWord;
    }

}


