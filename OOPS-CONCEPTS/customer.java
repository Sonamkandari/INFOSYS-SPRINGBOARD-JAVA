class Customer {

	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;

	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***************************");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}

    // Another method
    public void payBill(double totalPrice, double discountPercentage) {
	System.out.println("Calculating final amount to be paid......");
	double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
	System.out.println("Hi " + customerName
			+ ", your final bill amount after discount is: "
			+ (int) (priceAfterDiscount * 100) / 100.0);
    }

    //  another method but return type is void and this we declare methods inside a method

    public double payBill(double totalPrice) {
	double discountPercentage = 10;
	System.out.println("Calculating final amount to be paid.....");
	double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
	return priceAfterDiscount;
}



}

class Tester {

	public static void main(String[] args) {

		// Object creation
		Customer customer = new Customer();

		// Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";

		// Displaying the customer details
		customer.displayCustomerDetails();
		// Move the above statement immediately after the object creation
		// statement and observe the output
        
        // calling paybill method and passing arguments to it
        customer.payBill(500, 10);

	}

}