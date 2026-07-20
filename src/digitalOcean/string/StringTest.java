/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalOcean.string;

import com.sun.javafx.css.Combinator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author prana
 */
public class StringTest {

    public static void reverse(String s) {
        char[] toCharArray = s.toCharArray();
        for (int i = toCharArray.length - 1; i >= 0; i--) {
            System.out.print(toCharArray[i]);
        }
    }

    //optimize version
    public String optimizeReverse(String s) {
        char[] toCharArray = s.toCharArray();
        int left = 0;
        int right = toCharArray.length - 1;
        while (left > right) {
            char temp = toCharArray[left];
            toCharArray[left] = toCharArray[right];
            toCharArray[right] = temp;
            left++;
            right--;
        }
        return new String(toCharArray);
    }

//check for vowels
    public static boolean isContainVowels(String s) {
        System.out.println();
        System.out.println(s.matches(".*[aeiou].*") ? "CONTAINS" : "NOT");
        /*
        . -->Any char
        * -->any time
        .* -->any number of any char
        (?i) → ignore case
         */
//        return s.matches(".*[aeiou].*");
        return s.matches("(?i).*[aeiou].*");
    }

    public static void sortStringArray() {
        List<String> s = new ArrayList<>();
        s.add("Pranay");
        s.add("Kalee");
        s.add("Dnyaneshwar");
        s.add("KaranjaLad");
        s.add("panu");

        Comparator<String> c = new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(s, c);
        System.out.println(s);

    }

    public static void main(String[] args) {
        String nameString = "Pranay";
        reverse(nameString);
        isContainVowels("Hi Hello");
        sortStringArray();

    }
}
