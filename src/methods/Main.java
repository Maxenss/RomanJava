package methods;

public class Main {
    public static void main(String[] args) {
        int sumOfResult = sum (5, 10);

        System.out.println(sumOfResult);
    }

    // Функция(методы в ООП) - это некоторый модуль с набором команд, который
    // принмает какие-то входные данные, и возвращает результат работы над этими данными
    // Примеры: фукнция синуса, косинуса и т.д.

    // Функция для вывода на экран числа
    public static int sum (int a, int b){
        int result = a + b;

        return result;
    }
}
