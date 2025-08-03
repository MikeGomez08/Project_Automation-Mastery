package JavaBasics;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        ArrayMethods();
    }

    public static void ArrayMethods() {
        // .sort - Sorting the arr in ascending order
        // .toString()
        // .equals()
        // .copyOf()
        // .length()

        int arr[] = {10,23,23,4,45,16,47,68,9};
        int arr2[] = {3, 6, 9, 12, 15,18,21, 24, 27, 30};

        //Sort the array
        Arrays.sort(arr);

        // Partial copy of an array
        int[] partialCopy = Arrays.copyOf(arr2, 2);

        System.out.println("Sort the Array " + Arrays.toString(arr));
        System.out.println("Length of the Array " + arr.length);
        System.out.println("Get the String of the Array " + Arrays.toString(arr2));
        System.out.println("Get the partial copy of the arr2 " + Arrays.toString(partialCopy));

        // Compare the array
        Arrays.compare(arr, arr2);

        // equals()
        if (arr.equals(arr2)) {
            System.out.println("Arrays are equals");
        }
        else {
            System.out.println("The arrays are not equal");
        }
    }
}
