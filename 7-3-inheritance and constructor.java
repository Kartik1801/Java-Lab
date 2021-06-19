
class Super_class {
    int age;
    Super_class(int age){
        this.age=age;
    }
    public void getAge() {
        System.out.println("Age is "+age);
    }
}
class Sub_class extends Super_class{
Sub_class(int age){
    super(age);
}
public static void main(String[] args) {
    Sub_class s=new Sub_class(12);
    s.getAge();
}
}