import java.util.*;
public class fibonacciNumber {
  static int fib(int n) {
    if(n<=1){
        return n;
    }
        int fibonachi=fib(n-1)+fib(n-2);
        return fibonachi;

        
    }
         public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n=sc.nextInt();
         System.out.println(fib(n));
      

    }
    
    
}
