package CONSTRUCTOR;

class Demo4 {
	public int var1 = 20;
	public int var2 = 40;

	Demo4(int v1, int v2) {
		var1 = v1;
		var2 = v2;
	}
}

public class Tester4 {
	public static void main(String args[]) {

		/*Explanation :

If a parameterized constructor is created by the developer,
 Java does not supply a default constructor. Since, there is 
 no parameterless constructor present, there will be a compilation error. */
		Demo4 demo = new Demo4(3,4);
		System.out.println(demo.var1);
		System.out.println(demo.var2);
	}
}