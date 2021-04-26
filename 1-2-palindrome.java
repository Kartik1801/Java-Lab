import java.util.*;

class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);//System.in is standard input stream
        int no=sc.nextInt();
        int rev=0,rem,copy=no;
        while (copy!=0){
            rem=copy%10;
            rev=rev*10+rem;
            copy/=10;
        }
        if(rev==no)
        System.out.println("It is a Palindrome");
        else
        System.out.println("It is not a Palindrome");

        sc.close();
    }
}