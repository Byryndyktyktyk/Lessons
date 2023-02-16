//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
public class IfElseStatementTheme {
    public static void main(String[] args) {

        System.out.println("1. Перевод псевдокода на язык Java");

        int age = 27;
        if (age > 20) {
            System.out.println("You're an adult");
        } else {
            System.out.println("You're not an adult");
        }

        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("You're a woman");
        } else {
            System.out.println("You're a man");
        }

        double height = 1.88;
        if (height > 1.7999999523162842) {
            System.out.println("Tall");
        } else {
            System.out.println("Medium or Low");
        }

        int firstLetterOfTheName = "Семён".charAt(0);
        if (firstLetterOfTheName == "М".charAt(0)) {
            System.out.println("True");
        } else if (firstLetterOfTheName == "I".charAt(0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("2. Поиск max и min числа");

        int firstNum = 196;
        int secondNum = 196;
        if (firstNum > secondNum) {
            System.out.println("Максимальное число = " + firstNum);
            System.out.println("Минимальное число = " + secondNum);
        } else if (firstNum < secondNum) {
            System.out.println("Минимальное число = " + firstNum);
            System.out.println("Максимальное число = " + secondNum);
        } else {
            System.out.println("Числа равны");
        }
        if (secondNum > firstNum) {
            System.out.println("Максимальное число равно = " + secondNum);
            System.out.println("Минимальное число равно = " + firstNum);
        } else if (secondNum < firstNum) {
            System.out.println("Максимальное число равно = " + firstNum);
            System.out.println("Минимальное число равно = " + secondNum);
        } else if (secondNum == firstNum) {
            System.out.println("Числа равны");
        }

        System.out.println("3. Проверка числа");

        int firstVariable = 10;
        int secondVariable = firstVariable % 2;
        System.out.println("Исходное число = " + firstVariable);

        if (firstVariable == 0) {
            System.out.println("Число = " + firstVariable);
        } else {
            if (secondVariable == 0) {
                System.out.println("Num even");
            }
            if (secondVariable != 0) {
                System.out.println("Num odd");
            }
            if (firstVariable > 0) {
                System.out.println("Num positive");
            }
            if (firstVariable < 0) {
                System.out.println("Num negative");
            }
        }

        System.out.println("4. Поиск одинаковых цифр в числах");

        firstNum = 123;
        secondNum = 223;

        int unitsFirstNum;
        int unitsSecondNum;
        int dozensFirstNum;
        int dozensSecondNum;
        int hundredsFirstNum;
        int hundredsSecondNum;
        System.out.println("Исходное число = " + firstNum);
        System.out.println("Исходное число = " + secondNum);

        unitsFirstNum = firstNum % 10;
        unitsSecondNum = secondNum % 10;
        dozensFirstNum = (firstNum / 10) % 10;
        dozensSecondNum = (secondNum / 10) % 10;
        hundredsFirstNum = (firstNum / 100) % 10;
        hundredsSecondNum = (secondNum / 100) % 10;

        if (unitsFirstNum != unitsSecondNum) {
            System.out.println("равных единиц(в третьем разряде) нет");
        }
        if (dozensFirstNum != dozensSecondNum) {
            System.out.println("равных десятков(во втором разряде) нет");
        }
        if (hundredsFirstNum != hundredsSecondNum) {
            System.out.println("равных сотен(в первом разряде) нет");
        }
        if (unitsFirstNum == unitsSecondNum) {
            System.out.println("одинаковые цифры в единицах(3 разряде): " + unitsFirstNum);
        }
        if (dozensFirstNum == dozensSecondNum) {
            System.out.println("одинаковые цифры в десятках(2 разряде): " + dozensFirstNum);
        }
        if (hundredsFirstNum == hundredsSecondNum) {
            System.out.println("одинаковые цифры в сотнях(1 разряд): " + hundredsFirstNum);
        }

        System.out.println("5. Определение символа по его коду");

        char allCode = '\u0057';
        if ((allCode <= '9') && (allCode >= '1')) {
            System.out.println("Число = " + allCode);
        //проверил все буквы англ алфавита
        } else if (allCode == 'w') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'W') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'a') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'A') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'b') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'B') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'c') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'C') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'd') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'D') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'e') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'E') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'f') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'F') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'g') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'G') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'h') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'H') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'i') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'I') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'j') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'J') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'k') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'K') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'l') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'L') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'm') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'M') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'n') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'N') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'o') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'O') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'p') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'P') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'q') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'Q') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'r') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'R') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 's') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'S') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 't') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'T') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'u') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'U') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'v') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'V') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'x') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'X') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'y') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'Y') {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode == 'z') {
            System.out.println("Маленькая буква = " + allCode);
        } else if (allCode == 'Z') {
            System.out.println("Большая буква = " + allCode);
        } else {
            System.out.println("Не буква и не число = " + allCode);
        }

        System.out.println("6. Подсчет суммы вклада и начисленных банком %");

        //вклад может быть не круглым числом, соответственно, дабы получить более точный результат я выбрал "double"
        double depositAmount = 300_000;
        double amountWithInterest;
        System.out.println("Сумма вклада = " + depositAmount);

        if (depositAmount < 100_001) {
            System.out.println("Начисленный процент = " + depositAmount / 100 * 5 + "\nИтоговая сумма с начисленным процентом = " + (amountWithInterest = depositAmount + depositAmount / 100 * 5));
        }
        if (100_000 < depositAmount && 300_001 > depositAmount) {
            System.out.println("Начисленный процент = " + depositAmount / 100 * 7 + "\nИтоговая сумма с начисленным процентом = " + (amountWithInterest = depositAmount + depositAmount / 100 * 7));
        }
        if (300_000 < depositAmount) {
            System.out.println("Начисленный процент = " + depositAmount / 100 * 10 + "\nИтоговая сумма с начисленным процентом = " + (amountWithInterest = depositAmount + depositAmount / 100 * 10));
        }
        System.out.println("7. Определение оценки по предметам");

        double history = 59;
        double programming = 91;
        double averageScore = 0;
        double averagePercentage = (history + programming) / 2;
        if (history <= 60) {
            System.out.println("Оценка = " + 2 + "; Предмет: история");
            averageScore += 2;
        }
        if (history > 60 && history < 74) {
            System.out.println("Оценка = " + 3 + "; Предмет: история");
            averageScore += 3;
        }
        if (history > 73 && history < 92) {
            System.out.println("Оценка = " + 4 + "; Предмет: история");
            averageScore += 4;
        }
        if (history > 91) {
            System.out.println("Оценка = " + 5 + "; Предмет: история");
            averageScore += 5;
        }
        if (programming <= 60) {
            System.out.println("Оценка = " + 2 + "; Предмет: программирование");
            averageScore += 2;
        }
        if (programming > 60 && programming < 74) {
            System.out.println("Оценка = " + 3 + "; Предмет: программирование");
            averageScore += 3;
        }
        if (programming > 73 && programming < 92) {
            System.out.println("Оценка = " + 4 + "; Предмет: программирование");
            averageScore += 4;
        }
        if (programming > 91) {
            System.out.println("Оценка = " + 5 + "; Предмет: программирование");
            averageScore += 5;
        }
        System.out.println("Средний балл по предметам = " + averageScore / 2);
        System.out.println("Средний процент по предметам = " + averagePercentage);

        System.out.println("8. Расчет прибыли за год");

        int room = 5000;
        int sellsTheProduct = 4000;
        int costPrice = 9000;
        int annualProfit = 12 * (sellsTheProduct - costPrice - room);
        if (sellsTheProduct - (room + costPrice) < 0) {
            System.out.println("Прибыль за год: " + annualProfit);
        } else {
            System.out.println("Прибыль за год: +" + annualProfit);
        }

        System.out.println("9. Подсчет количества банкнот");

        int total = 567;
        int nominalValue100 = 10;
        int nominalValue10 = 5;
        int nominalValue1 = 50;
        int hundreds;
        int dozens;
        int units;

        units = total % 10;
        dozens = total / 10 % 10;
        hundreds = total / 100 % 10;

        int requiredBanknotesInFaceValue100 = (nominalValue100 - hundreds) + 2 * hundreds - nominalValue100;
        int requiredBanknotesInFaceValue10 = (nominalValue10 - dozens) + 2 * dozens - nominalValue10;
        int requiredBanknotesInFaceValue1 = nominalValue1 - (100 - dozens * 10) + units;
        if (requiredBanknotesInFaceValue100 < 0) {
            System.out.println("Извините, банкнот не хватает!");
        } else {
            if (requiredBanknotesInFaceValue100 > 0) {
                System.out.println("Банкноты номиналом 100: " + requiredBanknotesInFaceValue100);
            }
            if (dozens > 5) {
                System.out.println("Банкноты номиналом 10: " + nominalValue10);
            }
            if (dozens < 5) {
                System.out.println("Банкноты номиналом 10: " + requiredBanknotesInFaceValue10);
            }
            if (dozens > 5) {
                System.out.println("Банкноты номиналом 1: " + requiredBanknotesInFaceValue1);
            }
            if (dozens < 5) {
                System.out.println("Банкноты номиналом 1: " + units);
            }
            System.out.println("Выдаваемая сумма = " + total);
        }
    }
}