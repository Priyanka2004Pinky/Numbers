import java.util.*;

class LargestNum {
 public static void main(String[] args) 
 {
    System.out.print("Enter the number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<arr.length; i++)
    {
        arr[i] = sc.nextInt();
    }
    for(int i=0; i<arr.length-1; i++)
    {
        for(int j=0; j<n-i-1; j++)
          {
            if(arr[j]<arr[j+1])
               {
                  int temp = arr[j];
                  arr[j]= arr[j+1];
                  arr[j+1] = temp;
              }
          }
    }
    System.out.println("Largest Number : " + arr[0]);
    sc.close();
 }
}  

