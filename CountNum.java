import java.util.*;

//import javax.xml.transform.Source;

class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P=0,N=0,Z=0;
        System.out.print("Enter The Total Numbers : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<=a.length-1; i++)
        {
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++)
        {
            if(a[i]>0)
            { 
                P++;
            }
            else if(a[i]<0)
            {
                N++;
            }
            else
            {
                Z++;
            }
        }
        System.out.println("Total Positive Numbers : " + P);
        System.out.println("Total Negitive Numbers : " + N);
        System.out.println("Total Zero Numbers : " + Z);
        sc.close();
    }
}
