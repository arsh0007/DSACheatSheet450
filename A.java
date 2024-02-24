import java.util.Scanner;

public class A {
  public static void reverse(int arr[], int n){
    int reversed [] = new int [n];
    for (int i = 0; i < arr.length; i++) {
      reversed[i]=arr[n-i-1];
    }
    for (int i : reversed) {
      System.out.print(i +" ");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    int originalArr[] = new int[n];
    System.out.print("Enter the elements in to the array: ");
    for (int i = 0; i < n; i++) {
      originalArr[i]=sc.nextInt();
    }
    System.out.print("[");
    reverse(originalArr, n);
    System.out.print("]");
  }
}



/*
 * Array reverse or reverse a array means changing the position of each number of the given array to its opposite position from end, i.e. if a number is at position 1 then its new position will be Array.length, similarly if a number is at position 2 then its new position will be Array.length – 1, and so on.

Array Reverse in C/C++/Java/Python/JavaScript
Array Reverse in C/C++/Java/Python/JavaScript

Given an array (or string), the task is to reverse the array/string.

Examples:

Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}

Input: original_array[] = {4, 5, 1, 2}
Output: array_reversed[] = {2, 1, 5, 4}
*/