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
}