import java.util.ArrayList;

public class Dictionary {
    public static ArrayList<Word> words = new ArrayList<Word>();

    public static void printArrayWord(ArrayList<Word> words1) {
        for (int i = 0; i < words1.size(); i++) {
            System.out.println(i + "\t" + words1.get(i).getWord_target()
                                 + "\t" + words1.get(i).getWord_explain());
            i++;
        }
    }

    public Dictionary() {
    }

    public static ArrayList<Word> getWords() {
        return words;
    }

    public static void setWords(ArrayList<Word> words) {
        Dictionary.words = words;
    }
}
