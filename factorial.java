import java.util.*;
class factorial {
    public static void main(String[] args) {
    System.out.print("Enter the number : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int factorial = 1;
    sc.close();
    for(int i=1; i<=n; i++)
    {
        factorial = factorial * i;
    }
    System.out.println("factorial of " + n + ":" + factorial);
    }
}
