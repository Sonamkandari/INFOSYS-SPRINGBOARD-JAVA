package CLASSES;
import java.util.Scanner;
public class studentCLass {
    //creating a new data type -> with multiple Attributes
    // public static class student{
    //     String name;//this is known as a class
    //     int rollNo;
    //     double percent;
    // }

    //creating a another class
    public static class car{
        String name;
        String Type;
        int ModelNo;
        int NoOfWheels;

    }
    public static void main(String[] args) {

        //this is used to create a box
        student x=new student();// these are objects of the class
        // dot operator
        x.name="sonam";
        x.rollNo=6;
        x.percent=85.5;
        System.out.println(x.name);
        System.out.println(x.rollNo);
        System.out.println(x.percent);


        student y=new student();// declaration-> another object of the class
        y.name="rohan";
        y.rollNo=65;
        y.percent=89;
        System.out.println(y.name);
        System.out.println(y.rollNo);
        System.out.println(y.percent);

        //creating objects for car class
        car a=new car();
        a.name="XUV";
        a.Type="city car";
        a.ModelNo=789;
        a.NoOfWheels=7;
        System.out.println(a.name);
        System.out.println(a.Type);
        System.out.println(a.ModelNo);
        System.out.println(a.NoOfWheels);

       // creating a  another object of car class
       car b=new car();
       b.name="Maruti";
       b.Type="adventure";
       b.ModelNo=678;
       b.NoOfWheels=6;

        System.out.println(b.name);
        System.out.println(b.Type);
        System.out.println(b.ModelNo);
        System.out.println(b.NoOfWheels);

    }
    
}
