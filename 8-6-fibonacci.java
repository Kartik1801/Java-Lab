import java.util.Scanner;
class fibonacci {
    public static void fib(int n){
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
    }
    public static void main(String args[])
    {   
        System.out.println("Enter a Number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);
        sc.close();
    }   
}
