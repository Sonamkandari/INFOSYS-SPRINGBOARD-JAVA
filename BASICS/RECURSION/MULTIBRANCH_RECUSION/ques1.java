import java.util.Scanner;

public class ques1 {

    static void function(int num) {
        // Base case 
        if (num <= 0) {
            return;
        }

        System.out.println("Pre Call: " + num);
        function(num - 1);
        System.out.println("In Between Call: " + num);
        function(num - 2);
        System.out.println("Post Call: " + num);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        function(number);
        scanner.close();
    }
}
