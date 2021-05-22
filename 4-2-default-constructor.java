class cons {
    int id;
    String name;
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
     cons s1=new cons();   
     cons s2=new cons();
     s1.display();
     s2.display();   
    }
}
