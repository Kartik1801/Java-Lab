import java.util.Scanner;
class reverse{
   public static int revNo(int n){
        int r=0,rem=0;
        while(n!=0){
            rem=n%10;
            r=r*10+rem;
            n=n/10;
        }
          return r;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n=sc.nextInt();
        int r=revNo(n);
        System.out.println("Reverse Number = "+r);
        sc.close();
    }
}