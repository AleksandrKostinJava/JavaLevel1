package homework.lesson7;

public class Cat {
    private String name;
    private int appetite;
    /** 3. Каждому коту нужно добавить поле сытость
     * (когда создаем котов, они голодны). Если коту
     * удалось покушать (хватило еды), сытость = true.
     */
    private boolean bellyful;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        bellyful = false;
    }
    public void eat(Plate p) {
        if(p.decreaseFood(appetite)) {
            bellyful = true;
            System.out.println("Кот " + name + " поел");
        } else {
            bellyful = false;
            System.out.println("Еды не хватило, " + name + " не поел");
        }
    }

    public void info() {
        System.out.print("У кота " + name + " аппетит " + appetite);
        if(bellyful){
            System.out.println(". Он сыт");
        }
        else System.out.println(". Он голоден");
    }
}
