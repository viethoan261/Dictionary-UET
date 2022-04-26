package dictionaryadvance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javafx.scene.transform.Translate;
import javax.swing.JTextArea;

public class DictionaryManagement  {
    
    Dictionary dictionary = new Dictionary();

    public void insertFromFile(Dictionary dictionary) {
        try {
            Scanner scan = new Scanner(new File("C:\\Users\\Huong\\IdeaProjects\\DictionaryProject\\fileA_V.txt"));
            String line = scan.nextLine();
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Huong\\IdeaProjects\\DictionaryProject\\fileA_V.txt"));
            while ((line = reader.readLine()) != null) {
                // tach string[] lam 2 de dua vao word_target va word_explain
                String[] parts = line.split("\t", 2);
                if (parts.length >= 2) {
                    String key = parts[0].trim();// trim() -> cat nhung dau cach o dau va cuoi
                    String value = parts[1].trim();
                    //Word word = new Word(key, value);
                    dictionary.getDictionary().put(key, value);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }
            reader.close();
        } catch (Exception e) {

        }
    }

    public void dictionaryLookup(Dictionary dictionary, JTextArea jTextArea, String inputSearchText) {
        if (dictionary.getDictionary().containsKey(inputSearchText)) {
            jTextArea.setText(dictionary.getDictionary().get(inputSearchText));  
        } else {
            jTextArea.setText("Sorry! We can't find the word that you're looking for!");
        }
    }

    public void addAWord(Dictionary dictionary, String wordTarget, String wordExplain) { 
        //Word new_word = new Word(wordTarget, wordExplain);
        for (Map.Entry<String, String> entry : dictionary.getDictionary().entrySet()) {
            if (entry.getKey() != wordTarget) {
                dictionary.getDictionary().put(wordTarget, wordExplain);
            }
        }
    }

    public void fixAWord(Dictionary dictionary, String wordTarget, String newWordExplain) {

        for (Map.Entry<String, String> entry : dictionary.getDictionary().entrySet()) {
            //if (entry.getKey() == wordTarget) {
                dictionary.getDictionary().replace(wordTarget, newWordExplain);
            
        }
        

        // thoat khoi vong lap va khong tim thay tu can fix
        //System.out.println("Sorry! We can't find the word that you're looking for!");
    }

    public void deleteAWord(Dictionary dictionary, String wordTarget) {
         for (int i = 0; i < dictionary.getDictionary().size(); i++) {
            if (dictionary.getDictionary().containsKey(wordTarget)) {
                dictionary.getDictionary().remove(i);
                return;
            }
        }
         
        // thoat khoi vong lap va khong tim thay tu can xoa
        System.out.println("Sorry! We can't find the word that you're looking for!");
    }

    public void dictionaryExportToFile(Dictionary dictionary) {
        File file = new File("C:\\Users\\Huong\\Documents\\NetBeansProjects\\DictionaryAdvance\\exportFile.txt");
        try {
            FileWriter fw = new FileWriter(file);
            TreeMap<String, String> sorted = new TreeMap<String, String>(dictionary.getDictionary());
            Set<Map.Entry<String, String>> mappings = sorted.entrySet();
            for (Map.Entry<String, String> mapping : mappings) {
                String temp = mapping.getKey() + "\t" + mapping.getValue() + "\n";
                fw.write(temp);
            }
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }     
}
