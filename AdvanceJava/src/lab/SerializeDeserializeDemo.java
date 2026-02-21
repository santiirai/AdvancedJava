/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.io.*;

// JavaBean class
class Userr implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private int age;
    private String address;

    // No-arg constructor
    public Userr() {}

    // Getter and Setter methods
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// Main class
public class SerializeDeserializeDemo {

    public static void main(String[] args) {

        try {
            // Serialization
            Userr u = new Userr();
            u.setUsername("Shanti");
            u.setAge(21);
            u.setAddress("Itahari");

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("user.txt"));
            out.writeObject(u);
            out.close();

            System.out.println("Object serialized successfully");

            // Deserialization
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("user.txt"));
            Userr userObj = (Userr) in.readObject();
            in.close();

            System.out.println("\nObject deserialized successfully");
            System.out.println("Username: " + userObj.getUsername());
            System.out.println("Age: " + userObj.getAge());
            System.out.println("Address: " + userObj.getAddress());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

