package week4.test1;

import java.util.Scanner;


public class Week4Test1 {

    
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     
        System.out.println("Enter number of grades :");
        int n = s.nextInt();
        
        int a[] = new int [n];
        
        for(int i = 0;i< a.length; i++){
            System.out.println("Enter a value :");
               a [i] = s.nextInt();
        }
        int sum = 0;
        for (int j = 0; j<a.length; j++){
            sum += a[j];
        }
        double avg = sum/ a.length;
        System.out.println("sum :" + sum +" "+"avg :" + avg);
    }

  package week4test2;

import java.util.Scanner;


public class Week4test2 {

    
    public static void main(String[] args) {
       
      int n1=readNumber();
      int n2=readNumber();
      int s=add(n1,n2);
        System.out.println(s);
        
        
        
        
    }
    public static int add(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
    public static int readNumber(){
      Scanner s=new Scanner (System.in);
        System.out.println("Enter number :");
        int n=s.nextInt();
        return n;
    }
}
package week4_test3;


public class Week4_test3 {

    
    public static void main(String[] args) {
       int n= Week4_test3.readNumber();
       int n1= Week4_test3.readNumber();
       int n2= Week4_test3.readNumber();
       
       int a[] = new int[n];
       fillArray(a);
       printArray(a);
        
        
    }
    public static void fillArray(int x[]){
        for(int i =0; i<x.length; i++){
            x[i]=Week4_test3.readNumber();
        }
    }
    public static void printArray(int x[]){
       for(int i =0; i<x.length; i++){ 
           System.out.println(x[i]);
       }
    }
}
    
}
