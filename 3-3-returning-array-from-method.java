import java.util.Scanner;
class RAM {
 static  int[] reverse(int arr[])
 {
     int n=arr.length;
    for (int i = 0; i < n/2; i++) {
        int t=arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1]=t;
    }
    return arr;

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
    System.out.println("");
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        }
    int b[] = reverse(arr);
    System.out.println("");
    for (int i=0;i<b.length;i++){
        System.out.print(b[i]);
        }
    s.close();
    sc.close();
    

}   
}