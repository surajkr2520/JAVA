
//tight coupling
public class tcQ3 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        Samsung samsungCharger = new Samsung();
        Apple appleCharger = new Apple();
        mobile.chargerUsed(samsungCharger);
    }
}
interface Charger{
    String display();
}
class Samsung implements Charger{
    
    public String display(){
    
        return "The Samsung Charger";
    }
}
class Apple implements Charger{
    public String display(){
        return "Apple Charger";
    }
}
class Mobile{
    public void chargerUsed(Charger charger){
        System.out.println("The mobile is using "+charger.display());
    }
}
