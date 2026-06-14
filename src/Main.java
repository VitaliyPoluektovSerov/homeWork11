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
        if (clientDeviceYear < currentYear && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear >= currentYear && clientOS == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear < currentYear && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >= currentYear && clientOS == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }

    public static int deliveryDays (int deliveryDistance){
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
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
        if (deliveryDistance <= 100) {
            System.out.println("Количество дней доставки - " + deliveryDays(deliveryDistance));
        } else {
            System.out.println("Нет доставки в ваш район.");
        }
    }
}
