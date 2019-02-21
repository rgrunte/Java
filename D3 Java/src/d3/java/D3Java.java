/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d3.java;

import java.util.Scanner;

/**
 *
 * @author Reinis
 */
public class D3Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        kalkulators();
    }
    
    private static void skaitluSumma(){
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        
        for (int i = 0; i < 5; i++){
            System.out.println("Ievadiet skaitli: ");
            int sk = sc.nextInt();  
            sum = sum + sk;
        }
        
        System.out.println("Skaitļu summa: " + sum);
    }
    
    private static void menu1(){
        Scanner sc = new Scanner(System.in);
        
        int izvele = 1;
        
        while(izvele!=0){
            System.out.println("Izvēlaties 1, 2 vai 0: ");
            izvele = sc.nextInt();
            
            switch(izvele){
                case 1:
                    System.out.println("1. izvēle");
                    break;
                case 2:
                    System.out.println("2. izvēle");
                    break;
                case 0: 
                    break;
                default:
                    System.out.println("Nepareiza ievade");
                    break;
            }
            
        }   
    }
    
    private static void menu2(){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Izvēlaties 1, 2 vai 0: ");
            int izvele = sc.nextInt();
            int sk1 = 0;
            int sk2 = 0;
            if(izvele!=0){
                System.out.println("Izvēlaties 1.skaitli: ");
                sk1 = sc.nextInt();
                
                System.out.println("Izvēlaties 2.skaitli: ");
                sk2 = sc.nextInt();
            } else {
                break;
            }
            
            switch(izvele){
                case 1:
                    System.out.println("1. izvēle");
                    break;
                case 2:
                    System.out.println("2. izvēle");
                    break;
                case 0: 
                    break;
                default:
                    System.out.println("Nepareiza ievade");
                    break;
            }
        }
    }
    private static void kalkulators(){
        Scanner sc = new Scanner(System.in);
        int izvele = 1;
        int sk1 = 0;
        int sk2 = 0;
    
        while(izvele!=0){
            System.out.println("Izvēlaties 1.skaitli: ");
            sk1 = sc.nextInt();
                
            System.out.println("Izvēlaties 2.skaitli: ");
            sk2 = sc.nextInt();
            
            System.out.println("Izvēlaties 1.darbiba, 2.darbiba vai 0: ");
            izvele = sc.nextInt();
            
            switch(izvele){
                case 1:
                    System.out.println(sk1 + sk2);
                    break;
                case 2:
                    System.out.println(sk1 - sk2);
                    break;
                case 0: 
                    break;
                default:
                    System.out.println("Nepareiza ievade");
                    break;
            }
            
            
        }
    
    }
    
}
