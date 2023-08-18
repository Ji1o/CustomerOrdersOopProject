/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;
import java.util.Scanner;

/**
 *
 * @author jmkd-
 */
enum Status{NEW,PENDING,REFUSED,COMPLETE};
public class Order {
    
    //make the attributes for each Order 
    private int id;
    private String title; 
    private String model;
    private double weight;
    private double price;
    private Status status;
    
    public static Customer getCustomerById(int id) {
         for (Customer customer : CompanyTest.customersList) {
             
              if (customer.getId() == id) {
                  return customer;
              }
         }
          return null;
    }
    
    public void addOrderToCustomer(){
        Scanner input = new Scanner(System.in);
        try
        {
        System.out.println("Enter Customer ID:");
        int id = input.nextInt();
        Customer customer = getCustomerById(id);
        if (customer == null) {
            System.out.println("there is no Customer with this ID");
        }
        else{
                System.out.println("Enter order ID:");
                this.id = input.nextInt();
                System.out.println("Enter order title:");
                this.title = input.next();
                System.out.println("Enter order model:");
                this.model = input.next();
                System.out.println("Enter order weight");
                this.weight = input.nextDouble();
                System.out.println("Enter order price");
                this.price = input.nextDouble();
                System.out.println("choose the status of the order: "
                        + "1-NEW /n 2-PENDING /n 3-REFUSED /n 4-COMPLETE");
                int z = input.nextInt();
                switch(z){
                    case 1:
                        this.status = Status.NEW;
                        break;
                    case 2:
                        this.status = Status.PENDING;
                        break;
                    case 3:
                        this.status = Status.REFUSED;
                        break;
                    case 4:
                        this.status = Status.COMPLETE;    
                }
                customer.orders.add(this);         
        }
        }
        catch(Exception e){
            System.out.println("please Enter a vaild values.......");   
        }
    }

    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return this.title;
    }

    public String getModel() {
        return this.model;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getPrice() {
        return this.price;
    }

    public Status getStatus() {
        return this.status;
    }
    

}