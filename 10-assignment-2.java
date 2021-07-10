class student {
    String name;
    student(){
       this.name="Unknown";
    }
    student(String name){
       this.name=name;
    }
    void print(){
        System.out.print(this.name);
    }
    public static void main(String args[]){
        student s1 = new student();
        student s2 = new student("kartik");
        s1.print();
        s2.print();
    }
}
