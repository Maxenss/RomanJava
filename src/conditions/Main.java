package conditions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        example7();
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
}
