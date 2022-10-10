public class DbSingleton {

    //volatile make it thread safe
    private static volatile   DbSingleton instance = null;

    private  DbSingleton(){

        // protection against reflection class

        if (instance != null){
            throw new RuntimeException("Use getInstance() instead");
        }

    }

    public static DbSingleton getInstance() {
        //make the instance lazily loaded
        if (instance == null){
            //making it thread safe
            synchronized (DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }


        return instance;
    }
}
