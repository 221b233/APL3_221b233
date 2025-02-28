class Singleton {
    private static Singleton uniqueInstance = null;
    private static int count = 0;
    private Singleton() {}
    public static Singleton getInstance () {
        if (uniqueInstance == null) {
            count += 1;
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    public static void getCount() {
        System.out.println("Instance called -> "+ count);
    }
}