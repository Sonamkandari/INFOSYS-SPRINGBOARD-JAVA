import java.util.Scanner;
public class nNaturalnumbers {
    static void printIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }

        // recursive call
        printIncreasing(n-1);
        System.out.println(n);;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements :");
        int n=sc.nextInt();
        printIncreasing(n);

    }
}
