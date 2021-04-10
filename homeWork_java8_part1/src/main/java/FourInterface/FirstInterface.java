package FourInterface;

public interface FirstInterface {
    void behavior();

    static void fly(String string) {
        System.out.println(string);
    }

    default void quack(String string) {

        System.out.println(string);
    }

    default void swim(String string) {
        System.out.println("to swim in a lake " + string);
    }

}
