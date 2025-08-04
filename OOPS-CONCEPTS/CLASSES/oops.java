// class Pen{
//     String color;
//     String type; // bollpoint ,gel

//     public void write(){
//         System.out.println("writing something");
        
//     }

//     public void printColor(){
//         //through this this keyword we are able to know which keyword called it first
//         System.out.println(this.color);
//     }
// }

//creating an another class
class Student{
    String name;
    int age;

    //parameterized  constructor
    Student(String name,int age){
         this.name=name;
         this.age=age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
}
public class oops {
    public static void main(String[] args) {
        // Pen myobj1=new Pen();
        // myobj1.color="red";
        // myobj1.type="gel";

        // System.out.println(myobj1.color);
        // System.out.println(myobj1.type);
        // myobj1.write();

        // //created an another object
        // //class name object name 
        // Pen  myobj2=new Pen();
        // myobj2.color="black";
        // myobj2.color="ballPoint";
        // myobj2.printColor();


        //creating object for student  class
          Student s1=new Student("sonam", 7);
          s1.printInfo();


    }
    
}
