class Degree {
    void get_Degree(){
        System.out.print("I got degree");
    }
}
class postGraduate extends Degree{
    postGraduate(){
        System.out.print("I am a post Graduate");
    }
}
class underGraduate extends Degree{
    underGraduate(){
        System.out.print("I am an under Graduate");
    }
    public static void main(String args[]){
        postGraduate a = new postGraduate();
           a.get_Degree();
         underGraduate b = new underGraduate();
           b.get_Degree();
    }
}