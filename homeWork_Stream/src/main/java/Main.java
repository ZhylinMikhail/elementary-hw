import entity.Animal;
import service.AnimalService;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = AnimalService.getAnimals();

//================================= Task 1 =============================================================================

//        Stream<Object> firstStream = Stream.empty();
//        firstStream.sorted().limit(2).collect(Collectors.toList()).forEach(out::println);

//================================= Task 2 =============================================================================

//        List<Animal> secondStream = animals.stream()
//                .filter(animal -> animal.getClassification()
//                .equals(Classification.HERBIVORE))
//                .sorted(Comparator.comparing(Animal::getAge)).collect(Collectors.toList());
//        secondStream.forEach(out::println);

//================================= Task 3 =============================================================================

//        List<Integer> thirdStream = Stream.of(1,2,3,4,5).collect(Collectors.toList());
//        thirdStream.forEach(out::println);

//================================= Task 4 =============================================================================

//        Map<Integer,String> fourTask = new HashMap<>();
//        fourTask.put(1,"One");
//        fourTask.put(2,"Two");
//        fourTask.put(3,"Third");
//        fourTask.put(4,"Four");
//        Stream<Map.Entry<Integer, String>> fourStream = fourTask.entrySet().stream();
//        fourStream.collect(Collectors.toList()).forEach(out::println);

//================================= Task 5 =============================================================================

//        List<String> fiveTask = Arrays.asList("1","2","3","4","5","6","7","8","9","10");
//        List<Integer> fiveStream = fiveTask.stream().
//        skip(1).limit(8).map(Integer::parseInt)
//        .filter(integer -> integer%2==0).distinct()
//                .collect(Collectors.toList());
//        fiveStream.forEach(out::println);

//================================= Task 6 =============================================================================
//        Optional<Integer> sixStream = Stream.of(1, 3, 55, 12, 7, 22)
//                .parallel()
//                .sorted().
//                        filter(var -> var >= 20)
//                .findFirst();
//        System.out.println(sixStream);

//================================= Task 7 =============================================================================
//        Random random = new Random(System.currentTimeMillis());
//        Arrays.stream("Lorem ipsum dolor, sit amet consectetur adipisicing elit. Eligendi delectus libero reprehenderit numquam cupiditate laboriosam commodi tenetur alias non aliquam."
//                .split("[., ]"))
//                .filter(s -> !s.isEmpty())
//                .map(String::length)
//                .map(random::nextInt)
//                .distinct()
//                .sorted()
//                .collect(Collectors.toCollection(ArrayList::new))
//                .forEach(System.out::println);
    }
}
