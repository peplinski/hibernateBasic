package app.operation;

import app.Dog;
import app.DogDao;

public class DogUpdate {
    public static void main(String[] args) {
        Dog newDog = new Dog();

        newDog.setName("Reksio");
        newDog.setAge(1);
        DogDao.updateDog(1L,newDog);
    }
}
