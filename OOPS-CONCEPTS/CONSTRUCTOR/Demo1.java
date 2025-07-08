package CONSTRUCTOR;
public class Demo1 {
    public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;

    // here i have created a parameterrized constructore
	Demo1(String cId, String cName, long contact, String add) {
		customerId = cId;
		customerName = cName;
		contactNumber = contact;
		address = add;
	}
}

class Tester1{
	public static void main(String args[]) {
		Demo1 customer1 = new Demo1("C103", "Jacob", 5648394590L,
				"13th Street, New York");
		System.out.println(customer1.customerId);
		System.out.println(customer1.customerName);
		System.out.println(customer1.contactNumber);
		System.out.println(customer1.address);
	}
}

