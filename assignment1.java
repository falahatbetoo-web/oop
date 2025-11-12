//Part 1  *****// 
package hw1;
import java.util.Scanner;
public class Test1 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int x=s.nextInt();
        for(int i=0;i<x;i++){
            System.out.print("*");    
          } 
        }  
  } 

//    Part 2 Stars vertically//
package hw1;
import java.util.Scanner;
public class Test2 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int x=s.nextInt();
        for(int i=0;i<x;i++){
            System.out.println("*");    
          } 
        }  
  } 

// part 3 Stars in a square shape//
package hw1;
import java.util.Scanner;
public class Test3 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int x=s.nextInt();
        for(int i=1;i<=x;i++){
          for(int j=1;j<=x;j++) {
              System.out.print("* ");     
          }
            System.out.println(" ");
        }   
    }  
}

//Part4  Stars in a Right isosceles triangle shape//
import java.util.Scanner;
public class Test4 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int x=s.nextInt();
        for(int i=1;i<=x;i++){
          for(int j=1;j<=i;j++) {
              System.out.print("* ");     
          }
            System.out.println(" ");
        }   
    }  
}
//Part5 Stars in oblique line shape //
package hw1;
import java.util.Scanner;
public class Test5 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int x=s.nextInt();
        for(int i=0;i<x;i++){
          for(int j=0;j<i;j++) {
              System.out.print(" ");     
          }
            System.out.println("*");
        }   
    }  
}
//Part6  Stars in a Right isosceles triangle mirrored shape//
package hw1;
import java.util.Scanner;
public class Test6 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int x=s.nextInt();
        for(int i=1;i<x;i++){
          for(int j=i;j<x;j++) {
              System.out.print(" ");     
          }
          for(int b=1;b<=i;b++) 
            System.out.print("*");
        } 
        System.out.println(" ");
    }     
}
//Part7 Stars in oblique line Mirrored shape //
package hw1;
mport java.util.Scanner;
public class Test7 {

    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int x=s.nextInt();
        for(int i=0;i<x;i++){
          for(int j=i;j<x-1;j++) {
              System.out.print(" ");     
          }
        
        System.out.println("*");
    }     
    }
}
