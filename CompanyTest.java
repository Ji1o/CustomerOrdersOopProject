/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jmkd-
 */
public class CompanyTest {
    static ArrayList <Customer> customersList = new ArrayList();
    
    public static void displayAllOrders(){
        System.out.println("ID\tTitle\tModel\tWeight\tPrice\tStatus\tCustomer Name");
        for (Customer customer : customersList) {
            for (Order order : customer.getOrders()) {
                System.out.println(order.getId()+"\t"+order.getTitle()+"\t"+order.getModel()
                        +"\t"+order.getWeight()+"\t"+order.getPrice()
                        +"\t"+order.getStatus()+"\t"+customer.getName());

            }
        
        }
    }
    
    public static void displayOneCustomerOrders() {
        Scanner input = new Scanner(System.in);
        try
        {
        System.out.println("Enter Customer ID: ");
        int id = input.nextInt();
        Customer customer = Order.getCustomerById(id);
        if(customer == null){
            System.out.println("there is no Customer with this ID");
        }
        else{
            System.out.println(customer.getName()+" orders:");
            System.out.println("ID\tTitle\tModel\tWeight\tPrice\tStatus");
            for(Order order : customer.getOrders()){
                System.out.println(order.getId()+"\t"+order.getTitle()+"\t"+order.getModel()
                        +"\t"+order.getWeight()+"\t"+order.getPrice()+"\t"+order.getStatus());
            }
        }
        }
        catch(Exception e){
                        System.out.println("please Enter a vaild values.......");   

        }
    }
    
    public static void displayOneOrder(){
        Scanner input = new Scanner(System.in);
        try
        {
        System.out.println("Enter Customer ID: ");
        int id = input.nextInt();
        Customer customer = Order.getCustomerById(id);
        if(customer == null){
            System.out.println("there is no Customer with this ID");
        }
        else{
            System.out.println("Enter order ID: ");
            int orderId = input.nextInt();
            for(Order order : customer.getOrders()){
                if(orderId == order.getId()){
                    System.out.println("Order ID: " + order.getId());
                    System.out.println("Title: " + order.getTitle());
                    System.out.println("Model: " + order.getModel());
                    System.out.println("Weight: " + order.getWeight());
                    System.out.println("Price: " + order.getPrice());
                    System.out.println("Status: " + order.getStatus());
                    System.out.println("Customer ID: " + customer.getId());
                    System.out.println("Customer Name: " + customer.getName());                  
                }           
           }
            for(Order order : customer.getOrders()){
                if(orderId != order.getId())
                    System.out.println("There is no order with this ID.");                                 
           }

        }
        }
        catch(Exception e){
                        System.out.println("please Enter a vaild values.......");   

        }
    }
    
    public static void printBill(){
        Scanner input = new Scanner(System.in);
        try
        {
        System.out.println("Enter Customer ID: ");
        int id = input.nextInt();
        Customer customer = Order.getCustomerById(id);
        if(customer == null){
            System.out.println("there is no Customer with this ID");
        }
        else{
            double totalPrice = 0;
            System.out.println("ID\tTitle\tModel\tWeight\tPrice\tStatus");
            for(Order order : customer.getOrders()){
                System.out.println(order.getId()+"\t"+order.getTitle()+"\t"+order.getModel()
                        +"\t"+order.getWeight()+"\t"+order.getPrice()+"\t"+order.getStatus());
                totalPrice = totalPrice + order.getPrice();
            }
             System.out.println("Total=\t" + totalPrice);
            
        }
        }
        catch(Exception e){
                        System.out.println("please Enter a vaild values.......");   

        }
    }
    
    

     
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Enter 1 to add a customer.");
        System.out.println("Enter 2 to add a new order.");
        System.out.println("Enter 3 to print All customers information.");
        System.out.println("Enter 4 to print All orders information.");
        System.out.println("Enter 5 to print specific customer infotmation.");
        System.out.println("Enter 6 to print specific order information.");
        System.out.println("Enter 7 to print customer Bill.");
        System.out.println("Enter 8 to Exit the program.");      
        int choiceNumber = input.nextInt();
        
        switch(choiceNumber){
            case 1:  // add a new customer using addCustomer() method in class customer
                Customer c = new Customer();  
                c.addCustomer();                 
                break;
                
            case 2:  // add a new order for specific customer using 2 methods
                Order o = new Order();  // getCustomerbyID() method to return the customer that owned the order
                o.addOrderToCustomer();  // addOrderToCustomer() method to add the order to his orders List
                break;                  
         
            case 3:  // using 1 Method to print all customers in goood form
                Customer.displayAllCustomers();
                break;
                
            case 4:   // using 1 Method to print all customers orders in goood form
                displayAllOrders();
                break;
                
            case 5:  // print specific customer order using 2 methods
                displayOneCustomerOrders();  //  getCustomerbyID() method to return the customer that owned the order
                break;                       //  displayOneCustomerOrders() to print his order List
                              
            case 6:  // print specific order for specific customer by get customer and order IDs using 2 method
                displayOneOrder(); // getCustomerbyID() method to return the customer that owned the order
                break;             // displayOneOrder() method to print the order 
                
            case 7: // print spicific customer Bill
                printBill();
                break; 
                
            case 8: // Exit the program
                return;
                
            default:
                System.out.println("Wrong selection:");
                


    }
   }
}

}
