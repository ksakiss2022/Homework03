public class Main {
    public static void main(String[] args)
    //Задача 1
    {
        int clienOSIOS = 1;
        if (clienOSIOS == 0) {
            System.out.println(" Задача 1: Установите версию приложения для IOS по ссылке");
        }
        if (clienOSIOS == 1) {
            System.out.println(" Задача 1:  Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        int clientDeviceYear = 2000;
        int device = 0;
        if (clientDeviceYear < 2015 && device == 0) {
            System.out.println(" Задача 2: Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientDeviceYear < 2015 && device == 1) {
            System.out.println(" Задача 2: Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && device == 0) {
            System.out.println(" Задача 2: Установите версию приложения для IOS по ссылке");
        } else if (clientDeviceYear >= 2015 && device == 1) {
            System.out.println(" Задача 2: Установите версию приложения для Android по ссылке");
        }

        // Задача 3
        int year = 2020;
        boolean leatyear = (year % 4 == 0  && year % 100 != 0);
        if (leatyear) {
            System.out.println(" Задача 3: Год является високосным");
        } else if (year % 4 == 0  && year % 100 == 0 && year % 400 == 0) {
            System.out.println(" Задача 3: Год является високосным");
        }
        else
        {
            System.out.println(" Задача 3: Год не является високосным");
        }

        // Задание 4

        int deliveryDistance = 95;
        boolean distance = (deliveryDistance <= 20);
        if (distance) {
            System.out.println(" Задача 4: Доставка займет 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println(" Задача 4: Доставка займет 2 дня");
        }
        else
        {
            System.out.println(" Задача 4: Доставка займет 3 дня");
        }
        // Задание 5

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println( "Задание 5: Январь- зимний месяц.");
                break;
            case 2:
                System.out.println( "Задание 5: Февраль- зимний месяц.");
                break;
            case 3:
                System.out.println( "Задание 5: Март- весенний месяц.");
                break;
            case 4:
                System.out.println( "Задание 5: Апрель- весенний месяц.");
                break;
            case 5:
                System.out.println( "Задание 5: май- весенний месяц.");
                break;
            case 6:
                System.out.println( "Задание 5: июнь- летний месяц.");
                break;
            case 7:
                System.out.println( "Задание 5: июль- летний месяц.");
                break;
            case 8:
                System.out.println( "Задание 5: август- летний месяц.");
                break;
            case 9:
                System.out.println( "Задание 5: сентябрь- осенний месяц.");
                break;
            case 10:
                System.out.println( "Задание 5: октябрь- осенний месяц.");
                break;
            case 11:
                System.out.println( "Задание 5: ноябрь- осенний месяц.");
                break;
            case 12:
                System.out.println( "Задание 5: декабрь- зимний месяц.");
                break;
            default:
                System.out.println( "Задание 5: Такого месяца не существует");


        }
    }
}