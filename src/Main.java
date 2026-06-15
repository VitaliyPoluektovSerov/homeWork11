//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.time.LocalDate;

public class Main {

    public static void printVisocosYear(int year) {
        if (year <= 1584) {
            System.out.println(year + " год должен быть больше, чем 1584");
        } else {
            boolean isVisokos = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isVisokos) {
                System.out.println(year + " год - високосный год");
            } else {
                System.out.println(year + " год - невисокосный год");
            }
        }
    }

    public static void printInstallVersionDevice(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String message = "";
        switch (clientOS) {
            case 0:
                message = "iOS по ссылке";
                break;
            case 1:
                message = "Android по ссылке";
                break;
        }
        if (clientDeviceYear == currentYear) {
            message = "Установите обычную версию приложения для " + message;
        } else {
            message = "Установите облегченную версию приложения для " + message;
        }
        System.out.println(message);
    }

    public static int deliveryDays(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
            return deliveryDays;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
            return deliveryDays;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
            return deliveryDays;
        }
        return deliveryDays;
    }

    public static void main(String[] args) {
        int year = 2021;
        printVisocosYear(year);
        int clientOS = 0;
        year = 2025;
        printInstallVersionDevice(clientOS, year);
        int deliveryDistance = 95;
        int deliveryDays = deliveryDays(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Нет доставки в ваш район.");
        } else {
            System.out.println("Количество дней доставки - " + deliveryDays);
        }
    }
}
