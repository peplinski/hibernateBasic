package app.operation;


import app.Dog;
import app.DogDao;

public class DogReader {
    public static void main(String[] args) {

        for (long i = 1; i < 2; i++) {
            Dog dog = DogDao.getDog(i);
            System.out.println(dog);
        }

    }
}
