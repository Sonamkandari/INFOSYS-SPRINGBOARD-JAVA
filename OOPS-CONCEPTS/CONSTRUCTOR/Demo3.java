//Simple Constructor

public class Demo3 {
    public int value = 20;

	Demo3() {
		value = 40;
	}

    public class Tester3 {
	public static void main(String args[]) {
		Demo3 demo = new Demo3();
		System.out.println(demo.value);
	}
}
}
