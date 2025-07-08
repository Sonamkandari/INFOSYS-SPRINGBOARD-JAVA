package METHODS;

public class Demo4 {
   public void demoMethod() {
		int varOne = 1000;
		float varTwo = 20.00f;
		double varThree = 0.0;
		varThree = (double) (varTwo + varOne * (7.0 / 100));
		System.out.println("varThree:" + varThree);
	}

	public static void main(String args[]) {
		Demo4 tester = new Demo4();
		tester.demoMethod();
	} 
}
