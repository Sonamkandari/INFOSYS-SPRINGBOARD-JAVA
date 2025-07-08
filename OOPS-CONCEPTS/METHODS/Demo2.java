package METHODS;
// Whenever a value of a primitive data type is passed, the values are copied from the actual parameters to the formal parameters. 
// This kind of parameter passing is known as pass by value. In pass by value, both the actual and formal parameters point to different 
// memory locations and the values are copied in both the memory locations.

public class Demo2 {
    // creating a change value method 
    public void changeValue(int value1, int value2) {
		value1 = value1 + value2;
		value2 = value1 - value2;
		System.out.println(value1 + " " + value2);
	}

    public static void main(String args[]) {
	Demo2 demo = new Demo2();
	int x = 20;
	int y = 10;
	System.out.println(x + " " + y);
	demo.changeValue(x, y);
	System.out.println("After calling changeValue function");
	System.out.println(x + " " + y);
}
    
}






