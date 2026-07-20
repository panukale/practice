package takeyouforward.dsa.sort;

import java.util.Arrays;

/**
 *
 * @author pranay.kale
 */
public class SortTest {

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minValIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minValIndex]) {
                    minValIndex = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minValIndex];
            arr[minValIndex] = temp;
        }
    }

    public static void selectionSortUsingMax(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            int maxValIndex = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[maxValIndex]) {
                    maxValIndex = j;
                }
            }
            int temp = arr[maxValIndex];
            arr[maxValIndex] = arr[i];
            arr[i] = temp;
            System.out.println(Arrays.toString(arr));
        }

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }

    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        //12,5,6,3,18 0 mid 
        //[12,5][6] [3,18]
        //[12][5][6][3][18]
        //Step 1 create a array
        System.out.println("Left :" + left + " Right :" + right + " mid :" + mid);
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        //iterate till left and mid+1 is <= end of array
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }
        System.out.println("Array after merge: " + Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr, int left, int right) {

        System.out.println("mergeSort called -> left: " + left + " right: " + right + " arr" + Arrays.toString(arr));

        if (left >= right) {
            System.out.println("Conditoin Fails");
            return;
        }

        int mid = (left + right) / 2;

        System.out.println("mid = " + mid);

        mergeSort(arr, left, mid);
        System.out.println("calling second half");
        mergeSort(arr, mid + 1, right);
        System.out.println("calling MERGE METHOD");
        merge(arr, left, mid, right);
    }

    public static void bubbleSortUsingRec(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSortUsingRec(arr, n - 1);

    }

    public static void main(String[] args) {
        int[] arr = {13, 2, 8, 33, 5};
//        selectionSort(arr);
//        selectionSortUsingMax(arr);
//        bubbleSort(arr);
//        insertionSort(arr);
//        mergeSort(arr, 0, arr.length - 1);
//        bubbleSortUsingRec(arr, arr.length);
        System.out.println("Sorted :" + Arrays.toString(arr));
    }
}
