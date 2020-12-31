package homework.lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        /**2. Сделать так,чтобы в тарелке с едой
         * не могло получиться отрицательного количества
         * еды (например, в миске 10 еды, а кот
         * пытается покушать 15-20).
         * Считаем, что если коту мало еды в тарелке,
         * то он её просто не трогает, то есть не может
         * быть наполовину сыт (это сделано для упрощения
         * логики программы).*/

        if(food >= n) {
            food -= n;
            return true;
        }
        return false;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    /**Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.*/
    public void increaseFood (int n) {
        food += n;
    }
}
