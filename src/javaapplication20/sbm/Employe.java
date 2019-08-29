/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20.sbm;

import java.util.Scanner;


public class Employe {
    public static void main(String[] args) {
        
        
        
        Scanner obj = new Scanner(System.in);
        System.out.println("List of Employee name:\n1.Raj"+"\n2.Mounika"+"\n3.Malar"+"\n4.sai");
        System.out.println("Enter Employee name:");
        String x = obj.nextLine();
        switch(x)
        {
            case "Raj":
            {
               Raj r = new Raj();
               r.basic=500000;
               r.GrossSalary();
               r.NetSalary();
               r.Taxpay();
               r.display();
               break;
            }
             case "Mounika":
            {
               Mounika m = new Mounika();
               m.basic=300000;
               m.GrossSalary();
               m.NetSalary();
               m.Taxpay();
               m.display();
               break;
            }
             case "Malar":
            {
               malar q = new malar();
               q.basic=20000;
               q.GrossSalary();
               q.NetSalary();
               q.Taxpay();
               q.display();
               break;
            }
            
             case "sai":
            {
               Sai s = new Sai();
               s.basic=150000;
               s.GrossSalary();
               s.NetSalary();
               s.Taxpay();
               s.display();
               break;
            }
             default:{
                 System.out.println("XXX Sorry guys XXXX");
             }
        }
    }
    
}
