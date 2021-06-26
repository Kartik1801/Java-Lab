import java.util.Scanner;
class binarySearch {
    static int bs(int a[],int l,int h,int k){
        if(l==h)
        {
            if(k==a[l])
            return l;
            else
            return -1;
        }
        else
        {    
            if (l<h)
            {	
                int mid=(l+h)/2;
                if (a[mid]==k)
                    return mid;
                else if(a[mid]<k)
                    return bs(a,mid+1,h,k);
                else
                    return bs(a,l,mid-1,k);
            }
            return -1;
    }
}
public static void main(String[] args){
        int a[]={10,20,30,40,50,60,70};
        int n = a.length;
        Scanner sc= new Scanner(System.in);
        int key =sc.nextInt();
        int res=bs(a,0,n,key);
        if(res==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index => "+res);
        }
        sc.close();
    }       
}
