import java.util.Scanner;
class pnc {
    public static int fact(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=n*f;
        }
        return f;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter N");
   int n= sc.nextInt();
    System.out.println("Enter R");
   int r= sc.nextInt();
    int p=fact(n)/fact(n-r);
    int c=fact(n)/fact(n-r)/fact(r);
    System.out.println("Permutation = "+p+"Combination = "+c);
    sc.close();
}    
}
