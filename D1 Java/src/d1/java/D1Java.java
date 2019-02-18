/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d1.java;

import java.util.Scanner;

/**
 *
 * @author Reinis
 */
public class D1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //System.out.println("Hello World!");
        
//        Scanner sc = new Scanner(System.in);
        
//        int a = 4;
//        String simboli = "aa";
//        
//        simboli = sc.nextLine();
       
        
//        System.out.println("Ievadiet savu vārdu: ");
//        String vards = sc.nextLine();
//        System.out.println("Jūsu vārds ir: " + vards);
        vardaIevade();
    }
    
    private static void vardaIevade(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kā jūs sauc?");
        String ievade = sc.nextLine();
        System.out.println("Sveiks, " + ievade);
        
    }
}
