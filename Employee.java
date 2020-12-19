package homework.lesson5;

/**
 * 1. Создать класс "Сотрудник" с полями:
 * ФИО, должность, email, телефон, зарплата, возраст.
 */
public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phoneNumber; //Могу ошибаться, но выбрал String,
                                //потому что он удобнее в случае дальнейшей разработки
    private int salary;
    private byte age;


    /**
     * 2. Конструктор класса должен заполнять эти поля
     * при создании объекта.
     */
    Employee(String fio, String position, String email,
             String phoneNumber, int salary, byte age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        /** 4. Создать массив из 5 сотрудников.
         5. С помощью цикла вывести информацию только
         о сотрудниках старше 40 лет.*/
        printEmployeeInfoOver40Age(createEmployeeArray());
    }

    private static Employee[] createEmployeeArray() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", "engineer", "aaa@jjj",
                "87845", 100, (byte) 46);
        employees[1] = new Employee("Sidorov", "programmer", "bbb@jjj",
                "75457", 100, (byte) 28);
        employees[2] = new Employee("Petrov", "programmer", "ccc@jjj",
                "098897", 100, (byte) 30);
        employees[3] = new Employee("Zvyagin", "DBA", "ddd@jjj",
                "7864234", 100, (byte) 44);
        employees[4] = new Employee("Pechkin", "manager", "eee@jjj",
                "345897345", 100, (byte) 30);
        return employees;
    }

    public static void printEmployeeInfoOver40Age(Employee[] e) {
        for (int i = 0; i < e.length; i++) {
            if (e[i].age > 40) {
                e[i].printInfo();
            }
        }
    }

    /**
     * 3. Внутри класса «Сотрудник» написать метод, который
     * выводит информацию об объекте в консоль.
     */
    public void printInfo() {
        System.out.println(getFio() + ", " + getPosition() + ", " +
                "Email: " + getEmail() + ", тел. " + getPhoneNumber() +
                ", зарплата " + getSalary() + ", возраст " + getAge());
    }

    //немного улучшил сеттеры по своему желанию :)
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        if(!fio.isEmpty()) {
        this.fio = fio;}
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if(!position.isEmpty()){
            this.position = position;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(!email.isEmpty()) {
            this.email = email;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(!phoneNumber.isEmpty()) {
            this.phoneNumber = phoneNumber;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
