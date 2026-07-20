/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

    public static void evenList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even List :" + list);

        Map<String, List<Integer>> map = numbers.stream().collect(Collectors.groupingBy(res -> res % 2 == 0 ? "Even" : "Odd"));
        System.out.println("Advence :" + map);
    }

    public static void findMaxFromList() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> num = numbers.stream().distinct().sorted(Comparator.reverseOrder()).findFirst();
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);
        System.out.println("Res :" + num);
    }

    public static void sortedList() {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
        List<Integer> sortedListReversed = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> sortedList = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList + " " + sortedListReversed);
    }

//4. Count Strings with Specific Prefix
    public static void countPrefixString() {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        System.out.println(names.stream().filter(x -> x.startsWith("A")).count());
    }

//5. Find First Non-Repeated Character in a String
    public static void nonRepeatedChar() {
        String input = "swiss";
        Optional<Character> nonRe = input.chars().mapToObj(c -> (char) c).filter(x -> input.indexOf(x) == input.lastIndexOf(x)).findFirst();
        System.out.println("Non-Rep char:" + nonRe);
    }

    public static void main(String[] args) {
//        convertToUppercase();
//        colletToCollection();
//        countNumbers();
//        sumOfEvenNumbers();
//        makeStreamFromArray();
//        evenList();
//        findMaxFromList();
//        sortedList();
//        countPrefixString();
        nonRepeatedChar();
    }
}
