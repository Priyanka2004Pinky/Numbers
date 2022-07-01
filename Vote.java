import java.util.*;

class Vote {
    public static void main(String[] args) {
    System.out.print("Enter the age : ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(age <= 0)
    {
        System.out.println("Invalid Age");
    }
    else if(age >=18 )
    {
        System.out.println("Eligible for voting");
    }
    else{
        System.out.println("Not eligible for voting");
    }
    sc.close();
}
}