interface drawable{
    void draw();
}
class rectangle implements drawable{
    public void draw(){
    System.err.println("Drawing a Rectangle");
    }
}
class Triangle implements drawable{
    public void draw(){
    System.err.println("Drawing a Triangle");
    }
}
class circle implements drawable{
    public void draw(){
    System.err.println("Drawing a Circle");
    }
}

public class main {
    public static void main(String[] args) {
        drawable obj =new rectangle();
        obj.draw(); 

        obj =new Triangle();
        obj.draw();

        obj =new circle();
        obj.draw();
        
    }
    
}
