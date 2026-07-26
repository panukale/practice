/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package leetcode;

/**
 *
 * @author prana
 */
public class LeetArrays {
//Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

    public static int maximumProduct(int[] nums) {

        // Track top 3 largest and bottom 2 smallest
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int n : nums) {
            // Update largest values
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }

            // Update smallest values
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }

        // Compare product of top 3 vs product of 2 smallest + largest
        return Math.max(max1 * max2 * max3, max1 * min1 * min2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        int res = maximumProduct(nums);
        System.out.println("max Prod :" + res);
    }
}
