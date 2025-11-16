package MyStudent;

import java.util.Scanner;

/**
 *
 * @author Shanti
 */
class Person {
    private String name, address;
    private int age;
    void setAll(String name, String address, int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }
    int getAge(){
        return age;
    }
}
class Student extends Person{
    private int roll;
    void setRoll(int roll){
        this.roll = roll;
    }
    int getRoll(){
        return roll;
    }
}
public class MyStudent{
    public static void main(String[] args){
        Student s = new Student();
        String name, address;
        int age;
//        s.setRoll(20);
//        s.getRoll();
//        s.setAll("Hello", "Dhrn", 19);
//        s.getName();
//        s.getAddress();
//        s.getAge();
//        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.next();
        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter roll no: ");
        address = sc.next();
        
        s.setAll(name, address, age);
        if(s.getAge()>=16){
            s.setRoll(1);
        }
        
        System.out.println("Name: "+ s.getName());
        System.out.println("Address: "+ s.getAddress());
        System.out.println("Age: "+ s.getAge());
        System.out.println("Roll no: "+ s.getRoll());
    }
}
