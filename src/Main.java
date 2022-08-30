public class Main {
    public static void main(String[] args) {
        printLeapYear(2004);
        printVersionMessage(1, 2014);
        printDeliveryDays(200);

    }

    // 1 Задание
    private static void printLeapYear(int year) {
        if (year % 400 == 0 && year % 100 != 0 || year % 4 == 0) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " не високосный");
        }
    }

    // 2 Задание
    private static void printVersionMessage(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear <= 2015) {
            System.out.print("Установите облегчённую версию приложения ");
        } else if (clientDeviceYear > 2015) {
            System.out.print("Установите версию приложения ");
        }
        if (clientOS == 1) {
            System.out.println("для Android по ссылке");
        } else {
            System.out.println("для iOS по ссылке");
        }
    }

    // 3 задание
    private static void printDeliveryDays(int deliveryDistance) {
        int interval = 40;
        int startInterval = 20;
        int days = 1;
        if (deliveryDistance <= 20) {
            days = 1;
        } else {
            days = days + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        System.out.println("Потребуется " + days + " дней");
    }
}