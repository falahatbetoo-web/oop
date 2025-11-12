// write a program that read a number from the user then print a minue for him to chose from :
//add only the odd numbers
//add only the even numbers
//add only the prime numbers
//Find the average of the odd and even numbers//
package edu.zuj.oop;

import java.util.Scanner;


public class HW2 {

   
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        
       System.out.println("Enter a number:");
        int num=s.nextInt();
        
      {
           
        System.out.println("*****************");
        System.out.println("1-sumodd");
        System.out.println("2-sumeven");
        System.out.println("3-sumPrime");
        System.out.println("4-sumOdd+sumPrime");
        System.out.println("*****************");
        System.out.println("Enter your choise:");
        
        int ch=s.nextInt();
        switch (ch){
            case 1:
               int sumOdd =0;
                for (int i =0; i%2!=0; i++){
                    sumOdd +=i;
                  }
                 System.out.println(sumOdd);
                break;
            case 2:
                int sumeven =0;
                for (int i =0; i%2==0; i++){
                    sumeven +=i;
                  }
                System.out.println(sumeven);
                break; 
            case 3:
              int sumPrime =0;
              for (int i =0; i<=1; i++){
                     sumPrime +=i;
                  }
                System.out.println( sumPrime);
                break;
            case 4:
                int sum=0;
                 for(int i=0; i<=sum ; i++){
                    System.out.println(sum);
                 }     
                    default: System.out.println("Error");
           }
              }
    }  
}
