public class Main {
    public static String calculateLeapYear(int i) {
        i = 2016;
        if (i % 4 == 0 && 1 % 100 != 0 || i % 400 == 0) {
            return i + " год - високосный";
        } else {
            return i + " год - невисокосный";
        }
    }

    public static String calculateOsClient(int clientOS, int clientDeviceYear) {
        clientOS = 0;
        clientDeviceYear = 2015;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            return (" Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            return (" Установите обычную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            return (" Установите облегченную версию приложения для Android по ссылке ");
        } else {
            return (" Установите обычную версию приложения для Android по ссылке ");
        }
    }

    public static String calculateDeliveryDays(int diliveryDays) {
        int deliveryDays = 1;
        int deliveryDistance = 40;
        if (deliveryDistance <= 20) {
            return ("потребуется " + deliveryDays + " день на доставку ");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            return ("Потребуется " + (deliveryDays + 1) + " дня на доставку ");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            return ("Потребуется " + (deliveryDays + 2) + " дня на доставку ");
        } else {
            return (" Доставки нет");
        }
    }


    public static void main(String[] args) {
        System.out.println("Задача №1");
        int year = 2016;
        String result = calculateLeapYear(year);
        System.out.println(result);
        System.out.println();
        System.out.println("Задача №2");
        int clientDeviceYear = 2015;
        int clientOS = 0;
        String result2 = calculateOsClient(clientOS, clientDeviceYear);
        System.out.println(result2);
        System.out.println();
        System.out.println("Задача №3");
        int deliveryDistance = 40;
        String result3 = calculateDeliveryDays(deliveryDistance);
        System.out.println(result3);
    }
}

