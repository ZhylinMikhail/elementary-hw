package FourInterface;

public interface FourthInterface {
    void behavior();

    static void fly(String string) {
        System.out.println(string);
    }

    default void quack(String string) {
        System.out.println("pisses... " + string);

    }

    default void swim(String string) {
        System.out.println("swim... " + string);
    }

}
