/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds;

import java.util.Arrays;
import java.util.Stack;

/**
 *
 * @author pranay.kale
 */
public class Test {

    public static void secondLargest() {
        int[] arr = {8, 9, 2, 7, 4, 9, 22, 8, 2, 21};
        //int[] arr = {12, 35, 35, 34};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second largest element is: \n" + second);
        }
    }

    public static void isSorted() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 3, 2};

        boolean flag = true;
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < arr1[i - 1]) {
                flag = false;
                break;
            }
        }
        System.out.println("Array is :" + (flag ? "Sorted" : "Not"));
    }

//    public static boolean isBalancedString(String string) {
//        Stack stack = new Stack();
////{[]
//        for (char ch : string.toCharArray()) {
//            if (ch == '(' || ch == '[' || ch == '{') {
//                stack.push(ch);
//            }// Handle closing brackets
//            else if (ch == ')' || ch == '}' || ch == ']') {
//                if (stack.isEmpty()) return false;
//
//                char top = stack.pop();
//                if ((ch == ')' && top != '(') ||
//                    (ch == '}' && top != '{') ||
//                    (ch == ']' && top != '[')) {
//                    return false;
//                }
//            }
//
//
//        }
//    }




    public static void main(String[] args) {
        secondLargest();
        isSorted();
    }
}
