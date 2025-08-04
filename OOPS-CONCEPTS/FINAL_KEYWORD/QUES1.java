package FINAL_KEYWORD;
public class QUES1 {
    //final method
     final void display() {
        System.out.println("Hello");
    }
}
class B extends QUES1{
    void display() {  // ❌ Error: Cannot override final method
        System.out.println("Hi");
    }
}