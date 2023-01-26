

public class VariablesTheme {

    public static void main(String[] args) {

        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte RAM = 124;//оперативная память (значения для переменных я брал, такие которые подходят под определенный тип данных)
        System.out.println("RAM = " + RAM);
        short ssd = 30000;//SSD диск(понятное дело, что таких огромных значений быть не может. Брал исключительно, чтобы показать отличия одного типа от другого)
        System.out.println("ssd = " + ssd);
        int hdd = 10000000;//жесткий диск
        System.out.println("hdd = " + hdd);
        long distance = 1000000000;//дистанция какая-либо// я больше не придумал какие данные по пк можно взять
        System.out.println("distance = " + distance);
        float version = 3.4f;//версия чего-либо
        System.out.println("version = " + version);
        double size = 170;//размер чего-либо
        System.out.println("size = " + size);
        char meridian = 0;//меридиан
        System.out.println("meridian = " + meridian);
        boolean gamer = false;//не геймер//какую же ересь я пишу
        System.out.println("gamer = " + gamer);

        System.out.println("2. Расчет стоимости товара со скидкой");
        int productx = 100;
        int producty = 200;
        int discount = (productx+producty)/100*11;
        int discountedproduct = (productx+producty)-discount;//знаю что скобки не обязательны
        int sumproducts = productx+producty;
        System.out.println("Сумма товаров без скидки = " + sumproducts);
        System.out.println("Сумма скидки = " + discount);
        System.out.println("Общая стоимость товара со скидкой = " + discountedproduct);

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte maxbyte = 127;
        System.out.println("Первоначально значение byte = " + maxbyte);
        System.out.println("Значение после инкремента byte = " + maxbyte++);
        System.out.println("Значение после декремента byte = " + maxbyte--);
        short maxshort = 32767;
        System.out.println("Первоначально значение short = " + maxshort);
        System.out.println("Значение после инкремента short = " + maxshort++);
        System.out.println("Значение после декремента short = " + maxshort--);
        int maxint = 2147483647;
        System.out.println("Первоначально значение int = " + maxint);
        System.out.println("Значение после инкремента int = " + maxint++);
        System.out.println("Значение после декремента int = " + maxint--);
        long maxlong = 9223372036854775807L;
        System.out.println("Первоначально значение long = " + maxlong);
        System.out.println("Значение после инкремента long = " + maxlong++);
        System.out.println("Значение после декремента long = " + maxlong--);

        System.out.println("5. Перестановка значений переменных");
        int first = 1;
        int second = 2;
        int third;
        System.out.println("Исходное значение first = " + first);
        System.out.println("Исходное значение second = " + second);
        third=first;
        first=second;
        second=third;
        System.out.println("С помощью третьей переменной first = " + first);
        System.out.println("С помощью третьей переменной second = " + second);
        int first2 = 1;
        int second2 = 2;
        second2 = second2 - first2;
        first2 = second2 + first2;
        System.out.println("С помощью арифметических операций  first2 = " + first2);
        System.out.println("С помощью арифметических операций  second2 = " + second2);
        int first3 = 1;
        int second3 = 2;
        int third2 = -first3 & second3;
        int fourth2 = ~-second3;
        System.out.println("С помощью побитовой операции  first3 = " + third2);
        System.out.println("С помощью побитовой операции  second3 = " + fourth2);

        System.out.println("6.Вывод символов и их кодов");
        int first1 = 35;
        int second1 = 38;
        int third1 = 64;
        int fourth = 94;
        int fifth = 95;
        System.out.println("Код символа: " + first1);
        System.out.println("Символ: " + (char) first1);
        System.out.println("Код символа: " + second1);
        System.out.println("Символ: " + (char) second1);
        System.out.println("Код символа: " + third1);
        System.out.println("Символ: " + (char) third1);
        System.out.println("Код символа: " + fourth);
        System.out.println("Символ: " + (char) fourth);
        System.out.println("Код символа: " + fifth);
        System.out.println("Символ: " + (char) fifth);

        System.out.println("7. Произведение и сумма цифр числа");
        int number = 345;
        int sum = 0;
        int currentDigit;
        currentDigit = number % 10;
        sum += currentDigit;
        number /= 10;
        currentDigit = number % 10;
        sum += currentDigit;
        number /= 10;
        currentDigit = number % 10;
        sum += currentDigit;
        System.out.println("Сумма цифр числа " + sum);
        double firstNum = 345/100.0;
        double secondNum = 345/86.25;
        double thirdNum = 345/69.0;
        double proizvedenie = firstNum*secondNum*thirdNum;
        System.out.println("Произведение цифр числа " + proizvedenie);
    }
}

