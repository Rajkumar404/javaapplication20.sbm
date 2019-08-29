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
 
    
    public class Raj extends Employee
    {
    @Override
    public void NetSalary()
    {
     netsalary = basic+(basic*30/100)+(basic*90/100)+3000;   
    } 
    @Override
    public void GrossSalary(){
        gross = basic+(basic*90/100)+ (basic*30/100);
    }
    @Override
    public void Taxpay(){
        taxval = (basic*30/100);
    }
    @Override
    public void display(){
       
        System.out.println("The NET salary of RAJ:"+ netsalary);
         System.out.println("The GROSS Salary of RAJ:"+gross);
        System.out.println("The TAX Pay of RAJ:"+ taxval);
    }
}
