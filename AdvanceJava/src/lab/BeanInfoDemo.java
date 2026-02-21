/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.beans.*;

public class BeanInfoDemo {
    public static void main(String[] args) {
        try {
            BeanInfo info = Introspector.getBeanInfo(User.class);

            System.out.println("Properties:");
            for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
                System.out.println(pd.getName());
            }

            System.out.println("\nMethods:");
            for (MethodDescriptor md : info.getMethodDescriptors()) {
                System.out.println(md.getName());
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
