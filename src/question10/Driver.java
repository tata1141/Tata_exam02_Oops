/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Chandra Bhanu Tata
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer for Question number: 01   Name:- CHANDRA BHANU TATA");
        System.out.println("----------------------------------------------------------");
        // TODO code application logic here
        One hippo = new Three();
        System.out.println(hippo.guess(4));
        System.out.println(hippo.apply(12));

        One lion = new One(-1);
        System.out.println(lion.guess(5));
        System.out.println(lion.apply(6));
    } // end

}
