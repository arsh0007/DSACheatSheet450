import java.util.Arrays;
import java.util.Scanner;

public class D {
  public static void ascending(int a[]){
    Arrays.sort(a);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
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
   System.out.println("Ascending order: ");
   ascending(originalArr);
  }
}




/*
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.

Your Task:
You don't need to read input or print anything. Your task is to complete the function sort012() that takes an array arr and N as input parameters and sorts the array in-place.


 */