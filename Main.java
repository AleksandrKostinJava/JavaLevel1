package homework.lesson6;

import static homework.lesson6.Animal.getAnimalCounter;

public class Main {
    public static void main(String[] args) {
        Cat pushok = new Cat("Пушок");
        Dog bobik = new Dog("Бобик");

        System.out.println("Создано животных: " + getAnimalCounter());

        bobik.run(400);
        bobik.swim(5);
        bobik.swim(30);

        pushok.run(400);
        pushok.run(20);
        pushok.swim(40);
        
    }
}

