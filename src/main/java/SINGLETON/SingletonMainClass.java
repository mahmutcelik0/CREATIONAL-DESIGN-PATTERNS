package SINGLETON;

public class SingletonMainClass {
    public static void main(String[] args) {

        //~~~~~~~~~~~~~~~~~~~~~~ EAGER SINGLETON TEST ~~~~~~~~~~~~~~~~~~~~~~
        //EagerInitializationSingleton eagerSingleton = new EagerInitializationSingleton(); --> COMPILE ERROR
        //EagerInitializationSingleton.getInstance();
        //INSTANCE'S CREATED
        //CALL INSTANCE

        //~~~~~~~~~~~~~~~~~~~~~~ LAZY SINGLETON TEST ~~~~~~~~~~~~~~~~~~~~~~
        //LazyInitializationSingleton secondSingletonExample = new LazyInitializationSingleton(); --> COMPILE ERROR
        //LazyInitializationSingleton.getInstance();
        //CALL INSTANCE
        //INSTANCE'S CREATED

        //https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples
        //https://refactoring.guru/design-patterns/singleton
    }
}
