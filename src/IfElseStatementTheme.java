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
            System.out.println("Первая буква имени = True");
        } else if (firstLetterOfTheName == "I".charAt(0)) {
            System.out.println("Первая буква имени = True");
        } else {
            System.out.println("Первая буква имени = False");
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

        System.out.println("3. Проверка числа");

        int firstVariable = 10;
        System.out.println("Исходное число = " + firstVariable);

        if (firstVariable == 0) {
            System.out.println("Число = " + firstVariable);
        } else {
            if (firstVariable % 2 == 0) {
                System.out.println("Num even");
            } else {
                System.out.println("Num odd");
            }
            if (firstVariable > 0) {
                System.out.println("Num positive");
            } else {
                System.out.println("Num negative");
            }
        }

        System.out.println("4. Поиск одинаковых цифр в числах");

        firstNum = 123;
        secondNum = 223;
        System.out.println("Исходное число = " + firstNum);
        System.out.println("Исходное число = " + secondNum);

        if (firstNum % 10 != secondNum % 10) {
            System.out.println("равных единиц(в третьем разряде) нет");
        } else {
            System.out.println("одинаковые цифры в единицах(3 разряде): " + firstNum % 10);
        }
        if ((firstNum / 10) % 10 != (secondNum / 10) % 10) {
            System.out.println("равных десятков(во втором разряде) нет");
        } else {
            System.out.println("одинаковые цифры в десятках(2 разряде): " + (firstNum / 10) % 10);
        }
        if ((firstNum / 100) % 10 != (secondNum / 100) % 10) {
            System.out.println("равных сотен(в первом разряде) нет");
        } else {
            System.out.println("одинаковые цифры в сотнях(1 разряде): " + (firstNum / 100) % 10);
        }


        System.out.println("5. Определение символа по его коду");

        char allCode = '\u0058';

        if ((allCode <= '9') && (allCode >= '1')) {
            System.out.println("Число = " + allCode);
        } else if (allCode > 64 && allCode < 91) {
            System.out.println("Большая буква = " + allCode);
        } else if (allCode > 96 && allCode < 123) {
            System.out.println("Маленькая буква = " + allCode);
        } else {
            System.out.println("Не буква и не число = " + allCode);
        }

        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        //вклад может быть не круглым числом, соответственно, дабы получить более точный результат я выбрал "double"
        double depositAmount = 70_000;
        double amountWithInterest;
        System.out.println("Сумма вклада = " + depositAmount);
        if (depositAmount < 100_000) {
            System.out.println("Начисленный процент = " + depositAmount / 100 * 5 + "\nИтоговая сумма с начисленным " +
                    "процентом = " + (amountWithInterest = depositAmount + depositAmount / 100 * 5));
        } else if (depositAmount < 300_000) {
            System.out.println("Начисленный процент = " + depositAmount / 100 * 7 + "\nИтоговая сумма с начисленным" +
                    " процентом = " + (amountWithInterest = depositAmount + depositAmount / 100 * 7));
        } else {
            System.out.println("Начисленный процент = " + depositAmount / 100 * 10 + "\nИтоговая сумма с начисленным" +
                    " процентом = " + (amountWithInterest = depositAmount + depositAmount / 100 * 10));
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
        int sellsTheProduct = 13000;
        int costPrice = 9000;

        if (sellsTheProduct - (room + costPrice) < 0) {
            System.out.println("Прибыль за год: " + 12 * (sellsTheProduct - costPrice - room));
        } else {
            System.out.println("Прибыль за год: +" + 12 * (sellsTheProduct - costPrice - room));
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
        if (total > 1000) {
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