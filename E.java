import java.util.Arrays;
import java.util.Scanner;

public class E {
  public static void posiNegi(int a[]){
    Arrays.sort(a);
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
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
    posiNegi(originalArr);
  }
}



/*
 * An array contains both positive and negative numbers in random order. Rearrange the array elements so that all negative numbers appear before all positive numbers.

Examples : 

Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
 */
