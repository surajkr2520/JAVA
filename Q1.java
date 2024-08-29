package multipleInheritance;

public class Q1 implements printable,showable {
	public void print() {
		System.out.println("print object");
	}
	public void show() {
		System.out.println("show printed object");
	}

	public static void main(String[] args) {
		Q1 obj = new Q1();
		obj.print();
		obj.show();

	}

}
