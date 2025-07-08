public class Demo7 {
    public static void main(String[] args) {
		int num1=8;
		int num2=1;
		while (num1 >= 2) {
			if (num1 > num2) {
				num1 = num1 / 2;
			} else {
				System.out.println(num1);
				break;
			}
		}
	}
}
