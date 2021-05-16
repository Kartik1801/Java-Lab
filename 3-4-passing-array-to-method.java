import java.util.Scanner;
class PAM {
 static void min(int a[]){
    int m=a[0];
    for (int i=1;i<a.length;i++){
        if(a[i]<m)
          m=a[i];  
    }
    System.out.print(m);
   
 }
    public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.printf("Enter size of Array: ");
    int n=sc.nextInt();
    int []arr= new int[n];
    Scanner s=new Scanner(System.in);
    for (int i=0;i<arr.length;i++){
    arr[i]=s.nextInt();
    }
    min(arr);
    s.close();
    sc.close();
    

}   
}