import java.util.Scanner;
class TestArray {
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
    int max=arr[0];
    int sm=arr[0];
    for (int i=1;i<arr.length;i++){
        if(arr[i]>max)
          max=arr[i];  
    }
    for (int i=1;i<arr.length;i++){
        
        if(arr[i]>sm && sm!=max)
          sm=arr[i];  

    }
    System.out.println("2nd largest value is : "+sm);
    System.out.println(" largest value is : "+max);
    s.close();
    sc.close();

}   
}