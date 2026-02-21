/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit3;

//Write a view information about the person bean class using BeanInfo interface

import java.awt.Image;
import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    private int age;
    
    public Person(){}
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}

class PersonBeanInfo implements BeanInfo{

    @Override
    public BeanDescriptor getBeanDescriptor() {
        return new BeanDescriptor(Person.class);
    }

    @Override
    public EventSetDescriptor[] getEventSetDescriptors() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getDefaultEventIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        PropertyDescriptor name, age;
        try{
            name = new PropertyDescriptor("uname", Person.class);
            age = new PropertyDescriptor("uage", Person.class);
            return new PropertyDescriptor[] {name, age};
        }catch(IntrospectionException ex){
           //Logger.getLogger(PersonBeanInfo.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println(ex);
           return null;
        }
    }

    @Override
    public int getDefaultPropertyIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public BeanInfo[] getAdditionalBeanInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Image getIcon(int iconKind) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

 class Main{
    public static void main(String[] args) throws IntrospectionException{
        BeanInfo info = Introspector.getBeanInfo(Person.class);
        
        BeanDescriptor beanDescriptor = info.getBeanDescriptor();
        System.out.println("Class name: " + beanDescriptor.getName());
        
        PropertyDescriptor[] propertyDescriptors = info.getPropertyDescriptors();
        System.out.println("Properties: ");
        
        for(PropertyDescriptor pd: propertyDescriptors){
            System.out.println("Name: "+pd.getName());
            System.out.println("Type: "+pd.getPropertyType());
            System.out.println("Read Method: "+pd.getReadMethod());
            System.out.println("Write Method: "+pd.getWriteMethod());
            System.out.println();
        }
    }
}
