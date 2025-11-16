/**
 *
 * @author Shanti
 */
package products;
import java.util.Scanner;
//you are asked to write a dis system for a beauty salon, which provides servces and sells beauty
//products. It offers 3 types of memberships: premium, gold and silver members receive a dis of 20%, 15% and 10% respetively.
//, for all services provided. Customers without membership receive no discount.
//All members receive flat 10% dis on products purchased(this might change in future).
//your system shall consist of three classes: Customer, Discount and Visit.
//Also write a test program to exercise all the classes.
class Customer{
    private String name;
    private boolean isMember;
    private String memberType;
    void setName(String name){
        this.name = name;
    }
   String getName(){
       return name;
   }
   void setMember(boolean member){
       this.isMember = member;
   }
   boolean isMember(){
       return isMember;
   }
   void setMemberType(String memberType){
       this.memberType = memberType;
   }
   String getMembertype(){
       return memberType;
   }
}
class Discount{
    static double getServiceDiscount(String getMemberType){
        switch(getMemberType){
            case "premium":
                return 0.20;
            case "gold":
                return 0.15;
            case "silver":
                return 0.10;
            default :
                return 0;
        }
    }
    static double getProductDiscount(){
        return 0.10;
        
    }
}
class Visit{
    private double serviceExpense, productExpense;
    Customer c;
    Visit(Customer c){
        this.c = c;
    }
    void setServiceExpense(double serviceExpense){
        this.serviceExpense = serviceExpense;
    }
    double getServiceExpense(){
        if(c.isMember()){
            return serviceExpense - (serviceExpense * Discount.getServiceDiscount(c.getMembertype()));
        }
        else{
            return serviceExpense;
        }
    }
    void setProductExpense(double productExpense){
        this.productExpense = productExpense;
    }
    double getProductExpense(){
        if(c.isMember()){
            return productExpense - (productExpense * Discount.getProductDiscount());
        }
        else{
            return productExpense;
        }
    }
    double totalExpense(){
        return getServiceExpense()+getProductExpense();
    }
} 

public class products {
    public static void main(String[] args){
        Customer c = new Customer();
        
//        v.setProductExpense(1000);
//        v.setServiceExpense(4000);       
//        System.out.println("Customer name: "+c.getName());
//        System.out.println("Product Expense: "+v.getProductExpense());
//        System.out.println("Service Expense: "+v.getServiceExpense());
//        System.out.println("Total Expense: "+v.totalExpense());
          Scanner sc = new Scanner(System.in);
          System.out.println("Customer name: ");
          String name = sc.next();
//          System.out.println("Enter product expense: ");
//          int productExp = sc.nextInt();
//          System.out.println("Enter service Expense: ");
//          int serviceExp = sc.nextInt();
//          System.out.println("Total Expense: ");
          
          c.setName(name);
       
          System.out.print("Is the customer a member? (yes/no): ");
          String memberInput = sc.next().toLowerCase();
          boolean isMember = memberInput.equals("yes");
          c.setMember(isMember);

          if (isMember) {
            System.out.print("Enter membership type (premium/gold/silver): ");
            String type = sc.next().toLowerCase();
            c.setMemberType(type);
            
          Visit v = new Visit(c);
          System.out.print("Enter product expense: ");
          double productExp = sc.nextDouble();
          v.setProductExpense(productExp);

          System.out.print("Enter service expense: ");
          double serviceExp = sc.nextDouble();
          v.setServiceExpense(serviceExp);
          
          System.out.println("Customer name: "+c.getName());
          System.out.println("Product Expense: "+v.getProductExpense());
          System.out.println("Service Expense: "+v.getServiceExpense());
          System.out.println("Total Expense: "+v.totalExpense());
        }
    }
}
