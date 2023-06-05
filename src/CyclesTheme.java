public class CyclesTheme {

    public static void main(String[] args) {

        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        int num = -10;
        int sumEven = 0;
        int sumNotEven = 0;
        do {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumNotEven += num;
            }
            num++;
        } while (num < 22);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven + ", а нечетных " + sumNotEven);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");

        int firstNum = 10;
        int secondNum = 5;
        int thirdNum = -1;
        int max;
        int min;

        if (firstNum > secondNum && firstNum > thirdNum && secondNum > thirdNum) {
            max = firstNum;
            min = thirdNum + 1;
            for (max = firstNum - 1; max >= min; max--) {
                System.out.print(max + " ");
            }
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        num = 1234;
        int sum = 0;
        int digit;

        while (num > 0) {
            digit = num % 10;
            System.out.println("Исходное число в обратном порядке " + digit + " ");
            num /= 10;
            sum += digit;
        }
        System.out.println("Сумма цифр числа = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        secondNum = 24;

        for (firstNum = 1; firstNum <= secondNum - 1; firstNum++) {
            System.out.printf("%2d%s", firstNum, firstNum % 5 == 0 ? "\n" : " ");
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        num = 3242592;

        int num1 = 3242592;
        int two = 0;
        while (num1 > 0) {
            if (num1 % 10 == 2) {
                two += 1;
            }
            num1 /= 10;
        }
        if (two % 10 == 2) {
            System.out.println("число " + num + " содержит " + two + " четное количество двоек");
        } else {
            System.out.println("число " + num + " содержит " + two + " не четное количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли");

        int width = 5;
        int height = 10;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        width = 5;
        while (width >= 1) {

            int length = 1;

            while (length <= width) {
                System.out.print("#");
                length++;
            }
            System.out.println("");
            width--;
        }

        String sign = "$";

        int count = 0;

        do {
            if (count == 0) {
                count++;
                System.out.println(sign);
            }
            if (count == 1) {
                count++;
                System.out.println(sign + sign);
            }
            if (count == 2) {
                count++;
                System.out.println(sign + sign + sign);
            }
            if (count == 3) {
                count++;
                System.out.println(sign + sign);
            }
            if (count == 4) {
                count++;
                System.out.println(sign);
            }
        } while (count < 5);

        System.out.println("\n7. Отображение ASCII-символов");

        for (int i = 0; i < 48; i++) {

            if (i % 2 != 0 && i <= 9) {
                System.out.println("  " + i + " " + (char) i);
            }
            if (i % 2 != 0 && (i > 9 && i <= 49)) {
                System.out.println(" " + i + " " + (char) i);
            }
        }
        for (int i = 97; i < 123; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " " + (char) i);
            }
            if (i <= 97) {
                System.out.print(" ");

            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        num = 1234321;

        String number = String.valueOf(num);

        int pointerStart = 0;
        int pointerEnd = number.length() - 1;
        boolean isPaleondrome = true;
        while (pointerStart <= pointerEnd) {

            if (number.charAt(pointerStart) == number.charAt(pointerEnd)) {
                pointerStart++;
                pointerEnd--;
            } else {
                isPaleondrome = false;
                break;
            }

        }

        if (isPaleondrome) {
            System.out.println("Числе палеондроп");
        } else {
            System.out.println("Числе не палеондроп");
        }

        System.out.println("\n9. Определение, является ли число счастливым");

        int luckyNumber = 429870;
        String strLuckyNumber = String.valueOf(luckyNumber);
        int sumFirst = 0;
        int sumSecond = 0;
        if (strLuckyNumber.length() == 6) {
            for (int i = 0; i < strLuckyNumber.length() / 2; i++) {
                sumFirst += Integer.parseInt(String.valueOf(strLuckyNumber.charAt(i)));
            }
            for (int i = strLuckyNumber.length() - 1; i >= strLuckyNumber.length() / 2; i--) {
                sumSecond += Integer.parseInt(String.valueOf(strLuckyNumber.charAt(i)));
            }
            if (sumFirst == sumSecond) {
                System.out.println("Число счастливое");
            } else {
                System.out.println("Число не счастливое");
            }
        }
    }
}







