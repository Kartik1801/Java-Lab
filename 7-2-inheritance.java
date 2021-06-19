class Super {
    int a=10;
    public void display(){
        System.out.println("This is from Super Class ");
    }
}
class Sub extends Super{
    int a=20;
    public void display(){
        System.out.println("This is from Sub Class ");
    }
    public void mymethod(){
        Sub s=new Sub();
        s.display();
        System.out.println("Value of Var a in Sub Class is "+a);
        super.display();
        System.out.println("Value of Var a in Sub Class is "+super.a);
    }
    public static void main(String[] args) {
        Sub s=new Sub();
        s.mymethod();
    }
}
