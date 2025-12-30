package w3_test1;

import java.util.Scanner;


public class W3_test1 {

    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = a.nextInt();
        int sum = 0;
        
        for(int i=1;1 <=n;i++){
            System.out.println("Enter number "+ i + " ");
            int x = a.nextInt();
            
            if (x % 2 == 1){
                sum += x;
            }
        }
        System.out.println("sum :" + sum);
    }
    
}

package w3_test2;

import java.util.Scanner;


public class W3_test2 {

   
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);  
        System.out.println("Enter a number :");
        int n = s.nextInt();
        for(int i = 0; i< n; i++){
            
           for(int j = 0; j< n; j++){
               
           } 
                System.out.print("*");
        }
        System.out.println();
    }
    
}
package w3_test3;

import java.util.Scanner;


public class W3_test3 {

    
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);  
        System.out.println("Enter a number :");
        int x = s.nextInt();
        for(int i = 0; i< x; i++){
            
           for(int j = 0; j< i; j++) {
               
           }
                System.out.print("*");
        }
        System.out.println("*");
    }
    
}

package w3_test4;

import java.util.Scanner;


public class W3_test4 {

   
    public static void main(String[] args) {
     Scanner s= new Scanner(System.in); 
        System.out.println("Enter n1 :");
        int n1 = s.nextInt();
         System.out.println("Enter n2 :");
        int n2 = s.nextInt();
        
        System.out.println("1_add");
        System.out.println("1_sub");
        System.out.println("1_mul");
        System.out.println("1_div");
        System.out.println("1_quit");
        
        int ch=s.nextInt();
        switch(ch){
            case 1 : System.out.println(n1+n2); break;
            case 2 : System.out.println(n1-n2); break;
            case 3 : System.out.println(n1*n2); break;
            case 4 : System.out.println(n1/n2); break;
            case 5 : System.out.println("good bye"); break;
            
            default:
            System.out.println("Error");
            
        }
        

    }
    
}
