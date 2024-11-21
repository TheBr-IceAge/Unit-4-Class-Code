package homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //vowel counter
        vowelCounter("The quick brown fox jumped over the lazy dog.");
        System.out.println();
        vowelCounter("aaeeeeiiiioouuuu");
        System.out.println();
        
        //palindrome checker
        palindromeChecker("level");
        System.out.println();
        palindromeChecker("abcde");
        System.out.println();
        palindromeChecker("racecar");
        System.out.println();
        palindromeChecker("aBbA");
        System.out.println();
        
        //extra credit
        palindromeChecker("s*dfj*js");
        System.out.println();
        palindromeChecker("jf&fj");
    }

    //Problem 1: Vowel Counter
    public static void vowelCounter(String str) {
        //go to lower case
        str = str.toLowerCase();

        //initialize variables
        int aC = 0;
        int eC = 0;
        int iC = 0;
        int oC = 0;
        int uC = 0;

        //for loop
        for (int i = 0; i < str.length(); i++) {
            char v = str.charAt(i);
            
            //switch case
            switch (v) {
                case 'a': aC++; break;
                case 'e': eC++; break;
                case 'i': iC++; break;
                case 'o': oC++; break;
                case 'u': uC++; break;
                default: break;
            }
        }

        //printin the numbas
        System.out.println("Number of a's: " + aC);
        System.out.println("Number of e's: " + eC);
        System.out.println("Number of i's: " + iC);
        System.out.println("Number of o's: " + oC);
        System.out.println("Number of u's: " + uC);
    }

    //Problem 2: Palindrome Checker
    public static void palindromeChecker(String str) {
        //googled how to quickly check if a character isn't a letter
        for (int i = 0; i < str.length(); i++) {
            char l = str.charAt(i);
            if (!Character.isLetterOrDigit(l)) {
                System.out.println("Error: Invalid character detected in " + str);
                return;
            }
        }

        //no spaces and lower case(googled how to do no space part)
        //Note: ^ means set isn't valid
        str = str.replaceAll("[^a-z A-Z 0-9]", "").toLowerCase();

        //is it palindrome?(also googled how to do this)
        String pali = new StringBuilder(str).reverse().toString();
        
        if (str.equals(pali)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
