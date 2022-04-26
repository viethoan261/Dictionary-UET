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

    /**
     * menu of dictionary.
     */
    public static void dictionaryMenu() {
        System.out.println("==============DICTIONARY=============");
        System.out.println("======== ENGLISH - VIETNAMESE =======");
        System.out.println("================MENU=================");
        System.out.println("1. Look up for new word");
        System.out.println("2. Add a new word into the dictionary");
        System.out.println("3. Fix a word");
        System.out.println("4. Delete a word");
        System.out.println("5. Show all words of the dictionary");
        System.out.println("6. Exit program");
        System.out.println("=====================================");
        //System.out.println("Your choice is: ");
    }

    public static void dictionarySearcher() {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Please enter your word you want to look up: ");
        String str = scan.nextLine();

        for (Word word: words) {
            int index = word.getWord_target().indexOf(str);
            if (index == 0) {
                System.out.println(word.getWord_target() + "\t|" + word.getWord_explain());
            }
        }
    }

    private static boolean isContinue = true;

    public static void functionOfDic() {
        dictionaryMenu();
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your choice: ");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("-------1. Look up for a new word--------");
                //dictionaryAdvanced();
                DictionaryManagement.dictionaryLookup();
                DictionaryManagement.dictionaryExportToFile();
                break;

            case 2:
                System.out.println("-----------2. Add a new word------------");
                DictionaryManagement.addAWord();
                //DictionaryCommandline.dictionaryAdvanced();
                DictionaryManagement.dictionaryExportToFile();
                break;

            case 3:
                System.out.println("-------------3. Fix a word--------------");
                DictionaryManagement.fixAWord();
                DictionaryManagement.dictionaryExportToFile();
                break;

            case 4:
                System.out.println("------------4. Delete a word------------");
                DictionaryManagement.deleteAWord();
                //DictionaryCommandline.showAllWords();
                break;

            case 5:
                //DictionaryManagement.dictionaryExportToFile();
                showAllWords();
                break;

            case 6:
                System.exit(0);
                break;
        }
    }

    public static void continueFunction() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Do you want to continue?:(YES/NO) :");

        String action = scan.nextLine();
        String question = action.toUpperCase();

        if (question.equalsIgnoreCase("NO")) {
            System.exit(0);
        } else {
            isContinue = true;
        }
    }

    public static void dictionaryAdvanced()  {
        DictionaryManagement.insertFromFile();
        functionOfDic();
        while(isContinue){
            continueFunction();
            functionOfDic();
        }
        //dictionarySearcher();
    }
}

