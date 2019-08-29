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

    class malar extends Employee
    {
        @Override
        public void NetSalary(){
            netsalary = basic+(basic*8/100)+(basic*50/100)+1000;
        }
        @Override
        public void GrossSalary()
    {
     gross = basic+(basic*50/100)+(basic*8/100);      
    }
        @Override
    public void Taxpay(){
     taxval = (basic*8/100);   
    }
        @Override
    public void display(){
    
    System.out.println("the Net salary of malar:"+netsalary );
    System.out.println("the Gross salary of malar:"+gross );
    System.out.println("the Tax pay of malar:"+ taxval);
    }
    }
    

