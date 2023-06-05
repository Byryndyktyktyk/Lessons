import javax.swing.*;

import static java.lang.System.out;

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

        if (maleGender != true) {
            out.println("You're a woman");
        } else {
            out.println("You're a man");
        }

        double height = 1.88;

        if (height > 1.80f) {
            out.println("Tall");
        } else {
            out.println("Medium or Low");
        }

        int firstLetterOfTheName = "Никита".charAt(0);

        if (firstLetterOfTheName == "М".charAt(0)) {
            out.println("True");
        } else if (firstLetterOfTheName == "I".charAt(0)) {
            out.println("True");
        } else {
            out.println("False");
        }

        out.println("2. Поиск max и min числа");

        int firstNum = 742;
        int secondNum = 196;
        int thirdNum = 0;
        int max = 0;
        int min = 0;

        if (firstNum > secondNum) {
            max = firstNum;
            out.println("Максимальное число = " + max);
            min = secondNum;
            out.println("Минимальное число = " + min);

        } else if (firstNum < secondNum) {
            max = secondNum;
            out.println("Максимальное число равно = " + max);
            min = firstNum;
            out.println("Минимальное число равно = " + min);

        } else {
            out.println("Числа равны");
        }

        thirdNum = firstNum;//проверка на то, правильно ли работает программа, если поменять значения переменных
        firstNum = secondNum;
        secondNum = thirdNum;

        if (firstNum > secondNum) {
            max = firstNum;
            System.out.println("Максимальное число равно = " + max);
            min = secondNum;
            System.out.println("Минимальное число равно = " + min);
        } else if (firstNum < secondNum) {
            max = secondNum;
            System.out.println("Максимальное число равно = " + max);
            min = firstNum;
            System.out.println("Минимальное число равно = " + min);
        } else if (firstNum == secondNum) {
            System.out.println("Числа равны");
        }

        System.out.println("2. Проверка числа");

        int variable = 0;
        int variable1;
        variable1 = variable % 2;
        System.out.println("Исходное число = " + variable);
        if (variable == 0) {
            System.out.println("Число = " + variable);
            if (variable != 0) {
                System.out.println();
            } else if (variable1 == 0) {
                System.out.println("Num even");
            } else if (variable1 != 0)
                    System.out.println("Num odd"); }
            if (variable > 0) {
                System.out.println("Num positive");
            } else if (variable < 0) {
                System.out.println("Num negative");
            }

    }
}