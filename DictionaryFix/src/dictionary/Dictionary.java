package dictionary;

import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Word> words = new ArrayList<Word>();

    public Dictionary() {
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
    }
    
    public String[] wordList() {
        //Dictionary dictionary = new Dictionary();
        String[] wordListSug = new String[words.size()];
        int index = 0;
        for (int i = 0; i < words.size(); i++) {
            wordListSug[index] = words.get(i).getWord_target();
            index++;
        }
        return wordListSug;
    }   
}
