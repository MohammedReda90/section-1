/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1account;
import java.util.Scanner;
public class L1ACCOUNT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Account ac=new Account();
      System.out.println("the last modifiy time is :" + ac.getDatacreated());
      ac.setId(1122);
      ac.setBalance(20000);
      ac.setAnnualInterestRate(4.5);
      ac.withdraw(2500);
      System.out.println("the balance is :" + ac.getBalance());
      System.out.println("the annuai interst rate is :" + ac.getAnnualinterestrate());
      ac.deposit(3000);
      System.out.println("the last modifiy time is :" + ac.getDatacreated());
      System.out.println("the balance is :" + ac.getBalance());
      System.out.println("the month interest rate  is :" + ac.getMonthlyInterestRate());
      
      
      
    }
    
}
