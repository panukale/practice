/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

import sun.management.GarbageCollectionNotifInfoCompositeData;

/**
 *
 * @author prana
 */
public class MainAnimal {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
