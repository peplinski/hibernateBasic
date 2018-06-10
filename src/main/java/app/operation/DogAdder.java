package app.operation;

import app.Dog;
import app.DogDao;

public class DogAdder {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setAge(10);
        dog.setName("Burek");

        DogDao.addDog(dog);

    }
}
