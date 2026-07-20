/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author prana
 */
public class CollectionBasic {

    public static void main(String[] args) {

        Student s1 = new Student(10, "jack");
        Student s2 = new Student(12, "Rushi");
        Student s3 = new Student(11, "Pranay");
        Student s4 = new Student(17, "Kishor");
        Student s5 = new Student(16, "Ganesh");
        Student s6 = new Student(14, "Prafull");

        List<Student> collection = new ArrayList<>();
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        collection.add(s4);
        collection.add(s5);
        collection.add(s6);

        Comparator<Student> compareComparator = (o1, o2) -> {
            return o1.getAge() > o2.getAge() ? 1 : -1;
        };
        Collections.sort(collection, compareComparator);
        System.out.println("List :");
        collection.stream().forEach((t) -> {
            System.out.println("NAME:" + t.getName()+" AGE:"+t.getAge());
        });

        collection.stream().filter(student -> student.getAge() > 12).forEach(name -> System.out.println("valid student :" + name.getName()));

        Collection<Integer> array = new ArrayList<>();
        array.add(9);
        array.add(4);
        array.add(5);
        array.add(1);
        List<Integer> collect = array.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Arrays :" + collect);

        Set<Integer> sortedArr = new HashSet<>();
        sortedArr.add(1);
        sortedArr.add(4);
        sortedArr.add(2);
        sortedArr.add(9);
        sortedArr.add(6);
        sortedArr.add(6);

        System.out.println("Sorted :" + sortedArr);

        Map<String, Integer> map = new HashMap<>();
        map.put("Pranay", 84);
        map.put("Kishor", 48);
        map.put("Prafulla", 94);
        map.put("Ganesh", 77);
        map.put("Heerak", 30);

        map.entrySet().stream().filter(x -> x.getValue() > 50).forEach(x -> System.out.println("Pass :" + x.getKey()));
        map.entrySet().stream()
                .filter((x) -> x.getValue() > 50)
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
//        System.out.println("Pass " + map);

    }
}
