package com.company.main;

import java.util.Objects;
import java.util.Scanner;


class Calcul {

    public static
    String calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "+":
                return (String.valueOf((num1 + num2)));
            case "-":
                return (String.valueOf((num1 - num2)));
            case "*":
                return (String.valueOf((num1 * num2)));
            case "/":
                if (num2 == 0) {
                    return "Error";
                } else {
                    return (String.valueOf((num1 / num2)));
                }

            default:
                return "Error";
        }

    }


    public static String getFirstNumber(String input) {
        Scanner inputscanner = new Scanner(input);
        if (inputscanner.hasNextDouble()) {
            return String.valueOf(inputscanner.nextDouble());
        } else {
            return "Error";
        }
    }

    public static String getSecondNumber(String input) {
        Scanner inputscanner = new Scanner(input);
        for (int i = 1; i <= 2; i++) {
        }

        if (inputscanner.hasNextDouble()) return String.valueOf(inputscanner.nextDouble());
        else {
            return "Error";
        }
    }


    public static String getZnak(String input) {
        Scanner inputscanner = new Scanner(input);
        for (int i = 1; i <= 1; i++);

        if (inputscanner.hasNext("[+, \\-*/]")) return String.valueOf(inputscanner.next("[+, \\-*/]"));
        else {
            return "Error";
        }
    }

    public static boolean checkExpression(String input) {
        // StringBuffer firstargument, secondargument, znak;
        Scanner scanner = new Scanner(input);
        return scanner.hasNextDouble();
    }

    public static String calculateExpression(String expression) {

        if (!Objects.equals(Calcul.getFirstNumber(expression), "Error")) {
            if (!Calcul.getSecondNumber(expression).equals("Error")) {

                return Calcul.calculate(Double.parseDouble(Calcul.getFirstNumber(expression)), Double.parseDouble(Calcul.getSecondNumber(expression)), Calcul.getZnak(expression));
            } else {
                return "Error";
            }
        } else {
            return "Error";
        }

    }

    public static String convertRomanExpression() {

        return "";


    }


}