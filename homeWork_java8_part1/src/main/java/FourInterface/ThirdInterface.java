package FourInterface;

public interface ThirdInterface extends FourthInterface {
    void behavior();

    static void fly(String string) {
        System.out.println(string);
    }

    default void quack(String string) {
        System.out.println("extends interface " + string);

    }

    default void swim(String string) {
        System.out.println("extends interface " + string);
    }
}
