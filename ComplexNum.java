 
/* class ComplexNumber {
    int real, image;
    public ComplexNumber(int r, int i)
    {
        this.real = r;
        this.image = i;
    }
    public void showC()
    {
        System.out.print(this.real + " +i" + this.image);
    }
    public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2)
    {
        ComplexNumber res = new ComplexNumber(0, 0);
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;
        return res;
    }
    public static void main(String arg[])
    {
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(10, 5);
        
        System.out.print("first Complex number: ");
        c1.showC();
        System.out.print("\nSecond Complex number: ");
        c2.showC();
  
        ComplexNumber res = add(c1, c2);

        System.out.println("\nAddition is :");
        res.showC();
    }
} */

import java.util.*;
class ComplexNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Complex Numbers : ");
        int NumCount = sc.nextInt();           // 2
        int arr[] = new int[NumCount*2];
        // Complex number input
        System.out.println("Enter alternative Real and Imaginary Numbers");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int real = 0, img = 0;
        for(int i=0; i<arr.length; i+=2)
        {
            System.out.println("Complex Number : " + arr[i] + "+ i" + arr[i+1]);
            real = real + arr[i];
            img = img + arr[i+1];
        }
        System.out.println("Sum of Complex Number : " + real + "+ i" + img);
        System.out.println();
    }
}
