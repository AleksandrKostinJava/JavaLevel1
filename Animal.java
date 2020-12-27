package homework.lesson6;

/**
 * 1. Создать классы Собака и Кот с наследованием
 * от класса Животное.
 * 2. Все животные могут бежать и плыть.
 * В качестве параметра каждому методу передается
 * длина препятствия. Результатом выполнения действия
 * будет печать в консоль. (Например,
 * dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия
 * (бег: кот 200 м., собака 500 м.; плавание:
 * кот не умеет плавать, собака 10 м.).
 */

public abstract class Animal {
    private static int animalCounter;
    String name;
    String animalType;
    int maxRunDistance;
    int maxSwimDistance;


    public Animal(String name, String animalType, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.animalType = animalType;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCounterIncrease();
    }

    /**
     * 4. Добавить подсчет созданных котов, собак и животных.
     */


    private static void animalCounterIncrease() {
        animalCounter++;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    protected void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println(animalType + " " + name + " не может столько пробежать.");
        } else System.out.println(animalType + " " + name + " успешно пробежал " + distance + " м.");

    }

    protected void swim(int distance) {
        if (animalType.equals("Cat")) {
            System.out.println("Коты не умеют плавать");
            return;
        }
        if (distance > maxSwimDistance) {
            System.out.println(animalType + " " + name + " не может столько проплыть.");
        } else System.out.println(animalType + " " + name + " успешно проплыл " + distance + " м.");
    }
}