
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class cus1 {
   public cus1() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = 0;
      byte var3 = 10;
      System.out.println("Enter the max amount you can pay");
      int var4 = var1.nextInt();
      System.out.println("Enter the number of food items to be ordered");
      int var5 = var1.nextInt();

      for(int var6 = 1; var6 <= var5; ++var6) {
         System.out.println("Enter the food item");
         String var7 = var1.next();
         System.out.println("Enter the quantity");
         int var8 = var1.nextInt();
         var2 += var3 * var8;
         if (var2 > var4) {
            System.out.println("Sorry! Total cost is crossing your max amount limit.");
            break;
         }

         System.out.println("You have ordered: " + var7);
         System.out.println("Order placed successfully");
         System.out.println("Total cost of the order: " + var2);
      }

   }
}

