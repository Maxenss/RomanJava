import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // Cttl + Alt + L - форматирование кода
    // sout + Tab - System.out,println
    // Ctrl + D - копирование и вставка выбранной строки

    public static void main(String[] args) {
        // Вызов функции main
        // example1();
        // example5();
        // example13();
        // example16();
        // example17();
        // example18();
        // example19();
        // example20();
        //example21();
        // example22();
        // example23();
        // arrayExample();
        // arrayGetMax();
        // arrayGetMin();
        // classWorkExample1();
        // example999();
        example1000();
    }

    public static void lecture() {
        // Примитивные типа данных
        // Целочисленные типы данных
        byte a = 10; // 8-bit, -128 - 127, используется в массивах данных
        short b = 20; // 16-bit, -32768 - +32767, почти не используется
        int c = 30;   // 32 bit, -2 000 000 - +2 000 000, используется постоянно
        long d = 40L;  // 64 bit, - (2^32) - + (2^32 - 1),
        // используется в том случае, если нужно хранить ОЧЕНЬ БОЛЬШОЕ число

        // 1970.01.01 00:00 - UNIX TimeStamp - int, long

        // Вещественный тип данных, дробные значения
        float e = 2.02f;  // 32-bit, не используется, кроме старых библиотек
        double g = 2.021; // 64-bit, используется, почти везде

        // Логический тип данных
        boolean flag = true; // 1 bit, true, false, используется очень-очень сильно

        // Символьные типы данных
        char ch = 'z';       // 16 bit, 0 - 65655, кодировочная таблица - UTF-16

        // Кодировочные таблицы (см. Википедию)
        // В общем случае, это таблицы, в которых в соотв. с численным значением
        //    выставляется какой-либо символ


        // Сложные типы данных. Объекты
        // Строки
        String str = "Hello World"; // Представляет из себя объект, состоящий из нескольких символов

        // Объект для ввода данных
        Scanner scanner = new Scanner(System.in);

        // и другие объекты...
    }

    // Функция, вызываем в функции main
    // Объявление и инициализация переменных
    public static void example1() {
        // Работа с переменными
        int a;      // объевление переменной, но не присвоили ей значений
        a = 20;     // инициализация переменной, присвоили ей значение
        int b = 30; // объявили и проиниц.

        // При создании новой переменной - присваивать ей какое-то значение
        // При созданни новой переменной, создавать её на новой строке

        int opr1 = 10, opr2 = 20, opr3 = 30; // делать не надо

        // Так делать надо
        int Opr1 = 10;
        int Opr2 = 20;
        int Opr3 = 30;

        // Приравнять две переменных
        int g = 20;
        int z = g;
        int l = 10;

        // Присваиваешь нескольким переменным одно значение
        g = l = a = 10;

    }

    // Арифметические операции
    public static void example2() {
        int a = 20;
        int b = 30;
        int res;

        res = a + b;  // 50
        res = a - b;  // -10
        res = a * b;  // 600
        // При делении целочисленного значения на целочисленное - дробная часть отбрасывается
        res = a / b;  // 0.66 = 0

        double c = 20;
        double d = 30;
        double res2;

        // Дробная часть не отбр, при делении вещественных типов
        res2 = c / d; // 0.666666666667

        int opr1 = 20;
        int opr2 = 30;
        double res3;

        res2 = ((double) opr1) / opr2;   // 0.66666667
        // ((double) opr1) - в данном случает, происходит приведение типа int в тип double
    }

    // Ввод с клавиатуры
    public static void example3() {
        // 1. Создать объект класса Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Создаём переменную
        int a;

        // 3. Считываем с консоли ввод
        a = scanner.nextInt();

        // Выводим считанное значение на экран
        System.out.println(a);

        double b = scanner.nextDouble();
        char ch = scanner.next().charAt(0);
        String str = scanner.next();
    }

    // Вывод на экран
    public static void example4() {
        // Вывод на экран с переводом каретки на новую строку
        System.out.println("Hello World");

        // Вывод на экран без перевода каретки на новую строку
        System.out.print("Hello World\n");

        // Спец. символы в строке:
        // \n - перевод на новую строку
        // \t - табуляция

        System.out.println("Max\nRoma");
    }

    // Пример 1
    public static void example5() {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.print("Введите a: ");
        a = scanner.nextInt();

        System.out.print("Введите b: ");
        b = scanner.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }

    // Ошибка при делении на ноль
    public static void example6() {
        int a = 20;
        int b = 0;

        int res = a / b;    // тут будет ошибка

        double c = 20;
        double d = 0;

        double res2 = c / d;// тут ошибки не будет, а значение будет INF

        c = -20;
        res2 = c / d;       // -INF
    }

    // Ветвления. if-else
    public static void example7() {
        // Самый простой тип ветвления
        // это оператор if-else

        int a = 20;
        int b = 30;

        // ЕСЛИ:(ВЫполняется условие), ТО:{}
        if (b > a) {
            System.out.println("b > a");
        }
        // ИНАЧЕ:
        else {
            System.out.println("b <= a");
        }

        // Оператор сравнения чисел:
        // >, >=, <, <=, != - не равно, == - знак равенства
    }

    // Ветвления if
    public static void example8() {
        int a = 20;
        int b = 30;

        // ТОлько блок if
        if (a > b) {
            System.out.println("a > b");
        }
    }

    // Ветвление if-else if-else
    public static void example9() {
        int a = 20;
        int b = 30;

        if (a > b) {
            System.out.println("a > b");
        } else if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println("a < b");
        }

        // ВАЖНО:
        // блок if = может быть только один в ветвлении
        // блоков else if - может сколько-угодно, но else if - не может быть без if
        // блок else - может быть только один в ветвлении, и обязательно должен быть блок if
    }

    // Ветвление if-else if
    public static void example10() {
        int a = 20;
        int b = 30;

        if (a < b) {
            System.out.println("a > b");
        } else if (a == b) {
            System.out.println("a == b");
        }
    }

    // Вложенные ветвления
    public static void example11() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        if (b > a) {
            System.out.println("a > b");
            if (c > d) {
                System.out.println("c > d");
            } else {
                System.out.println("c <=d");
            }
        }

        /// ВАЖНО: уровень вложенности, может быть бесконечным
    }

    // Оператор switch
    public static void example12() {
        int a = 20;
        int b = 30;

        // Опаретор множественного выбора
        //   a - перменная-селектор
        switch (a) {
            case 10: {
                System.out.println("10");
                break;
            }
            case 20: {
                System.out.println("20");
                break;
            }
        }
    }

    public static void constantExample() {
        int a = 20;
        a = 30;
        a = 40;

        final int b = 30;
        // b = 40; - будет ошибка, так как b - константа
    }

    // Пример с switch
    public static void example13() {
        int id = 0;

        // При указании
        final int BUTTON_PLUS = 1;
        final int BUTTON_MINUS = 2;
        final int BUTTON_MULT = 3;
        final int BUTTON_DIV = 4;
        final int BUTTON_CLEAR = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите id кнопки: ");
        id = scanner.nextInt();

        switch (id) {
            case BUTTON_PLUS:
                System.out.println("Нажали на сумму");
                break;
            case BUTTON_MINUS:
                System.out.println("Нажали на разницу");
                break;
            // ---
            default:
                System.out.println("Вы ввели неправильное значение");
                break;
        }
    }

    // Пример с тернарным оператором
    public static void example14() {
        int a = 100;
        int b = 200;
        int res = 0; // записать в res большее из значений

        // Пример решения с помощью if-else
        if (a > b) {
            res = a;
        } else {
            res = b;
        }

        // Пример решения с помошью тернанрного оператора
        res = a > b ? a : b;
        // [условие]? [если true]:[если false]
    }

    // Логика
    public static void example15() {
        // Основные логические операции:

        //  1. "И" (&&) - значение логической функции истинно тогда , когда истины все составляющие выржени
        //  0 и 0 = 0
        //  1 и 0 = 0
        //  0 и 1 = 0
        //  1 и 1 = 1
        // Арифметическсий аналог, то это операция - умножения
        // 0*0 = 0
        // 1*0 = 0
        // 0*1 = 0
        // 1*1 = 1

        // 2. "ИЛИ" (||) - знач. функ. истинно тогда, когда истинно хоть одно из условий.
        // 0 || 0 = 0
        // 1 || 0 = 1
        // 0 || 1 = 1
        // 1 || 1 = 1
        // Арифметический аналог, операция - сложения
        // 0 + 0 = 0
        // 1 + 0 = 1
        // 0 + 1 = 1
        // 1 + 1 = 2 (1)

        // 3. "НЕ" (!) - отрицание.
        // !1 = 0
        // !0 = 1
        // !true = false
        // !false = true

        int a = 20;
        int b = 40;
        int c = 50;

        System.out.println("Пример для фунции И");
        if (a < b && c > b) { // 1 * 1 = 1
            System.out.println("a < b && c > b");
        }

        System.out.println("Пример для функции ИЛИ");
        if (a > b || c > b) { // 0 + 1 = 1
            System.out.println("a > b || c > b");
        }
    }

    // Операция остаток от деления
    public static void example16() {
        int a = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        a = scanner.nextInt();

        int b = a % 2;    // % - остаток от деления

        if (b == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }
    }

    // Пример с разделением числа на цифры
    public static void example17() {
        int a = 789;

        int a1; // сотые
        int a2; // десятиые
        int a3; // единицы

        a1 = a / 100;   // 5
        a2 = (a - (a1 * 100)) / 10; // (543 - (5 * 100)) / 10 = (543 - 500)/10 = 43/10 = 4.3 = 4
        a3 = a - (a1 * 100) - (a2 * 10); // получили единицы

        if (a1 > a3) {
            System.out.println("Первая цифра больше чем последняя");
        } else if (a1 == a3) {
            System.out.println("Первая и последняя равны");
        } else {
            System.out.println("Последняя цифра больше первой");
        }

        if (a1 > a2) {
            System.out.println("Первая цифра больше чем вторая");
        } else if (a1 == a2) {
            System.out.println("Первая и вторая цифры равны");
        } else {
            System.out.println("Вторая больше первой");
        }

        if (a2 > a3) {
            System.out.println("Вторая цифра больше чем последняя");
        } else if (a2 == a3) {
            System.out.println("Вторая и последняя цифры равны");
        } else {
            System.out.println("Последняя больше второй");
        }
    }

    public static void aripmeticAdditional() {
        // Инкременет и декремент

        int a = 20;
        ++a; // увеличение значения переменной на 1, инкремент префиксный
        --a; // уменьшение значения переменной на 1, декремент префексный

        // Постфиксный - сначала переменная используется, потом изменяется
        // Префиксный - сначала переменная изменяется потом используется

        // Постфиксный инкремент
        a = 20;
        int sum = a++ + 20; // 20 + 20 = 40
        sum = a + 20;       // 21 + 20 = 41

        // Префиксный инкремен
        a = 20;
        sum = ++a + 20;    // 21 + 20 = 21
    }

    // Разновидности циклов
    public static void example18() {
        // while - самый простой, цикл с предусловием
        // do-while - самый простой, цикс с постусловием, тело цикла выполнится ОДИН раз, независимо от условия
        // for - средний
        // foreach (позже)

        // Цикл while

        int a = 20;
        int b = 30;

        // while(условие выполнения цикла) {тело цикла}

        System.out.println("Цикл while, пример");
        while (a <= b) {
            System.out.println("a = " + a);
            ++a;  // увеличиваем значение а на 1
        }

        int c = 20;
        int d = 30;

        System.out.println("Цикл do-while, пример");

        // do {тело цикла} while(условие выполнение цикла)

        do {
            System.out.println("c = " + c);
        } while (c > d);
    }

    // Таблица умножения
    public static void example19() {
        // Вывести таблицу умножения на 5

        int opr1 = 5;
        int max = 10;   // до какого числа, считать таблицу
        int counter = 0;

        while (counter <= max) {
            int res = opr1 * counter;
            System.out.println(opr1 + " * " + counter + " = " + res);

            ++counter; // увелчиваем counter на 1
        }
    }

    // Вечный цикл
    public static void example20() {
        Scanner scanner = new Scanner(System.in);
        String str = "";

        // Сравнение строк делается ТОЛЬКО через метод equals
        while (!str.equals("Esc")) {
            System.out.println("Введите строку, для подсчета кол-ва символов в ней (Esc - для выхода):");
            str = scanner.next(); // считываем строку с консоли

            int charsCount = str.length();  // str.lenght() - возвр. количество символов в строке

            System.out.println("Символов в строке: " + charsCount);
        }
    }

    // Вложенные циклы
    // Уровень вложенности, может быть любым
    public static void example21() {
        // Нарисовать квадрат размерность n
        // n вводится с клавиатуры

        Scanner scanner = new Scanner(System.in);
        int n = 0; // 5

        System.out.println("Введите n: ");
        n = scanner.nextInt();

        int i = 0; // счетчик для вернхнего цикла
        int j = 0; // счетчик для вложенного цикла

        while (i < n) {
            while (j < n) {
                System.out.print("*");
                ++j;
            }

            System.out.println();
            ++i;
            j = 0;
        }
    }

    public static void example22() {
        double a = 3;
        double b = -5;
        double x = 1;
        double max = 5;
        double step = 0.5;

        double y = 0;

        while (x <= max) {
            y = a * x * x + b;
            System.out.println("x = " + x + "; y = " + y);
            x = x + step;
        }
    }

    public static void example23() {
        double a = 0;
        double b = 10;
        double step = 1;
        double x = a;

        double res1;
        double res2;
        double res3;

        while (x <= b) {
            res1 = x - Math.sin(x);
            res2 = Math.sin(x) * Math.sin(x);
            res3 = 2 * Math.cos(x) - 1;

            System.out.println("x = " + x);
            System.out.println("x - Math.sin(x) = " + res1);
            System.out.println("Math.sin(x) * Math.sin(x) = " + res2);
            System.out.println("2 * Math.cos(x) - 1 = " + res3);

            x = x + step;
        }
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
}
