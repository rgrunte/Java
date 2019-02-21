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
          loginsUnParole();
    }
    
    private static void vardaIevade(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Kā jūs sauc?");
        String ievade = sc.nextLine();
        System.out.println("Sveiks, " + ievade);
        
    }
    private static void zarosanas(){
        
          int a = 5;
//        if(a==5){
//            
//        }else{
//            
//        }
//        
//        String b = "c";
//        String d = "aa";
//        
//        if(b.equals("a")){
//            
//        }else if (b.equals(d)){
//            
//        }else{
//            
//        }
        switch(a){
            case 1:
                //kas notiek
                break;
            case 2:
                break;
            default:
                break;
                
            }
    }
    
    private static void uzdevumsZarosanas(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ievadiet skaitli: ");
        int sk = sc.nextInt();
        if(sk >= 5){
            System.out.println("**");
        } else {
            System.out.println("*");
        }
        
//        String simboli = "aaaa";
//        int a = simboli.length();
    }
    
    private static void loginsUnParole(){
//        String logins = "lietotajs";
//        String parole = "abc123";
        
        //datoram jāprasa lai cilvēks ievada loginu un paroli
        //ja ir kāda kļūda, tad programma beidzās
        //ja viss ir kārtībā tad ir jāparbauda vai sakrīt ar to kas ir ievadits
        //vai tas kas ir ievadits 3-12 simboliem
        //paroles vietā 5-10 simboli
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ievadiet loginu: ");
        String logins = sc.nextLine();
        int a = logins.length();
        
        if(a < 3 || a > 12){
            System.out.println("logins ir nepareizs");
        } else {
            System.out.println("logins ir pareizs");
        }
        
        //2.variants
        //if(logins.length() < 3 || logins.length() > 12)
        String parole = "abc111";
        System.out.print("Ievadiet paroli: ");
        String paroleInput = sc.nextLine();
        int b = paroleInput.length();
        if(b < 5 || b > 10){
            if(parole.equals(b)){
            System.out.println("parole ir nepareiza");
            }
        } else {
            System.out.println("parole ir pareiza");
        }
        
//        System.out.print("Ievadiet loginu: ");
//        String logins = sc.nextLine();
//        int a = logins.length();
//        
//        System.out.print("Ievadiet paroli: ");
//        String parole = sc.nextLine();
//        int b = parole.length();
//
//        if(a < 3 || a > 12 || b < 5 || b > 10){
//            System.out.println("logins un/vai parole ir nepareiza");
//        } else {
//            System.out.println("logins un parole ir pareiza");
//        }
    }
}
