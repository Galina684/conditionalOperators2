
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOs = 0;
        int iOs = 0;
        int android = 1;
        if (clientOs == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");
        int checkYear = 2015;
        int clientYear = 2010;
        if (clientOs == iOs && clientYear >= checkYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == iOs && clientYear < checkYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOs == android && clientYear >= checkYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == android && clientYear < checkYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("Задача 3");
        int leapYear = 2021;
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Год не високосный");
        }

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int time = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки " + time + " день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Срок доставки " + (time + 1) + " дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Срок доставки " + (time + 2) + " дня");
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого времени года не существует");
        }
    }
}
