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

    
    class Mounika extends Employee
    {
    @Override
    public void NetSalary()
    {
     netsalary = basic+(basic*10/100)+(basic*70/100)+2000;      
    }   
    @Override
    public void GrossSalary()
    {
     gross = basic+(basic*60/100)+(basic*10/100);      
    }
    @Override
    public void Taxpay(){
     taxval = (basic*10/100);   
    }
    
    @Override
    public void display()
    {
    
    System.out.println("the Net salary of mounika:"+netsalary );
    System.out.println("the Gross salary of mounika:"+gross );
    System.out.println("the Tax pay of mounika:"+ taxval);
    }
    }

