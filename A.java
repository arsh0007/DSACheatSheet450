import java.util.Scanner;

public class A {
  public static int [] reverse(int arr[], int n){
    for (int i = 0; i < arr.length; i++) {
      arr[i]=arr[n-i];
    }
    return arr;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements in to the array: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println("Reversed arr: "+ reverse(arr, n));
  }
}
