/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioaula146;

import java.util.Locale;
import java.util.Scanner;
import model.entities.Account;
import model.exceptions.DomainException;

/**
 *
 * @author Cesar
 */
public class ExercicioAula146 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();
            Account account = new Account(number, name, balance, withdrawLimit);
            
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            account.whithdraw(sc.nextDouble());
            System.out.println(account);
        }
        catch (DomainException e){
            System.out.println("Error: " + e.getMessage());            
        }
        // TODO code application logic here
    }
    
}
