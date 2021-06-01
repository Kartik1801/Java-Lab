import java.util.Scanner;
class bs {

  static int search (int a[],int l,int h,int key){
        if(l<h){
        int m=l+(h-l)/2;
        if(key==a[m]){
            return m;
        }
        else if(a[m]>key){
            search(a,l,m-1,key);
        }
        else if(a[m]<key){
            search(a, m+1, h, key);
        }
        }
            return -1;
    }

    public static void main(String args[]){
        int a[]={10,20,30,40,50,60,70};
        int n = a.length;
        Scanner sc= new Scanner(System.in);
        int key =sc.nextInt();
        int res=search(a,0,n,key);
        if(res==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index"+res);
        }
        sc.close();
    }    
}
