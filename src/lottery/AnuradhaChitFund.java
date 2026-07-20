/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lottery;

import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author prana
 */
public class AnuradhaChitFund {

    private static final List<String> PARTICIPANTS = new ArrayList<>();

    static {
//        PARTICIPANTS.add("Pranay");
//        PARTICIPANTS.add("Harshad");
//        PARTICIPANTS.add("Kishor");
//        PARTICIPANTS.add("Vishal");
        PARTICIPANTS.add("Lalit");
        PARTICIPANTS.add("Minal");
        PARTICIPANTS.add("Rushi");
        PARTICIPANTS.add("Teju");
        PARTICIPANTS.add("Pooja");
//        PARTICIPANTS.add("Heerak");
        PARTICIPANTS.add("Dr.Billewar");
        PARTICIPANTS.add("Raheja");

        // 12 more random names
//        PARTICIPANTS.add("Sneha");
//        PARTICIPANTS.add("Yash");
//        PARTICIPANTS.add("Aarav");
//        PARTICIPANTS.add("Tanvi");
//        PARTICIPANTS.add("Omkar");
//        PARTICIPANTS.add("Siddhi");
//        PARTICIPANTS.add("Neha");
//        PARTICIPANTS.add("Rajat");
//        PARTICIPANTS.add("Priya");
//        PARTICIPANTS.add("Aditya");
//        PARTICIPANTS.add("Sakshi");
//        PARTICIPANTS.add("Nikhil");
    }
    private static final Random RANDOM = new Random();

    public static void main(String[] args) throws InterruptedException {
        if (PARTICIPANTS.isEmpty()) {
            System.out.println("No participants left for the lucky draw.");
            return;
        }

        System.out.println("\n======================================");
        System.out.println("✨ Spinning the wheel... ✨");
        System.out.print("🎡 [ ");

        // Simulating an animated rolling effect
        for (int i = 0; i < 15; i++) {
            String randomName = PARTICIPANTS.get(RANDOM.nextInt(PARTICIPANTS.size()));
            System.out.print(randomName + " 🎈 ");
            Thread.sleep(2000); // Faster animation
        }

        int index = RANDOM.nextInt(PARTICIPANTS.size());
        String luckyParticipant = PARTICIPANTS.remove(index); // Remove to prevent repeat winners

        System.out.print("] 🎉\n");
        System.out.println("\n======================================");
        System.out.println("🎊🎊 CONGRATULATIONS!!! 🎊🎊");
        System.out.println("🏆 The Lucky Draw Winner for " + LocalDateTime.now().getMonth() + " is: 🎈🎊 " + luckyParticipant + " 🎊🎈");
        System.out.println("🎆✨ Enjoy your prize! ✨🎆");
        System.out.println("======================================\n");

        // You can manually comment out the winner's name in PARTICIPANTS list to avoid repetition.
    }
}
