package service;

import entity.Animal;
import entity.Classification;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AnimalService {
    public static List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Elephant", 20, Classification.HERBIVORE));
        animals.add(new Animal("Lion", 10, Classification.PREDATOR));
        animals.add(new Animal("Hyena", 5, Classification.PREDATOR));
        animals.add(new Animal("Monkey", 3, Classification.HERBIVORE));
        animals.add(new Animal("Giraffe", 7, Classification.HERBIVORE));
        animals.add(new Animal("Bear", 8, Classification.OMNIVOROUS));
        animals.add(new Animal("Tiger", 2, Classification.PREDATOR));
        animals.add(new Animal("Horse", 35, Classification.HERBIVORE));
        animals.add(new Animal("Dinosaur", 200, Classification.OMNIVOROUS));
        return animals;
    }

}
