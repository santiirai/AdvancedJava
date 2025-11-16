//program to find smallest and largest element in input array


import java.util.ArrayList;
import java.util.Scanner;

class Numbers {
    private int c, max, min, imin = 0, imax = 0;
    private ArrayList<Integer> al = new ArrayList<>();

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println ("How numbers do you want to enter: ");
        c  = sc.nextInt();

        System.out.println ("ENter numbers: ");
        for(int i=1; i<=c; i++){
            al.add(sc.nextInt());
        }
    }
    void display(){
        for(int i:al){
            System.out.println(i);
        }
    } 
        
    void operation() {
        min = al.get(0);
        max = al.get(0);
        for (int i = 0; i <= al.size() - 1; i++) {
            if (al.get(i) < min) {
                min = al.get(i);
                imin = i;
            }
            if (al.get(i) > max) {
                max = al.get(i);
                imax = i;
            }
        }
        System.out.println("Largest element is " + max + " at index " + imax);
        System.out.println("Smaller element is " + min + " at index " + imin);
    }

    void swap() {
        al.set(imax, min);
        al.set(imin, max);
    }
}
public class MyNumbers {

    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.input();
        System.out.println("Array list: ");
        num.display();
        num.operation();
        num.swap();
    }
}
