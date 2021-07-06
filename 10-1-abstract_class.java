    abstract class c1{
        abstract void message();
    }
    class c2 extends c1{
        public void message(){
         System.out.println("This is Subclass 1");   
        }
    } 
    class c3 extends c2{
        public void message(){
            System.out.println("This is Subclass 2");   
           }
        
        public static void main(String[] args) {
            c2 a=new c2();
            c3 b=new c3();
            a.message();
            b.message();
    }   
    }
