//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: 
 */

 public class Main {
    public static void main(String[] args) {
        
        Lab1 myLab = new Lab1();

        int[] myArray = {5, 9, 3, 12, 7, 3, 11, 5};

        // Call the created methods
        System.out.println("Max of 10 and 20: " + myLab.max(10, 20));
        System.out.println("Min of 10 and 20: " + myLab.min(10, 20));
        System.out.println("Sum of array elements: " + myLab.sum(myArray));
        System.out.println("Average of array elements: " + myLab.average(myArray));
        System.out.println("Maximum value in array: " + myLab.max(myArray));
        System.out.println("Minimum value in array: " + myLab.min(myArray));

        System.out.println(); // Add a blank line for clarity
        
        // Output the array in order using a while loop
        System.out.print("Array in order: ");
        int i = 0;
        while (i < myArray.length) {
            System.out.print(myArray[i] + " ");
            i++;
        }
        System.out.println();

        // Output the array in reverse using a for loop
        System.out.print("Array in reverse: ");
        for (int j = myArray.length - 1; j >= 0; j--) {
            System.out.print(myArray[j] + " ");
        }
        System.out.println();

        // Output the first and last values of the array
        System.out.println("First value: " + myArray[0]);
        System.out.println("Last value: " + myArray[myArray.length - 1]);
    }
}

// All methods for lab
class Lab1 {
        
   // Method to return the maximum of two integers using an if-statement
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Method to return the minimum of two integers using an if-statement
    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // Method to calculate the sum of array elements
    public int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    // Method to calculate the average of array elements
    public double average(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }
        return (double) sum(arr) / arr.length;
    }

    // Method to find the maximum value in an array
    public int max(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // Method to find the minimum value in an array
    public int min(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
}