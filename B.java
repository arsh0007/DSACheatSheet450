import java.util.Arrays;
import java.util.Scanner;

public class B {
  public static void maxMini(int [] arr){
    //Using Sorting
    Arrays.sort(arr);
    int min = arr[0];
    int max = arr[arr.length-1];
    System.out.println("Min: "+min+" Max: "+max);

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
    maxMini(originalArr);
  }
}


/*
 * Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

Examples:

Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
              Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
              Maximum element is: 35
 */