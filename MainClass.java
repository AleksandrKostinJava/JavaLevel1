package homework.lesson7;

public class MainClass {
    public static void main(String[] args) {
        /**Создать массив котов и тарелку с едой,
         * попросить всех котов покушать из этой
         * тарелки и потом вывести информацию о
         * сытости котов в консоль.
         */
        Cat[] cats = new Cat[]{new Cat("Pushok", 20),
                     new Cat("Sashok", 15),
                     new Cat("Barsik", 10)};
        Plate plate = new Plate(40);

        /**Создать массив котов и тарелку с едой, попросить
         * всех котов покушать из этой тарелки и потом
         * вывести информацию о сытости котов в консоль.
         */
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
        }

        plate.increaseFood(50);
        plate.info();
    }
}
