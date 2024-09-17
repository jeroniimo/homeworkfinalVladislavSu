package org.example;

public class Main {//коментарии оставляю в большей степени для себя чтоб понимать что я делаю
    public static void main(String[] args) {
        printThreeWords(); //1+
        checkSumSign(); //2+
        printColor(); //3+
        compareNumbers(); //4+
        System.out.println(checkSumInRange(3, 10)); //5+
        printPosOrNeg(-3); //6+
        System.out.println(isNegative(10)); //7+
        printStringMultipleTimes("Строка 8 задания", 3); //8+
        System.out.println(isLeapYear(100)); //9+
        System.out.println(isLeapYear(400)); //9+
        System.out.println(isLeapYear(2024)); //9+
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; //10+
        replace(array1); //10+
        int[] array2 = new int[100]; //11+
        fillArray(array2); //11+
        processArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}); //12+
        createDiagonalArray(7); // 13 +- сложно пришлось очень много искать информации чтоб найти нужный метод)
    }

    // 1) Три слова+
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2) Проверка суммы+
    public static void checkSumSign() {
        int a = 5965;
        int b = -3646521;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3) Определения цвета+
    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4) Сравнение чисел+
    public static void compareNumbers() {
        int a = 33;
        int b = -3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5) Проверка суммы в пределе+
    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6) Проверка положительного или отрицательного числа +
    public static void printPosOrNeg(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7) Метод для проверки полярности числа+
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8) Печать указанной строки, указанное кол-во раз +
    public static void printStringMultipleTimes(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    // 9) Метод для проверки високосного года +
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    // 10) Создание и замены 0 на 1 и 1 на 0 в целочисленном массиве+
    public static void replace(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0; // Заменяем 0 на 1 и 1 на 0
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 11) Заполнение массива 1-100 +
    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // 12) Создать массив, пройтись циклом и числа <6 ,*2  +
    public static void processArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    // 13) Создание двумерного массива с 1 на диагонали  +-
    public static void createDiagonalArray(int n) {
        int[][] array = new int[n][n]; // Создание массива
        for (int i = 0; i < n; i++) {
            array[i][i] = 1; //  единицы на диагонали
        }
        // Вывод массива
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
