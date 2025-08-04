package CLASSES;

public  class Customer {
    public static class customer{
        String name;
        int id;
        String city;
        double height;

    }
    public static void main(String[] args) {
        customer myobj=new customer();
        //Note that here we didn't initialized values so in the output we will get the default values of our data types
        System.out.println(myobj.name);
        System.out.println(myobj.id);
        System.out.println(myobj.city);
        System.out.println(myobj.height);
        
    }

    
}
