package tightCoupling;
//Java program to illustrate
//tight coupling concept
class exam {
	 public void appear()
	 {
	     System.out.println("appear the exam");
	 }
	 public static void main(String[] args) {
	

class Test {
exam e = new exam();
public void goExam() {
	e.appear();
}

}

Test t = new Test();
t.goExam();
	 }
}