class cons2 {
    int id;
    String name;
    void display(){
        System.out.println(id+" "+name);
    }
    
    cons2(){
        id=0;
        name=null;
    }
    
    public cons2(int i,String n){
        id=i;
        name=n;
    }
    public static void main(String[] args) {
     cons2 s1=new cons2(1,"kartik");   
     cons2 s2=new cons2(2,"kd");
     s1.display();
     s2.display();   
    }
}
