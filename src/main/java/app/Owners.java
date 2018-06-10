package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Owners {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Add name and age");
        String userNameAndAge = null;

        try {
            userNameAndAge = reader.readLine();

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(userNameAndAge);
        String[] info = userNameAndAge.split(" ");

        Dog d = new Dog();
        d.setName(info[0]);
        d.setAge(Integer.parseInt(info[1]));
        DogDao.addDog(d);
    }

}
