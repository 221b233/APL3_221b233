public class Main {
    public static void main(String[] args) {
        
        System.out.println("Rubber Ducks : ");
        RD d1 = new RD();
        d1.quack();
        d1.swim();
        
        System.out.println();
        
        System.out.println("Wooden Ducks : ");
        WD d2 = new WD();
        d2.swim();
        
        System.out.println();
        System.out.println("RedHead Ducks : ");
        RHD d3 = new RHD();
        d3.quack();
        d3.swim();
        d3.fly();
        
        System.out.println();
        System.out.println("Rubber Ducks : ");
        LD d4 = new LD();
        d4.quack();
        d4.swim();
        d4.fly();
    }
}