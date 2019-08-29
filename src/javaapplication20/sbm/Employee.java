/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20.sbm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
/*public class MyClass {

    //  private static int employee;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "SBM Masala";
        String Price = "RS50";
        long tollfree = 150015150L;
        String Headoff = "no.26,salabogam,kanchipuram.";
        String EXPDATE = "2020Dec";
        String Country = "India";
        int Discount = 10;

        LocalDateTime kanchipuram = LocalDateTime.now();
        System.out.println(kanchipuram);
        System.out.println("Brand name: " + name);
        System.out.println("product price:" + Price);
        System.out.println("Tollfree:" + tollfree);
        System.out.println("Headoff:" + Headoff);
        System.out.println("EXPDATE:" + EXPDATE);
        System.out.println("country:" + Country);
        System.out.println("Discount:" + Discount);

        String[] masala = {"listof product:" + "Chilli powder,pepper powder,sambar powder."};
        for (String a : masala) {
            System.out.println(a);
        }
        
        String B = "Bill Detail:"; 
        System.out.println(B);
        String date = "Date:";
        System.out.println(date);
        
        LocalDate myobj = LocalDate.now();
        System.out.println(myobj);
        String Shopname = "vv Super market";
        long billno = 70143201L;
        int totalqty = 2;
        String payment = "\n card[]:\n cash[]:";
        String Grandtotal = "2500";

        System.out.println("shopname:" + Shopname);
        System.out.println("billno:" + billno);
        System.out.println("totalqty:" + totalqty);
        System.out.println("payment:" + payment);
        System.out.println("Grandtotal:" + Grandtotal);

        int buyabove = 3000;
        if (buyabove > 2500) {
            System.out.println("command: " + "Thanks for coming:)");
        } else {
            System.out.println("command:" + "you got 10percent discount:)");
        }
              
        String EMAIL_ID = "raj@devopsbees.com";
        System.out.println("For Feedback:"+ EMAIL_ID);
        
        int noofworkers = 5;
        System.out.println("noofEmployee:" + noofworkers);

        String detials;
        System.out.println("List of employees:");
        String Employeename = "Rajkumar K";
        int id = 01;
        String disignation = "Associate software engg";
        String Qualification = "Engg";

        System.out.println("Employeename1:" + Employeename);
        System.out.println("idno:" + id);
        System.out.println("Disignaion:" + disignation);
        System.out.println("Qualification:" + Qualification);

        String a = "perfomance detail for Raj";
        System.out.println(a);

        String monthly = "target";
        System.out.println("monthly:" + monthly);

        int x = 15;
        int y = 20;
        if (x < y) {
            System.out.println("Feedback to company:" + "Good performance");
        } else {
            System.out.println("worning to company:" + "poor performance");
        }

        Employeename = "Mounika";
        id = 02;
        disignation = "Software engg";
        Qualification = "Engg";

        System.out.println("Employeename2:" + Employeename);
        System.out.println("idno:" + id);
        System.out.println("Disignation:" + disignation);
        System.out.println("Qualification:" + Qualification);

        String b = "perfomance detail for mounika";
        System.out.println(b);

        monthly = "target";
        System.out.println("monthly:" + monthly);

        int m = 15;
        int n = 20;
        if (m < n) {
            System.out.println("Feedback to company:" + "Good performance");
        } else {
            System.out.println("warning to company:" + "poor performance");
        }

    }
 }  */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */

/*public class Car {

    String Showroomname = "RAJ CARS";
   String carname = "BMW";
   int chassno = 123456789;
   String color = "black";
   String tyre = "four";
   long fuel = 1000L;
   String Fueltype = "Petrol";
   String ownername = "raj";
   String drive = "Right hand drive";
   String Specialfeature = "car of the year in 2019.so,its compact,using multiple airbag.";
   public void speedlimit(int x)
   {
       if(x<100)
       {
           System.out.println("Access granted: your speed limit is "+x +"which is normal");
       }
       else
       {
           System.out.println("Access denied: your speed limit exceeded "+x +"which comes under rash driving");
       }
       
   }
    public static void main(String[] args) {
        // TODO code application logic hereSystem.
      
        
        int a = 0;
        do{
            System.out.println(a);
         a++;   
        }
        while (a < 5);
        String[] cars = {"Types of cars Brands:" + "\nVOLO", "AUDI", "BENZ" ,"BMW" ,"FORD"};
        for (String i : cars){
            System.out.println(i);
        }
        
        String carServiceDetails;
        int no_service_centers;
        int servicedate;
        LocalDate car = LocalDate.now();
       LocalTime myObj = LocalTime.now();
        long Kilometer;
        int model;
        
       
        
       
       Car carobj= new Car() ;
       System.out.println("Show room name: "+ carobj.Showroomname);
       System.out.println("owner name: "+  carobj.ownername);
       System.out.println("car name: "+  carobj.carname);
       System.out.println("car.id: "+ carobj.chassno);
       System.out.println("color: "+ carobj.color);
       System.out.println("tyre: "+ carobj.tyre);
        System.out.println("fuel: "+ carobj.fuel);
        System.out.println("Fuel Type:"+ carobj.Fueltype);
        System.out.println("drive:" + carobj.drive);
        System.out.println("note :" + carobj.Specialfeature);
       carobj.speedlimit(100);
       
       
       System.out.println("Service Detail:");
       System.out.println("service:[1]:[2]:[3]:[4]:[5]");
       System.out.println("Total Branches:"+25);
        System.out.println("Date:"+car);
        System.out.println("Time:"+myObj);
       System.out.println("Km:"+15000L);
       System.out.println("model:"+2019);
       
    
        int o = 0;
        int p = 90;
        if (o < p) {
            System.out.println("Due date:" + "Eligible for the service");
        } else  {
            System.out.println("Expired:" + "Hoops");
        }
        
       int m = 90;
       int n = 250;
       if(m < n){
           System.out.println("Second service");
       }else{
           System.out.println("Thankyou for support");
       }
    }
    }*/
 /*public class Busticket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         
        
         System.out.println("Enter the Bus code:" + "Bus code: SETC,KSRTC,ASIAN EXP,NATIONAL EXP,");
         String BUS = input.next();
        
        if(BUS.equalsIgnoreCase("SETC"))
        {
            System.out.println("Welcome to Tamilnadu");
        }
        else if(BUS.equalsIgnoreCase("KSRTC"))
        {
        System.out.println("Welcome to Karnataka");
        }
        else if(BUS.equalsIgnoreCase("ASIAN EXP")){
            System.out.println("Welcome to Our Travels");
        }
        else if(BUS.equalsIgnoreCase("NATIONAL EXP")){
            System.out.println("Welcome to Our Travels.Happy journey");
        }
        else{
            System.out.println("Your code is wrong.Enter correct once.");
        }
        

        System.out.println("Passenger Detail:)");

        System.out.println("Enter first name:");
        String first = input.next();
        System.out.println("Enter last name:");
        String last = input.next();
        System.out.println("Enter PNR no:");
        String PNR_no = input.next();
        System.out.println("Enter Your Age:");
        String Your_AGE = input.next(); 
        
        int age = 45;
        if (age>60)
            System.out.println("You are older");
        else
            System.out.println("you are young");
  
        long Ticket_no;
        String Route;
        String Departure_DATE_TIME;
        LocalDate Bus = LocalDate.now();
        LocalTime myObj = LocalTime.now();
        int Seat_no;
        short Fare;
        String Boarding_point;

        System.out.println("Ticket_no:" + "TN21789654123");
        System.out.println("Route:" + "Kanchipuram to Bangaloru");
        System.out.println("Departure_DATE_TIME:");
        System.out.println("Date:" + Bus);
        System.out.println("Time:" + myObj);
        System.out.println("Seat.no:" + 07);
        System.out.println("Fare:" + 525);
        System.out.println("Boarding point:" + "Indiranager Indian oil Petrol bunk.");

        String name;
        name = "Rajkumar";
        if (name.equals("Rajkumar")) {
            System.out.println("Your name is list access granted");
        } else {
            System.out.println("your name is not in the list access denied");
        }   
    }
}*/
public class Employee {

    int basic;
    float DA;
    float HRA;
    float TAX;
    int EPF;
    float netsalary;
    float gross;
    float taxval;

    void NetSalary() {

    }

    void GrossSalary() {

    }

    void Taxpay() {

    }

    void display() {

    }

}
