package Unit3;
//program to demonstrate seria;izable
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Dog implements Serializable{
    private String name;
    public Dog(){}
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
}

class Run{
    public static void main(String[] args)throws Exception{
        Dog d = new Dog();
        d.setName("Doggy");
        
        FileOutputStream fileOut = new FileOutputStream("dog.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(d);
        System.out.println("Serialized data is saved in dog.ser");
        
        Dog d1 = new Dog();
        FileInputStream fileIn = new FileInputStream("dog.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        d1 = (Dog)in.readObject();
        System.out.println("Deserialized dog");
        System.out.println("Name: "+d.getName());
    }
}
