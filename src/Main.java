import java.util.Scanner;

public class Main {
    // Cttl + Alt + L - форматирование кода
    // sout + Tab - System.out,println
    // Ctrl + D - копирование и вставка выбранной строки

    public static void main(String[] args) {
        // Вызов функции main
        // example1();
        example5();
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
}
