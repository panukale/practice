/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author prana
 */
public class FindNonRepeChar {

    public static void nonRepeChar(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("Wrong input");
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toLowerCase().toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("The value is :" + entry.getKey());
                break;
            }
        }
    }

    public static Character findFirstNonRepeating(String input) {
        String value = input.toLowerCase();

        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);

            if (value.indexOf(ch) == value.lastIndexOf(ch)) {
                return ch;
            }
        }

        return null;
    }

    public static void filterName() {
        List<String> list = Arrays.asList("Pranay", "Java", "Python", "Advance");
    }

    public static void main(String[] args) {
        nonRepeChar("Aabbccdfg");
    }
}
