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
