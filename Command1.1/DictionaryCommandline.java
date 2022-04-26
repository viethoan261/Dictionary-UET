import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class DictionaryCommandline extends Dictionary {

    public DictionaryCommandline() {
    }

    /**
     * Display result.
     */
    public static void showAllWords() {
        System.out.println("No" + "\t" + "| English" + "\t" + "| Vietnamese");
        //int i = 1;
        for (int i = 1; i <= words.size(); i++) {
            System.out.println(i + "\t" + "| " + words.get(i).getWord_target()
                    + "\t" + "| " + words.get(i).getWord_explain());
            i++;
        }
    }

    /**
     * Call insertFromCommandline() and showAllWords().
     */
    public static void dictionaryBasic() {
        DictionaryManagement.insertFromCommandline();
        showAllWords();
    }
    public static void dictionaryAdvanced()  {
        DictionaryManagement.insertFromFile();
        DictionaryManagement.dictionaryLookup();
        DictionaryCommandline.showAllWords();
        }
        //dictionarySearcher();
    }
