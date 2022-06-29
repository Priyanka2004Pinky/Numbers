import java.util.*;

class Average {
    public static void main(String[] args){
        System.out.print("Enter Total Numbers, n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double arr[] = new double[n];
        double sum = 0;
      
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println("Enter value of array " + (i+1));
            arr[i] = sc.nextDouble();
            sum = sum + arr[i];
        }
        sc.close();
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        double avg = sum / n;
        System.out.println("Avg: "  + avg);
    }
}
