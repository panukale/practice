/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author prana
 */
public class Basic {

    public void getAllEven() {
        //Filter function is use to filter the stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(val -> val % 2 == 0)
                .forEach(System.out::println);
    }

    public static void convertToUppercase() {
        List<String> words = Arrays.asList("java", "stream");
        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    public static void sortList() {
        List<Integer> nums = Arrays.asList(3, 1, 4, 2);
        nums.stream()
                .sorted()
                .forEach(System.out::println);
    }

    public static void colletToCollection() {
        //filter the list to print of collect only those numbers which are greater then 15.
        List<Integer> listOfNumber = Arrays.asList(8, 3, 7, 4, 9, 2, 57, 48, 94, 39, 82, 88, 42, 89, 40, 78);
        List<Integer> filterList = listOfNumber.stream()
                .filter(val -> val > 15)
                .collect(Collectors.toList());
        System.out.println("List which is greater than 15 :" + filterList);
    }

    public static void countNumbers() {
        List<Integer> listOfNumber = Arrays.asList(8, 3, 7, 4, 9, 2, 57, 94, 39, 82, 88, 42, 89, 40, 78);
        long count = listOfNumber.stream().count();
        System.out.println("Total numbers is :" + count);
    }

    public static void sumOfEvenNumbers() {
        List<Integer> listOfNumber = Arrays.asList(8, 3, 7, 4, 9, 2, 57, 48, 34, 79, 82, 97, 42, 89, 40, 78);
        Integer reduce = listOfNumber.stream().filter(x -> x % 2 == 0).reduce(0, (a, b) -> a + b);
        System.out.println("Total of all numbers :" + reduce);
    }

    public static void makeStreamFromArray() {
        int[] arr = {1, 2, 3};
        IntStream stream = Arrays.stream(arr);
        Stream<String> stringStream = Stream.of("a", "b", "c");
        System.out.println(stream);
        System.out.println(stringStream);

    }

    public static void main(String[] args) {
//        convertToUppercase();
//        colletToCollection();
//        countNumbers();
//        sumOfEvenNumbers();
        makeStreamFromArray();
    }
}
