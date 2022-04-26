package dictionaryadvance;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import javax.swing.JTextArea;

public class DictionaryCommandline {

    Dictionary dictionary = new Dictionary();
    DictionaryManagement dictionaryManagement = new DictionaryManagement();

    /**
     * Display result.
     */
    public void showAllWords(Dictionary dictionary, JTextArea jTextArea) {
        //SortedSet<String> keys = new TreeSet<>(dictionary.getDictionary().keySet());
        jTextArea.append("No" + "\t" + "| English" + "\t" + "| Vietnamese" + "\n");
        int i = 0;
        TreeMap<String, String> sorted = new TreeMap<String, String>(dictionary.getDictionary());
        Set<Map.Entry<String, String>> mappings = sorted.entrySet();
        for (Map.Entry<String, String> mapping : mappings) {
            jTextArea.append(i+ "\t" + mapping.getKey() + "\t" + mapping.getValue() + "\n");
            i++;
        }
    }

    /**
     * Call insertFromCommandline() and showAllWords().
     */
    public void dictionaryBasic() {
        //DictionaryManagement.insertFromCommandline();
        //showAllWords(Dictionary dictionary, JTextArea jTextArea);
    }

    /**
     * menu of dictionary.
     */
    public void dictionaryMenu() {
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

    private boolean isContinue = true; // flag: check if true restart else exit.

    public void functionOfDic() {
        dictionaryMenu();
        Dictionary dictionary = new Dictionary();
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your choice: ");
        choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("-------1. Look up for a new word--------");
                //dictionaryAdvanced();
                //DictionaryManagement.dictionaryLookup();
                //DictionaryManagement.dictionaryExportToFile();
                break;
                
           case 2:
                System.out.println("-----------2. Add a new word------------");
                
                System.out.println("Please enter the wordtarget: ");
                String wordTarget = scan.nextLine();
                
                System.out.println("Please enter the wordexplain: ");
                String wordExplain = scan.nextLine();
                
                dictionaryManagement.addAWord(dictionary, wordTarget, wordExplain);
                //DictionaryCommandline.dictionaryAdvanced();
                dictionaryManagement.dictionaryExportToFile(dictionary);
                break;

            case 3:
                System.out.println("-------------3. Fix a word--------------");
                
                System.out.println("Please enter the wordtarget: ");
                String wordTarget1 = scan.nextLine();
                
                System.out.println("Please enter the wordexplain: ");
                String wordExplain1 = scan.nextLine();
                
                dictionaryManagement.fixAWord(dictionary, wordTarget1, wordExplain1);
                dictionaryManagement.dictionaryExportToFile(dictionary);
                break;

            case 4:
                System.out.println("------------4. Delete a word------------");
                
                System.out.println("Please enter the wordtarget: ");
                String wordTarget2 = scan.nextLine();
                
                dictionaryManagement.deleteAWord(dictionary, wordTarget2);
                //DictionaryCommandline.showAllWords();
                break;

            case 5:
                //DictionaryManagement.dictionaryExportToFile();
                //showAllWords();
                break;

            case 6:
                System.exit(0);
                break;
        }
    }

    public void continueFunction() {
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

    public void dictionaryAdvanced(Dictionary dictionary)  {
        dictionaryManagement.insertFromFile(dictionary);
        functionOfDic();
        while(isContinue){
            continueFunction();
            functionOfDic();
        }
        //dictionarySearcher();
    }

    /**
     * ham search tuyet doi.
     * @param dictionary
     * @param jTextArea
     * @param str 
     */
    public void dictionarySearcher(Dictionary dictionary, JTextArea jTextArea, String str) {
        String key = str.toLowerCase();
        int index = 1;
        for (Map.Entry<String, String> entry : dictionary.getDictionary().entrySet()) {
            index = entry.getKey().indexOf(key);
            if (index == 0) {
                jTextArea.append(entry.getKey() + "\n");
                index++;
            }
        }
    }
}

