/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question09;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class BankDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankSubBranch banksb = new BankSubBranch();
        System.out.println("Answer for Question number: 01   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        System.out.println(banksb.cashWithdrawal());
        System.out.println(banksb.cashDeposit());
        System.out.println(banksb);

    }

}
