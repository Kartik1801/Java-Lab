
class calc{
int  r;
public void sum(int a,int b){
    r=a+b;
    System.out.println("sum = "+r);
}
public void sub(int a,int b){
    r=a-b;
System.out.println("difference = "+r);
}
}
class myClass extends calc {
    public void mul(int a,int b){
        r=a*b;
        System.out.println("product = "+r);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        myClass m= new myClass();
        m.sum(a, b);
        m.sub(a, b);
        m.mul(a, b);

    }
}