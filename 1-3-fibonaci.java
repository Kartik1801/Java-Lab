import java.util.*;

class fib {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        int f=1; 
        int s=1;
        int v=0;
        System.out.print(f+" "+s+" ");
        for (int i=2;i<n;i++)
        {
            v=f+s;
            f=s;
            s=i;
            System.out.print(v+" ");
        }
        sc.close();
    }
}
