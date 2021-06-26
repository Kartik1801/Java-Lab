import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n="";
        System.out.println("============ Calculator ============");
        System.out.println("1.Addition (+)");
        System.out.println("2.Substraction (-)");
        System.out.println("3.Multiplication (*");
        System.out.println("4.Division (/)");
        System.out.println("5.Exit (EXIT)");
        double a,b;
        System.out.printf("Enter Number 1:");
        a=sc.nextDouble();
        System.out.printf("Enter Number 2:");
        b=sc.nextDouble();
        System.out.printf("Enter operator(+,-,*,/,EXIT):");
        n=sc.next();

        switch(n.toUpperCase()){
            case "+":
            System.out.println(a+b);
            break;
            case "-":
            System.out.println(a-b);
            break;
            case "*":
            System.out.println(a*b);
            break;
            case "/" :
            System.out.println(a/b);
            break ;
            case "END":
            break;
            default:
            System.out.println("Wrong Input");
            break;
        }
        sc.close();
    }
}

