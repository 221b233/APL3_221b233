public class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();  // Creating a Child object but referring it by Mother type
        m1.show();  // Calling the show() method
    }
}
