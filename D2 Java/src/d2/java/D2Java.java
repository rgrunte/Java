/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d2.java;

import java.util.Scanner;


/**
 *
 * @author Reinis
 */
public class D2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ciklaUzdevumsPakape();
    }
    
    private static void zarosanasUzdevumi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadiet skaitli a: ");
        int a = sc.nextInt();
        System.out.print("Ievadiet skaitli b: ");
        int b = sc.nextInt();
        System.out.print("Skaitlus saskaitit, atnemt, desmit? ");
        String darbiba = sc.next();
        
        if(darbiba.equals("saskaitit")){
            int rezultats1 = saskaitisana(a,b);
        System.out.println(rezultats1);
        } else if (darbiba.equals("atnemt")){
            int rezultats2 = atnemsana(a,b);
        System.out.println(rezultats2);
        } else if (darbiba.equals("desmit")){
            boolean c = nulleLidzDesmit(a, b);
            if(c==true){
                System.out.println("skaitli a un b ir starp 0 un 10");
            } else{
                System.out.println("Skaitli a un b nav starp 0 un 10");
            }
        } else {
            System.out.println("Pieprasita nepareiza darbiba!");
        }

    }
    private static int saskaitisana(int a, int b){
        int result = a+b;

        return result;
    }
    private static int atnemsana(int a, int b){
        int result = a-b;
        
        return result;
    
    }
    private static boolean nulleLidzDesmit(int a, int b){
        boolean result = true;
        
        if(a>=0 && a<= 10 && b>=0 && b<10){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    
    private static void cikli(){
        
        //for, foreach, while, do..while (tiks izieta vismaz viena iterācija caur ciklam)
        
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        
        int j = 0;
        while(j<10){
            System.out.println(j);
            j++;
        }
        
        j= 0; 
        
        do{
            System.out.println(j);
            j++;
        }while(j<10);
    }
    
    private static void ciklaUzdevumsZvaigznes(){
        Scanner sc = new Scanner(System.in);
        String zv= "";    
        for(int i = 0; i<4 ; i++){
            zv = zv + "*";
            System.out.println(zv);
        }
                  
    }
    
    private static void ciklaUzdevumsPakape(){
        Scanner sc = new Scanner(System.in);
        int skaitlis = 2;
        int pakape = 3;
        int rezultats = 1;
        for(int i = 0; i < pakape; i++){
            rezultats = rezultats * skaitlis;
            System.out.println(rezultats);
        }
    
    }
}