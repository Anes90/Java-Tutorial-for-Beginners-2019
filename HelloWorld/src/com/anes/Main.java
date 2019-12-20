//Java Tutorial for Beginners [2019] - https://www.youtube.com/watch?v=eIrMbAQSU34

package com.anes;

import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int age = 30;
//        int temperature = 20;
//        age = 35;
//        System.out.println(age);

//        int myAge = 30;
//        int herAge = myAge;
//        System.out.println(herAge);

//        byte age = 30;
//        int viewsCount = 123_456_789;
//        int viewsCount = 3_123_456_789;
//        long viewsCount = 3_123_456_789;
//        long viewsCount = 3_123_456_789L;
//        double price = 10.99;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = true; //or false

//        byte age = 30;
//        Date now = new Date();
//        System.out.println(now);

//        byte x = 1;
//        byte y = x;
//        x = 2;
//        System.out.println(y);

//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 2;
//        System.out.println(point2);

//        String message = "Hello World";
//        System.out.println(message);

//        String message = "   Hello World" + "!!   ";
//        System.out.println(message);
//        System.out.println(message.endsWith("!!"));
//        System.out.println(message.startsWith("!!"));
//        System.out.println(message.length());
//        System.out.println(message.indexOf("H"));
//        System.out.println(message.indexOf("e"));
//        System.out.println(message.indexOf("sky"));
//        System.out.println(message.replace("!", "*"));
//        System.out.println(message);
//        System.out.println(message.toLowerCase());
//        System.out.println(message.toUpperCase());
//        System.out.println(message.trim());

//        String message = "Hello \"Anes\"";
//        String message = "Hello \\Anes\\";
//        String message = "Hello \nAnes\\";
//        String message = "Hello \tAnes\\";
//        System.out.println(message);

//        int[] numbers = new int [5];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[10] = 3;
//        int[] numbers = { 2, 3, 5, 1, 4};
//        System.out.println(numbers.length);
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//        int[][] numbers = new int [2][3];
//        int[][][] numbers = new int [2][3][5];
//        numbers[0][0] = 1;
//        numbers[0][0][0] = 1;
//        int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 } };
//        System.out.println(Arrays.deepToString(numbers));

//        final float PI = 3.14F; // contant
//        PI = 1;

//        double result = (double)10 / (double) 3;
//        System.out.println(result);

//        int x = 1;
//        int y = x++;
//        int y = ++x;
//        x += 2;
//        System.out.println(x);
//        System.out.println(y);

//        int x = 10 + 3 * 2;
//        int x = (10 + 3) * 2;
//        System.out.println(x);

        //Implicit casting
//        short x = 1;
//        int y = x + 2;
//        System.out.println(y);
//        double x = 1.1;
//        double y = x + 2;
//        System.out.println(y);

//        double x = 1.1;
//        int y = (int)x + 2; //Explicit casting
//        System.out.println(y);

//        String x = "1";
//        int y = Integer.parseInt(x) + 2;
//        System.out.println(y);

//        int result = Math.round(1.1F);
//        int result = (int)Math.ceil(1.1F);
//        int result = (int)Math.floor(1.1F);
//        int result = Math.max(1, 2);
//        int result = Math.min(1, 2);
//        double result = Math.random() * 100;
//        int result0 = (int)Math.round(Math.random() * 5 + 1);
//        int result1 = (int)Math.round(Math.random() * 5 + 1);
//        int result2 = (int)Math.round(Math.random() * 5 + 1);
//        int result3 = (int)Math.round(Math.random() * 5 + 1);
//        int result4 = (int)Math.round(Math.random() * 5 + 1);
//        System.out.println(result0);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);

//        int result = (int)(Math.random() * 100);
//        System.out.println(result);

//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(1234567.891);
//        System.out.println(result);
//        String result = NumberFormat.getPercentInstance().format(0.1);
//        System.out.println(result);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        System.out.print("Name: ");
//        byte age = scanner.nextByte();
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);

//        int x = 1;
////        int y = 1;
//        int y = 2;
//        System.out.println(x == y);
//        System.out.println(x != y);
//        System.out.println(x > y);
//        System.out.println(x >= y);
//        System.out.println(x < y);
//        System.out.println(x <= y);

//        int temperature = 22;
//        int temperature = 12;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);

////        boolean hasHighIncome = true;
//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);

//        int temperature = 32;
//        if (temperature > 30) {
//            System.out.println("It's a hot day");
//            System.out.println("Stay hidrated");
//        }
//        else if (temperature > 20)
//            System.out.println("Beautiful day");
//        else
//            System.out.println("It's cold outside");

//        int income = 120_000;
////        boolean hasHighIncome = false;
//        boolean hasHighIncome = (income > 100_000);
////        if (income > 100_000)
////            hasHighIncome = true;

//        int income = 120_000;
//        String className = (income > 100_00) ? "First" : "Economy";

//        String role = "admin";
//
//        switch (role){
//            case "admin" :
//                System.out.println("You're an admin");
//                break;
//            case "moderator" :
//                System.out.println("You're a moderator");
//                break;
//            default:
//                System.out.println("You're a guest");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
////        if (number % 5 == 0 && number % 3 == 0)
////            System.out.println("FizzBuzz");
////        else if (number % 5 == 0)
////            System.out.println("Fizz");
////        else if (number % 3 == 0)
////            System.out.println("Buzz");
////        else
////            System.out.println(number);
//
//        if (number % 5 == 0){
//            if (number % 3 == 0)
//                System.out.println("FizzBuzz");
//            else
//                System.out.println("Fizz");
//        }
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(number);

//        for (int i = 0; i < 5; i++)
//            System.out.println("Hello World " + i);

//        int i = 0;
//        while (i > 0) {
//            System.out.println("Hello World " + i);
//            i--;
//        }

        Scanner scanner = new Scanner(System.in);
        String input = "";
//        while (!input.equals("quit")){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
////            if (!input.equals("quit"))
////                System.out.println(input);
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

//        while (true){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
////            if (!input.equals("quit"))
////                System.out.println(input);
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

//        do{
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }while(!input.equals("quit"));

        String[] fruits = { "Apple", "Mango", "Orange"};

//        for (int i = 0; i < fruits.length; i++)
//            System.out.println(fruits[i]);
//        for (int i = (fruits.length - 1); i >= 0; i--)
//            System.out.println(fruits[i]);
//
//        for (String fruit : fruits){
//            System.out.println(fruit);
//        }
    }
}
