package hw3;
 import java.util.Scanner;

public class HW3 {

  
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a numbers Of Array");
     int n =s.nextInt();
      int[] arr= new int[n] ;
      int[] odd= new int[n];
      int[] even= new int[n];
      int[] prime= new int[n];
      
      int oddCount =0;
      int evenCount =0;
      int primeCount =0;
      
      System.out.println("Enter a numbers");
      for(int i=0;i<n;i++){
          arr[i]=s.nextInt();
          
         if (arr[i]%2==0){
             even[evenCount]=arr[i];
             evenCount++;
         }
         else  {
             odd[oddCount]=arr[i];
             oddCount++;
         }
         boolean isprime = true;
         if (arr[i]<=1)isprime = false;
         else{
             for (int j=2; j< arr[i];j++){
        if (arr[i]%j==0){
            isprime = false;
            
        }
        } 
      }
         if(isprime){
             prime[primeCount]=arr[i];
             primeCount++;
         }
         }
        System.out.println("odd numbers :");
        for (int i=0;i<oddCount;i++){
            System.out.println(odd[i]+" ");
        }
         System.out.println("evem numbers :");
        for (int i=0;i<evenCount;i++){
            System.out.println(even[i]+" ");
        }
         System.out.println("prime numbers :");
        for (int i=0;i<primeCount;i++){
            System.out.println(prime[i]+" ");
        }
    }
    
    
}
