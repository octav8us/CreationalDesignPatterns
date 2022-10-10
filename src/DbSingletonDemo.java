public class DbSingletonDemo {



    public static void main(String[] args) {
        System.out.println("Hello world!");
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton anotherInstance = DbSingleton.getInstance();

        System.out.println(instance);
        System.out.println(anotherInstance);





    }
}