import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DictionaryManagement extends Dictionary {

    public static void insertFromCommandline() {
        Scanner scanner = new Scanner(System.in);

        int numberOfWord = scanner.nextInt();//number of words input

        for (int i = 1; i <= numberOfWord; i++) {
            String inputWordTarget = scanner.nextLine();//nhap vao 1 tu tieng anh
            String inputWordExplain = scanner.nextLine();//nhap vao 1 tu tieng viet giai nghia
            Word inputWord = new Word(inputWordTarget, inputWordExplain);
            words.add(inputWord);//add vao list
        }
        scanner.close();
    }

    public static void insertFromFile() {
        try {
            Scanner scan = new Scanner(new File("C:\\Users\\DELL\\Desktop\\Dictionary1\\fileA_V.txt"));
            String line = scan.nextLine();
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\Dictionary1\\fileA_V.txt"));
            while ((line = reader.readLine()) != null) {
                // tach string[] lam 2 de dua vao word_target va word_explain
                String[] parts = line.split("\t", 2);
                if (parts.length >= 2) {
                    String word_target = parts[0].trim();// trim() -> cat nhung dau cach o dau va cuoi
                    String word_explain = parts[1].trim();
                    Word word = new Word(word_target, word_explain);
                    words.add(word);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }
            reader.close();
        } catch (Exception e) {

        }
    }

    public static void dictionaryLookup() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your word that you want to look up: ");
        String newWordTarget = scan.nextLine();

        for (Word word: words) {
            if (word.getWord_target().equals(newWordTarget)) {
                System.out.println(word.getWord_explain());
                return;
            }
        }
        // thoat vong lap va neu ko tim thay tu can tra thi in ra man hinh
        System.out.println("Sorry! We can't find the word that you're looking for!");
    }

    public static void addAWord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your word you want to add: ");
        System.out.println("Please enter the Word_target: ");
        String newWordTarget = scan.nextLine();
        System.out.println("Please enter the Word_plain: ");
        String newWordExplain = scan.nextLine();
        Word new_word = new Word(newWordTarget, newWordExplain);
        words.add(new_word);
    }

    public static void fixAWord() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the word that you want to fix: ");
        String fix = scan.nextLine();

        for (Word word: words) {
            if (fix.equals(word.getWord_target())) {
                System.out.println("Word target is fixed: ");
                fix = scan.nextLine();
                word.setWord_target(fix);

                System.out.println("Word explain is fixed: ");
                fix = scan.nextLine();
                word.setWord_explain(fix);
                return;
            }
        }

        // thoat vong lap va neu ko tim thay tu can tra thi in ra man hinh
        System.out.println("Sorry! We can't find the word that you're looking for!");
    }

    public static void deleteAWord() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the word that you want to delete: ");
        String deleteWordTarget = scan.nextLine();

        for (Word word: words) {
            if (deleteWordTarget.equals(word.getWord_target())) {
                words.remove(deleteWordTarget);
                return;
            }
        }
    }

    public static void dictionaryExportToFile() {
        File file = new File("C:\\Users\\DELL\\Desktop\\Dictionary1\\fileA_V.txt");


        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            for (Word word: words) {
                String temp = word.getWord_target() + "\t" + word.getWord_explain() + "\n";
                fileOutputStream.write(temp.getBytes());
            }
            System.out.println("Successful!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
