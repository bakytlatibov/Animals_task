import com.sun.source.tree.CatchTree;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal>animals=new LinkedList<>();

        Random random=new Random();
        for (int i = 0; i <50 ; i++) {
        animals.add(new Cat("mumu",random.nextInt(1,10)));
        animals.add(new Dog("barbos",random.nextInt(1,10)));
        animals.add(new Mouse("burya",random.nextInt(1,10)));

        }
        for (Animal animal:animals
             ) {
            System.out.println(animal);




        }


            }

        }





