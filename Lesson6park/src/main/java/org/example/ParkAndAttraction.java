package org.example;

public class ParkAndAttraction {
    private String name;          // Название парка
    private String openingHours;  // Время работы
    private double entryFee;      // Стоимость входа

    // Конструктор
    public ParkAndAttraction(String name, String openingHours, double entryFee) {
        this.name = name;
        this.openingHours = openingHours;
        this.entryFee = entryFee;
    }

    // Вывода информации о парке
    public void displayParkInfo() {
        System.out.println("Парк: " + name);
        System.out.println("Время работы: " + openingHours);
        System.out.println("Стоимость входа: " + entryFee + " рублей");
        System.out.println("-------------------------------------"); // разделение для красоты
    }

    // Класс Attraction
    public static class Attraction {
        private String name;      // Название
        private double duration;   // Продолжительность

        // Конструктор
        public Attraction(String name, double duration) {
            this.name = name;
            this.duration = duration;
        }

        // Вывода информации об аттракционе
        public void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Продолжительность: " + duration + " минут");
            System.out.println("-------------------------------------");
        }
    }
}
