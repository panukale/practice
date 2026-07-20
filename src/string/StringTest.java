package string;

/**
 *
 * @author prana
 */
public class StringTest {

    //This is a best way to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //String reverse Manual way
    public static void reverseStringM(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }

    //Using Char Array
    public static void reverseStringUsingCharArray(String str) {
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }

    //return length of String by removing word
    public static int lengthOfString(String str, String skip) {
//        return str.replaceAll(skip, "").length();
        System.out.println("Length :" + (str.length() - skip.length()));
        return str.length() - skip.length();
    }

    public static void main(String[] args) {
//        reverseString("Pranay");
//        reverseStringM("Pranay Kale");
//        reverseStringUsingCharArray("This is java class.");
//        lengthOfString("This is java class", "java");
    }
}
