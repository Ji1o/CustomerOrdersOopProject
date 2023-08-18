/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Project1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jmkd-
 */
public class Customer {
  
    //make the attributes for each customer 
    private int id;
    private String name;
    private String address;
    private int phoneNumber;
    private String email;
    private int year;
    private int month;
    private int day;
    public ArrayList<Order> orders = new ArrayList();
    
    //default Constructor
    public Customer(){
        
    }
    
    //an Constuctor
    public Customer(int id, String name, String address, int phoneNumber, String email, int year, int month, int day) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Order> getOrders() {
        return this.orders;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Method to get date of birth in good form
    public String getDateOfBirth(){
         return this.year+"/"+this.month+"/"+this.day;
        
    }
    
    // Method to add a new Customer
    public void addCustomer(){
        Scanner input = new Scanner(System.in);
        try
        {
        System.out.println("Enter Customer ID:");
        this.id = input.nextInt();
        
        System.out.println("Enter Customer Name:");
        this.name = input.next();

        System.out.println("Enter the address:");
        this.address = input.next();
        
        System.out.println("Enter your phone number:");
        this.phoneNumber = input.nextInt();
        
        System.out.println("Enter your email:");
        this.email = input.next();  
        
        System.out.println("Enter the year Of Birth:");
        this.year = input.nextInt();
        
        System.out.println("Enter the month Of Birth:");
        this.month = input.nextInt();
        
        System.out.println("Enter the day Of Birth:");
        this.day = input.nextInt();  
        CompanyTest.customersList.add(new Customer(id, name, address, phoneNumber, email, year, month, day ));  
        }
        catch(Exception e)
        {
            System.out.println("please Enter a vaild values.......");   
        }        
    }
           
    // Method to print all customers in goood form
    public static void displayAllCustomers(){
        if(CompanyTest.customersList.isEmpty())
            System.out.println("there is no Customers");
        else{
            System.out.println("ID\t\t\t|Name\t\t\t|Address\t\t\t|Email\t\t\t|Number\t\t\t|Date of Birth");
            for(Customer c : CompanyTest.customersList){
                System.out.println(c.id+"\t\t\t|"+c.name+"\t\t\t|"+c.address+"\t\t\t|"+c.email+"\t\t\t|"+c.phoneNumber+"\t\t\t|"+c.getDateOfBirth());
            }
            

        }

    }
    


    
    
  
}