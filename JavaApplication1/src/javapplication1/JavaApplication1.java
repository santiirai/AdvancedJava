package javapplication1;

import java.util.Scanner;

class Sum{
    private int a, b, result;
    void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers (Addition): ");
        a = sc.nextInt();
        b = sc.nextInt();
        result = a+b;
        System.out.println("Sum is: " + result);
    }
}

class Arithmetic extends  Sum{  
       @Override
       void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers (Addition override): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a+b+c;
        System.out.println("Sum is: " + result);
    }
    void sub(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for subtraction: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sub = a-b;
        System.out.println("Subtraction is: " + sub);
    }
    void multiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for multiplication: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a*b;
        System.out.println("multiplication is: " + mul);
    }   
    void division(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for division: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int division = a/b;
        System.out.println("division is: " + division);
    }
    
}    
//improvise above code to take inputs from main function
public class JavaApplication1{
    public static void main(String[] args){
            Arithmetic s1 = new Arithmetic();
            s1.add();
            s1.sub();
            s1.division();
            s1.multiplication();
    }
}
