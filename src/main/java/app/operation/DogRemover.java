package app.operation;

import app.DogDao;

public class DogRemover {
    public static void main(String[] args) {
        DogDao.deleteDog(2L);
    }
}
