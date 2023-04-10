package SINGLETON;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){
        System.out.println("INSTANCE'S CREATED");
    }

    public static LazyInitializationSingleton getInstance(){
        System.out.println("CALL INSTANCE");
        if(instance == null){
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }
}
