/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d3.kalkulators;

import java.util.Scanner;

/**
 *
 * @author Reinis
 */
public class D3Kalkulators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            int izvele = 1;
            while(izvele!=0){
                System.out.print("Izvēlaties 1., 2., 3., 4., 5. darbibu vai 0: ");
                izvele = sc.nextInt();
                double sk1 = 0;
                double sk2 = 0;
                //double rezultats = 1;
                if(izvele==1 || izvele==2 || izvele==3 || izvele==4
                        || izvele==5 || izvele == 0){
                System.out.print("Izvēlaties 1.skaitli: ");
                sk1 = sc.nextDouble();
                
                System.out.print("Izvēlaties 2.skaitli: ");
                sk2 = sc.nextDouble();

                switch(izvele){
                    case 1:
                        System.out.println("Rezultāts: " + sk1 + sk2);
                        break;
                    case 2:
                        System.out.println(" Rezultāts: " + (sk1 - sk2));
                        break;
                    case 3:
                        System.out.println("Resultāts: " + sk1 * sk2);
                        break;
                    case 4:
                        System.out.println(sk1 / sk2);
                        break;
                    case 5:
                        System.out.println(Math.pow(sk1, sk2));
//                        for(double i = 0; i < sk2; i++){
//                            rezultats = rezultats * sk1;
//                            }
//                        System.out.println("Rezultāts: " + rezultats);
                        break;
                    case 0: 
                        break;
                        }                
                } else {
                    System.out.println("Nepareiza ievade!");
                }

        }
    }
    
}
