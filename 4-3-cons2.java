class paracons {
    int id;
    String name;
    void display(){
        System.out.println(id+" "+name);
    }
    
    paracons(){
        id=0;
        name=null;
    }
    
    public paracons(int i,String n){
        id=i;
        name=n;
    }
    public static void main(String[] args) {
     paracons s1=new paracons(1,"kartik");   
     paracons s2=new paracons(2,"kd");
     s1.display();
     s2.display();   
    }
}
