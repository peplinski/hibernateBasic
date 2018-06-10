package app;

import org.hibernate.Session;

import java.util.List;

public class DogDao {


    //CRUD
    //create
    //read
    //update
    //delete

    public static void addDog(Dog dog) {
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(dog);
        session.getTransaction().commit();
        session.close();
    }

    public static Dog getDog(Long id) {
        Session session = HibernateFactory.getSessionFactory().openSession();
        Dog dog = (Dog) session.get(Dog.class, id);
        session.close();

        return dog;
    }

    public static List<Dog> readAll(){
        Session session = HibernateFactory.getSessionFactory().openSession();
        List<Dog> dogs = session.createQuery("FROM dog").list();
        session.close();
        System.out.println("Found " + dogs.size()+ " Dogs");
        return dogs;
    }

    public static void deleteDog(Long dogId){
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Dog dog = getDog(dogId);
        session.delete(dog);
        session.getTransaction().commit();
        session.close();
    }

    public static void updateDog(Long dogId, Dog newdog){
        Session session = HibernateFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Dog dog = getDog(dogId);
        dog.setName(newdog.getName());
        dog.setAge(newdog.getAge());
        session.update(dog);
        session.getTransaction().commit();
        session.close();
    }


}
