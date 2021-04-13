import entity.Dog;
import functionInterface.ConsumerInterface;
import functionInterface.FunctionInterface;
import functionInterface.PredicateInterface;
import functionInterface.SupplierInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //========================== Predicate ================================================

//        PredicateInterface<Double> predicateInterface = aDouble -> aDouble > 1500.0;
//        System.out.println("predicateInterface.pay(1400.0) " + predicateInterface.pay(1600.0));

        //===========================Consumer==================================================

//        ConsumerInterface <String> consumerInterface = s -> {
//            char[] toChar = s.toCharArray();
//            for (char c : toChar) {
//                System.out.println(c);
//            }
//        };
//        consumerInterface.stringToCharArray("Hello World");

        //========================= Function ==================================================

//        FunctionInterface<Integer, String> functionInterface = integer -> {
//            String intToString;
//            switch (integer) {
//                case 1:
//                    intToString = "One";
//                    break;
//                case 2:
//                    intToString = "Two";
//                    break;
//                case 3:
//                    intToString = "three";
//                    break;
//                case 4:
//                    intToString = "four";
//                    break;
//                case 5:
//                    intToString = "five";
//                    break;
//                case 6:
//                    intToString = "six";
//                    break;
//                case 7:
//                    intToString = "seven";
//                    break;
//                case 8:
//                    intToString = "eight";
//                    break;
//                case 9:
//                    intToString = "nine";
//                    break;
//                case 10:
//                    intToString = "ten";
//                    break;
//
//                default:
//                    intToString = "unknown";
//            }
//            return intToString;
//
//        };

//======================================= Supplier =======================================================

        SupplierInterface <Dog> dogFactory = ()->{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inter dog name");
            String name = scanner.nextLine();
            return  new Dog(name);
        };
        Dog dog = dogFactory.get();
        System.out.println("dog " + dog.getName());
    }
}
