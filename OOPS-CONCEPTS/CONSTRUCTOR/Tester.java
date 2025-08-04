
class Customer {
    public String customerId;
    public String customerName;
    public long contactNumber;
    public String address;
    // creating a method with same name as class name 
    // this is a non parameterized constructor
    public Customer(){
        System.out.println("Constructor called");
    }  
}

public class Tester{
    public static void main(String[] args) {
        Customer myobj=new Customer();
        System.out.println(myobj.customerId);
        System.out.println(myobj.customerName);
        System.out.println(myobj.contactNumber);
        System.out.println(myobj.address);
        
        Customer myobj2=new Customer();
    }
}
