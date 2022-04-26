package dictionary;

import java.awt.TextField;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.Set;
import javafx.scene.transform.Translate;
import javax.swing.JTextArea;
import org.controlsfx.control.textfield.AutoCompletionBinding;
import org.controlsfx.control.textfield.TextFields;
import static sun.java2d.cmm.ColorTransform.In;

public class DictionaryManagement  {
    
    private Dictionary dictionary;// = new Dictionary();

    public Dictionary getDictionary() {
        return dictionary;
    }
    
    public void insertFromFile(Dictionary dictionary) {
        try {
            Scanner scan = new Scanner(new File("C:\\Users\\Huong\\IdeaProjects\\DictionaryProject\\fileA_V.txt"));
            String line = scan.nextLine();
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Huong\\IdeaProjects\\DictionaryProject\\fileA_V.txt"));
            while ((line = reader.readLine()) != null) {
                // tach string[] lam 2 de dua vao word_target va word_explain
                String[] parts = line.split("\t", 2);
                if (parts.length >= 2) {
                    String word_target = parts[0].trim();// trim() -> cat nhung dau cach o dau va cuoi
                    String word_explain = parts[1].trim();
                    Word word = new Word(word_target, word_explain);
                    dictionary.getWords().add(word);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }
            reader.close();
        } catch (Exception e) {

        }
    }

    
    public void dictionaryLookup(Dictionary dictionary, JTextArea jTextArea, String inputSearchText) {
        /*
        int check = 1;
        for (int i = 0; i < dictionary.getWords().size(); i++) {
            if (dictionary.getWords().get(i).getWord_target().equals(inputSearchText)) {
                jTextArea.setText(dictionary.getWords().get(i).getWord_explain());
                return;
            }
        }
        
        if (check != 1) {
            // thoat khoi vong lap va khong tim thay tu can tim nghia
            jTextArea.append("Sorry! We can't find the word that you're looking for!");
        }
        */
        
        String explainW = dictionary.getWords().get(binarySearch(dictionary.wordList(), inputSearchText)).getWord_explain();
        jTextArea.setText(explainW);
        
    }

    public void addAWord(Dictionary dictionary, String wordTarget, String wordExplain) {
        Word new_word = new Word(wordTarget, wordExplain);
        dictionary.getWords().add(new_word);
    }

    public void fixAWord(Dictionary dictionary, String wordTarget, String newWordExplain) {
        for (int i = 0; i < dictionary.getWords().size(); i++) {
            if (dictionary.getWords().get(i).getWord_target().equals(wordTarget)) {
                dictionary.getWords().get(i).setWord_explain(newWordExplain);
                return;
            }
        }
        
        // thoat khoi vong lap va khong tim thay tu can fix
        System.out.println("Sorry! We can't find the word that you're looking for!");
    }

    public void deleteAWord(Dictionary dictionary, String wordTarget) {
         for (int i = 0; i < dictionary.getWords().size(); i++) {
            if (dictionary.getWords().get(i).getWord_target().equals(wordTarget)) {
                dictionary.getWords().remove(i);
                return;
            }
        }
         
        // thoat khoi vong lap va khong tim thay tu can xoa
        System.out.println("Sorry! We can't find the word that you're looking for!");
    }

    public void dictionaryExportToFile(Dictionary dictionary) {
        File file = new File("C:\\Users\\Huong\\Documents\\NetBeansProjects\\Dictionary\\Export.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            for (int i = 0; i < dictionary.getWords().size(); i++) {
                String temp = dictionary.getWords().get(i).getWord_target() + "\t" +  dictionary.getWords().get(i).getWord_explain() + "\n";
                fileOutputStream.write(temp.getBytes());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    } 

    public int binarySearch(String[] arr, String str) 
    { 
        int left = 0;
        int right = arr.length - 1; 
        while (left <= right) { 
            int mid = left + (right - left) / 2; 
  
            int res = str.compareTo(arr[mid]); 
  
            // Check if x is present at mid 
            if (res == 0) 
                return mid; 
  
            // If x greater, ignore left half 
            if (res > 0) 
                left = mid + 1; 
  
            // If x is smaller, ignore right half 
            else
                right = mid - 1; 
        } 
  
        return -1; 
    }
    
}
  
