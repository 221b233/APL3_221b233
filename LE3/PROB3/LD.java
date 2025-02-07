class LD extends Duck implements Fly, Quack {
    @Override
    public void fly() {
        System.out.println("LakeDuck is flying");
    }
    
    @Override
    public void quack() {
        System.out.println("LakeDuck quacks");
    }
}