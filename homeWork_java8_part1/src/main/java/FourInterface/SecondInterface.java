package FourInterface;

public interface SecondInterface {
    void behavior();

    static void fly(String string) {
        System.out.println(string);
    }

    default void quack(String string) {
        System.out.println(string);

    }

    default void swim(String string) {
        System.out.println("swim in " + string);
    }

}
