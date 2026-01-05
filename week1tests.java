package edu.zuj.oop.week1;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number: ");
        double n1=input.nextDouble();
        System.out.println("the double of this number is:"+n1*2);
        //part 2 
        System.out.println("enter any n number: ");
        int  n2=input.nextInt();
        if (n2%2==1){
            System.out.println("this's an odd number, the square is: "+Math.pow(n2, n2));
        }
        else {
            System.out.println("this's an even number, the double is: "+n2*2);
        }
        
    }
   
}

package edu.zuj.oop.week1;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        System.out.println("whats ur name? ");
        String name=input.next();
        System.out.println("hello, "+name);
                
    
    }
  
}

package edu.zuj.oop.week1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number 1: ");
        int n1=input.nextInt();
        System.out.println("enter number 2: ");
        int n2=input.nextInt();
        if (n1>n2){
            System.out.println("first number double is:"+n1*2);
            
        }
        else if (n2>n1){
            System.out.println("the second number double is:"+n2*2);
        }
        else {
            System.out.println("number 1 * number 2 is "+n1*n2);
        }
    }
    
}

package edu.zuj.oop.week1;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter number 1: ");
        double n1=input.nextDouble();
        System.out.println("enter number 2: ");
        double n2=input.nextDouble();
        System.out.println("the total is: "+n1+n2);
    }
}
