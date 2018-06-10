package app.operation;

import app.Dog;
import app.DogDao;

import java.util.List;

public class ReadMulti {
    public static void main(String[] args) {
        List<Dog> dogs = DogDao.readAll();
        for (Dog dog:dogs){
            System.out.println(dog);
        }
    }
}
