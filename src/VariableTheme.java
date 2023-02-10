public class VariableTheme {
    public static void main(String[] args) {

        System.out.println("1. Создание переменных и вывод их значений на консоль");
        //оперативная память
        byte ram = 124;
        System.out.println("ram = " + ram);
        //SSD диск
        short ssd = 30000;
        System.out.println("ssd = " + ssd);
        //жесткий диск
        int hdd = 10000000;
        System.out.println("hdd = " + hdd);
        //дистанция какая-либо
        long distance = 1000000000L;
        System.out.println("distance = " + distance);
        //версия чего-либо
        float version = 3.4f;
        System.out.println("version = " + version);
        //размер чего-либо
        double size = 170;
        System.out.println("size = " + size);
        //меридиан
        char meridian = 0;
        System.out.println("meridian = " + meridian);
        boolean gamer = false;
        System.out.println("gamer = " + gamer);

        System.out.println("2. Расчет стоимости товара со скидкой");
        int productX = 100;
        int productY = 200;
        int discount = (productX + productY) / 100 * 11;
        int discountedProduct = (productX + productY) - discount;
        int sumProducts = productX + productY;
        System.out.println("Сумма товаров без скидки = " + sumProducts);
        System.out.println("Сумма скидки = " + discount);
        System.out.println("Общая стоимость товара со скидкой = " + discountedProduct);

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        System.out.println("Первоначально значение byte = " + maxByte);
        System.out.println("Значение после инкремента byte = " + ++maxByte);
        System.out.println("Значение после декремента byte = " + --maxByte);
        short maxShort = 32767;
        System.out.println("Первоначально значение short = " + maxShort);
        System.out.println("Значение после инкремента short = " + ++maxShort);
        System.out.println("Значение после декремента short = " + --maxShort);
        int maxInt = 2147483647;
        System.out.println("Первоначально значение int = " + maxInt);
        System.out.println("Значение после инкремента int = " + ++maxInt);
        System.out.println("Значение после декремента int = " + --maxInt);
        long maxLong = 9223372036854775807L;
        System.out.println("Первоначально значение long = " + maxLong);
        System.out.println("Значение после инкремента long = " + ++maxLong);
        System.out.println("Значение после декремента long = " + --maxLong);

        System.out.println("5. Перестановка значений переменных");
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber;
        System.out.println("Исходное значение first = " + firstNumber);
        System.out.println("Исходное значение second = " + secondNumber);
        thirdNumber = firstNumber;
        firstNumber = secondNumber;
        secondNumber = thirdNumber;
        System.out.println("С помощью третьей переменной first = " + firstNumber);
        System.out.println("С помощью третьей переменной second = " + secondNumber);
        firstNumber = 1;
        secondNumber = 2;
        secondNumber = secondNumber - firstNumber;
        firstNumber = secondNumber + firstNumber;
        System.out.println("С помощью арифметических операций  first = " + firstNumber);
        System.out.println("С помощью арифметических операций  second = " + secondNumber);
        firstNumber = 1;
        secondNumber = 2;
        thirdNumber = - firstNumber & secondNumber;
        int fourthNumber = ~ - secondNumber;
        System.out.println("С помощью побитовой операции  first = " + thirdNumber);
        System.out.println("С помощью побитовой операции  second = " + fourthNumber);

        System.out.println("6. Вывод символов и их кодов");
        char firstNumber1 = 35;
        char secondNumber1 = 38;
        char thirdNumber1 = 64;
        char fourthNumber1 = 94;
        char fifthNumber = 95;
        System.out.println("Код символа: " + firstNumber1);
        System.out.println("Символ: " + (int) firstNumber1);
        System.out.println("Код символа: " + secondNumber1);
        System.out.println("Символ: " + (int) secondNumber1);
        System.out.println("Код символа: " + thirdNumber1);
        System.out.println("Символ: " + (int) thirdNumber1);
        System.out.println("Код символа: " + fourthNumber1);
        System.out.println("Символ: " + (int) fourthNumber1);
        System.out.println("Код символа: " + fifthNumber);
        System.out.println("Символ: " + (int) fifthNumber);

        System.out.println("7. Произведение и сумма цифр числа");
        int number = 345;
        int sum = 0;
        double currentDigit;
        int multiplication = 1;
        currentDigit = number % 10;
        sum += currentDigit;
        number /= 10;
        currentDigit = number % 10;
        sum += currentDigit;
        number /= 10;
        currentDigit = number % 10;
        sum += currentDigit;
        System.out.println("Сумма цифр числа " + sum);
        number = 345;
        currentDigit = number / 69;
        multiplication *= currentDigit;
        number /= 10;
        currentDigit = number / 8.5;
        multiplication *= currentDigit;
        number /= 10;
        multiplication *= number;
        System.out.println("Произведение цифр числа " + multiplication);
    }
}

