abstract class Duck implements Swim {
    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() + " is swimming");
    }
}