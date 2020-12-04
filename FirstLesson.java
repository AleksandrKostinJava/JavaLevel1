package homework.lesson1;

public class FirstLesson {
    public static void main(String[] args) {
        byte a = 127;
        short b = 3000;
        int c = 328737;
        long d = 23423424234L;
        float e = 123123.123134F;
        double f = 45.2341;
        boolean g = false;
        char h = 'a';
        char i = 345;
        String j = "Hello";
    }

    private static float operation(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    private static boolean checkTwenty(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    private static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else System.out.println("Отрицательное");
    }

    private static boolean positiveOrNegativeBoolean(int a) {
        return a < 0;
    }

    private static void greeting(String name) {
        System.out.println("Привет " + name + "!");
    }

    private static void leapYear(int year) {
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeap? "Год високосный" : "Год не високосный");

     /*
       if (year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год не високосный");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
           System.out.println("Год високосный");
        } else System.out.println("Год не високосный");

       if(isLeap) { {
            System.out.println("Год високосный");}
        } else System.out.println("Год не високосный");
        */
}
}
