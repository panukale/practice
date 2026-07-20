package takeyouforward.dsa.array;

import java.util.Arrays;

/**
 *
 * @author pranay.kale
 */
public class ArraysProblem {

    public static void largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest :" + largest);
    }

    public static void secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest :" + secondLargest);
    }

    public static void isSorted(int[] arr) {
        //13, 5, 3, 21, 28
        /*
          i=0 13<5 loop break and flag =False
        //1,2,3,4,5
          i=0 1<2
          i=1 2<3
          i=2 3<4
          i=3 4<5
          i=4 here my loop should break
         */
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.print("Array is " + (isSorted ? "Sorted." : "Not Sorted."));

    }

    public static void removeDuplicates(int[] arr) {
        //1,1,2,2,2,3,3,3
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        while (i < arr.length - 1) {
            i++;
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void leftRotateByOne(int[] arr) {
        //1,2,3,4,5
        //2,2,3,4,5 i=0 j=1
        //2,3,3,4,5 i=1 j=2
        //2,3,4,4,5 i=2 j=3
        //2,3,4,5,5 i=3 j=4
        int first = arr[0];
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            arr[i] = arr[j];
            i++;

        }
        arr[i] = first;

        System.out.println(Arrays.toString(arr));

    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
//        System.out.println("Rev :" + Arrays.toString(arr));
    }

    public static void rotateByK(int[] arr, int k, String direction) {
        int n = arr.length;
        if (n == 0 || k == 0) {
            return;
        }
        System.out.println("Before :" + Arrays.toString(arr));
        if (direction.equals("right")) {

            //normalize k if > than n
            k = k % n;
            //reverse entire array
            reverseArray(arr, 0, n - 1);

            //reverse 1st k element
            reverseArray(arr, 0, k - 1);

            //reverse remaining n-k element
            reverseArray(arr, k, n - 1);
        } else if (direction.equals("left")) {
            //13,  5,  3, 21, 28
            //28, 21,  3,  5, 13
            // 3, 21, 28,  5, 13
            //
            reverseArray(arr, 0, k - 1);
            reverseArray(arr, k, n - 1);
            reverseArray(arr, 0, n - 1);

        }

    }

    public static void rotateByK(int[] arr, int k) {
        //take into new Array
        //13, 5, 3, 21, 28
        System.out.println("Before :" + Arrays.toString(arr));
        int[] temp = new int[k];
        int i;
        for (i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        for (int j = 0; j < arr.length; j++) {
            if (j < arr.length - k) {
                arr[j] = arr[i];
                i++;
            } else {
                arr[j] = temp[i - arr.length];
                i++;
            }
        }
        System.out.println("After :" + Arrays.toString(arr));

    }

    public static int findUniqueNumber(int[] arr) {
        //2,2,1 -->1
        //4,2,1,1,2 --> 4
        int n = arr.length;
        //Sort the array
        Arrays.sort(arr);

        //Check each element with adjacent
        for (int i = 0; i < n - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                System.out.println("Unique element is:" + arr[i]);
                return arr[i];
            }
        }
        System.out.println("Unique element is :" + arr[n - 1]);
        return arr[n - 1];

    }

    public static int findUniqueNumberOptimize(int[] arr) {
        if (true) {
        }
        //2,2,1 -->1
        //4,2,1,1,2 --> 4
        int n = arr.length;

        int result = 0;
        //Do the XOR of each element.
        for (int val : arr) {
            result = result ^ val;
        }
        System.out.println("Unique element is :" + result);
        return result;

    }

    public static void longestSubArray(int[] arr, int k) {

    }

    public static void main(String[] args) {
//        int[] arr = {13, 5, 3, 21, 28};
//        int[] arr = {2, 2, 1};
        int[] arr = {4, 5, 2, 2, 1, 1, 4};
//        int[] arr = {-3, 1, 1, 3, 3, 5, 6, 7, 8, 9};
//        largest(arr);
//        secondLargest(arr);
//        isSorted(arr);
//        removeDuplicates(arr);
//        leftRotateByOne(arr);
//        reverseArray(arr, 0, arr.length - 1);
//        rotateByK(arr, 2, "left");
//        rotateByK(arr, 2);
        findUniqueNumberOptimize(arr);
//        System.out.println("Rotate :" + Arrays.toString(arr));
    }

}
