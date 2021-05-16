import java.util.Scanner;
class reversearr {
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.printf("Enter size of Array: ");
    int n=sc.nextInt();
    int j=n;
    int []arr= new int[n];
    Scanner s=new Scanner(System.in);
    for (int i=0;i<arr.length;i++){
    arr[i]=s.nextInt();
    }
    for (int i=0;i<arr.length;i++){
    System.out.print(arr[i]);
    }
    for (int i = 0; i < n/2; i++) {
            int t=arr[i];
            arr[i] = arr[j-i-1];
            arr[j-i-1]=t;
        }
        System.out.println("");
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        }
    s.close();
    sc.close();

}   
}