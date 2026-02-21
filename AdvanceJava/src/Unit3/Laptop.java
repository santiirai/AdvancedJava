package Unit3;
//program to demonstrate Constrained property using VetoableChangeSupport class

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class Laptop{
    private String Lname;
    private float price;
    private VetoableChangeSupport vcs = new VetoableChangeSupport(this);
    
    public Laptop(){}
    public Laptop(String name, float price){
        this.Lname = name;
        this.price = price;
    }
    public String getName(){
        return Lname;
    }
    public void setName(String name){
        this.Lname = name;
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(float price)throws PropertyVetoException{
        float oldPrice = this.price;
        PropertyChangeEvent event = new PropertyChangeEvent(this, "price", oldPrice, price);
        vcs.fireVetoableChange(event);
        this.price = price;
    }
    public void addVCL(VetoableChangeListener listener){
        vcs.addVetoableChangeListener(listener);
    }
}

class Main{
    public static void main(String[] args){
        Laptop l = new Laptop("Dell", 70000);
        l.addVCL(new VetoableChangeListener(){
            @Override
            public void vetoableChange(PropertyChangeEvent e) throws PropertyVetoException {
                if("price".equals(e.getPropertyName())){
                    float newPrice = (float) e.getNewValue();
                    if(newPrice<65000){
                        throw new PropertyVetoException("Price cannot be deducted.", e);
                    }
                }
                System.out.println(e.getPropertyName()+" changed from "+e.getOldValue()+" to "+e.getNewValue());
            }
        
        });
        //Attempt to change properties
        try{
            l.setName("Aman");
            l.setPrice(68000);
            l.setPrice(64000); //this will throe a propertVetoEcxception
        }catch(PropertyVetoException e){
            System.out.println(e.getMessage());
        }
    }
}
