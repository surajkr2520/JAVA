abstract class Marks {
    protected double marksJava;
    protected double marksDSA;
    protected double percentage;

    public Marks(double marksJava, double marksDSA) {
        this.marksJava = marksJava;
        this.marksDSA = marksDSA;
        this.percentage = 0;

    }

    public abstract void findPercentage();
}
class CSE extends Marks {
    private double marksAlgo;

    public CSE(double marksJava, double marksDSA, double marksAlgo) {
        super(marksJava, marksDSA);
        this.marksAlgo = marksAlgo;
    }

    public void findPercentage() {
        double totalMarks = marksJava + marksDSA + marksAlgo;
        this.percentage = (totalMarks / 300) * 100;
        System.out.println("CSE Student Percentage: " + this.percentage);
    }
}

class NonCSE extends Marks {
    private double marksMechanics;
    
    public NonCSE(double marksJava, double marksDSA, double marksMechanics) {
        super(marksJava, marksDSA);
        this.marksMechanics = marksMechanics;

    }

    public void findPercentage() {
        double totalMarks = marksJava + marksDSA + marksMechanics;
        this.percentage = (totalMarks / 300) * 100;
        System.out.println("Non-CSE Student Percentage: " + this.percentage);

    }

}
public class main {

    public static void main(String[] args) {
        CSE cseStudent1 = new CSE(85, 90, 80);
        NonCSE nonCseStudent1 = new NonCSE(75, 80, 70);
        cseStudent1.findPercentage();
        nonCseStudent1.findPercentage();

    }

}