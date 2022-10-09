/*
   ID   : 21CE027
   Name : Fachara Raj
   Aim  : Write a program that counts the occurrences of words in a text and displays the words
 *        and their occurrences in alphabetical order of the words. Using Map and Set Classes.
 */

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class Prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to count words: ");
        String s = sc.nextLine();
        String[] words = s.split(" "); // split words into words array
        HashMap result = new HashMap();
        HashSet WordsCounts = new HashSet();

        // adding words to HashSet
        for (int i = 0; i < words.length; i++) {
            WordsCounts.add(words[i]);
        }

        // Storing words and its frequency in HashMap
        for (Object str : WordsCounts) {
            result.put(str.toString(), Count(str.toString(), s));
        }
        System.out.println("***Result***");
        System.out.println(result);
    }

    // returns frequency of words in String
    public static int Count(String str, String mainstr) {
        String[] words = mainstr.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (str.equals(words[i])) {
                count++;
            }
        }
        return count;
    }
}