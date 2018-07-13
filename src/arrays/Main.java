package arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    // psvm - быстрая генерация функции main
    public static void main(String[] args) {
        // example4_8();
        // example4_7();
        example4_9();
    }


    public static void arrayExample() {
        // Массивы делятся на два типа:
        //  - статический массив (магазин автомата, 30 элементов)
        //  - динимический массив (поездной состав)

        // В Java нам доступны только динамические плюсы

        // Массив характ. :
        // - тип данных, которые хранятся в массиве, однотипные
        // - название массива
        // - количество измерений массива (одномерные, двухмерные, n-мерные)
        // - длинна массива

        // Пример объявления массива:
        // Массив элементов типа int на 10 элементов
        int[] arr = new int[10];
        // 1 - int - указываем тип данных жлементов, которыеы хранятся в массиве
        // 2 - [] - указываем, что данная переменная является массивом,
        //     при чём, каждая пара [] - это одно измерение
        // 3 - arr - название переменной
        // 4 - = - знак присвоения
        // new int[10], указываем, что мы хотим выделить в памяти пространство для
        //      10 элементов типа int

        // Одномерный массив элементво типа double
        double[] arrDoubles = new double[20];
        // Одномерный массив элементов типа String
        String[] arrStrings = new String[30];

        // Обращение к элементам массива
        // 1. Присвоить какое-то значение элементу массива
        int[] arr2 = new int[20];
        // Присвоить элементу с индексом 3 значение 30
        arr2[3] = 30;
        // С индексом 5 значение 50
        arr2[5] = 50;

        // Получить, вывести элемент массива
        System.out.println("Элемент массива arr2, по индексу 3:");
        System.out.println(arr2[3]);
        System.out.println("ПРосто написали переменную массива:");
        System.out.println(arr2);

        // Перебор элементов массива в цикле
        // fori + Enter
        System.out.println("Вывод элементов массива на экран: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }

        // arr2.length - length - указывает на длину массива

        // Заполнить массив случайными значениями
        Random random = new Random();

        for (int i = 0; i < arr2.length; i++) {
            if (i == 0) {
                arr2[i] = random.nextInt(1000);
            } else if (i % 2 == 1) {
                arr2[i] = random.nextInt(100);
            } else if (i % 2 == 0) {
                arr2[i] = random.nextInt(3);
            }
        }

        System.out.println("\nВывод элементов массива на экран, сген. случайно: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }

    }

    public static void arrayGetMax() {
        // Получить максимальный элемент в массиве, из 20 жлементов.
        // Массив заполнить случайно
        Random random = new Random();
        int[] array = new int[20];

        // Заполняем массив случайным образом
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        // Выводим массив на экран
        System.out.println("Выводим массив на экран:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        // Поиск максимального значения
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("\nМаксимальный элемент: " + max);
    }

    public static void arrayGetMin() {
        // Получить максимальный элемент в массиве, из 20 жлементов.
        // Массив заполнить случайно
        Random random = new Random();
        int[] array = new int[20];

        // Заполняем массив случайным образом
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }

        // Выводим массив на экран
        System.out.println("Выводим массив на экран:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        // Поиск максимального значения
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("\nМинимальный элемент: " + min);
    }

    public static void classWorkExample1() {
        int n = 5;
        int indexOfBank = 0;
        double[] exchanges = new double[5];
        exchanges[0] = 26.1;
        exchanges[1] = 26.3;
        exchanges[2] = 25.9;
        exchanges[3] = 25.7;
        exchanges[4] = 26.12;

        System.out.println("Курсы в банках: ");
        for (int i = 0; i < exchanges.length; i++) {
            System.out.println("Банк с индексом " + i
                    + ", имеет такой курс - " + exchanges[i]);
        }

        double maxExchange = exchanges[0];
        for (int i = 0; i < exchanges.length; i++) {
            if (exchanges[i] > maxExchange) {
                maxExchange = exchanges[i];
                indexOfBank = i;
            }
        }

        System.out.println("Оптимальный банк с курсом - " + maxExchange);
        System.out.println("Индекс банка - " + indexOfBank);

    }

    public static void example999() {
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        Random random = new Random();

        System.out.println("Первый массив:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(11);
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nВторой массив:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(11);
            System.out.print(array2[i] + " ");
        }

        // Определяем минимальный и максимальный элемент для первого массива
        int array1Max = array1[0];
        int array1Min = array1[0];
        // Определяем минимальный и максимальный элемент для первого массива
        int array2Max = array2[0];
        int array2Min = array2[0];

        // Ищем минимальный и максимальный элемент в первом массиве
        for (int i = 0; i < array1.length; i++) {
            // Поиск максимального
            if (array1[i] > array1Max) {
                array1Max = array1[i];
            }

            // Поиск минимального
            if (array1[i] < array1Min) {
                array1Min = array1[i];
            }
        }

        // Ищем минимальный и максимальный элемент во втором массиве
        for (int i = 0; i < array2.length; i++) {
            // Поиск максимального
            if (array2[i] > array2Max) {
                array2Max = array2[i];
            }

            // Поиск минимального
            if (array2[i] < array2Min) {
                array2Min = array2[i];
            }
        }

        System.out.println("\nМинимальный в первом массиве  - " + array1Min);
        System.out.println("Максимальный в первом массиве - " + array1Max);
        System.out.println("Минимальный во втором массиве - " + array2Min);
        System.out.println("Максимальный в втором массиве - " + array2Max);
    }

    public static void example1000() {
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        Random random = new Random();

        System.out.println("Первый массив:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(11);
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nВторой массив:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(11);
            System.out.print(array2[i] + " ");
        }

        // Определяем минимальный и максимальный элемент для первого массива
        int[] array1Max = new int[3];
        int[] array1Min = new int[3];
        // Определяем минимальный и максимальный элемент для первого массива
        int[] array2Max = new int[3];
        int[] array2Min = new int[3];

        array1Max[0] = array1[0];
        array1Min[0] = array1[0];
        array1Max[1] = array1[1];
        array1Min[1] = array1[1];
        array1Max[2] = array1[2];
        array1Min[2] = array1[2];

        array2Min[0] = array1[0];
        array2Max[0] = array1[0];
        array2Min[1] = array1[1];
        array2Max[1] = array1[1];
        array2Min[2] = array1[2];
        array2Max[2] = array1[2];

        // int indexator = 0;     // 0...3

        for (int i = 0; i < 3; i++) {
            // Ищем минимальный и максимальный элемент в первом массиве
            for (int j = 0; j < array1.length; j++) {
                if (i == 0) {
                    // Поиск максимального
                    if (array1[j] > array1Max[0]) {
                        array1Max[0] = array1[j];
                    }

                    // Поиск минимального
                    if (array1[j] < array1Min[0]) {
                        array1Min[0] = array1[j];
                    }
                } else if (i == 1) {
                    // Поиск максимального
                    if (array1[j] > array1Max[1]
                            && array1[j] != array1Max[0]) {
                        array1Max[1] = array1[j];
                    }

                    // Поиск минимального
                    if (array1[j] < array1Min[1]
                            && array1[j] != array1Min[0]) {
                        array1Min[1] = array1[j];
                    }
                } else if (i == 2) {
                    // Поиск максимального
                    if (array1[j] > array1Max[2]
                            && array1[j] != array1Max[0]
                            && array1[j] != array1Max[1]) {
                        array1Max[2] = array1[j];
                    }

                    // Поиск минимального
                    if (array1[j] < array1Min[2]
                            && array1[j] != array1Min[0]
                            && array1[j] != array1Min[1]) {
                        array1Min[2] = array1[j];
                    }
                }
            }
        }

        // Функция Arrays.toString(сюда передать массив) - возвращает строку с элементами массива
        System.out.println("\nМаксимальные в первом массиве:");
        System.out.println(Arrays.toString(array1Max));
        System.out.println("Минимальные в первом массиве");
        System.out.println(Arrays.toString(array1Min));

        // Переписать для второго массива
    }

    public static void example4_6() {
        int array[] = new int[20];

        Random random = new Random();

        // Заполняем случайными значениями
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        // Выводим массив на экран
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int maxElement = array[0];
        int minElement = array[0];

        int minElementIndex = 0;
        int maxElementIndex = 0;

        // Нашли максимальный и минальный
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxElement) {
                maxElement = array[i];
                maxElementIndex = i;
            }

            if (array[i] <= maxElement) {
                minElement = array[i];
                minElementIndex = i;
            }
        }

        // Заполняем макс и мин нулями
        array[maxElementIndex] = 0;
        array[minElementIndex] = 0;
    }

    public static void example4_7() {
        int array[] = new int[20];

        Random random = new Random();

        // Заполняем случайными значениями
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        // Выводим массив на экран
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;

                if (array[j] == array[i])
                    array[j] = 0;
            }
        }

        // Выводим массив на экран
        System.out.println("\nПреобразованный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void example4_8() {
        int[] array = new int[20];

        Random random = new Random();

        // Заполняем массив случайными значениями
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }

        // Выводим массив на экран
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Задание 1
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }

        // Задание 2
        int n = 40;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                array[i] = 0;
            }
        }

        // Задание 3
        int n1 = 10;
        int n2 = 15;

        for (int i = n1; i <= n2; i++) {
            array[i] = 0;
        }

        // Выводим массив на экран
        System.out.println("\nПреобразованный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void example4_9() {
        int[] array = new int[20];

        Random random = new Random();

        // Заполняем массив случайными значениями
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }

        // Выводим массив на экран
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Задание 1
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && i % 2 == 1) {
                array[i] = 0;
            }
        }

        // Задание 2
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0 || array[i] % 5 == 0) {
                array[i] = 0;
            }
        }

        // Выводим массив на экран
        System.out.println("\nПреобразованный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
