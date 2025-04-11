abstract class Beverage {
    private void pour(int qty) {
        System.out.println("Add " + qty + "ml of beverage");
    }

    protected abstract void addCondiments();

    protected void stir() {
        System.out.println("Stirring the beverage");
    }

    private void serve() {
        System.out.println("Serve through waiter");
    }

    public final void templateMethod(int qty) {
        pour(qty); 
        addCondiments();
        stir();
        serve();
    }
}



