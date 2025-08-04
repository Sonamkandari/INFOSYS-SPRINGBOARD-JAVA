class Pen{
    String color;
    String type; // bollpoint ,gel

    public void write(){
        System.out.println("writing something");
        
    }

    public void printColor(){
        //through this this keyword we are able to know which keyword called it first
        System.out.println(this.color);
    }
}
public class oops {
    public static void main(String[] args) {
        Pen myobj1=new Pen();
        myobj1.color="red";
        myobj1.type="gel";

        System.out.println(myobj1.color);
        System.out.println(myobj1.type);
        myobj1.write();

        //created an another object
        //class name object name 
        Pen  myobj2=new Pen();
        myobj2.color="black";
        myobj2.color="ballPoint";
        myobj2.printColor();



    }
    
}
