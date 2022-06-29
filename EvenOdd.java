import java.util.*;

class EvenOdd  {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 ==0)
        {
            System.out.println(n + " is a Even number");
        }
        else
        {
            System.out.println(n + " is a Odd number");
        }
        sc.close();
    }   
}
