package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphicCollections {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.println("\n-----Cat Object-----\n");
        cat1.eat();
        cat1.sleep();
        cat1.eat("Fish");


        System.out.println("\n-----Dog Object-----\n");
        dog1.eat();
        dog1.sleep();
        dog1.eat("Meat");


        System.out.println("\n-----Animal Object-----\n");
        Animal animal1 = new Animal();
        animal1.eat();
        animal1.eat("some food");
        animal1.sleep();


        System.out.println("\n-----Cat and Dog Objects in Animal shape-----\n");
        Animal cat2 = new Cat();
        Animal dog2 = new Dog();

        cat2.eat();
        cat2.sleep();
        dog2.eat();
        dog2.sleep();

        Animal[] animals = {cat1, cat2, dog1, dog2};
        //System.out.println(animal.getClass().getSimpleName());

        System.out.println("\n----ArrayList----\n");

        new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat);

    }
}
