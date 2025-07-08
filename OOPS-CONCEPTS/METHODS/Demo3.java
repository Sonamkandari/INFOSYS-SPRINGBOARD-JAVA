package METHODS;

public class Demo3 {
    public boolean checkTemp(int temp) {
		if (temp > 100) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		Demo3 testDemo3 = new Demo3();
		if (testDemo3 .checkTemp(110)) {
			System.out.println("Data is valid");
		} else {
			System.out.println("Data is invalid");
		}
	}

}
