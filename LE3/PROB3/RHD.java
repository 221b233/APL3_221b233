class RHD extends Duck implements Fly, Quack {
    @Override
    public void fly() {
        System.out.println("RedHeadDuck is flying");
    }
    
    @Override
    public void quack() {
        System.out.println("RedHeadDuck quacks");
    }
}