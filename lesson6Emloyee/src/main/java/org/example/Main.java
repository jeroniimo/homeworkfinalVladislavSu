package org.example;

public class Main {
    public static void main(String[] args) {
        // Массив из 5 сотрудников
        Employee[] persArray = new Employee[5];

        // Инициализация сотрудников
        persArray[0] = new Employee("Иванов Иван Иванович", "Инженер",
                "ivanov@mail.com", "+375445669236", 2000, 30);
        persArray[1] = new Employee("Петров Петр Петрович", "Менеджер",
                "petrov@mail.com", "+375441140965", 1900, 28);
        persArray[2] = new Employee("Сидоров Сидор Сидорович", "Аналитик",
                "sidor@mail.com", "+375447878836", 2200, 35);
        persArray[3] = new Employee("Кузнецов Кузьма Кузьмич", "Разработчик",
                "kuznetsov@mail.com", "+375445678234", 3000, 32);
        persArray[4] = new Employee("Хомяков Хомяк Хомячкин", "Дизайнер",
                "xomka@mail.com", "+375447878123", 2600, 29);

        // Вывод информации о сотрудниках
        for (Employee employee : persArray) {
            employee.printInfo();
        }
    }
}