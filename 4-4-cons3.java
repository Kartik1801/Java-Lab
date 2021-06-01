class cons3 {
    int id;
    String name;
    int age;
    void display(){
        System.out.println(id+" "+name+" Age => "+age);
    }
    
    cons3(){
        id=0;
        name=null;
        age=0;
    }
    
    public cons3(int i,String n){
        id=i;
        age=18;
        name=n;
    }
    
    public cons3(int i,int a,String n){
        id=i;
        age=a;
        name=n;
    }
    public static void main(String[] args) {
     cons3 s1=new cons3(1,19,"kartik");   
     cons3 s2=new cons3(2,"kd");
     s1.display();
     s2.display();   
    }
}
