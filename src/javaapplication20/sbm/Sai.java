/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20.sbm;

/**
 *
 * @author DELL
 */

    
    class Sai extends Employee
    {
        @Override
        public void NetSalary(){
            netsalary = basic+(basic*5/100)+(basic*40/100)+1000;
        }
        @Override
        public void GrossSalary()
    {
     gross = basic+(basic*40/100)+(basic*5/100);      
    }
        @Override
    public void Taxpay(){
     taxval = (basic*5/100);   
    }
        @Override
    public void display(){
    
    System.out.println("The Net salary of sai:"+netsalary );
    System.out.println("The Gross salary of sai:"+gross );
    System.out.println("The Tax pay of sai:"+ taxval);
       }
     }

