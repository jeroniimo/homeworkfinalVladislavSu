package org.example;

public class Main {
    public static void main(String[] args) {
        // Массива парков
        ParkAndAttraction[] parks = new ParkAndAttraction[2];

        // Создание парков
        parks[0] = new ParkAndAttraction("Парк аттракционов", "10:00 - 22:00", 30.1 );
        parks[1] = new ParkAndAttraction("Лунопарк", "09:00 - 21:00", 25.4);

        // Аттракционы для первого парка
        ParkAndAttraction.Attraction[] attractions1 = new ParkAndAttraction.Attraction[3];
        attractions1[0] = new ParkAndAttraction.Attraction("Американские горки", 5);
        attractions1[1] = new ParkAndAttraction.Attraction("Колесо обозрения", 10);
        attractions1[2] = new ParkAndAttraction.Attraction("Детская карусель", 3);

        // Аттракционы для второго парка
        ParkAndAttraction.Attraction[] attractions2 = new ParkAndAttraction.Attraction[3];
        attractions2[0] = new ParkAndAttraction.Attraction("Сплошная река", 7);
        attractions2[1] = new ParkAndAttraction.Attraction("Семейное колесо", 12);
        attractions2[2] = new ParkAndAttraction.Attraction("Лабиринт", 15);

        // Вывод информации о парках и их аттракционах
        for (int i = 0; i < parks.length; i++) {
            parks[i].displayParkInfo();
            ParkAndAttraction.Attraction[] attractions = (i == 0) ? attractions1 : attractions2;
            for (ParkAndAttraction.Attraction attraction : attractions) {
                attraction.displayInfo();
            }
        }
    }
}